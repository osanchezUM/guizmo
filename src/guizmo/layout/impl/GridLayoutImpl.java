/**
 */
package guizmo.layout.impl;

import guizmo.layout.GridLayout;
import guizmo.layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.GridLayoutImpl#getNumCols <em>Num Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridLayoutImpl extends LayoutImpl implements GridLayout {
	/**
	 * The default value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_COLS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumCols() <em>Num Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCols()
	 * @generated
	 * @ordered
	 */
	protected int numCols = NUM_COLS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.GRID_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumCols() {
		return numCols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCols(int newNumCols) {
		int oldNumCols = numCols;
		numCols = newNumCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.GRID_LAYOUT__NUM_COLS, oldNumCols, numCols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.GRID_LAYOUT__NUM_COLS:
				return getNumCols();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutPackage.GRID_LAYOUT__NUM_COLS:
				setNumCols((Integer)newValue);
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
			case LayoutPackage.GRID_LAYOUT__NUM_COLS:
				setNumCols(NUM_COLS_EDEFAULT);
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
			case LayoutPackage.GRID_LAYOUT__NUM_COLS:
				return numCols != NUM_COLS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numCols: ");
		result.append(numCols);
		result.append(')');
		return result.toString();
	}

} //GridLayoutImpl
