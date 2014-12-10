package lasser.mtraces.utilM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import guizmo.structure.GraphicalElement;
import lasser.mtraces.*;
import lasser.sketch.Widget;

public class TraceStore {
	
	private TraceRoot root;
	private final MtracesFactory factory = MtracesFactory.eINSTANCE;
	private Map<GraphicalElement, List<Widget>> reverseTraces;
	
	public TraceStore(TraceRoot root){
		this.root = root;
	}
	
	public void add(Widget widget, GraphicalElement elem){
		List<Widget> list = new ArrayList<Widget>(1);
		list.add(widget);
		add(list, elem);
	}
	
	public void add(List<Widget> widgetList, GraphicalElement elem){
		Trace t = factory.createTrace();
		String name = "";
		for (Widget w: widgetList){
			name += w.getId();
			t.getSource().add(w);
		}
		t.setTarget(elem);
		t.setName(name);
		root.getTraces().add(t);
	}
	
	public List<Widget> get(GraphicalElement elem){
		Trace t = null;
		if (reverseTraces == null)
			prepareReverseMap();
		return reverseTraces.get(elem);
	}
	
	private void prepareReverseMap(){
		reverseTraces = new HashMap<GraphicalElement, List<Widget>>();
		for (Trace t: root.getTraces()){
			reverseTraces.put(t.getTarget(), t.getSource());
		}
	}
}
