package lasser.wireframe2sketch;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import lasser.sketch.SketchRoot;

import com.wireframesketcher.model.*;

public class WireframeSketcher2Sketch {
	
	/*
	 * 
	 */
	public static SketchRoot execute(String modelPath){
		Screen screen = loadModel(modelPath);
		return WireframeTransformation.execute(screen);
	}
	
	/*
	 * 
	 */
	public static Screen loadModel(String modelPath){
		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
		ModelPackage wireframePkg = ModelPackage.eINSTANCE;
		
		ResourceSet resSet = new ResourceSetImpl();
		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		
		String absWireframeModelPath = new File(modelPath).getAbsolutePath();
		
		URI wireframeUri = URI.createFileURI(absWireframeModelPath);

		Resource wireframeResource = resSet.getResource(wireframeUri, true);
		
		Screen wireframeRoot = (Screen) wireframeResource.getContents().get(0);
		
		return wireframeRoot;
	}
	
}
