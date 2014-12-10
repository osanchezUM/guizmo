/**
 */
package guizmo.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.TextArea#getText <em>Text</em>}</li>
 *   <li>{@link guizmo.structure.TextArea#getNumRows <em>Num Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends SingleWidget {
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
	 * @see guizmo.structure.StructurePackage#getTextArea_Text()
	 * @model containment="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link guizmo.structure.TextArea#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Rows</em>' attribute.
	 * @see #setNumRows(int)
	 * @see guizmo.structure.StructurePackage#getTextArea_NumRows()
	 * @model
	 * @generated
	 */
	int getNumRows();

	/**
	 * Sets the value of the '{@link guizmo.structure.TextArea#getNumRows <em>Num Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Rows</em>' attribute.
	 * @see #getNumRows()
	 * @generated
	 */
	void setNumRows(int value);

} // TextArea
