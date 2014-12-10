package guizmo.tiles2layout.impl;

import guizmo.tiles2layout.LayoutType;

import org.uncommons.maths.combinatorics.*;

public class VariationGenerator {

	private PermutationGenerator<LayoutType> pgen;
	
	/*
	 * Creates a sequence of variation based on the elements of the argument
	 */
	public VariationGenerator(LayoutType elements[]){
		pgen = new PermutationGenerator<LayoutType>(elements);
	}

	/*
	 * Returns true if there are more variations to be generated
	 */
	public boolean hasMore() {
		return pgen.hasMore();
	}
	
	/*
	 * Returns the next variation of the list of elements
	 */
	public LayoutType[] next() {
		return (LayoutType[])pgen.nextPermutationAsArray();
	}
	
	// Debug
	public static void main(String args[]){
		LayoutType array[] = {
				LayoutType.HORIZONTAL_FLOW,
				LayoutType.VERTICAL_FLOW,
				LayoutType.BORDER,
				LayoutType.GRID,
		};
		VariationGenerator gen = new VariationGenerator(array);
		while (gen.hasMore()){
			for (LayoutType s: gen.next()){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}
