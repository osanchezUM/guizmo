package guizmo.tiles2layout.patterns;

import guizmo.tiles.ClosenessType;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.VAlignmentType;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.graphs.*;
import guizmo.tiles2layout.graphs.LGraphUtil.EdgeAttrType;
import guizmo.tiles2layout.LayoutType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BorderLayoutPattern extends AbstractLayoutPattern {
	
	public static final float MIN_PERCENTAGE = 0.2f;

	/**
	 * N*, X are nodes, E* are edges
	 * 
	 * 
	 * 	 -----N1------	
	 *   |	   |	 |
	 *	N21----X----N23		
	 *   |	   |	 |
	 *   -----N3------
	 * 
	 * LHR:
	 * 
	 * S = 
	 * 	N1 E121 N21 being E121.yInterval = BEFORE
	 * 	N1 E122 X being E122.yInterval = BEFORE
	 * 	N1 E123 N23 being E123.yInterval = BEFORE
	 *  N21 E2122 X being E2122.xInterval = BEFORE
	 *  X E2223 N23 being E2223.xInterval = BEFORE
	 *  N21 E213 N3 being E213.yInterval = BEFORE
	 * 	X E223 N3 being E223.yInterval = BEFORE
	 * 	N23 E233 N3 being E233.yInterval = BEFORE
	 * 
	 * NEG:
	 * 
	 * N4 E422 N24 being E422.xInterval = BEFORE or E422.yInterval = BEFORE
	 * X E224 N4 being E224.xInterval = BEFORE or E224.yInterval = BEFORE
	 * 
	 * (This means that: 
	 * 	X only contains 1 incoming node with xInterval = BEFORE, 
	 * 	X only contains 1 incoming node with yInterval = BEFORE,
	 *  X only contains 1 outgoing node with xInterval = BEFORE, 
	 * 	X only contains 1 outgoing node with yInterval = BEFORE
	 * )
	 * 
	 * RHS:
	 * 
	 * S = Border
	 * 
	 * 
	 * (11/02/13)
	 * 
	 * IT HAS BEEN CHANGED TO SUPPORT THE LAYOUT ALLOWING EMPTY AREAS
	 * 
	 * Possible configurations:
	 * 
	 * (1)
	 * 
	 * NNNNN
	 * W.C.E
	 * SSSSS
	 * 
	 * (2)
	 * 
	 * NNNNN
	 * W.C.E
	 * 
	 * (3)
	 * 
	 * W.C.E
	 * SSSSS
	 * 
	 * (4)
	 * 
	 * NNNNN
	 * .....
	 * SSSSS
	 * 
	 * (5)
	 * 
	 * W...E
	 * 
	 */
	@Override
	public List<LNode> match(LNode node){
		LNode matching[] = new LNode[5];
		// We look for the central node of the layout -> (13/02/13) Not anymore
		ClosenessType limits[] = TileUtil.IMPLICIT_CLOSENESS_LEVELS.get(closenessLimit);
		
//		List<LEdge> inYList = LGraphUtil.selectEdges(
//				LGraphUtil.selectEdges(node.getIncoming(), EdgeAttrType.CLOSENESS, limits),
//				EdgeAttrType.Y_INTERVAL, 
//				TileUtil.SEQ_INTERVALS);
//		List<LEdge> inXList = LGraphUtil.selectEdges(
//				LGraphUtil.selectEdges(node.getIncoming(), EdgeAttrType.CLOSENESS, limits),
//				EdgeAttrType.X_INTERVAL, 
//				TileUtil.SEQ_INTERVALS);
//		List<LEdge> outYList = LGraphUtil.selectEdges(
//				LGraphUtil.selectEdges(node.getOutgoing(), EdgeAttrType.CLOSENESS, limits),
//				EdgeAttrType.Y_INTERVAL, 
//				TileUtil.SEQ_INTERVALS);
//		List<LEdge> outXList = LGraphUtil.selectEdges(
//				LGraphUtil.selectEdges(node.getOutgoing(), EdgeAttrType.CLOSENESS, limits),
//				EdgeAttrType.X_INTERVAL,
//				TileUtil.SEQ_INTERVALS);
//		
//		// Five areas occupied
//		if (inYList.size() == 1 && inXList.size() == 1 && outYList.size() == 1 && outXList.size() == 1){
//			LNode topNode = inYList.get(0).getSource();
//			LNode leftNode = inXList.get(0).getSource();
//			LNode bottomNode = outYList.get(0).getTarget();
//			LNode rightNode = outXList.get(0).getTarget();
//			if (	LGraphUtil.areConnected(topNode, leftNode) && 
//					LGraphUtil.areConnected(topNode, rightNode) &&
//					LGraphUtil.areConnected(leftNode, bottomNode) &&
//					LGraphUtil.areConnected(rightNode, bottomNode) ){
//				matching.add(topNode);
//				matching.add(leftNode);
//				matching.add(node);
//				matching.add(rightNode);
//				matching.add(bottomNode);
//			}
//		}
		List<LNode> left = LGraphUtil.getLeftNodes(node, limits);
		List<LNode> right = LGraphUtil.getRightNodes(node, limits);
		List<LNode> farRight = LGraphUtil.getRightNodes(node, LGraphUtil.getNextLevel(limits));
		List<LNode> up = LGraphUtil.getUpNodes(node, limits);
		List<LNode> down = LGraphUtil.getDownNodes(node, limits);
		List<LNode> farDown = LGraphUtil.getDownNodes(node, LGraphUtil.getNextLevel(limits));
		
		int numLevelsUsed = getNumLevelsUsed(node);
		
		if (left.isEmpty() && up.isEmpty() && right.isEmpty() && 
				node.getValignment() == VAlignmentType.TOP && 
				((down.size() >= 1 && down.size() <= 3) || (numLevelsUsed > 1 && farDown.size() == 1)))
			northState(node, matching, limits, numLevelsUsed);
		else if (left.isEmpty() && node.getHalignment() == HAlignmentType.LEFT &&
				//(right.size() == 1 || (numLevelsUsed > 1 && farRight.size() == 1) || down.size() == 1))
				(right.size() == 1 || farRight.size() == 1 || down.size() == 1))
			westState(node, matching, limits, numLevelsUsed);
		
		ArrayList<LNode> result = new ArrayList<LNode>(5);
		for (LNode m: matching){
			if (m != null)
				result.add(m);
		}
		return result;
	}
	
	private void northState(LNode node, LNode matching[], ClosenessType closenessLimits[], int numLevelsUsed){
		matching[0] = node;
		LNode west = null, center = null, east = null, south = null;
		List<LNode> down = LGraphUtil.getDownNodes(node, closenessLimits);
		List<LNode> farDown = LGraphUtil.getDownNodes(node, LGraphUtil.getNextLevel(closenessLimits));
		LNode far = null;
		if (farDown.size() == 1)
			far = farDown.get(0);
		for (LNode n: down){
			List<LNode> l = LGraphUtil.getLeftNodes(n, closenessLimits);
			List<LNode> r = LGraphUtil.getRightNodes(n, closenessLimits);
			List<LNode> d = LGraphUtil.getDownNodes(n, closenessLimits);
			if (n.getHalignment() == HAlignmentType.LEFT &&
					l.isEmpty() && (r.size() <= 1 || d.size() <= 1))
				west = n;
			else if (n.getHalignment() == HAlignmentType.CENTER){
				if (l.size() == 1){
					west = l.get(0);
				}else if (r.size() <= 1 || d.size() <= 1){
					center = n;
				}
			}else if (n.getHalignment() == HAlignmentType.RIGHT && r.isEmpty())
				east = n;
			else if (n.getValignment() == VAlignmentType.BOTTOM && 
					l.isEmpty() && d.isEmpty() && r.isEmpty())
				south = n;	
		}
		
		if (west != null)
			westState(west, matching, closenessLimits, numLevelsUsed);
		else if (south != null)
			southState(south, matching, closenessLimits, numLevelsUsed);
		else if (far != null && numLevelsUsed > 1 && LGraphUtil.getDownNodes(far, closenessLimits).isEmpty()
				&& far.getValignment() == VAlignmentType.BOTTOM)
			southState(far, matching, closenessLimits, numLevelsUsed);
		else{
			Arrays.fill(matching, null);
			return;
		}
	}
	
	private void westState(LNode node, LNode matching[], ClosenessType closenessLimits[], int numLevelsUsed){
		matching[1] = node;
		List<LNode> right = LGraphUtil.getRightNodes(node, closenessLimits);
		List<LNode> farRight = LGraphUtil.getRightNodes(node, LGraphUtil.getNextLevel(closenessLimits));
		List<LNode> down = LGraphUtil.getDownNodes(node, closenessLimits);
		LNode r = null, far = null, d = null;
		LNode parent = node.getParent();
		int parentWidth = parent.getXmax() - parent.getXmin() + 1;
		float separation = 0;
		
		if (right.size() == 1){
			r = right.get(0);
			int sep = r.getXmin() - node.getXmax() - 1;
			separation = sep / (float)parentWidth;
		}
		if (farRight.size() == 1)
			far = farRight.get(0);
		if (down.size() == 1)
			d = down.get(0);
		
		if (r != null && r.getHalignment() == HAlignmentType.CENTER)
			centerState(r, matching, closenessLimits, numLevelsUsed);
		else if (r != null &&
				node.getHalignment() == HAlignmentType.LEFT &&
				r.getHalignment() == HAlignmentType.RIGHT &&
				separation >= MIN_PERCENTAGE &&
				LGraphUtil.getRightNodes(r, closenessLimits).isEmpty())
			eastState(far, matching, closenessLimits, numLevelsUsed);
//		else if (r == null && 
//				far != null && 
//				far.getHalignment() == HAlignmentType.RIGHT &&
//				//numLevelsUsed > 1 && 
//				LGraphUtil.getRightNodes(far, closenessLimits).isEmpty())
//			eastState(far, matching, closenessLimits, numLevelsUsed);
		
//		else if (d.getValignment() == VAlignmentType.BOTTOM && 
//				LGraphUtil.getCloseDownNodes(d).isEmpty() && 
//				LGraphUtil.getCloseLeftNodes(d).isEmpty() && 
//				LGraphUtil.getCloseRightNodes(d).isEmpty()){
//			matching.clear();
//			return;
//		}
		else{
			Arrays.fill(matching, null);
			return;
		}
	}
	
	private void centerState(LNode node, LNode matching[], ClosenessType closenessLimits[], int numLevelsUsed){
		matching[2] = node;
		List<LNode> right = LGraphUtil.getRightNodes(node, closenessLimits);
		List<LNode> down = LGraphUtil.getDownNodes(node, closenessLimits);
		LNode r = null, d = null;
		if (right.size() == 1)
			r = right.get(0);
		if (down.size() == 1)
			d = down.get(0);
		
		if (r != null && r.getHalignment() == HAlignmentType.RIGHT && 
				LGraphUtil.getRightNodes(r, closenessLimits).isEmpty())
			eastState(r, matching, closenessLimits, numLevelsUsed);
		else if (d != null && d.getValignment() == VAlignmentType.BOTTOM && 
				LGraphUtil.getDownNodes(d, closenessLimits).isEmpty() && 
				LGraphUtil.getLeftNodes(d, closenessLimits).isEmpty() && 
				LGraphUtil.getRightNodes(d, closenessLimits).isEmpty()){
			southState(d, matching, closenessLimits, numLevelsUsed);
		}else{
			Arrays.fill(matching, null);
			return;
		}
	}
	
	private void eastState(LNode node, LNode matching[], ClosenessType closenessLimits[], int numLevelsUsed){
		matching[3] = node;
		List<LNode> down = LGraphUtil.getDownNodes(node, closenessLimits);
		List<LNode> centerDown = null;
		if (matching[2] != null)
			centerDown = LGraphUtil.getDownNodes(matching[2], closenessLimits);
		LNode d = null;
		if (down.size() == 1)
			d = down.get(0);
		if (d != null && d.getValignment() == VAlignmentType.BOTTOM && 
				LGraphUtil.getDownNodes(d, closenessLimits).isEmpty() && 
				LGraphUtil.getLeftNodes(d, closenessLimits).isEmpty() && 
				LGraphUtil.getRightNodes(d, closenessLimits).isEmpty()){
			southState(d, matching, closenessLimits, numLevelsUsed);
		}else if (matching[2] != null && centerDown.size() == 1 && 
				centerDown.get(0).getValignment() == VAlignmentType.BOTTOM){
			southState(centerDown.get(0), matching, closenessLimits, numLevelsUsed);
		}else if ((matching[1] != null && matching[2] == null) ||
				(matching[0] != null && matching[1] != null && matching[2] != null)){
			return;
		}else{
			Arrays.fill(matching, null);
			return;
		}
	}
	
	private void southState(LNode node, LNode matching[], ClosenessType closenessLimits[], int numLevelsUsed){
//		if (matching[1] != null){
//			List<LNode> down1 = LGraphUtil.getDownNodes(matching[1], closenessLimits);
//			if (!down1.contains(node)){
//				Arrays.fill(matching, null);
//				return;
//			}	
//		}
		if (matching[2] != null){
			List<LNode> down2 = LGraphUtil.getDownNodes(matching[2], closenessLimits);
			if (!down2.contains(node)){
				Arrays.fill(matching, null);
				return;
			}	
		}
		matching[4] = node;
	}
	
	/*
	 * 
	 */
	private int getNumLevelsUsed(LNode node){
		ArrayList<ClosenessType> levels = new ArrayList<ClosenessType>();
		LNode parent = node.getParent();
		if (parent == null)
			throw new RuntimeException("Parent is null");
		while (parent.getParent() != null)
			parent = parent.getParent();
		getNumLevelsUsedRecursive(parent, levels);
		return levels.size();
	}
	
	/*
	 * 
	 */
	private void getNumLevelsUsedRecursive(LNode node, ArrayList<ClosenessType> levels){
		for (LEdge e: node.getEdges()){
			if (!levels.contains(e.getCloseness()))
				levels.add(e.getCloseness());
		}
		for (LNode n: node.getNodes()){
			getNumLevelsUsedRecursive(n, levels);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see guizmo.tiles2layout.patterns.LayoutPattern#isValidMatch(java.util.List)
	 */
	public boolean isValidMatch(List<LNode> nodes){
		if (nodes.size() > 1 && nodes.size() <= 5)
			return true;
		else
			return false;
	}

}
