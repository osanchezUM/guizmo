/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.ListBox#isMultipleSelection <em>Multiple Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getListBox()
 * @model
 * @generated
 */
public interface ListBox extends SingleWidget, Itemizable {
	/**
	 * Returns the value of the '<em><b>Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Selection</em>' attribute.
	 * @see #setMultipleSelection(boolean)
	 * @see guizmo.structure.StructurePackage#getListBox_MultipleSelection()
	 * @model
	 * @generated
	 */
	boolean isMultipleSelection();

	/**
	 * Sets the value of the '{@link guizmo.structure.ListBox#isMultipleSelection <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Selection</em>' attribute.
	 * @see #isMultipleSelection()
	 * @generated
	 */
	void setMultipleSelection(boolean value);

} // ListBox
