/**
 */
package guizmo.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.OutputText#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getOutputText()
 * @model
 * @generated
 */
public interface OutputText extends SingleWidget, Linkable {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see guizmo.structure.StructurePackage#getOutputText_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link guizmo.structure.OutputText#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

} // OutputText
