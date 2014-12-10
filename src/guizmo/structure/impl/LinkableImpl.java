/**
 */
package guizmo.structure.impl;

import guizmo.structure.Linkable;
import guizmo.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.LinkableImpl#isIsHyperlink <em>Is Hyperlink</em>}</li>
 *   <li>{@link guizmo.structure.impl.LinkableImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkableImpl extends EObjectImpl implements Linkable {
	/**
	 * The default value of the '{@link #isIsHyperlink() <em>Is Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHyperlink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HYPERLINK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHyperlink() <em>Is Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHyperlink()
	 * @generated
	 * @ordered
	 */
	protected boolean isHyperlink = IS_HYPERLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.LINKABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHyperlink() {
		return isHyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHyperlink(boolean newIsHyperlink) {
		boolean oldIsHyperlink = isHyperlink;
		isHyperlink = newIsHyperlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LINKABLE__IS_HYPERLINK, oldIsHyperlink, isHyperlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.LINKABLE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.LINKABLE__IS_HYPERLINK:
				return isIsHyperlink();
			case StructurePackage.LINKABLE__URI:
				return getUri();
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
			case StructurePackage.LINKABLE__IS_HYPERLINK:
				setIsHyperlink((Boolean)newValue);
				return;
			case StructurePackage.LINKABLE__URI:
				setUri((String)newValue);
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
			case StructurePackage.LINKABLE__IS_HYPERLINK:
				setIsHyperlink(IS_HYPERLINK_EDEFAULT);
				return;
			case StructurePackage.LINKABLE__URI:
				setUri(URI_EDEFAULT);
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
			case StructurePackage.LINKABLE__IS_HYPERLINK:
				return isHyperlink != IS_HYPERLINK_EDEFAULT;
			case StructurePackage.LINKABLE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
		result.append(" (isHyperlink: ");
		result.append(isHyperlink);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //LinkableImpl
