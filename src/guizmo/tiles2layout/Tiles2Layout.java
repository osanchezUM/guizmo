package guizmo.tiles2layout;


import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import guizmo.layout.LayoutRoot;
import guizmo.structure.StructureRoot;
import guizmo.tiles.LowLayoutRoot;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.tiles2layout.impl.*;
import guizmo.tiles2layout.LayoutType;
import guizmo.util.ModelUtil;


public class Tiles2Layout {

	private static StructureRoot structureRoot;
	private static LowLayoutRoot graphRoot;
	private static LayoutRoot layoutRoot;
	

	public static void execute(String structureModel, String graphLayoutModel, String layoutModel)
			throws Tiles2LayoutException{
		execute(structureModel, graphLayoutModel, layoutModel, null, false, null, -1, -1, -1, 0);
	}
	
	public static void execute(String structureModel, String graphLayoutModel, String layoutModel, 
			boolean debugMode, String debugFile) throws Tiles2LayoutException{
		execute(structureModel, graphLayoutModel, layoutModel, null, debugMode, debugFile, -1, -1, -1, 0);
	}
	
	public static void execute(String structureModel, String graphLayoutModel, String layoutModel, 
			LayoutType layoutsToUse[], boolean debugMode, String debugFile) throws Tiles2LayoutException{
		execute(structureModel, graphLayoutModel, layoutModel, layoutsToUse, debugMode, debugFile, -1, -1, -1, 0);
	}
	
	/**
	 * Generates a layout model from a low layout model (tile model)
	 * 
	 * @param structureModel The source structure model path
	 * @param graphLayoutModel The source tile model path
	 * @param layoutModel The target layout model path
	 * @param layoutsToUse The set of layouts that can be used (from the predefined set)
	 * @param debugMode It enables the debug mode (prints information)
	 * @param debugFile If specified, the debug information ends up in the debug file
	 * @param hAlignmentMargin Sets the horizontal alignment margin (left and right). -1 if not defined
	 * @param vAlignmentMargin Sets the vertical alignment margin (top and bottom). -1 if not defined
	 * @param marginDiff Minimum difference between margins for them to be considered as different
	 * @param comparisonMargin The number of pixels of margin used to compare relative positions. 0 if not defined
	 * @throws Tiles2LayoutException
	 */
	public static void execute(String structureModel, String graphLayoutModel, String layoutModel, 
			LayoutType layoutsToUse[], boolean debugMode, String debugFile, float hAlignmentMargin,
			float vAlignmentMargin, float marginDiff, int comparisonMargin) throws Tiles2LayoutException{
		
		loadModels(structureModel, graphLayoutModel);

		LayoutAnalyzer.setDebug(debugMode);
		if (debugFile != null){
			try{
				LayoutAnalyzer.setDebugFile(debugFile);
			}catch(IOException e){
				throw new Tiles2LayoutException(e.getMessage());
			}
		}
		layoutRoot = LayoutAnalyzer.inferLayout(structureRoot, graphRoot, 
				layoutsToUse, hAlignmentMargin, vAlignmentMargin, marginDiff, comparisonMargin);
		if (debugMode && debugFile != null)
			try{
				LayoutAnalyzer.closeFile();
			}catch(IOException e){
				throw new Tiles2LayoutException(e.getMessage());
			}
		try {
			//serialize(layoutModel);
			ModelUtil.serialize(layoutRoot, layoutModel);
		} catch (IOException e) {
			throw new Tiles2LayoutException(e.getMessage());
		}
	}
	
	/*
	 * Loads an EMF model from an XMI file
	 */
	private static void loadModels(String structureModel, String tileModel){
		EObject models[] = TileUtil.loadModels(structureModel, tileModel);
		structureRoot = (StructureRoot)models[0];
		graphRoot = (LowLayoutRoot)models[1];
	}

	
	public static void main(String[] args) throws Exception{
		String basename = "ex2";
		String strucModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2structure/models/"+basename+"_struc.xmi";
		String tilesModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2layout/models/"+basename+"_tiles.xmi";
		String layoutModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2layout/models/"+basename+"_lyt.xmi";
		String debugFilePath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2layout/debug.txt";
		//LayoutType layouts[] = {LayoutType.HORIZONTAL_FLOW};
		//LayoutType layouts[] = {LayoutType.HORIZONTAL_FLOW, LayoutType.VERTICAL_FLOW};
		//LayoutType layouts[] = {LayoutType.HORIZONTAL_FLOW, LayoutType.VERTICAL_FLOW, LayoutType.BORDER};
		LayoutType layouts[] = {LayoutType.HORIZONTAL_FLOW, LayoutType.VERTICAL_FLOW, LayoutType.BORDER, LayoutType.GRID};
		//LayoutType layouts[] = {LayoutType.GRID, LayoutType.VERTICAL_FLOW};
		execute(strucModelPath, tilesModelPath, layoutModelPath, layouts, true, debugFilePath);
		//execute(strucModelPath, tilesModelPath, layoutModelPath, layouts, true, null);
	}

}
