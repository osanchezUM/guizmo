/**
 */
package lasser.sketch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.CheckBox#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends TextWidget {

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
	 * @see lasser.sketch.SketchPackage#getCheckBox_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link lasser.sketch.CheckBox#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);
} // CheckBox
