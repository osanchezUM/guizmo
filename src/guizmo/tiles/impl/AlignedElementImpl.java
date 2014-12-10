/**
 */
package guizmo.tiles.impl;

import guizmo.tiles.AlignedElement;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.TilesPackage;
import guizmo.tiles.VAlignmentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aligned Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.tiles.impl.AlignedElementImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link guizmo.tiles.impl.AlignedElementImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AlignedElementImpl extends EObjectImpl implements AlignedElement {
	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignmentType VERTICAL_ALIGNMENT_EDEFAULT = VAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignmentType verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HAlignmentType HORIZONTAL_ALIGNMENT_EDEFAULT = HAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected HAlignmentType horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TilesPackage.Literals.ALIGNED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(VAlignmentType newVerticalAlignment) {
		VAlignmentType oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(HAlignmentType newHorizontalAlignment) {
		HAlignmentType oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
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
			case TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT:
				setVerticalAlignment((VAlignmentType)newValue);
				return;
			case TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((HAlignmentType)newValue);
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
			case TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
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
			case TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
			case TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
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
		result.append(" (verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(')');
		return result.toString();
	}

} //AlignedElementImpl
