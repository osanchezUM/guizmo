package guizmo.tiles2layout.impl;

import guizmo.layout.*;

public class LayoutEvaluator {
	
	private static int BETTER_FITNESS_VALUE = 1;
	private static int WORSE_FITNESS_VALUE = 3;
	private static int PENALTY = 1;
	
	
	/**
	 * An estimation on how good the layout is.
	 * A layout solution A is considered better than another solution B if:
	 * - A is shorter than B
	 * - A uses more complex layouts (such as GridLayout or BorderLayout) than B
	 * - A contains a simple layout followed by a complex layout and B uses the same 2 layouts in the reverse order
	 *  (Complex layouts that are applied to the whole graph (appear at the end of the solution sequence) are better) ¿¿??
	 * - A is less deep and more balanced than B
	 * 
	 * Deeper layout trees are worser than more balanced and less deep trees. In fact broader trees are better than deeper trees
	 * Grid|Border  --better_than-->  Form  --better_than-->  HFlow|VFlow
	 * 
	 * TODO IDEA: THE ORDER IN WHICH THE LAYOUTS ARE APPLIED IS IMPORTANT
	 * 
	 * @param solution The solution to evaluate
	 * @return The fitness value of the solution given. BEWARE: The minimum value (fitness=1) is the better layout.
	 * The higher the value returned, the worse layout.
	 */
	public static int fitness(Layout solution){
		//return recursiveEvaluation(solution, null);
		return recursiveEvaluation(solution, null, 1);
	}
	
	/*
	 * Auxiliary method
	 */
	private static int recursiveEvaluation(Layout layout, Layout parent, int depth){
		int result = 0;
		int partial = 0;
		if (layout instanceof FlowLayout){
			if (parent == null || !(parent instanceof FormLayout))
				partial += WORSE_FITNESS_VALUE;
		}else if (layout instanceof FormLayout){
			partial += WORSE_FITNESS_VALUE;
		}else if (layout instanceof BorderLayout || layout instanceof GridLayout){
			partial += BETTER_FITNESS_VALUE;
		}
		result += partial * depth;
		for (Layout l: layout.getSublayouts())
			result += recursiveEvaluation(l, layout, depth+1);
		return result;
	}
	
	
//	/*
//	 * Auxiliary method
//	 */
//	private static int recursiveEvaluation(Layout layout, Layout parent){
//		int result = 0;
//		if (layout instanceof FlowLayout){
//			if (parent == null || !(parent instanceof FormLayout))
//				result += WORSE_FITNESS_VALUE;
//		}else if (layout instanceof FormLayout){
//			result += WORSE_FITNESS_VALUE;
//		}else if (layout instanceof BorderLayout || layout instanceof GridLayout){
//			result += BETTER_FITNESS_VALUE;
//			if (parent != null && parent instanceof FlowLayout)
//				result += PENALTY;
//		}
//		for (Layout l: layout.getSublayouts())
//			result += recursiveEvaluation(l, layout);
//		return result;
//	}
	
}
