package guizmo.structure2tiles;

import java.io.IOException;

import guizmo.structure.utilM.StructureUtil;
import guizmo.structure2tiles.TileExtractor;
import guizmo.tiles.LowLayoutRoot;
import guizmo.util.ModelUtil;
import guizmo.structure.StructureRoot;

public class Structure2Tiles {
	
	/*
	 * Executes the transformation to get the low layout model
	 */
	public static void execute(String strucModelPath, String lowLayoutModelTempPath) throws IOException{
		execute(strucModelPath, lowLayoutModelTempPath, null, 0);
	}
	
	/*
	 * Executes the transformation to get the low layout model
	 */
	public static void execute(String strucModelPath, String lowLayoutModelTempPath, float closenessLimits[], float maxClusterDeviation
			) throws IOException{
		StructureRoot strucRoot = StructureUtil.loadModel(strucModelPath);

		TileExtractor textractor = new TileExtractor(strucRoot);
		if (closenessLimits != null)
			textractor.setClosenessLimits(closenessLimits);
		if (maxClusterDeviation > 0)
			textractor.setMaxClusterDeviation(maxClusterDeviation);
		LowLayoutRoot lowLayoutRoot = textractor.genTileModel();
		
		ModelUtil.serialize(lowLayoutRoot, lowLayoutModelTempPath);
	}
	

}
