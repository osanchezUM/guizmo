/**
 */
package guizmo.layout;

import guizmo.structure.GraphicalElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.LayoutInfoTreeNode#getGuiElement <em>Gui Element</em>}</li>
 *   <li>{@link guizmo.layout.LayoutInfoTreeNode#getLayoutAlternatives <em>Layout Alternatives</em>}</li>
 *   <li>{@link guizmo.layout.LayoutInfoTreeNode#getChildrenNodes <em>Children Nodes</em>}</li>
 *   <li>{@link guizmo.layout.LayoutInfoTreeNode#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link guizmo.layout.LayoutInfoTreeNode#getReferredBy <em>Referred By</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode()
 * @model
 * @generated
 */
public interface LayoutInfoTreeNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gui Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Element</em>' reference.
	 * @see #setGuiElement(GraphicalElement)
	 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode_GuiElement()
	 * @model required="true"
	 * @generated
	 */
	GraphicalElement getGuiElement();

	/**
	 * Sets the value of the '{@link guizmo.layout.LayoutInfoTreeNode#getGuiElement <em>Gui Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Element</em>' reference.
	 * @see #getGuiElement()
	 * @generated
	 */
	void setGuiElement(GraphicalElement value);

	/**
	 * Returns the value of the '<em><b>Layout Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Alternatives</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode_LayoutAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layout> getLayoutAlternatives();

	/**
	 * Returns the value of the '<em><b>Children Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.LayoutInfoTreeNode}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.LayoutInfoTreeNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Nodes</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode_ChildrenNodes()
	 * @see guizmo.layout.LayoutInfoTreeNode#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<LayoutInfoTreeNode> getChildrenNodes();

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.LayoutInfoTreeNode#getChildrenNodes <em>Children Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(LayoutInfoTreeNode)
	 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode_ParentNode()
	 * @see guizmo.layout.LayoutInfoTreeNode#getChildrenNodes
	 * @model opposite="childrenNodes" transient="false"
	 * @generated
	 */
	LayoutInfoTreeNode getParentNode();

	/**
	 * Sets the value of the '{@link guizmo.layout.LayoutInfoTreeNode#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(LayoutInfoTreeNode value);

	/**
	 * Returns the value of the '<em><b>Referred By</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getRefNode <em>Ref Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getLayoutInfoTreeNode_ReferredBy()
	 * @see guizmo.layout.Layout#getRefNode
	 * @model opposite="refNode"
	 * @generated
	 */
	EList<Layout> getReferredBy();

} // LayoutInfoTreeNode
