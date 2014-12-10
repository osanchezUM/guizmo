/**
 */
package lasser.sketch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.RadioButton#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends TextWidget {

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see lasser.sketch.SketchPackage#getRadioButton_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link lasser.sketch.RadioButton#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);
} // RadioButton
