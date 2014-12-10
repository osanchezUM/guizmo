/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.RadioGroup#isMultipleSelection <em>Multiple Selection</em>}</li>
 *   <li>{@link guizmo.structure.RadioGroup#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends SingleWidget, Itemizable {
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
	 * @see guizmo.structure.StructurePackage#getRadioGroup_MultipleSelection()
	 * @model
	 * @generated
	 */
	boolean isMultipleSelection();

	/**
	 * Sets the value of the '{@link guizmo.structure.RadioGroup#isMultipleSelection <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Selection</em>' attribute.
	 * @see #isMultipleSelection()
	 * @generated
	 */
	void setMultipleSelection(boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference list.
	 * The list contents are of type {@link guizmo.structure.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference list.
	 * @see guizmo.structure.StructurePackage#getRadioGroup_Selected()
	 * @model
	 * @generated
	 */
	EList<Item> getSelected();

} // RadioGroup
