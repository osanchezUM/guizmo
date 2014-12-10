package lasser.regions;

import guizmo.structure.ComposableWidget;

import java.util.ArrayList;
import java.util.List;

import lasser.sketch.Container;
import lasser.sketch.Widget;
import guizmo.util.RectangleUtil;

public class RegionUtil {
	
	private static final int MARGIN = 0;
	
	public static Region createRegion(Widget widget){
		Region newRegion = new Region();
		newRegion.setName(widget.getId());
		newRegion.setXmin(widget.getXPos());
		newRegion.setYmin(widget.getYPos());
		newRegion.setXmax(widget.getXPos() + widget.getWidth() - 1);
		newRegion.setYmax(widget.getYPos() + widget.getHeight() - 1);
		newRegion.addWidget(widget);
		newRegion.setRef(widget);
		return newRegion;
	}
	
	public static boolean entirelyContains(Region r1, Region r2){
		if (	r1.getXmin() <= r2.getXmin() &&
				r1.getXmax() >= r2.getXmax() &&
				r1.getYmin() <= r2.getYmin() &&
				r1.getYmax() >= r2.getYmax()
			) return true;
		else
			return false;
	}
	
	public static boolean partlyContains(Region r1, Region r2){
	    int xdiff = Math.min(r1.getXmax(), r2.getXmax()) - Math.max(r1.getXmin(), r2.getXmin());
	    int ydiff = Math.min(r1.getYmax(), r2.getYmax()) - Math.max(r1.getYmin(), r2.getYmin());
	    boolean result = xdiff >= 0 && ydiff >= 0 ? true : false;
	    return result;
	}
	
	public static boolean isBaseRegion(Region r){
		if (!r.getWidgets().isEmpty() && r.getWidgets().get(0) instanceof Container)
			return true;
		else
			return false;
	}
	
	public static boolean isWidgetRegion(Region r){
		if (!r.getWidgets().isEmpty() && !(r.getWidgets().get(0) instanceof Container))
			return true;
		else
			return false;
	}
	
	public static Region getWholeContainerRegion(List<Region> list, Region r){
		for (Region contRegion: list){
			if (entirelyContains(contRegion, r))
				return contRegion;
		}
		return null;
	}
	
	public static Region getPartialContainerRegion(List<Region> list, Region r){
		for (Region contRegion: list){
			if (partlyContains(contRegion, r))
				return contRegion;
		}
		return null;
	}
	
	public static Region createExtraRegion(Region container, List<Region> siblings, Region widgetRegion){
		Region extra = new Region();
		int xmin = container.getXmin(); 
		int ymin = container.getYmin();
		int xmax = container.getXmax(); 
		int ymax = container.getYmax();
		ArrayList<Region> left = new ArrayList<Region>();
		ArrayList<Region> right = new ArrayList<Region>();
		ArrayList<Region> up = new ArrayList<Region>();
		ArrayList<Region> down = new ArrayList<Region>();
		for (Region r: siblings){
			if (isLeft(r, widgetRegion))
				left.add(r);
			else if (isRight(r, widgetRegion))
				right.add(r);
			else if (isUp(r, widgetRegion))
				up.add(r);
			else if (isDown(r, widgetRegion))
				down.add(r);
		}
		boolean changes = false;
		if (!left.isEmpty()){
			for (Region r: left){
				xmin = Math.max(xmin, r.getXmax() + 1);
			}
			changes = true;
		}
		if (!right.isEmpty()){
			for (Region r: right){
				xmax = Math.min(xmax, r.getXmin() - 1);
			}
			changes = true;
		}
		if (!up.isEmpty()){
			for (Region r: up){
				ymin = Math.max(ymin, r.getYmax() + 1);
			}
			changes = true;
		}
		if (!down.isEmpty()){
			for (Region r: down){
				ymax = Math.min(ymax, r.getYmin() - 1);
			}
			changes = true;
		}
		
		// Patch 05/02/14
		// If there are no changes, it means that the widget and the regions are diagonally located
		// In this case we completely expand the area horizontally, and we limit the vertical range
		// depending on the other sibling base regions
		if (!changes && !siblings.isEmpty()){
			for (Region r: siblings){
				// The base region is above the widget region
				if (r.getYmax() <= widgetRegion.getYmin()){
					ymin = Math.max(ymin, r.getYmax() + 1);
				}
				// The base region is below the widget region
				else if (widgetRegion.getYmax() <= r.getYmin()){
					ymax = Math.min(ymax, r.getYmin() - 1);
				}
			}
		}
		
		extra.setCoordinates(xmin, ymin, xmax, ymax);
		return extra;
	}
	
	public static boolean sameRow(Region r1, Region r2){
		return RectangleUtil.sameRow(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
	
	public static boolean sameColumn(Region r1, Region r2){
		return RectangleUtil.sameColumn(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
	public static boolean isLeft(Region r1, Region r2){
		return RectangleUtil.isLeft(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
	public static boolean isRight(Region r1, Region r2){
		return RectangleUtil.isRight(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
	public static boolean isUp(Region r1, Region r2){
		return RectangleUtil.isUp(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
	public static boolean isDown(Region r1, Region r2){
		return RectangleUtil.isDown(r1.toRectangle(), r2.toRectangle(), MARGIN);
	}
	
}
