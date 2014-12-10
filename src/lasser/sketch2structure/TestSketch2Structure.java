package lasser.sketch2structure;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import guizmo.structure.StructureRoot;

import lasser.modelUtil.ModelUtil;
import lasser.mtraces.TraceRoot;
import lasser.sketch.SketchRoot;

public class TestSketch2Structure {
	public static void main(String args[]) throws Exception{
		String basename = "ex1";
		String sketchModel = "C:/EclipseDSDM/workspace/lasser.wireframe2sketch/models/"+basename+"_sket.xmi";
		String strucModel = "C:/EclipseDSDM/workspace/lasser.sketch2structure/models/"+basename+"_struc.xmi";
		String traceModel = "C:/EclipseDSDM/workspace/lasser.sketch2structure/models/"+basename+"_trace.xmi";
		
		Sketch2Structure sk2st = new Sketch2Structure();
		StructureRoot root = sk2st.execute(sketchModel);
		TraceRoot troot = sk2st.getTraceModel();
		ModelUtil.serialize(root, strucModel);
		ModelUtil.serialize(troot, traceModel);
	}
	
}
