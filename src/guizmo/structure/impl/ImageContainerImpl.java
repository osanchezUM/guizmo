/**
 */
package guizmo.structure.impl;

import guizmo.structure.Image;
import guizmo.structure.ImageContainer;
import guizmo.structure.Linkable;
import guizmo.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.ImageContainerImpl#isIsHyperlink <em>Is Hyperlink</em>}</li>
 *   <li>{@link guizmo.structure.impl.ImageContainerImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link guizmo.structure.impl.ImageContainerImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageContainerImpl extends SingleWidgetImpl implements ImageContainer {
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
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.IMAGE_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK, oldIsHyperlink, isHyperlink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.IMAGE_CONTAINER__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.IMAGE_CONTAINER__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.IMAGE_CONTAINER__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.IMAGE_CONTAINER__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.IMAGE_CONTAINER__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.IMAGE_CONTAINER__IMAGE:
				return basicSetImage(null, msgs);
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
			case StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK:
				return isIsHyperlink();
			case StructurePackage.IMAGE_CONTAINER__URI:
				return getUri();
			case StructurePackage.IMAGE_CONTAINER__IMAGE:
				return getImage();
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
			case StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK:
				setIsHyperlink((Boolean)newValue);
				return;
			case StructurePackage.IMAGE_CONTAINER__URI:
				setUri((String)newValue);
				return;
			case StructurePackage.IMAGE_CONTAINER__IMAGE:
				setImage((Image)newValue);
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
			case StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK:
				setIsHyperlink(IS_HYPERLINK_EDEFAULT);
				return;
			case StructurePackage.IMAGE_CONTAINER__URI:
				setUri(URI_EDEFAULT);
				return;
			case StructurePackage.IMAGE_CONTAINER__IMAGE:
				setImage((Image)null);
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
			case StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK:
				return isHyperlink != IS_HYPERLINK_EDEFAULT;
			case StructurePackage.IMAGE_CONTAINER__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case StructurePackage.IMAGE_CONTAINER__IMAGE:
				return image != null;
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
		if (baseClass == Linkable.class) {
			switch (derivedFeatureID) {
				case StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK: return StructurePackage.LINKABLE__IS_HYPERLINK;
				case StructurePackage.IMAGE_CONTAINER__URI: return StructurePackage.LINKABLE__URI;
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
		if (baseClass == Linkable.class) {
			switch (baseFeatureID) {
				case StructurePackage.LINKABLE__IS_HYPERLINK: return StructurePackage.IMAGE_CONTAINER__IS_HYPERLINK;
				case StructurePackage.LINKABLE__URI: return StructurePackage.IMAGE_CONTAINER__URI;
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
		result.append(" (isHyperlink: ");
		result.append(isHyperlink);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ImageContainerImpl
