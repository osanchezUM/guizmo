package guizmo.tiles2layout.graphs;

import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.Relation;

public class LEdge {
	private String name;
	private Relation relation;
	private AllenIntervalType xInterval;
	private AllenIntervalType yInterval;
	private ClosenessType closeness;
	private boolean joined;
	private LNode source;
	private LNode target;
	private LNode container;
	
	public String toString(){
		String result = "Edge: " + source.getName() + " --> ";
		//result += getName() +
		result += target.getName();
		result += " (";
		result += briefAllenInterval(xInterval)+","+briefAllenInterval(yInterval)+","+briefCloseness(closeness);
		result += ") ";
		return result;
	}
	
	private String briefAllenInterval(AllenIntervalType interval){
		switch(interval){
			case AFTER:
				return "A";
			case BEFORE:
				return "B";
			case CONTAINS:
				return "C";
			case DURING:
				return "D";
			case EQUAL:
				return "E";
			case FINISHED_BY:
				return "FB";
			case FINISHES:
				return "F";
			case MEETS:
				return "M";
			case MET_BY:
				return "MB";
			case OVERLAPPED_BY:
				return "OB";
			case OVERLAPS:
				return "O";
			case STARTED_BY:
				return "SB";
			case STARTS:
				return "S";
			default:
				return "?";
		}
	}
	
	private String briefCloseness(ClosenessType clos){
		switch(clos){
			case CLOSE:
				return "C";
			case FAR:
				return "F";
			case VERY_CLOSE:
				return "VC";
			case VERY_FAR:
				return "VF";
			default:
				return "?";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	
	public AllenIntervalType getXInterval() {
		return xInterval;
	}
	
	public void setXInterval(AllenIntervalType xInterval) {
		this.xInterval = xInterval;
	}
	
	public AllenIntervalType getYInterval() {
		return yInterval;
	}
	
	public void setYInterval(AllenIntervalType yInterval) {
		this.yInterval = yInterval;
	}
	
	public ClosenessType getCloseness() {
		return closeness;
	}
	
	public void setCloseness(ClosenessType closeness) {
		this.closeness = closeness;
	}
	
	public boolean isJoined() {
		return joined;
	}
	
	public void setJoined(boolean joined) {
		this.joined = joined;
	}
	
	public LNode getSource() {
		return source;
	}
	
	public void setSource(LNode node) {
		if (source != null)
			source.getOutgoing().remove(this);
		source = node;
		node.getOutgoing().add(this);
	}
	
	public LNode getTarget() {
		return target;
	}
	
	public void setTarget(LNode node) {
		if (target != null)
			target.getIncoming().remove(this);
		target = node;
		node.getIncoming().add(this);
	}
	
	public void remove(){
		source.getOutgoing().remove(this);
		target.getIncoming().remove(this);
		container.getEdges().remove(this);
		source = null;
		target = null;
		relation = null;
		container = null;
	}

	public LNode getContainer() {
		return container;
	}

	protected void setContainer(LNode container) {
		this.container = container;
	}
	
}
