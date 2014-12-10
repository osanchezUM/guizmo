package guizmo.tiles2layout;

import guizmo.tiles2layout.patterns.*;
import guizmo.layout.FlowLayout;
import guizmo.layout.FlowLayoutType;
import guizmo.layout.Layout;
import guizmo.layout.LayoutFactory;

/**
 * Predefined layout types which can be used for the layout model
 */
public enum LayoutType {
	HORIZONTAL_FLOW (
			//createFlowLayout(FlowLayoutType.HORIZONTAL),
			new HorizontalFlowLayoutPattern()),
	VERTICAL_FLOW (
			//createFlowLayout(FlowLayoutType.VERTICAL),
			new VerticalFlowLayoutPattern()),
	BORDER (
			//LayoutFactory.eINSTANCE.createBorderLayout(),
			new BorderLayoutPattern()),
	GRID (
			//LayoutFactory.eINSTANCE.createGridLayout(),
			new GridLayoutPattern()),
	FORM (
			//LayoutFactory.eINSTANCE.createFormLayout(),
			new FormLayoutPattern())
	;
	
	//private final Layout layout;
	private final LayoutPattern pattern;
	
	LayoutType(LayoutPattern pattern){
		this.pattern = pattern;
	}
	
//	LayoutType(Layout layout, LayoutPattern pattern){
//		this.layout = layout;
//		this.pattern = pattern;
//	}
	
//	public Layout createLayout() {
//		return layout;
//	}

	public LayoutPattern getPattern() {
		return pattern;
	}
	
//	private static FlowLayout createFlowLayout(FlowLayoutType type){
//		FlowLayout flayout = LayoutFactory.eINSTANCE.createFlowLayout();
//		flayout.setType(type);
//		return flayout;
//	}
	
}
