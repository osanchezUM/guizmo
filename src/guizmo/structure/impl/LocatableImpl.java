/**
 */
package guizmo.structure.impl;

import guizmo.structure.Locatable;
import guizmo.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locatable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.LocatableImpl#getXmin <em>Xmin</em>}</li>
 *   <li>{@link guizmo.structure.impl.LocatableImpl#getYmin <em>Ymin</em>}</li>
 *   <li>{@link guizmo.structure.impl.LocatableImpl#getXmax <em>Xmax</em>}</li>
 *   <li>{@link guizmo.structure.impl.LocatableImpl#getYmax <em>Ymax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocatableImpl extends EObjectImpl implements Locatable {
	/**
	 * The default value of the '{@link #getXmin() <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmin()
	 * @generated
	 * @ordered
	 */
	protected static final int XMIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXmin() <em>Xmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmin()
	 * @generated
	 * @ordered
	 */
	protected int xmin = XMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmin() <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmin()
	 * @generated
	 * @ordered
	 */
	protected static final int YMIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYmin() <em>Ymin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmin()
	 * @generated
	 * @ordered
	 */
	protected int ymin = YMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmax() <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmax()
	 * @generated
	 * @ordered
	 */
	protected static final int XMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXmax() <em>Xmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmax()
	 * @generated
	 * @ordered
	 */
	protected int xmax = XMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmax() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmax()
	 * @generated
	 * @ordered
	 */
	protected static final int YMAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYmax() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmax()
	 * @generated
	 * @ordered
	 */
	protected int ymax = YMAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.LOCATABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXmin() {
		return xmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmin(int newXmin) {
		int oldXmin = xmin;
		xmin = newXmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LOCATABLE__XMIN, oldXmin, xmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYmin() {
		return ymin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmin(int newYmin) {
		int oldYmin = ymin;
		ymin = newYmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LOCATABLE__YMIN, oldYmin, ymin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXmax() {
		return xmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmax(int newXmax) {
		int oldXmax = xmax;
		xmax = newXmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LOCATABLE__XMAX, oldXmax, xmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYmax() {
		return ymax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmax(int newYmax) {
		int oldYmax = ymax;
		ymax = newYmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LOCATABLE__YMAX, oldYmax, ymax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.LOCATABLE__XMIN:
				return getXmin();
			case StructurePackage.LOCATABLE__YMIN:
				return getYmin();
			case StructurePackage.LOCATABLE__XMAX:
				return getXmax();
			case StructurePackage.LOCATABLE__YMAX:
				return getYmax();
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
			case StructurePackage.LOCATABLE__XMIN:
				setXmin((Integer)newValue);
				return;
			case StructurePackage.LOCATABLE__YMIN:
				setYmin((Integer)newValue);
				return;
			case StructurePackage.LOCATABLE__XMAX:
				setXmax((Integer)newValue);
				return;
			case StructurePackage.LOCATABLE__YMAX:
				setYmax((Integer)newValue);
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
			case StructurePackage.LOCATABLE__XMIN:
				setXmin(XMIN_EDEFAULT);
				return;
			case StructurePackage.LOCATABLE__YMIN:
				setYmin(YMIN_EDEFAULT);
				return;
			case StructurePackage.LOCATABLE__XMAX:
				setXmax(XMAX_EDEFAULT);
				return;
			case StructurePackage.LOCATABLE__YMAX:
				setYmax(YMAX_EDEFAULT);
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
			case StructurePackage.LOCATABLE__XMIN:
				return xmin != XMIN_EDEFAULT;
			case StructurePackage.LOCATABLE__YMIN:
				return ymin != YMIN_EDEFAULT;
			case StructurePackage.LOCATABLE__XMAX:
				return xmax != XMAX_EDEFAULT;
			case StructurePackage.LOCATABLE__YMAX:
				return ymax != YMAX_EDEFAULT;
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
		result.append(" (xmin: ");
		result.append(xmin);
		result.append(", ymin: ");
		result.append(ymin);
		result.append(", xmax: ");
		result.append(xmax);
		result.append(", ymax: ");
		result.append(ymax);
		result.append(')');
		return result.toString();
	}

} //LocatableImpl
