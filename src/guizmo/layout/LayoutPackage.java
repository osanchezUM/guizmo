/**
 */
package guizmo.layout;

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
 * @see guizmo.layout.LayoutFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "layout";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/guizmo/layout";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lyt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutPackage eINSTANCE = guizmo.layout.impl.LayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.LayoutRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.LayoutRootImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getLayoutRoot()
	 * @generated
	 */
	int LAYOUT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>View Trees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ROOT__VIEW_TREES = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.NamedElementImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

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
	 * The meta object id for the '{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl <em>Info Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.LayoutInfoTreeNodeImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getLayoutInfoTreeNode()
	 * @generated
	 */
	int LAYOUT_INFO_TREE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Gui Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__GUI_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__CHILDREN_NODES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__PARENT_NODE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referred By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE__REFERRED_BY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Info Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFO_TREE_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.LayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SUBLAYOUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PARENT_LAYOUT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__REF_NODE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ABS_HALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ABS_VALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CONTENT_HALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CONTENT_VALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PARENT_HALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PARENT_VALIGNMENT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HSIZE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VSIZE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__FITNESS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__GAPS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__REF_GAPS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MARGINS = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LBORDER = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__RBORDER = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.FlowLayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getFlowLayout()
	 * @generated
	 */
	int FLOW_LAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__RBORDER = LAYOUT__RBORDER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__TYPE = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.BorderLayoutImpl <em>Border Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.BorderLayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getBorderLayout()
	 * @generated
	 */
	int BORDER_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__RBORDER = LAYOUT__RBORDER;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__TOP = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__LEFT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__CENTER = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__RIGHT = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__BOTTOM = LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Border Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.GridLayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getGridLayout()
	 * @generated
	 */
	int GRID_LAYOUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__RBORDER = LAYOUT__RBORDER;

	/**
	 * The feature id for the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NUM_COLS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.FormLayoutImpl <em>Form Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.FormLayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getFormLayout()
	 * @generated
	 */
	int FORM_LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__RBORDER = LAYOUT__RBORDER;

	/**
	 * The feature id for the '<em><b>Marks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__MARKS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__COLUMNS = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num Nodes Longest Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT__NUM_NODES_LONGEST_LINE = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Form Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.AlignedColumnImpl <em>Aligned Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.AlignedColumnImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getAlignedColumn()
	 * @generated
	 */
	int ALIGNED_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Lgap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN__LGAP = 0;

	/**
	 * The feature id for the '<em><b>Rgap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN__RGAP = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN__NODES = 2;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN__LEFT_NODES = 3;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN__RIGHT_NODES = 4;

	/**
	 * The number of structural features of the '<em>Aligned Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.AlignmentMarkImpl <em>Alignment Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.AlignmentMarkImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getAlignmentMark()
	 * @generated
	 */
	int ALIGNMENT_MARK = 9;

	/**
	 * The feature id for the '<em><b>Lgap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_MARK__LGAP = 0;

	/**
	 * The feature id for the '<em><b>Lnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_MARK__LNODES = 1;

	/**
	 * The feature id for the '<em><b>Rnodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_MARK__RNODES = 2;

	/**
	 * The number of structural features of the '<em>Alignment Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_MARK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.CustomLayoutImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getCustomLayout()
	 * @generated
	 */
	int CUSTOM_LAYOUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__RBORDER = LAYOUT__RBORDER;

	/**
	 * The number of structural features of the '<em>Custom Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.ElementNodeImpl <em>Element Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.ElementNodeImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getElementNode()
	 * @generated
	 */
	int ELEMENT_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__NAME = LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Sublayouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__SUBLAYOUTS = LAYOUT__SUBLAYOUTS;

	/**
	 * The feature id for the '<em><b>Parent Layout</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__PARENT_LAYOUT = LAYOUT__PARENT_LAYOUT;

	/**
	 * The feature id for the '<em><b>Ref Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__REF_NODE = LAYOUT__REF_NODE;

	/**
	 * The feature id for the '<em><b>Abs HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__ABS_HALIGNMENT = LAYOUT__ABS_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Abs VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__ABS_VALIGNMENT = LAYOUT__ABS_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__CONTENT_HALIGNMENT = LAYOUT__CONTENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Content VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__CONTENT_VALIGNMENT = LAYOUT__CONTENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent HAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__PARENT_HALIGNMENT = LAYOUT__PARENT_HALIGNMENT;

	/**
	 * The feature id for the '<em><b>Parent VAlignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__PARENT_VALIGNMENT = LAYOUT__PARENT_VALIGNMENT;

	/**
	 * The feature id for the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__HSIZE = LAYOUT__HSIZE;

	/**
	 * The feature id for the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__VSIZE = LAYOUT__VSIZE;

	/**
	 * The feature id for the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__FITNESS = LAYOUT__FITNESS;

	/**
	 * The feature id for the '<em><b>Gaps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__GAPS = LAYOUT__GAPS;

	/**
	 * The feature id for the '<em><b>Ref Gaps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__REF_GAPS = LAYOUT__REF_GAPS;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__MARGINS = LAYOUT__MARGINS;

	/**
	 * The feature id for the '<em><b>Lborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__LBORDER = LAYOUT__LBORDER;

	/**
	 * The feature id for the '<em><b>Rborder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE__RBORDER = LAYOUT__RBORDER;

	/**
	 * The number of structural features of the '<em>Element Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NODE_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.SeparationImpl <em>Separation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.SeparationImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getSeparation()
	 * @generated
	 */
	int SEPARATION = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Separation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.GapImpl <em>Gap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.GapImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getGap()
	 * @generated
	 */
	int GAP = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__VALUE = SEPARATION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__TYPE = SEPARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__LAYOUTS = SEPARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_FEATURE_COUNT = SEPARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.layout.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.impl.MarginImpl
	 * @see guizmo.layout.impl.LayoutPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__VALUE = SEPARATION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__TYPE = SEPARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = SEPARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.layout.FlowLayoutType <em>Flow Layout Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.FlowLayoutType
	 * @see guizmo.layout.impl.LayoutPackageImpl#getFlowLayoutType()
	 * @generated
	 */
	int FLOW_LAYOUT_TYPE = 15;

	/**
	 * The meta object id for the '{@link guizmo.layout.GapType <em>Gap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.GapType
	 * @see guizmo.layout.impl.LayoutPackageImpl#getGapType()
	 * @generated
	 */
	int GAP_TYPE = 16;

	/**
	 * The meta object id for the '{@link guizmo.layout.MarginType <em>Margin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.MarginType
	 * @see guizmo.layout.impl.LayoutPackageImpl#getMarginType()
	 * @generated
	 */
	int MARGIN_TYPE = 17;

	/**
	 * The meta object id for the '{@link guizmo.layout.HAlignmentType <em>HAlignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.HAlignmentType
	 * @see guizmo.layout.impl.LayoutPackageImpl#getHAlignmentType()
	 * @generated
	 */
	int HALIGNMENT_TYPE = 18;

	/**
	 * The meta object id for the '{@link guizmo.layout.VAlignmentType <em>VAlignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.layout.VAlignmentType
	 * @see guizmo.layout.impl.LayoutPackageImpl#getVAlignmentType()
	 * @generated
	 */
	int VALIGNMENT_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link guizmo.layout.LayoutRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see guizmo.layout.LayoutRoot
	 * @generated
	 */
	EClass getLayoutRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.LayoutRoot#getViewTrees <em>View Trees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Trees</em>'.
	 * @see guizmo.layout.LayoutRoot#getViewTrees()
	 * @see #getLayoutRoot()
	 * @generated
	 */
	EReference getLayoutRoot_ViewTrees();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see guizmo.layout.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.layout.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.LayoutInfoTreeNode <em>Info Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Tree Node</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode
	 * @generated
	 */
	EClass getLayoutInfoTreeNode();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.LayoutInfoTreeNode#getGuiElement <em>Gui Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gui Element</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode#getGuiElement()
	 * @see #getLayoutInfoTreeNode()
	 * @generated
	 */
	EReference getLayoutInfoTreeNode_GuiElement();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.LayoutInfoTreeNode#getLayoutAlternatives <em>Layout Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layout Alternatives</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode#getLayoutAlternatives()
	 * @see #getLayoutInfoTreeNode()
	 * @generated
	 */
	EReference getLayoutInfoTreeNode_LayoutAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.LayoutInfoTreeNode#getChildrenNodes <em>Children Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Nodes</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode#getChildrenNodes()
	 * @see #getLayoutInfoTreeNode()
	 * @generated
	 */
	EReference getLayoutInfoTreeNode_ChildrenNodes();

	/**
	 * Returns the meta object for the container reference '{@link guizmo.layout.LayoutInfoTreeNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode#getParentNode()
	 * @see #getLayoutInfoTreeNode()
	 * @generated
	 */
	EReference getLayoutInfoTreeNode_ParentNode();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.LayoutInfoTreeNode#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referred By</em>'.
	 * @see guizmo.layout.LayoutInfoTreeNode#getReferredBy()
	 * @see #getLayoutInfoTreeNode()
	 * @generated
	 */
	EReference getLayoutInfoTreeNode_ReferredBy();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see guizmo.layout.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.Layout#getSublayouts <em>Sublayouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sublayouts</em>'.
	 * @see guizmo.layout.Layout#getSublayouts()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Sublayouts();

	/**
	 * Returns the meta object for the container reference '{@link guizmo.layout.Layout#getParentLayout <em>Parent Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Layout</em>'.
	 * @see guizmo.layout.Layout#getParentLayout()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ParentLayout();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.Layout#getRefNode <em>Ref Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Node</em>'.
	 * @see guizmo.layout.Layout#getRefNode()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_RefNode();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getAbsHAlignment <em>Abs HAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs HAlignment</em>'.
	 * @see guizmo.layout.Layout#getAbsHAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_AbsHAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getAbsVAlignment <em>Abs VAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abs VAlignment</em>'.
	 * @see guizmo.layout.Layout#getAbsVAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_AbsVAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getContentHAlignment <em>Content HAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content HAlignment</em>'.
	 * @see guizmo.layout.Layout#getContentHAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_ContentHAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getContentVAlignment <em>Content VAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content VAlignment</em>'.
	 * @see guizmo.layout.Layout#getContentVAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_ContentVAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getParentHAlignment <em>Parent HAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent HAlignment</em>'.
	 * @see guizmo.layout.Layout#getParentHAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_ParentHAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getParentVAlignment <em>Parent VAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent VAlignment</em>'.
	 * @see guizmo.layout.Layout#getParentVAlignment()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_ParentVAlignment();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getHSize <em>HSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HSize</em>'.
	 * @see guizmo.layout.Layout#getHSize()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_HSize();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getVSize <em>VSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VSize</em>'.
	 * @see guizmo.layout.Layout#getVSize()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_VSize();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Layout#getFitness <em>Fitness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fitness</em>'.
	 * @see guizmo.layout.Layout#getFitness()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Fitness();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.Layout#getGaps <em>Gaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gaps</em>'.
	 * @see guizmo.layout.Layout#getGaps()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Gaps();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.Layout#getRefGaps <em>Ref Gaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Gaps</em>'.
	 * @see guizmo.layout.Layout#getRefGaps()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_RefGaps();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.Layout#getMargins <em>Margins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Margins</em>'.
	 * @see guizmo.layout.Layout#getMargins()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Margins();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.Layout#getLborder <em>Lborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lborder</em>'.
	 * @see guizmo.layout.Layout#getLborder()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Lborder();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.Layout#getRborder <em>Rborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rborder</em>'.
	 * @see guizmo.layout.Layout#getRborder()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Rborder();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Layout</em>'.
	 * @see guizmo.layout.FlowLayout
	 * @generated
	 */
	EClass getFlowLayout();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.FlowLayout#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see guizmo.layout.FlowLayout#getType()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_Type();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.BorderLayout <em>Border Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout</em>'.
	 * @see guizmo.layout.BorderLayout
	 * @generated
	 */
	EClass getBorderLayout();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.BorderLayout#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see guizmo.layout.BorderLayout#getTop()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Top();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.BorderLayout#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see guizmo.layout.BorderLayout#getLeft()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Left();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.BorderLayout#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Center</em>'.
	 * @see guizmo.layout.BorderLayout#getCenter()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Center();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.BorderLayout#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see guizmo.layout.BorderLayout#getRight()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Right();

	/**
	 * Returns the meta object for the reference '{@link guizmo.layout.BorderLayout#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see guizmo.layout.BorderLayout#getBottom()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Bottom();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout</em>'.
	 * @see guizmo.layout.GridLayout
	 * @generated
	 */
	EClass getGridLayout();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.GridLayout#getNumCols <em>Num Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cols</em>'.
	 * @see guizmo.layout.GridLayout#getNumCols()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_NumCols();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Layout</em>'.
	 * @see guizmo.layout.FormLayout
	 * @generated
	 */
	EClass getFormLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.FormLayout#getMarks <em>Marks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marks</em>'.
	 * @see guizmo.layout.FormLayout#getMarks()
	 * @see #getFormLayout()
	 * @generated
	 */
	EReference getFormLayout_Marks();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.layout.FormLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see guizmo.layout.FormLayout#getColumns()
	 * @see #getFormLayout()
	 * @generated
	 */
	EReference getFormLayout_Columns();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.FormLayout#getNumNodesLongestLine <em>Num Nodes Longest Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Nodes Longest Line</em>'.
	 * @see guizmo.layout.FormLayout#getNumNodesLongestLine()
	 * @see #getFormLayout()
	 * @generated
	 */
	EAttribute getFormLayout_NumNodesLongestLine();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.AlignedColumn <em>Aligned Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aligned Column</em>'.
	 * @see guizmo.layout.AlignedColumn
	 * @generated
	 */
	EClass getAlignedColumn();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.AlignedColumn#getLgap <em>Lgap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lgap</em>'.
	 * @see guizmo.layout.AlignedColumn#getLgap()
	 * @see #getAlignedColumn()
	 * @generated
	 */
	EAttribute getAlignedColumn_Lgap();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.AlignedColumn#getRgap <em>Rgap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rgap</em>'.
	 * @see guizmo.layout.AlignedColumn#getRgap()
	 * @see #getAlignedColumn()
	 * @generated
	 */
	EAttribute getAlignedColumn_Rgap();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.AlignedColumn#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see guizmo.layout.AlignedColumn#getNodes()
	 * @see #getAlignedColumn()
	 * @generated
	 */
	EReference getAlignedColumn_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.AlignedColumn#getLeftNodes <em>Left Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Nodes</em>'.
	 * @see guizmo.layout.AlignedColumn#getLeftNodes()
	 * @see #getAlignedColumn()
	 * @generated
	 */
	EReference getAlignedColumn_LeftNodes();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.AlignedColumn#getRightNodes <em>Right Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Nodes</em>'.
	 * @see guizmo.layout.AlignedColumn#getRightNodes()
	 * @see #getAlignedColumn()
	 * @generated
	 */
	EReference getAlignedColumn_RightNodes();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.AlignmentMark <em>Alignment Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alignment Mark</em>'.
	 * @see guizmo.layout.AlignmentMark
	 * @generated
	 */
	EClass getAlignmentMark();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.AlignmentMark#getLgap <em>Lgap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lgap</em>'.
	 * @see guizmo.layout.AlignmentMark#getLgap()
	 * @see #getAlignmentMark()
	 * @generated
	 */
	EAttribute getAlignmentMark_Lgap();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.AlignmentMark#getLnodes <em>Lnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lnodes</em>'.
	 * @see guizmo.layout.AlignmentMark#getLnodes()
	 * @see #getAlignmentMark()
	 * @generated
	 */
	EReference getAlignmentMark_Lnodes();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.AlignmentMark#getRnodes <em>Rnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rnodes</em>'.
	 * @see guizmo.layout.AlignmentMark#getRnodes()
	 * @see #getAlignmentMark()
	 * @generated
	 */
	EReference getAlignmentMark_Rnodes();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.CustomLayout <em>Custom Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layout</em>'.
	 * @see guizmo.layout.CustomLayout
	 * @generated
	 */
	EClass getCustomLayout();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.ElementNode <em>Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Node</em>'.
	 * @see guizmo.layout.ElementNode
	 * @generated
	 */
	EClass getElementNode();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.Separation <em>Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separation</em>'.
	 * @see guizmo.layout.Separation
	 * @generated
	 */
	EClass getSeparation();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Separation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see guizmo.layout.Separation#getValue()
	 * @see #getSeparation()
	 * @generated
	 */
	EAttribute getSeparation_Value();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap</em>'.
	 * @see guizmo.layout.Gap
	 * @generated
	 */
	EClass getGap();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Gap#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see guizmo.layout.Gap#getType()
	 * @see #getGap()
	 * @generated
	 */
	EAttribute getGap_Type();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.layout.Gap#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Layouts</em>'.
	 * @see guizmo.layout.Gap#getLayouts()
	 * @see #getGap()
	 * @generated
	 */
	EReference getGap_Layouts();

	/**
	 * Returns the meta object for class '{@link guizmo.layout.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see guizmo.layout.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.layout.Margin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see guizmo.layout.Margin#getType()
	 * @see #getMargin()
	 * @generated
	 */
	EAttribute getMargin_Type();

	/**
	 * Returns the meta object for enum '{@link guizmo.layout.FlowLayoutType <em>Flow Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Layout Type</em>'.
	 * @see guizmo.layout.FlowLayoutType
	 * @generated
	 */
	EEnum getFlowLayoutType();

	/**
	 * Returns the meta object for enum '{@link guizmo.layout.GapType <em>Gap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gap Type</em>'.
	 * @see guizmo.layout.GapType
	 * @generated
	 */
	EEnum getGapType();

	/**
	 * Returns the meta object for enum '{@link guizmo.layout.MarginType <em>Margin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Margin Type</em>'.
	 * @see guizmo.layout.MarginType
	 * @generated
	 */
	EEnum getMarginType();

	/**
	 * Returns the meta object for enum '{@link guizmo.layout.HAlignmentType <em>HAlignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HAlignment Type</em>'.
	 * @see guizmo.layout.HAlignmentType
	 * @generated
	 */
	EEnum getHAlignmentType();

	/**
	 * Returns the meta object for enum '{@link guizmo.layout.VAlignmentType <em>VAlignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>VAlignment Type</em>'.
	 * @see guizmo.layout.VAlignmentType
	 * @generated
	 */
	EEnum getVAlignmentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutFactory getLayoutFactory();

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
		 * The meta object literal for the '{@link guizmo.layout.impl.LayoutRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.LayoutRootImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getLayoutRoot()
		 * @generated
		 */
		EClass LAYOUT_ROOT = eINSTANCE.getLayoutRoot();

		/**
		 * The meta object literal for the '<em><b>View Trees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_ROOT__VIEW_TREES = eINSTANCE.getLayoutRoot_ViewTrees();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.NamedElementImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl <em>Info Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.LayoutInfoTreeNodeImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getLayoutInfoTreeNode()
		 * @generated
		 */
		EClass LAYOUT_INFO_TREE_NODE = eINSTANCE.getLayoutInfoTreeNode();

		/**
		 * The meta object literal for the '<em><b>Gui Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_INFO_TREE_NODE__GUI_ELEMENT = eINSTANCE.getLayoutInfoTreeNode_GuiElement();

		/**
		 * The meta object literal for the '<em><b>Layout Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES = eINSTANCE.getLayoutInfoTreeNode_LayoutAlternatives();

		/**
		 * The meta object literal for the '<em><b>Children Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_INFO_TREE_NODE__CHILDREN_NODES = eINSTANCE.getLayoutInfoTreeNode_ChildrenNodes();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_INFO_TREE_NODE__PARENT_NODE = eINSTANCE.getLayoutInfoTreeNode_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Referred By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_INFO_TREE_NODE__REFERRED_BY = eINSTANCE.getLayoutInfoTreeNode_ReferredBy();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.LayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Sublayouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SUBLAYOUTS = eINSTANCE.getLayout_Sublayouts();

		/**
		 * The meta object literal for the '<em><b>Parent Layout</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PARENT_LAYOUT = eINSTANCE.getLayout_ParentLayout();

		/**
		 * The meta object literal for the '<em><b>Ref Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__REF_NODE = eINSTANCE.getLayout_RefNode();

		/**
		 * The meta object literal for the '<em><b>Abs HAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ABS_HALIGNMENT = eINSTANCE.getLayout_AbsHAlignment();

		/**
		 * The meta object literal for the '<em><b>Abs VAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ABS_VALIGNMENT = eINSTANCE.getLayout_AbsVAlignment();

		/**
		 * The meta object literal for the '<em><b>Content HAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CONTENT_HALIGNMENT = eINSTANCE.getLayout_ContentHAlignment();

		/**
		 * The meta object literal for the '<em><b>Content VAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CONTENT_VALIGNMENT = eINSTANCE.getLayout_ContentVAlignment();

		/**
		 * The meta object literal for the '<em><b>Parent HAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__PARENT_HALIGNMENT = eINSTANCE.getLayout_ParentHAlignment();

		/**
		 * The meta object literal for the '<em><b>Parent VAlignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__PARENT_VALIGNMENT = eINSTANCE.getLayout_ParentVAlignment();

		/**
		 * The meta object literal for the '<em><b>HSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__HSIZE = eINSTANCE.getLayout_HSize();

		/**
		 * The meta object literal for the '<em><b>VSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__VSIZE = eINSTANCE.getLayout_VSize();

		/**
		 * The meta object literal for the '<em><b>Fitness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__FITNESS = eINSTANCE.getLayout_Fitness();

		/**
		 * The meta object literal for the '<em><b>Gaps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__GAPS = eINSTANCE.getLayout_Gaps();

		/**
		 * The meta object literal for the '<em><b>Ref Gaps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__REF_GAPS = eINSTANCE.getLayout_RefGaps();

		/**
		 * The meta object literal for the '<em><b>Margins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__MARGINS = eINSTANCE.getLayout_Margins();

		/**
		 * The meta object literal for the '<em><b>Lborder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__LBORDER = eINSTANCE.getLayout_Lborder();

		/**
		 * The meta object literal for the '<em><b>Rborder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__RBORDER = eINSTANCE.getLayout_Rborder();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.FlowLayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getFlowLayout()
		 * @generated
		 */
		EClass FLOW_LAYOUT = eINSTANCE.getFlowLayout();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LAYOUT__TYPE = eINSTANCE.getFlowLayout_Type();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.BorderLayoutImpl <em>Border Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.BorderLayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getBorderLayout()
		 * @generated
		 */
		EClass BORDER_LAYOUT = eINSTANCE.getBorderLayout();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_LAYOUT__TOP = eINSTANCE.getBorderLayout_Top();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_LAYOUT__LEFT = eINSTANCE.getBorderLayout_Left();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_LAYOUT__CENTER = eINSTANCE.getBorderLayout_Center();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_LAYOUT__RIGHT = eINSTANCE.getBorderLayout_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BORDER_LAYOUT__BOTTOM = eINSTANCE.getBorderLayout_Bottom();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.GridLayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getGridLayout()
		 * @generated
		 */
		EClass GRID_LAYOUT = eINSTANCE.getGridLayout();

		/**
		 * The meta object literal for the '<em><b>Num Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_LAYOUT__NUM_COLS = eINSTANCE.getGridLayout_NumCols();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.FormLayoutImpl <em>Form Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.FormLayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getFormLayout()
		 * @generated
		 */
		EClass FORM_LAYOUT = eINSTANCE.getFormLayout();

		/**
		 * The meta object literal for the '<em><b>Marks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LAYOUT__MARKS = eINSTANCE.getFormLayout_Marks();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LAYOUT__COLUMNS = eINSTANCE.getFormLayout_Columns();

		/**
		 * The meta object literal for the '<em><b>Num Nodes Longest Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LAYOUT__NUM_NODES_LONGEST_LINE = eINSTANCE.getFormLayout_NumNodesLongestLine();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.AlignedColumnImpl <em>Aligned Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.AlignedColumnImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getAlignedColumn()
		 * @generated
		 */
		EClass ALIGNED_COLUMN = eINSTANCE.getAlignedColumn();

		/**
		 * The meta object literal for the '<em><b>Lgap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNED_COLUMN__LGAP = eINSTANCE.getAlignedColumn_Lgap();

		/**
		 * The meta object literal for the '<em><b>Rgap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNED_COLUMN__RGAP = eINSTANCE.getAlignedColumn_Rgap();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNED_COLUMN__NODES = eINSTANCE.getAlignedColumn_Nodes();

		/**
		 * The meta object literal for the '<em><b>Left Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNED_COLUMN__LEFT_NODES = eINSTANCE.getAlignedColumn_LeftNodes();

		/**
		 * The meta object literal for the '<em><b>Right Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNED_COLUMN__RIGHT_NODES = eINSTANCE.getAlignedColumn_RightNodes();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.AlignmentMarkImpl <em>Alignment Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.AlignmentMarkImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getAlignmentMark()
		 * @generated
		 */
		EClass ALIGNMENT_MARK = eINSTANCE.getAlignmentMark();

		/**
		 * The meta object literal for the '<em><b>Lgap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNMENT_MARK__LGAP = eINSTANCE.getAlignmentMark_Lgap();

		/**
		 * The meta object literal for the '<em><b>Lnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNMENT_MARK__LNODES = eINSTANCE.getAlignmentMark_Lnodes();

		/**
		 * The meta object literal for the '<em><b>Rnodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNMENT_MARK__RNODES = eINSTANCE.getAlignmentMark_Rnodes();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.CustomLayoutImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getCustomLayout()
		 * @generated
		 */
		EClass CUSTOM_LAYOUT = eINSTANCE.getCustomLayout();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.ElementNodeImpl <em>Element Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.ElementNodeImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getElementNode()
		 * @generated
		 */
		EClass ELEMENT_NODE = eINSTANCE.getElementNode();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.SeparationImpl <em>Separation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.SeparationImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getSeparation()
		 * @generated
		 */
		EClass SEPARATION = eINSTANCE.getSeparation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATION__VALUE = eINSTANCE.getSeparation_Value();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.GapImpl <em>Gap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.GapImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getGap()
		 * @generated
		 */
		EClass GAP = eINSTANCE.getGap();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP__TYPE = eINSTANCE.getGap_Type();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAP__LAYOUTS = eINSTANCE.getGap_Layouts();

		/**
		 * The meta object literal for the '{@link guizmo.layout.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.impl.MarginImpl
		 * @see guizmo.layout.impl.LayoutPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGIN__TYPE = eINSTANCE.getMargin_Type();

		/**
		 * The meta object literal for the '{@link guizmo.layout.FlowLayoutType <em>Flow Layout Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.FlowLayoutType
		 * @see guizmo.layout.impl.LayoutPackageImpl#getFlowLayoutType()
		 * @generated
		 */
		EEnum FLOW_LAYOUT_TYPE = eINSTANCE.getFlowLayoutType();

		/**
		 * The meta object literal for the '{@link guizmo.layout.GapType <em>Gap Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.GapType
		 * @see guizmo.layout.impl.LayoutPackageImpl#getGapType()
		 * @generated
		 */
		EEnum GAP_TYPE = eINSTANCE.getGapType();

		/**
		 * The meta object literal for the '{@link guizmo.layout.MarginType <em>Margin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.MarginType
		 * @see guizmo.layout.impl.LayoutPackageImpl#getMarginType()
		 * @generated
		 */
		EEnum MARGIN_TYPE = eINSTANCE.getMarginType();

		/**
		 * The meta object literal for the '{@link guizmo.layout.HAlignmentType <em>HAlignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.HAlignmentType
		 * @see guizmo.layout.impl.LayoutPackageImpl#getHAlignmentType()
		 * @generated
		 */
		EEnum HALIGNMENT_TYPE = eINSTANCE.getHAlignmentType();

		/**
		 * The meta object literal for the '{@link guizmo.layout.VAlignmentType <em>VAlignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.layout.VAlignmentType
		 * @see guizmo.layout.impl.LayoutPackageImpl#getVAlignmentType()
		 * @generated
		 */
		EEnum VALIGNMENT_TYPE = eINSTANCE.getVAlignmentType();

	}

} //LayoutPackage
