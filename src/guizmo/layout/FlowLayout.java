/**
 */
package guizmo.layout;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.FlowLayout#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getFlowLayout()
 * @model
 * @generated
 */
public interface FlowLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.FlowLayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.FlowLayoutType
	 * @see #setType(FlowLayoutType)
	 * @see guizmo.layout.LayoutPackage#getFlowLayout_Type()
	 * @model required="true"
	 * @generated
	 */
	FlowLayoutType getType();

	/**
	 * Sets the value of the '{@link guizmo.layout.FlowLayout#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.FlowLayoutType
	 * @see #getType()
	 * @generated
	 */
	void setType(FlowLayoutType value);

} // FlowLayout
