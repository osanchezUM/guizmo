package guizmo.layout.utilM;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import guizmo.layout.LayoutPackage;
import guizmo.layout.LayoutRoot;

public class LayoutUtil {

	
	/*
	 * Loads the EMF models from an XMI file
	 */
	public static LayoutRoot loadModel(String layoutModelPath){
		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
		LayoutPackage layoutPackage = LayoutPackage.eINSTANCE;
		
		ResourceSet resSet = new ResourceSetImpl();
		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		
		String absoluteLayoutModelPath = new File(layoutModelPath).getAbsolutePath();
		URI layoutUri = URI.createFileURI(absoluteLayoutModelPath);
		Resource layoutResource = resSet.getResource(layoutUri, true);
		
		LayoutRoot layoutRoot = (LayoutRoot)layoutResource.getContents().get(0);
		return layoutRoot;
	}
}
