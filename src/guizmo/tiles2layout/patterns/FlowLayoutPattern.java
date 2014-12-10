package guizmo.tiles2layout.patterns;

import guizmo.tiles.ClosenessType;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.graphs.LEdge;
import guizmo.tiles2layout.graphs.LGraphUtil;
import guizmo.tiles2layout.graphs.LNode;
import guizmo.tiles2layout.graphs.LGraphUtil.EdgeAttrType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class FlowLayoutPattern extends AbstractLayoutPattern {
	
	private LGraphUtil.EdgeAttrType attrType = null;
//	private static final Map<EdgeAttrType , EdgeAttrType > oppAttrMap = new HashMap<EdgeAttrType, EdgeAttrType>();
//    static {
//    	oppAttrMap.put(EdgeAttrType.X_INTERVAL, EdgeAttrType.Y_INTERVAL);
//    	oppAttrMap.put(EdgeAttrType.Y_INTERVAL, EdgeAttrType.X_INTERVAL);
//    }
	
	protected void setAttrType(LGraphUtil.EdgeAttrType attrType){
		this.attrType = attrType;
	}
	
	public List<LNode> match(LNode node) {
		if (attrType == null)
			throw new RuntimeException("Initialize the type of attribute: xInterval or yInterval");
		if (closenessLimit == null)
			throw new RuntimeException("Initialize the closeness limit");
		List<LNode> matching = new ArrayList<LNode>();
		match(node, matching);
		
		// If there is only one node, there is no match
		if (!matching.isEmpty())
			matching.add(0, node);
		
		return matching;
	}
	
	/*
	 * 
	 */
	private void match(LNode node, List<LNode> matching) {
		List<LEdge> outgoing = getDirectedOutgoing(node);
		List<LEdge> scopeOutgoing = getScopeEdges(outgoing);
		
		// Check that there are no more than one outgoing edges of the given type
		// and that outgoing edge is closer than the limit
		// Also check that the target of an edge has no more than one incoming edges of the given type
		//
		//if (outgoing.size() == 1 && !scopeOutgoing.isEmpty()){
		if (scopeOutgoing.size() == 1){
			LNode nextNode = scopeOutgoing.get(0).getTarget();
			
			List<LEdge> incoming = getDirectedIncoming(nextNode);
			List<LEdge> scopeIncoming = getScopeEdges(incoming);
			
			if (scopeIncoming.size() == 1){
				matching.add(nextNode);
				match(nextNode, matching);
			}
		}
	}
	
	/*
	 * 
	 */
	private List<LEdge> getDirectedOutgoing(LNode node){
		List<LEdge> aux = 
				LGraphUtil.rejectEdges(
					node.getOutgoing(), 
					LGraphUtil.OPPOSITE_ATR_MAP.get(attrType), 
					TileUtil.SEQ_INTERVALS_STRICT
				);
		List<LEdge> out =
				LGraphUtil.selectEdges(
						aux,
						attrType, 
						TileUtil.SEQ_INTERVALS
				);
		return out;
	}
	
	/*
	 * 
	 */
	private List<LEdge> getScopeEdges(List<LEdge> edges){
		List<LEdge> out = 
				LGraphUtil.selectEdges(
					edges, 
					EdgeAttrType.CLOSENESS, 
					TileUtil.IMPLICIT_CLOSENESS_LEVELS.get(closenessLimit)
				);
		return out;
	}
	
	
	/*
	 * 
	 */
	private List<LEdge> getDirectedIncoming(LNode node){
		List<LEdge> aux = 
				LGraphUtil.rejectEdges(
					node.getIncoming(), 
					LGraphUtil.OPPOSITE_ATR_MAP.get(attrType), 
					TileUtil.SEQ_INTERVALS_STRICT
				);
		List<LEdge> out =
				LGraphUtil.selectEdges(
						aux,
						attrType, 
						TileUtil.SEQ_INTERVALS
				);
		return out;
	}


	/*
	 * (non-Javadoc)
	 * @see guizmo.tiles2layout.patterns.LayoutPattern#isValidMatch(java.util.List)
	 */
	public boolean isValidMatch(List<LNode> nodes){
		if (nodes.size() > 1)
			return true;
		else
			return false;
	}
}
