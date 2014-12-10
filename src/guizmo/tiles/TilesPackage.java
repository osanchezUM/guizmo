/**
 */
package guizmo.tiles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesFactory
 * @model kind="package"
 * @generated
 */
public interface TilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tiles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/guizmo/tiles";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tiles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TilesPackage eINSTANCE = guizmo.tiles.impl.TilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.NamedElementImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.LowLayoutRootImpl <em>Low Layout Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.LowLayoutRootImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getLowLayoutRoot()
	 * @generated
	 */
	int LOW_LAYOUT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>View Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LAYOUT_ROOT__VIEW_TILES = 0;

	/**
	 * The number of structural features of the '<em>Low Layout Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LAYOUT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.AlignedElementImpl <em>Aligned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.AlignedElementImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getAlignedElement()
	 * @generated
	 */
	int ALIGNED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_ELEMENT__VERTICAL_ALIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>Aligned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.TileImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__VERTICAL_ALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__HORIZONTAL_ALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__UP = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__DOWN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LEFT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__RIGHT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__XMIN_POS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__XMAX_POS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__YMIN_POS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__YMAX_POS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__HSIZE = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__VSIZE = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Association Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__ASSOCIATION_KIND = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TILE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Subtiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__SUBTILES = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LEFT_MARGIN = NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__RIGHT_MARGIN = NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TOP_MARGIN = NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__BOTTOM_MARGIN = NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.SimpleTileImpl <em>Simple Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.SimpleTileImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getSimpleTile()
	 * @generated
	 */
	int SIMPLE_TILE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__NAME = TILE__NAME;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__VERTICAL_ALIGNMENT = TILE__VERTICAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__HORIZONTAL_ALIGNMENT = TILE__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__OUTGOING = TILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__INCOMING = TILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__UP = TILE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__DOWN = TILE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__LEFT = TILE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__RIGHT = TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__ELEMENT = TILE__ELEMENT;

	/**
	 * The feature id for the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__XMIN_POS = TILE__XMIN_POS;

	/**
	 * The feature id for the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__XMAX_POS = TILE__XMAX_POS;

	/**
	 * The feature id for the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__YMIN_POS = TILE__YMIN_POS;

	/**
	 * The feature id for the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__YMAX_POS = TILE__YMAX_POS;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__HSIZE = TILE__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__VSIZE = TILE__VSIZE;

	/**
	 * The feature id for the '<em><b>Association Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__ASSOCIATION_KIND = TILE__ASSOCIATION_KIND;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__TILE_TYPE = TILE__TILE_TYPE;

	/**
	 * The feature id for the '<em><b>Subtiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__SUBTILES = TILE__SUBTILES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__RELATIONS = TILE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__LEFT_MARGIN = TILE__LEFT_MARGIN;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__RIGHT_MARGIN = TILE__RIGHT_MARGIN;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__TOP_MARGIN = TILE__TOP_MARGIN;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE__BOTTOM_MARGIN = TILE__BOTTOM_MARGIN;

	/**
	 * The number of structural features of the '<em>Simple Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TILE_FEATURE_COUNT = TILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.OverlappingTileImpl <em>Overlapping Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.OverlappingTileImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getOverlappingTile()
	 * @generated
	 */
	int OVERLAPPING_TILE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__NAME = TILE__NAME;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__VERTICAL_ALIGNMENT = TILE__VERTICAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__HORIZONTAL_ALIGNMENT = TILE__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__OUTGOING = TILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__INCOMING = TILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__UP = TILE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__DOWN = TILE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__LEFT = TILE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__RIGHT = TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__ELEMENT = TILE__ELEMENT;

	/**
	 * The feature id for the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__XMIN_POS = TILE__XMIN_POS;

	/**
	 * The feature id for the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__XMAX_POS = TILE__XMAX_POS;

	/**
	 * The feature id for the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__YMIN_POS = TILE__YMIN_POS;

	/**
	 * The feature id for the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__YMAX_POS = TILE__YMAX_POS;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__HSIZE = TILE__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__VSIZE = TILE__VSIZE;

	/**
	 * The feature id for the '<em><b>Association Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__ASSOCIATION_KIND = TILE__ASSOCIATION_KIND;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__TILE_TYPE = TILE__TILE_TYPE;

	/**
	 * The feature id for the '<em><b>Subtiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__SUBTILES = TILE__SUBTILES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__RELATIONS = TILE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__LEFT_MARGIN = TILE__LEFT_MARGIN;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__RIGHT_MARGIN = TILE__RIGHT_MARGIN;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__TOP_MARGIN = TILE__TOP_MARGIN;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE__BOTTOM_MARGIN = TILE__BOTTOM_MARGIN;

	/**
	 * The number of structural features of the '<em>Overlapping Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAPPING_TILE_FEATURE_COUNT = TILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.LineTileImpl <em>Line Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.LineTileImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getLineTile()
	 * @generated
	 */
	int LINE_TILE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__NAME = TILE__NAME;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__VERTICAL_ALIGNMENT = TILE__VERTICAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__HORIZONTAL_ALIGNMENT = TILE__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__OUTGOING = TILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__INCOMING = TILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__UP = TILE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__DOWN = TILE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__LEFT = TILE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__RIGHT = TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__ELEMENT = TILE__ELEMENT;

	/**
	 * The feature id for the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__XMIN_POS = TILE__XMIN_POS;

	/**
	 * The feature id for the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__XMAX_POS = TILE__XMAX_POS;

	/**
	 * The feature id for the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__YMIN_POS = TILE__YMIN_POS;

	/**
	 * The feature id for the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__YMAX_POS = TILE__YMAX_POS;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__HSIZE = TILE__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__VSIZE = TILE__VSIZE;

	/**
	 * The feature id for the '<em><b>Association Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__ASSOCIATION_KIND = TILE__ASSOCIATION_KIND;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__TILE_TYPE = TILE__TILE_TYPE;

	/**
	 * The feature id for the '<em><b>Subtiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__SUBTILES = TILE__SUBTILES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__RELATIONS = TILE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__LEFT_MARGIN = TILE__LEFT_MARGIN;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__RIGHT_MARGIN = TILE__RIGHT_MARGIN;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__TOP_MARGIN = TILE__TOP_MARGIN;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__BOTTOM_MARGIN = TILE__BOTTOM_MARGIN;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE__ORIENTATION = TILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TILE_FEATURE_COUNT = TILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.HoleTileImpl <em>Hole Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.HoleTileImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getHoleTile()
	 * @generated
	 */
	int HOLE_TILE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__NAME = TILE__NAME;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__VERTICAL_ALIGNMENT = TILE__VERTICAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__HORIZONTAL_ALIGNMENT = TILE__HORIZONTAL_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__OUTGOING = TILE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__INCOMING = TILE__INCOMING;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__UP = TILE__UP;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__DOWN = TILE__DOWN;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__LEFT = TILE__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__RIGHT = TILE__RIGHT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__ELEMENT = TILE__ELEMENT;

	/**
	 * The feature id for the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__XMIN_POS = TILE__XMIN_POS;

	/**
	 * The feature id for the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__XMAX_POS = TILE__XMAX_POS;

	/**
	 * The feature id for the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__YMIN_POS = TILE__YMIN_POS;

	/**
	 * The feature id for the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__YMAX_POS = TILE__YMAX_POS;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__HSIZE = TILE__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__VSIZE = TILE__VSIZE;

	/**
	 * The feature id for the '<em><b>Association Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__ASSOCIATION_KIND = TILE__ASSOCIATION_KIND;

	/**
	 * The feature id for the '<em><b>Tile Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__TILE_TYPE = TILE__TILE_TYPE;

	/**
	 * The feature id for the '<em><b>Subtiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__SUBTILES = TILE__SUBTILES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__RELATIONS = TILE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__LEFT_MARGIN = TILE__LEFT_MARGIN;

	/**
	 * The feature id for the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__RIGHT_MARGIN = TILE__RIGHT_MARGIN;

	/**
	 * The feature id for the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__TOP_MARGIN = TILE__TOP_MARGIN;

	/**
	 * The feature id for the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE__BOTTOM_MARGIN = TILE__BOTTOM_MARGIN;

	/**
	 * The number of structural features of the '<em>Hole Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_TILE_FEATURE_COUNT = TILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.tiles.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.impl.RelationImpl
	 * @see guizmo.tiles.impl.TilesPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>XInterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__XINTERVAL = 3;

	/**
	 * The feature id for the '<em><b>YInterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__YINTERVAL = 4;

	/**
	 * The feature id for the '<em><b>Closeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CLOSENESS = 5;

	/**
	 * The feature id for the '<em><b>Joined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__JOINED = 6;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link guizmo.tiles.AssociationKind <em>Association Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.AssociationKind
	 * @see guizmo.tiles.impl.TilesPackageImpl#getAssociationKind()
	 * @generated
	 */
	int ASSOCIATION_KIND = 9;

	/**
	 * The meta object id for the '{@link guizmo.tiles.TileType <em>Tile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.TileType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getTileType()
	 * @generated
	 */
	int TILE_TYPE = 10;

	/**
	 * The meta object id for the '{@link guizmo.tiles.VAlignmentType <em>VAlignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.VAlignmentType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getVAlignmentType()
	 * @generated
	 */
	int VALIGNMENT_TYPE = 11;

	/**
	 * The meta object id for the '{@link guizmo.tiles.HAlignmentType <em>HAlignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.HAlignmentType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getHAlignmentType()
	 * @generated
	 */
	int HALIGNMENT_TYPE = 12;

	/**
	 * The meta object id for the '{@link guizmo.tiles.OrientationType <em>Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.OrientationType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 13;

	/**
	 * The meta object id for the '{@link guizmo.tiles.AllenIntervalType <em>Allen Interval Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.AllenIntervalType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getAllenIntervalType()
	 * @generated
	 */
	int ALLEN_INTERVAL_TYPE = 14;

	/**
	 * The meta object id for the '{@link guizmo.tiles.ClosenessType <em>Closeness Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.tiles.ClosenessType
	 * @see guizmo.tiles.impl.TilesPackageImpl#getClosenessType()
	 * @generated
	 */
	int CLOSENESS_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link guizmo.tiles.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see guizmo.tiles.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.tiles.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.LowLayoutRoot <em>Low Layout Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Layout Root</em>'.
	 * @see guizmo.tiles.LowLayoutRoot
	 * @generated
	 */
	EClass getLowLayoutRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.tiles.LowLayoutRoot#getViewTiles <em>View Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Tiles</em>'.
	 * @see guizmo.tiles.LowLayoutRoot#getViewTiles()
	 * @see #getLowLayoutRoot()
	 * @generated
	 */
	EReference getLowLayoutRoot_ViewTiles();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.AlignedElement <em>Aligned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aligned Element</em>'.
	 * @see guizmo.tiles.AlignedElement
	 * @generated
	 */
	EClass getAlignedElement();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.AlignedElement#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see guizmo.tiles.AlignedElement#getVerticalAlignment()
	 * @see #getAlignedElement()
	 * @generated
	 */
	EAttribute getAlignedElement_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.AlignedElement#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see guizmo.tiles.AlignedElement#getHorizontalAlignment()
	 * @see #getAlignedElement()
	 * @generated
	 */
	EAttribute getAlignedElement_HorizontalAlignment();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see guizmo.tiles.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see guizmo.tiles.Tile#getOutgoing()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see guizmo.tiles.Tile#getIncoming()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Up</em>'.
	 * @see guizmo.tiles.Tile#getUp()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Up();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Down</em>'.
	 * @see guizmo.tiles.Tile#getDown()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Down();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left</em>'.
	 * @see guizmo.tiles.Tile#getLeft()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Left();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.tiles.Tile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right</em>'.
	 * @see guizmo.tiles.Tile#getRight()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Right();

	/**
	 * Returns the meta object for the reference '{@link guizmo.tiles.Tile#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see guizmo.tiles.Tile#getElement()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Element();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getXMinPos <em>XMin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin Pos</em>'.
	 * @see guizmo.tiles.Tile#getXMinPos()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_XMinPos();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getXMaxPos <em>XMax Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax Pos</em>'.
	 * @see guizmo.tiles.Tile#getXMaxPos()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_XMaxPos();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getYMinPos <em>YMin Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin Pos</em>'.
	 * @see guizmo.tiles.Tile#getYMinPos()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_YMinPos();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getYMaxPos <em>YMax Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax Pos</em>'.
	 * @see guizmo.tiles.Tile#getYMaxPos()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_YMaxPos();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getHSize <em>HSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HSize</em>'.
	 * @see guizmo.tiles.Tile#getHSize()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_HSize();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getVSize <em>VSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VSize</em>'.
	 * @see guizmo.tiles.Tile#getVSize()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_VSize();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getAssociationKind <em>Association Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Kind</em>'.
	 * @see guizmo.tiles.Tile#getAssociationKind()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_AssociationKind();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getTileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Type</em>'.
	 * @see guizmo.tiles.Tile#getTileType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_TileType();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.tiles.Tile#getSubtiles <em>Subtiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtiles</em>'.
	 * @see guizmo.tiles.Tile#getSubtiles()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Subtiles();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.tiles.Tile#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see guizmo.tiles.Tile#getRelations()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Relations();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getLeftMargin <em>Left Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Margin</em>'.
	 * @see guizmo.tiles.Tile#getLeftMargin()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_LeftMargin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getRightMargin <em>Right Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Margin</em>'.
	 * @see guizmo.tiles.Tile#getRightMargin()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_RightMargin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getTopMargin <em>Top Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Margin</em>'.
	 * @see guizmo.tiles.Tile#getTopMargin()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_TopMargin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Tile#getBottomMargin <em>Bottom Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Margin</em>'.
	 * @see guizmo.tiles.Tile#getBottomMargin()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_BottomMargin();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.SimpleTile <em>Simple Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Tile</em>'.
	 * @see guizmo.tiles.SimpleTile
	 * @generated
	 */
	EClass getSimpleTile();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.OverlappingTile <em>Overlapping Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlapping Tile</em>'.
	 * @see guizmo.tiles.OverlappingTile
	 * @generated
	 */
	EClass getOverlappingTile();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.LineTile <em>Line Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Tile</em>'.
	 * @see guizmo.tiles.LineTile
	 * @generated
	 */
	EClass getLineTile();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.LineTile#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see guizmo.tiles.LineTile#getOrientation()
	 * @see #getLineTile()
	 * @generated
	 */
	EAttribute getLineTile_Orientation();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.HoleTile <em>Hole Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hole Tile</em>'.
	 * @see guizmo.tiles.HoleTile
	 * @generated
	 */
	EClass getHoleTile();

	/**
	 * Returns the meta object for class '{@link guizmo.tiles.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see guizmo.tiles.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.tiles.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link guizmo.tiles.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see guizmo.tiles.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link guizmo.tiles.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see guizmo.tiles.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Relation#getXInterval <em>XInterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XInterval</em>'.
	 * @see guizmo.tiles.Relation#getXInterval()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_XInterval();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Relation#getYInterval <em>YInterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YInterval</em>'.
	 * @see guizmo.tiles.Relation#getYInterval()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_YInterval();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Relation#getCloseness <em>Closeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closeness</em>'.
	 * @see guizmo.tiles.Relation#getCloseness()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Closeness();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.tiles.Relation#isJoined <em>Joined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joined</em>'.
	 * @see guizmo.tiles.Relation#isJoined()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Joined();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.AssociationKind <em>Association Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Kind</em>'.
	 * @see guizmo.tiles.AssociationKind
	 * @generated
	 */
	EEnum getAssociationKind();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.TileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tile Type</em>'.
	 * @see guizmo.tiles.TileType
	 * @generated
	 */
	EEnum getTileType();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.VAlignmentType <em>VAlignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VAlignment Type</em>'.
	 * @see guizmo.tiles.VAlignmentType
	 * @generated
	 */
	EEnum getVAlignmentType();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.HAlignmentType <em>HAlignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HAlignment Type</em>'.
	 * @see guizmo.tiles.HAlignmentType
	 * @generated
	 */
	EEnum getHAlignmentType();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Type</em>'.
	 * @see guizmo.tiles.OrientationType
	 * @generated
	 */
	EEnum getOrientationType();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.AllenIntervalType <em>Allen Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allen Interval Type</em>'.
	 * @see guizmo.tiles.AllenIntervalType
	 * @generated
	 */
	EEnum getAllenIntervalType();

	/**
	 * Returns the meta object for enum '{@link guizmo.tiles.ClosenessType <em>Closeness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Closeness Type</em>'.
	 * @see guizmo.tiles.ClosenessType
	 * @generated
	 */
	EEnum getClosenessType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TilesFactory getTilesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.NamedElementImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.LowLayoutRootImpl <em>Low Layout Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.LowLayoutRootImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getLowLayoutRoot()
		 * @generated
		 */
		EClass LOW_LAYOUT_ROOT = eINSTANCE.getLowLayoutRoot();

		/**
		 * The meta object literal for the '<em><b>View Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOW_LAYOUT_ROOT__VIEW_TILES = eINSTANCE.getLowLayoutRoot_ViewTiles();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.AlignedElementImpl <em>Aligned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.AlignedElementImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getAlignedElement()
		 * @generated
		 */
		EClass ALIGNED_ELEMENT = eINSTANCE.getAlignedElement();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNED_ELEMENT__VERTICAL_ALIGNMENT = eINSTANCE.getAlignedElement_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT = eINSTANCE.getAlignedElement_HorizontalAlignment();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.TileImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__OUTGOING = eINSTANCE.getTile_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__INCOMING = eINSTANCE.getTile_Incoming();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__UP = eINSTANCE.getTile_Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__DOWN = eINSTANCE.getTile_Down();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__LEFT = eINSTANCE.getTile_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__RIGHT = eINSTANCE.getTile_Right();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__ELEMENT = eINSTANCE.getTile_Element();

		/**
		 * The meta object literal for the '<em><b>XMin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__XMIN_POS = eINSTANCE.getTile_XMinPos();

		/**
		 * The meta object literal for the '<em><b>XMax Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__XMAX_POS = eINSTANCE.getTile_XMaxPos();

		/**
		 * The meta object literal for the '<em><b>YMin Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__YMIN_POS = eINSTANCE.getTile_YMinPos();

		/**
		 * The meta object literal for the '<em><b>YMax Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__YMAX_POS = eINSTANCE.getTile_YMaxPos();

		/**
		 * The meta object literal for the '<em><b>HSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__HSIZE = eINSTANCE.getTile_HSize();

		/**
		 * The meta object literal for the '<em><b>VSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__VSIZE = eINSTANCE.getTile_VSize();

		/**
		 * The meta object literal for the '<em><b>Association Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__ASSOCIATION_KIND = eINSTANCE.getTile_AssociationKind();

		/**
		 * The meta object literal for the '<em><b>Tile Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TILE_TYPE = eINSTANCE.getTile_TileType();

		/**
		 * The meta object literal for the '<em><b>Subtiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__SUBTILES = eINSTANCE.getTile_Subtiles();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__RELATIONS = eINSTANCE.getTile_Relations();

		/**
		 * The meta object literal for the '<em><b>Left Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__LEFT_MARGIN = eINSTANCE.getTile_LeftMargin();

		/**
		 * The meta object literal for the '<em><b>Right Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__RIGHT_MARGIN = eINSTANCE.getTile_RightMargin();

		/**
		 * The meta object literal for the '<em><b>Top Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TOP_MARGIN = eINSTANCE.getTile_TopMargin();

		/**
		 * The meta object literal for the '<em><b>Bottom Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__BOTTOM_MARGIN = eINSTANCE.getTile_BottomMargin();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.SimpleTileImpl <em>Simple Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.SimpleTileImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getSimpleTile()
		 * @generated
		 */
		EClass SIMPLE_TILE = eINSTANCE.getSimpleTile();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.OverlappingTileImpl <em>Overlapping Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.OverlappingTileImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getOverlappingTile()
		 * @generated
		 */
		EClass OVERLAPPING_TILE = eINSTANCE.getOverlappingTile();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.LineTileImpl <em>Line Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.LineTileImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getLineTile()
		 * @generated
		 */
		EClass LINE_TILE = eINSTANCE.getLineTile();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TILE__ORIENTATION = eINSTANCE.getLineTile_Orientation();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.HoleTileImpl <em>Hole Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.HoleTileImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getHoleTile()
		 * @generated
		 */
		EClass HOLE_TILE = eINSTANCE.getHoleTile();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.impl.RelationImpl
		 * @see guizmo.tiles.impl.TilesPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>XInterval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__XINTERVAL = eINSTANCE.getRelation_XInterval();

		/**
		 * The meta object literal for the '<em><b>YInterval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__YINTERVAL = eINSTANCE.getRelation_YInterval();

		/**
		 * The meta object literal for the '<em><b>Closeness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CLOSENESS = eINSTANCE.getRelation_Closeness();

		/**
		 * The meta object literal for the '<em><b>Joined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__JOINED = eINSTANCE.getRelation_Joined();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.AssociationKind <em>Association Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.AssociationKind
		 * @see guizmo.tiles.impl.TilesPackageImpl#getAssociationKind()
		 * @generated
		 */
		EEnum ASSOCIATION_KIND = eINSTANCE.getAssociationKind();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.TileType <em>Tile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.TileType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getTileType()
		 * @generated
		 */
		EEnum TILE_TYPE = eINSTANCE.getTileType();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.VAlignmentType <em>VAlignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.VAlignmentType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getVAlignmentType()
		 * @generated
		 */
		EEnum VALIGNMENT_TYPE = eINSTANCE.getVAlignmentType();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.HAlignmentType <em>HAlignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.HAlignmentType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getHAlignmentType()
		 * @generated
		 */
		EEnum HALIGNMENT_TYPE = eINSTANCE.getHAlignmentType();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.OrientationType <em>Orientation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.OrientationType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getOrientationType()
		 * @generated
		 */
		EEnum ORIENTATION_TYPE = eINSTANCE.getOrientationType();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.AllenIntervalType <em>Allen Interval Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.AllenIntervalType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getAllenIntervalType()
		 * @generated
		 */
		EEnum ALLEN_INTERVAL_TYPE = eINSTANCE.getAllenIntervalType();

		/**
		 * The meta object literal for the '{@link guizmo.tiles.ClosenessType <em>Closeness Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.tiles.ClosenessType
		 * @see guizmo.tiles.impl.TilesPackageImpl#getClosenessType()
		 * @generated
		 */
		EEnum CLOSENESS_TYPE = eINSTANCE.getClosenessType();

	}

} //TilesPackage
