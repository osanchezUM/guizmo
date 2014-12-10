/**
 */
package guizmo.layout.impl;

import guizmo.layout.BorderLayout;
import guizmo.layout.Layout;
import guizmo.layout.LayoutPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.BorderLayoutImpl#getTop <em>Top</em>}</li>
 *   <li>{@link guizmo.layout.impl.BorderLayoutImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link guizmo.layout.impl.BorderLayoutImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link guizmo.layout.impl.BorderLayoutImpl#getRight <em>Right</em>}</li>
 *   <li>{@link guizmo.layout.impl.BorderLayoutImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderLayoutImpl extends LayoutImpl implements BorderLayout {
	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Layout top;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Layout left;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected Layout center;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Layout right;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected Layout bottom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.BORDER_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getTop() {
		if (top != null && top.eIsProxy()) {
			InternalEObject oldTop = (InternalEObject)top;
			top = (Layout)eResolveProxy(oldTop);
			if (top != oldTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BORDER_LAYOUT__TOP, oldTop, top));
			}
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Layout newTop) {
		Layout oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BORDER_LAYOUT__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (Layout)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BORDER_LAYOUT__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Layout newLeft) {
		Layout oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BORDER_LAYOUT__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getCenter() {
		if (center != null && center.eIsProxy()) {
			InternalEObject oldCenter = (InternalEObject)center;
			center = (Layout)eResolveProxy(oldCenter);
			if (center != oldCenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BORDER_LAYOUT__CENTER, oldCenter, center));
			}
		}
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(Layout newCenter) {
		Layout oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BORDER_LAYOUT__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (Layout)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BORDER_LAYOUT__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Layout newRight) {
		Layout oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BORDER_LAYOUT__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getBottom() {
		if (bottom != null && bottom.eIsProxy()) {
			InternalEObject oldBottom = (InternalEObject)bottom;
			bottom = (Layout)eResolveProxy(oldBottom);
			if (bottom != oldBottom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.BORDER_LAYOUT__BOTTOM, oldBottom, bottom));
			}
		}
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(Layout newBottom) {
		Layout oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.BORDER_LAYOUT__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.BORDER_LAYOUT__TOP:
				if (resolve) return getTop();
				return basicGetTop();
			case LayoutPackage.BORDER_LAYOUT__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case LayoutPackage.BORDER_LAYOUT__CENTER:
				if (resolve) return getCenter();
				return basicGetCenter();
			case LayoutPackage.BORDER_LAYOUT__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case LayoutPackage.BORDER_LAYOUT__BOTTOM:
				if (resolve) return getBottom();
				return basicGetBottom();
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
			case LayoutPackage.BORDER_LAYOUT__TOP:
				setTop((Layout)newValue);
				return;
			case LayoutPackage.BORDER_LAYOUT__LEFT:
				setLeft((Layout)newValue);
				return;
			case LayoutPackage.BORDER_LAYOUT__CENTER:
				setCenter((Layout)newValue);
				return;
			case LayoutPackage.BORDER_LAYOUT__RIGHT:
				setRight((Layout)newValue);
				return;
			case LayoutPackage.BORDER_LAYOUT__BOTTOM:
				setBottom((Layout)newValue);
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
			case LayoutPackage.BORDER_LAYOUT__TOP:
				setTop((Layout)null);
				return;
			case LayoutPackage.BORDER_LAYOUT__LEFT:
				setLeft((Layout)null);
				return;
			case LayoutPackage.BORDER_LAYOUT__CENTER:
				setCenter((Layout)null);
				return;
			case LayoutPackage.BORDER_LAYOUT__RIGHT:
				setRight((Layout)null);
				return;
			case LayoutPackage.BORDER_LAYOUT__BOTTOM:
				setBottom((Layout)null);
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
			case LayoutPackage.BORDER_LAYOUT__TOP:
				return top != null;
			case LayoutPackage.BORDER_LAYOUT__LEFT:
				return left != null;
			case LayoutPackage.BORDER_LAYOUT__CENTER:
				return center != null;
			case LayoutPackage.BORDER_LAYOUT__RIGHT:
				return right != null;
			case LayoutPackage.BORDER_LAYOUT__BOTTOM:
				return bottom != null;
		}
		return super.eIsSet(featureID);
	}

} //BorderLayoutImpl
