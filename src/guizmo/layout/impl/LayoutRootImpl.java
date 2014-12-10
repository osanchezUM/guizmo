/**
 */
package guizmo.layout.impl;

import guizmo.layout.LayoutInfoTreeNode;
import guizmo.layout.LayoutPackage;
import guizmo.layout.LayoutRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.LayoutRootImpl#getViewTrees <em>View Trees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutRootImpl extends EObjectImpl implements LayoutRoot {
	/**
	 * The cached value of the '{@link #getViewTrees() <em>View Trees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewTrees()
	 * @generated
	 * @ordered
	 */
	protected EList<LayoutInfoTreeNode> viewTrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.LAYOUT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutInfoTreeNode> getViewTrees() {
		if (viewTrees == null) {
			viewTrees = new EObjectContainmentEList<LayoutInfoTreeNode>(LayoutInfoTreeNode.class, this, LayoutPackage.LAYOUT_ROOT__VIEW_TREES);
		}
		return viewTrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_ROOT__VIEW_TREES:
				return ((InternalEList<?>)getViewTrees()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.LAYOUT_ROOT__VIEW_TREES:
				return getViewTrees();
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
			case LayoutPackage.LAYOUT_ROOT__VIEW_TREES:
				getViewTrees().clear();
				getViewTrees().addAll((Collection<? extends LayoutInfoTreeNode>)newValue);
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
			case LayoutPackage.LAYOUT_ROOT__VIEW_TREES:
				getViewTrees().clear();
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
			case LayoutPackage.LAYOUT_ROOT__VIEW_TREES:
				return viewTrees != null && !viewTrees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayoutRootImpl
