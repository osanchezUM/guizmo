/**
 */
package guizmo.layout.impl;

import guizmo.layout.*;

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
public class LayoutFactoryImpl extends EFactoryImpl implements LayoutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutFactory init() {
		try {
			LayoutFactory theLayoutFactory = (LayoutFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelum.es/guizmo/layout"); 
			if (theLayoutFactory != null) {
				return theLayoutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayoutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactoryImpl() {
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
			case LayoutPackage.LAYOUT_ROOT: return createLayoutRoot();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE: return createLayoutInfoTreeNode();
			case LayoutPackage.FLOW_LAYOUT: return createFlowLayout();
			case LayoutPackage.BORDER_LAYOUT: return createBorderLayout();
			case LayoutPackage.GRID_LAYOUT: return createGridLayout();
			case LayoutPackage.FORM_LAYOUT: return createFormLayout();
			case LayoutPackage.ALIGNED_COLUMN: return createAlignedColumn();
			case LayoutPackage.ALIGNMENT_MARK: return createAlignmentMark();
			case LayoutPackage.CUSTOM_LAYOUT: return createCustomLayout();
			case LayoutPackage.ELEMENT_NODE: return createElementNode();
			case LayoutPackage.GAP: return createGap();
			case LayoutPackage.MARGIN: return createMargin();
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
			case LayoutPackage.FLOW_LAYOUT_TYPE:
				return createFlowLayoutTypeFromString(eDataType, initialValue);
			case LayoutPackage.GAP_TYPE:
				return createGapTypeFromString(eDataType, initialValue);
			case LayoutPackage.MARGIN_TYPE:
				return createMarginTypeFromString(eDataType, initialValue);
			case LayoutPackage.HALIGNMENT_TYPE:
				return createHAlignmentTypeFromString(eDataType, initialValue);
			case LayoutPackage.VALIGNMENT_TYPE:
				return createVAlignmentTypeFromString(eDataType, initialValue);
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
			case LayoutPackage.FLOW_LAYOUT_TYPE:
				return convertFlowLayoutTypeToString(eDataType, instanceValue);
			case LayoutPackage.GAP_TYPE:
				return convertGapTypeToString(eDataType, instanceValue);
			case LayoutPackage.MARGIN_TYPE:
				return convertMarginTypeToString(eDataType, instanceValue);
			case LayoutPackage.HALIGNMENT_TYPE:
				return convertHAlignmentTypeToString(eDataType, instanceValue);
			case LayoutPackage.VALIGNMENT_TYPE:
				return convertVAlignmentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutRoot createLayoutRoot() {
		LayoutRootImpl layoutRoot = new LayoutRootImpl();
		return layoutRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInfoTreeNode createLayoutInfoTreeNode() {
		LayoutInfoTreeNodeImpl layoutInfoTreeNode = new LayoutInfoTreeNodeImpl();
		return layoutInfoTreeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLayout createFlowLayout() {
		FlowLayoutImpl flowLayout = new FlowLayoutImpl();
		return flowLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderLayout createBorderLayout() {
		BorderLayoutImpl borderLayout = new BorderLayoutImpl();
		return borderLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLayout createGridLayout() {
		GridLayoutImpl gridLayout = new GridLayoutImpl();
		return gridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLayout createFormLayout() {
		FormLayoutImpl formLayout = new FormLayoutImpl();
		return formLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignedColumn createAlignedColumn() {
		AlignedColumnImpl alignedColumn = new AlignedColumnImpl();
		return alignedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentMark createAlignmentMark() {
		AlignmentMarkImpl alignmentMark = new AlignmentMarkImpl();
		return alignmentMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLayout createCustomLayout() {
		CustomLayoutImpl customLayout = new CustomLayoutImpl();
		return customLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementNode createElementNode() {
		ElementNodeImpl elementNode = new ElementNodeImpl();
		return elementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gap createGap() {
		GapImpl gap = new GapImpl();
		return gap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Margin createMargin() {
		MarginImpl margin = new MarginImpl();
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLayoutType createFlowLayoutTypeFromString(EDataType eDataType, String initialValue) {
		FlowLayoutType result = FlowLayoutType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowLayoutTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GapType createGapTypeFromString(EDataType eDataType, String initialValue) {
		GapType result = GapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarginType createMarginTypeFromString(EDataType eDataType, String initialValue) {
		MarginType result = MarginType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarginTypeToString(EDataType eDataType, Object instanceValue) {
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
	public LayoutPackage getLayoutPackage() {
		return (LayoutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayoutPackage getPackage() {
		return LayoutPackage.eINSTANCE;
	}

} //LayoutFactoryImpl
