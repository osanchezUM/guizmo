package guizmo.tiles.utilM;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import guizmo.structure.ComposableWidget;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.Tile;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class AllenUtil {
	
	// Number of pixels used as a margin for the comparisons between the position of tiles
	private static int margin = 10;
	
	
	// A mapping between the closeness levels and numerical levels
	private static final Map<ClosenessType, Integer> CLOSENESS_MAP;
	static{
		Map<ClosenessType, Integer> m = new HashMap<ClosenessType, Integer>();
		m.put(ClosenessType.VERY_CLOSE, 0);
		m.put(ClosenessType.CLOSE, 1);
		m.put(ClosenessType.FAR, 2);
		m.put(ClosenessType.VERY_FAR, 3);
		CLOSENESS_MAP = Collections.unmodifiableMap(m);
	}
	
	// Opposite intervals
	private static final Map<AllenIntervalType, AllenIntervalType> OPPOSITE_INTERVAL_MAP;
	static{
		Map<AllenIntervalType, AllenIntervalType> m = new HashMap<AllenIntervalType, AllenIntervalType>();
		m.put(AllenIntervalType.BEFORE, AllenIntervalType.AFTER);
		m.put(AllenIntervalType.AFTER, AllenIntervalType.BEFORE);
		m.put(AllenIntervalType.MEETS, AllenIntervalType.MET_BY);
		m.put(AllenIntervalType.MET_BY, AllenIntervalType.MEETS);
		m.put(AllenIntervalType.STARTS, AllenIntervalType.STARTED_BY);
		m.put(AllenIntervalType.STARTED_BY, AllenIntervalType.STARTS);
		m.put(AllenIntervalType.DURING, AllenIntervalType.CONTAINS);
		m.put(AllenIntervalType.CONTAINS, AllenIntervalType.DURING);
		m.put(AllenIntervalType.FINISHES, AllenIntervalType.FINISHED_BY);
		m.put(AllenIntervalType.FINISHED_BY, AllenIntervalType.FINISHES);
		m.put(AllenIntervalType.OVERLAPS, AllenIntervalType.OVERLAPPED_BY);
		m.put(AllenIntervalType.OVERLAPPED_BY, AllenIntervalType.OVERLAPS);
		m.put(AllenIntervalType.EQUAL, AllenIntervalType.EQUAL);
		OPPOSITE_INTERVAL_MAP = Collections.unmodifiableMap(m);
	}
	
	// Reverse intervals
	private static final List<AllenIntervalType> REVERSE_INTERVALS;
	static{
		List<AllenIntervalType> l = new ArrayList<AllenIntervalType>(6);
		l.add(AllenIntervalType.AFTER);
		l.add(AllenIntervalType.MET_BY);
		l.add(AllenIntervalType.STARTED_BY);
		l.add(AllenIntervalType.FINISHED_BY);
		l.add(AllenIntervalType.OVERLAPPED_BY);
		l.add(AllenIntervalType.DURING);
		REVERSE_INTERVALS = Collections.unmodifiableList(l);
	}
	
	// A table that indicates the result of joining a pair of intervals
	private static final Table<AllenIntervalType, AllenIntervalType, AllenIntervalType> JOIN_TABLE = 
			new ImmutableTable.Builder<AllenIntervalType, AllenIntervalType, AllenIntervalType>()
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.DURING, 		AllenIntervalType.STARTS)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.BEFORE, 		AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.FINISHES, 	AllenIntervalType.EQUAL)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.FINISHED_BY, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.EQUAL, 		AllenIntervalType.EQUAL)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.MEETS, 		AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.STARTED_BY,	AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.OVERLAPS,		AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.STARTS, 		AllenIntervalType.CONTAINS,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.EQUAL, 		AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.FINISHED_BY,	AllenIntervalType.EQUAL)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.CONTAINS, 	AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.OVERLAPS, 	AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.FINISHES, 	AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.DURING, 		AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.MEETS, 		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.STARTED_BY, 	AllenIntervalType.MET_BY, 		AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.FINISHES, 	AllenIntervalType.FINISHES)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.EQUAL, 		AllenIntervalType.EQUAL)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.OVERLAPS, 	AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.OVERLAPPED_BY)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.CONTAINS,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.DURING, 		AllenIntervalType.MET_BY,		AllenIntervalType.OVERLAPPED_BY)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.MEETS, 		AllenIntervalType.MEETS)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.EQUAL, 		AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.OVERLAPS, 	AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.STARTED_BY, 	AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.FINISHED_BY, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.FINISHES, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.BEFORE, 		AllenIntervalType.CONTAINS, 	AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.MEETS, 		AllenIntervalType.FINISHED_BY, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.MEETS, 		AllenIntervalType.CONTAINS, 	AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.MEETS, 		AllenIntervalType.DURING, 		AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.MEETS, 		AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.MET_BY, 		AllenIntervalType.CONTAINS, 	AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.FINISHED_BY, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.FINISHES, 	AllenIntervalType.EQUAL)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.MEETS, 		AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.MET_BY, 		AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.OVERLAPS, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.STARTED_BY)
			.put(AllenIntervalType.EQUAL, 		AllenIntervalType.CONTAINS,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.FINISHES, 	AllenIntervalType.MET_BY, 		AllenIntervalType.OVERLAPPED_BY)
			.put(AllenIntervalType.FINISHES, 	AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.OVERLAPPED_BY)
			.put(AllenIntervalType.FINISHES, 	AllenIntervalType.CONTAINS,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.FINISHED_BY, AllenIntervalType.OVERLAPS, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.FINISHED_BY, AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.FINISHED_BY, AllenIntervalType.CONTAINS, 	AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.FINISHED_BY, AllenIntervalType.DURING, 		AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.OVERLAPS, 	AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.OVERLAPS, 	AllenIntervalType.CONTAINS,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.OVERLAPS, 	AllenIntervalType.MEETS,		AllenIntervalType.OVERLAPS)
			.put(AllenIntervalType.OVERLAPS, 	AllenIntervalType.MET_BY,		AllenIntervalType.CONTAINS)
			.put(AllenIntervalType.OVERLAPS, 	AllenIntervalType.FINISHES,		AllenIntervalType.FINISHED_BY)
			.put(AllenIntervalType.CONTAINS, 	AllenIntervalType.OVERLAPPED_BY,AllenIntervalType.CONTAINS)
			.build();
	
//	/*
//	 * Returns true if if the intersection of the projections of both tiles on the X axis is not empty
//	 */
//	public static boolean areVerticallySharing(Tile t1, Tile t2){
////		if (	(t1.getXMinPos() <= t2.getXMinPos() && t1.getXMaxPos() >= t2.getXMinPos()) ||
////				(t2.getXMinPos() <= t1.getXMinPos() && t2.getXMaxPos() >= t1.getXMinPos())
////			) return true;
////		else return false;
//		
//		AllenIntervalType interval = getXIntervalType(t1, t2);
//		if ( 	interval == AllenIntervalType.BEFORE || interval == AllenIntervalType.AFTER ||
//				interval == AllenIntervalType.MEETS	 || interval == AllenIntervalType.MET_BY )
//			return false;
//		else
//			return true;
//	}
//	
//	/*
//	 * Returns true if if the intersection of the projections of both tiles on the Y axis is not empty
//	 */
//	public static boolean areHorizontallySharing(Tile t1, Tile t2){
////		if (	(t1.getYMinPos() <= t2.getYMinPos() && t1.getYMaxPos() >= t2.getYMinPos()) ||
////				(t2.getYMinPos() <= t1.getYMinPos() && t2.getYMaxPos() >= t1.getYMinPos())
////			) return true;
////		else return false;
//		
//		AllenIntervalType interval = getYIntervalType(t1, t2);
//		if ( 	interval == AllenIntervalType.BEFORE || interval == AllenIntervalType.AFTER ||
//				interval == AllenIntervalType.MEETS	 || interval == AllenIntervalType.MET_BY )
//			return false;
//		else
//			return true;
//	}
//	
//	/*
//	 * Returns true if both tiles are vertically adjacent
//	 * Pre: t1 and t2 are both children of 'container'
//	 */
//	public static boolean areVerticallyAdjacent(Tile t1, Tile t2, Tile container){
//		if (!areVerticallySharing(t1, t2))
//			return false;
//		Tile tup=null, tdown=null;
//		AllenIntervalType yint= getYIntervalType(t1, t2);
//		if (yint == AllenIntervalType.BEFORE){
//			tup = t1;
//			tdown = t2;
//		}else if (yint == AllenIntervalType.AFTER){
//			tup = t2;
//			tdown = t1;
//		}else{
//			// If the interval is neither AFTER nor BEFORE, the edges of the tiles are touching 
//			// or there is overlapping
//			return true;
//		}
//		for (Tile t: container.getSubtiles()){
//			//if t != self && t != tile && t.same_column?(self) && t.same_column?(tile)
//			//   return false if tup.yMaxPos <= t.yMinPos && t.yMaxPos <= tdown.yMinPos
//			if (t != t1 && t != t2 && areVerticallySharing(t, t1) && areVerticallySharing(t, t2)){
//				if (areOverlapped(t, t1) || areOverlapped(t, t2))
//					return true;
//				AllenIntervalType intUp = getYIntervalType(tup, t);
//				AllenIntervalType intDown = getYIntervalType(tdown, t);
//				if (	(intUp == AllenIntervalType.BEFORE 	|| intUp == AllenIntervalType.MEETS) && 
//						(intDown == AllenIntervalType.AFTER || intDown == AllenIntervalType.MET_BY) )
//					return false;
//			}
//		}
//		return true;
//	}
//	
//	/*
//	 * Returns true if both tiles are horizontally adjacent
//	 * Pre: t1 and t2 are both children of 'container'
//	 */
//	public static boolean areHorizontallyAdjacent(Tile t1, Tile t2, Tile container){
//		if (!areHorizontallySharing(t1, t2))
//			return false;
//		Tile tleft=null, tright=null;
//		AllenIntervalType hint = getXIntervalType(t1, t2);
//		if (hint == AllenIntervalType.BEFORE){
//			tleft = t1;
//			tright = t2;
//		}else if (hint == AllenIntervalType.AFTER){
//			tleft = t2;
//			tright = t1;
//		}else{
//			// If the interval is neither AFTER nor BEFORE, the edges of the tiles are touching 
//			// or there is overlapping
//			return true;
//		}
//		for (Tile t: container.getSubtiles()){
//		    // if t != self && t != tile && t.same_row?(self) && t.same_row?(tile)
//		    //    return false if tleft.xMaxPos <= t.xMinPos && t.xMaxPos <= tright.xMinPos
//			if (t != t1 && t != t2 && areHorizontallySharing(t, t1) && areHorizontallySharing(t, t2)){
//				if (areOverlapped(t, t1) || areOverlapped(t, t2))
//					return true;
//				AllenIntervalType intLeft = getXIntervalType(tleft, t);
//				AllenIntervalType intRight = getXIntervalType(tright, t);
//				if (	(intLeft == AllenIntervalType.BEFORE || intLeft == AllenIntervalType.MEETS) && 
//						(intRight == AllenIntervalType.AFTER || intRight == AllenIntervalType.MET_BY) )
//					return false;
//			}
//		}
//		return true;
//	}
//	
//	/*
//	 * Returns true if both tiles are overlapped
//	 */
//	public static boolean areOverlapped(Tile t1, Tile t2){
//		if (areVerticallySharing(t1, t2) && areHorizontallySharing(t1, t2))
//			return true;
//		else
//			return false;
//	}

	public static AllenIntervalType getXIntervalType(ComposableWidget w1, ComposableWidget w2){
		return getYIntervalType(w1.getXmin(), w1.getXmax(), w2.getXmin(), w2.getXmax());
	}
	
	public static AllenIntervalType getXIntervalType(Tile t1, Tile t2){
		return getYIntervalType(t1.getXMinPos(), t1.getXMaxPos(), t2.getXMinPos(), t2.getXMaxPos());
	}
	
	public static AllenIntervalType getXIntervalType(Rectangle r1, Rectangle r2){
		return getYIntervalType((int)r1.getMinX(), (int)r1.getMaxX(), (int)r2.getMinX(), (int)r2.getMaxX());
	}
	
	/*
	 * Gets the type of the Allen interval for the X axis of the tiles
	 * with regard to the first parameter
	 * For example, BEFORE means that t1.x < t2.x
	 */
	public static AllenIntervalType getXIntervalType(int xmin1, int xmax1, int xmin2, int xmax2){
		if (le(xmin2, xmin1)){
			if (ge(xmax2, xmax1)){
				if (eq(xmin2, xmin1)){
					if (eq(xmax2, xmax1))
						return AllenIntervalType.EQUAL;
					else
						return AllenIntervalType.STARTS;
				}else{
					if (eq(xmax2, xmax1))
						return AllenIntervalType.FINISHES;
					else
						return AllenIntervalType.DURING;
				}
			}else{
				if (le(xmax2, xmin1)){
					if (eq(xmax2, xmin1))
						return AllenIntervalType.MET_BY;
					else 
						return AllenIntervalType.AFTER;
				}else{
					if (eq(xmin2, xmin1))
						return AllenIntervalType.STARTED_BY;
					else
						return AllenIntervalType.OVERLAPPED_BY;
				}
			}
		}else{
			if (ge(xmin2, xmax1)){
				if (eq(xmin2, xmax1))
					return AllenIntervalType.MEETS;
				else
					return AllenIntervalType.BEFORE;
			}else{
				if (ge(xmax2, xmax1)){
					if (eq(xmax2, xmax1))
						return AllenIntervalType.FINISHED_BY;
					else
						return AllenIntervalType.OVERLAPS;
				}else{
					return AllenIntervalType.CONTAINS;
				}
			}
		}
	}
	
	public static AllenIntervalType getYIntervalType(ComposableWidget w1, ComposableWidget w2){
		return getYIntervalType(w1.getYmin(), w1.getYmax(), w2.getYmin(), w2.getYmax());
	}
	
	public static AllenIntervalType getYIntervalType(Tile t1, Tile t2){
		return getYIntervalType(t1.getYMinPos(), t1.getYMaxPos(), t2.getYMinPos(), t2.getYMaxPos());
	}
	
	public static AllenIntervalType getYIntervalType(Rectangle r1, Rectangle r2){
		return getYIntervalType((int)r1.getMinY(), (int)r1.getMaxY(), (int)r2.getMinY(), (int)r2.getMaxY());
	}
	
	/*
	 * Gets the type of the Allen interval for the Y axis of the tiles
	 * with regard to the second parameter
	 * For example, BEFORE means that t1.y < t2.y
	 */
	public static AllenIntervalType getYIntervalType(int ymin1, int ymax1, int ymin2, int ymax2){
		if (le(ymin2, ymin1)){
			if (ge(ymax2, ymax1)){
				if (eq(ymin2, ymin1)){
					if (eq(ymax2, ymax1))
						return AllenIntervalType.EQUAL;
					else
						return AllenIntervalType.STARTS;
				}else{
					if (eq(ymax2, ymax1))
						return AllenIntervalType.FINISHES;
					else
						return AllenIntervalType.DURING;
				}
			}else{
				if (le(ymax2, ymin1)){
					if (eq(ymax2, ymin1))
						return AllenIntervalType.MET_BY;
					else 
						return AllenIntervalType.AFTER;
				}else{
					if (eq(ymin2, ymin1))
						return AllenIntervalType.STARTED_BY;
					else
						return AllenIntervalType.OVERLAPPED_BY;
				}
			}
		}else{
			if (ge(ymin2, ymax1)){
				if (eq(ymin2, ymax1))
					return AllenIntervalType.MEETS;
				else
					return AllenIntervalType.BEFORE;
			}else{
				if (ge(ymax2, ymax1)){
					if (eq(ymax2, ymax1))
						return AllenIntervalType.FINISHED_BY;
					else
						return AllenIntervalType.OVERLAPS;
				}else{
					return AllenIntervalType.CONTAINS;
				}
			}
		}
	}
	
	/*
	 * Greater than with margin
	 * 
	 * true if a + m > b
	 */
	private static boolean gt(int a, int b){
		return a + margin > b;
	}
	
	/*
	 * Greater than or equals to with margin
	 * 
	 * true if a + m >= b
	 */
	private static boolean ge(int a, int b){
		return a + margin >= b;
	}
	
	/*
	 * Less than with margin
	 * 
	 * true if a - m < b
	 */
	private static boolean lt(int a, int b){
		return a - margin < b;
	}
	
	/*
	 * Less than or equals to with margin
	 * 
	 * true if a - m <= b
	 */
	private static boolean le(int a, int b){
		return a - margin <= b;
	}
	
	/*
	 * Equals to with margin
	 * 
	 * true if a - m <= b & a + m >= b
	 */
	private static boolean eq(int a, int b){
		return a - margin <= b && a + margin >= b;
	}
	
//	/*
//	 * Returns the result of joining a pair of different Allen intervals
//	 * 
//	 * The order of both parameters is taken into account
//	 */
//	public static AllenIntervalType joinIntervals(AllenIntervalType int1, AllenIntervalType int2){
//		if (JOIN_TABLE.contains(int1, int2))
//			return JOIN_TABLE.get(int1, int2);
//		else if (JOIN_TABLE.contains(int2, int1))
//			return JOIN_TABLE.get(int2, int1);
//		else
//			throw new RuntimeException("Intervals " + int1 + " and " + int2 + " not considered");
//	}
	
	/*
	 * Return true if closeness level c1 is equals or less than level c2
	 */
	public static boolean isCloserThanLimit(ClosenessType c, ClosenessType limit){
		return CLOSENESS_MAP.get(c) <= CLOSENESS_MAP.get(limit);
	}
	
	/*
	 * Returns true if the interval (horizontal or vertical) is aligned to the beginning
	 */
	public static boolean isBeginAligned(AllenIntervalType interval){
		if (interval == AllenIntervalType.EQUAL ||
			interval == AllenIntervalType.STARTS ||
			interval == AllenIntervalType.STARTED_BY)
			return true;
		else
			return false;
	}
	
	/*
	 * 
	 */
	public static int getMargin() {
		return margin;
	}
	
	/*
	 * 
	 */
	public static void setMargin(int margin) {
		AllenUtil.margin = margin;
	}
	
	/*
	 * Returns true if the interval is a 'reverse' interval
	 */
	public static boolean isReverseInterval(AllenIntervalType interval){
		return REVERSE_INTERVALS.contains(interval);
	}
}
