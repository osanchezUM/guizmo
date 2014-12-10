/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.StructureRoot#getViews <em>Views</em>}</li>
 *   <li>{@link guizmo.structure.StructureRoot#getResourceRepository <em>Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getStructureRoot()
 * @model
 * @generated
 */
public interface StructureRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.GraphicalView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getStructureRoot_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicalView> getViews();

	/**
	 * Returns the value of the '<em><b>Resource Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Repository</em>' containment reference.
	 * @see #setResourceRepository(ResourceRepository)
	 * @see guizmo.structure.StructurePackage#getStructureRoot_ResourceRepository()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRepository getResourceRepository();

	/**
	 * Sets the value of the '{@link guizmo.structure.StructureRoot#getResourceRepository <em>Resource Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Repository</em>' containment reference.
	 * @see #getResourceRepository()
	 * @generated
	 */
	void setResourceRepository(ResourceRepository value);

} // StructureRoot
