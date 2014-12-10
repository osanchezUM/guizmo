package guizmo.tiles2layout.patterns;

import guizmo.structure.Button;
import guizmo.structure.GraphicalElement;
import guizmo.structure.Item;
import guizmo.structure.SingleWidget;
import guizmo.structure.impl.ButtonImpl;
import guizmo.structure.impl.CheckBoxImpl;
import guizmo.structure.impl.ComboBoxImpl;
import guizmo.structure.impl.ListBoxImpl;
import guizmo.structure.impl.OutputTextImpl;
import guizmo.structure.impl.RadioGroupImpl;
import guizmo.structure.impl.TextAreaImpl;
import guizmo.structure.impl.TextBoxImpl;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.Tile;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.graphs.LGraphUtil;
import guizmo.tiles2layout.graphs.LNode;
import guizmo.tiles2layout.LayoutType;

import java.util.ArrayList;
import java.util.List;

//
// A FormLayout performs matches on widgets, not layouts
//
public class FormLayoutPattern extends AbstractLayoutPattern{

	private ClosenessType[] limits = null;
	private static final Class allowedTypes[] = {
			ButtonImpl.class, CheckBoxImpl.class, ComboBoxImpl.class, ListBoxImpl.class,
			OutputTextImpl.class, RadioGroupImpl.class, TextBoxImpl.class, TextAreaImpl.class,
			Item.class
			};
	
	@Override
	public List<LNode> match(LNode node) {
		limits = TileUtil.IMPLICIT_CLOSENESS_LEVELS.get(closenessLimit);
		ArrayList<LNode> result = new ArrayList<LNode>();
		Boolean multiRow = false;
		Boolean multiColumn = false;
		Boolean simpleLines = true;
		Boolean allTypesAllowed = true;
		Boolean checkings[] = {multiRow, multiColumn, simpleLines, allTypesAllowed};
		recursiveMatching(node, result, checkings);
		if (checkings[0] && checkings[1] && checkings[2] && checkings[3])
			return result;
		else
			return new ArrayList<LNode>(0);
	}
	
	/*
	 * [0] multiRow: if there are several rows
	 * [1] multiColumn: if there are several columns
	 * [2] simpleLines: if there is no widget that belongs to more than one different line
	 * [3] allTypesAllowed: if all the types of widgets in the form are allowed
	 */
	private void recursiveMatching(LNode current, List<LNode> visited, Boolean[] checkings){
		if (visited.contains(current))
			return;
		// Check if the node contains one widget of the allowed types
		if (!checkType(current))
			checkings[3] = false;
		if (!checkings[2] || !checkings[3])
			return;
		visited.add(current);
		List<LNode> right = LGraphUtil.getRightNodes(current, limits);
		List<LNode> left = LGraphUtil.getLeftNodes(current, limits);
		List<LNode> down = LGraphUtil.getDownNodes(current, limits);
		if (right.size() > 1 || left.size() > 1){
			checkings[2] = false;
			return;
		}else if (right.size() == 1){
			checkings[1] = true;
			recursiveMatching(right.get(0), visited, checkings);
		}
		if (!down.isEmpty())
			checkings[0] = true;
		for (LNode n: down){
			recursiveMatching(n, visited, checkings);
		}
	}
	
	/*
	 * Checks that the node contains a widget of the allowed types in a form
	 */
	private boolean checkType(LNode node){
		List<Tile> tiles = node.getTiles();
		if (tiles.size() == 1){
			GraphicalElement elem = tiles.get(0).getElement();
			Class type = elem.getClass();
			for (Class t: allowedTypes){
				if (type.equals(t))
					return true;
			}
		}
		return false;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see guizmo.tiles2layout.patterns.LayoutPattern#isValidMatch(java.util.List)
	 */
	public boolean isValidMatch(List<LNode> nodes){
		LNode upperLeftNode = nodes.get(0);
		int margin = AllenUtil.getMargin();
		for(int i=1; i<nodes.size(); ++i){
			LNode n = nodes.get(i);
			if (n.getYmin() + margin <= upperLeftNode.getYmin()){
				if (n.getXmin() + margin <= upperLeftNode.getXmin()){
					 upperLeftNode = n;
				}
			}
		}
		List<LNode> result = match(upperLeftNode);
		if (nodes.size() == result.size())
			return true;
		else
			return false;
	}
	
//	@Override
//	public List<LNode> match(LNode node) {
//		limits = LGraphUtil.IMPLICIT_CLOSENESS_LEVELS.get(closenessLimit);
//		ArrayList<Integer> numRowElements = new ArrayList<Integer>();
//		ArrayList<LNode> result = new ArrayList<LNode>();
//		// There must not be a row with an element that has 2 elements on the right
//		if (matchRecursively(node, result, numRowElements) == false)
//			return new ArrayList<LNode>();
//		// There must be N rows where at least 1 row has more than 1 element
//		int max = 0;
//		for (int i: numRowElements){
//			max = Math.max(i, max);
//		}
//		if (max <= 1)
//			return new ArrayList<LNode>();
//		else
//			return result;
//	}
//	
//	private boolean matchRecursively(LNode node, List<LNode> matchedNodes, ArrayList<Integer> numRowElements){
//		List<LNode> right = null;
//		int length = 1;
//		LNode current = node;
//		do{
//			matchedNodes.add(current);
//			right = LGraphUtil.getRightNodes(current, limits);
//			if (right.size() > 1)
//				return false;
//			else if (right.size() == 1){
//				++length;
//				current = right.get(0);
//			}
//		}while(!right.isEmpty());
//		numRowElements.add(length);
//		
//		List<LNode> down =  LGraphUtil.getDownNodes(node, limits);
//		if (down.size() == 1){
//			return matchRecursively(down.get(0), matchedNodes, numRowElements);
//		}else if (down.size() > 1){
//			for (LNode n: down){
//				List<LNode> left = LGraphUtil.getLeftNodes(n, limits);
//				if (left.isEmpty()){
//					return  matchRecursively(n, matchedNodes, numRowElements);
//				}
//			}
//			return false;
//		}else
//			return true;
//	}

	
}
