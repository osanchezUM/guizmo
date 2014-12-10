package guizmo.swingGenerator;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;

import guizmo.layout.*;
import guizmo.structure.*;
import guizmo.structure.utilM.StructureHelper;

public class SwingTemplate {
	
	private static StringBuffer buffer;
	private static final String TAB = "   ";
	private static int tabCount = 0;
	private static String CONSTRAINT_PREFIX = "c_";
	private static String NORTH_SUFFIX = "North";
	private static String SOUTH_SUFFIX = "South";
	private static String AUX_SUFFIX = "_aux";
	private static String EXTRA_SUFFIX = "_extra";
	private static String BUTTON_GROUP_SUFFIX = "_bgroup";
	private static String TABLE_HEADER_PREFIX = "headers_";
	private static String TABLE_DATA_PREFIX = "data_";
	private static int DEFAULT_WIDGET_SEPARATION = 10;
	private static int ADDITIONAL_BUTTON_WIDTH = 10;
	private static int MIN_BUTTON_HEIGHT = 25;
	private static int uniqueId = 1;
	private static HashMap<String, Boolean> uniqueNames = new HashMap<String, Boolean>();
	
	////////////////////////////////////////
	
	public static void generate(StructureRoot strucRoot, LayoutRoot layoutRoot, String outputDir) 
			throws FileNotFoundException{
		File dir = new File(outputDir);
		if (!dir.exists()){
			throw new FileNotFoundException("The path does not exist: "+outputDir);
		}
		for (LayoutInfoTreeNode node: layoutRoot.getViewTrees()){
			initBuffer();
			String classname = firstToUpper(node.getGuiElement().getId());
			genClass(node, classname);
			String path = outputDir + "/" + classname + ".java";
			bufferToFile(path);
		}
	}
	
	private static void genLayout(Layout layout, String container, Rectangle regionArea){
		Layout parentLayout = layout.getParentLayout();
		String containerName = container;
		String prevContainerName = container;
		
		if (layout == null){
			throw new RuntimeException("Element without layouts: "+containerName);
		}
		// DEBUG
		if (layout.getName().equals("formatos_10_Precio_6_Precio_en_euros_7_Oferta_11_lyt")){
			System.out.print("");
		}
		
		// Flow layout not contained in a FormLayout
		if (layout instanceof FlowLayout && (parentLayout == null || !(parentLayout instanceof FormLayout))){
//			line += "new BoxLayout("+containerName+", BoxLayout.";
//			if (((FlowLayout)layout).getType() == FlowLayoutType.VERTICAL)
//				line += "Y_AXIS)";
//			else
//				line += "X_AXIS)";
			out(containerName+".setLayout(new GridBagLayout());");
		
		// Flow layout contained in a FormLayout
		}else if (layout instanceof FlowLayout && parentLayout != null && parentLayout instanceof FormLayout){
			// nothing
			
		// Create an additional panel to set the margins of BorderLayout, FormLayout, GridLayout
		}else if (layout instanceof BorderLayout || layout instanceof FormLayout || layout instanceof GridLayout){
			String pname = containerName + AUX_SUFFIX;
			String cname = genContraintName(pname);
			out(containerName+".setLayout(new GridBagLayout());");
			out("GridBagConstraints " + cname + " = new GridBagConstraints();");
			out(cname + ".gridx = 0;");
			out(cname + ".gridy = 0;");
			out(cname + ".weightx = 1; // %1");
			out(cname + ".weighty = 1;");
			out(cname + ".fill = GridBagConstraints.BOTH; // %7");
			int bInsets[] = getChildrenMargins(layout.getSublayouts(), regionArea);
			out(cname+".insets = new Insets("+bInsets[0]+", "+bInsets[1]+", "+bInsets[2]+", "+bInsets[3]+");");
			out("JPanel "+pname+" = new JPanel();");
			// FormLayout
			if (layout instanceof FormLayout){
				out(pname+".setLayout(new GridBagLayout());");
				out(containerName+".add("+pname+", "+cname+"); // #1");
				containerName = pname;
			// BorderLayout
			}else if (layout instanceof BorderLayout){
				int w = 0, h = 0;
				for (Gap gap: layout.getGaps()){
					if (gap.getType() == GapType.HORIZONTAL){
						w = Math.max(w, Math.round(gap.getValue() * regionArea.width));
					}else{
						h = Math.max(h, Math.round(gap.getValue() * regionArea.height));
					}
				}
				out(pname+".setLayout(new BorderLayout("+w+","+h+"));");
				out(containerName+".add("+pname+", "+cname+"); // #2");
			// GridLayout
			}else if (layout instanceof GridLayout){
				GridLayout glayout = (GridLayout)layout;
				out(pname+".setLayout(new GridLayout(0,"+glayout.getNumCols() +
						","+DEFAULT_WIDGET_SEPARATION+","+DEFAULT_WIDGET_SEPARATION+"));");
				out(containerName+".add("+pname+", "+cname+"); // #3");
				containerName = pname;
			}
			
		// Another new layout
		}else{
			out(containerName+".setLayout(null);");
		}
		
		// Create panels for the border layout
		if (layout instanceof BorderLayout){
			if (hasSeveralTopElements(layout)){
				String pname = containerName+NORTH_SUFFIX;
				out("JPanel "+pname+" = new JPanel();");
				out(pname+".setLayout(new BorderLayout());");
				out(containerName+".add("+pname+", BorderLayout.NORTH);");
			}
			if (hasSeveralBottomElements(layout)){
				String pname = containerName+SOUTH_SUFFIX;
				out("JPanel "+pname+" = new JPanel();");
				out(pname+".setLayout(new BorderLayout());");
				out(containerName+".add("+pname+", BorderLayout.SOUTH);");
			}
		}
		
		//
		// Sublayouts
		//
		for (Layout sub: layout.getSublayouts()){
			int pos = layout.getSublayouts().indexOf(sub);
			String cname = genContraintName(sub.getName());
			Float weightx = new Float(-1);
			Float weighty = new Float(-1);
			
			// DEBUG
			if (sub.getName().equals("Proceed_with_the_ord_22_Cancel_23_lyt")){
				System.out.print("");
			}
			
			// FlowLayout
			if (layout instanceof FlowLayout){
				// ElementNode child of a Flowlayout child of a FormLayout
				if (parentLayout != null && parentLayout instanceof FormLayout && sub instanceof ElementNode){
					String lname = normalizeName(sub.getName());
					FormLayout flayout = (FormLayout)parentLayout;
					ElementNode enode = (ElementNode)sub;
					int xCellData[] = getXCell(flayout, enode);
					int xcell = xCellData[0];
					int xwidth = xCellData[1];
					int ycell = getYCell(flayout, enode);
					List<ElementNode> cellElements = getCellElements(flayout, xcell, ycell);
					if (cellElements.size() == 0){
						throw new RuntimeException("No widgets in the cell. Improve the implementation if this is not a mistake");
					}
					// Only one widget in the cell
					else if (cellElements.size() == 1){
						out("GridBagConstraints " + cname + " = new GridBagConstraints();");
						out(cname + ".gridx = "+xcell+";");
						out(cname + ".gridy = "+ycell+";");
						containerName = prevContainerName;
					}
					// Several widgets in the cell, put the widget inside a panel
					else if (cellElements.size() > 1){
						// Get the name of the new or already created panel
						String pname = container + "_" + xcell + "_" + ycell;
						// Get the name of the constraint of the panel
						String pcname = genContraintName(pname);
						// If this is the first element of the list, create a panel
						if (sub == cellElements.get(0)){
							out("JPanel "+pname+" = new JPanel();");
							out(pname+".setLayout(new GridBagLayout());");
							out("GridBagConstraints " + pcname + " = new GridBagConstraints();");
							out(pcname + ".gridx = "+xcell+";");
							out(pcname + ".gridy = "+ycell+";");
							out(pcname + ".weightx = 1; // %2");
							out(pcname + ".weighty = 1;");
							out(pcname + ".fill = GridBagConstraints.BOTH;");
							String alignmentConstraint = getAlignmentConstraint(cellElements, flayout);
							out(pcname+".anchor = GridBagConstraints."+alignmentConstraint+";");
							out(containerName+".add("+pname+","+pcname+"); //#4");
							out();
						}
						// Then, add the widget to the already created panel (just now or before)
						containerName = pname;
						out("GridBagConstraints " + cname + " = new GridBagConstraints();");
						out(cname + ".gridx = "+cellElements.indexOf(sub)+";");
						out(cname + ".gridy = 0;");
					}
					
				// ElementNode/Layout child of a vertical FlowLayout
				}else if ((((FlowLayout)layout).getType() == FlowLayoutType.VERTICAL)){
					out("GridBagConstraints " + cname + " = new GridBagConstraints();");
					out(cname + ".gridx = 0;");
					out(cname + ".gridy = "+pos+";");
				// ElementNode/Layout child of a horizontal FlowLayout
				}else{
					out("GridBagConstraints " + cname + " = new GridBagConstraints();");
					out(cname + ".gridy = 0;");
					out(cname + ".gridx = "+pos+";");
				}
				
				// Resizing
				if (sub instanceof ElementNode && sub.getRefNode().getGuiElement() instanceof SingleWidget){
					LayoutInfoTreeNode tnode = ((ElementNode)sub).getRefNode();
//					HAlignmentType hAlign = sub.getAbsHAlignment();
//					HAlignmentType parentHAlign = parentLayout.getAbsHAlignment();
//					if 	(	(hAlign == HAlignmentType.NONE || hAlign == HAlignmentType.BOTH) &&
//							(parentHAlign == HAlignmentType.NONE || parentHAlign == HAlignmentType.BOTH)){
					
//					// Weight of each column in a FormLayout
//					if (parentLayout instanceof FormLayout){
//						FormLayout formLayout = (FormLayout)parentLayout;
//						List<AlignedColumn> cols = formLayout.getColumns();
//						float minv = cols.get(0).getLgap();
//						float maxv = cols.get(cols.size()-1).getRgap();
//						float twidth = maxv - minv;
//						
//						weightx = 999f;
//					}
//					// In other case
//					else{

						if (	tnode.getGuiElement() instanceof TextBox ||
								tnode.getGuiElement() instanceof ComboBox){
							out(cname + ".fill = GridBagConstraints.HORIZONTAL;");
							if (weightx == -1)
								weightx = sub.getHSize();
						}else if (	tnode.getGuiElement() instanceof TextArea ||
									tnode.getGuiElement() instanceof Table){
							out(cname + ".fill = GridBagConstraints.BOTH;");
							if (weightx == -1)
								weightx = sub.getHSize();
							if (weighty == -1)
								weighty = sub.getVSize();
						}else{
							//if (weightx == -1)
							weightx = getElementWeightx((ElementNode)sub);
						}
						//					}
//					}
				}else{
					HAlignmentType halign = sub.getAbsHAlignment();
					if (halign == HAlignmentType.NONE ||  halign == HAlignmentType.BOTH){
						out(cname + ".fill = GridBagConstraints.HORIZONTAL; // %6");
						if (weightx == -1)
							weightx = 1f;
					}
				}
				
				//
				// Alignment
				//
				// ElementNode child of a Flowlayout child of a FormLayout
				if (parentLayout != null && parentLayout instanceof FormLayout && sub instanceof ElementNode){
					FormLayout formLayout = (FormLayout)parentLayout;
					ElementNode enode = (ElementNode)sub;
					String alignmentConstraint = getAlignmentConstraint(enode, formLayout);
					out(cname+".anchor = GridBagConstraints."+alignmentConstraint+";");
				// FlowLayout
				}else{
					
//					if (sub.getName().equals("GENERAR_lyt")){
//						System.out.println("");
//					}
					
					String absAlignConstr = null; //getAbsAlignmentConstraint(layout);
					String elemAlignConstr = null; //getElementAlignmentConstraint(sub);
					String parentAlignConstr = getParentAlignmentConstraint(sub);
					if (elemAlignConstr != null){
						out(cname+".anchor = GridBagConstraints."+elemAlignConstr+";");
						if (weightx == -1)
							weightx = 1f;
					}else if (absAlignConstr != null){
						out(cname+".anchor = GridBagConstraints."+absAlignConstr+";");
						if (weightx == -1)
							weightx = 1f;
					}else if (parentAlignConstr != null){
						out(cname+".anchor = GridBagConstraints."+parentAlignConstr+";");
						if (weightx == -1)
							weightx = 1f;
						
					}else{
						out(cname+".anchor = GridBagConstraints.LINE_START;");
						if (weightx == -1)
							weightx = 1f;
					}
					

				}
				
				// Margins
				int margins[] = new int[4];
				if (!sub.getMargins().isEmpty()){
				//if (!layout.getMargins().isEmpty()){
					//margins = getMargins(sub, cname, layout, regionArea);
					//margins = getMargins(layout.getMargins(), regionArea);
					margins = getMargins(sub.getMargins(), regionArea);
				}
				
				//
				// Gaps
				//
				int insets[] = new int[4];
				// Element in a FormLayout
				if (parentLayout != null && parentLayout instanceof FormLayout && sub instanceof ElementNode){
					GraphicalElement elem = ((ElementNode)sub).getRefNode().getGuiElement();
					// Set the gap with the line below the given one
					int vgap = 0;
					for (Gap g: parentLayout.getGaps()){
						if (g.getLayouts().get(0) == layout){
							vgap = Math.round(g.getValue() * regionArea.height);
							insets[2] = vgap;
							break;
						}
					}
					
					// Set the gap with the next widget (on the right)
					if (elem instanceof OutputText){
						insets[3] = DEFAULT_WIDGET_SEPARATION;
					}else{
						// This code should be only executed if there is a widget on the right cell
						if (setRightMargin((FormLayout)parentLayout, (ElementNode)sub)){
							int hgap = 0;
							for (Gap g: layout.getGaps()){
								if (g.getLayouts().get(0) == sub){
									hgap = Math.round(g.getValue() * regionArea.width);
									insets[3] = hgap;
									break;
								}
							} // end_for
						}else{
							insets[3] = 0;
						}
					}
				// Other case
				}else{
					int gaps[] = new int[4];
					if (!layout.getGaps().isEmpty() && pos < layout.getSublayouts().size() - 1){
						// DEBUG
						if (cname.equals("c_Fichero_a_generar_lyt")){
							System.out.println("");
						}
						gaps = getGaps(sub, cname, layout, regionArea);
					}
					insets = mergeArrays(margins, gaps);
				}
				if (insets[0] > 0 || insets[1] > 0 || insets[2] > 0 || insets[3] > 0){
					out(cname + ".insets = new Insets("+insets[0]+", "+insets[1]+", "+insets[2]+", "+insets[3]+"); // %5");
				}
					
				// Weightx, weighty
				if (weightx >= 0)
					out(cname + ".weightx = "+weightx.floatValue()+";  // %3");
				else out(cname + ".weightx = 1;  // %4");
				if (weighty >= 0)
					out(cname + ".weighty = "+weighty.floatValue()+";");
				//else out(cname + ".weighty = 1;");
				
				// Span across columns
				if (parentLayout != null && 
						parentLayout instanceof FormLayout //&&
						//parentLayout.getParentLayout() != null && 
						//parentLayout.getParentLayout() instanceof FormLayout
						){
					int span = getColumnSpan(((FormLayout)parentLayout), (ElementNode)sub);
					out(cname + ".gridwidth = " + span + ";");
				}
			}
			
			// GUIRegion child
			if (sub instanceof ElementNode && ((ElementNode)sub).getRefNode().getGuiElement() instanceof GUIRegion){
				String lname = normalizeName(sub.getName());
				LayoutInfoTreeNode node = sub.getRefNode();
				GUIRegion reg = (GUIRegion)node.getGuiElement();
				out("JPanel "+lname+" = new JPanel();");
				// Show border & text
				if (reg.getTitle() != null){
					out(lname+".setBorder(BorderFactory.createTitledBorder(\""+reg.getTitle()+"\"));");
				}else if (reg.isBorder()){
					out(lname+".setBorder(BorderFactory.createEtchedBorder());");
				}
				if (layout instanceof BorderLayout){
					String contname = containerName + AUX_SUFFIX;
					setBorderComponent(contname, lname, (BorderLayout)layout, sub);
				}else{
					out(containerName+".add("+lname+", "+cname+"); //#5");
				}
				genContent(node, lname);
			
			// Widget child
			}else if (sub instanceof ElementNode && !(((ElementNode)sub).getRefNode().getGuiElement() instanceof GUIRegion)){
				GraphicalElement elem = ((ElementNode)sub).getRefNode().getGuiElement();
				String wname = normalizeName(elem.getName());
				if (layout instanceof FlowLayout){
					if (elem instanceof Table){
						out(containerName+".add(new JScrollPane("+wname+"), "+cname+");");
					}else{
						out(containerName+".add("+wname+", "+cname+");");
					}
				}else if (layout instanceof BorderLayout){
					//String area = getBorderArea(sub);
					//out(containerName+".add("+wname+", BorderLayout."+area+");");
					//if (layout instanceof BorderLayout){
						String contname = containerName + AUX_SUFFIX;
						setBorderComponent(contname, wname, (BorderLayout)layout, sub);
					//}
					//else
					//	setBorderComponent(containerName, wname, layout, sub);
				}else{
					if (elem instanceof Table){
						out(containerName+".add(new JScrollPane("+wname+"));");
					}else{
						out(containerName+".add("+wname+");");
					}
				}
				//genAlignment(sub, wname);
				
			// FlowLayout child of FormLayout
			}else if (layout instanceof FormLayout){
				genLayout(sub, containerName, regionArea);
				
			// ?? Intermediate layout
			}else{
				String lname = normalizeName(sub.getName());
				out("JPanel "+lname+" = new JPanel();");
				if (layout instanceof FlowLayout || layout instanceof FormLayout){
					out(containerName+".add("+lname+", "+cname+"); // #7");
				}else if (layout instanceof BorderLayout){
					//String area = getBorderArea(sub);
					//out(containerName+".add("+lname+", BorderLayout."+area+");");
					//if (layout instanceof BorderLayout){
						String contname = containerName + AUX_SUFFIX;
						setBorderComponent(contname, lname, (BorderLayout)layout, sub);
					//}else
					//	setBorderComponent(containerName, lname, layout, sub);
				}else{
					out(containerName+".add("+lname+");");
				}
				//genAlignment(sub, lname);
				genLayout(sub, lname, regionArea);
			}
		} // end_for
		out();
	}
	
	private static void genWidget(LayoutInfoTreeNode tnode, String containerName, Rectangle containerArea){
		GraphicalElement widget = tnode.getGuiElement();
		ElementNode enode = (ElementNode)tnode.getReferredBy().get(0);
		String wname = normalizeName(widget.getName());
		int w = Math.round(enode.getHSize() * containerArea.width);
		int h = Math.round(enode.getVSize() * containerArea.height);
		if (widget instanceof Button){
			Button but = (Button)widget;
			String txt = wname;
			if (but.getGraphic() instanceof Text){
				txt = but.getGraphic().getValue();
			}
			out("JButton "+wname+" = new JButton();");
			out(wname+".setText(\""+txt+"\");");	
		}else if (widget instanceof OutputText){
			String txt = ((OutputText)widget).getText().getValue();
			out("JLabel "+wname+" = new JLabel();");
			out(wname+".setText(\""+txt+"\");");
		}else if (widget instanceof TextBox){
			out("JTextField "+wname+" = new JTextField();");
			String txt = ((TextBox) widget).getText().getValue();
			//txt = txt.replace("\r\n", "\\n");
			out(wname+".setText(\""+txt+"\");");
		}else if (widget instanceof TextArea){
			out("JTextArea "+wname+" = new JTextArea();");
			String txt = ((TextArea) widget).getText().getValue();
			//txt = txt.replace("\r\n", "\\n");
			out(wname+".setText(\""+txt+"\");");
		}else if (widget instanceof ComboBox){
			out("JComboBox "+wname+" = new JComboBox();");
			ComboBox cbox = (ComboBox) widget;
			String txt = "";
			if (!cbox.getItems().isEmpty()){
				if (cbox.getItems().get(0).getResource() instanceof Text && cbox.getItems().get(0).getResource().getValue() != null)
					txt = cbox.getItems().get(0).getName();
			}
			out(wname+".addItem(\""+txt+"\");");
		}else if (widget instanceof CheckBox){
			CheckBox cbox = (CheckBox)widget;
			String txt = wname;
			if (cbox.getResource() instanceof Text && cbox.getResource().getValue() != null){
				txt = cbox.getResource().getValue();
			}
			out("JCheckBox "+wname+" = new JCheckBox();");
			out(wname+".setText(\""+txt+"\");");
			if (cbox.isSelected())
				out(wname+".setSelected(true);");
		}else if (widget instanceof ImageContainer){
			ImageContainer img = (ImageContainer)widget;
			if (img.getImage() == null || img.getImage().getValue() == null || 
					img.getImage().getValue().trim().equals("")){
				//, JLabel.CENTER
				out("JButton "+wname+" = new JButton(\""+wname+"\");");
				out(wname+".setEnabled(false);");
			}else
				out("JLabel "+wname+" = new JLabel(new ImageIcon(\""+img.getImage().getValue()+"\"));");
			
		}else if (widget instanceof Table){
			Table table = (Table)widget;
			String str = "";
			String str2 = "";
			int tsize = table.getHeaders().size();
			for(int i=0; i<tsize; ++i){
				GraphicalResource res = table.getHeaders().get(i);
				if (res instanceof Text){
					str += "\"" + res.getValue() + "\"";
				}else{
					str += "\"\"";
				}
				
				if (i < tsize-1){
					str += ", ";
				}
			}
			int n = table.getRows().size();
			for (int i = 0; i < n; ++i){
				TableRow row = table.getRows().get(i);
				int rowSize = row.getValues().size();
				str2 += "{";
				for (int j=0; j < tsize; ++j){
					if (j >= rowSize){
						str2 += "\" \"";
					}else{
						str2 += "\"" + row.getValues().get(j).getValue() + "\"";
					}
					if (j < tsize-1){
						str2 += ", ";
					}
				}
				str2 += "}";
				if (i < n-1){
					str2 += ", ";
				}
			}
			out("String " + TABLE_HEADER_PREFIX + wname + "[] = {" + str + "};");
			out("String " + TABLE_DATA_PREFIX + wname + "[][] = {" + str2 + "};");
			out("JTable "+wname+" = new JTable(" + 
					TABLE_DATA_PREFIX + wname + ", " +
					TABLE_HEADER_PREFIX + wname + 
			");");
			out(wname+".setPreferredScrollableViewportSize("+wname+".getPreferredSize());");
			
			
		}else if (widget instanceof RadioGroup){
			RadioGroup rgroup = (RadioGroup)widget;
			String bname = wname+BUTTON_GROUP_SUFFIX;
			out("JPanel "+wname+" = new JPanel(new GridLayout(0,1));");
			out("ButtonGroup "+bname+" = new ButtonGroup();");
			for (Item item: rgroup.getItems()){
				String rname = item.getId();
				out("JRadioButton "+rname+" = new JRadioButton(\""+item.getResource().getValue()+"\");");
				out(wname+".add("+rname+");");
				out(bname+".add("+rname+");");
				if (rgroup.getSelected().contains(item))
					out(rname+".setSelected(true);");
			}
		}else{
			throw new RuntimeException("Widget not considered yet: "+widget.getClass().getSimpleName());
		}
		Layout parent = enode.getParentLayout();
		Layout grandparent = null;
		if (parent!= null)
			grandparent = parent.getParentLayout();
		if (parent != null && parent instanceof FlowLayout && 
				(grandparent == null || !(grandparent instanceof FormLayout))){
			if (	widget instanceof TextBox || 
					widget instanceof ComboBox
				){
				out(wname+".setPreferredSize(new Dimension("+w+","+wname+".getPreferredSize().height));");
			}else if (widget instanceof TextArea){
				out(wname+".setPreferredSize(new Dimension("+w+","+h+"));");
			}else if (widget instanceof Button){
				// The height cannot be less than the default value, otherwise it will not be properly seen
				if (h < MIN_BUTTON_HEIGHT)
					h = MIN_BUTTON_HEIGHT;
				//out(wname+".setPreferredSize(new Dimension("+(w+ADDITIONAL_BUTTON_WIDTH)+","+h+"));");
				out(wname+".setPreferredSize(new Dimension(" +
				"Math.max(" + wname + ".getPreferredSize().width, " + w + ")," + h + "));");
			}else if (!(widget instanceof OutputText) && !(widget instanceof RadioGroup)
					&& !(widget instanceof Table)){
				out(wname+".setPreferredSize(new Dimension("+w+","+h+"));");
			}
		}
	}
	
	
	
	////////////////////////////////////////
	
	
	
	private static void genContent(LayoutInfoTreeNode node, String containerName){
		String tname = node.getName();
		Container c = (Container)node.getGuiElement();
		Rectangle regionArea = StructureHelper.toRectangle(c);
		out();
		out("// "+tname);
		out();
		for (LayoutInfoTreeNode n: node.getChildrenNodes()){
			if (!(n.getGuiElement() instanceof GUIRegion)){
				genWidget(n, containerName, regionArea);
			}
		}
		out();
		Layout candidate = getBestLayout(node);
		genLayout(candidate, containerName, regionArea);
		out();
	}
	
	private static void genClass(LayoutInfoTreeNode node, String classname){
		Layout layout = getBestLayout(node);
		if (layout == null){
			System.err.println("View node with no layout. Generation skipped.");
			return;
		}
		String vname = node.getGuiElement().getName();
			
		String lname = normalizeName(layout.getName());
		out("import java.awt.BorderLayout;");
		out("import java.awt.GridLayout;");
		out("import java.awt.FlowLayout;");
		out("import java.awt.GridBagLayout;");
		out("import java.awt.GridBagConstraints;");
		out("import java.awt.Insets;");
		out("import java.awt.Dimension;");
		out("import java.awt.Container;");
		out("import java.awt.Component;");
		out("import java.awt.event.ActionEvent;");
		out("import java.awt.event.ActionListener;");
		out("import java.io.IOException;");
		out("import javax.swing.ButtonGroup;");
		out("import javax.swing.JButton;");
		out("import javax.swing.JRadioButton;");
		out("import javax.swing.JLabel;");
		out("import javax.swing.JTextField;");
		out("import javax.swing.JTextArea;");
		out("import javax.swing.JComboBox;");
		out("import javax.swing.JCheckBox;");
		out("import javax.swing.JTable;");
		out("import javax.swing.JScrollPane;");
		out("import javax.swing.Box;");
		out("import javax.swing.BoxLayout;");
		out("import javax.swing.JFrame;");
		out("import javax.swing.JPanel;");
		out("import javax.swing.BorderFactory;");
		out("import javax.swing.ImageIcon;");
		out("import javax.swing.UIManager;");
		out("import javax.swing.UnsupportedLookAndFeelException;");
		out();
		out("public class "+classname+"{");
		out();
		inc();
		out("public static void main(String[] args) throws IOException {");
		inc();
		out("try{");
		inc();
		out("UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());");
		dec();
		out("}catch (Exception e){");
		inc();
		out(" e.printStackTrace();");
		dec();
		out("}");
		out("javax.swing.SwingUtilities.invokeLater(new Runnable() {");
		inc();
		out("public void run() {");
		inc();
		out(classname+" theInstance = new "+classname+"();");
		out("theInstance.createAndShowGUI();");
		dec();
		out("}");
		dec();
		out("});");
		dec();
		out("}");
		out();
		out("private void createAndShowGUI() {");
		inc();
		out("final JFrame frame = new JFrame(\""+vname+"\");");
		out("frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
		out("JPanel mainPanel = new JPanel();");
		out("frame.setContentPane(mainPanel);");
		out("populateUI(mainPanel);");
		out("frame.pack();");
		out("frame.setVisible(true);");
		dec();
		out("}");
		out();
		out("private void populateUI(Container " + lname + "){");
		inc();
		genContent(node, lname);
		dec();
		out("}");
		dec();
		out("}");
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	
	
//	private static String getBorderArea(Layout layout){
//		String result = null;
//		if (layout.getAbsHAlignment() == HAlignmentType.RIGHT){
//			result = "EAST";
//		}else if (layout.getAbsVAlignment() == VAlignmentType.BOTTOM){
//			result = "SOUTH";
//		}else if (layout.getAbsVAlignment() == VAlignmentType.TOP){
//			result = "NORTH";
//		}else if (layout.getAbsHAlignment() == HAlignmentType.LEFT){
//			result = "WEST";
//		}else{
//			result = "CENTER";
//		}
//		return result;
//	}
	
	private static void setBorderComponent(String containerName, String elemName, BorderLayout container, Layout elem){
		String place = null;
		if (container.getTop() == elem){
			place = "NORTH";
		}else if (container.getBottom() == elem){
			place = "SOUTH";
		}else if (container.getLeft() == elem){
			place = "WEST";
		}else if (container.getRight() == elem){
			place = "EAST";
		}else if (container.getCenter() == elem){
			place = "CENTER";
		}else{
			throw new RuntimeException("Layout not located in the border layout: "+elem.getName());
		}
		if (elem instanceof Table){
			out(containerName+".add(new JScrollPane("+elemName+"), BorderLayout."+place+");");
		}else{
			out(containerName+".add("+elemName+", BorderLayout."+place+");");
		}
		
//		String line = "";
//		if (elem.getAbsVAlignment() == VAlignmentType.TOP){
//			if (hasSeveralTopElements(container)){
//				line += containerName+NORTH_SUFFIX+".add("+elemName+", BorderLayout.";
//				if (existsLaterDuplicatedAlignment(container, elem))
//					line += "NORTH";
//				else if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
//					line += "WEST";
//				else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
//					line += "EAST";
//				else
//					line += "CENTER";
//				out(line+");");
//			}else{
//				out(containerName+".add("+elemName+", BorderLayout.NORTH);");
//			}
//		}else if (elem.getAbsVAlignment() == VAlignmentType.BOTTOM){
//			if (hasSeveralBottomElements(container)){
//				line += containerName+SOUTH_SUFFIX+".add("+elemName+", BorderLayout.";
//				if (existsLaterDuplicatedAlignment(container, elem))
//					line += "SOUTH";
//				else if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
//					line += "WEST";
//				else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
//					line += "EAST";
//				else
//					line += "CENTER";
//				out(line+");");
//			}else{
//				out(containerName+".add("+elemName+", BorderLayout.SOUTH);");
//			}
//		}else{
//			line += containerName+".add("+elemName+", BorderLayout.";
//			if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
//				line += "WEST";
//			else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
//				line += "EAST";
//			else
//				line += "CENTER";
//			out(line+");");
//		}
	}
	
//	/*
//	 * 
//	 */
//	private static boolean existsLaterDuplicatedAlignment(Layout container, Layout layout){
//		int pos = container.getSublayouts().indexOf(layout);
//		for (int i=pos+1; i<container.getSublayouts().size(); ++i){
//			Layout l = container.getSublayouts().get(i);
//			if (l.getAbsHAlignment() == layout.getAbsHAlignment() && l.getAbsVAlignment() == layout.getAbsVAlignment())
//				return true;
//		}
//		return false;
//	}
	
//	/*
//	 * Returns true if there are two sublayouts with the same H/V alignments
//	 */
//	private static boolean existsDuplicatedAlignment(Layout layout){
//		int numElems = layout.getSublayouts().size();
//		HAlignmentType h[] = new HAlignmentType[numElems];
//		VAlignmentType v[] = new VAlignmentType[numElems];
//		for (int i=0; i<numElems; ++i){
//			Layout l = layout.getSublayouts().get(i);
//			if (i > 0){
//				for (int j=0; j<i; ++j){
//					if (h[j] == l.getAbsHAlignment() && v[j] == l.getAbsVAlignment())
//						return true;
//				}
//			}
//			h[i] = l.getAbsHAlignment();
//			v[i] = l.getAbsVAlignment();
//		}
//		return false;
//	}
	
//	private static boolean sameVAlignmentForAll(Layout layout){
//		VAlignmentType type = null;
//		for (Layout l: layout.getSublayouts()){
//			if (type == null)
//				type = l.getAbsVAlignment();
//			else if (l.getAbsVAlignment() != type)
//				return false;
//		}
//		return true;
//	}
	
	private static boolean hasSeveralTopElements(Layout layout){
		int topCount = 0;
		for (Layout l: layout.getSublayouts()){
			if (l.getAbsVAlignment() == VAlignmentType.TOP)
				++topCount;
		}
		if (topCount > 1)
			return true;
		else
			return false;
	}
		
	
	private static boolean hasSeveralBottomElements(Layout layout){
		int bottomCount = 0;
		for (Layout l: layout.getSublayouts()){
			if (l.getAbsVAlignment() == VAlignmentType.BOTTOM)
				++bottomCount;
		}
		if (bottomCount > 1)
			return true;
		else
			return false;
	}
	
	//private static void genAlignmentConstraint(Layout layout, String name, Layout parent, Float weightx, Float weighty){
	private static String getAbsAlignmentConstraint(Layout layout){
		String align = null;
		HAlignmentType absh = layout.getAbsHAlignment();
		VAlignmentType absv = layout.getAbsVAlignment();
//		HAlignmentType conth = parent.getContentHAlignment();
//		VAlignmentType contv = parent.getContentVAlignment();
		
		
//		if (conth == HAlignmentType.LEFT){
//			align = "LINE_START";
//		}else if (conth == HAlignmentType.RIGHT){
//				align = "LINE_END";
//		}else if (contv == VAlignmentType.TOP){
//			align = "PAGE_START";
//		}else if (contv == VAlignmentType.BOTTOM){
//			align = "PAGE_END";
//		}else if (conth == HAlignmentType.CENTER || contv == VAlignmentType.MIDDLE){
//			align = "CENTER";
//		}else if (contv == VAlignmentType.BOTTOM){
//			align = "PAGE_END";
//		}else 
		if (absh == HAlignmentType.CENTER && absv == VAlignmentType.NONE)
			//align = "CENTER";
			align = null;
		else if (absh == HAlignmentType.CENTER && absv == VAlignmentType.MIDDLE)
			//align = "CENTER";
			align = null;
		else if (absh == HAlignmentType.CENTER && absv == VAlignmentType.TOP)
			//align = "PAGE_START";
			align = null;
		else if (absh == HAlignmentType.CENTER && absv == VAlignmentType.BOTTOM)
			//align = "PAGE_END";
			align = null;
		else if (absh == HAlignmentType.RIGHT && absv == VAlignmentType.NONE)
			align = "LINE_END";
		else if (absh == HAlignmentType.NONE && absv == VAlignmentType.MIDDLE)
			align = "CENTER";
		else if (absh == HAlignmentType.NONE && absv == VAlignmentType.BOTTOM)
			align = "PAGE_END";		
		else 
			//align = "FIRST_LINE_START";
			align = null;
	
		
//		if (align != null)
//			out(name+".anchor = GridBagConstraints."+align+";");
//		if (weightx == -1)
//			weightx = new Float(1);
//		if (weighty == -1)
//			weighty = new Float(1);
		return align;
	}
	
	private static String getElementAlignmentConstraint(Layout layout){
		String align = null;
		Layout parentLayout = layout.getParentLayout();
		HAlignmentType ph = layout.getParentHAlignment();
		VAlignmentType pv = layout.getParentVAlignment();
		
		// DEBUG
		if (layout.getName().equals("GENERAR_lyt")){
			System.out.print("");
		}
		
		if (parentLayout instanceof FlowLayout){
			if (((FlowLayout) parentLayout).getType() == FlowLayoutType.VERTICAL){
				switch(ph){
					case RIGHT:
						align = "LINE_END"; break;
					case LEFT:
						align = "LINE_START"; break;
					case CENTER:
						align = "CENTER"; break;
					default:
						align = null; break;
				}
			}else{
				switch(pv){
				case TOP:
					align = "PAGE_START"; break; //%2
				case BOTTOM:
					align = "PAGE_END"; break;
				case MIDDLE:
					align = "CENTER"; break;
				default:
					align = null; break;
			}
			}
		}
		
		return align;
	}
	
	/*
	 * Returns the alignment for an element inside a FormLayout
	 */
	private static String getAlignmentConstraint(ElementNode enode, FormLayout flayout){
		String align = null;
		int xcell[] = getXCell(flayout, enode);
		AlignedColumn firstCol = flayout.getColumns().get(xcell[0]);
		AlignedColumn lastCol = flayout.getColumns().get(xcell[0] + xcell[1] - 1);
		int numLeftAligned = firstCol.getLeftNodes().size();
		int numRightAligned = lastCol.getRightNodes().size();
		boolean leftAligned = firstCol.getLeftNodes().contains(enode);
		boolean rightAligned = lastCol.getRightNodes().contains(enode);
		GraphicalElement widget = enode.getRefNode().getGuiElement();
		if (leftAligned && !rightAligned){
			align = "LINE_START"; 
		}else if (!leftAligned && rightAligned){
			align = "LINE_END";
		}else if (leftAligned && rightAligned){
			// Look at the alignment of the rest of the widgets in the column
			if (numRightAligned > numLeftAligned)
				align = "LINE_END";
//			if (widget instanceof OutputText)
//				align = "LINE_END";
			else
				align = "LINE_START";
		}else{
			align = "CENTER";
		}
		return align;
	}
	
	/*
	 * Returns the alignment of a group of elements inside a FormLayout
	 * 
	 * Pre: all the elements must belong to the same column
	 */
	private static String getAlignmentConstraint(List<ElementNode> enodes, FormLayout flayout){
		String align = null;
		int xcell[] = getXCell(flayout, enodes.get(0));
		AlignedColumn col = flayout.getColumns().get(xcell[0]);
		boolean leftAligned = false;
		boolean rightAligned = false;
		for (ElementNode enode: enodes){
			if (col.getLeftNodes().contains(enode)){
				leftAligned = true;
			}else if (col.getRightNodes().contains(enode)){
				rightAligned = true;
			}
		}
		if (leftAligned && !rightAligned){
			align = "LINE_START"; 
		}else if (!leftAligned && rightAligned){
			align = "LINE_END ";
		}else if (leftAligned && rightAligned){
			align = "LINE_START";
		}else{
			align = "CENTER";
		}
		return align;
	}
	
	
	private static String getParentAlignmentConstraint(Layout layout){
		String align = null;
		HAlignmentType htype = layout.getParentHAlignment();
		VAlignmentType vtype = layout.getParentVAlignment();
		if (htype == HAlignmentType.NONE)
			htype = layout.getParentLayout().getParentHAlignment();
		
		// Get the alignment of any sibling (the first sibling with alignment)
		Layout parent = layout.getParentLayout();
		HAlignmentType siblingHType = null;
		VAlignmentType siblingVType = null;
		if (parent != null){
			Iterator<Layout> iter = parent.getSublayouts().iterator();
			while (iter.hasNext()){
				Layout l = iter.next();
				if (l != layout){
					if (siblingHType == null && l.getParentHAlignment() != null && 
							l.getParentHAlignment() != HAlignmentType.NONE){
						siblingHType = l.getParentHAlignment();
					}
					if (siblingVType == null && l.getParentVAlignment() != null && 
							l.getParentVAlignment() != VAlignmentType.NONE){
						siblingVType = l.getParentVAlignment();
					}
				}
			} // end_while
		}
		
//		switch (htype) {
//		case RIGHT:
//			align = "LINE_END";
//			break;
//		case CENTER:
//			align = "CENTER";
//			break;
//		default:
//			align = "LINE_START"; //%1
//		}
		
		// BAD WORK!! CHANGE IN THE FUTURE
		//
		if (htype == HAlignmentType.LEFT && vtype == VAlignmentType.TOP){
			align = "FIRST_LINE_START";
		}else if (htype == HAlignmentType.CENTER && vtype == VAlignmentType.TOP){
			align = "PAGE_START";
		}else if (htype == HAlignmentType.RIGHT && vtype == VAlignmentType.TOP){
			align = "FIRST_LINE_END";
		}else if (vtype == VAlignmentType.TOP){
			if (siblingHType == HAlignmentType.LEFT){
				align = "FIRST_LINE_START";
			}else if (siblingHType == HAlignmentType.CENTER){
				align = "PAGE_START";
			}else if (siblingHType == HAlignmentType.RIGHT){
				align = "FIRST_LINE_END";
			}else{
				align = "FIRST_LINE_START";
			}
		}else if (htype == HAlignmentType.LEFT && vtype == VAlignmentType.MIDDLE){
			align = "LINE_START";
		}else if (htype == HAlignmentType.CENTER && vtype == VAlignmentType.MIDDLE){
			align = "CENTER";
		}else if (htype == HAlignmentType.RIGHT && vtype == VAlignmentType.MIDDLE){
			align = "LINE_END";
		}else if (vtype == VAlignmentType.MIDDLE){
			if (siblingHType == HAlignmentType.LEFT){
				align = "LINE_START";
			}else if (siblingHType == HAlignmentType.CENTER){
				align = "CENTER";
			}else if (siblingHType == HAlignmentType.RIGHT){
				align = "LINE_END";
			}else{
				align = "LINE_START";
			}
		}else if (htype == HAlignmentType.LEFT && vtype == VAlignmentType.BOTTOM){
			align = "LAST_LINE_START";
		}else if (htype == HAlignmentType.CENTER && vtype == VAlignmentType.BOTTOM){
			align = "PAGE_END";
		}else if (htype == HAlignmentType.RIGHT && vtype == VAlignmentType.BOTTOM){
			align = "LAST_LINE_END";
		}else if (vtype == VAlignmentType.BOTTOM){
			if (siblingHType == HAlignmentType.LEFT){
				align = "LAST_LINE_START";
			}else if (siblingHType == HAlignmentType.CENTER){
				align = "PAGE_END";
			}else if (siblingHType == HAlignmentType.RIGHT){
				align = "LAST_LINE_END";
			}else{
				align = "LAST_LINE_START";
			}
		}else if (htype == HAlignmentType.LEFT && vtype == VAlignmentType.NONE){
			align = "LINE_START";
		}else if (htype == HAlignmentType.CENTER && vtype == VAlignmentType.NONE){
			align = "CENTER";
		}else if (htype == HAlignmentType.RIGHT && vtype == VAlignmentType.NONE){
			align = "LINE_END";
		}else if (htype == HAlignmentType.BOTH){
			if (siblingHType == HAlignmentType.LEFT){
				align = "FIRST_LINE_START";
			}else if (siblingHType == HAlignmentType.CENTER){
				align = "PAGE_START";
			}else if (siblingHType == HAlignmentType.RIGHT){
				align = "FIRST_LINE_END";
			}else{
				align = "FIRST_LINE_START";
			}
		}else if (vtype == VAlignmentType.BOTH){
			if (siblingVType == VAlignmentType.TOP){
				align = "PAGE_START";
			}else if (siblingVType == VAlignmentType.MIDDLE){
				align = "LINE_START";
			}else if (siblingVType == VAlignmentType.BOTTOM){
				align = "PAGE_END";
			}else{
				align = "LINE_START";
			}
		}else{
			align = "LINE_START";
		}
		
		return align;
	}
	
//	private static void genAlignment(Layout layout, String name){
//		String layoutStr;
//		if (	layout.getAbsHAlignment() == HAlignmentType.CENTER || 
//				layout.getAbsHAlignment() == HAlignmentType.BOTH){
//			layoutStr = "CENTER_ALIGNMENT";
//		}else if (layout.getAbsHAlignment() == HAlignmentType.RIGHT){
//			layoutStr = "RIGHT_ALIGNMENT";
//		}else{
//			layoutStr = "LEFT_ALIGNMENT";
//		}
//		out(name+".setAlignmentX(Component."+layoutStr+");");
//	}
	
	private static Layout getBestLayout(LayoutInfoTreeNode node){
		Layout candidate = null;
		for (Layout alternative: node.getLayoutAlternatives()){
			if (candidate == null || alternative.getFitness() < candidate.getFitness())
				candidate = alternative;
		}
		return candidate;
	}
	
	//private static int[] getMargins(Layout layout, String name, Layout parent, Rectangle regionArea){
	private static int[] getMargins(List<Margin> margins, Rectangle regionArea){
		int l=0, r=0, t=0, b=0;
		for (Margin margin: margins){
			if (margin.getType() == MarginType.LEFT)
				l = Math.round(margin.getValue() * regionArea.width);
			else if (margin.getType() == MarginType.RIGHT)
				r = Math.round(margin.getValue() * regionArea.width);
			else if (margin.getType() == MarginType.TOP)
				t = Math.round(margin.getValue() * regionArea.height);
			else if (margin.getType() == MarginType.BOTTOM)
				b = Math.round(margin.getValue() * regionArea.height);
		}
		int result[] = {t,l,b,r};
		return result;
	}
	
	/*
	 * Gets the XOR of the margins of the children layouts that are passed as a parameter
	 */
	private static int[] getChildrenMargins(List<Layout> layouts, Rectangle regionArea){
		int result[] = {0, 0, 0, 0};
		for (Layout l: layouts){
			int m[] = getMargins(l.getMargins(), regionArea);
			for (int i=0; i<4; ++i){
				if (result[i] == 0 && m[i] > 0){
					result[i] = m[i];
				}else if (result[i] > 0 && m[i] > 0){
					result[i] = Math.min(result[i], m[i]);
				}
			}
		}
		return result;
	}
	
	
	
	private static int[] getGaps(Layout layout, String name, Layout parent, Rectangle regionArea){
		int h=0, v=0;
		for (Gap g: parent.getGaps()){
			if (g.getLayouts().get(0) == layout){
				if (g.getType() == GapType.HORIZONTAL)
					h = Math.round(g.getValue() * regionArea.width);
				else if (g.getType() == GapType.VERTICAL)
					v = Math.round(g.getValue() * regionArea.height);
			}
		}
		int result[] = {0,0,v,h};
		return result;
	}
	
//	private static int[] generateBorderLayoutInsets(String elementName, Layout layout, Rectangle containerRegion){
//		int l = 0, r = 0, t = 0, b = 0;
//		for (Layout sub: layout.getSublayouts()){
//			for (Margin m: sub.getMargins()){
//				if (m.getType() == MarginType.LEFT){
//					int value = Math.round(m.getValue() * containerRegion.width);
//					l = Math.max(l, value);
//				}else if (m.getType() == MarginType.RIGHT){
//					int value = Math.round(m.getValue() * containerRegion.width);
//					r = Math.max(r, value);
//				}else if (m.getType() == MarginType.TOP){
//					int value = Math.round(m.getValue() * containerRegion.height);
//					t = Math.max(t, value);
//				}else if (m.getType() == MarginType.BOTTOM){
//					int value = Math.round(m.getValue() * containerRegion.height);
//					b = Math.max(b, value);
//				}
//			}
//		}
//		int result[] = {t, l, b, r};
//		return result;
//	}
	
	/*
	 * Gets the horizontal cell for an element in a FormLayout
	 * 
	 * PRE: the columns are ordered
	 * 
	 * Returns: 
	 * 	[0] = x cell
	 * 	[1] = cell width
	 */
	private static int[] getXCell(FormLayout formLayout, ElementNode node){
		int result[] = new int[2];
		float minLgap = Float.MAX_VALUE;
		int cellNumber = -1;
		int w=0;
		int i=0;
		while (i<formLayout.getColumns().size()){
			AlignedColumn col = formLayout.getColumns().get(i);
			if (col.getNodes().contains(node) && col.getLgap() < minLgap){
				cellNumber = i;
				minLgap = col.getLgap();
				++w;
			}
			++i;
		}
		result[0] = cellNumber;
		result[1] = w;
		return result;
	}
	
	/*
	 * Gets the vertical cell for an element in a FormLayout
	 * 
	 * PRE: the rows are ordered
	 * 
	 */
	private static int getYCell(FormLayout formLayout, ElementNode node){
		int i = 0;
		while (i < formLayout.getSublayouts().size()){
			Layout flow = (FlowLayout)formLayout.getSublayouts().get(i);
			if (flow.getSublayouts().contains(node))
				break;
			++i;
		}
		return i;
	}
	
	/*
	 * Gets the elements that belong to a given cell
	 */
	private static List<ElementNode> getCellElements(FormLayout layout, int x, int y){
		ArrayList<ElementNode> result = new ArrayList<ElementNode>();
		if (y > layout.getSublayouts().size()-1 || x > layout.getColumns().size())
			throw new RuntimeException("Wrong cell: "+x+", "+y);
		//List<Element> rowElements =
		FlowLayout row = (FlowLayout)layout.getSublayouts().get(y);
		AlignedColumn col = layout.getColumns().get(x);
		for (Layout node: row.getSublayouts()){
			ElementNode enode = (ElementNode)node;
			if (col.getNodes().contains(enode)){
				result.add(enode);
			}
		}
		return result;
	}

	//////////

	private static void initBuffer(){
		buffer = new StringBuffer();
		tabCount = 0;
	}
	
	private static void inc(){
		++tabCount;
	}
	
	private static void dec(){
		--tabCount;
		if (tabCount < 0)
			tabCount = 0;
	}
	
	private static void out(){
		buffer.append("\n");
	}
	
	private static void out(String txt){
		out(txt, tabCount);
	}
	
	private static void out(String txt, int indent){
		for (int i=0; i<indent; ++i)
			buffer.append(TAB);
		buffer.append(txt + "\n");
	}
	
	private static void bufferToFile(String path){
		try{
			FileWriter outFile = new FileWriter(path);
			PrintWriter outWriter = new PrintWriter(outFile);
			outWriter.println(buffer.toString());
			outWriter.close();
			outFile.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static String firstToUpper(String txt){
		return txt.substring(0, 1).toUpperCase() + txt.substring(1, txt.length());
	}
	
	private static String firstToLower(String txt){
		return txt.substring(0, 1).toLowerCase() + txt.substring(1, txt.length());
	}
	
	private static String normalizeName(String name){
		return firstToLower(name);
	}
	
	private static int[] mergeArrays(int arr1[], int arr2[]){
		if (arr1.length != arr2.length)
			throw new RuntimeException("The array must be of the same length");
		int result[] = new int[arr1.length];
		for (int i=0; i<arr1.length; ++i){
			result[i] = arr1[i] + arr2[i];
		}
		return result;
	}
	
	private static String genContraintName(String str){
		String cname = CONSTRAINT_PREFIX + str;
		if (uniqueNames.containsKey(cname))
			cname += uniqueId++;
		uniqueNames.put(cname, true);
		return cname;
	}
	
	private static float getElementWeightx(ElementNode element){
		Layout layout = element.getParentLayout();
		int pos = layout.getSublayouts().indexOf(element);
		HAlignmentType htype = layout.getParentHAlignment();
		if (htype == HAlignmentType.CENTER){
			return 0f;
		}else if (htype == HAlignmentType.RIGHT){
			if (pos == 0)
				return 1f;
			else
				return 0f;
		}else{
			if (pos == layout.getSublayouts().size() - 1)
				return 1f;
			else
				return 0f;
		}
	}
	
	/*
	 * Returns the number of columns that an element spans across columns
	 * inside a FormLayout
	 */
	private static int getColumnSpan(FormLayout layout, ElementNode node){
		int result = 0;
		for (AlignedColumn col: layout.getColumns()){
			if (col.getNodes().contains(node))
				++result;
		}
		return result;
	}
	
	/*
	 * Returns true if the cell next to the widget occupied by another widget
	 * (or there is a widget on the right in the same cell)
	 */
	private static boolean setRightMargin(FormLayout formLayout, ElementNode element){
		ElementNode nextElement = null;
		FlowLayout flayout = (FlowLayout)element.getParentLayout();
		int rowPos = flayout.getSublayouts().indexOf(element);
		if (rowPos+1 < flayout.getSublayouts().size()){
			nextElement = (ElementNode)flayout.getSublayouts().get(rowPos+1);
		}
		if (nextElement == null){
			return false;
		}
		int rowCol = 0;
		boolean elementInPreviousColumn = false;
		while (rowCol < formLayout.getColumns().size()){
			AlignedColumn col = formLayout.getColumns().get(rowCol);
			if (col.getNodes().contains(element)){
				if (col.getNodes().contains(nextElement)){
					return true;
				}else{
					elementInPreviousColumn = true;
				}
			}else if (elementInPreviousColumn){
				if (col.getNodes().contains(nextElement))
					return true;
				else
					return false;
			}
			++rowCol;
		}
		return true;
	}
		
}
