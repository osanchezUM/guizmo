package guizmo.structure.utilM;

import guizmo.structure.StructurePackage;
import guizmo.structure.StructureRoot;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class StructureUtil {
	
	/*
	 * Loads an EMF model from an XMI file
	 */
	public static StructureRoot loadModel(String strucModelPath){
		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
		StructurePackage strucPackage = StructurePackage.eINSTANCE;
		
		ResourceSet resSet = new ResourceSetImpl();
		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		String absoluteStrucModelPath = new File(strucModelPath).getAbsolutePath();
		URI strucUri = URI.createFileURI(absoluteStrucModelPath);
		Resource strucResource = resSet.getResource(strucUri, true);
		StructureRoot strucRoot = (StructureRoot) strucResource.getContents().get(0);
		
		return strucRoot;
	}
}
