package guizmo.structure.utilM;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import guizmo.structure.ComposableWidget;
import guizmo.structure.Container;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalView;
import guizmo.structure.Locatable;

public class StructureHelper {
	
	/** 
	 * Small margin used in comparisons
	 * It is intended to represent a small differences o the position of the elements
	 * TODO: AT PRESENT THIS VALUE IS HARD CODED
	 * 
	 */
	public static final int MARGIN = 5;
	
	
	/**
	 * Indicates if both widgets are more or less on the same line
	 * IMPORTANT: a pair of widgets are neither horizonal nor vertical if they are disjoint
	 */
	public static boolean areHorizontal(ComposableWidget widget1, ComposableWidget widget2){
		int h = hSharingValue(widget1, widget2);
		int v = vSharingValue(widget1, widget2);
		if (h > MARGIN && h >= v)
			return true;
		else
			return false;
	}
	
	/**
	 * Indicates if both widgets are more or less on the same column
	 * IMPORTANT: a pair of widgets are neither horizonal nor vertical if they are disjoint
	 */
	public static boolean areVertical(ComposableWidget widget1, ComposableWidget widget2){
		int h = hSharingValue(widget1, widget2);
		int v = vSharingValue(widget1, widget2);
		if (v > MARGIN && v >= h)
			return true;
		else
			return false;
	}
	
	/**
	 * True if both elements are horizontally adjacent
	 * Pre: both elements are siblings
	 */
	public static boolean areHorizontallyAdjacent(ComposableWidget widget1, ComposableWidget widget2){
		List<ComposableWidget> siblings = getExclusiveSiblings(widget1, widget2);
		for (ComposableWidget w: siblings){
			if (areHorizontallySharingStrict(widget1, w) && areHorizontallySharingStrict(widget2, w)){
				int xmin = Math.min(widget1.getXmin(), widget2.getXmin());
				int xmax = Math.max(widget1.getXmax(), widget2.getXmax());
				if (xmin < w.getXmin() && xmax > w.getXmax())
					return false;
			}
		}
		return true;
	}
	
	/**
	 * True if both elements are vertically adjacent
	 * Pre: both elements are siblings
	 */
	public static boolean areVerticallyAdjacent(ComposableWidget widget1, ComposableWidget widget2){
		List<ComposableWidget> siblings = getExclusiveSiblings(widget1, widget2);
		for (ComposableWidget w: siblings){
			if (areVerticallySharingStrict(widget1, w) && areVerticallySharingStrict(widget2, w)){
				int ymin = Math.min(widget1.getYmin(), widget2.getYmin());
				int ymax = Math.max(widget1.getYmax(), widget2.getYmax());
				if (ymin < w.getYmin() && ymax > w.getYmax())
					return false;
			}
		}
		return true;
	}
	
	/*
	 * Returns the list of siblings after discarding themselves
	 */
	private static List<ComposableWidget> getExclusiveSiblings(ComposableWidget widget1, ComposableWidget widget2){
		if (widget2.eContainer() != widget1.eContainer())
			throw new RuntimeException("Both elements do not have the same parent");
		
		List<ComposableWidget> result = new ArrayList<ComposableWidget>();
		if (widget1.eContainer() instanceof GUIRegion){
			result.addAll(((GUIRegion)widget1.eContainer()).getWidgets());
		}else if (widget1.eContainer() instanceof GraphicalView){
			GraphicalView view = (GraphicalView)widget1.eContainer();
			for (guizmo.structure.Widget w: view.getWidgets()){
				if (w instanceof ComposableWidget)
					result.add((ComposableWidget)w);
			}
		}
		result.remove(widget1);
		result.remove(widget2);
		return result;
	}
	
	
	/**
	 * Returns true if both elements are overlapped
	 */
	public static boolean areOverlapped(ComposableWidget widget1, ComposableWidget widget2){
		if (areHorizontallySharing(widget1, widget2) && areVerticallySharing(widget1, widget2))
			return true;
		else
			return false;
	}
	
	/**
	 * Gets the minimum distance between a pair of elements (w1, w2) being that
	 * w1 is child of reg1, w2 is child of reg2 and they are horizontally sharing
	 */
	public static int getMinHDistance(GUIRegion reg1, GUIRegion reg2){
		int d = Integer.MAX_VALUE;
		int currentd;
		for (ComposableWidget w1: reg1.getWidgets()){
			for (ComposableWidget w2: reg2.getWidgets()){
				if (areHorizontallySharing(w1, w2)){
					if (w1.getXmin() <= w2.getXmin())
						currentd = w2.getXmin() - w1.getXmax();
					else
						currentd = w1.getXmin() - w2.getXmax();
					d = Math.min(d, currentd);
				}
			}
		}
		if (d < 0 || d == Integer.MAX_VALUE){
			d = 0;
		}
		return d;
	}
	
	/**
	 * Gets the minimum distance between a pair of elements (w1, w2) being that
	 * w1 is child of reg1, w2 is child of reg2 and they are horizontally sharing
	 */
	public static int getMinVDistance(GUIRegion reg1, GUIRegion reg2){
		int d = Integer.MAX_VALUE;
		int currentd;
		for (ComposableWidget w1: reg1.getWidgets()){
			for (ComposableWidget w2: reg2.getWidgets()){
				if (areVerticallySharing(w1, w2)){
					if (w1.getYmin() <= w2.getYmin())
						currentd = w2.getYmin() - w1.getYmax();
					else
						currentd = w1.getYmin() - w2.getYmax();
					d = Math.min(d, currentd);
				}
			}
		}
		if (d < 0 || d == Integer.MAX_VALUE){
			d = 0;
		}
		return d;
	}
	
	
	/**
	 * Returns true if the Y axis of both tags are touching
	 */
	public static boolean areHorizontallySharing(ComposableWidget widget1, ComposableWidget widget2){
		int d = hSharingValue(widget1, widget2);
		if (d > MARGIN)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true if the X axis of both tags are touching
	 */
	public static boolean areVerticallySharing(ComposableWidget widget1, ComposableWidget widget2){
		int d = vSharingValue(widget1, widget2);
		if (d > MARGIN)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true if the Y axis of both tags are touching
	 */
	public static boolean areHorizontallySharingStrict(ComposableWidget widget1, ComposableWidget widget2){
		int d = hSharingValue(widget1, widget2);
		if (d > 0)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true if the X axis of both tags are touching
	 */
	public static boolean areVerticallySharingStrict(ComposableWidget widget1, ComposableWidget widget2){
		int d = vSharingValue(widget1, widget2);
		if (d > 0)
			return true;
		else
			return false;
	}
	
	/**
	 * Returns the horizontal sharing value
	 * If the value returned is negative, then the widgets are not in the same line
	 */
	public static int hSharingValue(ComposableWidget widget1, ComposableWidget widget2){
		int d2 = Math.min(widget1.getYmax(), widget2.getYmax());
		int d1 = Math.max(widget1.getYmin(), widget2.getYmin());
		int d = d2 - d1 + 1;
		return d;
	}
	
	/**
	 * Returns the vertical sharing value
	 * If the value returned is negative, then the widgets are not in the same column
	 */
	public static int vSharingValue(ComposableWidget widget1, ComposableWidget widget2){
		int d2 = Math.min(widget1.getXmax(), widget2.getXmax());
		int d1 = Math.max(widget1.getXmin(), widget2.getXmin());
		int d = d2 - d1 + 1;
		return d;
	}
	
	
	/**
	 * Returns true is w1 is above w2
	 * this is, w1.y < w2.y
	 * BEWARE: this does not take into account the adjacency criterion
	 */
	public static boolean isUp(ComposableWidget w1, ComposableWidget w2){
		if (w1.getYmin() < w2.getYmin())
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true is w1 is below w2, 
	 * this is, w2.y < w1.y
	 * BEWARE: this does not take into account the adjacency criterion
	 */
	public static boolean isDown(ComposableWidget w1, ComposableWidget w2){
		if (w1.getYmin() > w2.getYmin())
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true is w1 is on the left of w2, 
	 * this is, w1.x < w2.x
	 * BEWARE: this does not take into account the adjacency criterion
	 */
	public static boolean isLeft(ComposableWidget w1, ComposableWidget w2){
		if (w1.getXmin() < w2.getXmin())
			return true;
		else
			return false;
	}
	
	/**
	 * Returns true is w1 is on the right of w2, 
	 * this is, w2.x < w1.x
	 * BEWARE: this does not take into account the adjacency criterion
	 */
	public static boolean isRight(ComposableWidget w1, ComposableWidget w2){
		if (w1.getXmin() > w2.getXmin())
			return true;
		else
			return false;
	}
	
	/**
	 * Gets the child of container1 and container2 that are vertically adjacent
	 * @return [0] and [1] are the children of contain
	 */
	public static ComposableWidget[] getVClosestChildren(Container container1, Container container2){
		int d = Integer.MAX_VALUE;
		int currentd;
		ComposableWidget result[] = new ComposableWidget[2];
		for (ComposableWidget w1: container1.getWidgets()){
			for (ComposableWidget w2: container2.getWidgets()){
				if (areVerticallySharing(w1, w2)){
					if (isUp(w1, w2)){
						currentd = w1.getYmin() - w2.getYmax();
					}else{
						currentd = w2.getYmin() - w1.getYmax();
					}
					if (currentd < d){
						d = currentd;
						result[0] = w1;
						result[1] = w2;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the child of container1 and container2 that are horizontally adjacent
	 * @return [0] and [1] are the children of contain
	 */
	public static ComposableWidget[] getHClosestChildren(Container container1, Container container2){
		int d = Integer.MAX_VALUE;
		int currentd;
		ComposableWidget result[] = new ComposableWidget[2];
		for (ComposableWidget w1: container1.getWidgets()){
			for (ComposableWidget w2: container2.getWidgets()){
				if (areHorizontallySharing(w1, w2)){
					if (isLeft(w1, w2)){
						currentd = w2.getXmin() - w1.getXmax();
					}else{
						currentd = w1.getXmin() - w2.getXmax();
					}
					if (currentd < d){
						d = currentd;
						result[0] = w1;
						result[1] = w2;
					}
				}
			}
		}
		return result;
	}
	
	
	/**
	 * Returns the area occupied by the widget measured in the same units as the coordinates
	 */
	public static int getArea(ComposableWidget widget){
		int width = widget.getXmax() - widget.getXmin() + 1;
		int height = widget.getYmax() - widget.getYmin() + 1;
		return width * height;
	}
	
	/**
	 * Returns the area occupied by the widget as a Rectangle
	 */
	public static Rectangle toRectangle(Locatable loc){
		return new Rectangle(
				loc.getXmin(), loc.getYmin(), 
				loc.getXmax() - loc.getXmin() + 1, loc.getYmax() - loc.getYmin() + 1
				);
	}
}
