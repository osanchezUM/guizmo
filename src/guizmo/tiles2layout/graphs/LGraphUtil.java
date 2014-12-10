package guizmo.tiles2layout.graphs;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import guizmo.structure.ComposableWidget;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalView;
import guizmo.tiles.*;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;

public class LGraphUtil {
	
	/**
	 * Possible labels (attributes) of the edge of a graph
	 */
	public enum EdgeAttrType{
		X_INTERVAL,
		Y_INTERVAL,
		CLOSENESS,
		JOINED
	}
	
	/** The minimum difference between the horizontal or vertical margins for a node to 
	 * be considered as aligned just to one edge 
	 * For example, if the left margin is 0.11 and the right margin is 0.13, so the difference is so little
	 * that they must the node must be centered or non-aligned, but not left aligned */
	public static final float MIN_MARGIN_DIFFERENCE = 0.07f;
	
	/**
	 * Opposite attribute
	 */
	public static final Map<EdgeAttrType, EdgeAttrType> OPPOSITE_ATR_MAP = 
			new HashMap<EdgeAttrType, EdgeAttrType>(){
		{
			put(EdgeAttrType.X_INTERVAL, EdgeAttrType.Y_INTERVAL);
			put(EdgeAttrType.Y_INTERVAL, EdgeAttrType.X_INTERVAL);
		}
	};

	public static final String INFIX = "_";

	
	/*
	 * Copies the graph represented by the sub-tiles (nodes) and sub-relations(edges) of the given tile(graph)
	 * It just copies the direct descendants of the parameter tile
	 * Not all the attributes are copied, just the relevant ones for the inference
	 * this is, the name of the nodes (tiles) and all the attributes of the edges (relations)
	 * 
	 * The references to the original nodes are kept in the nodes
	 */
	public static LNode copyGraph(Tile tile){
		
		// Mapping originalTile -> copyTile
		Map<Tile, LNode> revMap = new HashMap<Tile, LNode>();
		
		LNode graph = new LNode();
		setAttributes(graph, tile);
		for (Tile t: tile.getSubtiles()){
			LNode node = new LNode();
			setAttributes(node, t);
			node.setParent(graph);
			graph.addNode(node);
			revMap.put(t, node);
		}
		for (Relation r: tile.getRelations()){
			LEdge rel = new LEdge();
			rel.setName(r.getName());
			rel.setJoined(r.isJoined());
			rel.setXInterval(r.getXInterval());
			rel.setYInterval(r.getYInterval());
			rel.setCloseness(r.getCloseness());
			rel.setSource(revMap.get(r.getSource()));
			rel.setTarget(revMap.get(r.getTarget()));
			graph.addEdge(rel);
		}
		return graph;
	}
	
	//
	public static void setAttributes(LNode node, Tile t){
		node.setName(t.getName());
		node.setHalignment(t.getHorizontalAlignment());
		node.setValignment(t.getVerticalAlignment());
		node.setXmin(Math.min(node.getXmin(), t.getXMinPos()));
		node.setYmin(Math.min(node.getYmin(), t.getYMinPos()));
		node.setXmax(Math.max(node.getXmax(), t.getXMaxPos()));
		node.setYmax(Math.max(node.getYmax(), t.getYMaxPos()));
		node.addTile(t);
	}
	
	/*
	 * For a graph G=(V,E) represented by the tiles and relations that are children of the given parameter,
	 * the order or a graph is |V|, i.e., the number of nodes of the graph 
	 * (the number of sub-tiles of the parameter)
	 */
	public static int graphOrder(LNode graph){
		return graph.getNodes().size();
	}
	
	/*
	 * Creates an edge to connect a pair of nodes
	 * WARNING: The closeness level is not set
	 */
	public static LEdge createEdge(LNode n1, LNode n2){
		LEdge newEdge = new LEdge();
		newEdge.setName(n1.getName() + INFIX + n2.getName());
		Rectangle r1 = n1.toRectangle();
		Rectangle r2 = n2.toRectangle();
		newEdge.setXInterval(AllenUtil.getXIntervalType(r1, r2));
		newEdge.setYInterval(AllenUtil.getYIntervalType(r1, r2));
		newEdge.setSource(n1);
		newEdge.setTarget(n2);
		return newEdge;
	}
	
//	/**
//	 * Returns all the edges that have the attribute with the given value
//	 * 
//	 * @param edges The list of edges
//	 * @param attr The attribute that limits the query
//	 * @param value The value of the attribute that limits the query
//	 * @return All the edges form the list fulfilling the requirements or an empty list
//	 */
//	public static List<LEdge> selectEdges(List<LEdge> edges, EdgeAttrType attr, Object value){
//		Object values[] = {value};
//		return selectEdges(edges, attr, values);
//	}
	
	/**
	 * Returns all the edges that have the attribute with a value contained in the array
	 * 
	 * @param edges The list of edges
	 * @param attr The attribute that limits the query
	 * @param values The values of the attribute that limit the query
	 * @return All the edges that do not fulfill the requirements or an empty list
	 */
	public static List<LEdge> selectEdges(List<LEdge> edges, EdgeAttrType attr, Object values[]){
		ArrayList<LEdge> result = new ArrayList<LEdge>();
		for (LEdge r: edges){
			for (Object v: values){
				if (attr == EdgeAttrType.X_INTERVAL){
					if (r.getXInterval() == (AllenIntervalType)v){
						result.add(r);
						break;
					}
				}else if (attr == EdgeAttrType.Y_INTERVAL){
					if (r.getYInterval() == (AllenIntervalType)v){
						result.add(r);
						break;
					}
				}else if (attr == EdgeAttrType.CLOSENESS){
					if (r.getCloseness() == (ClosenessType)v){
						result.add(r);
						break;
					}
				}else{
					throw new RuntimeException(
							attr.toString()+" is not a valid attribute");
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns all the edges that do not have the attribute with a value contained in the array
	 * 
	 * @param edges The list of edges
	 * @param attr The attribute that limits the query
	 * @param values The values of the attribute that limit the query
	 * @return All the edges that do not fulfill the requirements or an empty list
	 */
	public static List<LEdge> rejectEdges(List<LEdge> edges, EdgeAttrType attr, Object values[]){
		ArrayList<LEdge> result = new ArrayList<LEdge>();
		for (LEdge r: edges){
			boolean fail = true;
			for (Object v: values){
				if (attr == EdgeAttrType.X_INTERVAL){
					if (r.getXInterval() == (AllenIntervalType)v){
						fail = false;
						break;
					}
				}else if (attr == EdgeAttrType.Y_INTERVAL){
					if (r.getYInterval() == (AllenIntervalType)v){
						fail = false;
						break;
					}
				}else if (attr == EdgeAttrType.CLOSENESS){
					if (r.getCloseness() == (ClosenessType)v){
						fail = false;
						break;
					}
				}else{
					throw new RuntimeException(
							attr.toString()+" is not a valid attribute");
				}
			}
			if (fail)
				result.add(r);
		}
		return result;
	}
	
	
	/*
	 * Copies a list of edges (shallow clone)
	 */
	public static List<LEdge> copyList(List<LEdge> list){
		List<LEdge> result = new ArrayList<LEdge>();
		for (LEdge e: list)
			result.add(e);
		return result;
	}
	
	/**
	 * Returns true if there is an edge that connect both nodes (the order of the parameters matters)
	 * @param node1 The source node
	 * @param node2 The target node
	 * @return True if node1 -e-> node2
	 */
	public static boolean areConnected(LNode srcNode, LNode trgNode){
		Iterator<LEdge> iter = srcNode.getOutgoing().iterator();
		while (iter.hasNext()){
			LEdge e = iter.next();
			if (e.getTarget() == trgNode)
				return true;
		}
		return false;
	}
	
//	/**
//	 * Returns true if there is an edge that connect both nodes (the order of the parameters matters)
//	 * and they are close
//	 * @param node1 The source node
//	 * @param node2 The target node
//	 * @return True if node1 -e-> node2
//	 */
//	public static boolean areClose(LNode srcNode, LNode trgNode){
//		List<ClosenessType> closeLevels = Arrays.asList(TileUtil.CLOSE_LEVELS);
//		Iterator<LEdge> iter = srcNode.getOutgoing().iterator();
//		while (iter.hasNext()){
//			LEdge e = iter.next();
//			if (e.getTarget() == trgNode && closeLevels.contains(e.getCloseness()))
//				return true;
//		}
//		return false;
//	}
	
	/**
	 * Returns the edges connecting both nodes
	 * 
	 * Pre: there is only one edge between the pair of nodes
	 * 
	 * @param srcNode Source node
	 * @param trgNode Target node
	 * @return The connecting edge or null
	 */
	public static LEdge getEdge(LNode srcNode, LNode trgNode){
		Iterator<LEdge> iter = srcNode.getOutgoing().iterator();
		while (iter.hasNext()){
			LEdge e = iter.next();
			if (e.getTarget() == trgNode)
				return e;
		}
		return null;
	}
	
	/*
	 * Gets a list of nodes without the non adjacent nodes
	 */
	public static List<LNode> filterNonAdjacentNodes(
			List<LNode> tnodes, EdgeAttrType attrType, ClosenessType closenessTypes[]){
		ArrayList<Integer> nodesToRemove = new ArrayList<Integer>();
		if (tnodes.size() > 1){
			for (int i=0; i<tnodes.size(); ++i){
				for (int j=0; j<tnodes.size(); ++j){
					if (i != j){
						LNode node1 = tnodes.get(i);
						LNode node2 = tnodes.get(j);
						if (getTargetNodes(node1, attrType, closenessTypes).contains(node2)){
							nodesToRemove.add(j);
						}
					}
				}
			}
		}
		if (nodesToRemove.isEmpty()){
			return tnodes;
		}else{
			ArrayList<LNode> result = new ArrayList<LNode>();
			for (int i=0; i<tnodes.size(); ++i){
				if (!nodesToRemove.contains(i))
					result.add(tnodes.get(i));
			}
			return result;
		}
	}
	
	/*
	 * Returns all the nodes on the right of a given one
	 */
	public static List<LNode> getRightNodes(LNode node, ClosenessType[] closenessLevels){
		List<LNode> tnodes = getTargetNodes(node, EdgeAttrType.X_INTERVAL, closenessLevels);
		List<LNode> fnodes = filterNonAdjacentNodes(tnodes, EdgeAttrType.X_INTERVAL, closenessLevels);
		return fnodes;
	}
	
	/*
	 * Returns all the nodes on the right of a given one
	 */
	public static List<LNode> getRightNodes(LNode node){
		return getRightNodes(node, TileUtil.ALL_LEVELS);
	}
	
//	/*
//	 * Returns the close nodes on the right of a given one
//	 */
//	public static List<LNode> getCloseRightNodes(LNode node){
//		return getTargetNodes(node, EdgeAttrType.X_INTERVAL, TileUtil.CLOSE_LEVELS);
//	}
	
	/*
	 * Returns all the adjacent nodes below a given one
	 */
	public static List<LNode> getDownNodes(LNode node, ClosenessType closenessLevels[]){
		List<LNode> tnodes = getTargetNodes(node, EdgeAttrType.Y_INTERVAL, closenessLevels);
		List<LNode> fnodes = filterNonAdjacentNodes(tnodes, EdgeAttrType.Y_INTERVAL, closenessLevels);
		return fnodes;
	}
	
	/*
	 * Returns all the adjacent nodes below a given one
	 */
	public static List<LNode> getDownNodes(LNode node){
		return getDownNodes(node, TileUtil.ALL_LEVELS);
	}
	
//	/*
//	 * Returns the close nodes below a given one
//	 */
//	public static List<LNode> getCloseDownNodes(LNode node){
//		return getTargetNodes(node, EdgeAttrType.Y_INTERVAL, TileUtil.CLOSE_LEVELS);
//	}
	
	/*
	 * Returns all the nodes on the left of a given one
	 */
	public static List<LNode> getLeftNodes(LNode node, ClosenessType closenessLevels[]){
		List<LNode> snodes = getSourceNodes(node, EdgeAttrType.X_INTERVAL, closenessLevels);
		List<LNode> fnodes = filterNonAdjacentNodes(snodes, EdgeAttrType.X_INTERVAL, closenessLevels);
		return fnodes;
	}
	
	/*
	 * Returns all the nodes on the left of a given one
	 */
	public static List<LNode> getLeftNodes(LNode node){
		return getLeftNodes(node, TileUtil.ALL_LEVELS);
	}
	
//	/*
//	 * Returns the left nodes on the left of a given one
//	 */
//	public static List<LNode> getCloseLeftNodes(LNode node){
//		return getSourceNodes(node, EdgeAttrType.X_INTERVAL, TileUtil.CLOSE_LEVELS);
//	}
	
	/*
	 * Returns all the nodes above a given one
	 */
	public static List<LNode> getUpNodes(LNode node, ClosenessType closenessLevels[]){
		List<LNode> snodes =  getSourceNodes(node, EdgeAttrType.Y_INTERVAL, closenessLevels);
		List<LNode> fnodes = filterNonAdjacentNodes(snodes, EdgeAttrType.Y_INTERVAL, closenessLevels);
		return fnodes;
	}
	
	/*
	 * Returns all the nodes above a given one
	 */
	public static List<LNode> getUpNodes(LNode node){
		return getUpNodes(node, TileUtil.ALL_LEVELS);
	}
	
//	/*
//	 * Returns the close nodes above a given one
//	 */
//	public static List<LNode> getCloseUpNodes(LNode node){
//		return getSourceNodes(node, EdgeAttrType.Y_INTERVAL, TileUtil.CLOSE_LEVELS);
//	}
	
	/*
	 * Auxiliary method to get all the right or down nodes of a given one
	 */
	private static List<LNode> getTargetNodes(LNode node, EdgeAttrType attrType, ClosenessType allowedLevels[]){
		List<LEdge> out1 = selectEdges(node.getOutgoing(), EdgeAttrType.CLOSENESS, allowedLevels);
		List<LEdge> out2 = selectEdges(out1, attrType, TileUtil.SEQ_INTERVALS);
		List<LEdge> out3 = out2;
		if (attrType == EdgeAttrType.X_INTERVAL || attrType == EdgeAttrType.Y_INTERVAL)
			out3 = rejectEdges(out2, OPPOSITE_ATR_MAP.get(attrType), TileUtil.SEQ_INTERVALS_STRICT);
		List<LNode> result = new ArrayList<LNode>();
		for (LEdge e: out3)
			result.add(e.getTarget());
		return result;
	}
	
	/*
	 * Auxiliary method to get all the left or up nodes of a given one
	 */
	private static List<LNode> getSourceNodes(LNode node, EdgeAttrType attrType, ClosenessType allowedLevels[]){
		List<LEdge> out1 = selectEdges(node.getIncoming(), EdgeAttrType.CLOSENESS, allowedLevels);
		List<LEdge> out2 = selectEdges(out1, attrType, TileUtil.SEQ_INTERVALS);
		List<LEdge> out3 = out2;
		if (attrType == EdgeAttrType.X_INTERVAL || attrType == EdgeAttrType.Y_INTERVAL)
			out3 = rejectEdges(out2, OPPOSITE_ATR_MAP.get(attrType), TileUtil.SEQ_INTERVALS_STRICT);
		List<LNode> result = new ArrayList<LNode>();
		for (LEdge e: out3)
			result.add(e.getSource());
		return result;
	}
	
	/*
	 * 
	 */
	public static ClosenessType getNextLevel(ClosenessType closeness){
		int pos = ClosenessType.VALUES.indexOf(closeness);
		if (pos+1 >= ClosenessType.VALUES.size())
			return closeness;
		else
			return ClosenessType.VALUES.get(pos+1);
	}
	
	/*
	 * We assume that the closeness levels included in the array are the N first levels
	 */
	public static ClosenessType[] getNextLevel(ClosenessType closeness[]){
		int pos = closeness.length;
		if (pos >= ClosenessType.VALUES.size())
			return closeness;
		else{
			ClosenessType c = ClosenessType.VALUES.get(pos);
			return TileUtil.IMPLICIT_CLOSENESS_LEVELS.get(c);
		}
	}
	
	/*
	 * Returns true if the relation between the tiles is horizontal
	 * If not, it is vertical
	 * Pre: we assume that i) the tiles are not disjoint and ii) there is no overlapping
	 */
	public static boolean isHorizontal(LEdge relation){
		AllenIntervalType x = relation.getXInterval();
		AllenIntervalType y = relation.getYInterval();
		
		if (x == AllenIntervalType.BEFORE){
			if (y == AllenIntervalType.BEFORE || y == AllenIntervalType.AFTER)
				throw new RuntimeException("Tiles are disjoint: "+relation.toString());
			else 
				return true;
		}else if (x == AllenIntervalType.MEETS){
			if (y == AllenIntervalType.BEFORE || y == AllenIntervalType.AFTER)
				return false;
			else
				return true;
		}
		return false;
	}
	
	/*
	 * 
	 */
	public static int getHDistance(LNode source, LNode target){
		int result = target.getXmin() - source.getXmax() - 1;
		if (result < 0)
			result = 0;
			//	throw new RuntimeException("Wrong order: "+source.toString()+"; "+target.toString());
		return result;
	}
	
	/*
	 * 
	 */
	public static int getVDistance(LNode source, LNode target){
		int result = target.getYmin() - source.getYmax() - 1;
		if (result < 0)
			result = 0;
			//throw new RuntimeException("Wrong order: "+source.toString()+"; "+target.toString());
		return result;
	}
	
	/*
	 * Gets the most upper left node. It only returns one node.
	 */
	public static LNode getMostUpperLeftNode(List<LNode> nodes){
		for (LNode n: nodes){
			if (getLeftNodes(n).isEmpty() && getUpNodes(n).isEmpty())
				return n;
		}
		return null;
	}
	
	//
	// IMPORTANT:
	// In order to set the alignment the margins of both extremes must be assessed
	// We compare the relative difference between the horizontal or vertical extremes
	// to decide if they must have the same alignment or not, no matter the alignment of the children
	//
	public static void setAlignmentBasedOnChildren(LNode node, LNode container){
		
		int left = Integer.MAX_VALUE, right = 0, up = Integer.MAX_VALUE, down = 0;
		for (LNode n: node.getNodes()){
			if (n.getXmin() < left)
				left = n.getXmin();
			if (n.getXmax() > right)
				right = n.getXmax();
			if (n.getYmin() < up)
				up = n.getYmin();
			if (n.getYmax() > down)
				down = n.getYmax();
		}
		
		float containerWidth = container.getXmax() - container.getXmin() + 1;
		float containerHeight= container.getYmax() - container.getYmin() + 1;
		float leftMargin = (left - container.getXmin()) / containerWidth;
		float rightMargin = (container.getXmax() - right) / containerWidth;
		float topMargin = (up - container.getYmin()) / containerHeight;
		float bottomMargin = (container.getYmax() - down) / containerHeight;
		float hdiff = Math.abs(leftMargin - rightMargin);
		float vdiff = Math.abs(topMargin - bottomMargin);
		
		int l = 0, c = 0, r = 0, t = 0, m = 0, b = 0;
		for (LNode n: node.getNodes()){
			if (n.getHalignment() == HAlignmentType.LEFT)
				++l;
			else if (n.getHalignment() == HAlignmentType.CENTER)
				++c;
			else if (n.getHalignment() == HAlignmentType.RIGHT)
				++r;
			if (n.getValignment() == VAlignmentType.TOP)
				++t;
			else if (n.getValignment() == VAlignmentType.MIDDLE)
				++m;
			else if (n.getValignment() == VAlignmentType.BOTTOM)
				++b;
		}
		
		if (l > 0 && hdiff > MIN_MARGIN_DIFFERENCE)
			node.setHalignment(HAlignmentType.LEFT);
		else if (r > 0 && hdiff > MIN_MARGIN_DIFFERENCE)
			node.setHalignment(HAlignmentType.RIGHT);
		else if (c > 0)
			node.setHalignment(HAlignmentType.CENTER);
		else
			node.setHalignment(HAlignmentType.NONE);
		if (t > 0 && vdiff > MIN_MARGIN_DIFFERENCE)
			node.setValignment(VAlignmentType.TOP);
		else if (b > 0  && vdiff > MIN_MARGIN_DIFFERENCE)
			node.setValignment(VAlignmentType.BOTTOM);
		else if (m > 0)
			node.setValignment(VAlignmentType.MIDDLE);
		else
			node.setValignment(VAlignmentType.NONE);
	}
	
	/*
	 * Returns the nodes sorted by a topological order
	 * 
	 * Warning: this may not be a topological sorting
	 */
	public static List<LNode> sortNodes(List<LNode> nodes){
		ArrayList<LNode> result = new ArrayList<LNode>(nodes.size());
		LNode upperLeft = LGraphUtil.getMostUpperLeftNode(nodes);
		LNode rowHead = upperLeft;
		
		do{
			result.add(rowHead);
			LNode current = rowHead;
			List<LNode> right = LGraphUtil.getRightNodes(current);
			while (!right.isEmpty()){
				LNode node = right.remove(0);
				if (!result.contains(node))
					result.add(node);
				right.addAll(LGraphUtil.getRightNodes(node));
			}
			
			List<LNode> down = LGraphUtil.getDownNodes(rowHead);
			if (down.isEmpty())
				rowHead = null;
			else{
				if (down.size() == 1)
					rowHead = down.get(0);
				else{
					for (LNode n: down){
						List<LNode> left = LGraphUtil.getLeftNodes(n);
						if (left.isEmpty()){
							rowHead = n;
							break;
						}
					}
				}
			}
		}while (rowHead != null);
		if (nodes.size() != result.size())
			throw new RuntimeException("LGraphUtil.sortNodes() or LayoutAnalyzer.mergeNodes() have mistakes");
		return result;
	}


	/*
	 * Returns horizontal lines of nodes
	 */
	public static List<List<LNode>> getNodeLines(List<LNode> nodes){
		
		List<LNode> left = new ArrayList<LNode>();
		for (LNode n: nodes){
			List<LNode> lnodes = LGraphUtil.getLeftNodes(n);
			boolean emptyLeft = true;
			for (LNode n1: lnodes){
				if (nodes.contains(n1)){
					emptyLeft = false;
					break;
				}	
			}
			if (emptyLeft)
				left.add(n);
		}
		
		ArrayList<List<LNode>> result = new ArrayList<List<LNode>>(left.size());
		for (LNode rowHead: left){
			ArrayList<LNode> list = new ArrayList<LNode>();
			ArrayList<LNode> right = null;
			LNode current = rowHead;
			do{
				right = new ArrayList<LNode>();
				list.add(current);
				List<LNode> rightAux = LGraphUtil.getRightNodes(current);
				for (LNode n1: rightAux){
					if (nodes.contains(n1))
						right.add(n1);
				}
				if (right.size() > 1)
					throw new RuntimeException("There should be only one node on the right (at most)");
				if (right.size() == 1){
					current = right.get(0);
					if (!nodes.contains(current))
						throw new RuntimeException("The node "+current.getName()+" is not contained in the set of nodes.");
				}

			}while(!right.isEmpty());
			result.add(list);
		}
		
		return result;
	}
	
	
	/*************************************************************************/
	
	
	/**
	 * Returns the horizontal sharing value
	 * If the value returned is negative, then the widgets are not in the same line
	 */
	public static int hSharingValue(LNode node1, LNode node2){
		int d2 = Math.min(node1.getYmax(), node2.getYmax());
		int d1 = Math.max(node1.getYmin(), node2.getYmin());
		int d = d2 - d1 + 1;
		return d;
	}
	
	/**
	 * Returns the vertical sharing value
	 * If the value returned is negative, then the widgets are not in the same column
	 */
	public static int vSharingValue(LNode node1, LNode node2){
		int d2 = Math.min(node1.getXmax(), node2.getXmax());
		int d1 = Math.max(node1.getXmin(), node2.getXmin());
		int d = d2 - d1 + 1;
		return d;
	}
	
	/**
	 * Returns true if the Y axis of both tags are touching
	 */
	public static boolean areHorizontallySharing(LNode node1, LNode node2, int margin){
		int d = hSharingValue(node1, node2);
		if (d > margin)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true if the X axis of both tags are touching
	 */
	public static boolean areVerticallySharing(LNode node1, LNode node2, int margin){
		int d = vSharingValue(node1, node2);
		if (d > margin)
			return true;
		else
			return false;
	}
	
	
	/**
	 * True if both elements are horizontally adjacent
	 * Pre: both elements are siblings
	 */
	public static boolean areHorizontallyAdjacent(LNode node1, LNode node2){
		LNode parent = node1.getParent();
		for (LNode n: parent.getNodes()){
			if (n != node1 && n != node2){
				if (areHorizontallySharing(node1, n, 0) && areHorizontallySharing(node2, n, 0)){
					int xmin = Math.min(node1.getXmin(), node2.getXmin());
					int xmax = Math.max(node1.getXmax(), node2.getXmax());
					if (xmin < n.getXmin() && xmax > n.getXmax())
						return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * True if both elements are vertically adjacent
	 * Pre: both elements are siblings
	 */
	public static boolean areVerticallyAdjacent(LNode node1, LNode node2){
		LNode parent = node1.getParent();
		for (LNode n: parent.getNodes()){
			if (n != node1 && n != node2){
				if (areVerticallySharing(node1, n, 0) && areVerticallySharing(node2, n, 0)){
					int ymin = Math.min(node1.getYmin(), node2.getYmin());
					int ymax = Math.max(node1.getYmax(), node2.getYmax());
					if (ymin < n.getYmin() && ymax > n.getYmax())
						return false;
				}
			}
		}
		return true;
	}

	
}
