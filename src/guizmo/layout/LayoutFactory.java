/**
 */
package guizmo.layout;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.layout.LayoutPackage
 * @generated
 */
public interface LayoutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutFactory eINSTANCE = guizmo.layout.impl.LayoutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	LayoutRoot createLayoutRoot();

	/**
	 * Returns a new object of class '<em>Info Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info Tree Node</em>'.
	 * @generated
	 */
	LayoutInfoTreeNode createLayoutInfoTreeNode();

	/**
	 * Returns a new object of class '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Layout</em>'.
	 * @generated
	 */
	FlowLayout createFlowLayout();

	/**
	 * Returns a new object of class '<em>Border Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border Layout</em>'.
	 * @generated
	 */
	BorderLayout createBorderLayout();

	/**
	 * Returns a new object of class '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Layout</em>'.
	 * @generated
	 */
	GridLayout createGridLayout();

	/**
	 * Returns a new object of class '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Layout</em>'.
	 * @generated
	 */
	FormLayout createFormLayout();

	/**
	 * Returns a new object of class '<em>Aligned Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aligned Column</em>'.
	 * @generated
	 */
	AlignedColumn createAlignedColumn();

	/**
	 * Returns a new object of class '<em>Alignment Mark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alignment Mark</em>'.
	 * @generated
	 */
	AlignmentMark createAlignmentMark();

	/**
	 * Returns a new object of class '<em>Custom Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Layout</em>'.
	 * @generated
	 */
	CustomLayout createCustomLayout();

	/**
	 * Returns a new object of class '<em>Element Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Node</em>'.
	 * @generated
	 */
	ElementNode createElementNode();

	/**
	 * Returns a new object of class '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gap</em>'.
	 * @generated
	 */
	Gap createGap();

	/**
	 * Returns a new object of class '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Margin</em>'.
	 * @generated
	 */
	Margin createMargin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LayoutPackage getLayoutPackage();

} //LayoutFactory
