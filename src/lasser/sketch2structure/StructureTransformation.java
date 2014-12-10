package lasser.sketch2structure;


import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import guizmo.structure.ComposableWidget;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalView;
import guizmo.structure.Locatable;
import guizmo.structure.OutputText;
import guizmo.structure.StructureFactory;
import guizmo.structure.StructureRoot;
import guizmo.structure.TableRow;
import lasser.mtraces.TraceRoot;
import lasser.mtraces.utilM.TraceStore;
import lasser.regions.Region;
import lasser.sketch.Button;
import lasser.sketch.CheckBox;
import lasser.sketch.ComboBox;
import lasser.sketch.Container;
import lasser.sketch.Image;
import lasser.sketch.Label;
import lasser.sketch.NamedElement;
import lasser.sketch.Panel;
import lasser.sketch.RadioGroup;
import lasser.sketch.SketchRoot;
import lasser.sketch.Table;
import lasser.sketch.TextArea;
import lasser.sketch.TextBox;
import lasser.sketch.TextElement;
import lasser.sketch.Widget;
import lasser.sketch.WidgetGroup;
import lasser.sketch.Window;


public class StructureTransformation {
	
	private static final String INFIX = "_";
	private static final String DEFAULT_NAME = "default";
	private static final String LABEL_SUFFIX = "label";
	private static final String FIELD_SUFFIX = "field";
	private static final String UNNAMED_FIELD = "unnamed";
	private static final int MAX_NAME_LENGTH = 20;
	private static int counter = 1;
	
	private static final StructureFactory factory = StructureFactory.eINSTANCE;
	
	private static HashMap<String,Integer> uniqueNames;
	
	/*
	 * 
	 */
	public static StructureRoot execute(SketchRoot sketchRoot, List<Region> rootRegions, TraceRoot traceRoot){
		StructureRoot strucRoot = factory.createStructureRoot();
		TraceStore store = new TraceStore(traceRoot);
		uniqueNames = new HashMap<String,Integer>();
		
		
		for (Region r: rootRegions){
			Window w = (Window)r.getRef();
			GraphicalView v = factory.createGraphicalView();
//			if (w.getId() != null && !w.getId().trim().equals("")){
//				v.setId(w.getId());
//			}else{
//				v.setId(genId(w));
//			}
			v.setId(genId(w));
			if (w.getName() != null)
				v.setName(w.getName());
			else
//				v.setName(DEFAULT_NAME+INFIX+genId(w));
				v.setName(v.getId());
			setCoordinates(v, r);
			strucRoot.getViews().add(v);
			store.add(w, v);
			
			// There are children regions
			if (containsContainerRegions(r)){
				for (Region rchild: r.getChildren()){
					GUIRegion guiReg = genRegion(rchild, store);
					v.getWidgets().add(guiReg);
				}
			}
			// There are not children regions but widgets
			else{
				for (Region rchild: r.getChildren()){
					ComposableWidget newWidget = genWidget(rchild, store);
					ComposableWidget overlappedWidget = checkOverlapping(newWidget, v.getWidgets());
					if (overlappedWidget != null){
						fixOverlapping(newWidget, overlappedWidget);
					}
					v.getWidgets().add(newWidget);	
				}
			}
		}
		
		return strucRoot;
	}
	
	private static GUIRegion genRegion(Region r, TraceStore store){
		GUIRegion guiRegion = factory.createGUIRegion();
		//guiRegion.setId(r.getName());
		guiRegion.setId(genId(r.getRef()));
		//guiRegion.setName(r.getName());
		guiRegion.setName(guiRegion.getId());
		setCoordinates(guiRegion, r);
		if (r.getRef() instanceof WidgetGroup){
			guiRegion.setBorder(true);
			guiRegion.setTitle(((WidgetGroup)r.getRef()).getText());
		}else if (r.getRef() instanceof Panel){
			guiRegion.setBorder(true);
		}else{
			guiRegion.setBorder(false);
		}
		
		// There are children regions
		if (containsContainerRegions(r)){
			for (Region rchild: r.getChildren()){
				GUIRegion guiReg = genRegion(rchild, store);
				guiRegion.getWidgets().add(guiReg);
			}
		}
		// There are not children regions but widgets
		else{
			for (Region rchild: r.getChildren()){
				ComposableWidget newWidget = genWidget(rchild, store);
				ComposableWidget overlappedWidget = checkOverlapping(newWidget, guiRegion.getWidgets());
				if (overlappedWidget != null){
					fixOverlapping(newWidget, overlappedWidget);
				}
				guiRegion.getWidgets().add(newWidget);	
			}
		}
		
		return guiRegion;
	}
	
	/*
	 * Returns true if the widget is overlapped with the already created widgets
	 */
	private static ComposableWidget checkOverlapping(ComposableWidget widget, List<ComposableWidget> visited){
		for (ComposableWidget w: visited){
			if (checkOverlapping(widget, w)){
				System.err.println("OVERLAPPED WIDGETS: "+widget.getName()+" and "+w.getName());
				return w;
			}
		}
		return null;
	}
	
	/*
	 * Returns true if the widget is overlapped with the already created widgets
	 */
	private static boolean checkOverlapping(ComposableWidget w1, ComposableWidget w2){
		
		// Check overlapping
		Rectangle r1 = new Rectangle(w1.getXmin(), w1.getYmin(), 
				w1.getXmax() - w1.getXmin() + 1, w1.getYmax() - w1.getYmin() + 1);
			Rectangle r2 = new Rectangle(w2.getXmin(), w2.getYmin(), 
					w2.getXmax() - w2.getXmin() + 1, w2.getYmax() - w2.getYmin() + 1);
			if (r1.intersects(r2)){
				return true;
			}
		
		return false;
	}
	
	/*
	 * 
	 */
	private static void fixOverlapping(ComposableWidget widget1, ComposableWidget widget2){
		ComposableWidget l, w = null;
		if (widget1 instanceof OutputText){
			l = widget1;
			w = widget2;
		}else if (widget2 instanceof OutputText){
			l = widget2;
			w = widget1;
		}else{
			throw new RuntimeException("Overlapped widgets cannot be automatically resolved");
		}
		if (l.getXmin() < w.getXmin()){
			l.setXmax(w.getXmin() - 1);
		}else{
			l.setXmin(w.getXmax() + 1);
		}
		if (checkOverlapping(l, w)){
			if (l.getYmin() < w.getYmin()){
				l.setYmax(w.getYmin() - 1);
			}else{
				l.setYmin(w.getYmax() + 1);
			}
		}
		if (checkOverlapping(l, w)){
			throw new RuntimeException("Overlapping not resolved");
		}
		System.err.println("WIDGET SIZE MODIFIED FOR : "+w.getName());
	}
	/*
	 * 
	 */
	private static ComposableWidget genWidget(Region region, TraceStore store){
		Widget w = region.getRef();
		ComposableWidget newWidget = null;
		if (w instanceof TextBox){
			guizmo.structure.TextBox tbox = factory.createTextBox();
			guizmo.structure.Text txt = getText((TextBox)w);
			tbox.setText(txt);
			newWidget = tbox;
		}else if (w instanceof TextArea){
			guizmo.structure.TextArea area = factory.createTextArea();
			guizmo.structure.Text txt = getText((TextArea)w);
			area.setText(txt);
			newWidget = area;
		}else if (w instanceof Label){
			guizmo.structure.OutputText otext = factory.createOutputText();
			guizmo.structure.Text txt = getText((Label)w);
			otext.setText(txt);
			newWidget = otext;
		}else if (w instanceof Button){
			guizmo.structure.Button button = factory.createButton();
			guizmo.structure.Text txt = getText((Button)w);
			button.setGraphic(txt);
			newWidget = button;
		}else if (w instanceof CheckBox){
			guizmo.structure.CheckBox cbox = factory.createCheckBox();
			cbox.setSelected(((CheckBox) w).isSelected());
			guizmo.structure.Item item = factory.createItem();
			//item.setName(((CheckBox)w).getText());
			guizmo.structure.Text txt = getText((CheckBox)w);
			cbox.setResource(txt);
			newWidget = cbox;
		}else if (w instanceof Image){
			guizmo.structure.ImageContainer imgContainer = factory.createImageContainer();
			guizmo.structure.Image img = factory.createImage();
			imgContainer.setImage(img);
			newWidget = imgContainer;
		}else if (w instanceof ComboBox){
			guizmo.structure.ComboBox combo = factory.createComboBox();
			guizmo.structure.Item item = factory.createItem();
			ComboBox cbox = (ComboBox)w;
			item.setName(cbox.getText());
			guizmo.structure.Text txt = getText(cbox);
			item.setResource(txt);
			combo.getItems().add(item);
			newWidget = combo;
		}else if (w instanceof RadioGroup){
			guizmo.structure.RadioGroup group = factory.createRadioGroup();
			for (lasser.sketch.RadioButton rbutton: ((RadioGroup) w).getItems()){
				guizmo.structure.Item item = factory.createItem();
				//item.setId(rbutton.getId());
				item.setId(genId(rbutton));
				//item.setName(rbutton.getText());
				if (rbutton.isSelected()){
					group.getSelected().add(item);
				}
				guizmo.structure.Text txt = getText(rbutton);
				item.setResource(txt);
				group.getItems().add(item);
			}
			newWidget = group;
		}else if (w instanceof Table){
			Table t = (Table)w;
			guizmo.structure.Table table = factory.createTable();
			for (String columnTitle: t.getRows().get(0).getValues()){
//				String colTitle = null;
//				if (columnTitle == null){
//					colTitle = UNNAMED_FIELD + counter++;
//				}else{
//					colTitle = columnTitle.replaceAll(" ", INFIX);
//				}
//				guizmo.structure.Text ctitle = factory.createText();
//				ctitle.setKey(colTitle + INFIX + LABEL_SUFFIX);
//				ctitle.setValue(columnTitle);
//				String sanitizedName = sanitize(colTitle + INFIX + FIELD_SUFFIX);
				guizmo.structure.TextBox tbox = factory.createTextBox();
//				tbox.setId(sanitizedName);
				//tbox.setName(colTitle + INFIX + FIELD_SUFFIX);
				guizmo.structure.Text txt = factory.createText();
				txt.setKey(columnTitle);
				txt.setValue(columnTitle);
				table.getHeaders().add(txt);
				table.getTypes().add(tbox);
			}
			for (int i=1; i<t.getRows().size(); ++i){ 
				lasser.sketch.Row r = t.getRows().get(i);
				TableRow tableRow = factory.createTableRow();
				for (String value: r.getValues()){
					guizmo.structure.Text txt = factory.createText();
					txt.setKey(value);
					txt.setValue(value);
					tableRow.getValues().add(txt);
				}
				table.getRows().add(tableRow);
			}
			newWidget = table;
		}else
			throw new RuntimeException("Widget not supported yet");
		setWidgetAttrs(w, region, newWidget);
		store.add(w, newWidget);
		return newWidget;
	}
	
	private static guizmo.structure.Text getText(lasser.sketch.TextElement element){
		String t = element.getText().replace("\r\n", "\\n");
		guizmo.structure.Text txt = factory.createText();
		txt.setKey(t);
		txt.setValue(t);
		return txt;
	}
	
	private static boolean containsContainerRegions(Region r){
		if (!r.getChildren().isEmpty()){
			// The first child is an extra region
			if (r.getWidgets().isEmpty() && r.getChildren().get(0).getWidgets().isEmpty())
				return true;
			// The first child is a base region
			else if (r.getChildren().get(0).getWidgets().get(0) instanceof Container)
				return true;
		}
		return false;
	}
	
	private static List<Widget> extractChildrenWidgets(Region r){
		List<Widget> widgets = new ArrayList<Widget>();
		for (Region child: r.getChildren()){
			for (Widget w: child.getWidgets()){
				widgets.add(w);
			}
		}
		return widgets;
	}
	
	/*
	 * 
	 */
	private static void setWidgetAttrs(lasser.sketch.Widget skwidget, Region region,
			guizmo.structure.ComposableWidget stwidget){
		String id = genId(skwidget);
		stwidget.setId(id);
		if (skwidget.getId() != null){
//			String name = skwidget.getId().replaceAll(" ", INFIX);
//			if (uniqueNames.containsKey(name)){
//				int uid = uniqueNames.get(name);
//				uniqueNames.put(name, uid+1);
//				name += uid;
//			}else{
//				uniqueNames.put(name, 1);
//			}
//			stwidget.setName(name);
			stwidget.setName(id);
		}else
			stwidget.setName(DEFAULT_NAME+INFIX+id);
		setCoordinates(stwidget, region);
	}
	
	/*
	 * Generates a unique ID for the model element
	 */
	private static String genId(Widget widget){
//		String str = "";
//		Widget w = widget;
//		while (w.eContainer() != null && !(w.eContainer() instanceof SketchRoot)){
//			Container parent = (Container)w.eContainer();
//			str = INFIX + String.valueOf(parent.getWidgets().indexOf(w)) + str;
//			w = parent;
//		}
//		str = "0" + str;
		
		String str = null;
		if (widget instanceof TextElement && ((TextElement)widget).getText() != null && !((TextElement)widget).getText().isEmpty()){
			String txt = ((TextElement)widget).getText();
			String prefix = sanitize(txt);
			str = prefix + INFIX + widget.getId();
		}else if (widget instanceof NamedElement && ((NamedElement)widget).getName() != null && !((NamedElement)widget).getName().isEmpty()){
			String name = ((NamedElement)widget).getName();
			String prefix = sanitize(name);
			str = prefix + INFIX + widget.getId(); 
		}else if (widget != null){
			String cname = widget.getClass().getSimpleName().replace("Impl", "");
			String prefix = Character.toLowerCase(cname.charAt(0)) + cname.substring(1);
			str = prefix + INFIX + widget.getId();
		}else{
			str = DEFAULT_NAME + INFIX + counter++;
		}
		
		return str;
	}
	
	
	/*
	 * Cleans bad characters for names
	 */
	private static String sanitize(String s){
		int l = Math.min(MAX_NAME_LENGTH, s.length());
		String result = s.substring(0, l);
		result = result.replaceAll(" ", "_");
		result = result.replaceAll("\\W", "");
		if (result.length() > 0){
			char firstChar = result.charAt(0);
			if (Character.isDigit(firstChar)){
				result = '_' + result;
			}
		}
		return result;
	}
	
	
	
	/*
	 * Copies the coordinates from the original element
	 */
	private static void setCoordinates(Locatable elem, Region region){
		int diffx = 0, diffy = 0;
		Region parent = region.getParent();
		if (parent != null){
			diffx = parent.getXmin();
			diffy = parent.getYmin();
		}
		elem.setXmin(region.getXmin() - diffx);
		elem.setYmin(region.getYmin() - diffy);
		elem.setXmax(region.getXmax() - diffx);
		elem.setYmax(region.getYmax() - diffy);
	}

}
