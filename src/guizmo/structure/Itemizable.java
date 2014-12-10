/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Itemizable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Itemizable#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getItemizable()
 * @model abstract="true"
 * @generated
 */
public interface Itemizable extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getItemizable_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Itemizable
