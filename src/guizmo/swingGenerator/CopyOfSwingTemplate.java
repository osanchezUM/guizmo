package guizmo.swingGenerator;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.swing.BorderFactory;

import guizmo.layout.*;
import guizmo.structure.*;
import guizmo.structure.utilM.StructureHelper;

public class CopyOfSwingTemplate {
	
	private static StringBuffer buffer;
	private static final String TAB = "   ";
	private static int tabCount = 0;
	private static String CONSTRAINT_PREFIX = "c_";
	private static String NORTH_SUFFIX = "North";
	private static String SOUTH_SUFFIX = "South";
	private static String AUX_SUFFIX = "_aux";
	private static String EXTRA_SUFFIX = "_extra";
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
			genClass(node);
			String classname = firstToUpper(node.getName());
			String path = outputDir + "/" + classname + ".java";
			bufferToFile(path);
		}
	}
	
	private static void genLayout(Layout layout, String containerName, Rectangle regionArea){
		// DEBUG
		if (layout == null){
			throw new RuntimeException("Element without layouts: "+containerName);
		}
		if (layout.getName().equals("NestedGroup_8_lyt")){
			System.out.print("");
		}
		
		boolean weightxDefined = false;
		boolean weightyDefined = false;
		
		if (layout instanceof FlowLayout){
//			line += "new BoxLayout("+containerName+", BoxLayout.";
//			if (((FlowLayout)layout).getType() == FlowLayoutType.VERTICAL)
//				line += "Y_AXIS)";
//			else
//				line += "X_AXIS)";
			out(containerName+".setLayout(new GridBagLayout());");
		}else if (layout instanceof GridLayout){
			GridLayout glayout = (GridLayout)layout;
			out(containerName+".setLayout(new GridLayout(0,"+glayout.getNumCols()+"));");
			
		}else if (layout instanceof BorderLayout){
			String pname = containerName + AUX_SUFFIX;
			String cname = genContraintName(pname);
			out(containerName+".setLayout(new GridBagLayout());");
			out("GridBagConstraints " + cname + " = new GridBagConstraints();");
			out(cname + ".gridx = 0;");
			out(cname + ".gridy = 0;");
			out(cname + ".fill = GridBagConstraints.HORIZONTAL;");
			if (!weightxDefined){
				out(cname + ".weightx = 1;");
				weightxDefined = true;
			}
			//int bInsets[] = generateBorderLayoutInsets(cname, layout, regionArea);
			//int bInsets[] = getMargins(layout, cname, layout.getParentLayout(), regionArea);
			int bInsets[] = getMargins(layout.getMargins(), regionArea);
			out(cname+".insets = new Insets("+bInsets[0]+", "+bInsets[1]+", "+bInsets[2]+", "+bInsets[3]+");");
			out("JPanel "+pname+" = new JPanel();");
			out(pname+".setLayout(new BorderLayout());");
			out(containerName+".add("+pname+", "+cname+");");
			
		}else if (layout instanceof FormLayout){
			out(containerName+".setLayout(new GridBagLayout());");
			
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
		
		
		// Sublayouts
		for (Layout sub: layout.getSublayouts()){
			int pos = layout.getSublayouts().indexOf(sub);
			String cname = genContraintName(sub.getName());
			
			// Layout
			if (layout instanceof FlowLayout || layout instanceof FormLayout){
				out("GridBagConstraints " + cname + " = new GridBagConstraints();");
				if (layout instanceof FormLayout){
					out(cname + ".gridx = 0;");
					out(cname + ".gridy = "+pos+";");
				}else if ((((FlowLayout)layout).getType() == FlowLayoutType.VERTICAL)){
					out(cname + ".gridx = 0;");
					out(cname + ".gridy = "+pos+";");
				}else{
					out(cname + ".gridy = 0;");
					out(cname + ".gridx = "+pos+";");
				}
				
				// Resizing
				if (sub instanceof ElementNode && sub.getRefNode().getGuiElement() instanceof SingleWidget){
					LayoutInfoTreeNode tnode = ((ElementNode)sub).getRefNode();
					HAlignmentType hAlign = sub.getAbsHAlignment();
					Layout parentLayout = sub.getParentLayout();
					HAlignmentType parentHAlign = parentLayout.getAbsHAlignment();
					if 	(	(hAlign == HAlignmentType.NONE || hAlign == HAlignmentType.BOTH) &&
							(parentHAlign == HAlignmentType.NONE || parentHAlign == HAlignmentType.BOTH)){
						out(cname + ".fill = GridBagConstraints.HORIZONTAL;");
						if (tnode.getGuiElement() instanceof TextBox || tnode.getGuiElement() instanceof ComboBox)
							if (!weightxDefined){
								out(cname + ".weightx = "+sub.getHSize()+";");
								weightxDefined = true;
							}
						else
							if (!weightxDefined){
								out(cname + ".weightx = 0;");
								weightxDefined = true;
							}
					}
				}else{
					HAlignmentType halign = sub.getAbsHAlignment();
					if (halign == HAlignmentType.NONE ||  halign == HAlignmentType.BOTH){
						out(cname + ".fill = GridBagConstraints.HORIZONTAL;");
						if (!weightxDefined){
							out(cname + ".weightx = 1;");
							weightxDefined = true;
						}
					}
				}
				//out(cname + ".weighty = 1;");
				
				// Alignment
				genAlignmentConstraint(sub, cname, layout, weightxDefined, weightyDefined);
				weightxDefined = true;
				weightyDefined = true;
				
				// Margins
				int margins[] = new int[4];
				//if (!sub.getMargins().isEmpty()){
				if (!layout.getMargins().isEmpty()){
					//margins = getMargins(sub, cname, layout, regionArea);
					margins = getMargins(layout.getMargins(), regionArea);
					//margins = getMargins(sub.getMargins(), regionArea);
				}
				
				// Gaps
				int gaps[] = new int[4];
				if (!layout.getGaps().isEmpty() && pos < layout.getSublayouts().size() - 1){
					gaps = getGaps(sub, cname, layout, regionArea);
				}
				int insets[] = mergeArrays(margins, gaps);
				if (insets[0] > 0 || insets[1] > 0 || insets[2] > 0 || insets[3] > 0)
					out(cname + ".insets = new Insets("+insets[0]+", "+insets[1]+", "+insets[2]+", "+insets[3]+");");
			
//			}else if (layout instanceof FormLayout){
//				FormLayout flayout = (FormLayout)layout;
//				out("GridBagConstraints " + cname + " = new GridBagConstraints();");
//				out(cname + ".gridx = "+sub.getParentLayout().getSublayouts().indexOf(sub)+";");
//				out(cname + ".gridy = "+flayout.getSublayouts().indexOf(sub)+";");
			}
			
			// GUIRegion
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
				out(containerName+".add("+lname+", "+cname+");");
				genContent(node, lname);
				
			}else if (sub instanceof ElementNode && !(((ElementNode)sub).getRefNode().getGuiElement() instanceof GUIRegion)){
				GraphicalElement elem = ((ElementNode)sub).getRefNode().getGuiElement();
				String wname = normalizeName(elem.getName());
				if (layout instanceof FlowLayout){
					out(containerName+".add("+wname+", "+cname+");");
				}else if (layout instanceof BorderLayout){
					//String area = getBorderArea(sub);
					//out(containerName+".add("+wname+", BorderLayout."+area+");");
					if (layout instanceof BorderLayout){
						String contname = containerName + AUX_SUFFIX;
						setBorderComponent(contname, wname, layout, sub);
					}else
						setBorderComponent(containerName, wname, layout, sub);
				}else{
					out(containerName+".add("+wname+");");
				}
				//genAlignment(sub, wname);
				
			}else{
				String lname = normalizeName(sub.getName());
				out("JPanel "+lname+" = new JPanel();");
				if (layout instanceof FlowLayout || layout instanceof FormLayout){
					out(containerName+".add("+lname+", "+cname+");");
				}else if (layout instanceof BorderLayout){
					//String area = getBorderArea(sub);
					//out(containerName+".add("+lname+", BorderLayout."+area+");");
					if (layout instanceof BorderLayout){
						String contname = containerName + AUX_SUFFIX;
						setBorderComponent(contname, lname, layout, sub);
					}else
						setBorderComponent(containerName, lname, layout, sub);
				}else{
					out(containerName+".add("+lname+");");
				}
				//genAlignment(sub, lname);
				genLayout(sub, lname, regionArea);
			}
		} // end_for
		
	}
	
	private static void genWidget(LayoutInfoTreeNode tnode, String containerName, Rectangle containerArea){
		GraphicalElement widget = tnode.getGuiElement();
		ElementNode enode = (ElementNode)tnode.getReferredBy().get(0);
		String wname = normalizeName(widget.getName());
		int w = Math.round(enode.getHSize() * containerArea.width);
		int h = Math.round(enode.getVSize() * containerArea.height);
		if (widget instanceof Button){
			out("JButton "+wname+" = new JButton();");
			out(wname+".setText(\""+wname+"\");");	
		}else if (widget instanceof OutputText){
			String txt = ((OutputText)widget).getText().getValue();
			out("JLabel "+wname+" = new JLabel();");
			out(wname+".setText(\""+txt+"\");");
		}else if (widget instanceof TextBox){
			out("JTextField "+wname+" = new JTextField();");
			out(wname+".setText(\""+wname+"\");");
		}else if (widget instanceof ComboBox){
			out("JComboBox "+wname+" = new JComboBox();");
			out(wname+".addItem(\""+wname+"\");");
		}else if (widget instanceof ImageContainer){
			ImageContainer img = (ImageContainer)widget;
			if (img.getImage() == null || img.getImage().getValue() == null || 
					img.getImage().getValue().trim().equals(""))
				out("JLabel "+wname+" = new JLabel(\""+wname+"\", JLabel.CENTER);");
			else
				out("JLabel "+wname+" = new JLabel(new ImageIcon(\""+img.getImage().getValue()+"\"));");
		}else{
			throw new RuntimeException("Widget not considered yet");
		}
		//out(wname+".setPreferredSize(new Dimension("+w+","+h+"));");
		out(wname+".setPreferredSize(new Dimension("+w+","+wname+".getPreferredSize().height));");
	}
	
	
	
	////////////////////////////////////////
	
	
	
	private static void genContent(LayoutInfoTreeNode node, String containerName){
		String tname = node.getName();
		Container c = (Container)node.getGuiElement();
		Rectangle regionArea = StructureHelper.toRectangle(c);
		out("// "+tname);
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
	
	private static void genClass(LayoutInfoTreeNode node){
		String classname = firstToUpper(node.getName());
		Layout layout = getBestLayout(node);
		if (layout == null){
			System.err.println("View node with no layout. Generation skipped.");
			return;
		}
			
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
		out("import javax.swing.JButton;");
		out("import javax.swing.JLabel;");
		out("import javax.swing.JTextField;");
		out("import javax.swing.JComboBox;");
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
		out("final JFrame frame = new JFrame(\""+node.getName()+"\");");
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
	
	private static void setBorderComponent(String containerName, String elemName, Layout container, Layout elem){
		String line = "";
		if (elem.getAbsVAlignment() == VAlignmentType.TOP){
			if (hasSeveralTopElements(container)){
				line += containerName+NORTH_SUFFIX+".add("+elemName+", BorderLayout.";
				if (existsLaterDuplicatedAlignment(container, elem))
					line += "NORTH";
				else if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
					line += "WEST";
				else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
					line += "EAST";
				else
					line += "CENTER";
				out(line+");");
			}else{
				out(containerName+".add("+elemName+", BorderLayout.NORTH);");
			}
		}else if (elem.getAbsVAlignment() == VAlignmentType.BOTTOM){
			if (hasSeveralBottomElements(container)){
				line += containerName+SOUTH_SUFFIX+".add("+elemName+", BorderLayout.";
				if (existsLaterDuplicatedAlignment(container, elem))
					line += "SOUTH";
				else if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
					line += "WEST";
				else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
					line += "EAST";
				else
					line += "CENTER";
				out(line+");");
			}else{
				out(containerName+".add("+elemName+", BorderLayout.SOUTH);");
			}
		}else{
			line += containerName+".add("+elemName+", BorderLayout.";
			if (elem.getAbsHAlignment() == HAlignmentType.LEFT)
				line += "WEST";
			else if (elem.getAbsHAlignment() == HAlignmentType.RIGHT)
				line += "EAST";
			else
				line += "CENTER";
			out(line+");");
		}
	}
	
	/*
	 * 
	 */
	private static boolean existsLaterDuplicatedAlignment(Layout container, Layout layout){
		int pos = container.getSublayouts().indexOf(layout);
		for (int i=pos+1; i<container.getSublayouts().size(); ++i){
			Layout l = container.getSublayouts().get(i);
			if (l.getAbsHAlignment() == layout.getAbsHAlignment() && l.getAbsVAlignment() == layout.getAbsVAlignment())
				return true;
		}
		return false;
	}
	
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
	
	private static void genAlignmentConstraint(Layout layout, String name, Layout parent, boolean weightxDefined, boolean weightyDefined){
		String align;
		HAlignmentType absh = layout.getAbsHAlignment();
		VAlignmentType absv = layout.getAbsVAlignment();
		HAlignmentType conth = parent.getContentHAlignment();
		VAlignmentType contv = parent.getContentVAlignment();
		
		if (conth == HAlignmentType.LEFT){
			align = "LINE_START";
		}else if (conth == HAlignmentType.RIGHT){
				align = "LINE_END";
		}else if (contv == VAlignmentType.TOP){
			align = "PAGE_START";
		}else if (contv == VAlignmentType.BOTTOM){
			align = "PAGE_END";
		}else if (conth == HAlignmentType.CENTER || contv == VAlignmentType.MIDDLE){
			align = "CENTER";
		}else if (contv == VAlignmentType.BOTTOM){
			align = "PAGE_END";
		}else if (absh == HAlignmentType.CENTER && absv == VAlignmentType.NONE)
			align = "CENTER";
		else if (absh == HAlignmentType.RIGHT && absv == VAlignmentType.NONE)
			align = "LINE_END";
		else if (absh == HAlignmentType.NONE && absv == VAlignmentType.MIDDLE)
			align = "CENTER";
		else if (absh == HAlignmentType.NONE && absv == VAlignmentType.BOTTOM)
			align = "PAGE_END";
		else 
			align = "FIRST_LINE_START";
		out(name+".anchor = GridBagConstraints."+align+";");
		if (!weightxDefined)
			out(name+".weightx = 1;");
		if (!weightyDefined)
			out(name+".weighty = 1;");
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
	
	
	
	private static int[] getGaps(Layout layout, String name, Layout parent, Rectangle regionArea){
		int h=0, v=0;
		for (Gap g: parent.getGaps()){
			if (g.getType() == GapType.HORIZONTAL)
				h = Math.round(g.getValue() * regionArea.width);
			else if (g.getType() == GapType.VERTICAL)
				v = Math.round(g.getValue() * regionArea.height);
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
}
