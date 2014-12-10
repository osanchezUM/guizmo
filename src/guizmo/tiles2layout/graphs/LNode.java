package guizmo.tiles2layout.graphs;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import guizmo.tiles2layout.LayoutType;
import guizmo.tiles2layout.impl.LayoutAnalyzer;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.Tile;
import guizmo.tiles.VAlignmentType;
import guizmo.structure.GraphicalElement;

public class LNode {
	private String name;
	private List<Tile> tiles;
	private GraphicalElement gElement;
	private List<LNode> nodes;
	private List<LEdge> edges;
	private LNode parent;
	private List<LEdge> incoming;
	private List<LEdge> outgoing;
	//private boolean aggregate;
	//private boolean visited;
	private boolean pseudo;
	private LayoutType layoutType;
	private HAlignmentType halignment;
	private VAlignmentType valignment;
	private int xmin = Integer.MAX_VALUE;
	private int ymin = Integer.MAX_VALUE;
	private int xmax = Integer.MIN_VALUE;
	private int ymax = Integer.MIN_VALUE;
	
	public LNode(){
		nodes = new ArrayList<LNode>();
		edges = new ArrayList<LEdge>();
		incoming = new ArrayList<LEdge>();
		outgoing = new ArrayList<LEdge>();
		tiles = new ArrayList<Tile>();
		//aggregate = false;
		pseudo = false;
	}
	
	public String toString(){
		String redName = name;
//		if (name.length() > 30)
//			redName = name.substring(0, 29) + "...";
		String result = "Node: " + redName;
		result += " (h: "+halignment.name();
		result += ", v: "+valignment.name()+")";
		/*
		result += " (tile: ";
		if (tile == null)
			result += "NULL; ";
		else
			result += tile.getName()+"; ";
		if (parent != null)
			result += "parent: "+parent.getName();
		result += "; in: ";
		for (LEdge e: incoming)
			result += e.getName()+" ";
		result += "; out: ";
		for (LEdge e: outgoing)
			result += e.getName()+" ";
		result += ")";
		*/
		return result;
	}
	
	public String printGraph(){
		String result = "Graph "+getName()+" (tile: ";
		if (tiles.size() == 0)
			result += "EMPTY";
		if (tiles.size() == 1)
			result += tiles.get(0).getName();
		else
			result += "AGGREGATE";
		result += "; order: "+nodes.size()+") \n";
		for (LNode n: nodes)
			result += n.toString() + "\n";
		for (LEdge e: edges)
			result += e.toString() + "\n";
		return result.substring(0, result.lastIndexOf("\n"));
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Tile> getTiles() {
		return tiles;
	}
	
	public void addTile(Tile tile) {
		tiles.add(tile);
	}
	
	public GraphicalElement getgElement() {
		return gElement;
	}
	
	public void setgElement(GraphicalElement gElement) {
		this.gElement = gElement;
	}
	
	public List<LNode> getNodes() {
		return nodes;
	}
	
	public void addNode(LNode node){
		LNode oldParent = node.getParent();
		if (oldParent != null)
			oldParent.getNodes().remove(node);
		nodes.add(node);
		node.setParent(this);
	}
	
	public void addNode(LNode node, int position){
		LNode oldParent = node.getParent();
		if (oldParent != null)
			oldParent.getNodes().remove(node);
		nodes.add(position, node);
		node.setParent(this);
	}
	
	public List<LEdge> getEdges() {
		return edges;
	}
	
	public void addEdge(LEdge edge){
		LNode oldParent = edge.getContainer();
		if (oldParent != null)
			oldParent.getEdges().remove(edge);
		edge.setContainer(this);
		edges.add(edge);
	}

	public LNode getParent() {
		return parent;
	}
	
	public void setParent(LNode parent) {
		this.parent = parent;
	}
	
	public List<LEdge> getIncoming() {
		return incoming;
	}
	
	public void addIncoming(LEdge edge) {
		incoming.add(edge);
		edge.setTarget(this);
	}
	
	public List<LEdge> getOutgoing() {
		return outgoing;
	}
	
	public void addOutgoing(LEdge edge) {
		outgoing.add(edge);
		edge.setSource(this);
	}

	public LayoutType getLayoutType() {
		return layoutType;
	}

	public void setLayoutType(LayoutType layoutType) {
		this.layoutType = layoutType;
	}
	
	public void removeTiles(){
		tiles.clear();
	}

	public HAlignmentType getHalignment() {
		return halignment;
	}

	public void setHalignment(HAlignmentType halignment) {
		this.halignment = halignment;
	}

	public VAlignmentType getValignment() {
		return valignment;
	}

	public void setValignment(VAlignmentType valignment) {
		this.valignment = valignment;
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
	
	public Rectangle toRectangle(){
		return new Rectangle(xmin, ymin, xmax - xmin + 1, ymax - ymin +1);
	}
	
	public void setPseudo(boolean pseudo) {
		this.pseudo = pseudo;
	}
	
	public boolean isPseudo() {
		return pseudo;
	}
	
//	public void setAlignmentBasedOnChildren(){
//		int l = 0, c = 0, r = 0, t = 0, m = 0, b = 0;
//		for (LNode n: nodes){
//			if (n.getHalignment() == HAlignmentType.LEFT)
//				++l;
//			else if (n.getHalignment() == HAlignmentType.CENTER)
//				++c;
//			else if (n.getHalignment() == HAlignmentType.RIGHT)
//				++r;
//			if (n.getValignment() == VAlignmentType.TOP)
//				++t;
//			else if (n.getValignment() == VAlignmentType.MIDDLE)
//				++m;
//			else if (n.getValignment() == VAlignmentType.BOTTOM)
//				++b;
//		}
//		if (l > 0)
//			halignment = HAlignmentType.LEFT;
//		else if (r > 0)
//			halignment = HAlignmentType.RIGHT;
//		else if (c > 0)
//			halignment = HAlignmentType.CENTER;
//		else
//			halignment = HAlignmentType.NONE;
//		if (t > 0)
//			valignment = VAlignmentType.TOP;
//		else if (b > 0)
//			valignment = VAlignmentType.BOTTOM;
//		else if (m > 0)
//			valignment = VAlignmentType.MIDDLE;
//		else
//			valignment = VAlignmentType.NONE;
//	}
	
}
