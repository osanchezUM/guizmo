package lasser.sketch2structure;


import java.util.ArrayList;
import java.util.List;

import guizmo.structure.ComposableWidget;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalView;
import guizmo.structure.Locatable;
import guizmo.structure.StructureFactory;
import guizmo.structure.StructureRoot;
import lasser.mtraces.TraceRoot;
import lasser.mtraces.utilM.TraceStore;
import lasser.regions.Region;
import lasser.sketch.Button;
import lasser.sketch.ComboBox;
import lasser.sketch.Container;
import lasser.sketch.Image;
import lasser.sketch.Label;
import lasser.sketch.Panel;
import lasser.sketch.SketchRoot;
import lasser.sketch.TextBox;
import lasser.sketch.Widget;
import lasser.sketch.WidgetGroup;
import lasser.sketch.Window;


public class CopyOfStructureTransformation {
	
	private static final String INFIX = "_";
	private static final String DEFAULT_NAME = "default";
	
	private static final StructureFactory factory = StructureFactory.eINSTANCE;
	
	/*
	 * 
	 */
	public static StructureRoot execute(SketchRoot sketchRoot, List<Region> rootRegions, TraceRoot traceRoot){
		StructureRoot strucRoot = factory.createStructureRoot();
		TraceStore store = new TraceStore(traceRoot);
		
		for (int i=0; i < sketchRoot.getWindows().size(); ++i){
			Window w = sketchRoot.getWindows().get(i);
			Region r = rootRegions.get(i);
			GraphicalView v = factory.createGraphicalView();
			v.setId(genId(w));
			if (w.getName() != null)
				v.setName(w.getName());
			else
				v.setName(DEFAULT_NAME+INFIX+genId(w));
			copyCoordinates(w, v, null);
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
				for (Widget widget: extractChildrenWidgets(r)){
					ComposableWidget newWidget = genWidget(widget, null, store);
					v.getWidgets().add(newWidget);	
				}
			}
		}
		
		return strucRoot;
	}
	
	private static GUIRegion genRegion(Region r, TraceStore store){
		GUIRegion guiRegion = factory.createGUIRegion();
		guiRegion.setId(r.getName());
		guiRegion.setName(r.getName());
		copyCoordinates(r, guiRegion);
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
			for (Widget widget: extractChildrenWidgets(r)){
				ComposableWidget newWidget = genWidget(widget, guiRegion, store);
				guiRegion.getWidgets().add(newWidget);	
			}
		}
		
		return guiRegion;
	}
	
	/*
	 * 
	 */
	private static ComposableWidget genWidget(Widget w, GUIRegion container, TraceStore store){
		ComposableWidget newWidget = null;
		if (w instanceof TextBox){
			guizmo.structure.TextBox tbox = factory.createTextBox();
			newWidget = tbox;
		}else if (w instanceof Label){
			guizmo.structure.OutputText otext = factory.createOutputText();
			guizmo.structure.Text txt = factory.createText();
			txt.setKey(((Label) w).getText());
			txt.setValue(((Label) w).getText());
			otext.setText(txt);
			newWidget = otext;
		}else if (w instanceof Button){
			guizmo.structure.Button button = factory.createButton();
			newWidget = button;
		}else if (w instanceof Image){
			guizmo.structure.ImageContainer imgContainer = factory.createImageContainer();
			guizmo.structure.Image img = factory.createImage();
			imgContainer.setImage(img);
			newWidget = imgContainer;
		}else if (w instanceof ComboBox){
			guizmo.structure.ComboBox combo = factory.createComboBox();
			guizmo.structure.Item item = factory.createItem();
			item.setName(((ComboBox) w).getText());
			combo.getItems().add(item);
			newWidget = combo;
		}else
			throw new RuntimeException("Widget not supported yet");
		setWidgetAttrs(w, newWidget, container);
		store.add(w, newWidget);
		return newWidget;
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
	private static void setWidgetAttrs(lasser.sketch.Widget skwidget, 
			guizmo.structure.ComposableWidget stwidget, guizmo.structure.GUIRegion container){
		String id = genId(skwidget);
		stwidget.setId(id);
		if (skwidget.getId() != null)
			stwidget.setName(skwidget.getId());
		else
			stwidget.setName(DEFAULT_NAME+INFIX+id);
		copyCoordinates(skwidget, stwidget, container);
	}
	
	/*
	 * Generates a unique ID for the model element
	 */
	private static String genId(Widget widget){
		String str = "";
		Widget w = widget;
		while (w.eContainer() != null && !(w.eContainer() instanceof SketchRoot)){
			Container parent = (Container)w.eContainer();
			str = INFIX + String.valueOf(parent.getWidgets().indexOf(w)) + str;
			w = parent;
		}
		str = "0" + str;
		return str;
	}
	
	/*
	 * Copies the coordinates from the original element
	 */
	private static void copyCoordinates(Widget widget, Locatable elem, GUIRegion container){
		if (container != null){
			int x = widget.getXPos() - container.getXmin();
			int y = widget.getYPos() - container.getYmin();
			elem.setXmin(x);
			elem.setYmin(y);
			elem.setXmax(x + widget.getWidth() - 1);
			elem.setYmax(y + widget.getHeight() - 1);
		}else{
			elem.setXmin(widget.getXPos());
			elem.setYmin(widget.getYPos());
			elem.setXmax(widget.getXPos() + widget.getWidth() - 1);
			elem.setYmax(widget.getYPos() + widget.getHeight() - 1);
		}
	}
	
	/*
	 * Copies the coordinates from the region
	 */
	private static void copyCoordinates(Region region, Locatable elem){
		elem.setXmin(region.getXmin());
		elem.setYmin(region.getYmin());
		elem.setXmax(region.getXmax());
		elem.setYmax(region.getYmax());
	}
}
