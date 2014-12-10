package guizmo.tiles2layout.patterns;

import guizmo.tiles2layout.graphs.LGraphUtil.EdgeAttrType;
import guizmo.tiles2layout.LayoutType;



/**
 * N1, N2 are nodes, E1, E2 are edges edge
 * 
 * 
 * S = N1 --> N2 | N1 --> S
 * 
 * LHR:
 * 
 * S = N1 E1 N2 || N1 E1 S
 * being E1.xInterval = BEFORE
 * 
 * NEG:
 * 
 * N1 E2 N3
 * being E2.xInterval = BEFORE
 * 
 * (This means: N1 E1 N2 && N1 E2 N2 -> N1=N2)
 * 
 * RHS:
 * 
 * S = HorizontalFlow
 * 
 * 
 * THE CLOSENESS BETWEEN THE NODES IS ALSO TAKEN INTO ACCOUNT
 * 
 */
public class HorizontalFlowLayoutPattern extends FlowLayoutPattern {
	
	public HorizontalFlowLayoutPattern(){
		super.setAttrType(EdgeAttrType.X_INTERVAL);
	}

}
