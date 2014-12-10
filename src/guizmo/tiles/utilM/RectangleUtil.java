package guizmo.tiles.utilM;

import java.awt.Rectangle;

import guizmo.tiles.HAlignmentType;
import guizmo.tiles.VAlignmentType;

public class RectangleUtil {
	
	/**
	 * Indicates the absolute horizontal alignment of an element inside a container.
	 * 
	 * In order to decide the alignment, the difference between the margins of both extremes must be assessed.
	 * Therefore, we compare the relative difference between the horizontal or vertical extremes
	 * to decide if they must have the same alignment or not, no matter the alignment of the children.
	 * 
	 * Be aware that this method does not consider that some elements form a group and must be aligned in the same way.
	 * For example, if there are five elements in a row and the group is aligned to the left, but the rectangle which is
	 * being analysed is the rightmost, then it will be set to "CENTER" not to "LEFT".
	 * 
	 * @param rect Rectangle to consider. The coordinates are relative to the container.
	 * @param container Container rectangle
	 * @param margin The percentage margin with regard to the container bounds which are used in the alignment comparisons
	 * @param marginDiff The percentage of the difference between margins so if the difference is less than this parameter
	 * then the element has to be aligned as CENTER or BOTH
	 */
	public static HAlignmentType getAbsHAlignment(Rectangle rect, Rectangle container, float margin, float marginDiff){		
		float leftMargin = (float)(rect.getMinX() - container.getMinX()) / (float)container.getWidth();
		float rightMargin = (float)(container.getMaxX() - rect.getMaxX()) / (float)container.getWidth();
		float hdiff = Math.abs(leftMargin - rightMargin);
		int containerCenter = (int)container.getMinX() + Math.round((float)container.getWidth() / 2);
		int rectCenter = (int)rect.getMinX() + Math.round((float)rect.getWidth() / 2);
		float centerMargin = Math.abs(containerCenter - rectCenter) / (float)container.getWidth();
		
		if (leftMargin <= margin && rightMargin <= margin)
			return HAlignmentType.BOTH;
		else if (leftMargin <= margin && hdiff > marginDiff)
			return HAlignmentType.LEFT;
		else if (rightMargin <= margin && hdiff > marginDiff)
			return HAlignmentType.RIGHT;
		else if ((leftMargin <= margin && hdiff <= marginDiff) || (rightMargin <= margin && hdiff <= marginDiff))
			return HAlignmentType.BOTH;
		else if (centerMargin <= margin)
			return HAlignmentType.CENTER;
		else
			return HAlignmentType.NONE;
	}
	
	
	/**
	 * Indicates the absolute vertical alignment of an element inside a container.
	 * 
	 * In order to decide the alignment, the difference between the margins of both extremes must be assessed.
	 * Therefore, we compare the relative difference between the horizontal or vertical extremes
	 * to decide if they must have the same alignment or not, no matter the alignment of the children.
	 * 
	 * Be aware that this method does not consider that some elements form a group and must be aligned in the same way.
	 * For example, if there are five elements in a row and the group is aligned to the left, but the rectangle which is
	 * being analysed is the rightmost, then it will be set to "CENTER" not to "LEFT".
	 * 
	 * @param rect Rectangle to consider. The coordinates are relative to the container.
	 * @param container Container rectangle
	 * @param margin The percentage margin with regard to the container bounds which are used in the alignment comparisons
	 * @param marginDiff The percentage of the difference between margins so if the difference is less than this parameter
	 * then the element has to be aligned as CENTER or BOTH
	 */
	public static VAlignmentType getAbsVAlignment(Rectangle rect, Rectangle container, float margin, float marginDiff){
		float topMargin = (float)(rect.getMinY() - container.getMinY()) / (float)container.getHeight();
		float bottomMargin = (float)(container.getMaxY() - rect.getMaxY()) / (float)container.getHeight();
		float vdiff = Math.abs(topMargin - bottomMargin);
		int containerMiddle = (int)container.getMinX() + Math.round((float)container.getHeight() / 2);
		int rectMiddle = (int)container.getMinX() + Math.round((float)rect.getHeight() / 2);
		float middleMargin = Math.abs(containerMiddle - rectMiddle) / (float)container.getHeight();
		
		if (topMargin <= margin && bottomMargin <= margin)
			return VAlignmentType.BOTH;
		else if (topMargin <= margin && vdiff > marginDiff)
			return VAlignmentType.TOP;
		else if (bottomMargin <= margin && vdiff > marginDiff)
			return VAlignmentType.BOTTOM;
		else if ((topMargin <= margin && vdiff <= marginDiff) || (bottomMargin <= margin && vdiff <= marginDiff))
			return VAlignmentType.BOTH;
		else if (middleMargin <= margin)
			return VAlignmentType.MIDDLE;
		else
			return VAlignmentType.NONE;
	}
}
