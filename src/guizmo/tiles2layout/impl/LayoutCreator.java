package guizmo.tiles2layout.impl;

import guizmo.layout.AlignedColumn;
import guizmo.layout.AlignmentMark;
import guizmo.layout.BorderLayout;
import guizmo.layout.CustomLayout;
import guizmo.layout.ElementNode;
import guizmo.layout.FlowLayout;
import guizmo.layout.FlowLayoutType;
import guizmo.layout.FormLayout;
import guizmo.layout.Gap;
import guizmo.layout.GapType;
import guizmo.layout.GridLayout;
import guizmo.layout.HAlignmentType;
import guizmo.layout.Layout;
import guizmo.layout.LayoutFactory;
import guizmo.layout.Margin;
import guizmo.layout.MarginType;
import guizmo.layout.VAlignmentType;
import guizmo.structure.ComposableWidget;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalElement;
import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.Tile;
import guizmo.tiles.TileType;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.RectangleUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.LayoutType;
import guizmo.tiles2layout.graphs.LEdge;
import guizmo.tiles2layout.graphs.LGraphUtil;
import guizmo.tiles2layout.graphs.LNode;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class LayoutCreator {

	private static LayoutCreator instance = null;
	private static LayoutFactory factory = LayoutFactory.eINSTANCE;
	private static final String LAYOUT_SUFFIX = "_lyt";
	private static final String INFIX = "_";
	private static Map<Tile, List<Layout>> mappings;
	private static Map<String, Integer> nameMappings;
	private static float hAlignmentMargin;
	private static float vAlignmentMargin;
	private static float marginDiff;
	
	private static AllenIntervalType BEGIN_ALIGNED_INTERVALS[] = 
		{AllenIntervalType.EQUAL, AllenIntervalType.STARTED_BY, AllenIntervalType.STARTS};
	private static AllenIntervalType END_ALIGNED_INTERVALS[] = 
		{AllenIntervalType.EQUAL, AllenIntervalType.FINISHED_BY, AllenIntervalType.FINISHES};
	private static AllenIntervalType CENTER_ALIGNED_INTERVALS[] = 
		{AllenIntervalType.EQUAL, AllenIntervalType.DURING, AllenIntervalType.CONTAINS};
	private static AllenIntervalType BOTH_ALIGNED_INTERVALS[] = 
		{AllenIntervalType.EQUAL};
	
	private static final float MIN_SHARING_VALUE = 0.5f;
	
	/*
	 * Alignment mark
	 */
	private class Marker{
		public float avgDistance = 0;
		public ArrayList<LNode> left = new ArrayList<LNode>();
		public ArrayList<LNode> right = new ArrayList<LNode>();
		
		public int numAlignedNodes(){
			return left.size() + right.size();
		}

		@Override
		public String toString() {
			String str = "@Mark: " + avgDistance +"; ";
			str += "Left: {";
			for (LNode n: left){
				str += n.getName()+" ";
			}
			str += "}; Right: {";
			for (LNode n: right){
				str += n.getName()+" ";
			}
			str += "}";
			return str;
		}
		
	}
	
	/*
	 * Aligned column
	 */
	private class Col{
		public int xmin = 0;
		public int xmax = 0;
		public ArrayList<LNode> nodes = new ArrayList<LNode>();
		public ArrayList<LNode> left = new ArrayList<LNode>();
		public ArrayList<LNode> right = new ArrayList<LNode>();
		
		@Override
		public String toString() {
			String str = "@Col: "+xmin+", "+xmax;
			return str;
		}
	}
	
	/*
	 *  Singleton
	 */
	public static LayoutCreator instance(){
		if (instance == null)
			instance = new LayoutCreator();
		return instance;
	}
	
	public void setMappings(Map<Tile, List<Layout>> mappings){
		LayoutCreator.mappings = mappings;
	}
	
	private LayoutCreator(){
		nameMappings = new HashMap<String, Integer>();
	}
	
	/*
	 * 
	 */
	public void setAlignmentMargins(float hMargin, float vMargin, float marginDifference){
		hAlignmentMargin = hMargin;
		vAlignmentMargin = vMargin;
		marginDiff = marginDifference;
	}
	
	/*
	 * Creates a special layout to mean that the layout could not be detected
	 */
	public Layout createUnknownLayout(Tile tile){
		// We create a CustomLayout
		CustomLayout custom = factory.createCustomLayout();
		custom.setName(getUniqueName(tile.getName())+LAYOUT_SUFFIX);
		//custom.setHAlignment(HAlignmentType.NONE);
		//custom.setVAlignment(VAlignmentType.NONE);
		registerMapping(tile, custom);
		for (Tile t: tile.getSubtiles()){
			ElementNode enode = factory.createElementNode();
			enode.setName(getUniqueName(t.getName()));
			//enode.setHAlignment(HAlignmentType.NONE);
			//enode.setVAlignment(VAlignmentType.NONE);
			custom.getSublayouts().add(enode);
			registerMapping(t, enode);
		}
		
		return custom;
	}
	
	/*
	 * Creates a new layout tree of a multi-level graph
	 */
	public Layout createLayout(LNode graph){
		// Inside the original graph, there must be only one node, which is the result of
		// joining the original set of nodes
		if (graph.getNodes().size() != 1)
			throw new RuntimeException("The graph should contain just 1 node after joining all the children nodes");
		
		// Get the coordinates of the region
		Tile t = graph.getTiles().get(0);
		Rectangle parentRect = TileUtil.toRectangle(t);
		
		// Correct the attributes of the main node (which is the unique node inside the graph node)
		LNode mainNode = graph.getNodes().get(0);
		//mainNode.setXmin(graph.getXmin());
		//mainNode.setYmin(graph.getYmin());
		//mainNode.setXmax(graph.getXmax());
		//mainNode.setYmax(graph.getYmax());
		if (graph.getTiles().size() != 1)
			throw new RuntimeException("The graph "+graph.getName()+" should reference only one tile");
		mainNode.removeTiles();
		//mainNode.addTile(graph.getTiles().get(0));
		Layout layout = createLayout(mainNode, null, parentRect, null);
		//layout.setName(graph.getTile().getName()+LAYOUT_SUFFIX);
		
		
//		if (graph.getParent() != null){
//			List<Layout> parentLayouts = getMapping(graph.getParent().getTile());
//			if (parentLayouts != null){
//				for (Layout parent: parentLayouts)
//					parent.getSublayouts().add(layout);
//			}
//		}
		return layout;
	}
	
	/*
	 * Creates a new layout tree of a multi-level graph recursively
	 */
	public Layout createLayout(LNode graph, Layout parentLayout, Rectangle regionArea, Map<LNode, Layout> traces){
//		// DEBUG
//		if (graph.getName().equals("nameLabel_nameField")){
//			System.out.println("");
//		}
		
		LNode parent = graph.getParent();
		//System.out.println("> Area Node: "+nodeArea.toString()+"; Parent area: "+regionArea);
		Layout layout;
		if (graph.getNodes().isEmpty()){
			layout = factory.createElementNode();
			// We only apply this to layout nodes which are direct children of a container
//			if (graph.getParent() != null && !graph.getParent().getTiles().isEmpty()){
			if (
					graph.getTiles().size() == 1 && 
					graph.getTiles().get(0).getTileType() == TileType.ITEM &&
					isTopNode(parent)
			){
				//setAbsAlignment(layout, graph.toRectangle(), regionArea); // restore?
				setParentAlignment(layout, parentLayout, graph);
			}
			
			//
			// Set the alignment of the element with regard to the parent layout
			//
			//setParentAlignment(layout, graph);
			
			
		}else{
			switch (graph.getLayoutType()) {
			case BORDER:
				layout = factory.createBorderLayout();
				break;
			case GRID:
				layout = factory.createGridLayout();
				int numCols = getNumCols(graph);
				((GridLayout)layout).setNumCols(numCols);
				break;
			case HORIZONTAL_FLOW:
				layout = factory.createFlowLayout();
				((FlowLayout)layout).setType(FlowLayoutType.HORIZONTAL);
				break;
			case VERTICAL_FLOW:
				layout = factory.createFlowLayout();
				((FlowLayout)layout).setType(FlowLayoutType.VERTICAL);
				break;
			case FORM:
				layout = factory.createFormLayout();
				break;
			default:
				throw new RuntimeException("The layout type does not exists");
			}
			
			//
			// Layout for the children
			//
			if (traces == null)
				traces = new HashMap<LNode, Layout>();
			List<LNode> sortedNodes = LGraphUtil.sortNodes(graph.getNodes());
			for (LNode n: sortedNodes){
				Layout childLayout = createLayout(n, layout, regionArea, traces);
				traces.put(n, childLayout);	
			}
			
			//
			// Set the Form Layout specific references
			//
			if (layout instanceof FormLayout)
				setFormLayoutContent((FormLayout)layout, graph, traces);
			
			//
			// Sets the Border Layout specific references
			//
			else if (layout instanceof BorderLayout)
				setBorderLayoutReferences((BorderLayout) layout, graph, traces);
			
			
			
			//
			// Set alignment
			//
			// We only apply this to layout nodes which are direct children of a container
			// DO NOT change the order of the two conditions or it will fail because
			// the current node can be the fake node with all the elements, which is a child of
			// the window node.
//			if (layout.getSublayouts().size() > 1 && allChildrenHaveSameAbsAlignment(layout)){
//				Layout child = layout.getSublayouts().get(0);
//				layout.setAbsHAlignment(child.getAbsHAlignment());
//				layout.setAbsVAlignment(child.getAbsVAlignment());
//			}
//			else 
//			if (graph.getParent() != null && !graph.getParent().getTiles().isEmpty()){
//				//setAbsAlignment(layout, parentLayout, graph, nodeArea, regionArea);
//				//setParentAlignment(layout, parentLayout, graph);
//			}
//			if (parent != null && parent.getParent() == null && !parent.getTiles().isEmpty()
//					) {
//				//setAbsAlignment(layout, parentLayout, graph, nodeArea, regionArea);
//				//Rectangle nodeArea = getAreaBasedOnChildren(graph);
//				//setAbsAlignment(layout, nodeArea, regionArea); // restore?
//			}else if (parent == null && !graph.getTiles().isEmpty()){
//				//Rectangle nodeArea = graph.toRectangle();
//				//setAbsAlignment(layout, nodeArea, regionArea); // restore?
//				setParentAlignment(layout, parentLayout, graph);
//			}
			if (
					parent != null &&
					isTopNode(parent)
			){
				setParentAlignment(layout, parentLayout, graph);
			}
			
			//
			// Set the alignment of the content
			//
			//setContentAlignment(layout, graph);
			
			
			//
			// Set margins
			//
//			if (allChildrenHaveSameAbsAlignment(layout)){
//				setMargins(graph, layout, null, regionArea);
//				for (Layout l: layout.getSublayouts())
//					l.getMargins().clear();
//			//}else if (layout.getParentLayout() != null && !allChildrenHaveSameAbsAlignment(layout.getParentLayout())){
//			}else{
				
//			if (!(layout instanceof ElementNode) && !graph.getTiles().isEmpty() && 
//					graph.getTiles().get(0).getTileType() == TileType.COARSE){
//				setMargins(graph, layout, null, regionArea);
//			}

			
//				boolean hasLayoutChildren = hasLayoutChildren(graph);
//				boolean containsRegionNodes = containsRegionNodes(graph);
//				// Set margin for the layout containing only element nodes
//				if (!hasLayoutChildren && !containsRegionNodes){
//					// General case
//					if (graph.getNodes().size() > 1)
//						;//setMargins(graph, layout, null, regionArea);
//					// Only one widget in the region
//					else if (graph.getNodes().size() == 1)
//						;//setMargins(graph.getNodes().get(0), layout, null, regionArea);
//				}else{
//					for (LNode n: graph.getNodes()){
//						// If the node is a reference to a widget and it has layout siblings
//						// or the children are regions
//						if ((n.getLayoutType() == null && hasLayoutChildren) || containsRegionNodes){
//							//setMargins(n, traces.get(n), layout, regionArea);
//						}
//					}
//				}
////			}
			
			//
			// Set gaps
			//
			for (LEdge e: graph.getEdges()){
				LNode source = e.getSource();
				LNode target = e.getTarget();
				float percent = 0;
				GapType type = null;
				if (LGraphUtil.isHorizontal(e)){
					int d = LGraphUtil.getHDistance(source, target);
					percent = (float)d / regionArea.width;
					type = GapType.HORIZONTAL;
					
				}else{
					int d = LGraphUtil.getVDistance(source, target);
					percent = (float)d / regionArea.height;
					type = GapType.VERTICAL;
				}
				if (percent > 0){
					Gap gap = factory.createGap();
					gap.setType(type);
					gap.setValue(percent);
					gap.getLayouts().add(traces.get(source));
					gap.getLayouts().add(traces.get(target));
					layout.getGaps().add(gap);
				}
			}
			
		}
		
		//
		// Set H/V sizes
		//
		setHVSizes(graph, layout, regionArea);
		
		
		//
		// Set margins
		//
		LNode contNode = parent;
		if (	parent != null &&
				parent.getParent() != null && 
				parent.getParent().getNodes().size() == 1 &&
				!parent.getParent().getTiles().isEmpty() &&
				parent.getParent().getTiles().get(0).getTileType() == TileType.COARSE
				){
			contNode = parent.getParent();
		}
		// Case A: subcontainer inside a container. Set the margins to the subcontainer
		if (
				layout instanceof ElementNode && 
				!graph.getTiles().isEmpty() && 
				graph.getTiles().get(0).getTileType() == TileType.COARSE &&
				contNode != null &&
				!contNode.getTiles().isEmpty() && 
				contNode.getTiles().get(0).getTileType() == TileType.COARSE
				){
			setMargins(graph, layout, regionArea);
		}
		// Case B: layouts inside a container. Set the margins not to the widgets, but to the container
		else if (
//				!(layout instanceof ElementNode) &&
//				!graph.getTiles().isEmpty() && 
//				graph.getTiles().get(0).getTileType() == TileType.COARSE &&
//				!graph.getNodes().isEmpty() &&
//				!graph.getNodes().get(0).getTiles().isEmpty() &&
//				graph.getNodes().get(0).getTiles().get(0).getTileType() == TileType.ITEM
				
				!graph.isPseudo() &&
				contNode != null &&
				!contNode.getTiles().isEmpty() &&
				contNode.getTiles().get(0).getTileType() == TileType.COARSE &&
				(graph.getNodes().isEmpty() ||
					graph.getNodes().get(0).getTiles().isEmpty() ||
					graph.getNodes().get(0).getTiles().get(0).getTileType() != TileType.COARSE)
				){
			setMargins(graph, layout, regionArea);
		}
		
		
		// Set some common layout (ElementNodes included) properties
		if (parentLayout != null)
			parentLayout.getSublayouts().add(layout);
		if (graph.getTiles().size() == 1){
			Tile t = graph.getTiles().get(0);
			registerMapping(t, layout);
			layout.setName(getUniqueName(t.getName())+LAYOUT_SUFFIX);
		}else{
			layout.setName(getUniqueName(graph.getName())+LAYOUT_SUFFIX);
		}
		return layout;
	}
	
	
	/*
	 * Returns true if the tile actually represents a top tile (a container tile)
	 */
	private static boolean isTopNode(LNode node){
		if (node == null)
			return false;
		if (node.getTiles().isEmpty()){
			LNode parent = node.getParent();
			if (parent == null){
				return false;
			}
			if (parent.getTiles().isEmpty())
				return false;
			Tile t1 = parent.getTiles().get(0);
			if (parent.getTiles().size() == 1 && t1.getTileType() == TileType.COARSE)
				return true;
			else
				return false;
		}else{
			Tile t1 = node.getTiles().get(0);
			if (t1.getTileType() == TileType.COARSE)
				return true;
			else 
				return false;
		}
	}
	
	
	/*
	 * Returns true if there are children nodes referencing GUIRegions
	 */
	private static boolean containsRegionNodes(LNode node){
		if (node.getNodes().isEmpty())
			return false;
		for (LNode n: node.getNodes()){
			List<Tile> tiles = n.getTiles();
			if (tiles.size() == 1){
				Tile tile = tiles.get(0);
				GraphicalElement element = tile.getElement();
				if (!(element instanceof GUIRegion))
					return false;
			}else
				return false;
		}
		return true;
	}
	
	/*
	 * Returns the number of columns of a graph with a grid layout
	 * 
	 * Pre: the graph represents a grid layout
	 * Pre: the first node is the upper-left node of the grid
	 */
	private static int getNumCols(LNode graph){
		LNode current = graph.getNodes().get(0);
		int cols = 1;
		do{
			List<LNode> nodes = LGraphUtil.getRightNodes(current);
			if (nodes.size() == 1 && graph.getNodes().contains(nodes.get(0))){
				current = nodes.get(0);
				++cols;	
			}else
				current = null;
		}while (current != null);
		return cols;
	}
	
	/*
	 * Adds a layout to a mapping
	 */
	private static void registerMapping(Tile tile, Layout layout){
		List<Layout> list;
		if (mappings.containsKey(tile))
			list = mappings.get(tile);
		else{
			list = new ArrayList<Layout>();
			mappings.put(tile, list);
		}
		list.add(layout);
	}
	
	/*
	 * Returns true if at least it has one child that is a reference to a widget (not all the children are layouts)
	 */
	private static boolean hasLayoutChildren(LNode node){
		for (LNode n: node.getNodes()){
			if (n.getLayoutType() != null)
				return true;
		}
		return false;
	}
	
	/*
	 * 
	 */
	private static boolean allChildrenHaveSameAbsAlignment(Layout layout){
		if (layout.getSublayouts().size() > 1){
			HAlignmentType h = layout.getSublayouts().get(0).getAbsHAlignment();
			VAlignmentType v = layout.getSublayouts().get(0).getAbsVAlignment();
			if (h == HAlignmentType.NONE && v == VAlignmentType.NONE)
				return false;
			for (int i=1; i<layout.getSublayouts().size(); ++i){
				Layout l = layout.getSublayouts().get(i);
				if (l.getAbsHAlignment() != h)
					return false;
				if (l.getAbsVAlignment() != v)
					return false;
			}
			return true;
		}
		return false;
	}
	
	/*
	 * Gets the area occuppied by a node representing a part of the UI
	 */
	private static Rectangle getAreaBasedOnChildren(LNode node){
		// Get the widgets
		ArrayList<ComposableWidget> list = new ArrayList<ComposableWidget>();
		getAllWidgets(node, list);
		
		// Get the maximum area
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		for (ComposableWidget w: list){
			xmin = Math.min(xmin, w.getXmin());
			ymin = Math.min(ymin, w.getYmin());
			xmax = Math.max(xmax, w.getXmax());
			ymax = Math.max(ymax, w.getYmax());
		}
		Rectangle r = new Rectangle(xmin, ymin, xmax - xmin + 1, ymax - ymin + 1);
		return r;
	}
	
	
	/*
	 * Gets all the widgets for the given node recursively
	 * The result is stored in the result array (must have been initialised before)
	 */
	private static void getAllWidgets(LNode node, List<ComposableWidget> result){
		if (node.getNodes().isEmpty()){
			Tile t = node.getTiles().get(0);
			if (t.getElement() instanceof ComposableWidget)
				result.add((ComposableWidget)t.getElement());
		}else{
			for (LNode n: node.getNodes())
				getAllWidgets(n, result);
		}
	}
	
	/*
	 * Sets the horizontal and vertical alignment for the layout, regarding the container region
	 */
	//private static void setAbsAlignment(Layout layout, Layout parentLayout, LNode node, Rectangle thisArea, Rectangle container){
	private static void setAbsAlignment(Layout layout, Rectangle thisArea, Rectangle container){
		
		// Horizontal alignment
		//if (layout instanceof FormLayout || ( parentLayout instanceof FlowLayout && 
		//		((FlowLayout)parentLayout).getType() == FlowLayoutType.VERTICAL) ){
		if (layout instanceof ElementNode || layout instanceof FormLayout || layout instanceof FlowLayout ){
		//if (parentLayout instanceof FormLayout || parentLayout instanceof FlowLayout ){
			
			guizmo.tiles.HAlignmentType htype = RectangleUtil.getAbsHAlignment(
					thisArea, container, hAlignmentMargin, marginDiff);
			layout.setAbsHAlignment(convertHType(htype));
			
//			int hMargin = Math.round(container.width * hAlignmentMargin);
//			boolean left = 	thisArea.getMinX() <= hMargin;
//			boolean right = thisArea.getMaxX() >= container.width - hMargin;
//			int containerCenter = (int)Math.round(container.width / 2);
//			int thisCenter = (int)Math.round((thisArea.getMaxX() + thisArea.getMinX()) / 2);
//			boolean center = Math.abs(containerCenter - thisCenter)/(float)container.width <= hAlignmentMargin/2;
//			if (left)
//				if (right)
//					layout.setAbsHAlignment(HAlignmentType.BOTH);
//				else
//					layout.setAbsHAlignment(HAlignmentType.LEFT);
//			else if (right)
//				layout.setAbsHAlignment(HAlignmentType.RIGHT);
//			else if (center)
//				layout.setAbsHAlignment(HAlignmentType.CENTER);
//			else
//				layout.setAbsHAlignment(HAlignmentType.NONE);
		}
		
		// Vertical alignment
		//if (layout instanceof FormLayout || (parentLayout instanceof FlowLayout && 
		//		((FlowLayout)parentLayout).getType() == FlowLayoutType.HORIZONTAL)){
		if (layout instanceof ElementNode || layout instanceof FormLayout || layout instanceof FlowLayout){
		//if (parentLayout instanceof FormLayout || parentLayout instanceof FlowLayout){
			
			guizmo.tiles.VAlignmentType vtype = RectangleUtil.getAbsVAlignment(
					thisArea, container, vAlignmentMargin, marginDiff);
			layout.setAbsVAlignment(convertVType(vtype));
			
//			int vMargin = Math.round(container.height * vAlignmentMargin);
//			boolean top = thisArea.getMinY() <= vMargin;
//			boolean bottom = thisArea.getMaxY() >= container.height - vMargin;
//			int containerMiddle = (int)Math.round(container.height / 2);
//			int thisMiddle = (int)Math.round((thisArea.getMaxY() + thisArea.getMinY()) / 2);
//			boolean middle = Math.abs(containerMiddle - thisMiddle)/(float)container.height <= vAlignmentMargin/2;
//			
////			boolean top = 	container.getMinY() <= thisArea.getMinY() && 
////					container.getMinY() + vMargin >= thisArea.getMinY();
////			boolean bottom = container.getMaxY() >= thisArea.getMaxY() &&
////					container.getMaxY() - vMargin <= thisArea.getMaxY();
////			int containerMiddle = (int)Math.round(container.height / 2);
////			int thisMiddle = (int)Math.round((thisArea.getMaxY() + thisArea.getMinY()) / 2);
////			boolean middle = Math.abs(containerMiddle - thisMiddle)/(float)container.height <= vAlignmentMargin/2;
//			if (top)
//				if (bottom)
//					layout.setAbsVAlignment(VAlignmentType.BOTH);
//				else
//					layout.setAbsVAlignment(VAlignmentType.TOP);
//			else if (bottom)
//				layout.setAbsVAlignment(VAlignmentType.BOTTOM);
//			else if (middle)
//				layout.setAbsVAlignment(VAlignmentType.MIDDLE);
//			else
//				layout.setAbsVAlignment(VAlignmentType.NONE);
		}
		
//		// Border layout alignment
//		if (parentLayout instanceof BorderLayout){
//			switch (node.getHalignment()){
//				case LEFT:
//					layout.setAbsHAlignment(guizmo.layout.HAlignmentType.LEFT);
//					break;
//				case RIGHT:
//					layout.setAbsHAlignment(guizmo.layout.HAlignmentType.RIGHT);
//					break;
//				case CENTER:
//					layout.setAbsHAlignment(guizmo.layout.HAlignmentType.CENTER);
//					break;
//			}
//			switch (node.getValignment()){
//				case TOP:
//					layout.setAbsVAlignment(guizmo.layout.VAlignmentType.TOP);
//					break;
//				case BOTTOM:
//					layout.setAbsVAlignment(guizmo.layout.VAlignmentType.BOTTOM);
//					break;
//				case MIDDLE:
//					layout.setAbsVAlignment(guizmo.layout.VAlignmentType.MIDDLE);
//					break;
//			}	
//		}
	} // end_method
	
	/*
	 * Sets the horizontal and vertical alignment for the layout, regarding the window
	 */
	private static void setContentAlignment(Layout layout, LNode node){
		List<AllenIntervalType> xtypes = new ArrayList<AllenIntervalType>();
		List<AllenIntervalType> ytypes = new ArrayList<AllenIntervalType>();
		for (LEdge e: node.getEdges()){
			if (!LGraphUtil.isHorizontal(e) && !xtypes.contains(e.getXInterval()))
				xtypes.add(e.getXInterval());
			else if (LGraphUtil.isHorizontal(e) && !ytypes.contains(e.getYInterval()))
				ytypes.add(e.getYInterval());
		}
		if (xtypes.isEmpty()){
			layout.setContentHAlignment(HAlignmentType.NONE);
		}else if (containsExclusively(xtypes, BOTH_ALIGNED_INTERVALS)){
			layout.setContentHAlignment(HAlignmentType.BOTH);
		}else if (containsExclusively(xtypes, BEGIN_ALIGNED_INTERVALS)){
			layout.setContentHAlignment(HAlignmentType.LEFT);
		}else if (containsExclusively(xtypes, END_ALIGNED_INTERVALS)){
			layout.setContentHAlignment(HAlignmentType.RIGHT);
		}else if (containsExclusively(xtypes, CENTER_ALIGNED_INTERVALS)){
				layout.setContentHAlignment(HAlignmentType.CENTER);
		}
		
		if (ytypes.isEmpty()){
			layout.setContentVAlignment(VAlignmentType.NONE);
		}else if (containsExclusively(ytypes, BOTH_ALIGNED_INTERVALS)){
			layout.setContentVAlignment(VAlignmentType.BOTH);
		}else if (containsExclusively(ytypes, BEGIN_ALIGNED_INTERVALS)){
			layout.setContentVAlignment(VAlignmentType.TOP);
		}else if (containsExclusively(ytypes, END_ALIGNED_INTERVALS)){
			layout.setContentVAlignment(VAlignmentType.BOTTOM);
		}else if (containsExclusively(ytypes, CENTER_ALIGNED_INTERVALS)){
				layout.setContentVAlignment(VAlignmentType.MIDDLE);
		}
	}
	
	
	/*
	 * NOTE: We assume that everything is either aligned or centered 
	 */
	private static void setParentAlignment(Layout layout, Layout parentLayout, LNode node){
//		// DEBUG
//		if (node.getName().equals("ok")){
//			System.out.println("");
//		}
		Rectangle parentArea = getAreaBasedOnChildren(node.getParent());
		Rectangle nodeArea = getAreaBasedOnChildren(node);
		if (	parentLayout instanceof FormLayout ||
				(parentLayout instanceof FlowLayout && 
						((FlowLayout)parentLayout).getType() == FlowLayoutType.VERTICAL)){
			guizmo.tiles.HAlignmentType htype = 
				RectangleUtil.getAbsHAlignment(nodeArea, parentArea, hAlignmentMargin, marginDiff);
			layout.setParentHAlignment(convertHType(htype));
		
		}else if (parentLayout instanceof FlowLayout && 
				((FlowLayout)parentLayout).getType() == FlowLayoutType.HORIZONTAL){
			guizmo.tiles.VAlignmentType vtype = 
					RectangleUtil.getAbsVAlignment(nodeArea, parentArea, vAlignmentMargin, marginDiff);
			layout.setParentVAlignment(convertVType(vtype));
		}
	}
	
	/*
	 * 
	 */
	private static boolean containsExclusively(List<AllenIntervalType> list, AllenIntervalType allowedTypes[]){
		for (AllenIntervalType int1: list){
			boolean contained = false;
			for (AllenIntervalType int2: allowedTypes){
				if (int1 == int2){
					contained = true;
					break;
				}
			}
			if (!contained) return false;
		}
		return true;
	}
	
	/*
	 * There is no sense in defining margin when the parent layout indicates that the children
	 * are aligned in some way. For instance, we will not define the bottom margin if the
	 * parent layout has the content alignment set to TOP.
	 */
	private static void setMargins(LNode n, Layout layout, Rectangle regionArea){
		// For the time being, this cannot be used because the ElementNodes do not contain the abs alignment
		//HAlignmentType lh = layout.getAbsHAlignment();
		//VAlignmentType lv = layout.getAbsVAlignment();
		
		if (LGraphUtil.getLeftNodes(n).isEmpty() 
				//&& (lh == HAlignmentType.CENTER || lh == HAlignmentType.LEFT || 
				//	lh == HAlignmentType.BOTH || lh == HAlignmentType.NONE)
				){
			int d = 0;
			if (n.getXmin() > 0)
				d = n.getXmin() - 1;
			float percent = (float)d / regionArea.width;
			if (d > 0){
				Margin margin = factory.createMargin();
				margin.setType(MarginType.LEFT);
				margin.setValue(percent);
				layout.getMargins().add(margin);
			}
		}
		if (LGraphUtil.getRightNodes(n).isEmpty() 
				//&& (lh == HAlignmentType.CENTER || lh == HAlignmentType.RIGHT || 
				//	lh == HAlignmentType.BOTH || lh == HAlignmentType.NONE)
				){
			int d = 0;
			if (n.getXmax() < regionArea.width - 1)
				d = regionArea.width - 1 - n.getXmax();
			float percent = (float)d / regionArea.width;
			if (d > 0){
				Margin margin = factory.createMargin();
				margin.setType(MarginType.RIGHT);
				margin.setValue(percent);
				layout.getMargins().add(margin);
			}
		}
		if (LGraphUtil.getUpNodes(n).isEmpty() 
				//&& (lv == VAlignmentType.TOP || lv == VAlignmentType.MIDDLE || 
				//	lv == VAlignmentType.BOTH || lv == VAlignmentType.NONE)
				){
			int d = 0;
			if (n.getYmin() > 0)
				d = n.getYmin() - 1;
			float percent = (float)d / regionArea.height;
			if (d > 0){
				Margin margin = factory.createMargin();
				margin.setType(MarginType.TOP);
				margin.setValue(percent);
				layout.getMargins().add(margin);
			}
		}
		if (LGraphUtil.getDownNodes(n).isEmpty()  
				//&& (lv == VAlignmentType.BOTTOM || lv == VAlignmentType.MIDDLE || 
				//	lv == VAlignmentType.BOTH || lv == VAlignmentType.NONE)
				){
			int d = 0;
			if (n.getYmax() < regionArea.height - 1)
				d = regionArea.height - 1 - n.getYmax();
			float percent = (float)d / regionArea.height;
			if (d > 0){
				Margin margin = factory.createMargin();
				margin.setType(MarginType.BOTTOM);
				margin.setValue(percent);
				layout.getMargins().add(margin);
			}
		}
	}
	
	
	/*
	 * 
	 */
	private static void setHVSizes(LNode n, Layout layout, Rectangle regionArea){
		float h = (n.getXmax() - n.getXmin() + 1) / (float)regionArea.width;
		float v = (n.getYmax() - n.getYmin() + 1) / (float)regionArea.height;
		layout.setHSize(h);
		layout.setVSize(v);
	}
	
	
	/*
	 * 
	 */
	private static void setFormLayoutContent(FormLayout layout, LNode node, Map<LNode, Layout> traces){	
		
		// Get the horizontal flow layouts
		for (LNode n: node.getNodes()){
			Layout tracedNode = traces.get(n);
			if (tracedNode == null){
				throw new RuntimeException("Trace not found for "+n.getName());
			}
			layout.getSublayouts().add(tracedNode);
			layout.setNumNodesLongestLine(Math.max(layout.getNumNodesLongestLine(), n.getNodes().size()));
		}
		
		// Create alignment markers
		LNode container = node;
		while (container.getParent() != null)
			container = container.getParent();
		ArrayList<LNode> nodes = new ArrayList<LNode>();
		for (LNode n: node.getNodes())
			nodes.addAll(n.getNodes());
		// Work out markers
		List<Marker> markers = groupNodesByAlignment(nodes);
		
		if (!markers.isEmpty()){
			
			List<Marker> sortedMarkers = markers;
//			// Sort markers
//			ArrayList<Marker> sortedMarkers = new ArrayList<Marker>(markers.size());
//			for (Marker m: markers){
//				boolean inserted = false;
//				int j=0;
//				while (j<sortedMarkers.size() && !inserted){
//					if (sortedMarkers.get(j).avgDistance >= m.avgDistance){
//						sortedMarkers.add(j, m);
//						inserted = true;
//					}
//					++j;
//				}
//				if (!inserted)
//					sortedMarkers.add(m);
//			}
			

			// Create alignment marks
			for (Marker m: sortedMarkers){
				AlignmentMark mark = factory.createAlignmentMark();
				for (LNode n: m.left)
					mark.getLnodes().add(traces.get(n));
				for (LNode n: m.right)
					mark.getRnodes().add(traces.get(n));
				float lgap = m.avgDistance / (float)(container.getXmax() - container.getXmin() + 1);
				mark.setLgap(lgap);
				layout.getMarks().add(mark);
			}

			// Create columns
			List<Col> columns = getColumns(nodes, sortedMarkers);
			for (Col col: columns){
				AlignedColumn acol = factory.createAlignedColumn();
				acol.setLgap(col.xmin);
				acol.setRgap(col.xmax);
//				for (LNode n: col.nodes){
//					ElementNode enode = (ElementNode)traces.get(n);
//					acol.getNodes().add(enode);
//				}
				for (LNode n: nodes){
					if (	(n.getXmin() <= col.xmin && n.getXmax() >= col.xmax) ||
							(n.getXmin() >= col.xmin && n.getXmax() <= col.xmax) ||
							(col.nodes.contains(n))){
						ElementNode enode = (ElementNode)traces.get(n);
						acol.getNodes().add(enode);
					}
				}
				for (LNode n: col.left){
					ElementNode enode = (ElementNode)traces.get(n);
					acol.getLeftNodes().add(enode);
				}
				for (LNode n: col.right){
					ElementNode enode = (ElementNode)traces.get(n);
					acol.getRightNodes().add(enode);
				}
				layout.getColumns().add(acol);
			} // end_for
		}
	}
	
	/*
	 * Returns the groups of vertically aligned nodes
	 * nodes is the input list of nodes
	 * result is the resultant groups. There is an alignment marker for each group
	 * leftAligned is used to know which of the nodes are aligned with regard to the left bound
	 * rightAligned is used to know which of the nodes are aligned with regard to the right bound
	 */
	private static List<Marker> groupNodesByAlignment(List<LNode> nodes){
		ArrayList<Marker> markers = new ArrayList<Marker>();
		int margin = AllenUtil.getMargin();
		
		// Sort horizontal positions
		int xpos[] = getOrderedHPositions(nodes);
		
		// Get position groups
		// key: xposition, value: group id
		HashMap<Integer,Integer> groups = new HashMap<Integer,Integer>();
		int i=0, groupId=0;
		groups.put(xpos[i], groupId);
		while (i+1 < xpos.length){
			int d = xpos[i+1] - xpos[i];
			if (d > margin)
				++groupId;
			groups.put(xpos[i+1], groupId);
			++i;
		}
		
		// Create a list of empty markers
		for (i=0; i <= groupId; ++i){
			Marker m = instance.new Marker();
			markers.add(m);
		}
		
		// Fill the marker properties
		for (LNode n: nodes){
			int lgroup = groups.get(n.getXmin());
			Marker lm = markers.get(lgroup);
			lm.left.add(n);
			lm.avgDistance = recalculateMean(lm.avgDistance, n.getXmin(), lm.numAlignedNodes()); 
			int rgroup = groups.get(n.getXmax());
			Marker rm = markers.get(rgroup);
			rm.right.add(n);
			rm.avgDistance = recalculateMean(rm.avgDistance, n.getXmax(), rm.numAlignedNodes());
		}
		
//		HashMap<LNode, Marker> lnodes = new HashMap<LNode, Marker>();
//		HashMap<LNode, Marker> rnodes = new HashMap<LNode, Marker>();
//		int margin = AllenUtil.getMargin();
//		// Iterate over the nodes
//		for (LNode node: nodes){
//			boolean fitsLGroup = false, fitsRGroup = false;
//			int xmin = node.getXmin();
//			int xmax = node.getXmax();
//			// Iterate over the already defined markers
//			Iterator<Marker> iter = markers.iterator();
//			while (iter.hasNext()){
//				Marker conflict[] = new Marker[2];
//				Marker m = iter.next();
//				// The node fits a group, so we add the node to the group
//				if (xmin - margin <= m.avgDistance && xmin + margin >= m.avgDistance){
//					if (lnodes.containsKey(node)){
//						conflict[0] = lnodes.get(node);
//						conflict[1] = m;
//					}
//					m.left.add(node);
//					lnodes.put(node, m);
//					fitsLGroup = true;
//				}else if (xmax - margin <= m.avgDistance && xmax + margin >= m.avgDistance){
//					if (rnodes.containsKey(node)){
//						conflict[0] = rnodes.get(node);
//						conflict[1] = m;
//					}
//					m.right.add(node);
//					rnodes.put(node, m);
//					fitsRGroup = true;
//				}
//				// Recalculate the mean for the group
//				if (fitsLGroup || fitsRGroup){
//					float sum = 0;
//					for (LNode n: m.left){
//						sum += n.getXmin();
//					}
//					for (LNode n: m.right){
//						sum += n.getXmax();
//					}
//					m.avgDistance = sum / m.numAlignedNodes();
//				}
//				
//				// It must be checked that if one node (left/right) is part of different marks, 
//				// so the marks have to be joined (the data of the second marker is added to the first one,
//				// and then the second marker is removed)
//				if (conflict[0] != null && conflict[1] != null){
//					conflict[0].avgDistance = (conflict[0].avgDistance + conflict[1].avgDistance) / 2f;
//					for (LNode n: conflict[1].left){
//						if (!conflict[0].left.contains(n))
//							conflict[0].left.add(n);
//					}
//					for (LNode n: conflict[1].right){
//						if (!conflict[0].right.contains(n))
//							conflict[0].right.add(n);
//					}
//					iter.remove();
//				}
//				
//			}
//			// The node does not fit a left or right group, so we create a new marker
//			// for the left or right border respectively
//			if (!fitsLGroup){
//				Marker m = instance.new Marker();
//				m.left.add(node);
//				m.avgDistance = node.getXmin();
//				markers.add(m);
//				lnodes.put(node, m);
//			}
//			if (!fitsRGroup){
//				Marker m = instance.new Marker();
//				m.right.add(node);
//				m.avgDistance = node.getXmax();
//				markers.add(m);
//				rnodes.put(node, m);
//			}
//		}
		
		// We return the groups with more than 1 node, otherwise there is no alignment mark
		// We also remove a marker that only has two widgets that are contiguous in the same row
		Iterator<Marker> iter = markers.iterator();
		while (iter.hasNext()){
			Marker m = iter.next();
			if (m.numAlignedNodes() <= 1){
				iter.remove();
			}else if (
					m.numAlignedNodes() == 2 &&
					m.left.size() == 1 &&
					m.right.size() == 1 &&
					LGraphUtil.getRightNodes(m.right.get(0)).contains(m.left.get(0))
					){
				iter.remove();
			}
		}
		
		
		return markers;
	}
	
	/*
	 * meanN = meanN-1 + ( xN - meanN-1 ) / N
	 */
	private static float recalculateMean(float oldMean, int newValue, int numberOfElements){
		float newMean = oldMean + (newValue - oldMean) / numberOfElements;
		return newMean;
	}
	
	private static int[] getOrderedHPositions(List<LNode> nodes){
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (LNode n: nodes){
			set.add(n.getXmin());
			set.add(n.getXmax());
		}
		int result[] = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		int i=0;
		while (iter.hasNext()){
			result[i++] = iter.next();
		}
		return result;
	}
	
	
	/*
	 * Creates the columns based on the alignment marks
	 * 
	 * Pre: the markers have been previously sorted
	 */
	private static List<Col> getColumns(List<LNode> nodes, List<Marker> markers){
		ArrayList<Col> columns = new ArrayList<Col>();
		if (markers.size() > 0){
			int i;
			
			// First column
			Marker firstMarker = markers.get(0);
			Col firstCol = instance.new Col();
			firstCol.xmin = 0;
			firstCol.xmax = Math.round(firstMarker.avgDistance);
			if (setColumnNodes(firstCol, nodes, null, firstMarker))
				columns.add(firstCol);
			
			// Intermediate columns
			for (i=0; i<markers.size()-1; ++i){
				Marker m1 = markers.get(i);
				Marker m2 = markers.get(i+1);
				Col col = instance.new Col();
				col.xmin = Math.round(m1.avgDistance);
				col.xmax = Math.round(m2.avgDistance);
				if (setColumnNodes(col, nodes, m1, m2))
					columns.add(col);
			}
			
			// Last column
			Marker lastMarker = markers.get(i);
			Col lastCol = instance.new Col();
			lastCol.xmin = Math.round(lastMarker.avgDistance);
			lastCol.xmax = Integer.MAX_VALUE;
			if (setColumnNodes(lastCol, nodes, lastMarker, null))
				columns.add(lastCol);
		}
		return columns;
	}
	
	/*
	 * Returns true is the column has nodes. 
	 */
	private static boolean setColumnNodes(Col column, List<LNode> nodes, Marker marker1, Marker marker2){
		for (LNode n: nodes){
			boolean alreadyAdded = false;
			if (marker1 != null && marker1.left.contains(n)){
				column.left.add(n);
				column.nodes.add(n);
				alreadyAdded = true;
			}
			if (marker2 != null && marker2.right.contains(n)){
				column.right.add(n);
				if (!alreadyAdded){
					column.nodes.add(n);
					alreadyAdded = true;
				}
			}
			// There is some vertical sharing, so we check that this value is big enough
			// for the elements to be in the same column
			if (	!alreadyAdded &&
					(
						(n.getXmin() <= column.xmin && n.getXmax() >= column.xmin)	||
						(n.getXmin() <= column.xmax && n.getXmax() >= column.xmax)	||
						(column.xmin <= n.getXmin() && column.xmax >= n.getXmax() )
					)
				){
				int nodeWidth = n.getXmax() - n.getXmin() + 1;
				int pmin = Math.max(n.getXmin(), column.xmin);
				int pmax = Math.min(n.getXmax(), column.xmax);
				int diff = Math.abs(pmax - pmin + 1);
				float vSharing = (float)diff / nodeWidth;
				if (vSharing >= MIN_SHARING_VALUE){	
					column.nodes.add(n);
				}
			}
			
		}
		if (column.nodes.isEmpty()){
			return false;
		}else{
			// Correct the maximum of the last column
			if (column.xmax == Integer.MAX_VALUE){
				int max = -1;
				for (LNode n: column.nodes){
					max = Math.max(max, n.getXmax());
				}
				column.xmax = max;
			}
			return true;
		}
	}
	
	
	private static guizmo.layout.HAlignmentType convertHType(guizmo.tiles.HAlignmentType type){
		return guizmo.layout.HAlignmentType.getByName(type.getName());
	}
	
	private static guizmo.layout.VAlignmentType convertVType(guizmo.tiles.VAlignmentType type){
		return guizmo.layout.VAlignmentType.getByName(type.getName());
	}
	
	/*
	 * Sets the Border Layout references to the pre-defined areas
	 */
	private static void setBorderLayoutReferences(BorderLayout layout, LNode node, Map<LNode, Layout> traces){	
		for (LNode n: node.getNodes()){
			List<LNode> up = LGraphUtil.getUpNodes(n);
			List<LNode> down = LGraphUtil.getDownNodes(n);
			List<LNode> left = LGraphUtil.getLeftNodes(n);
			List<LNode> right = LGraphUtil.getRightNodes(n);
			Layout l = traces.get(n);
			if (up.isEmpty() && left.isEmpty() && right.isEmpty()){
				layout.setTop(l);
			}else if (down.isEmpty() && left.isEmpty() && right.isEmpty()){
				layout.setBottom(l);
			}else if (!left.isEmpty() && !right.isEmpty()){
				layout.setCenter(l);
			}else if (!left.isEmpty() && right.isEmpty()){
				layout.setRight(l);
			}else if (left.isEmpty() && !right.isEmpty()){
				layout.setLeft(l);
			}
		}
	}
	
	/*
	 * 
	 */
	private static String getUniqueName(String name){
		String uname = null;
		if (nameMappings.containsKey(name)){
			int num = nameMappings.get(name);
			uname = name + "_" + num;
			nameMappings.put(name, ++num);
			
		}else{
			uname = name;
			nameMappings.put(name, 1);
		}
		return uname;
	}

	
}
