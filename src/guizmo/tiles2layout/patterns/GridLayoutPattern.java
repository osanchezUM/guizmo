package guizmo.tiles2layout.patterns;

import guizmo.tiles2layout.graphs.*;
import guizmo.tiles2layout.graphs.LGraphUtil.EdgeAttrType;
import guizmo.tiles2layout.LayoutType;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import guizmo.tiles.*;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.structure.GraphicalElement;
import guizmo.structure.OutputText;

public class GridLayoutPattern extends AbstractLayoutPattern {
	
	private static final int INFINITY = 999;

	/**
	 * N* are nodes, E* are edges
	 * 
	 * LHR:
	 * 
	 * 	 		N1----N2		|	N1-----		|		N1----N2		|		N1-----
	 *  S =		|	   |		|	|	  S		|		|	  |			|		|	  S
	 *	 		N3----N4		|	N3-----		|		---S---			|		---S---
	 * 
	 * 
	 * 
	 * NEG:
	 * 
	 * 			N1----N2----N3
	 * 			|	  |		|
	 * 			N4----X-----N5
	 * 			|	  |		|
	 * 			N6----N7----N8
	 * 
	 * 
	 * N9 E X being E.xInterval = BEFORE or E.yInterval = BEFORE
	 * X E N9 being E.xInterval = BEFORE or E.yInterval = BEFORE
	 * 
	 * (This means that: 
	 * 	X only contains 1 incoming node with xInterval = BEFORE, 
	 * 	X only contains 1 incoming node with yInterval = BEFORE,
	 *  X only contains 1 outgoing node with xInterval = BEFORE, 
	 * 	X only contains 1 outgoing node with yInterval = BEFORE
	 * )
	 * 
	 * ADDITIONAL CONSTRAINTS: (THEY ARE OK ONLY FOR WEB PAGES, THEN THEY HAVE BEEN REMOVED! 11/02/13)
	 * 1) ALL THE NODES MUST BE ALIGNED TO THE LEFT
	 * 2) A GRID OF SIMPLE TEXT ELEMENTS IS NOT ALLOWED
	 * 
	 * NEW CONSTRAINT: all the nodes have to be of the same type
	 * 
	 * RHS:
	 * 
	 * S = Grid
	 * 
	 */
	@Override
	public List<LNode> match(LNode node){
		List<LNode> matching = new ArrayList<LNode>();
		
		// We firstly get the type of the element (all the elements must have the same type)
		String type = null;
		List<Tile> tiles = node.getTiles();
		if (!tiles.isEmpty()){
			GraphicalElement element = tiles.get(0).getElement();
			type = element.getClass().getSimpleName();
		}else{
			return matching;
		}
		
		
		// We set the pivot node (the parameter) as the most upper-left node
		// We look for 2x2 squares recursively
		Vector<Vector<LNode>> matrix = new Vector<Vector<LNode>>();
		setValue(matrix, 0, 0, node);
		matchSquareRecursive(node, 0, 0, matrix, type);
		
		// Then, we check the obtained matrix so see if there is a nxm grid
		int dim[] = checkGrid(matrix);
		
		// if the dimension of the matrix (without empty cells) is at least 2x2, then we have a matching
		if (dim != null && dim[0] > 1 && dim[1] > 1){
			int i=0;
			while (i<dim[0]){
				Vector<LNode> v = matrix.get(i);
				int j=0;
				while (j<dim[1]){
					matching.add(v.get(j++));
				}
				++i;
			}
		}
		
		return matching;
	}
	
	/*
	 * Checks if there is a grid of nodes in the given matrix
	 * The result is the numberOfRows, numberOfColumns of the grids or null
	 */
	private int[] checkGrid(Vector<Vector<LNode>> matrix){
		int rows = INFINITY;
		int cols = INFINITY;
		int i = 0;
		while (i < matrix.size()){
			Vector<LNode> v = matrix.get(i);
			if (v != null){
				int j = 0;
				while (j < v.size()){
					if (v.get(j) == null)
						break;
					++j;
				}
				cols = Math.min(cols, j);
			}else{
				rows = Math.min(rows, i);
			}
			++i;
		}
		rows = Math.min(rows, i);
		if (rows == INFINITY || cols == INFINITY)
			return null;
		else{
			int result[] = {rows, cols};
			return result;
		}
	}
	
	/*
	 * Recursive matching of squares
	 */
	private void matchSquareRecursive(LNode node, int row, int col, Vector<Vector<LNode>> matching, String type){
		if (matchSquare(node, row, col, matching, type)){
			matchSquareRecursive(getValue(matching, row+1, col), row+1, col, matching, type);
			matchSquareRecursive(getValue(matching, row, col+1), row, col+1, matching, type);
			//matchSquareRecursive(getValue(matching, row+1, col+1), row+1, col+1, matching);
		}
	}

	
	/*
	 * Matches a square
	 * 
	 * @param node The node in the upper-left corner of the square
	 * @param row The Y position of 'node' in the 'matching' matrix
	 * @param col The X position of 'node' in the 'matching' matrix
	 * @param matching The 'matching' matrix
	 * @returns True if a 2x2 square has been matched from the given position
	 */
	private boolean matchSquare(LNode node, int row, int col, Vector<Vector<LNode>> matching, String type){
		//if (isSimpleTextNode(node))
		//	return false;
		
		// If the node does not have the same element type, then 
		if (!checkType(node, type))
			return false;
		
		ClosenessType[] limits = TileUtil.IMPLICIT_CLOSENESS_LEVELS.get(closenessLimit);
		List<LEdge> outRight = 
				LGraphUtil.selectEdges(
						LGraphUtil.selectEdges(
								node.getOutgoing(), 
								EdgeAttrType.CLOSENESS, 
								limits),
						EdgeAttrType.X_INTERVAL, 
						TileUtil.SEQ_INTERVALS
				);
		List<LEdge> outDown = 
				LGraphUtil.selectEdges(
						LGraphUtil.selectEdges(
								node.getOutgoing(), 
								EdgeAttrType.CLOSENESS, 
								limits),
						EdgeAttrType.Y_INTERVAL, 
						TileUtil.SEQ_INTERVALS
				);
		for (LEdge rEdge: outRight){
			//if (!AllenUtil.isBeginAligned(rEdge.getYInterval()))
			//	return false;
			LNode rNode = rEdge.getTarget();
			if (!checkType(rNode, type))
				return false;
			//if (isSimpleTextNode(rNode))
			//	return false;
			for (LEdge dEdge: outDown){
				//if (!AllenUtil.isBeginAligned(dEdge.getXInterval()))
				//	return false;
				LNode dNode = dEdge.getTarget();
				if (!checkType(dNode, type))
					return false;
				//if (isSimpleTextNode(dNode))
				//	return false;
				List<LEdge> outRight2 = 
						LGraphUtil.selectEdges(
								LGraphUtil.selectEdges(
										dNode.getOutgoing(), 
										EdgeAttrType.CLOSENESS, 
										limits),
								EdgeAttrType.X_INTERVAL, 
								TileUtil.SEQ_INTERVALS
						);
				List<LEdge> outDown2 = 
						LGraphUtil.selectEdges(
								LGraphUtil.selectEdges(
										rNode.getOutgoing(), 
										EdgeAttrType.CLOSENESS, 
										limits),
								EdgeAttrType.Y_INTERVAL, 
								TileUtil.SEQ_INTERVALS
						);
				for (LEdge rEdge2: outRight2){
					//if (!AllenUtil.isBeginAligned(rEdge2.getYInterval())) 
					//	return false;
					LNode rNode2 = rEdge2.getTarget();
					if (!checkType(rNode2, type))
						return false;
					//if (isSimpleTextNode(rNode2))
					//	return false;
					for (LEdge dEdge2: outDown2){
						//if (!AllenUtil.isBeginAligned(dEdge2.getXInterval()))
						//	return false;
						LNode dNode2 = dEdge2.getTarget();
						if (rNode2 == dNode2){
							boolean res1 = setValue(matching, row, col+1, rNode);
							boolean res2 = setValue(matching, row+1, col, dNode);
							boolean res3 = setValue(matching, row+1, col+1, rNode2);
							if (res1 == false)
								setValue(matching, row, col+1, null);
							if (res2 == false)
								setValue(matching, row+1, col, null);
							if (res3 == false)
								setValue(matching, row+1, col+1, null);
							return res1 & res2 & res3;
						}
					}
				}
			}
		}
		return false;
	}
	
	/*
	 * Sets a value in a matrix
	 * - If the position is empty, puts the element and returns true
	 * - If the position is not empty and the parameter matches the stored element, returns true
	 * - If the position is not empty and the parameter does not match the stored element, returns false
	 */
	private boolean setValue(Vector<Vector<LNode>> matrix, int row, int col, LNode node){
		Vector<LNode> v;
		if (matrix.size() > row){
			v = matrix.get(row);
		}else{
			matrix.setSize(row+1);
			v = new Vector<LNode>();
			matrix.setElementAt(v, row);
		}
		
		if (v.size() <= col || (v.size() > col && v.get(col) == null)){
			if (v.size() <= col)
				v.setSize(col+1);
			v.setElementAt(node, col);
			return true;
		}else{
			LNode existingNode = v.get(col);
			if (existingNode == node)
				return true;
			else
				return false;
		}
	}
	
	/*
	 * Gets a value from a matrix (or null)
	 */
	private LNode getValue(Vector<Vector<LNode>> matrix, int row, int col){
		Vector<LNode> v = matrix.get(row);
		if (v == null)
			return null;
		else
			return v.get(col);
	}
	
	/*
	 * Checks if the node contains only a text tag
	 */
	public boolean isSimpleTextNode(LNode node){
		List<Tile> tiles = node.getTiles();
		if (tiles.size() == 1){
			Tile t = tiles.get(0);
			if (t.getElement() instanceof OutputText)
				return true;
		}
		return false;
	}
	
	/*
	 * Checks that the node contains a widget of the given type
	 * The type is defined by the EMF impl class name
	 */
	private boolean checkType(LNode node, String type){
		List<Tile> tiles = node.getTiles();
		if (!tiles.isEmpty()){
			GraphicalElement element = tiles.get(0).getElement();
			String nodeType = element.getClass().getSimpleName();
			if (nodeType.equals(type))
				return true;
		}
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see guizmo.tiles2layout.patterns.LayoutPattern#isValidMatch(java.util.List)
	 */
	public boolean isValidMatch(List<LNode> nodes){
		if (nodes.size() >= 4)
			return true;
		else
			return false;
	}

}
