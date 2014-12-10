package guizmo.tiles2layout.patterns;

import guizmo.tiles2layout.LayoutType;
import guizmo.tiles2layout.graphs.LNode;

import java.util.List;

import guizmo.tiles2layout.impl.LayoutAnalyzer;
import guizmo.tiles.ClosenessType;

public interface LayoutPattern {
	
	/**
	 * Match a directed acyclic graph (DAG) against a pattern.  
	 * The pattern is defined by the specific subclass of LayoutPattern.
	 * 
	 * IMPORTANT: if the node passed as a parameter is the beginning of a match, the outcome is
	 * the longest matching possible
	 * 
	 * @param node The node to which the pattern is going to match with. 
	 * The parameter represents the starting node of a directed subgraph,
	 * where the nodes accessible from the given one could be matched.
	 * @return If there is a matching, the result is the greatest number of nodes that match the pattern
	 * by starting by the given node. If there is no matching, the result is an empty list.
	 */
	public List<LNode> match(LNode node);
	
	/**
	 * Returns the type of layout that is detected by this pattern
	 * @return
	 */
	//public LayoutType getLayoutType();
	
	/**
	 * Sets the closeness limit that is taken into account when matching a pattern
	 * 
	 * @param limit The closeness limit. Edges with a closeness level higher than the limit will not be considered.
	 */
	public void setClosenessLimit(ClosenessType limit);
	
	/**
	 * Indicates if a group of nodes is a valid match depending on the layout type
	 * Pre: the list of nodes is not empty
	 * 
	 * @param nodes Non-emtpy list of nodes to check
	 * @return true if the nodes form a valid match
	 */
	public boolean isValidMatch(List<LNode> nodes);
	
}
