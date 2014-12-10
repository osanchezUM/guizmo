/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.ResourceRepository#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getResourceRepository()
 * @model
 * @generated
 */
public interface ResourceRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getResourceRepository_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceRepository
