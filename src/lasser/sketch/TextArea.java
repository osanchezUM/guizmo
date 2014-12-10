/**
 */
package lasser.sketch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.TextArea#getRows <em>Rows</em>}</li>
 *   <li>{@link lasser.sketch.TextArea#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends TextWidget {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see lasser.sketch.SketchPackage#getTextArea_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link lasser.sketch.TextArea#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see lasser.sketch.SketchPackage#getTextArea_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link lasser.sketch.TextArea#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

} // TextArea
