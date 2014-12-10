package guizmo.structure2tiles;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import guizmo.tiles.ClosenessType;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.LowLayoutRoot;
import guizmo.tiles.TilesFactory;
import guizmo.tiles.Relation;
import guizmo.tiles.SimpleTile;
import guizmo.tiles.Tile;
import guizmo.tiles.TileType;
import guizmo.tiles.VAlignmentType;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles.utilM.TileUtil;
import guizmo.structure.ComposableWidget;
import guizmo.structure.Container;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalElement;
import guizmo.structure.GraphicalView;
import guizmo.structure.Locatable;
import guizmo.structure.OutputText;
import guizmo.structure.SingleWidget;
import guizmo.structure.StructureRoot;
import guizmo.structure.Widget;
import guizmo.structure.utilM.StructureHelper;

import static java.lang.System.out;

public class TileExtractor {
	
	private static final String TAB = "   ";
	private static final String SEP = "___";
	
	private static final float DEFAULT_HMARGIN = 0.2f;
	private static final float DEFAULT_VMARGIN = 0.2f;
	
	private float very_close_limit;
	private float close_limit;
	private float far_limit;
	private int very_close_limit_px;
	private int close_limit_px;
	private int far_limit_px;
	private float hmargin;
	private float vmargin;
	private float maxClusterDeviation;
	private boolean debug = true;
	
	private StructureRoot strucRoot = null;
	private LowLayoutRoot lowLayoutRoot = null;
	private TilesFactory factory = null;
	//private TilePositionComparator tileComparator = null;

	//public TileExtractor(StructureRoot strucRoot, TilePositionComparator tileComparator){
	public TileExtractor(StructureRoot strucRoot){
		this.strucRoot = strucRoot;
		//this.tileComparator = tileComparator;
//		very_close_limit = DEFAULT_VERY_CLOSE_LIMIT;
//		close_limit = DEFAULT_CLOSE_LIMIT;
//		far_limit = DEFAULT_FAR_LIMIT;
//		very_close_limit_px = DEFAULT_VERY_CLOSE_LIMIT_PX;
//		close_limit_px = DEFAULT_CLOSE_LIMIT_PX;
//		far_limit_px = DEFAULT_FAR_LIMIT_PX;
		hmargin = DEFAULT_HMARGIN;
		vmargin = DEFAULT_VMARGIN;
	}
	
	public TileExtractor(StructureRoot strucModel, 
			TilePositionComparator tileComparator, float closenessLimits[], int closenessLimitsPx[]){
		//this.tileComparator = tileComparator;
		setClosenessLimits(closenessLimits);
		setClosenessLimitsPx(closenessLimitsPx);
		hmargin = DEFAULT_HMARGIN;
		vmargin = DEFAULT_VMARGIN;
	}
	
	public TileExtractor(StructureRoot strucModel, 
			TilePositionComparator tileComparator, float closenessLimits[], int closenessLimitsPx[], float hmargin, float vmargin){
		//this.tileComparator = tileComparator;
		setClosenessLimits(closenessLimits);
		setClosenessLimitsPx(closenessLimitsPx);
		this.hmargin = hmargin;
		this.vmargin = vmargin;
	}
	
	/**
	 * Sets the limits to distinguish between the different closeness levels
	 * @parameter closenessLimits. 
	 * If percentage_distance < closenessLimits[0] -> VERY_CLOSE
	 * Else if percentage_distance < closenessLimits[1] -> CLOSE
	 * Else if percentage_distance < closenessLimits[2] -> FAR
	 * Else VERY_FAR
	 */
	public void setClosenessLimits(float closenessLimits[]){
		if (closenessLimits == null || closenessLimits.length != 3 || 
				closenessLimits[0] >= closenessLimits[1] || closenessLimits[1] >= closenessLimits[2])
			throw new RuntimeException("Define 3 limits: VERY_CLOSE-CLOSE, CLOSE-FAR, FAR-VERY_FAR");
		very_close_limit = closenessLimits[0];
		close_limit = closenessLimits[1];
		far_limit = closenessLimits[2];
	}
	
	/**
	 * Sets the limits to distinguish between the different closeness levels
	 * @parameter closenessLimits. 
	 * If distance_px < closenessLimits[0] -> VERY_CLOSE
	 * Else if distance_px < closenessLimits[1] -> CLOSE
	 * Else if distance_px < closenessLimits[2] -> FAR
	 * Else VERY_FAR
	 */
	public void setClosenessLimitsPx(int closenessLimits[]){
		if (closenessLimits == null || closenessLimits.length != 3 || 
				closenessLimits[0] >= closenessLimits[1] || closenessLimits[1] >= closenessLimits[2])
			throw new RuntimeException("Define 3 limits: VERY_CLOSE-CLOSE, CLOSE-FAR, FAR-VERY_FAR");
		very_close_limit_px = closenessLimits[0];
		close_limit_px = closenessLimits[1];
		far_limit_px = closenessLimits[2];
	}
	
	/**
	 * Sets the maximum deviation of the elements that make up the clusters
	 * @parameter deviation The maximum deviation of the elements
	 * The clustering is used to define the closeness levels
	 */
	public void setMaxClusterDeviation(float deviation){
		if (deviation > 0){
			maxClusterDeviation = deviation;
		}
	}
	
	/*
	 * Obtains the tile model
	 */
	public LowLayoutRoot genTileModel(){
		
		// Create the layout root
		factory = TilesFactory.eINSTANCE;
		
		// ------------------------------
		// Phase 1: create tiles
		// ------------------------------
		lowLayoutRoot = factory.createLowLayoutRoot();
		// For each view (window), generate the layout
		for (GraphicalView v: strucRoot.getViews()){
			genViewLayout(v);
		}
		
		// ------------------------------
		// Phase 2: relate tiles
		// ------------------------------
		for (Tile t: lowLayoutRoot.getViewTiles()){
			relateTilesRecursively(t);
		}
		
		// ------------------------------
		// Phase 3: set closeness levels
		// ------------------------------
		for (Tile t: lowLayoutRoot.getViewTiles()){
			setClosenessRecursively(t);
		}
		
		// ------------------------------
		// Phase 4: correct closeness levels for cycles of elements
		// ------------------------------
		// This fails for windows such as OTG_CONTRATOS_EXCEL_rad.xmi
//		for (Tile t: lowLayoutRoot.getViewTiles()){
//			correctSquareClosenessRecursively(t);
//		}
		
		// ------------------------------
		// Phase 5: align tiles
		// ------------------------------
		for (Tile t: lowLayoutRoot.getViewTiles()){
			alignTilesRecursively(t);
		}
		
		printLayoutTree();
		// Return the layout tree
		return lowLayoutRoot;
	}
	
	
	/*************************************************************************/
	
	
	/*
	 * Creates a coarse grained tile
	 */
	private SimpleTile createCoarseTile(GraphicalElement elem){
		SimpleTile tile = factory.createSimpleTile();
		tile.setName(elem.getName());
		tile.setTileType(TileType.COARSE);
		tile.setElement(elem);
		if (elem instanceof Locatable)
			copyCoordinates((Locatable)elem, tile);
		else{
			throw new RuntimeException("The element '"+elem.getId()+"' should be locatable");
		}
		
		return tile;
	}
	
	/*
	 * Creates an item tile
	 */
	private SimpleTile createItemTile(SingleWidget elem){
		SimpleTile tile = factory.createSimpleTile();
		//tile.setName(getReadableName(elem));
		tile.setName(elem.getId());
		tile.setElement(elem);
		tile.setTileType(TileType.ITEM);
		copyCoordinates(elem, tile);
		return tile;
	}
	
	/*
	 * Generates the layout for a view
	 */
	private void genViewLayout(GraphicalView view){
		SimpleTile vtile = createCoarseTile(view);
		if (view.getId() != null && !view.getId().trim().equals("")){
			vtile.setName(view.getId());
		}else{
			vtile.setName(view.getName());
		}
		vtile.setHSize(1f);
		vtile.setVSize(1f);
		lowLayoutRoot.getViewTiles().add(vtile);
		
		if (!view.getWidgets().isEmpty()){
			
			// The children are regions
			if (view.getWidgets().get(0) instanceof GUIRegion){
				for (Widget reg : view.getWidgets()){
					genTiles((GUIRegion)reg, vtile);
				}
			}
			
			// The children are widgets
			else{
				for (Widget w: view.getWidgets()){
					Tile itile = createItemTile((SingleWidget)w);
					fillHVPercentages((Locatable)view, (Locatable)w, itile);
					//setAlignment((Locatable)view, (Locatable)w, itile);
					vtile.getSubtiles().add(itile);
				}
			}
			
		}
	}
	
	/*
	 * Generates the layout for a region
	 */
	private void genTiles(GUIRegion region, Tile parentTile){
		SimpleTile rtile = createCoarseTile(region);
		fillHVPercentages((Locatable)region.eContainer(), region, rtile);
		//setAlignment((Locatable)region.eContainer(), region, rtile);
		parentTile.getSubtiles().add(rtile);
		
		// The children are regions
		if (!region.getWidgets().isEmpty() && region.getWidgets().get(0) instanceof GUIRegion){
			for (ComposableWidget w: region.getWidgets()){
				genTiles((GUIRegion)w, rtile);
			}
			
		// The children are widgets
		}else{
			for (ComposableWidget w: region.getWidgets()){
				Tile itile = createItemTile((SingleWidget)w);
				fillHVPercentages(region, w, itile);
				//setAlignment(region, w, itile);
				rtile.getSubtiles().add(itile);
			}
		}
		
	}
	

	/*
	 * Copies the coordinates from the original element
	 */
	private void copyCoordinates(Locatable elem, Tile tile){
		GraphicalElement gelem = (GraphicalElement) elem;
		if (elem.getXmin() < 0)
			throw new RuntimeException("Error in structure model. XMIN is wrong for "+gelem.getName());
		else	
			tile.setXMinPos(elem.getXmin());
		
		if (elem.getYmin() < 0)
			throw new RuntimeException("Error in structure model. YMIN is wrong for "+gelem.getName());
		else	
			tile.setYMinPos(elem.getYmin());
		
		if (elem.getXmax() < elem.getXmin())
			throw new RuntimeException("Error in structure model. XMAX is wrong for "+gelem.getName());
		else	
			tile.setXMaxPos(elem.getXmax());
		
		if (elem.getYmax() < elem.getYmin())
			throw new RuntimeException("Error in structure model. YMAX is wrong for "+gelem.getName());
		else	
			tile.setYMaxPos(elem.getYmax());
	}
	
	/*
	 * 
	 */
	private float getWidthPercentage(Locatable container, Locatable elem){
		int total = container.getXmax() - container.getXmin() + 1;
		int part = elem.getXmax() - elem.getXmin() + 1;
		float result = 1;
		if (part < total){
			result = part / (float)total;
			result = (float)(Math.rint(result * 100) / 100f);
		}
		return result;
	}
	
	/*
	 * 
	 */
	private float getHeightPercentage(Locatable container, Locatable elem){
		int total = container.getYmax() - container.getYmin() + 1;
		int part = elem.getYmax() - elem.getYmin() + 1;
		float result = 1;
		if (part < total){
			result = part / (float)total;
			result = (float)(Math.rint(result * 100) / 100f);
		}
		return result;
	}
	
	/*
	 * 
	 */
	private void fillHVPercentages(Locatable parent, Locatable child, Tile tile){
		float hsize = getWidthPercentage(parent, child);
		float vsize = getHeightPercentage(parent, child);
		tile.setHSize(hsize);
		tile.setVSize(vsize);
	}
	

	/*************************************************************************/
	
	
	/*
	 * Recursive method to set the {up, down, left, right} relations of the tiles
	 */
	private void relateTilesRecursively(Tile tile){
		
		relateTiles(tile);
		for (Tile t: tile.getSubtiles()){
			relateTilesRecursively(t);
		}
	}
	
	/*
	 * Set the {up, down, left, right} properties
	 */
	private void relateTiles(Tile tile){
//		// DEBUG
//		if (tile.getName() != null && tile.getName().equals("Ul_userTools_8")){
//			out.print("");
//		}
		
		int i=0;
		GraphicalView view = getView(tile.getElement());
		int n = tile.getSubtiles().size();
		while (i < n){
			int j=i+1;
			Tile t1 = tile.getSubtiles().get(i);
			ComposableWidget w1 = (ComposableWidget)t1.getElement();
			
			// Foreach pair of tiles t1, t2
			while (j < n){
				Tile t2 = tile.getSubtiles().get(j);
				ComposableWidget w2 = (ComposableWidget)t2.getElement();
				Tile tfirst = null;
				Tile tsecond = null;
				ComposableWidget wfirst = null; 
				ComposableWidget wsecond = null;
				ClosenessType closeness = null;
				boolean skip = false;
				
				// DEBUG
				if ( t1.getName().equals("RECT1_6") && t2.getName().equals("RECT2_7")){
					System.out.print("");
				}
				
				// Vertical
				if (StructureHelper.areVertical(w1, w2)){
					if (StructureHelper.areOverlapped(w1, w2)){
						if (w1 instanceof Container && w2 instanceof Container){
							
							ComposableWidget disj[] = 
									StructureHelper.getVClosestChildren((Container)w1, (Container)w2);
							if (disj[0] == null || disj[1] == null){
								throw new RuntimeException(
										"[TileExtractor] Couldn't get the vertical closest children for "+
												w1.getName()+"; "+w2.getName());
							}
							if (StructureHelper.isUp(disj[0], disj[1])){
								wfirst = disj[0];
								wsecond = disj[1];
							}else{
								wfirst = disj[1];
								wsecond = disj[0];
							}
							//closeness = estimateVCloseness(wfirst, wsecond, view);
						}
					}else if (StructureHelper.areVerticallyAdjacent(w1, w2)){
						if (StructureHelper.isUp(w1, w2)){
							wfirst = w1;
							wsecond = w2;
						}else{
							wfirst = w2;
							wsecond = w1;
						}
						//closeness = estimateVCloseness(wfirst, wsecond, view);
					}else{
						// The widgets are not adjacent
						skip = true;
					}
					if (StructureHelper.isUp(w1, w2)){
						tfirst = t1;
						tsecond = t2;
					}else{
						tfirst = t2;
						tsecond = t1;
					}
				
				// Horizontal
				}else if (StructureHelper.areHorizontal(w1, w2)){
					if (StructureHelper.areOverlapped(w1, w2)){
						if (w1 instanceof Container && w2 instanceof Container){
							ComposableWidget disj[] = 
									StructureHelper.getHClosestChildren((Container)w1, (Container)w2);
							if (disj[0] == null || disj[1] == null){
								throw new RuntimeException(
										"[TileExtractor] Couldn't get the horizontal closest children for "+
												w1.getName()+"; "+w2.getName());
							}
							if (StructureHelper.isLeft(disj[0], disj[1])){
								wfirst = disj[0];
								wsecond = disj[1];
							}else{
								wfirst = disj[1];
								wsecond = disj[0];
							}
							//closeness = estimateHCloseness(wfirst, wsecond, view);
						}
					}else if (StructureHelper.areHorizontallyAdjacent(w1, w2)){
						if (StructureHelper.isLeft(w1, w2)){
							wfirst = w1;
							wsecond = w2;
						}else{
							wfirst = w2;
							wsecond = w1;
						}
						//closeness = estimateHCloseness(wfirst, wsecond, view);
					}else{
						// The widgets are not adjacent
						skip = true;
					}
					if (StructureHelper.isLeft(w1, w2)){
						tfirst = t1;
						tsecond = t2;
					}else{
						tfirst = t2;
						tsecond = t1;
					}
					
				}else{
					// The widgets are disjoint
					skip = true;
				} // end_if
				
				// Create the new relation
				if (! skip){
					if (wfirst == null || wsecond == null){
						String msg = "Overlapping not resolved between: ";
						msg += t1.getName() + " (" + t1.getXMinPos() + ", " + t1.getYMinPos();
						msg += ", " + t1.getXMaxPos() + ", " + t1.getYMaxPos() + ") ; ";
						msg += t2.getName() + " (" + t2.getXMinPos() + ", " + t2.getYMinPos();
						msg += ", " + t2.getXMaxPos() + ", " + t2.getYMaxPos() + ") ; ";
						throw new RuntimeException(msg);
					}
					//tfirst.getDown().add(tsecond);
					Relation r = factory.createRelation();
					r.setName(tfirst.getName() + SEP + tsecond.getName());
					r.setXInterval(AllenUtil.getXIntervalType(wfirst, wsecond));
					r.setYInterval(AllenUtil.getYIntervalType(wfirst, wsecond));
					r.setSource(tfirst);
					r.setTarget(tsecond);
					//r.setCloseness(closeness);
					tile.getRelations().add(r);
				}
				
				++j;
			} // end_while
			++i;
		} // end_while
	}
	
//	/*
//	 * Estimates the closeness with regard to the X-axis for a pair of tiles
//	 * Pre: t1 is on the left of t2
//	 * Pre: the traces to the structure model are available
//	 */
//	private ClosenessType estimateHCloseness(ComposableWidget t1, ComposableWidget t2, GraphicalView root){
//		int wancestor = root.getXmax() - root.getXmin() + 1;
//		//int wancestor = ancestor.getXMaxPos() - ancestor.getXMinPos() + 1;
//		
//		//int wsep = t2.getXMinPos() - t1.getXMaxPos() - 1;
//		//int distance = getCalculatedDistance(t1, t2);
//		//int distance = tileComparator.getHDistance(t1, t2);
//		int distance = t2.getXmin() - t1.getXmax();
//		
//		if (debug){
//		System.out.println("H Closeness ("+t1.getName()+","+t2.getName()+"): "+
//				distance + " -> "+(distance / (float)wancestor) +
//				" ["+estimateCloseness1D(distance, wancestor).toString()+"]"
//				);
//		}
//		if (distance < 0)
//			throw new RuntimeException("NEGATIVE DISTANCE BETWEEN "+t1.getName()+" &&& "+t2.getName());
//		
//		return estimateCloseness1D(distance, wancestor);
//	}
//	
//	/*
//	 * Estimates the closeness with regard to the Y-axis for a pair of tiles
//	 * Pre: t1 is up to t2
//	 * Pre: the traces to the structure model are available
//	 */
//	private ClosenessType estimateVCloseness(ComposableWidget t1, ComposableWidget t2, GraphicalView root){
//		int hancestor = root.getYmax() - root.getYmin() + 1;
//		
//		//int hancestor = ancestor.getYMaxPos() - ancestor.getYMinPos() + 1;
//		//int hsep = t2.getYMinPos() - t1.getYMaxPos() - 1;
//		//int distance = getCalculatedDistance(t1, t2);
//		//int distance = tileComparator.getVDistance(t1, t2);
//		int distance = t2.getYmin() - t1.getYmax();
//		
//		if (debug){
//		System.out.println("V Closeness ("+t1.getName()+","+t2.getName()+"): "+
//				distance + " -> "+(distance / (float)hancestor) + 
//				" ["+estimateCloseness1D(distance, hancestor).toString()+"]"
//				);
//		}
//		if (distance < 0)
//			throw new RuntimeException("NEGATIVE DISTANCE BETWEEN "+t1.getName()+" &&& "+t2.getName());
//		
//		return estimateCloseness1D(distance, hancestor);
//	}
//	
//	/*
//	 * Auxiliary method to calculate the closeness
//	 */
//	private ClosenessType estimateCloseness1D(int tileSep, int totalWidth){
//		float percentage = tileSep / (float)totalWidth;
//		if (tileSep <= very_close_limit_px || percentage <= very_close_limit){
//			if (percentage < 0)
//				System.err.println("[ERROR] Wrong distance for the tile: "+tileSep);
//			return ClosenessType.VERY_CLOSE;
//		}else if (tileSep <= close_limit_px || percentage <= close_limit)
//			return ClosenessType.CLOSE;
//		else if (tileSep <= far_limit_px || percentage <= far_limit)
//			return ClosenessType.FAR;
//		else
//			return ClosenessType.VERY_FAR;
//	}
	
	/*
	 * Gets the view tile (the root tile for a window)
	 */
	private GraphicalView getView(GraphicalElement elem){
		if (elem instanceof GraphicalView)
			return (GraphicalView)elem;
		else
			return getView((GraphicalElement)elem.eContainer());
	}
	
//	/*
//	 * Gets the view tile (the root tile for a window)
//	 */
//	private Tile getRootTile(Tile tile){
//		Tile t = tile;
//		while (!(t.eContainer() instanceof LowLayoutRoot))
//			t = (Tile)t.eContainer();
//		return t;
//	}
	
	
	/*************************************************************************/
	
	/*
	 * 
	 */
	private void setClosenessRecursively(Tile tile){
		if (tile.getSubtiles().size() > 1){
			ClosenessClustering clustering = null;
			if (maxClusterDeviation > 0){
				 clustering =
					//new FixedClosenessClustering(tile);
					new AdaptableClosenessClustering(tile, maxClusterDeviation);
			}else{
				clustering = 
						//new FixedClosenessClustering(tile);
						new AdaptableClosenessClustering(tile);
			}
			for (Relation r: tile.getRelations()){
				ClosenessType closeness = clustering.estimateCloseness(r);
				r.setCloseness(closeness);
			}
		}
		for (Tile t: tile.getSubtiles()){
			if (t.getSubtiles().size() > 0)
				setClosenessRecursively(t);
		}
	}
	
	
	
	/*************************************************************************/
	
	
	/*
	 * 
	 */
	private void correctSquareClosenessRecursively(Tile tile){
		for (Tile t: tile.getSubtiles()){
			fixCircularCloseness(t);
			if (!t.getSubtiles().isEmpty())
				correctSquareClosenessRecursively(t);
		}
	}
	
	
	/*************************************************************************/
	
	
	/*
	 * Recursive method to set the {up, down, left, right} relations of the tiles
	 * It also sets the separation from the borders of the region
	 */
	private void alignTilesRecursively(Tile tile){
		alignTilesH(tile);
		alignTilesV(tile);
		for (Tile t: tile.getSubtiles()){
			if (!t.getSubtiles().isEmpty())
				alignTilesRecursively(t);
		}
	}
	
	/*
	 * Sets the horizontal and vertical alignment
	 */
	private void alignTilesH(Tile container){
		for (Tile t: container.getSubtiles()){
			List<Tile> leftTiles = new ArrayList<Tile>();
			getLeftChain(t, leftTiles);
			Tile mostLeft = null;
			if (leftTiles.isEmpty())
				mostLeft = t;
			else
				mostLeft = getMostLeft(leftTiles);
			List<Tile> rightTiles = new ArrayList<Tile>();
			getRightChain(t, rightTiles);
			Tile mostRight = null;
			if (rightTiles.isEmpty())
				mostRight = t;
			else
				mostRight = getMostRight(rightTiles);
			
			// ??? HOW IS THIS IMPLEMENTED
			// THE CHAIN OF WIDGETS SHOULD BE TAKEN INTO ACCOUNT, 
			// SO THE WIDGETS IN A GROUP HAVE THE SAME ALIGNMENT
			if (isLeftAligned(t, container)){
				t.setHorizontalAlignment(HAlignmentType.LEFT);
				if (isRightAligned(mostRight, container))
				;//	t.setHorizontalAlignment(HAlignmentType.LEFT);
				else
					for (Tile t1: rightTiles)
						t1.setHorizontalAlignment(HAlignmentType.LEFT);
			}else if (isRightAligned(t, container)){
				t.setHorizontalAlignment(HAlignmentType.RIGHT);
				if (isLeftAligned(mostLeft, container))
				;//	t.setHorizontalAlignment(HAlignmentType.RIGHT);
				else 
					for (Tile t1: leftTiles)
						t1.setHorizontalAlignment(HAlignmentType.RIGHT);
			}else if (t.getHorizontalAlignment() == HAlignmentType.NONE){
				t.setHorizontalAlignment(HAlignmentType.CENTER);
//				if (TileUtil.getLeft(t).isEmpty())
//					for (Tile t1: rightTiles)
//						t1.setHorizontalAlignment(HAlignmentType.CENTER);
//				else if (TileUtil.getRight(t).isEmpty())
//					for (Tile t1: leftTiles)
//						t1.setHorizontalAlignment(HAlignmentType.CENTER);
			}
			
			// Set the separation from the border
			float width = container.getXMaxPos() - container.getXMinPos() + 1;
			if (TileUtil.getLeft(t).isEmpty()){
				float margin = 0;
				if (t.getXMinPos() > 0)
					margin = t.getXMinPos() / width;
				t.setLeftMargin(margin);
			}
			if (TileUtil.getRight(t).isEmpty()){
				float margin = 0;
				if (t.getXMaxPos() < width - 1)
					margin = (width - 1 - t.getXMaxPos()) / width;
				t.setRightMargin(margin);
			}
		}
	}
	
	/*
	 * Sets the horizontal and vertical alignment
	 */
	private void alignTilesV(Tile container){
		for (Tile t: container.getSubtiles()){
			List<Tile> upTiles = new ArrayList<Tile>();
			getUpChain(t, upTiles);
			Tile top = null;
			if (upTiles.isEmpty())
				top = t;
			else
				top = getTop(upTiles);
			List<Tile> downTiles = new ArrayList<Tile>();
			getDownChain(t, downTiles);
			Tile bottom = null;
			if (downTiles.isEmpty())
				bottom = t;
			else
				bottom = getBottom(downTiles);

			// ??? HOW IS THIS IMPLEMENTED
			// THE CHAIN OF WIDGETS SHOULD BE TAKEN INTO ACCOUNT, 
			// SO THE WIDGETS IN A GROUP HAVE THE SAME ALIGNMENT
			if (isTopAligned(t, container)){
				t.setVerticalAlignment(VAlignmentType.TOP);
				if (isBottomAligned(bottom, container))
					;//t.setVerticalAlignment(VAlignmentType.TOP);
				else{
					for (Tile t1: downTiles)
						t1.setVerticalAlignment(VAlignmentType.TOP);
				}
			}else if (isBottomAligned(t, container)){
				t.setVerticalAlignment(VAlignmentType.BOTTOM);
				if (isTopAligned(top, container))
					;//t.setVerticalAlignment(VAlignmentType.BOTTOM);
				else 
					for (Tile t1: upTiles)
						t1.setVerticalAlignment(VAlignmentType.BOTTOM);
			}else if (t.getVerticalAlignment() == VAlignmentType.NONE){
				t.setVerticalAlignment(VAlignmentType.MIDDLE);
//				if (TileUtil.getUp(t).isEmpty())
//					for (Tile t1: downTiles)
//						t1.setVerticalAlignment(VAlignmentType.MIDDLE);
//				else if (TileUtil.getDown(t).isEmpty())
//					for (Tile t1: upTiles)
//						t1.setVerticalAlignment(VAlignmentType.MIDDLE);
			}
			
			// Set the separation from the border
			float height = container.getYMaxPos() - container.getYMinPos() + 1;
			if (TileUtil.getUp(t).isEmpty()){
				float margin = 0;
				if (t.getYMinPos() > 0)
					margin = t.getYMinPos() / height;
				t.setTopMargin(margin);
			}
			if (TileUtil.getDown(t).isEmpty()){
				float margin = 0;
				if (t.getYMaxPos() < height - 1)
					margin = (height - 1 - t.getYMaxPos()) / height;
				t.setBottomMargin(margin);
			}
		}
	}
	
	/*
	 * 
	 */
	private boolean isLeftAligned(Tile tile, Tile container){
		float htotal = container.getXMaxPos() - container.getXMinPos() + 1;
		float hleft = (tile.getXMinPos() - container.getXMinPos()) / htotal;
		if (hleft <= hmargin && TileUtil.getLeft(tile).isEmpty())
			return true;
		else 
			return false;
	}
	
	/*
	 * 
	 */
	private boolean isRightAligned(Tile tile, Tile container){
		float htotal = container.getXMaxPos() - container.getXMinPos() + 1;
		float hright = (container.getXMaxPos() - tile.getXMaxPos()) / htotal;
		if (hright <= hmargin && TileUtil.getRight(tile).isEmpty())
			return true;
		else 
			return false;
	}
	
	/*
	 * 
	 */
	private boolean isTopAligned(Tile tile, Tile container){
		float vtotal = container.getYMaxPos() - container.getYMinPos() + 1;
		float vtop = (tile.getYMinPos() - container.getYMinPos()) / vtotal;
		if (vtop <= vmargin && TileUtil.getUp(tile).isEmpty())
			return true;
		else 
			return false;
	}
	
	/*
	 * 
	 */
	private boolean isBottomAligned(Tile tile, Tile container){
		float vtotal = container.getYMaxPos() - container.getYMinPos() + 1;
		float vbottom = (container.getYMaxPos() - tile.getYMaxPos()) / vtotal;
		if (vbottom <= vmargin && TileUtil.getDown(tile).isEmpty())
			return true;
		else 
			return false;
	}
	
	/*
	 * 
	 */
	private Tile getMostLeft(List<Tile> tiles){
		Tile result = null;
		for (Tile t: tiles){
			if (result == null || t.getXMinPos() < result.getXMinPos())
				result = t;
		}
		return result;
	}
	
	/*
	 * 
	 */
	private Tile getMostRight(List<Tile> tiles){
		Tile result = null;
		for (Tile t: tiles){
			if (result == null || t.getXMaxPos() > result.getXMaxPos())
				result = t;
		}
		return result;
	}
	
	/*
	 * 
	 */
	private Tile getTop(List<Tile> tiles){
		Tile result = null;
		for (Tile t: tiles){
			if (result == null || t.getYMinPos() < result.getYMinPos())
				result = t;
		}
		return result;
	}
	
	/*
	 * 
	 */
	private Tile getBottom(List<Tile> tiles){
		Tile result = null;
		for (Tile t: tiles){
			if (result == null || t.getYMaxPos() > result.getYMaxPos())
				result = t;
		}
		return result;
	}
	
	
	/*
	 * 
	 */
	private void getLeftChain(Tile tile, List<Tile> chain){
		for (Tile t: TileUtil.getLeft(tile)){
			chain.add(t);
			getLeftChain(t, chain);
		}
	}
	
	/*
	 * 
	 */
	private void getRightChain(Tile tile, List<Tile> chain){
		for (Tile t: TileUtil.getRight(tile)){
			chain.add(t);
			getRightChain(t, chain);
		}
	}
	
	/*
	 * 
	 */
	private void getUpChain(Tile tile, List<Tile> chain){
		for (Tile t: TileUtil.getUp(tile)){
			chain.add(t);
			getUpChain(t, chain);
		}
	}
	
	/*
	 * 
	 */
	private void getDownChain(Tile tile, List<Tile> chain){
		for (Tile t: TileUtil.getDown(tile)){
			chain.add(t);
			getDownChain(t, chain);
		}
	}
	
	/*
	 * Checks if there is a square-shaped cycle among widgets where one of the four relations
	 * has a different closeness type.
	 * We change the relation whose closeness type value is different so we make it the same as the others
	 */
	private boolean fixCircularCloseness(Tile tile){

		List<Relation> right = 
				TileUtil.selectEdges(
						tile.getOutgoing(), 
						TileUtil.XINTERVAL, 
						TileUtil.SEQ_INTERVALS
				);
		List<Relation> down = 
				TileUtil.selectEdges(
						tile.getOutgoing(),
						TileUtil.YINTERVAL,
						TileUtil.SEQ_INTERVALS
				);
		for (Relation rrel: right){
			for (Relation drel: down){
				Tile r = rrel.getTarget();
				Tile d = drel.getTarget();
				List<Relation> downRight = 
						TileUtil.selectEdges(
								d.getOutgoing(), 
								TileUtil.XINTERVAL, 
								TileUtil.SEQ_INTERVALS
						);
				List<Relation> rightDown = 
						TileUtil.selectEdges(
								r.getOutgoing(),
								TileUtil.YINTERVAL,
								TileUtil.SEQ_INTERVALS
						);
				for (Relation rdrel: rightDown){
					for (Relation drrel: downRight){
						Tile rd = rdrel.getTarget();
						Tile dr = drrel.getTarget();
						
						if (rd == dr){
							// Agrupar closeness levels
							Relation relations[] = {rrel, drel, drrel, rdrel};
							List<List<Relation>> groups = groupRelationsByCloseness(relations);
							if (groups.size() == 2){
								// If there are 3 relations that have the same closeness level and 1 different,
								// then correct the relation which has a different closeness type
								if (groups.get(0).size() == 1){
									Relation diffRel = groups.get(0).get(0);
									ClosenessType commonVal = groups.get(1).get(0).getCloseness();
									diffRel.setCloseness(commonVal);
								}else if (groups.get(1).size() == 1){
									Relation diffRel = groups.get(1).get(0);
									ClosenessType commonVal = groups.get(0).get(0).getCloseness();
									diffRel.setCloseness(commonVal);
								}
							}
						}
						
					} //for_4
				} // for_3
			} // for_2
		} // for_1
		
		return false;
	}
	
	/*
	 * 
	 */
	private List<List<Relation>> groupRelationsByCloseness(Relation relations[]){
		ArrayList<List<Relation>> result = new ArrayList<List<Relation>>();
		HashMap<ClosenessType, List<Relation>> hash = new HashMap<ClosenessType, List<Relation>>();
		for (Relation r: relations){
			if (!hash.containsKey(r.getCloseness())){
				ArrayList<Relation> list = new ArrayList<Relation>();
				hash.put(r.getCloseness(), list);
			}
			hash.get(r.getCloseness()).add(r);
		}
		for (List<Relation> list: hash.values()){
			result.add(list);
		}
		return result;
	}
	
	
//	/*
//	 * Propagates an alignment to the right
//	 */
//	private void propagateToRight(Tile tile, HAlignmentType type){
//		tile.setHorizontalAlignment(type);
//		for (Tile t: TileUtil.getRight(tile)){
//			propagateToRight(t, type);
//		}
//	}
//	
//	/*
//	 * Propagates an alignment to the left
//	 */
//	private void propagateToLeft(Tile tile, HAlignmentType type){
//		tile.setHorizontalAlignment(type);
//		List<Tile> list = TileUtil.getLeft(tile);
//		for (Tile t: TileUtil.getLeft(tile)){
//			//System.out.println(" * TILE: "+t.getName());
//			propagateToLeft(t, type);
//		}
//	}
//	
//	/*
//	 * Propagates an alignment to the right
//	 */
//	private void propagateToDown(Tile tile, VAlignmentType type){
//		tile.setVerticalAlignment(type);
//		for (Tile t: TileUtil.getDown(tile)){
//			propagateToDown(t, type);
//		}
//	}
//	
//	/*
//	 * Propagates an alignment to the left
//	 */
//	private void propagateToUp(Tile tile, VAlignmentType type){
//		tile.setVerticalAlignment(type);
//		for (Tile t: TileUtil.getUp(tile)){
//			propagateToUp(t, type);
//		}
//	}

	
	/*************************************************************************/
	
	
	/*
	 * User for debugging
	 */
	private void printLayoutTree(){
		String result = printTreeRecursive(lowLayoutRoot.getViewTiles().get(0), 0);
		out.println(result);
	}
	
	private String printTreeRecursive(Tile tile, int depth){
		String result = "";
		for (int i=0; i<depth; ++i){
			result += TAB;
		}
		result += tile.getName() + " (hsize: " + tile.getHSize() + ", vsize: " +
			tile.getVSize() + ") " + "\n";
		for (Tile t: tile.getSubtiles()){
			result += printTreeRecursive(t, depth+1);
		}
		return result;
	}
	
	/*
	 * Gets human-readable names for a widget (if possible)
	 */
	private String getReadableName(Widget widget){
		if (widget instanceof OutputText){
			String str = ((OutputText)widget).getText().getValue();
			str = str.trim().replaceAll(" ", "_");
			return str;
		}else{
			return widget.getName();
		}
	}
	
}
