package guizmo.tiles2layout.impl;

import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.graphs.LEdge;
import guizmo.tiles2layout.graphs.LGraphUtil;
import guizmo.tiles2layout.graphs.LNode;
import guizmo.tiles2layout.patterns.HorizontalFlowLayoutPattern;
import guizmo.tiles2layout.patterns.LayoutPattern;
import guizmo.tiles2layout.patterns.VerticalFlowLayoutPattern;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.uncommons.maths.combinatorics.CombinationGenerator;

import guizmo.tiles2layout.LayoutType;
import guizmo.tiles.*;

public class PatternMatcher {
	
	public PatternMatcher() {
		//super();
	}
	
	/**
	 * Match a directed graph against a pattern. 
	 * The directed graph has been obtained by copying the children tiles(nodes)
	 * and relations(edges) of tile.
	 * 
	 * IMPORTANT: The match performed by this engine is the largest possible in terms of number of nodes involved.
	 * It will not return matches that are subgraphs of other matches.
	 * 
	 * @param graph The graph to which the pattern is going to match with. The graph must have been obtained 
	 * from a tile, where its sub-tiles are the nodes and the sub-relations are the edges of the graph.
	 * @param pattern The pattern to match.
	 * @param discarded A list of discarded matches. This is an output parameter that should be initialised
	 * before invoking the method.
	 * @return The list of groups of nodes that have matched. Each group of nodes is a matching.
	 */
	public List<List<LNode>> match(LNode graph, LayoutPattern pattern, List<List<LNode>> discarded){
		List<List<LNode>> result = new ArrayList<List<LNode>>();
		
		// A topological order guarantees the longest matchings (is this true?) FALSE!
		// Maybe we could check that if the current node is a visited tile,
		// then there cannot be a longer matching that a matching that contains that node
		// and it is already in the solution set
		
		
//		List<Tile> sortedList = topologicalSort(tile);
//		for(Tile t: sortedList){
//			if (!visited.containsKey(t)){
//				List<Tile> matching = pattern.match(t);
//				if (!matching.isEmpty()){
//					result.add(matching);
//					for(Tile tm: matching)
//						visited.put(tm, true);
//				}
//			}
//		}
		
		// Match every node against the pattern and store the solution
		// unless there is an existing solution that contains the new one
		List<LNode> nodeList = graph.getNodes();
		for(LNode n: nodeList){
			List<LNode> matching = pattern.match(n);
			//restart:
			if (!matching.isEmpty()){
				if (result.isEmpty())
					result.add(matching);
				else{
					List<List<LNode>> resultCopy = copyList(result);
					boolean newMatching = true;
					for (List<LNode> l: resultCopy){
						// If the new matching contains an existing matching,
						// then replace the old matching with the new one
						// If an existing matching contains the new matching, do nothing
						// If none of them contains the other, add the new matching
						if (contains(matching, l)){
							result.remove(l);
							if (newMatching){
								result.add(matching);
								newMatching = false;
							}
							//break restart;
						}else if (contains(l, matching)){
							newMatching = false;
						}
					}
					if (newMatching){
						result.add(matching);
						//break restart;
					}
				}
			}
		}

		
		
		// Analise the solutions checking for overlappings to fix
		// We are not sure on how the solutions are overlapped so we use an heuristic
		// to know which solutions must be removed:
		// we order the solutions by size and we iterate through the solution
		// by following this order
		// TODO: For the time being, I will not order the solutions
		// I will just check which solutions are in conflict and delete
		// the ones with less number of nodes
		//
		// 12/09/12 - New decision: overlapped matches are discarded.
		
		// 18/12/12 - New decision: ...
		//
		//20/09/12 - New decision: prevent deadlocks when applying matches:
		// If there is a pair of matches that are connected but the application of both matches
		// prevents later the application of a match that joins both nodes, then the
		// match that provokes the deadlock should be removed.
		// This means that for a pair of H/V matches (two groups of nodes) of A and B, if there is at least 
		// one edge between both A and B and also an edge between A and a node external to B,
		// then a matching between some nodes of A and B will not be possible if we do not discard the A match.
		//
		// 18/12/12 - New decision: deadlock checking is removed. Consider alternatives in the future.
		//
		// 18/08/13 - New decision: remove conflicting nodes from all the matches, but not discard the matches (implemented separately)
		// In this case, there is no need to split the matches because the engine tries to match the pattern against all the nodes,
		// and therefore there will be several matches that will correspond to the sub-matches 
		//
//		List<Integer> discardedMatches = new ArrayList<Integer>();
//		//outside: 
//		for (int i = 0; i < result.size(); ++i) {
//			for (int j = i + 1; j < result.size(); ++j) {
//				if (overlaps(result.get(i), result.get(j))) {
//					if (!discardedMatches.contains(i))
//						discardedMatches.add(i);
//					if (!discardedMatches.contains(j))
//						discardedMatches.add(j);
//				}
////				else if (deadlock(result.get(i), result.get(j), pattern)){
////					if (!discardedMatches.contains(i))
////						discardedMatches.add(i);
////				}
////			}
////		} // end_for_i
		
		
		
		// Remove conflicting nodes from the matches
		// Conflicting nodes are the nodes that are in more than 1 match
		// If the size of the match without the conflicting nodes is 1, mark the match to discard it later
		List<Integer> discardedMatches = new ArrayList<Integer>();
		List<Integer> modifiedMatches = new ArrayList<Integer>();
		for (int i = 0; i < result.size(); ++i) {
			for (int j = i + 1; j < result.size(); ++j) {
				List<LNode> intersection = intersection(result.get(i), result.get(j));
				if (!intersection.isEmpty()) {
					int diff1 = result.get(i).size() - intersection.size();
					int diff2 = result.get(j).size() - intersection.size();
					if (diff1 == 1){
						if (!discardedMatches.contains(i))
							discardedMatches.add(i);
					}else{
						result.get(i).removeAll(intersection);
						modifiedMatches.add(i);
						discarded.add(intersection);
					}
					if (diff2 == 1){
						if (!discardedMatches.contains(j))
							discardedMatches.add(j);
					}else{
						result.get(j).removeAll(intersection);
						modifiedMatches.add(j);
						discarded.add(intersection);
					}
				} //end_if
			} //end_for_int_j
		} //end_for_int_i
		
		
		// After removing the conflicting nodes, we have to check that the modified matches are still valid
		for (int i=0; i<modifiedMatches.size(); ++i){
			if (!pattern.isValidMatch(result.get(i))){
				if (!discardedMatches.contains(i))
					discardedMatches.add(i);
			}
		} // end_for_int_i
		
		
		// 18/02/13 - If the area of the group of the matching enters the area of other tile,
		// discard the matching. This is for avoiding matchings with areas with the shape of a "T".
		// BEWARE that several matches can be used without provoking overlapping
		// We should try all the possible combinations of the matches to optimise the matches used
		//
		// 18/08/13 - What is this for?? Can it be deleted??
		// 03/11/13 - There were errors in this code. We should check the overlapping of the areas, maybe with some margin.
		// In addition, we implement a way to get the max match subset for which there is no overlapping:
		// If we have a vertical (/horizontal) match that has a conflict with other widgets then:
		//   - If the subnodes are horizontal (/vertical) matches, discard the whole match
		//   - If other case, look for the biggest subsets of the match for which there is no conflict
		// Would it be more than 1 subsets?? 
		//
		if (!result.isEmpty()){
			List<LNode> allNodes = graph.getNodes();
			for (int i=0; i<result.size(); ++i){
				List<LNode> matchedNodes = result.get(i);
				boolean overlapping = checkOverlapping(matchedNodes, allNodes);
				if (overlapping){
					LayoutType subtype = getFirstSubLayoutType(matchedNodes);
					if (	(pattern instanceof VerticalFlowLayoutPattern 	&& subtype == LayoutType.HORIZONTAL_FLOW) ||
							(pattern instanceof HorizontalFlowLayoutPattern && subtype == LayoutType.VERTICAL_FLOW)){
						// Discard the whole match
						if (!discardedMatches.contains(i))
							discardedMatches.add(i);
					}else{
						// Look for subsets
						List<LNode> subset = getBiggestNonConflictingSubset(matchedNodes, allNodes);
						if (subset != null)
							result.add(subset);
						if (!discardedMatches.contains(i))
							discardedMatches.add(i);
					}
				}
			} // end_for_i
		} // end_if
		
		
		
		
		// Copy the discarded matches and remove them from the result
		Iterator<List<LNode>> iterResult = result.iterator();
		int k = 0;
		while(iterResult.hasNext()){
			List<LNode> m = iterResult.next();
			if (discardedMatches.contains(k)){
				discarded.add(m);
				iterResult.remove();
			}
			++k;
		}
		
		return result;
	}
	
	
	
	
	
//	/*
//	 * Returns the next level of nodes in topological order
//	 * The result is a subset of the group of tiles passed as a parameter
//	 */
//	private List<Tile> getNextLevel(List<Tile> tileList, Map<Tile, Boolean> visited){
//		List<Tile> result = new ArrayList<Tile>();
//		for(Tile t: tileList){
//			boolean ok = true;
//			for (Relation r: t.getIncoming()){
//				if (!visited.containsKey(r.getSource())){
//					ok = false;
//					break;
//				}
//			}
//			if (ok) result.add(t);
//		}
//		return result;
//	}
//	
//	/*
//	 * It performs a topological sorting with the children of the parameter tile (considered as a graph)
//	 */
//	private List<Tile> topologicalSort(Tile tile){
//		List<Tile> result = new ArrayList<Tile>();
//		Map<Tile, Boolean> visited = new HashMap<Tile, Boolean>();
//		List<Tile> current = new ArrayList<Tile>();
//		for (Tile t: tile.getSubtiles())
//			current.add(t);
//
//		while (!current.isEmpty()){
//			List<Tile> nextLevel = getNextLevel(current, visited);
//			for (Tile t: nextLevel){
//				result.add(t);
//				current.remove(t);
//				visited.put(t, true);
//			}
//			
//		}
//		
//		return result;
//	}
	
	/*
	 * Returns true if list1 contains list2
	 * (i.e. all the nodes in list1 are in list2)
	 */
	private boolean contains(List<LNode> list1, List<LNode> list2){
		for (LNode n: list2){
			if (!list1.contains(n))
				return false;
		}
		return true;
	}
	
	/*
	 * Returns true if there are nodes in list1 that are in list2
	 */
	private boolean overlaps(List<LNode> list1, List<LNode> list2){
		for (LNode n: list1){
			if (list2.contains(n))
				return true;
		}
		for (LNode n: list2){
			if (list1.contains(n))
				return true;
		}
		return false;
	}
	
	/*
	 * Returns true if there are nodes in list1 that are in list2
	 */
	private List<LNode> intersection(List<LNode> list1, List<LNode> list2){
		ArrayList<LNode> result = new ArrayList<LNode>();
		for (LNode n: list1){
			if (list2.contains(n))
				result.add(n);
		}
		return result;
	}
	
	/*
	 * Performs a copy of a list
	 */
	private List<List<LNode>> copyList(List<List<LNode>> original){
		List<List<LNode>> copy = new ArrayList<List<LNode>>();
		for (List<LNode> l: original)
			copy.add(l);
		return copy;
	}
	
	
//	/*
//	 * Checks a future deadlock of matchings
//	 */
//	private boolean deadlock(List<LNode> list1, List<LNode> list2, LayoutPattern pattern){
//		
//		if (pattern.getLayoutType() == LayoutType.GRID || pattern.getLayoutType() == LayoutType.BORDER)
//			return false;
//		LGraphUtil.EdgeAttrType attr;
//		if (pattern.getLayoutType() == LayoutType.HORIZONTAL_FLOW)
//			attr = LGraphUtil.EdgeAttrType.Y_INTERVAL;
//		else
//			attr = LGraphUtil.EdgeAttrType.X_INTERVAL;
//		boolean internalEdge = false;
//		boolean externalEdge = false; 
//		for (LNode n: list1){
//			for (LEdge e: LGraphUtil.selectEdges(n.getOutgoing(), attr, TileUtil.SEQ_INTERVALS)){
//				if (list2.contains(e.getTarget()))
//					internalEdge = true;
//				else
//					externalEdge = true;
//				if (internalEdge && externalEdge)
//					return true;
//			}
//		}
//		return false;
//	}
	
	
	/* 
	 * Gets the area (coordinates and dimension) of a list of nodes
	 * 
	 * IMPORTANT: the returned area is not the real one but a reduced version
	 * The are is the real area minus half the margin defined in AllenUtil.getMargin()
	 * 
	 */
	private Rectangle getArea(List<LNode> nodes){
		int margin = AllenUtil.getMargin();
		Rectangle r = new Rectangle();
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		for (LNode n: nodes){
//			for (Tile t: n.getTiles()){
//				xmin = Math.min(xmin, t.getXMinPos());
//				ymin = Math.min(ymin, t.getYMinPos());
//				xmax = Math.max(xmax, t.getXMaxPos());
//				ymax = Math.max(ymax, t.getYMaxPos());
//			}
			xmin = Math.min(xmin, n.getXmin());
			ymin = Math.min(ymin, n.getYmin());
			xmax = Math.max(xmax, n.getXmax());
			ymax = Math.max(ymax, n.getYmax());
		}
		if (xmin < 0 || ymin < 0 || xmax <= 0 || ymax <= 0)
			throw new RuntimeException("Wrong area for the list of nodes: "+nodes.toString());
		r.x = xmin;
		r.y = ymin;
		r.width = xmax - xmin + 1;
		r.height = ymax - ymin + 1;
		
		// Take the margin into account
		// Only if the dimension of the nodes is greater than the margin
		int halfMargin = (int)Math.ceil(margin / 2d);
		int dMargin = 2*halfMargin;
		if (r.width > dMargin){
			r.x = r.x + halfMargin;
			r.width = r.width - dMargin;
		}
		if (r.height > dMargin){
			r.y = r.y + halfMargin;
			r.height = r.height - dMargin;
		}

		return r;
	}
	
	/* 
	 * Gets the area (coordinates and dimension) of a node
	 */
	private Rectangle getArea(LNode node){
		Rectangle r = new Rectangle();
//		int xmin = Integer.MAX_VALUE;
//		int ymin = Integer.MAX_VALUE;
//		int xmax = Integer.MIN_VALUE;
//		int ymax = Integer.MIN_VALUE;
//		for (Tile t: node.getTiles()){
//			xmin = Math.min(xmin, t.getXMinPos());
//			ymin = Math.min(ymin, t.getYMinPos());
//			xmax = Math.max(xmax, t.getXMaxPos());
//			ymax = Math.max(ymax, t.getYMaxPos());
//		}
//		if (xmin < 0 || ymin < 0 || xmax == Integer.MAX_VALUE || ymax == Integer.MAX_VALUE)
//			throw new RuntimeException("Wrong area for the list of nodes: "+node.toString());
//		r.x = xmin;
//		r.y = ymin;
//		r.width = xmax - xmin + 1;
//		r.height = ymax - ymin + 1;
		r.x = node.getXmin();
		r.y = node.getYmin();
		r.width = node.getXmax() - node.getXmin() + 1;
		r.height = node.getYmax() - node.getYmin() + 1;
		return r;
	}
	
	/*
	 * 'Set' operation that returns list1 - list2
	 */
	private List<LNode> minus(List<LNode> list1, List<LNode> list2){
		ArrayList<LNode> result = new ArrayList<LNode>();
		for (LNode l: list1){
			if (!list2.contains(l))
				result.add(l);
		}
		return result;
	}
	
	/*
	 * 
	 */
	private List<LNode> flatten(List<List<LNode>> lists){
		ArrayList<LNode> result = new ArrayList<LNode>();
		for (List<LNode> list: lists){
			result.addAll(list);
		}
		return result;
	}
	

	/*
	 * 
	 */
	private boolean checkOverlapping(List<LNode> matchedNodes, List<LNode> allNodes){
		Rectangle matchedArea = getArea(matchedNodes);
		for (LNode n: allNodes){
			if (!matchedNodes.contains(n)){
				Rectangle unmatchedArea = getArea(n);
				if (matchedArea.intersects(unmatchedArea)){
					return true;
				}
			}
		} // end_for_n
		return false;
	}
	
	/*
	 * Returns the first layout type of the subnodes contained in a node
	 * If there are different layout types... what??
	 */
	private LayoutType getFirstSubLayoutType(List<LNode> matches){
		for (LNode node: matches){
			if (node.getLayoutType() != null)
				return node.getLayoutType();
		}
		return null;
	}
	
	/*
	 * Gets the first biggest subset of the matchedNodes that is found without interfering other nodes
	 */
	private List<LNode> getBiggestNonConflictingSubset(List<LNode> matchedNodes, List<LNode> allNodes){
		for (int n = matchedNodes.size()-1; n >= 2; --n){
			CombinationGenerator<LNode> combGen = new CombinationGenerator<LNode>(matchedNodes, n);
			while (combGen.hasMore()){
				List<LNode> subset = combGen.nextCombinationAsList();
				boolean overlapping = checkOverlapping(subset, allNodes);
				if (!overlapping){
					return subset;
				}
			}
		}
		return null;
	}
	
}
