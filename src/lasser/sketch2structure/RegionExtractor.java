package lasser.sketch2structure;

import java.util.ArrayList;
import java.util.List;

import lasser.regions.Region;
import lasser.regions.RegionUtil;
import lasser.sketch.Container;
import lasser.sketch.SketchRoot;
import lasser.sketch.Widget;
import lasser.sketch.Window;

public class RegionExtractor {
	
	private static final boolean DEBUG = true;
	private static final String EXTRA_INFIX = "_extra";
	private static int idGen = 0;

	/*
	 * 
	 */
	public static List<Region> getRegions(SketchRoot sketchRoot) {
		ArrayList<Region> roots = new ArrayList<Region>(1);
		for (Window window : sketchRoot.getWindows()) {
			roots.add(extractRegions(window));
		}
		if (DEBUG){
			for (Region r: roots)
				System.out.println(r.toString());
		}
		return roots;
	}

	/*
	 * 
	 */
	private static Region extractRegions(Window window) {
		Region winRegion = RegionUtil.createRegion(window);
		ArrayList<Region> allRegions = new ArrayList<Region>();

		// Step 1: identify all containers
		for (Widget w : window.getWidgets()) {
			Region r = RegionUtil.createRegion(w);
			winRegion.addChild(r);
			allRegions.add(r);
		}

		// Step 2: nest regions properly
		int n = allRegions.size();
		for (int i = 0; i < n; ++i) {
			Region r1 = allRegions.get(i);
			for (int j = i + 1; j < n; ++j) {
				Region r2 = allRegions.get(j);
				if (r1 != r2 && RegionUtil.entirelyContains(r1, r2)) {
					boolean r3NonContainer = true;
					boolean r3ContainsBoth = false;
					for (int k = 0; k < n; ++k) {
						Region r3 = allRegions.get(k);
						if (r3 != r2 && r3 != r1 
								&& RegionUtil.entirelyContains(r3, r2)
								&& !RegionUtil.entirelyContains(r3, r1)) {
							r3NonContainer = false;
							break;
						} else if (r3 != r2 && r3 != r1
								&& RegionUtil.entirelyContains(r3, r2)
								&& RegionUtil.entirelyContains(r3, r1)) {
							r3ContainsBoth = true;
							break;
						}
					}
					if (r3NonContainer || r3ContainsBoth){
						r1.addChild(r2);
					}
				}
			}
		}

		// Step 3: create extra regions

		createExtraRegions(winRegion);

		return winRegion;
	}

	/*
	 * 
	 */
	private static void createExtraRegions(Region containerRegion) {
		ArrayList<Region> widgetRegions = new ArrayList<Region>();
		ArrayList<Region> baseRegions = new ArrayList<Region>();
		ArrayList<Region> extraRegions = new ArrayList<Region>();

		// Arrange regions in base and widget regions
		for (Region r : containerRegion.getChildren()) {
			if (RegionUtil.isBaseRegion(r))
				baseRegions.add(r);
			else
				widgetRegions.add(r);
		}

		// If there are no base regions, we do not need to create extra regions
		if (baseRegions.isEmpty())
			return;

		// Iterate over widget regions which are siblings of base regions
		for (Region r: widgetRegions){
			Region baseContainer = RegionUtil.getPartialContainerRegion(baseRegions, r);
			Region extraContainer = RegionUtil.getPartialContainerRegion(extraRegions, r);
			int xmin, xmax, ymin, ymax;
			
			// The widget is contained in a base region
			if (baseContainer != null){
				xmin = Math.min(baseContainer.getXmin(), r.getXmin());
				ymin = Math.min(baseContainer.getYmin(), r.getYmin());
				xmax = Math.max(baseContainer.getXmax(), r.getXmax());
				ymax = Math.max(baseContainer.getYmax(), r.getYmax());
				baseContainer.setCoordinates(xmin, ymin, xmax, ymax);
				baseContainer.addChild(r);
			
			// The widget is partly contained in an extra region
			}else if (extraContainer != null){
				if (RegionUtil.getWholeContainerRegion(extraRegions, r) != null)
					extraContainer.addChild(r);
				else{
					xmin = Math.max(extraContainer.getXmin(), r.getXmin()) + 1;
					ymin = Math.max(extraContainer.getYmin(), r.getYmin()) + 1;
					xmax = Math.min(extraContainer.getXmax(), r.getXmax()) - 1;
					ymax = Math.min(extraContainer.getYmax(), r.getYmax()) - 1;
					extraContainer.setCoordinates(xmin, ymin, xmax, ymax);
				}
			
			// The widget is not partly contained in any existing base or extra	region
			}else{
				// Create new extra region
				//Region newExtraRegion = RegionUtil.createExtraRegion(containerRegion, baseRegions, r);
				// (06/02/14) Extra regions are also used to limite the new created regions
				ArrayList<Region> baseAndExtraRegions = new ArrayList<Region>();
				baseAndExtraRegions.addAll(baseRegions);
				baseAndExtraRegions.addAll(extraRegions);
				//Region newExtraRegion = RegionUtil.createExtraRegion(containerRegion, baseRegions, r);
				Region newExtraRegion = RegionUtil.createExtraRegion(containerRegion, baseAndExtraRegions, r);
				newExtraRegion.setName(containerRegion.getName() + EXTRA_INFIX + idGen++);
				newExtraRegion.addChild(r);
				extraRegions.add(newExtraRegion);
			}
				
		}
		
		// Add the extra regions to the container
		if (!extraRegions.isEmpty())
			containerRegion.addChildren(extraRegions);
		
		// Go on with the children recursively
		for (Region base: baseRegions){
			createExtraRegions(base);
		}
	}

}
