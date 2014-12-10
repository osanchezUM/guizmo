/**
 */
package guizmo.layout;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.Margin#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getMargin()
 * @model
 * @generated
 */
public interface Margin extends Separation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.MarginType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.MarginType
	 * @see #setType(MarginType)
	 * @see guizmo.layout.LayoutPackage#getMargin_Type()
	 * @model
	 * @generated
	 */
	MarginType getType();

	/**
	 * Sets the value of the '{@link guizmo.layout.Margin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.MarginType
	 * @see #getType()
	 * @generated
	 */
	void setType(MarginType value);

} // Margin
