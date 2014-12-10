package guizmo.structure2tiles;

import guizmo.tiles.ClosenessType;
import guizmo.tiles.Relation;
import guizmo.tiles.Tile;
import guizmo.tiles.utilM.TileUtil;

public class FixedClosenessClustering implements ClosenessClustering{

	private static final float DEFAULT_VERY_CLOSE_LIMIT = 0.015f;
	private static final float DEFAULT_CLOSE_LIMIT = 0.06f;
	private static final float DEFAULT_FAR_LIMIT = 0.15f;
	private static final int DEFAULT_VERY_CLOSE_LIMIT_PX = 10;
	private static final int DEFAULT_CLOSE_LIMIT_PX = 80;
	private static final int DEFAULT_FAR_LIMIT_PX = 160;
	
	private float very_close_limit;
	private float close_limit;
	private float far_limit;
	private int very_close_limit_px;
	private int close_limit_px;
	private int far_limit_px;
	private Tile container;
	
	private boolean debug = false;
	
	public FixedClosenessClustering(Tile container){
		this.container = container;
		this.very_close_limit = DEFAULT_VERY_CLOSE_LIMIT;
		this.close_limit = DEFAULT_CLOSE_LIMIT;
		this.far_limit = DEFAULT_FAR_LIMIT;
		this.very_close_limit_px = DEFAULT_VERY_CLOSE_LIMIT_PX;
		this.close_limit_px = DEFAULT_CLOSE_LIMIT_PX;
		this.far_limit_px = DEFAULT_FAR_LIMIT_PX;
	}
	
	public FixedClosenessClustering(Tile container, float very_close_limit, 
			float close_limit, float far_limit){
		this.container = container;
		this.very_close_limit = very_close_limit;
		this.close_limit = close_limit;
		this.far_limit = far_limit;
		this.very_close_limit_px = DEFAULT_VERY_CLOSE_LIMIT_PX;
		this.close_limit_px = DEFAULT_CLOSE_LIMIT_PX;
		this.far_limit_px = DEFAULT_FAR_LIMIT_PX;
	}
	
	public FixedClosenessClustering(Tile container, int very_close_limit_px, 
			int close_limit_px, int far_limit_px){
		this.container = container;
		this.very_close_limit = DEFAULT_VERY_CLOSE_LIMIT;
		this.close_limit = DEFAULT_CLOSE_LIMIT;
		this.far_limit = DEFAULT_FAR_LIMIT;
		this.very_close_limit_px = very_close_limit_px;
		this.close_limit_px = close_limit_px;
		this.far_limit_px = far_limit_px;
	}
	
	public FixedClosenessClustering(Tile container, float very_close_limit, 
			float close_limit, float far_limit, int very_close_limit_px, 
			int close_limit_px, int far_limit_px){
		this.container = container;
		this.very_close_limit = very_close_limit;
		this.close_limit = close_limit;
		this.far_limit = far_limit;
		this.very_close_limit_px = very_close_limit_px;
		this.close_limit_px = close_limit_px;
		this.far_limit_px = far_limit_px;
	}
	
	/*
	 * (non-Javadoc)
	 * @see guizmo.structure2tiles.ClosenessClustering#estimateCloseness(guizmo.tiles.Relation)
	 */
	public ClosenessType estimateCloseness(Relation relation) {
		if (TileUtil.isHorizontal(relation))
			return estimateHCloseness(relation.getSource(), relation.getTarget());
		else
			return estimateVCloseness(relation.getSource(), relation.getTarget());
	}
	
	private ClosenessType estimateHCloseness(Tile t1, Tile t2) {
		int wancestor = container.getXMaxPos() - container.getXMinPos() + 1;
		//int wancestor = ancestor.getXMaxPos() - ancestor.getXMinPos() + 1;
		
		//int wsep = t2.getXMinPos() - t1.getXMaxPos() - 1;
		//int distance = getCalculatedDistance(t1, t2);
		//int distance = tileComparator.getHDistance(t1, t2);
		int distance = t2.getXMinPos() - t1.getXMaxPos();
		
		if (debug){
		System.out.println("H Closeness ("+t1.getName()+","+t2.getName()+"): "+
				distance + " -> "+(distance / (float)wancestor) +
				" ["+estimateCloseness1D(distance, wancestor).toString()+"]"
				);
		}
		if (distance < 0)
			throw new RuntimeException("NEGATIVE DISTANCE BETWEEN "+t1.getName()+" &&& "+t2.getName());
		
		return estimateCloseness1D(distance, wancestor);
	}

	private ClosenessType estimateVCloseness(Tile t1, Tile t2) {
		int hancestor = container.getYMaxPos() - container.getYMinPos() + 1;
		
		//int hancestor = ancestor.getYMaxPos() - ancestor.getYMinPos() + 1;
		//int hsep = t2.getYMinPos() - t1.getYMaxPos() - 1;
		//int distance = getCalculatedDistance(t1, t2);
		//int distance = tileComparator.getVDistance(t1, t2);
		int distance = t2.getYMinPos() - t1.getYMaxPos();
		
		if (debug){
		System.out.println("V Closeness ("+t1.getName()+","+t2.getName()+"): "+
				distance + " -> "+(distance / (float)hancestor) + 
				" ["+estimateCloseness1D(distance, hancestor).toString()+"]"
				);
		}
		if (distance < 0)
			throw new RuntimeException("NEGATIVE DISTANCE BETWEEN "+t1.getName()+" &&& "+t2.getName());
		
		return estimateCloseness1D(distance, hancestor);
	}
	
	
	/*
	 * Auxiliary method to calculate the closeness
	 */
	private ClosenessType estimateCloseness1D(int tileSep, int totalWidth){
		float percentage = tileSep / (float)totalWidth;
		if (tileSep <= very_close_limit_px || percentage <= very_close_limit){
			if (percentage < 0)
				System.err.println("[ERROR] Wrong distance for the tile: "+tileSep);
			return ClosenessType.VERY_CLOSE;
		}else if (tileSep <= close_limit_px || percentage <= close_limit)
			return ClosenessType.CLOSE;
		else if (tileSep <= far_limit_px || percentage <= far_limit)
			return ClosenessType.FAR;
		else
			return ClosenessType.VERY_FAR;
	}

}
