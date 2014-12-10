package guizmo.tiles.utilM;

import guizmo.structure.StructurePackage;
import guizmo.structure.StructureRoot;
import guizmo.tiles.*;

import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TileUtil {
	
	/**
	 * Intervals used to define the sense of the edges in the graph
	 */
	public static final AllenIntervalType SEQ_INTERVALS[] = {AllenIntervalType.BEFORE, AllenIntervalType.MEETS};
	public static final AllenIntervalType SEQ_INTERVALS_STRICT[] = {AllenIntervalType.BEFORE};
	
	
	public static final ClosenessType VERY_CLOSE_IMPLICIT[] = {ClosenessType.VERY_CLOSE};
	public static final ClosenessType CLOSE_IMPLICIT[] = {ClosenessType.VERY_CLOSE, ClosenessType.CLOSE};
	public static final ClosenessType FAR_IMPLICIT[] = 
		{ClosenessType.VERY_CLOSE, ClosenessType.CLOSE, ClosenessType.FAR};
	public static final ClosenessType VERY_FAR_IMPLICIT[] = 
		{ClosenessType.VERY_CLOSE, ClosenessType.CLOSE, ClosenessType.FAR, ClosenessType.VERY_FAR};
	
	
	/**
	 * Implicit levels for a given closeness level
	 */
	public static final Map<ClosenessType, ClosenessType[]> IMPLICIT_CLOSENESS_LEVELS = 
			new HashMap<ClosenessType, ClosenessType[]>(){
		{
			put(ClosenessType.VERY_CLOSE, VERY_CLOSE_IMPLICIT);
			put(ClosenessType.CLOSE, CLOSE_IMPLICIT);
			put(ClosenessType.FAR, FAR_IMPLICIT);
			put(ClosenessType.VERY_FAR, VERY_FAR_IMPLICIT);
		}
	};
	
	
	/**
	 * Closeness levels for close tiles
	 */
	//public static final ClosenessType CLOSE_LEVELS[] = {ClosenessType.VERY_CLOSE, ClosenessType.CLOSE};
	
	/**
	 * Closeness levels for close tiles
	 */
	public static final ClosenessType ALL_LEVELS[] = {
		ClosenessType.VERY_CLOSE, ClosenessType.CLOSE, ClosenessType.FAR, ClosenessType.VERY_FAR};
	
	public static final String XINTERVAL = "xInterval";
	public static final String YINTERVAL = "yInterval";
	public static final String CLOSENESS = "closeness";
	
	public static final Map<String, String> OPPOSITE_ATTRIBUTE = new HashMap<String, String>(); 
	static{
		OPPOSITE_ATTRIBUTE.put(XINTERVAL, YINTERVAL);
		OPPOSITE_ATTRIBUTE.put(YINTERVAL, XINTERVAL);
	}
	
	/**
	 * Returns all the edges that have the attribute with a value contained in the array
	 * 
	 * @param edges The list of edges
	 * @param attr The attribute that limits the query
	 * @param values The values of the attribute that limit the query
	 * @return All the edges that do not fulfill the requirements or an empty list
	 */
	public static List<Relation> selectEdges(List<Relation> edges, String attr, Object values[]){
		ArrayList<Relation> result = new ArrayList<Relation>();
		for (Relation r: edges){
			for (Object v: values){
				if (attr.equals(XINTERVAL)){
					if (r.getXInterval() == (AllenIntervalType)v){
						result.add(r);
						break;
					}
				}else if (attr.equals(YINTERVAL)){
					if (r.getYInterval() == (AllenIntervalType)v){
						result.add(r);
						break;
					}
				}else if (attr.equals(CLOSENESS)){
					if (r.getCloseness() == (ClosenessType)v){
						result.add(r);
						break;
					}
				}else{
					throw new RuntimeException(
							attr.toString()+" is not a valid attribute");
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns all the edges that have the attribute with a value NOT contained in the array
	 * 
	 * @param edges The list of edges
	 * @param attr The attribute that limits the query
	 * @param values The values of the attribute that limit the query
	 * @return All the edges that do not fulfill the requirements or an empty list
	 */
	public static List<Relation> rejectEdges(List<Relation> edges, String attr, Object values[]){
		ArrayList<Relation> result = new ArrayList<Relation>();
		for (Relation r: edges){
			boolean addRelation = true;
			for (Object v: values){
				if (attr.equals(XINTERVAL)){
					if (r.getXInterval() == (AllenIntervalType)v){
						addRelation = false;
						break;
					}
				}else if (attr.equals(YINTERVAL)){
					if (r.getYInterval() == (AllenIntervalType)v){
						addRelation = false;
						break;
					}
				}else if (attr.equals(CLOSENESS)){
					if (r.getCloseness() == (ClosenessType)v){
						addRelation = false;
						break;
					}
				}else{
					throw new RuntimeException(
							attr.toString()+" is not a valid attribute");
				}
			}
			if (addRelation)
				result.add(r);
		}
		return result;
	}
	
	/*
	 * Returns all the tiles that are related to the given one by means of relations which
	 * have the attribute with a value contained in the array
	 * NOTE that the CLOSE_LEVELS are taken into account
	 */
	private static List<Tile> getOutgoingNodes(Tile tile, String attr, ClosenessType levels[]){
		List<Relation> out1 = selectEdges(
				tile.getOutgoing(), attr, SEQ_INTERVALS);
		List<Relation> out2 = rejectEdges(
				out1, OPPOSITE_ATTRIBUTE.get(attr), SEQ_INTERVALS);
		List<Relation> out3 = selectEdges(
				out2, CLOSENESS, levels);
		List<Tile> result = new ArrayList<Tile>();
		for (Relation e: out3)
			result.add(e.getTarget());
		return result;
	}
	
	/*
	 * Returns all the tiles that are related to the given one by means of relations which
	 * have the attribute with a value contained in the array
	 * NOTE that the CLOSE_LEVELS are taken into account
	 */
	private static List<Tile> getIncomingNodes(Tile tile, String attr, ClosenessType levels[]){
		List<Relation> in1 = selectEdges(
				tile.getIncoming(), attr, SEQ_INTERVALS);
		List<Relation> in2 = rejectEdges(
				in1, OPPOSITE_ATTRIBUTE.get(attr), SEQ_INTERVALS);
		List<Relation> in3 = selectEdges(
				in2, CLOSENESS, levels);
		List<Tile> result = new ArrayList<Tile>();
		for (Relation e: in3)
			result.add(e.getSource());
		return result;
	}
	
	/*
	 * Returns the nodes on the right of a given one
	 */
	public static List<Tile> getRight(Tile node, ClosenessType levels[]){
		return getOutgoingNodes(node, XINTERVAL, levels);
	}
	
	/*
	 * Returns the nodes on the right of a given one
	 */
	public static List<Tile> getRight(Tile node){
		return getRight(node, TileUtil.ALL_LEVELS);
	}
	
	/*
	 * Returns the nodes below a given one
	 */
	public static List<Tile> getDown(Tile node, ClosenessType levels[]){
		return getOutgoingNodes(node, YINTERVAL, levels);
	}
	
	/*
	 * Returns the nodes below a given one
	 */
	public static List<Tile> getDown(Tile node){
		return getDown(node, ALL_LEVELS);
	}
	
	/*
	 * Returns the nodes on the left of a given one
	 */
	public static List<Tile> getLeft(Tile node, ClosenessType levels[]){
		return getIncomingNodes(node, XINTERVAL, levels);
	}
	
	/*
	 * Returns the nodes on the left of a given one
	 */
	public static List<Tile> getLeft(Tile node){
		return getLeft(node, ALL_LEVELS);
	}
	
	/*
	 * Returns the nodes below a given one
	 */
	public static List<Tile> getUp(Tile node, ClosenessType levels[]){
		return getIncomingNodes(node, YINTERVAL, levels);
	}
	
	/*
	 * Returns the nodes below a given one
	 */
	public static List<Tile> getUp(Tile node){
		return getUp(node, ALL_LEVELS);
	}
	
	/*
	 * Returns true if the relation between the tiles is horizontal
	 */
	public static boolean isHorizontal(Relation relation){
		Tile source = relation.getSource();
		Tile target = relation.getTarget();
		return source.getXMaxPos() < target.getXMinPos();
//		AllenIntervalType x = relation.getXInterval();
//		for (AllenIntervalType interval: SEQ_INTERVALS){
//			if (x == interval)
//				return true;
//		}
//		return false;
	}
	
	/*
	 * Tile coordinates as a Rectangle
	 */
	public static Rectangle toRectangle(Tile t){
		return new Rectangle(
				t.getXMinPos(), t.getYMinPos(), 
				t.getXMaxPos() - t.getXMinPos() + 1,
				t.getYMaxPos() - t.getYMinPos() + 1);
	}
	
	/****************************************/
	
	/*
	 * Loads EMF models from XMI files
	 * 
	 * [0] -> structure
	 * [1] -> tiles
	 */
	public static EObject[] loadModels(String strucModel, String tileModel){
		// DO NOT REMOVE THESE LINES, they are necessary to initialise the packages
		StructurePackage strucPackage = StructurePackage.eINSTANCE;
		TilesPackage lowLevelLayoutPackage = TilesPackage.eINSTANCE;
		
		ResourceSet resSet = new ResourceSetImpl();
		Map<String, Object> m = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		
		String absoluteStrucModelPath = new File(strucModel).getAbsolutePath();
		String tileModelPath = new File(tileModel).getAbsolutePath();
		URI strucUri = URI.createFileURI(absoluteStrucModelPath);
		URI tileUri = URI.createFileURI(tileModelPath);
		Resource strucResource = resSet.getResource(strucUri, true);
		Resource tileResource = resSet.getResource(tileUri, true);
		
		StructureRoot strucRoot = (StructureRoot) strucResource.getContents().get(0);
		LowLayoutRoot tileRoot = (LowLayoutRoot) tileResource.getContents().get(0);
		
		EObject result[] = new EObject[2];
		result[0] = strucRoot;
		result[1] = tileRoot;
		
		return result;
	}
}
