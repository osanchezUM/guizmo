/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Item#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getItem()
 * @model
 * @generated
 */
public interface Item extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(GraphicalResource)
	 * @see guizmo.structure.StructurePackage#getItem_Resource()
	 * @model containment="true"
	 * @generated
	 */
	GraphicalResource getResource();

	/**
	 * Sets the value of the '{@link guizmo.structure.Item#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(GraphicalResource value);

} // Item
