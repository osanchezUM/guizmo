/**
 */
package guizmo.layout.impl;

import guizmo.layout.AlignedColumn;
import guizmo.layout.AlignmentMark;
import guizmo.layout.BorderLayout;
import guizmo.layout.CustomLayout;
import guizmo.layout.ElementNode;
import guizmo.layout.FlowLayout;
import guizmo.layout.FlowLayoutType;
import guizmo.layout.FormLayout;
import guizmo.layout.Gap;
import guizmo.layout.GapType;
import guizmo.layout.GridLayout;
import guizmo.layout.HAlignmentType;
import guizmo.layout.Layout;
import guizmo.layout.LayoutFactory;
import guizmo.layout.LayoutInfoTreeNode;
import guizmo.layout.LayoutPackage;
import guizmo.layout.LayoutRoot;
import guizmo.layout.Margin;
import guizmo.layout.MarginType;
import guizmo.layout.NamedElement;
import guizmo.layout.NodeLine;
import guizmo.layout.Separation;
import guizmo.layout.VAlignmentType;

import guizmo.structure.StructurePackage;

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
public class LayoutPackageImpl extends EPackageImpl implements LayoutPackage {
	
	
	@Override
	protected org.eclipse.emf.ecore.resource.Resource createResource(String uri) {
		return super.createResource(
				"../../guizmo.layoutMM/bin/guizmo/layoutMM/layout.ecore"	
				);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutRootEClass = null;

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
	private EClass layoutInfoTreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignedColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignmentMarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowLayoutTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum marginTypeEEnum = null;

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
	private EEnum vAlignmentTypeEEnum = null;

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
	 * @see guizmo.layout.LayoutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LayoutPackageImpl() {
		super(eNS_URI, LayoutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LayoutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LayoutPackage init() {
		if (isInited) return (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);

		// Obtain or create and register package
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LayoutPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLayoutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LayoutPackage.eNS_URI, theLayoutPackage);
		return theLayoutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutRoot() {
		return layoutRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutRoot_ViewTrees() {
		return (EReference)layoutRootEClass.getEStructuralFeatures().get(0);
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
	public EClass getLayoutInfoTreeNode() {
		return layoutInfoTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutInfoTreeNode_GuiElement() {
		return (EReference)layoutInfoTreeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutInfoTreeNode_LayoutAlternatives() {
		return (EReference)layoutInfoTreeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutInfoTreeNode_ChildrenNodes() {
		return (EReference)layoutInfoTreeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutInfoTreeNode_ParentNode() {
		return (EReference)layoutInfoTreeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutInfoTreeNode_ReferredBy() {
		return (EReference)layoutInfoTreeNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Sublayouts() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_ParentLayout() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_RefNode() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_AbsHAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_AbsVAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_ContentHAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_ContentVAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_ParentHAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_ParentVAlignment() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_HSize() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_VSize() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Fitness() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Gaps() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_RefGaps() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Margins() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Lborder() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Rborder() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowLayout() {
		return flowLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowLayout_Type() {
		return (EAttribute)flowLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderLayout() {
		return borderLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderLayout_Top() {
		return (EReference)borderLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderLayout_Left() {
		return (EReference)borderLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderLayout_Center() {
		return (EReference)borderLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderLayout_Right() {
		return (EReference)borderLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBorderLayout_Bottom() {
		return (EReference)borderLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridLayout() {
		return gridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridLayout_NumCols() {
		return (EAttribute)gridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLayout() {
		return formLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLayout_Marks() {
		return (EReference)formLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLayout_Columns() {
		return (EReference)formLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLayout_NumNodesLongestLine() {
		return (EAttribute)formLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignedColumn() {
		return alignedColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignedColumn_Lgap() {
		return (EAttribute)alignedColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignedColumn_Rgap() {
		return (EAttribute)alignedColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignedColumn_Nodes() {
		return (EReference)alignedColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignedColumn_LeftNodes() {
		return (EReference)alignedColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignedColumn_RightNodes() {
		return (EReference)alignedColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignmentMark() {
		return alignmentMarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignmentMark_Lgap() {
		return (EAttribute)alignmentMarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignmentMark_Lnodes() {
		return (EReference)alignmentMarkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignmentMark_Rnodes() {
		return (EReference)alignmentMarkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomLayout() {
		return customLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementNode() {
		return elementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparation() {
		return separationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeparation_Value() {
		return (EAttribute)separationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGap() {
		return gapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGap_Type() {
		return (EAttribute)gapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGap_Layouts() {
		return (EReference)gapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMargin() {
		return marginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMargin_Type() {
		return (EAttribute)marginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowLayoutType() {
		return flowLayoutTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGapType() {
		return gapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMarginType() {
		return marginTypeEEnum;
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
	public EEnum getVAlignmentType() {
		return vAlignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactory getLayoutFactory() {
		return (LayoutFactory)getEFactoryInstance();
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
		layoutRootEClass = createEClass(LAYOUT_ROOT);
		createEReference(layoutRootEClass, LAYOUT_ROOT__VIEW_TREES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		layoutInfoTreeNodeEClass = createEClass(LAYOUT_INFO_TREE_NODE);
		createEReference(layoutInfoTreeNodeEClass, LAYOUT_INFO_TREE_NODE__GUI_ELEMENT);
		createEReference(layoutInfoTreeNodeEClass, LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES);
		createEReference(layoutInfoTreeNodeEClass, LAYOUT_INFO_TREE_NODE__CHILDREN_NODES);
		createEReference(layoutInfoTreeNodeEClass, LAYOUT_INFO_TREE_NODE__PARENT_NODE);
		createEReference(layoutInfoTreeNodeEClass, LAYOUT_INFO_TREE_NODE__REFERRED_BY);

		layoutEClass = createEClass(LAYOUT);
		createEReference(layoutEClass, LAYOUT__SUBLAYOUTS);
		createEReference(layoutEClass, LAYOUT__PARENT_LAYOUT);
		createEReference(layoutEClass, LAYOUT__REF_NODE);
		createEAttribute(layoutEClass, LAYOUT__ABS_HALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__ABS_VALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__CONTENT_HALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__CONTENT_VALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__PARENT_HALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__PARENT_VALIGNMENT);
		createEAttribute(layoutEClass, LAYOUT__HSIZE);
		createEAttribute(layoutEClass, LAYOUT__VSIZE);
		createEAttribute(layoutEClass, LAYOUT__FITNESS);
		createEReference(layoutEClass, LAYOUT__GAPS);
		createEReference(layoutEClass, LAYOUT__REF_GAPS);
		createEReference(layoutEClass, LAYOUT__MARGINS);
		createEReference(layoutEClass, LAYOUT__LBORDER);
		createEReference(layoutEClass, LAYOUT__RBORDER);

		flowLayoutEClass = createEClass(FLOW_LAYOUT);
		createEAttribute(flowLayoutEClass, FLOW_LAYOUT__TYPE);

		borderLayoutEClass = createEClass(BORDER_LAYOUT);
		createEReference(borderLayoutEClass, BORDER_LAYOUT__TOP);
		createEReference(borderLayoutEClass, BORDER_LAYOUT__LEFT);
		createEReference(borderLayoutEClass, BORDER_LAYOUT__CENTER);
		createEReference(borderLayoutEClass, BORDER_LAYOUT__RIGHT);
		createEReference(borderLayoutEClass, BORDER_LAYOUT__BOTTOM);

		gridLayoutEClass = createEClass(GRID_LAYOUT);
		createEAttribute(gridLayoutEClass, GRID_LAYOUT__NUM_COLS);

		formLayoutEClass = createEClass(FORM_LAYOUT);
		createEReference(formLayoutEClass, FORM_LAYOUT__MARKS);
		createEReference(formLayoutEClass, FORM_LAYOUT__COLUMNS);
		createEAttribute(formLayoutEClass, FORM_LAYOUT__NUM_NODES_LONGEST_LINE);

		alignedColumnEClass = createEClass(ALIGNED_COLUMN);
		createEAttribute(alignedColumnEClass, ALIGNED_COLUMN__LGAP);
		createEAttribute(alignedColumnEClass, ALIGNED_COLUMN__RGAP);
		createEReference(alignedColumnEClass, ALIGNED_COLUMN__NODES);
		createEReference(alignedColumnEClass, ALIGNED_COLUMN__LEFT_NODES);
		createEReference(alignedColumnEClass, ALIGNED_COLUMN__RIGHT_NODES);

		alignmentMarkEClass = createEClass(ALIGNMENT_MARK);
		createEAttribute(alignmentMarkEClass, ALIGNMENT_MARK__LGAP);
		createEReference(alignmentMarkEClass, ALIGNMENT_MARK__LNODES);
		createEReference(alignmentMarkEClass, ALIGNMENT_MARK__RNODES);

		customLayoutEClass = createEClass(CUSTOM_LAYOUT);

		elementNodeEClass = createEClass(ELEMENT_NODE);

		separationEClass = createEClass(SEPARATION);
		createEAttribute(separationEClass, SEPARATION__VALUE);

		gapEClass = createEClass(GAP);
		createEAttribute(gapEClass, GAP__TYPE);
		createEReference(gapEClass, GAP__LAYOUTS);

		marginEClass = createEClass(MARGIN);
		createEAttribute(marginEClass, MARGIN__TYPE);

		// Create enums
		flowLayoutTypeEEnum = createEEnum(FLOW_LAYOUT_TYPE);
		gapTypeEEnum = createEEnum(GAP_TYPE);
		marginTypeEEnum = createEEnum(MARGIN_TYPE);
		hAlignmentTypeEEnum = createEEnum(HALIGNMENT_TYPE);
		vAlignmentTypeEEnum = createEEnum(VALIGNMENT_TYPE);
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
		layoutInfoTreeNodeEClass.getESuperTypes().add(this.getNamedElement());
		layoutEClass.getESuperTypes().add(this.getNamedElement());
		flowLayoutEClass.getESuperTypes().add(this.getLayout());
		borderLayoutEClass.getESuperTypes().add(this.getLayout());
		gridLayoutEClass.getESuperTypes().add(this.getLayout());
		formLayoutEClass.getESuperTypes().add(this.getLayout());
		customLayoutEClass.getESuperTypes().add(this.getLayout());
		elementNodeEClass.getESuperTypes().add(this.getLayout());
		gapEClass.getESuperTypes().add(this.getSeparation());
		marginEClass.getESuperTypes().add(this.getSeparation());

		// Initialize classes and features; add operations and parameters
		initEClass(layoutRootEClass, LayoutRoot.class, "LayoutRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutRoot_ViewTrees(), this.getLayoutInfoTreeNode(), null, "viewTrees", null, 0, -1, LayoutRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutInfoTreeNodeEClass, LayoutInfoTreeNode.class, "LayoutInfoTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutInfoTreeNode_GuiElement(), theStructurePackage.getGraphicalElement(), null, "guiElement", null, 1, 1, LayoutInfoTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutInfoTreeNode_LayoutAlternatives(), this.getLayout(), null, "layoutAlternatives", null, 0, -1, LayoutInfoTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutInfoTreeNode_ChildrenNodes(), this.getLayoutInfoTreeNode(), this.getLayoutInfoTreeNode_ParentNode(), "childrenNodes", null, 0, -1, LayoutInfoTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutInfoTreeNode_ParentNode(), this.getLayoutInfoTreeNode(), this.getLayoutInfoTreeNode_ChildrenNodes(), "parentNode", null, 0, 1, LayoutInfoTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutInfoTreeNode_ReferredBy(), this.getLayout(), this.getLayout_RefNode(), "referredBy", null, 0, -1, LayoutInfoTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayout_Sublayouts(), this.getLayout(), this.getLayout_ParentLayout(), "sublayouts", null, 1, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_ParentLayout(), this.getLayout(), this.getLayout_Sublayouts(), "parentLayout", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_RefNode(), this.getLayoutInfoTreeNode(), this.getLayoutInfoTreeNode_ReferredBy(), "refNode", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_AbsHAlignment(), this.getHAlignmentType(), "absHAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_AbsVAlignment(), this.getVAlignmentType(), "absVAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_ContentHAlignment(), this.getHAlignmentType(), "contentHAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_ContentVAlignment(), this.getVAlignmentType(), "contentVAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_ParentHAlignment(), this.getHAlignmentType(), "parentHAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_ParentVAlignment(), this.getVAlignmentType(), "parentVAlignment", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_HSize(), ecorePackage.getEFloat(), "hSize", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_VSize(), ecorePackage.getEFloat(), "vSize", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Fitness(), ecorePackage.getEFloat(), "fitness", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Gaps(), this.getGap(), null, "gaps", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_RefGaps(), this.getGap(), this.getGap_Layouts(), "refGaps", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Margins(), this.getMargin(), null, "margins", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Lborder(), this.getAlignmentMark(), this.getAlignmentMark_Lnodes(), "lborder", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Rborder(), this.getAlignmentMark(), this.getAlignmentMark_Rnodes(), "rborder", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLayoutEClass, FlowLayout.class, "FlowLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowLayout_Type(), this.getFlowLayoutType(), "type", null, 1, 1, FlowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderLayoutEClass, BorderLayout.class, "BorderLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBorderLayout_Top(), this.getLayout(), null, "top", null, 1, 1, BorderLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderLayout_Left(), this.getLayout(), null, "left", null, 1, 1, BorderLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderLayout_Center(), this.getLayout(), null, "center", null, 1, 1, BorderLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderLayout_Right(), this.getLayout(), null, "right", null, 1, 1, BorderLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBorderLayout_Bottom(), this.getLayout(), null, "bottom", null, 1, 1, BorderLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridLayoutEClass, GridLayout.class, "GridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridLayout_NumCols(), ecorePackage.getEInt(), "numCols", null, 1, 1, GridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLayoutEClass, FormLayout.class, "FormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormLayout_Marks(), this.getAlignmentMark(), null, "marks", null, 0, -1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormLayout_Columns(), this.getAlignedColumn(), null, "columns", null, 0, -1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLayout_NumNodesLongestLine(), ecorePackage.getEInt(), "numNodesLongestLine", null, 0, 1, FormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alignedColumnEClass, AlignedColumn.class, "AlignedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlignedColumn_Lgap(), ecorePackage.getEFloat(), "lgap", null, 0, 1, AlignedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlignedColumn_Rgap(), ecorePackage.getEFloat(), "rgap", null, 0, 1, AlignedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignedColumn_Nodes(), this.getElementNode(), null, "nodes", null, 0, -1, AlignedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignedColumn_LeftNodes(), this.getElementNode(), null, "leftNodes", null, 0, -1, AlignedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignedColumn_RightNodes(), this.getElementNode(), null, "rightNodes", null, 0, -1, AlignedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alignmentMarkEClass, AlignmentMark.class, "AlignmentMark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlignmentMark_Lgap(), ecorePackage.getEFloat(), "lgap", null, 1, 1, AlignmentMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignmentMark_Lnodes(), this.getLayout(), this.getLayout_Lborder(), "lnodes", null, 0, -1, AlignmentMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlignmentMark_Rnodes(), this.getLayout(), this.getLayout_Rborder(), "rnodes", null, 0, -1, AlignmentMark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLayoutEClass, CustomLayout.class, "CustomLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementNodeEClass, ElementNode.class, "ElementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separationEClass, Separation.class, "Separation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeparation_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Separation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gapEClass, Gap.class, "Gap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGap_Type(), this.getGapType(), "type", null, 0, 1, Gap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGap_Layouts(), this.getLayout(), this.getLayout_RefGaps(), "layouts", null, 2, 2, Gap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marginEClass, Margin.class, "Margin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMargin_Type(), this.getMarginType(), "type", null, 0, 1, Margin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flowLayoutTypeEEnum, FlowLayoutType.class, "FlowLayoutType");
		addEEnumLiteral(flowLayoutTypeEEnum, FlowLayoutType.HORIZONTAL);
		addEEnumLiteral(flowLayoutTypeEEnum, FlowLayoutType.VERTICAL);

		initEEnum(gapTypeEEnum, GapType.class, "GapType");
		addEEnumLiteral(gapTypeEEnum, GapType.HORIZONTAL);
		addEEnumLiteral(gapTypeEEnum, GapType.VERTICAL);

		initEEnum(marginTypeEEnum, MarginType.class, "MarginType");
		addEEnumLiteral(marginTypeEEnum, MarginType.LEFT);
		addEEnumLiteral(marginTypeEEnum, MarginType.RIGHT);
		addEEnumLiteral(marginTypeEEnum, MarginType.TOP);
		addEEnumLiteral(marginTypeEEnum, MarginType.BOTTOM);

		initEEnum(hAlignmentTypeEEnum, HAlignmentType.class, "HAlignmentType");
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.NONE);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.LEFT);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.CENTER);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.RIGHT);
		addEEnumLiteral(hAlignmentTypeEEnum, HAlignmentType.BOTH);

		initEEnum(vAlignmentTypeEEnum, VAlignmentType.class, "VAlignmentType");
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.NONE);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.TOP);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.MIDDLE);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.BOTTOM);
		addEEnumLiteral(vAlignmentTypeEEnum, VAlignmentType.BOTH);

		// Create resource
		createResource(eNS_URI);
	}

} //LayoutPackageImpl
