/**
 */
package guizmo.layout;

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
 *   <li>{@link guizmo.layout.LayoutRoot#getViewTrees <em>View Trees</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getLayoutRoot()
 * @model
 * @generated
 */
public interface LayoutRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>View Trees</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.LayoutInfoTreeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Trees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Trees</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayoutRoot_ViewTrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayoutInfoTreeNode> getViewTrees();

} // LayoutRoot
