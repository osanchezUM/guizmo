package lasser.regions;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import lasser.sketch.Widget;

public class Region {
	private int xmin = Integer.MAX_VALUE;
	private int ymin = Integer.MAX_VALUE;
	private int xmax = Integer.MIN_VALUE;
	private int ymax = Integer.MIN_VALUE;
	private String name;
	private ArrayList<lasser.sketch.Widget> widgets = new ArrayList<lasser.sketch.Widget>();
	private ArrayList<Region> children = new ArrayList<Region>();
	private Region parent = null;
	private lasser.sketch.Widget ref = null;
	
	private static final String REGION_PREFIX = "Reg_";
	private static final String TAB = "   ";
	
	public void setCoordinates(int xmin, int ymin, int xmax, int ymax){
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
	}
	public int getXmin() {
		return xmin;
	}
	public void setXmin(int xmin) {
		this.xmin = xmin;
	}
	public int getYmin() {
		return ymin;
	}
	public void setYmin(int ymin) {
		this.ymin = ymin;
	}
	public int getXmax() {
		return xmax;
	}
	public void setXmax(int xmax) {
		this.xmax = xmax;
	}
	public int getYmax() {
		return ymax;
	}
	public void setYmax(int ymax) {
		this.ymax = ymax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<lasser.sketch.Widget> getWidgets() {
		return widgets;
	}
	public void addWidget(lasser.sketch.Widget widget) {
		this.widgets.add(widget);
	}
	public void addWidgets(List<lasser.sketch.Widget> widgets) {
		this.widgets.addAll(widgets);
	}
	public List<Region> getChildren() {
		return children;
	}
	public Region getParent(){
		return parent;
	}
	public lasser.sketch.Widget getRef() {
		return ref;
	}
	public void setRef(lasser.sketch.Widget ref) {
		this.ref = ref;
	}
	public void addChild(Region child) {
		if (child.parent != null)
			child.parent.children.remove(child);
		child.parent = this;
		this.children.add(child);
	}
	public void addChildren(List<Region> children) {
		for (Region r: children)
			addChild(r);
	}
	
	public void setCoordinatesBasedOnChildren(){
		int xmin = Integer.MAX_VALUE;
		int ymin = Integer.MAX_VALUE;
		int xmax = Integer.MIN_VALUE;
		int ymax = Integer.MIN_VALUE;
		for (Widget w: widgets){
			xmin = Math.min(xmin, w.getXPos());
			ymin = Math.min(ymin, w.getYPos());
			xmax = Math.max(xmax, w.getXPos() + w.getWidth() - 1);
			ymax = Math.max(ymax, w.getYPos() + w.getHeight() - 1);
		}
		setCoordinates(xmin, ymin, xmax, ymax);
	}
	
	public void genName(){
		name = REGION_PREFIX + widgets.get(0).getId();
	}
	
	public Rectangle toRectangle(){
		return new Rectangle(xmin, ymin, xmax - xmin + 1, ymax - ymin + 1);
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		toString(this, buf, 0);
		return buf.toString();
	}
	
	private void toString(Region r, StringBuffer buf, int tab){
		String t = "";
		for (int i=0; i<tab; ++i)
			t += TAB;
		String str = t + r.getName() + " ("+r.getXmin()+", "+r.getYmin()+", "+r.getXmax()+", "+r.getYmax()+")\n";
		buf.append(str);
		for (Region child: r.getChildren())
			toString(child, buf, tab+1);
	}
	
}
