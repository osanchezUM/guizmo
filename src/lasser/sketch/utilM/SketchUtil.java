package lasser.sketch.utilM;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import lasser.sketch.SketchPackage;
import lasser.sketch.SketchRoot;

public class SketchUtil {
	
	/*
	 * 
	 */
	public static SketchRoot load(String modelPath){
		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
		SketchPackage wireframePkg = SketchPackage.eINSTANCE;
		
		ResourceSet resSet = new ResourceSetImpl();
		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		
		String absModelPath = new File(modelPath).getAbsolutePath();
		URI uri = URI.createFileURI(absModelPath);
		Resource resource = resSet.getResource(uri, true);
		SketchRoot root = (SketchRoot) resource.getContents().get(0);
		
		return root;
	}
	
	

}
