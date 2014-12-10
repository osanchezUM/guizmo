/**
 */
package guizmo.tiles.impl;

import guizmo.tiles.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TilesFactoryImpl extends EFactoryImpl implements TilesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TilesFactory init() {
		try {
			TilesFactory theTilesFactory = (TilesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelum.es/guizmo/tiles"); 
			if (theTilesFactory != null) {
				return theTilesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TilesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TilesPackage.LOW_LAYOUT_ROOT: return createLowLayoutRoot();
			case TilesPackage.SIMPLE_TILE: return createSimpleTile();
			case TilesPackage.OVERLAPPING_TILE: return createOverlappingTile();
			case TilesPackage.LINE_TILE: return createLineTile();
			case TilesPackage.HOLE_TILE: return createHoleTile();
			case TilesPackage.RELATION: return createRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TilesPackage.ASSOCIATION_KIND:
				return createAssociationKindFromString(eDataType, initialValue);
			case TilesPackage.TILE_TYPE:
				return createTileTypeFromString(eDataType, initialValue);
			case TilesPackage.VALIGNMENT_TYPE:
				return createVAlignmentTypeFromString(eDataType, initialValue);
			case TilesPackage.HALIGNMENT_TYPE:
				return createHAlignmentTypeFromString(eDataType, initialValue);
			case TilesPackage.ORIENTATION_TYPE:
				return createOrientationTypeFromString(eDataType, initialValue);
			case TilesPackage.ALLEN_INTERVAL_TYPE:
				return createAllenIntervalTypeFromString(eDataType, initialValue);
			case TilesPackage.CLOSENESS_TYPE:
				return createClosenessTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TilesPackage.ASSOCIATION_KIND:
				return convertAssociationKindToString(eDataType, instanceValue);
			case TilesPackage.TILE_TYPE:
				return convertTileTypeToString(eDataType, instanceValue);
			case TilesPackage.VALIGNMENT_TYPE:
				return convertVAlignmentTypeToString(eDataType, instanceValue);
			case TilesPackage.HALIGNMENT_TYPE:
				return convertHAlignmentTypeToString(eDataType, instanceValue);
			case TilesPackage.ORIENTATION_TYPE:
				return convertOrientationTypeToString(eDataType, instanceValue);
			case TilesPackage.ALLEN_INTERVAL_TYPE:
				return convertAllenIntervalTypeToString(eDataType, instanceValue);
			case TilesPackage.CLOSENESS_TYPE:
				return convertClosenessTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowLayoutRoot createLowLayoutRoot() {
		LowLayoutRootImpl lowLayoutRoot = new LowLayoutRootImpl();
		return lowLayoutRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTile createSimpleTile() {
		SimpleTileImpl simpleTile = new SimpleTileImpl();
		return simpleTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverlappingTile createOverlappingTile() {
		OverlappingTileImpl overlappingTile = new OverlappingTileImpl();
		return overlappingTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTile createLineTile() {
		LineTileImpl lineTile = new LineTileImpl();
		return lineTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoleTile createHoleTile() {
		HoleTileImpl holeTile = new HoleTileImpl();
		return holeTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationKind createAssociationKindFromString(EDataType eDataType, String initialValue) {
		AssociationKind result = AssociationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileType createTileTypeFromString(EDataType eDataType, String initialValue) {
		TileType result = TileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType createVAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		VAlignmentType result = VAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType createHAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		HAlignmentType result = HAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeFromString(EDataType eDataType, String initialValue) {
		OrientationType result = OrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllenIntervalType createAllenIntervalTypeFromString(EDataType eDataType, String initialValue) {
		AllenIntervalType result = AllenIntervalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllenIntervalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosenessType createClosenessTypeFromString(EDataType eDataType, String initialValue) {
		ClosenessType result = ClosenessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClosenessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesPackage getTilesPackage() {
		return (TilesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TilesPackage getPackage() {
		return TilesPackage.eINSTANCE;
	}

} //TilesFactoryImpl
