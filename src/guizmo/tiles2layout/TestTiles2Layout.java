package guizmo.tiles2layout;

public class TestTiles2Layout {
	
	private static void testLayout(String basename) throws Exception{
		String strucModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2structure/models/"+basename+"_struc.xmi";
		String lowLayoutModelPath = "C:/EclipseDSDM/workspace/guizmo.structure2tiles/models/"+basename+"_tiles.xmi";
		String layoutModelPath = "C:/EclipseDSDM/workspace/guizmo.tiles2layout/models/"+basename+"_lyt.xmi";
		String debugFilePath = "C:/EclipseDSDM/workspace/guizmo.tiles2layout/debug.txt";
		
		
		//lowLayoutModelPath = "C:/EclipseDSDM/workspace/org.usixml.usireverse.html2tiles/models/"+basename+"_reduced_tiles.xmi";
		Tiles2Layout.execute(strucModelPath, lowLayoutModelPath, layoutModelPath, true, debugFilePath);
		
	}
	
	public static void main(String args[]) throws Exception{
		testLayout(
				//"uclouvain"
				//"ask"
				//"ask_us"
				//"yahoo"
				//"tiendaNokia2"
				"petstore"
				//"kayak"
		);
	}
}
