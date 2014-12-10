package lasser.sketch2structure;

import java.util.List;

import lasser.mtraces.MtracesFactory;
import lasser.mtraces.TraceRoot;
import lasser.regions.Region;
import lasser.sketch.SketchRoot;
import lasser.sketch.utilM.SketchUtil;

import guizmo.structure.StructureRoot;

public class Sketch2Structure {
	
	private TraceRoot traceRoot;
	private SketchRoot sketchRoot;
	
	public TraceRoot getTraceModel(){
		if (traceRoot == null)
			throw new RuntimeException("The traces have not been created");
		else
			return traceRoot;
	}
	
	public SketchRoot getSketchRoot(){
		if (sketchRoot == null)
			throw new RuntimeException("The sketch model has not been loaded");
		else
			return sketchRoot;
	}
	
	/*
	 * 
	 */
	public StructureRoot execute(String modelPath){
		MtracesFactory tfactory = MtracesFactory.eINSTANCE;
		traceRoot = tfactory.createTraceRoot();
		sketchRoot = SketchUtil.load(modelPath);
		List<Region> rootRegions = RegionExtractor.getRegions(sketchRoot);
		return StructureTransformation.execute(sketchRoot, rootRegions, traceRoot);
	}
	

}
