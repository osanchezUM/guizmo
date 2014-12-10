package guizmo.tiles2layout.patterns;

import java.util.List;

import guizmo.tiles.ClosenessType;
import guizmo.tiles2layout.graphs.LNode;
import guizmo.tiles2layout.LayoutType;

public abstract class AbstractLayoutPattern implements LayoutPattern{
	protected static final ClosenessType DEFAULT_CLOSENESS_ALLOWED = ClosenessType.VERY_CLOSE;
	protected ClosenessType closenessLimit = null;
	
	public void setClosenessLimit(ClosenessType limit){
		closenessLimit = limit;
	}

	public abstract List<LNode> match(LNode node);
	
	
}
