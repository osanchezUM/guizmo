/**
 */
package guizmo.layout.impl;

import guizmo.layout.Layout;
import guizmo.layout.LayoutInfoTreeNode;
import guizmo.layout.LayoutPackage;

import guizmo.structure.GraphicalElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl#getGuiElement <em>Gui Element</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl#getLayoutAlternatives <em>Layout Alternatives</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl#getChildrenNodes <em>Children Nodes</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutInfoTreeNodeImpl#getReferredBy <em>Referred By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutInfoTreeNodeImpl extends NamedElementImpl implements LayoutInfoTreeNode {
	/**
	 * The cached value of the '{@link #getGuiElement() <em>Gui Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiElement()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement guiElement;

	/**
	 * The cached value of the '{@link #getLayoutAlternatives() <em>Layout Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> layoutAlternatives;

	/**
	 * The cached value of the '{@link #getChildrenNodes() <em>Children Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<LayoutInfoTreeNode> childrenNodes;

	/**
	 * The cached value of the '{@link #getReferredBy() <em>Referred By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> referredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutInfoTreeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.LAYOUT_INFO_TREE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement getGuiElement() {
		if (guiElement != null && guiElement.eIsProxy()) {
			InternalEObject oldGuiElement = (InternalEObject)guiElement;
			guiElement = (GraphicalElement)eResolveProxy(oldGuiElement);
			if (guiElement != oldGuiElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT, oldGuiElement, guiElement));
			}
		}
		return guiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement basicGetGuiElement() {
		return guiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiElement(GraphicalElement newGuiElement) {
		GraphicalElement oldGuiElement = guiElement;
		guiElement = newGuiElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT, oldGuiElement, guiElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getLayoutAlternatives() {
		if (layoutAlternatives == null) {
			layoutAlternatives = new EObjectContainmentEList<Layout>(Layout.class, this, LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES);
		}
		return layoutAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutInfoTreeNode> getChildrenNodes() {
		if (childrenNodes == null) {
			childrenNodes = new EObjectContainmentWithInverseEList<LayoutInfoTreeNode>(LayoutInfoTreeNode.class, this, LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES, LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE);
		}
		return childrenNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInfoTreeNode getParentNode() {
		if (eContainerFeatureID() != LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE) return null;
		return (LayoutInfoTreeNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(LayoutInfoTreeNode newParentNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNode, LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(LayoutInfoTreeNode newParentNode) {
		if (newParentNode != eInternalContainer() || (eContainerFeatureID() != LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE && newParentNode != null)) {
			if (EcoreUtil.isAncestor(this, newParentNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES, LayoutInfoTreeNode.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getReferredBy() {
		if (referredBy == null) {
			referredBy = new EObjectWithInverseResolvingEList<Layout>(Layout.class, this, LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY, LayoutPackage.LAYOUT__REF_NODE);
		}
		return referredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildrenNodes()).basicAdd(otherEnd, msgs);
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNode((LayoutInfoTreeNode)otherEnd, msgs);
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES:
				return ((InternalEList<?>)getLayoutAlternatives()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				return ((InternalEList<?>)getChildrenNodes()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				return ((InternalEList<?>)getReferredBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				return eInternalContainer().eInverseRemove(this, LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES, LayoutInfoTreeNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT:
				if (resolve) return getGuiElement();
				return basicGetGuiElement();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES:
				return getLayoutAlternatives();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				return getChildrenNodes();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				return getParentNode();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				return getReferredBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT:
				setGuiElement((GraphicalElement)newValue);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES:
				getLayoutAlternatives().clear();
				getLayoutAlternatives().addAll((Collection<? extends Layout>)newValue);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				getChildrenNodes().clear();
				getChildrenNodes().addAll((Collection<? extends LayoutInfoTreeNode>)newValue);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				setParentNode((LayoutInfoTreeNode)newValue);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				getReferredBy().clear();
				getReferredBy().addAll((Collection<? extends Layout>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT:
				setGuiElement((GraphicalElement)null);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES:
				getLayoutAlternatives().clear();
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				getChildrenNodes().clear();
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				setParentNode((LayoutInfoTreeNode)null);
				return;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				getReferredBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__GUI_ELEMENT:
				return guiElement != null;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__LAYOUT_ALTERNATIVES:
				return layoutAlternatives != null && !layoutAlternatives.isEmpty();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__CHILDREN_NODES:
				return childrenNodes != null && !childrenNodes.isEmpty();
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__PARENT_NODE:
				return getParentNode() != null;
			case LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY:
				return referredBy != null && !referredBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayoutInfoTreeNodeImpl
