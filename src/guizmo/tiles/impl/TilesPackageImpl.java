/**
 */
package guizmo.tiles.impl;

import guizmo.structure.StructurePackage;

import guizmo.tiles.AlignedElement;
import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.AssociationKind;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.HoleTile;
import guizmo.tiles.LineTile;
import guizmo.tiles.LowLayoutRoot;
import guizmo.tiles.NamedElement;
import guizmo.tiles.OrientationType;
import guizmo.tiles.OverlappingTile;
import guizmo.tiles.Relation;
import guizmo.tiles.SimpleTile;
import guizmo.tiles.Tile;
import guizmo.tiles.TileType;
import guizmo.tiles.TilesFactory;
import guizmo.tiles.TilesPackage;
import guizmo.tiles.VAlignmentType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TilesPackageImpl extends EPackageImpl implements TilesPackage {
	
	
	
	@Override
	protected org.eclipse.emf.ecore.resource.Resource createResource(String uri) {
		return super.createResource(
				"../../guizmo.tileMM/bin/guizmo/tileMM/tiles.ecore"	
				);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowLayoutRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlappingTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holeTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vAlignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hAlignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allenIntervalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum closenessTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see guizmo.tiles.TilesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TilesPackageImpl() {
		super(eNS_URI, TilesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TilesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TilesPackage init() {
		if (isInited) return (TilesPackage)EPackage.Registry.INSTANCE.getEPackage(TilesPackage.eNS_URI);

		// Obtain or create and register package
		TilesPackageImpl theTilesPackage = (TilesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TilesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TilesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTilesPackage.createPackageContents();

		// Initialize created meta-data
		theTilesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTilesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TilesPackage.eNS_URI, theTilesPackage);
		return theTilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowLayoutRoot() {
		return lowLayoutRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLowLayoutRoot_ViewTiles() {
		return (EReference)lowLayoutRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignedElement() {
		return alignedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignedElement_VerticalAlignment() {
		return (EAttribute)alignedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignedElement_HorizontalAlignment() {
		return (EAttribute)alignedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Outgoing() {
		return (EReference)tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Incoming() {
		return (EReference)tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Up() {
		return (EReference)tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Down() {
		return (EReference)tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Left() {
		return (EReference)tileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Right() {
		return (EReference)tileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Element() {
		return (EReference)tileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_XMinPos() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_XMaxPos() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_YMinPos() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_YMaxPos() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_HSize() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_VSize() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_AssociationKind() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_TileType() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Subtiles() {
		return (EReference)tileEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Relations() {
		return (EReference)tileEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_LeftMargin() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_RightMargin() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_TopMargin() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTile_BottomMargin() {
		return (EAttribute)tileEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTile() {
		return simpleTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlappingTile() {
		return overlappingTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineTile() {
		return lineTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineTile_Orientation() {
		return (EAttribute)lineTileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoleTile() {
		return holeTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_XInterval() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_YInterval() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Closeness() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Joined() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociationKind() {
		return associationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTileType() {
		return tileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVAlignmentType() {
		return vAlignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHAlignmentType() {
		return hAlignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationType() {
		return orientationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllenIntervalType() {
		return allenIntervalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClosenessType() {
		return closenessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesFactory getTilesFactory() {
		return (TilesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		lowLayoutRootEClass = createEClass(LOW_LAYOUT_ROOT);
		createEReference(lowLayoutRootEClass, LOW_LAYOUT_ROOT__VIEW_TILES);

		alignedElementEClass = createEClass(ALIGNED_ELEMENT);
		createEAttribute(alignedElementEClass, ALIGNED_ELEMENT__VERTICAL_ALIGNMENT);
		createEAttribute(alignedElementEClass, ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT);

		tileEClass = createEClass(TILE);
		createEReference(tileEClass, TILE__OUTGOING);
		createEReference(tileEClass, TILE__INCOMING);
		createEReference(tileEClass, TILE__UP);
		createEReference(tileEClass, TILE__DOWN);
		createEReference(tileEClass, TILE__LEFT);
		createEReference(tileEClass, TILE__RIGHT);
		createEReference(tileEClass, TILE__ELEMENT);
		createEAttribute(tileEClass, TILE__XMIN_POS);
		createEAttribute(tileEClass, TILE__XMAX_POS);
		createEAttribute(tileEClass, TILE__YMIN_POS);
		createEAttribute(tileEClass, TILE__YMAX_POS);
		createEAttribute(tileEClass, TILE__HSIZE);
		createEAttribute(tileEClass, TILE__VSIZE);
		createEAttribute(tileEClass, TILE__ASSOCIATION_KIND);
		createEAttribute(tileEClass, TILE__TILE_TYPE);
		createEReference(tileEClass, TILE__SUBTILES);
		createEReference(tileEClass, TILE__RELATIONS);
		createEAttribute(tileEClass, TILE__LEFT_MARGIN);
		createEAttribute(tileEClass, TILE__RIGHT_MARGIN);
		createEAttribute(tileEClass, TILE__TOP_MARGIN);
		createEAttribute(tileEClass, TILE__BOTTOM_MARGIN);

		simpleTileEClass = createEClass(SIMPLE_TILE);

		overlappingTileEClass = createEClass(OVERLAPPING_TILE);

		lineTileEClass = createEClass(LINE_TILE);
		createEAttribute(lineTileEClass, LINE_TILE__ORIENTATION);

		holeTileEClass = createEClass(HOLE_TILE);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__NAME);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);
		createEAttribute(relationEClass, RELATION__XINTERVAL);
		createEAttribute(relationEClass, RELATION__YINTERVAL);
		createEAttribute(relationEClass, RELATION__CLOSENESS);
		createEAttribute(relationEClass, RELATION__JOINED);

		// Create enums
		associationKindEEnum = createEEnum(ASSOCIATION_KIND);
		tileTypeEEnum = createEEnum(TILE_TYPE);
		vAlignmentTypeEEnum = createEEnum(VALIGNMENT_TYPE);
		hAlignmentTypeEEnum = createEEnum(HALIGNMENT_TYPE);
		orientationTypeEEnum = createEEnum(ORIENTATION_TYPE);
		allenIntervalTypeEEnum = createEEnum(ALLEN_INTERVAL_TYPE);
		closenessTypeEEnum = createEEnum(CLOSENESS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tileEClass.getESuperTypes().add(this.getNamedElement());
		tileEClass.getESuperTypes().add(this.getAlignedElement());
		simpleTileEClass.getESuperTypes().add(this.getTile());
		overlappingTileEClass.getESuperTypes().add(this.getTile());
		lineTileEClass.getESuperTypes().add(this.getTile());
		holeTileEClass.getESuperTypes().add(this.getTile());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowLayoutRootEClass, LowLayoutRoot.class, "LowLayoutRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLowLayoutRoot_ViewTiles(), this.getTile(), null, "viewTiles", null, 0, -1, LowLayoutRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alignedElementEClass, AlignedElement.class, "AlignedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlignedElement_VerticalAlignment(), this.getVAlignmentType(), "verticalAlignment", null, 1, 1, AlignedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlignedElement_HorizontalAlignment(), this.getHAlignmentType(), "horizontalAlignment", null, 1, 1, AlignedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tileEClass, Tile.class, "Tile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTile_Outgoing(), this.getRelation(), this.getRelation_Source(), "outgoing", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Incoming(), this.getRelation(), this.getRelation_Target(), "incoming", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Up(), this.getTile(), this.getTile_Down(), "up", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Down(), this.getTile(), this.getTile_Up(), "down", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Left(), this.getTile(), this.getTile_Right(), "left", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Right(), this.getTile(), this.getTile_Left(), "right", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Element(), theStructurePackage.getGraphicalElement(), null, "element", null, 1, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_XMinPos(), ecorePackage.getEInt(), "xMinPos", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_XMaxPos(), ecorePackage.getEInt(), "xMaxPos", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_YMinPos(), ecorePackage.getEInt(), "yMinPos", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_YMaxPos(), ecorePackage.getEInt(), "yMaxPos", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_HSize(), ecorePackage.getEFloat(), "hSize", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_VSize(), ecorePackage.getEFloat(), "vSize", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_AssociationKind(), this.getAssociationKind(), "associationKind", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_TileType(), this.getTileType(), "tileType", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Subtiles(), this.getTile(), null, "subtiles", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Relations(), this.getRelation(), null, "relations", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_LeftMargin(), ecorePackage.getEFloat(), "leftMargin", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_RightMargin(), ecorePackage.getEFloat(), "rightMargin", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_TopMargin(), ecorePackage.getEFloat(), "topMargin", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_BottomMargin(), ecorePackage.getEFloat(), "bottomMargin", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTileEClass, SimpleTile.class, "SimpleTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(overlappingTileEClass, OverlappingTile.class, "OverlappingTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineTileEClass, LineTile.class, "LineTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineTile_Orientation(), this.getOrientationType(), "orientation", null, 0, 1, LineTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(holeTileEClass, HoleTile.class, "HoleTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Source(), this.getTile(), this.getTile_Outgoing(), "source", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getTile(), this.getTile_Incoming(), "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_XInterval(), this.getAllenIntervalType(), "xInterval", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_YInterval(), this.getAllenIntervalType(), "yInterval", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Closeness(), this.getClosenessType(), "closeness", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Joined(), ecorePackage.getEBoolean(), "joined", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationKindEEnum, AssociationKind.class, "AssociationKind");
		addEEnumLiteral(associationKindEEnum, AssociationKind.NONE);
		addEEnumLiteral(associationKindEEnum, AssociationKind.MAP);
		addEEnumLiteral(associationKindEEnum, AssociationKind.EXTRA);

		initEEnum(tileTypeEEnum, TileType.class, "TileType");
		addEEnumLiteral(tileTypeEEnum, TileType.COARSE);
		addEEnumLiteral(tileTypeEEnum, TileType.FINE);
		addEEnumLiteral(tileTypeEEnum, TileType.ITEM);

		initEEnum(vAlignmentTypeEEnum, VAlignmentType.class, "VAlignmentType");
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.NONE);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.TOP);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.MIDDLE);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.BOTTOM);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.BOTH);

		initEEnum(hAlignmentTypeEEnum, HAlignmentType.class, "HAlignmentType");
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.NONE);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.LEFT);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.CENTER);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.RIGHT);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.BOTH);

		initEEnum(orientationTypeEEnum, OrientationType.class, "OrientationType");
		addEEnumLiteral(orientationTypeEEnum, OrientationType.HORIZONTAL);
		addEEnumLiteral(orientationTypeEEnum, OrientationType.VERTICAL);

		initEEnum(allenIntervalTypeEEnum, AllenIntervalType.class, "AllenIntervalType");
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.BEFORE);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.AFTER);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.MEETS);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.MET_BY);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.STARTS);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.STARTED_BY);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.FINISHES);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.FINISHED_BY);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.DURING);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.CONTAINS);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.OVERLAPS);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.OVERLAPPED_BY);
		addEEnumLiteral(allenIntervalTypeEEnum, AllenIntervalType.EQUAL);

		initEEnum(closenessTypeEEnum, ClosenessType.class, "ClosenessType");
		addEEnumLiteral(closenessTypeEEnum, ClosenessType.VERY_CLOSE);
		addEEnumLiteral(closenessTypeEEnum, ClosenessType.CLOSE);
		addEEnumLiteral(closenessTypeEEnum, ClosenessType.FAR);
		addEEnumLiteral(closenessTypeEEnum, ClosenessType.VERY_FAR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.modelum.es/guizmo
		createGuizmoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelum.es/guizmo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGuizmoAnnotations() {
		String source = "http://www.modelum.es/guizmo";		
		addAnnotation
		  (getTile_HSize(), 
		   source, 
		   new String[] {
			 "comment", "Represents a percentage of the horizontal space that takes up. Values are normalized between [0,1], so a 0.6 represents a 60%."
		   });		
		addAnnotation
		  (getTile_VSize(), 
		   source, 
		   new String[] {
			 "comment", "Represents a percentage of the vertical space that takes up. Values are normalized between [0,1], so a 0.6 represents a 60%."
		   });
	}

} //TilesPackageImpl
