/**
 */
package guizmo.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Button#getGraphic <em>Graphic</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getButton()
 * @model
 * @generated
 */
public interface Button extends SingleWidget {
	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference.
	 * @see #setGraphic(GraphicalResource)
	 * @see guizmo.structure.StructurePackage#getButton_Graphic()
	 * @model containment="true"
	 * @generated
	 */
	GraphicalResource getGraphic();

	/**
	 * Sets the value of the '{@link guizmo.structure.Button#getGraphic <em>Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic</em>' containment reference.
	 * @see #getGraphic()
	 * @generated
	 */
	void setGraphic(GraphicalResource value);

} // Button
