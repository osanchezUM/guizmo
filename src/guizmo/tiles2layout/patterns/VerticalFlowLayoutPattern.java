package guizmo.tiles2layout.patterns;

import guizmo.tiles2layout.graphs.*;
import guizmo.tiles2layout.graphs.LGraphUtil.EdgeAttrType;

import java.util.ArrayList;
import java.util.List;

import guizmo.tiles2layout.LayoutType;
import guizmo.tiles.AllenIntervalType;

/**
 * N1, N2 are nodes, E1, E2 are edges edge
 * 
 * LHR:
 * 
 * S = N1 E1 N2 || N1 E1 S
 * being E1.yInterval = BEFORE
 * 
 * NEG:
 * 
 * N1 E2 N3
 * being E2.yInterval = BEFORE
 * 
 * (This means: N1 E1 N2 && N1 E2 N2 -> N1=N2)
 * 
 * RHS:
 * 
 * S = VerticalFlow
 * 
 * 
 * THE CLOSENESS BETWEEN THE NODES IS ALSO TAKEN INTO ACCOUNT
 * 
 */
public class VerticalFlowLayoutPattern extends FlowLayoutPattern{
	
	public VerticalFlowLayoutPattern(){
		super.setAttrType(EdgeAttrType.Y_INTERVAL);
	}

}
