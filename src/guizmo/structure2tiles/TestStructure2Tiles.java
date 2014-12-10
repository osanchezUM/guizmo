package guizmo.structure2tiles;

public class TestStructure2Tiles {
	
	private static void testLayout(String basename) throws Exception{
		String strucModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2structure/models/"+basename+"_struc.xmi";
		String lowLayoutModelPath = "C:/EclipseDSDM/workspace/guizmo.structure2tiles/models/"+basename+"_tiles.xmi";
		
		float maxClusterDeviation = 15f;
		float limits[] = {0.007f, 0.07f, 0.2f};
		Structure2Tiles.execute(strucModelPath, lowLayoutModelPath, limits, maxClusterDeviation);
		
	}
	
	public static void main(String args[]) throws Exception{
		testLayout(
				//"uclouvain"
				//"ask"
				//"ask_us"
				//"yahoo"
				"tiendaNokia2"
				//"petstore"
				//"kayak"
		);
	}
}
