package lasser.facade;

import guizmo.structure.StructureRoot;
import guizmo.structure2tiles.Structure2Tiles;
import guizmo.swingGenerator.SwingGenerator;
import guizmo.tiles.utilM.AllenUtil;
import guizmo.tiles2layout.LayoutType;
import guizmo.tiles2layout.Tiles2Layout;
import guizmo.tiles2layout.Tiles2LayoutException;

import java.io.IOException;
import java.util.Map;

import lasser.modelUtil.ModelUtil;
import lasser.mtraces.TraceRoot;
//import lasser.rad2sketch.RAD2Sketch;
import lasser.sketch.SketchRoot;
import lasser.sketch2structure.Sketch2Structure;
import lasser.wireframe2sketch.WireframeSketcher2Sketch;

public class LasserFacade {
	
	/**
	 * Supported layout types
	 *
	 */
	public enum LayoutKind {
		HORIZONTAL_FLOW_LAYOUT (guizmo.tiles2layout.LayoutType.HORIZONTAL_FLOW),
		VERTICAL_FLOW_LAYOUT (guizmo.tiles2layout.LayoutType.VERTICAL_FLOW),
		BORDER_LAYOUT (guizmo.tiles2layout.LayoutType.BORDER),
		GRID_LAYOUT (guizmo.tiles2layout.LayoutType.GRID),
		FORM_LAYOUT (guizmo.tiles2layout.LayoutType.FORM)
		;
		
		private guizmo.tiles2layout.LayoutType type;
		
		LayoutKind(guizmo.tiles2layout.LayoutType type){
			this.type = type;
		}
		
		public guizmo.tiles2layout.LayoutType getActualType(){
			return type;
		}
	}
	
	/** Path where the all the (intermediate) models will be created */
	public static final String TEMP_MODEL_PATH = "temp_model_path";
	
	/** Path to the layout inference algorithm debug file */
	public static final String LAYOUT_DEBUG_FILE = "layout_debug_file";
	
	/**
	 * This option is used to define the intervals for the predefined closeness limits.
	 * The parameter should contain 3 values for the four defined levels.
	 * value <= parameter1 --> the distance is VERY_CLOSE
	 * parameter1 < value <= parameter2 --> the distance if CLOSE
	 * parameter2 < value <= parameter3 --> the distance is FAR
	 * parameter3 < value --> the distance is VERY_FAR
	 */
	public static final String LAYOUT_CLOSENESS_LIMITS = "layout_closeness_limits";
	//private static final float DEFAULT_CLOSENESS_LIMITS[] = {0.007f, 0.07f, 0.2f};
	private static final float[] DEFAULT_CLOSENESS_LIMITS = {0.03f, 0.2f, 0.4f};
	
	/** Layout types to be used */
	public static final String LAYOUT_TYPES_ALLOWED = "layout_types_allowed";
	private static final LayoutType[] DEFAULT_LAYOUT_TYPES_ALLOWED = LayoutType.values();
	
	/** (Horizontal,Vertical) alignment margin for an element to be considered as aligned to the left, right, top or bottom */
	public static final String HV_ALIGNMENT_MARGINS = "hv_alignment_margins";
	private static final float[] DEFAULT_ALIGNMENT_MARGINS = {0.15f, 0.15f};
	
	/** Minimum difference between the horizontal or vertical margins for they to be considered as aligned differently */
	public static final String MARGIN_DIFF = "margin_diff";
	private static final float DEFAULT_MARGIN_DIFF = 0.07f;
	
	/** Margin used to compare the relative position of the elements (used to infer the alignment, etc.) */
	public static final String COMPARISON_MARGIN_PX = "comparison_margin_px";
	private static final int DEFAULT_COMPARISON_MARGIN_PX = 10;
	
	/** Maximum deviation (float) of the elements that compose a cluster. It is used when calculating the closeness levels */
	public static final String MAX_CLUSTER_DEVIATION = "max_cluster_deviation";
	private static final float DEFAULT_MAX_CLUSTER_DEVIATION = 15f;
	
	private static final String DEFAULT_WIN_MODEL_PATH = "C:/Windows/temp/";
	private static final String DEFAULT_LINUX_MODEL_PATH = "/tmp/";
	private static final String WIREFRAME_EXTENSION = ".screen";
	private static final String MODEL_EXTENSION = ".xmi";
	private static final String SKETCH_SUFFIX = "_sket";
	private static final String REGION_SUFFIX = "_reg";
	private static final String STRUCTURE_SUFFIX = "_struc";
	private static final String TRACES_SUFFIX = "_traces";
	private static final String TILE_SUFFIX = "_tiles";
	private static final String LAYOUT_SUFFIX = "_lyt";
	
	private static LasserFacade instance = null;
	
	private LasserFacade(){}
	
	public static LasserFacade instance(){
		if (instance == null)
			instance = new LasserFacade();
		return instance;
	}
	
	/**
	 * Generates a layout model derived from the source UI specification expressed with Wireframe Sketcher
	 * 
	 * @param sourceFile Source UI specification
	 * @param strucModel Target structure model
	 * @param layoutModel Target layout model
	 * @param options Tool options such as temporary file, layout algorithm parameters, etc.
	 * @throws IOException
	 * @throws LasserException
	 */
	public void genLayoutModelFromWireframeSketcher(String sourceFile, String strucModel, String layoutModel, Map<String, Object> options)
			throws IOException, LasserException{
		
		String model_path = getModelPath(options);
		String basename = getBasename(sourceFile);
		String sketchModelPath = model_path + basename + SKETCH_SUFFIX + MODEL_EXTENSION;

		// WIREFRAME/... (SPECIFIC) --> SKETCH (GENERIC)
		SketchRoot sketchRoot = null;
		if (sourceFile.endsWith(WIREFRAME_EXTENSION))
			sketchRoot = WireframeSketcher2Sketch.execute(sourceFile);
		else
			throw new RuntimeException("Source file format not supported: "	+ sourceFile);
		
		// Serialise the (generic) sketch model
		ModelUtil.serialize(sketchRoot, sketchModelPath);
		
		// Continue with the rest of the transformation chain to get the layout model
		genLayoutModel(sketchModelPath, sourceFile, strucModel, layoutModel, options);
	}
	
	
	/**
	 * Generates a layout model derived from the source UI specification expressed with Wireframe Sketcher
	 * 
	 * @param sourceFile Source UI specification
	 * @param strucModel Target structure model
	 * @param layoutModel Target layout model
	 * @param options Tool options such as temporary file, layout algorithm parameters, etc.
	 * @throws IOException
	 * @throws LasserException
	 */
//	public void genLayoutModelFromRAD(String sourceFile, String strucModel, String layoutModel, Map<String, Object> options)
//			throws IOException, LasserException{
//		
//		String model_path = getModelPath(options);
//		String basename = getBasename(sourceFile);
//		String sketchModelPath = model_path + basename + SKETCH_SUFFIX + MODEL_EXTENSION;
//
//		// RAD --> SKETCH 
//		SketchRoot sketchRoot = RAD2Sketch.execute(sourceFile);
//		
//		// Serialise the (generic) sketch model
//		ModelUtil.serialize(sketchRoot, sketchModelPath);
//		
//		// Continue with the rest of the transformation chain to get the layout model
//		genLayoutModel(sketchModelPath, sourceFile, strucModel, layoutModel, options);
//	}
	
	
	
	/**
	 * Generates a layout model derived from the source UI specification
	 * 
	 * @param sketchModelPath Path to the sketch model
	 * @param sourceFile Source UI specification (is used to get the name and paths)
	 * @param strucModel Target structure model
	 * @param layoutModel Target layout model
	 * @param options Tool options such as temporary file, layout algorithm parameters, etc.
	 * @throws IOException
	 * @throws LasserException
	 */
	private void genLayoutModel(String sketchModelPath, String sourceFile, String strucModel, String layoutModel, Map<String, Object> options)
			throws IOException, LasserException{
		
		String model_path = getModelPath(options);
		String basename = getBasename(sourceFile);
		//String sketchModelPath = 	model_path + basename + SKETCH_SUFFIX 	+ MODEL_EXTENSION;
		String regionModelPath = 	model_path + basename + REGION_SUFFIX	+ MODEL_EXTENSION;
		//String strucModelPath = model_path + basename + STRUCTURE_SUFFIX+ MODEL_EXTENSION;
		String traceModelPath = 	model_path + basename + TRACES_SUFFIX	+ MODEL_EXTENSION;
		String tileModelPath = 		model_path + basename + TILE_SUFFIX		+ MODEL_EXTENSION;
		//String layoutModelPath = 	model_path + basename + LAYOUT_SUFFIX 	+ MODEL_EXTENSION;
		
		
		/********************************************************************************/

		
		
		// SKETCH --> STRUCTURE + TRACES
		Sketch2Structure sk2st = new Sketch2Structure();
		StructureRoot root = sk2st.execute(sketchModelPath);
		TraceRoot troot = sk2st.getTraceModel();
		ModelUtil.serialize(root, strucModel);
		ModelUtil.serialize(troot, traceModelPath);
		
		
		// STRUCTURE --> TILES
		float closenessLimits[] = DEFAULT_CLOSENESS_LIMITS;
		if (options.containsKey(LAYOUT_CLOSENESS_LIMITS))
			closenessLimits = (float [])options.get(LAYOUT_CLOSENESS_LIMITS);
		
		// This option affects Structure2Tiles and Tiles2Layout
		int comparisonMargin = DEFAULT_COMPARISON_MARGIN_PX;
		if (options.containsKey(COMPARISON_MARGIN_PX) && (Integer)options.get(COMPARISON_MARGIN_PX) > 0)
			comparisonMargin = (Integer)options.get(COMPARISON_MARGIN_PX);
		AllenUtil.setMargin(comparisonMargin);
		float maxClusterDeviation = -1;
		if (options.containsKey(MAX_CLUSTER_DEVIATION) && (Float)options.get(MAX_CLUSTER_DEVIATION) > 0)
			maxClusterDeviation = (Float)options.get(MAX_CLUSTER_DEVIATION);
		Structure2Tiles.execute(strucModel, tileModelPath, closenessLimits, maxClusterDeviation);
		
		
		// TILES --> LAYOUT
		try{
			String debugFile = null;
			if (options.containsKey(LAYOUT_DEBUG_FILE))
				debugFile = (String)options.get(LAYOUT_DEBUG_FILE);
			LayoutType types[] = null;
			if (options.containsKey(LAYOUT_TYPES_ALLOWED))
				types = convertTypes((LayoutKind[])options.get(LAYOUT_TYPES_ALLOWED));
			else
				types = DEFAULT_LAYOUT_TYPES_ALLOWED;
			float alignmentMargins[] = null;
			float hmargin, vmargin;
			if (options.containsKey(HV_ALIGNMENT_MARGINS))
				alignmentMargins = (float [])options.get(HV_ALIGNMENT_MARGINS);
			if (alignmentMargins == null || alignmentMargins.length == 0 || alignmentMargins[0] < 0 || alignmentMargins[0] > 1)
				hmargin = DEFAULT_ALIGNMENT_MARGINS[0];
			else
				hmargin = alignmentMargins[0];
			if (alignmentMargins == null || alignmentMargins.length <= 1 || alignmentMargins[1] < 0 || alignmentMargins[1] > 1)
				vmargin = DEFAULT_ALIGNMENT_MARGINS[1];
			else
				vmargin = alignmentMargins[1];
			float marginDiff = DEFAULT_MARGIN_DIFF;
			if (options.containsKey(MARGIN_DIFF))
				marginDiff = (Float)options.get(MARGIN_DIFF);
				
			Tiles2Layout.execute(strucModel, tileModelPath, layoutModel, types, true, debugFile, hmargin, vmargin, marginDiff, comparisonMargin);
		}catch(Tiles2LayoutException e){
			throw new LasserException(e.getMessage());
		}catch(ClassCastException e){
			throw new LasserException("Bad parameters: "+e.getMessage());
		}
		
	}
	
	/**
	 * Generates a layout model derived from the source UI specification
	 * 
	 * @param structureModel Structure model
	 * @param layoutModel Layout model
	 * @param outputDir Output directory
	 */
	public void genSwingUI(String structureModel, String layoutModel, String outputDir)
			throws IOException{
		
		// LAYOUT --> JAVA SWING
		SwingGenerator.execute(structureModel, layoutModel, outputDir);
	}
	
	/*
	 * 
	 */
	private String getModelPath(Map<String, Object> options){
		boolean windowsOS = false;
		String os = System.getProperty("os.name");
		if (os.toLowerCase().contains("windows") || os.toLowerCase().contains("win"))
			windowsOS = true;
		
		// Paths to files and models
		String model_path = null;
		if (options.containsKey(TEMP_MODEL_PATH)){
			model_path = (String)options.get(TEMP_MODEL_PATH);
			if (model_path.contains("\\") && !model_path.endsWith("\\"))
				model_path += "\\";
			else if (!model_path.contains("\\") && !model_path.endsWith("/"))
				model_path += "/";	
		}else{
			if (windowsOS)
				model_path = DEFAULT_WIN_MODEL_PATH;
			else
				model_path = DEFAULT_LINUX_MODEL_PATH;
		}
		return model_path;
	}
	
	private String getBasename(String sourceFile){
		String basename = null;
		if (sourceFile.contains("\\"))
			basename = sourceFile.substring(sourceFile.lastIndexOf("\\")+1, sourceFile.lastIndexOf("."));
		else
			basename = sourceFile.substring(sourceFile.lastIndexOf("/")+1, sourceFile.lastIndexOf("."));
		return basename;
	}
	
	/*
	 * 
	 */
	private guizmo.tiles2layout.LayoutType[] convertTypes(LayoutKind types[]){
		guizmo.tiles2layout.LayoutType[] result = new guizmo.tiles2layout.LayoutType[types.length];
		for(int i=0; i< types.length; ++i){
			LayoutKind t = types[i];
			result[i] = t.getActualType();
		}
		return result;
	}
}
