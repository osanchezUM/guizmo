package guizmo.tiles2layout.impl;

import java.awt.Rectangle;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.lang.System.out;

import guizmo.tiles2layout.LayoutType;
import guizmo.layout.*;
import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.LowLayoutRoot;
import guizmo.tiles.Tile;
import guizmo.tiles.utilM.*;
import guizmo.tiles2layout.graphs.*;
import guizmo.tiles2layout.patterns.*;
import guizmo.structure.StructureRoot;
import guizmo.structure.utilM.StructureHelper;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

public class LayoutAnalyzer {

	private static LayoutFactory factory = LayoutFactory.eINSTANCE;
	private static LayoutRoot layoutRoot;
	private static LayoutType layoutTypes[] = LayoutType.values();
	private static final String INFO_SUFFIX = "_info";
	private static final String INFIX = "_";
	private static final float DEFAULT_HALIGNMENT_MARGIN = 0.15f;
	private static final float DEFAULT_VALIGNMENT_MARGIN = 0.15f;
	private static final float DEFAULT_MARGIN_DIFF = 0.07f;
	
	private static Map<Tile, List<Layout>> mappings;
	private static final int NUM_CLOSENESS_LEVELS = 4;
	private static final ClosenessType MIN_CLOSENESS_LEVEL = ClosenessType.VERY_CLOSE;
	private static boolean debug = false;
	private static FileWriter writer = null;
	private static PrintWriter pwriter = null;
	private static int debugPoint = 0;
	private static float hAlignmentMargin;
	private static float vAlignmentMargin;
	private static float marginDiff;
	
	
//	/*
//	 * Allows changing the layout
//	 * Pre: the layout types are not repeated
//	 */
//	public static void setLayoutTypes(LayoutType types[]){
//		if (types.length < 1)
//			throw new RuntimeException("Wrong argument");
//		layoutTypes = types;
//	}
//	
//	/*
//	 * 
//	 */
//	public static void setAlignmentMargins(float hMargin, float vMargin){
//		if (hMargin >= 0 && hMargin < 1)
//			hAlignmentMargin = hMargin;
//		if (vMargin >= 0 && vMargin < 1)
//			vAlignmentMargin = vMargin;
//		LayoutCreator.instance().setAlignmentMargins(hMargin, vMargin);
//	}
	
	
	/*
	 * Returns a stored mapping
	 */
	private static List<Layout> getMapping(Tile tile){
		if (mappings.containsKey(tile))
			return mappings.get(tile);
		else{
			try{
				closeFile();
			}catch(IOException e){
				System.err.println(e.getMessage());
			}
			throw new RuntimeException("Tile not found in mapping: "+tile.getName());
			//return null;
		}
	}
	
	public static LayoutRoot inferLayout(StructureRoot structureRootElem, LowLayoutRoot graphRootElem) {
		return inferLayout(structureRootElem, graphRootElem, LayoutType.values(), 
				DEFAULT_HALIGNMENT_MARGIN, DEFAULT_VALIGNMENT_MARGIN, DEFAULT_MARGIN_DIFF, 0);
	}
	
	public static LayoutRoot inferLayout(StructureRoot structureRootElem, LowLayoutRoot graphRootElem,
			LayoutType types[], float hMargin, float vMargin, float marginDifference, int comparisonMargin) {
		
		// Initialise parameters
		if (hMargin >= 0 && hMargin < 1)
			hAlignmentMargin = hMargin;
		else
			hAlignmentMargin = DEFAULT_HALIGNMENT_MARGIN;
		if (vMargin >= 0 && vMargin < 1)
			vAlignmentMargin = vMargin;
		else
			vAlignmentMargin = DEFAULT_VALIGNMENT_MARGIN;
		if (marginDifference >= 0 && marginDifference < 1)
			marginDiff = marginDifference;
		else
			marginDiff = DEFAULT_MARGIN_DIFF;
		LayoutCreator.instance().setAlignmentMargins(hAlignmentMargin, vAlignmentMargin, marginDiff);
		if (types != null && types.length > 0 || types.length <= LayoutType.values().length)
			layoutTypes = types;
		else
			layoutTypes = LayoutType.values();
		if (comparisonMargin >= 0)
			AllenUtil.setMargin(comparisonMargin);
		
		// Create the root of the layout model
		layoutRoot = factory.createLayoutRoot();
		// Initialize the mappings
		mappings = new HashMap<Tile, List<Layout>>();
		LayoutCreator.instance().setMappings(mappings);
		

		// Traverse the low layout model
		for (Tile vtile: graphRootElem.getViewTiles()){
			LayoutInfoTreeNode vnode = factory.createLayoutInfoTreeNode();
			vnode.setName(vtile.getName() + INFO_SUFFIX);
			layoutRoot.getViewTrees().add(vnode);
			vnode.setGuiElement(vtile.getElement());
			traverseLLModel(vnode, vtile);
		}
		
		// Return the model
		return layoutRoot;
	}
	
	/*
	 *  Traverses the low layout model recursively
	 */
	private static void traverseLLModel(LayoutInfoTreeNode parentNode, Tile tile){
		
//		// DEBUG
//		if (tile.getName().equals("Root")){
//			out.print("");
//		}
		
		if (!tile.getSubtiles().isEmpty()){
			if (tile.getSubtiles().size() > 0){
				List<Layout> list = inferLayout(tile);
				parentNode.getLayoutAlternatives().addAll(list);
				if (parentNode.getReferredBy().isEmpty()){
					for (Layout l: list){
						parentNode.getReferredBy().add(l);
					}
				}
			}
			for (Tile t: tile.getSubtiles()){
				LayoutInfoTreeNode n = factory.createLayoutInfoTreeNode();
				n.setName(t.getName() + INFO_SUFFIX);
				parentNode.getChildrenNodes().add(n);
				n.setGuiElement(t.getElement());
				
				//
				if (tile.getSubtiles().size() > 0){
					List<Layout> layoutList = getMapping(t);
					for (Layout l: layoutList){
						n.getReferredBy().add(l);
					}
				}
				
				if (!t.getSubtiles().isEmpty())
					traverseLLModel(n, t);
				//
//				if (t.getSubtiles().isEmpty()){
//					List<Layout> elementNodeList = getMapping(t);
//					for (Layout enode: elementNodeList){
//						enode.setRefNode(n);
//					}
//				}else{
//					traverseLLModel(n, t);
//				}
			}
		}
	}
	
	
	/*
	 * LAYOUT INFERENCE ALGORITHM
	 * 
	 *	-- G = (V,E) is the problem graph --
	 *	-- L is a set of fixed layouts: HorizontalFlow, VerticalFlow, Grid, Border --
	 *	S <- {} -- solution set (list of possible layouts) --
	 *  while (morePermutations(L))
	 *	   p <- generatePermutation(L) -- permutations? variations? with repetition? --
	 *	   G1 <- copy(G) -- The solution will be stored in G1 --
	 *	   while (remainingNodes(G1)) > 1
	 *	      l <- getLayoutPattern(p)
	 *	      matches <- matchLayout(l, G1)
	 *	      foreach match
	 *	         joinNodes(match, G1)	
	 *	   if not S.contains(G1)
	 *	      f = fitness(G1)
	 *	      S <- (G,f)
	 *
	 *
	 * ---------------------------------------------------------------------------------
	 * 
	 * procedure inferLayout(tile, layoutSet): solutions
	 *	solutions <- {}
	 *	solutionSequences <- {}
	 *	while morePermutations(layoutSet)
	 *		permutation <- nextPermutation(layoutSet)
	 *		currentSolSeq <- {}
	 *		closenessLimit <- MIN_CLOSENESS_LEVEL
	 *		graph <- copyGraph(tile)
	 *		remainingNodes <- graphOrder(current)
	 *		loopsWithoutChanges <- 0
	 *		while remainingNodes > 1 and loopsWithoutChanges < NUM_LAYOUTS * NUM_CLOSENESS_LEVELS
	 *			pattern <- getNextLayoutPattern(permutation)
	 *			discarded <- {}
	 *			matches <- match(graph, closenessLimit)
	 *			if notEmpty(matches)
	 *				add(currentSolSeq , pattern)
	 *				for each match in matches
	 *					mergeNodes(graph, match, pattern)
	 *				loopsWithoutChanges <- 0
	 *				closenessLimit <- MIN_CLOSENESS_LEVEL
	 *				resetSequence(permutation) // sets the sequence to the first layout pattern
	 *			else
	 *				loopsWithoutChanges <- loopsWithoutChanges + 1
	 *				if loopsWithoutChanges > 0 
	 *	            		and loopsWithoutChanges < layoutTypes.length * NUM_CLOSENESS_LEVELS 
	 *	                 	and loopsWithoutChanges % NUM_CLOSENESS_LEVELS = 0
	 *					closenessLimit <- nextClosenessLevel(closenessLimit)
	 *				remainingNodes <- graphOrder(graph)
	 *		if (remainingNodes > 1)
	 *			return("*** No solution ***")
	 *		else
	 *			if notContains(solutionSequences, currentSolSeq)
	 *				add(solutionSequences , currentSolSeq)
	 *				layout <- createLayout(graph)
	 *				layout.fitness <- fitness(layout)
	 *				add(solutions, layout)
	 *				// If the solution consists of a unique layout
	 *				// Then there is no other better solution so we stop trying all the layout variations
	 *				// 07/07/13 FALSE! We could have a several alternatives that fit the layout, e.g. a Form and a Grid
	 *				//if size(currentSolSeq) = 1
	 *				//	break loop
	 *			else
	 *				return("Solution contained in a previous solution")
	 *
	 */
	private static List<Layout> inferLayout(Tile tile){
		List<Layout> solutions = new ArrayList<Layout>();
		
		// Only 1 child tile
		if (tile.getSubtiles().size() == 1){	
			LNode graph = new LNode();
			LGraphUtil.setAttributes(graph, tile);
			//graph.setName(tile.getName()+"#P#");
			graph.setLayoutType(LayoutType.HORIZONTAL_FLOW);
			Rectangle parentRect = TileUtil.toRectangle(tile);
			
			Tile t = tile.getSubtiles().get(0);
			LNode layoutNode = new LNode();
			LGraphUtil.setAttributes(layoutNode, t);
			//layoutNode.setName(t.getName()+"#C#");
			layoutNode.setLayoutType(LayoutType.HORIZONTAL_FLOW);
			layoutNode.setPseudo(true);
			layoutNode.setParent(graph);
			graph.addNode(layoutNode);
			
			LNode widgetNode = new LNode();
			LGraphUtil.setAttributes(widgetNode, t);
			//widgetNode.setName(t.getName()+"#GC#");
			widgetNode.setParent(layoutNode);
			layoutNode.addNode(widgetNode);
			
			Layout layout = LayoutCreator.instance().createLayout(graph, null, parentRect, null);
			//Layout layout = LayoutCreator.instance().createLayout(node, null, parentRect);
			List<Layout> list = new ArrayList<Layout>(1);
			list.add(layout);
			return list;
		}
		
		// More than 1 child tile
		List<List<LayoutType>> solutionSequences = new ArrayList<List<LayoutType>>();
		VariationGenerator variationGen = new VariationGenerator(layoutTypes);
		int remainingNodes;
		while (variationGen.hasMore()){
			LayoutType variation[] = variationGen.next();
			debug("\n"+"* Variation: ", variation);
			List<LayoutType> currentSolSeq = new ArrayList<LayoutType>();
			LayoutSequenceGenerator seqGen = new LayoutSequenceGenerator(variation);
			ClosenessType closenessLimit = MIN_CLOSENESS_LEVEL;
			LNode current = LGraphUtil.copyGraph(tile);
			remainingNodes = LGraphUtil.graphOrder(current);
			int loopsWithoutChanges = 0;
			while (remainingNodes > 1 && loopsWithoutChanges < layoutTypes.length * NUM_CLOSENESS_LEVELS){
				if (loopsWithoutChanges == 0)
					debug(current.printGraph());
				debug(	"Closeness limit: "+closenessLimit+
						"; Remaining nodes: "+remainingNodes+
						"; Loops without changes: "+loopsWithoutChanges);
				LayoutType currentLayout = peekNextLayoutPattern(seqGen);
				debug("Layout to try: "+currentLayout);
				debug("Debug point: #"+debugPoint);
				
				// DEBUG
				if (debugPoint == 6){
					out.print("");
				}
				
				++debugPoint;
				LayoutPattern pattern = getNextLayoutPattern(seqGen);
				pattern.setClosenessLimit(closenessLimit);
				PatternMatcher matcher = new PatternMatcher();
				List<List<LNode>> discarded = new ArrayList<List<LNode>>();
				List<List<LNode>> matches = matcher.match(current, pattern, discarded);
				if (!matches.isEmpty()){
					debug("> Matches: "+matches.size()+" "+matches.toString());
					currentSolSeq.add(currentLayout);
					for (List<LNode> m: matches){
						mergeNodes(current, m, currentLayout);
						// When the nodes are created, there may be wrong edges
						correctEdges(current);
					}
					loopsWithoutChanges = 0;
					closenessLimit = MIN_CLOSENESS_LEVEL;
					seqGen.reset();
				}else{
					debug("No matches");
					++loopsWithoutChanges;
					if (loopsWithoutChanges > 0 && loopsWithoutChanges < layoutTypes.length * NUM_CLOSENESS_LEVELS
							&& loopsWithoutChanges % layoutTypes.length == 0)
						closenessLimit = LGraphUtil.getNextLevel(closenessLimit);
				}
				if (!discarded.isEmpty()){
					debug("> Discarded: "+discarded.size()+" "+discarded.toString());
				}
				remainingNodes = LGraphUtil.graphOrder(current);
			}
			if (remainingNodes > 1){
				debug("*** No solution ***");
			}else{
				debug("Solution: "+currentSolSeq);
				if (!solutionSequences.contains(currentSolSeq)){
					solutionSequences.add(currentSolSeq);
					Layout layout = LayoutCreator.instance().createLayout(current);
					int fitness = LayoutEvaluator.fitness(layout);
					layout.setFitness(fitness);
					solutions.add(layout);
					debug("*** NEW solution. Fitness: "+fitness + " *** \n");
					
					// If the solution consists of a unique layout
					// Then there is no other better solution so we stop trying all the layout variations
					// 07/07/13 FALSE! We could have a several alternatives that fit the layout, e.g. a Form and a Grid
					// -> Anyway, we want all the alternatives!
					//if (currentSolSeq.size() == 1 && 
					//		currentSolSeq.get(0) != LayoutType.HORIZONTAL_FLOW &&
					//		currentSolSeq.get(0) != LayoutType.VERTICAL_FLOW){
					//	debug("*** Solution unique. Stop the search! ***");
					//	break;
					//}
				}else{
					debug("Solution contained in a previous solution");
				}
			}
		}
		
		// If there are no solutions, we create a CustomLayout
		if (solutions.isEmpty()){
			solutions.add(LayoutCreator.instance().createUnknownLayout(tile));
		}
		
		return solutions;
	}
	
	
	/*
	 * Returns the next layout to apply of the sequence
	 * without advancing the current position of the sequence
	 */
	private static LayoutType peekNextLayoutPattern(LayoutSequenceGenerator seq){
		return seq.peek();
	}
	
	/*
	 * Returns the next layout to apply of the sequence
	 */
	private static LayoutPattern getNextLayoutPattern(LayoutSequenceGenerator seq){
		LayoutType l = seq.next();
		return l.getPattern();
	}
	
	/*
	 * Joins the nodes of the graphs. Invokes mergeNodesAux depending on the type of layout
	 */
	private static void mergeNodes(LNode graph, List<LNode> nodes, LayoutType layoutType){
		if (layoutType == LayoutType.FORM){
			List<List<LNode>> lines = LGraphUtil.getNodeLines(nodes);
			List<LNode> mergedNodes = new ArrayList<LNode>();
			for (List<LNode> nodeList: lines){
				//if (nodeList.size() > 1)
				LNode mergedNode = mergeNodesAux(graph, nodeList, LayoutType.HORIZONTAL_FLOW);
				mergedNodes.add(mergedNode);
			}
			mergeNodesAux(graph, mergedNodes, layoutType);
		}else{
			mergeNodesAux(graph, nodes, layoutType);
		}
		
		// Remove edges that do not connect adjacent nodes
		ArrayList<LEdge> edgesSupr = new ArrayList<LEdge>();
		LNode mainNode = graph.getNodes().get(0);
		int n = mainNode.getEdges().size();
		for (int i=0; i<n; ++i){
			LEdge edge1 = mainNode.getEdges().get(i);
			for (int j=i+1; j<n; ++j){
				LEdge edge2 = mainNode.getEdges().get(j);
				if (edge1.getSource() == edge2.getSource() && edge1.getTarget() != edge2.getTarget()){
					LEdge edge3 = LGraphUtil.getEdge(edge1.getTarget(), edge2.getTarget());
					LEdge del = null;
					if (edge3 == null){
						edge3 = LGraphUtil.getEdge(edge2.getTarget(), edge1.getTarget());
						if (edge3 != null){
							del = edge1;
						}
					}else{
						del = edge2;
					}
						
					if (del != null){
						boolean type1 = LGraphUtil.isHorizontal(edge1);
						boolean type2 = LGraphUtil.isHorizontal(edge2);
						boolean type3 = LGraphUtil.isHorizontal(edge3);
						if (type1 == type2 && type2 == type3){
							edgesSupr.add(del);
						}
					}
				}
			}
		} // end_for
		mainNode.getEdges().removeAll(edgesSupr);
	}
	
	/*
	 * Joins the nodes of the graphs. The semantics is the following:
	 * - The group of N nodes is replaced by just 1 node
	 * - The edges between a pair of nodes of the group are removed
	 * - The edges that go from an external node to a node of the group are maintained depending
	 * on the values of the Allen intervals
	 * - (11/02/13) The alignment of the tiles is copied (all the tiles of the group should have the same alignment)
	 * 
	 * Returns the new node that has been inserted into graph
	 * 
	 */
	private static LNode mergeNodesAux(LNode graph, List<LNode> nodes, LayoutType layoutType){
		LNode newNode = new LNode();
		String newName = "";
		
		// Recover the clustering information (closeness) to remake the edges later
		int clusters[] = recoverClusters(graph.getEdges());
		
		// First, change all the incoming edges of the nodes of the group so they
		// are incoming edges of the newNode
		// We do the same with the outgoing edges
		// Then, we put all the matched nodes inside the brand new node
		for (LNode n: nodes){
			if (!newName.equals(""))
				newName += INFIX;
			newName += n.getName();
			List<LEdge> incomingCopy = LGraphUtil.copyList(n.getIncoming());
			for (LEdge e: incomingCopy){
				// Source: external node, Target: internal node
				if (!nodes.contains(e.getSource())){
					e.setTarget(newNode);
				}
				// Source: internal node, Target: internal node
				else{
					//newNode.addEdge(e);
					e.remove();
				}
			}
			List<LEdge> outgoingCopy = LGraphUtil.copyList(n.getOutgoing());
			for (LEdge e: outgoingCopy){
				// Source: internal node, Target: external node
				if (!nodes.contains(e.getTarget())){
					e.setSource(newNode);
				}
			}
			newNode.setXmin(Math.min(newNode.getXmin(), n.getXmin()));
			newNode.setYmin(Math.min(newNode.getYmin(), n.getYmin()));
			newNode.setXmax(Math.max(newNode.getXmax(), n.getXmax()));
			newNode.setYmax(Math.max(newNode.getYmax(), n.getYmax()));
			newNode.addNode(n);
		}
		newNode.setName(newName);
		newNode.setLayoutType(layoutType);
		
		// Re-create the internal edges
		recalculateInteriorEdges(newNode, clusters);
		
		
		// IMPORTANT:
		// In order to set the alignment the margins of both extremes must be assessed
		//LGraphUtil.setAlignmentBasedOnChildren(newNode, graph);
		guizmo.tiles.HAlignmentType htype = RectangleUtil.getAbsHAlignment(
				newNode.toRectangle(), graph.toRectangle(), hAlignmentMargin, marginDiff);
		newNode.setHalignment(htype);
		guizmo.tiles.VAlignmentType vtype = RectangleUtil.getAbsVAlignment(
				newNode.toRectangle(), graph.toRectangle(), vAlignmentMargin, marginDiff);
		newNode.setValignment(vtype);
		
		if (graph.getNodes().isEmpty())
			newNode.setPseudo(true);
		newNode.setParent(graph);
		graph.addNode(newNode);
		
		// Then we remove all the incoming and outgoing edges of the new node that are not needed
		// and we replace some edges by other that are more suitable
		// If there are several nodes that stem from/lead to the same source/target node, 
		// then replace these edges by just one of the suitable type
		// In the end we have to satisfy the constraint that there is only 
		// a directed edge between every pair of nodes
		// Table(sourceNode, targetNode) -> edgeList
		Table<LNode,LNode,List<LEdge>> table = HashBasedTable.create();
		for (LEdge r: newNode.getIncoming()){
			LNode src = r.getSource();
			if (!table.contains(src, newNode))
				table.put(src, newNode, new ArrayList<LEdge>());
			List<LEdge> list = table.get(src, newNode);
			list.add(r);
		}
		for (LEdge r: newNode.getOutgoing()){
			LNode trg = r.getTarget();
			if (!table.contains(newNode, trg))
				table.put(newNode, trg, new ArrayList<LEdge>());
			List<LEdge> list = table.get(newNode, trg);
			list.add(r);
		}
		removeMultipleEdge(table, graph);
		
		// When all the nodes of the graph have been joined according to some layout, it results
		// in a graph containing one node. In that case, we move the contents of the only child
		// to the parent (the graph node)
//		if (graph.getNodes().size() == 1){
//			LNode mainNode = graph.getNodes().get(0);
//			for (LNode n: mainNode.getNodes())
//				graph.addNode(n);
//			for (LEdge e: mainNode.getEdges())
//				graph.addEdge(e);
//			graph.
//		}
		
		// Correct the attributes of the edges based on the recalculated areas of the nodes
		List<LEdge> allEdges = new ArrayList<LEdge>();
		allEdges.addAll(newNode.getIncoming());
		allEdges.addAll(newNode.getOutgoing());
		for (LEdge e: allEdges){
			LNode n1 = e.getSource();
			LNode n2 = e.getTarget();
			AllenIntervalType inth = AllenUtil.getXIntervalType(
					n1.getXmin(), n1.getXmax(), n2.getXmin(), n2.getXmax());
			AllenIntervalType intv = AllenUtil.getYIntervalType(
					n1.getYmin(), n1.getYmax(), n2.getYmin(), n2.getYmax());
			e.setXInterval(inth);
			e.setYInterval(intv);
		}
		
		return newNode;
	}
	
	/*
	 * Recovers the clustering to know the closeness level of a given node distance
	 * returns an array where each position is the limit of a given level,
	 * starting from the closest level
	 */
	private static int[] recoverClusters(List<LEdge> edges){
		int clusters[] = new int[ClosenessType.values().length];
		for (ClosenessType type: ClosenessType.values()){
			clusters[type.getValue()] = Integer.MIN_VALUE;
		}
		for (LEdge edge: edges){
			int distance = -1;
			if (LGraphUtil.isHorizontal(edge)){
				distance = LGraphUtil.getHDistance(edge.getSource(), edge.getTarget());
			}else{
				distance = LGraphUtil.getVDistance(edge.getSource(), edge.getTarget());
			}
			ClosenessType type = edge.getCloseness();
			int index = type.getValue();
			clusters[index] = Math.max(distance, clusters[index]);
		}
		return clusters;
	}
	
	/*
	 * Re calculated the edges after joining nodes.
	 */
	private static void recalculateInteriorEdges(LNode node, int clusters[]){
		// DEBUG: isbn_6_palabras_titulo_8_autores_separados_po_9_editor_10_Formato_11_idioma_12_Tema_13_Buscar_16_ISBNTituloAutor_20_Libros_Encontrados_17_Atras_18_Siguiente_19
		if (node.getName().equals("image_25_Precio_26_Precio_en_euros_27")){
			System.out.println("");
		}
		for (int i=0; i<node.getNodes().size(); ++i){
			for (int j=i+1; j<node.getNodes().size(); ++j){
				LNode n1 = node.getNodes().get(i);
				LNode n2 = node.getNodes().get(j);
				LNode snode = null, tnode = null;
				int d = -1;
				boolean adjacent = false;
				if (	LGraphUtil.areHorizontallySharing(n1, n2, StructureHelper.MARGIN) &&
						LGraphUtil.areHorizontallyAdjacent(n1, n2)){
					adjacent = true;
					if (n1.getXmin() < n2.getXmin()){
						snode = n1;
						tnode = n2;
					}else{
						snode = n2;
						tnode = n1;
					}
					d = tnode.getXmin() - snode.getXmax() - 1;
				}else if (	LGraphUtil.areVerticallySharing(n1, n2, StructureHelper.MARGIN) &&
							LGraphUtil.areVerticallyAdjacent(n1, n2)){
					adjacent = true;
					if (n1.getYmin() < n2.getYmin()){
						snode = n1;
						tnode = n2;
					}else{
						snode = n2;
						tnode = n1;
					}
					d = tnode.getYmin() - snode.getYmax() - 1;
				}
				if (adjacent){
					LEdge edge = LGraphUtil.createEdge(snode, tnode);
					for (int k=0; k<clusters.length; ++k){
						if (d <= clusters[k]){
							edge.setCloseness(ClosenessType.get(k));
							break;
						}
					}
					node.getEdges().add(edge);
				}
			} // end_for
		} // end_for
	}
	
	/*
	 * This method is used to remove multiple edges that are between a pair of nodes,
	 * so in the end we only have one edge between both nodes
	 * The attributes of the (new) edge are modified to be coherent with the attributes of the old edges
	 * @param The table being: (sourceNode, targetNode) -> edgeList
	 */
	private static void removeMultipleEdge(Table<LNode, LNode, List<LEdge>> table, LNode container){
		// Then we check those nodes for which there is more than 1 outgoing edge
		Iterator<Cell<LNode,LNode,List<LEdge>>> iter = table.cellSet().iterator();
		while (iter.hasNext()){
			Cell<LNode,LNode,List<LEdge>> cell = iter.next();
			LNode srcNode = cell.getRowKey();
			LNode trgNode = cell.getColumnKey();
			List<LEdge> edgeList = cell.getValue();
			if (edgeList.size() > 1){
				// Create the new edge
				LEdge newIncomingEdge = getReplacementRelation(edgeList);
				newIncomingEdge.setSource(srcNode);
				newIncomingEdge.setTarget(trgNode);
				container.addEdge(newIncomingEdge);
				// Remove the superfluous edges
				for (LEdge r: edgeList)
					r.remove();
			}
		}
	}
	
	/*
	 * Returns a new edge that can replace the set of edges represented by the argument
	 * Pre: the size of the list is greater than 1
	 */
	private static LEdge getReplacementRelation(List<LEdge> list){
		LEdge newEdge = new LEdge();
		String newName = list.get(0).getName();
		newEdge.setJoined(list.get(0).isJoined());
		newEdge.setXInterval(list.get(0).getXInterval());
		newEdge.setYInterval(list.get(0).getYInterval());
		newEdge.setCloseness(list.get(0).getCloseness());
		for (int i=1; i<list.size(); ++i){
			newName += INFIX + list.get(i).getName();
			//if (list.get(i).getXInterval() != newEdge.getXInterval())
			//	newEdge.setXInterval(AllenUtil.joinIntervals(newEdge.getXInterval(), list.get(i).getXInterval()));
			//if (list.get(i).getYInterval() != newEdge.getYInterval())
			//	newEdge.setYInterval(AllenUtil.joinIntervals(newEdge.getYInterval(), list.get(i).getYInterval()));
			if (list.get(i).getCloseness() == ClosenessType.VERY_CLOSE || newEdge.getCloseness() == ClosenessType.VERY_CLOSE)
				newEdge.setCloseness(ClosenessType.VERY_CLOSE);
			else if (list.get(i).getCloseness() == ClosenessType.CLOSE || newEdge.getCloseness() == ClosenessType.CLOSE)
				newEdge.setCloseness(ClosenessType.CLOSE);
			else if (list.get(i).getCloseness() == ClosenessType.FAR || newEdge.getCloseness() == ClosenessType.FAR)
				newEdge.setCloseness(ClosenessType.FAR);
		}
		newEdge.setName(newName);
		
		return newEdge;
	}
	
	
	/*
	 * When the matches are merged, there may be nodes that if they are seen as a group they
	 * have edges that crosses some nodes. Example:
	 * 
	 * uuu   aaa
	 * 
	 * vvv      bbb
	 * 
	 * www   ccc
	 * 
	 * In this case we have an edge from aaa to ccc.
	 * If we arrange the elements in rows, we have uuu-aaa, vvv-bbb, www-ccc
	 * We can see that the edge from aaa to ccc will cross the matching vvv-bbb.
	 * This method removes these kind of conflicts.
	 */
	private static void correctEdges(LNode graph){
		ArrayList<LEdge> removeEdgeList = new ArrayList<LEdge>();
		for(LEdge edge: graph.getEdges()){
			LNode source = edge.getSource();
			LNode target = edge.getTarget();
			boolean horizontal = LGraphUtil.isHorizontal(edge);
			int xmin, xmax, ymin, ymax;
			if (horizontal){
				xmin = source.getXmax() + 1;
				xmax = target.getXmin() - 1;
				ymin = Math.max(source.getYmin(), target.getYmin());
				ymax = Math.min(source.getYmax(), target.getYmax());
			}else{
				ymin = source.getYmax() + 1;
				ymax = target.getYmin() - 1;
				xmin = Math.max(source.getXmin(), target.getXmin());
				xmax = Math.min(source.getXmax(), target.getXmax());
			}
			Rectangle edgeArea = new Rectangle(xmin, ymin, xmax - xmin + 1, ymax - ymin +1);
			for (LNode node: graph.getNodes()){
				if (node != source && node != target){
					if (node.toRectangle().intersects(edgeArea)){
						if 	(	(horizontal && xmin <= node.getXmin() && xmax >= node.getXmax()) 	||
								(!horizontal && ymin <= node.getYmin() && ymax >= node.getYmax())	){
							debug("Remove "+edge.toString()+"; Crosses: "+node.getName());
							removeEdgeList.add(edge);
							break;
						}
					}
				}
			} // end_for
		} // end_for
		for(LEdge edge: removeEdgeList){
			edge.remove();
		}
		
	}

	
	/****************************************/

	
	/*
	 * Enables the debug mode
	 */
	public static void setDebug(boolean d){
		debug = d;
	}
	
	/*
	 * Changes the debug output to the chosen file
	 */
	public static void setDebugFile(String filename) throws IOException{
		writer = new FileWriter(filename);
		pwriter = new PrintWriter(writer);
		debug = true;
	}
	
	/*
	 * Closes an open debug file
	 */
	public static void closeFile() throws IOException{
		pwriter.close();
		writer.close();
	}

	/*
	 * Prints in console if debug mode is enabled
	 */
	private static void debug(String str){
		if (debug){
			out.println(str);
			if (pwriter != null)
				pwriter.println(str);
		}
	}
	
	/*
	 * Prints in console if debug mode is enabled
	 * In this case it prints an string followed by a list
	 */
	private static void debug(String str, Object array[]){
		if (debug){
			out.print(str);
			for (Object o: array)
				out.print(o.toString()+" ");
			out.println();
			if (pwriter != null){
				pwriter.print(str);
				for (Object o: array)
					pwriter.print(o.toString()+" ");
				pwriter.println();
			}
		}
	}
	
}
