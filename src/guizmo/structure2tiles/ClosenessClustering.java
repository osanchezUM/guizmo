package guizmo.structure2tiles;

import guizmo.tiles.ClosenessType;
import guizmo.tiles.Relation;
import guizmo.tiles.Tile;

public interface ClosenessClustering {
	public ClosenessType estimateCloseness(Relation relation);
}
