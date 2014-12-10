package lasser.wireframe2sketch;

import lasser.modelUtil.ModelUtil;
import lasser.sketch.SketchRoot;

public class TestWireframe2Sketch {
	public static void main(String args[]) throws Exception{
		String basename = "ex1";
		String wireframeModel = "C:/EclipseDSDM/workspace/lasser.wireframe2sketch/input/"+basename+".screen";
		String sketchModel = "C:/EclipseDSDM/workspace/lasser.wireframe2sketch/models/"+basename+"_sket.xmi";
		
		SketchRoot root = WireframeSketcher2Sketch.execute(wireframeModel);
		ModelUtil.serialize(root, sketchModel);
	}
}
