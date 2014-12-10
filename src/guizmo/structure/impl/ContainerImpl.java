/**
 */
package guizmo.structure.impl;

import guizmo.structure.ComposableWidget;
import guizmo.structure.Container;
import guizmo.structure.Locatable;
import guizmo.structure.StructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.ContainerImpl#getXmin <em>Xmin</em>}</li>
 *   <li>{@link guizmo.structure.impl.ContainerImpl#getYmin <em>Ymin</em>}</li>
 *   <li>{@link guizmo.structure.impl.ContainerImpl#getXmax <em>Xmax</em>}</li>
 *   <li>{@link guizmo.structure.impl.ContainerImpl#getYmax <em>Ymax</em>}</li>
 *   <li>{@link guizmo.structure.impl.ContainerImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContainerImpl extends GraphicalElementImpl implements Container {
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
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<ComposableWidget> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__XMIN, oldXmin, xmin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__YMIN, oldYmin, ymin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__XMAX, oldXmax, xmax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.CONTAINER__YMAX, oldYmax, ymax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComposableWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<ComposableWidget>(ComposableWidget.class, this, StructurePackage.CONTAINER__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.CONTAINER__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.CONTAINER__XMIN:
				return getXmin();
			case StructurePackage.CONTAINER__YMIN:
				return getYmin();
			case StructurePackage.CONTAINER__XMAX:
				return getXmax();
			case StructurePackage.CONTAINER__YMAX:
				return getYmax();
			case StructurePackage.CONTAINER__WIDGETS:
				return getWidgets();
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
			case StructurePackage.CONTAINER__XMIN:
				setXmin((Integer)newValue);
				return;
			case StructurePackage.CONTAINER__YMIN:
				setYmin((Integer)newValue);
				return;
			case StructurePackage.CONTAINER__XMAX:
				setXmax((Integer)newValue);
				return;
			case StructurePackage.CONTAINER__YMAX:
				setYmax((Integer)newValue);
				return;
			case StructurePackage.CONTAINER__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends ComposableWidget>)newValue);
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
			case StructurePackage.CONTAINER__XMIN:
				setXmin(XMIN_EDEFAULT);
				return;
			case StructurePackage.CONTAINER__YMIN:
				setYmin(YMIN_EDEFAULT);
				return;
			case StructurePackage.CONTAINER__XMAX:
				setXmax(XMAX_EDEFAULT);
				return;
			case StructurePackage.CONTAINER__YMAX:
				setYmax(YMAX_EDEFAULT);
				return;
			case StructurePackage.CONTAINER__WIDGETS:
				getWidgets().clear();
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
			case StructurePackage.CONTAINER__XMIN:
				return xmin != XMIN_EDEFAULT;
			case StructurePackage.CONTAINER__YMIN:
				return ymin != YMIN_EDEFAULT;
			case StructurePackage.CONTAINER__XMAX:
				return xmax != XMAX_EDEFAULT;
			case StructurePackage.CONTAINER__YMAX:
				return ymax != YMAX_EDEFAULT;
			case StructurePackage.CONTAINER__WIDGETS:
				return widgets != null && !widgets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Locatable.class) {
			switch (derivedFeatureID) {
				case StructurePackage.CONTAINER__XMIN: return StructurePackage.LOCATABLE__XMIN;
				case StructurePackage.CONTAINER__YMIN: return StructurePackage.LOCATABLE__YMIN;
				case StructurePackage.CONTAINER__XMAX: return StructurePackage.LOCATABLE__XMAX;
				case StructurePackage.CONTAINER__YMAX: return StructurePackage.LOCATABLE__YMAX;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Locatable.class) {
			switch (baseFeatureID) {
				case StructurePackage.LOCATABLE__XMIN: return StructurePackage.CONTAINER__XMIN;
				case StructurePackage.LOCATABLE__YMIN: return StructurePackage.CONTAINER__YMIN;
				case StructurePackage.LOCATABLE__XMAX: return StructurePackage.CONTAINER__XMAX;
				case StructurePackage.LOCATABLE__YMAX: return StructurePackage.CONTAINER__YMAX;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //ContainerImpl
