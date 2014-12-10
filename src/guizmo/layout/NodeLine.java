/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.NodeLine#getNodes <em>Nodes</em>}</li>
 *   <li>{@link guizmo.layout.NodeLine#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getNodeLine()
 * @model
 * @generated
 */
public interface NodeLine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getContainerLine <em>Container Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getNodeLine_Nodes()
	 * @see guizmo.layout.Layout#getContainerLine
	 * @model opposite="containerLine"
	 * @generated
	 */
	EList<Layout> getNodes();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.FormLayout#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FormLayout)
	 * @see guizmo.layout.LayoutPackage#getNodeLine_Parent()
	 * @see guizmo.layout.FormLayout#getLines
	 * @model opposite="lines" required="true" transient="false"
	 * @generated
	 */
	FormLayout getParent();

	/**
	 * Sets the value of the '{@link guizmo.layout.NodeLine#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FormLayout value);

} // NodeLine
