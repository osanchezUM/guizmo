package guizmo.structure2tiles;

import guizmo.tiles.Tile;

public interface TilePositionComparator {
	
	/**
	 * Calculates the horizontal separation in pixels of a pair of tiles.
	 * IMPORTANT: The measure is obtained from the elements that originated the tiles,
	 * which is carried out by querying the traces.
	 * Pre: the tiles are not overlapped
	 * 
	 * @param t1 First tile
	 * @param t2 Second tile
	 * @return The horizontal distance between the tiles
	 */
	public int getHDistance(Tile t1, Tile t2);
	
	/**
	 * Calculates the vertical separation in pixels of a pair of tiles.
	 * IMPORTANT: The measure is obtained from the elements that originated the tiles,
	 * which is carried out by querying the traces.
	 * Pre: the tiles are not overlapped
	 * 
	 * @param t1 First tile
	 * @param t2 Second tile
	 * @return The vertical distance between the tiles
	 */
	public int getVDistance(Tile t1, Tile t2);
	
	/**
	 * Indicates if the tiles are (more or less) horizontally aligned
	 * (i.e. the projection of both tiles with some margin in the Y-axis is not empty)
	 * IMPORTANT: The comparation is carried out with the elements that originated the tiles,
	 * and this is done by querying the traces.
	 * 
	 * @param t1 First tile
	 * @param t2 Second tile
	 * @return
	 */
	public boolean areHorizontal(Tile t1, Tile t2);
	
	/**
	 * Indicates if the tiles are overlapped
	 * IMPORTANT: The comparation is carried out with the elements that originated the tiles,
	 * and this is done by querying the traces.
	 * 
	 * @param t1 First tile
	 * @param t2 Second tile
	 * @return True if the tiles are overlapped
	 */
	public boolean areOverlapped(Tile t1, Tile t2);
}
