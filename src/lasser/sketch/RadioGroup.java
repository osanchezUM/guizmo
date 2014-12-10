/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.RadioGroup#getSelected <em>Selected</em>}</li>
 *   <li>{@link lasser.sketch.RadioGroup#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends Widget {

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(RadioButton)
	 * @see lasser.sketch.SketchPackage#getRadioGroup_Selected()
	 * @model
	 * @generated
	 */
	RadioButton getSelected();

	/**
	 * Sets the value of the '{@link lasser.sketch.RadioGroup#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(RadioButton value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getRadioGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<RadioButton> getItems();
} // RadioGroup
