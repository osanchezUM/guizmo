/**
 */
package guizmo.layout;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.GridLayout#getNumCols <em>Num Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getGridLayout()
 * @model
 * @generated
 */
public interface GridLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Num Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Cols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Cols</em>' attribute.
	 * @see #setNumCols(int)
	 * @see guizmo.layout.LayoutPackage#getGridLayout_NumCols()
	 * @model required="true"
	 * @generated
	 */
	int getNumCols();

	/**
	 * Sets the value of the '{@link guizmo.layout.GridLayout#getNumCols <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cols</em>' attribute.
	 * @see #getNumCols()
	 * @generated
	 */
	void setNumCols(int value);

} // GridLayout
