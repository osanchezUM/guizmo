package guizmo.swingGenerator;

import java.io.FileNotFoundException;

import guizmo.layout.LayoutRoot;
import guizmo.layout.utilM.LayoutUtil;
import guizmo.structure.StructureRoot;
import guizmo.structure.utilM.StructureUtil;

public class SwingGenerator {
	
	private static StructureRoot strucRoot;
	private static LayoutRoot layoutRoot;
	
	public static void execute(String structureModel, String layoutModel, String outputDir)
			throws FileNotFoundException{
		loadModels(structureModel, layoutModel);
		SwingTemplate.generate(strucRoot, layoutRoot, outputDir);
	}
	
	/*
	 * Loads the EMF models from an XMI file
	 */
	private static void loadModels(String strucModelPath, String layoutModelPath){
//		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
//		GuiStructurePackage strucPackage = GuiStructurePackage.eINSTANCE;
//		LayoutPackage layoutPackage = LayoutPackage.eINSTANCE;
//		
//		ResourceSet resSet = new ResourceSetImpl();
//		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
//		m.put("*", new XMIResourceFactoryImpl());
//		
//		String absoluteStrucModelPath = new File(strucModelPath).getAbsolutePath();
//		String absoluteLayoutModelPath = new File(layoutModelPath).getAbsolutePath();
//		
//		URI strucUri = URI.createFileURI(absoluteStrucModelPath);
//		URI layoutUri = URI.createFileURI(absoluteLayoutModelPath);
//
//		Resource strucResource = resSet.getResource(strucUri, true);
//		Resource layoutResource = resSet.getResource(layoutUri, true);
		
		strucRoot = StructureUtil.loadModel(strucModelPath);
		layoutRoot = LayoutUtil.loadModel(layoutModelPath);
	}
	
	public static void main(String args[]) throws Exception{
		SwingGenerator.execute("models/ex1_struc.xmi", "models/ex1_lyt.xmi", "output");
	}
}
