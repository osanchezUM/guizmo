/**
 */
package lasser.sketch.impl;

import java.util.Collection;

import lasser.sketch.SketchPackage;
import lasser.sketch.SketchRoot;
import lasser.sketch.Window;

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
 *   <li>{@link lasser.sketch.impl.SketchRootImpl#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SketchRootImpl extends EObjectImpl implements SketchRoot {
	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SketchRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SketchPackage.Literals.SKETCH_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<Window>(Window.class, this, SketchPackage.SKETCH_ROOT__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SketchPackage.SKETCH_ROOT__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
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
			case SketchPackage.SKETCH_ROOT__WINDOWS:
				return getWindows();
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
			case SketchPackage.SKETCH_ROOT__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
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
			case SketchPackage.SKETCH_ROOT__WINDOWS:
				getWindows().clear();
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
			case SketchPackage.SKETCH_ROOT__WINDOWS:
				return windows != null && !windows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SketchRootImpl
