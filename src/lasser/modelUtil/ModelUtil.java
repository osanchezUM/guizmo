package lasser.modelUtil;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelUtil {
	
	/*
	 * Serializes a model
	 */
	public static void serialize(EObject root, String filename) throws java.io.IOException{

		URI fileURI = URI.createFileURI(filename);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    "*", new XMIResourceFactoryImpl());
		
		
		Resource resource = resourceSet.createResource(fileURI);
		resource.getContents().add(root);
		
		HashMap<String,Object> options = new HashMap<String,Object>();
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		
		resource.save(options);
	}
}
