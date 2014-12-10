package guizmo.util;

import java.awt.Rectangle;

public class RectangleUtil {
	
	/**
	 * Returns the horizontal sharing value
	 * If the value returned is negative, then the widgets are not in the same line
	 */
	public static int hSharingValue(Rectangle r1, Rectangle r2){
		int d2 = Math.min((int)r1.getMaxY(), (int)r2.getMaxY());
		int d1 = Math.max((int)r1.getMinY(), (int)r2.getMinY());
		int d = d2 - d1 + 1;
		return d;
	}
	
	/**
	 * Returns the vertical sharing value
	 * If the value returned is negative, then the widgets are not in the same column
	 */
	public static int vSharingValue(Rectangle r1, Rectangle r2){
		int d2 = Math.min((int)r1.getMaxX(), (int)r2.getMaxX());
		int d1 = Math.max((int)r1.getMinX(), (int)r2.getMinX());
		int d = d2 - d1 + 1;
		return d;
	}
	
	/**
	 * Returns true if both rectangles are in the same row, taking into account the margin
	 * Pre: margin >= 0
	 */
	public static boolean sameRow(Rectangle r1, Rectangle r2, int margin){
		if (hSharingValue(r1, r2) > margin)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true if both rectangles are in the same column, taking into account the margin
	 * Pre: margin >= 0
	 */
	public static boolean sameColumn(Rectangle r1, Rectangle r2, int margin){
		if (vSharingValue(r1, r2) > margin)
			return true;
		else
			return false;
	}
	
	/**
	 * r1 is on the left of r2
	 * Pre: the areas are not overlapped
	 */
	public static boolean isLeft(Rectangle r1, Rectangle r2, int margin){
		if (sameRow(r1, r2, margin) && r1.getMinX() < r2.getMinX())
			return true;
		else
			return false;
	}
	
	/**
	 * r1 is on the right of r2
	 * Pre: the areas are not overlapped
	 */
	public static boolean isRight(Rectangle r1, Rectangle r2, int margin){
		if (sameRow(r1, r2, margin) && r1.getMaxX() > r2.getMaxX())
			return true;
		else
			return false;
	}
	
	/**
	 * r1 is above r2
	 * Pre: the areas are not overlapped
	 */
	public static boolean isUp(Rectangle r1, Rectangle r2, int margin){
		if (sameColumn(r1, r2, margin) && r1.getMinY() < r2.getMinY())
			return true;
		else
			return false;
	}
	
	/**
	 * r1 is below r2
	 * Pre: the areas are not overlapped
	 */
	public static boolean isDown(Rectangle r1, Rectangle r2, int margin){
		if (sameColumn(r1, r2, margin) && r1.getMaxY() > r2.getMaxY())
			return true;
		else
			return false;
	}
	
// DELETE!!
//	/**
//	 * Returns true is the rect is aligned to the left of the container with the maximum given margin
//	 */
//	public static boolean isLeftAligned(Rectangle rect, Rectangle container, float margin){
//		float percentage = rect.x / container.width;
//		if (hleft <= hmargin && TileUtil.getLeft(tile).isEmpty())
//			return true;
//		else 
//			return false;
//	}
	
}
