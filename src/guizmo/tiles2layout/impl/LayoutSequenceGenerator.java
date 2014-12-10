package guizmo.tiles2layout.impl;

import guizmo.tiles2layout.LayoutType;

public class LayoutSequenceGenerator {

	private static LayoutType variation[];
	private static int counter;
	
	/*
	 * The parameter is the variation that has been obtained by means
	 * of a VariationGenerator object
	 */
	public LayoutSequenceGenerator(LayoutType variation[]){
		this.variation = variation;
		counter = 0;
	}
	
	/*
	 * Returns the following element of the generated sequence without advancing in the sequence
	 */
	public LayoutType peek(){
		return variation[counter % variation.length];
	}
	
	/*
	 * Returns the following element of the generated sequence
	 */
	public LayoutType next(){
		return variation[counter++ % variation.length];
	}
	
	/*
	 * Sets the sequence pointer to the beginning
	 */
	public void reset(){
		counter = 0;
	}
	
	/*
	 * Returns the number of times that the generator has been invoked
	 */
	public int getSequenceLength(){
		return counter;
	}
	
	// Debug
	public static void main(String args[]){
		LayoutType array[] = {
				LayoutType.HORIZONTAL_FLOW,
				LayoutType.VERTICAL_FLOW,
				LayoutType.BORDER,
				LayoutType.GRID,
		};
		LayoutSequenceGenerator gen = new LayoutSequenceGenerator(array);
		for (int i=0; i<10; ++i){
			System.out.println(i+": "+gen.next());
		}
	}

}
