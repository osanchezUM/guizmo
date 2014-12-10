/**
 */
package guizmo.structure.impl;

import guizmo.structure.Linkable;
import guizmo.structure.OutputText;
import guizmo.structure.StructurePackage;
import guizmo.structure.Text;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.OutputTextImpl#isIsHyperlink <em>Is Hyperlink</em>}</li>
 *   <li>{@link guizmo.structure.impl.OutputTextImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link guizmo.structure.impl.OutputTextImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputTextImpl extends SingleWidgetImpl implements OutputText {
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
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.OUTPUT_TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OUTPUT_TEXT__IS_HYPERLINK, oldIsHyperlink, isHyperlink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OUTPUT_TEXT__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.OUTPUT_TEXT__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OUTPUT_TEXT__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.OUTPUT_TEXT__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.OUTPUT_TEXT__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.OUTPUT_TEXT__TEXT:
				return basicSetText(null, msgs);
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
			case StructurePackage.OUTPUT_TEXT__IS_HYPERLINK:
				return isIsHyperlink();
			case StructurePackage.OUTPUT_TEXT__URI:
				return getUri();
			case StructurePackage.OUTPUT_TEXT__TEXT:
				return getText();
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
			case StructurePackage.OUTPUT_TEXT__IS_HYPERLINK:
				setIsHyperlink((Boolean)newValue);
				return;
			case StructurePackage.OUTPUT_TEXT__URI:
				setUri((String)newValue);
				return;
			case StructurePackage.OUTPUT_TEXT__TEXT:
				setText((Text)newValue);
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
			case StructurePackage.OUTPUT_TEXT__IS_HYPERLINK:
				setIsHyperlink(IS_HYPERLINK_EDEFAULT);
				return;
			case StructurePackage.OUTPUT_TEXT__URI:
				setUri(URI_EDEFAULT);
				return;
			case StructurePackage.OUTPUT_TEXT__TEXT:
				setText((Text)null);
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
			case StructurePackage.OUTPUT_TEXT__IS_HYPERLINK:
				return isHyperlink != IS_HYPERLINK_EDEFAULT;
			case StructurePackage.OUTPUT_TEXT__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case StructurePackage.OUTPUT_TEXT__TEXT:
				return text != null;
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
				case StructurePackage.OUTPUT_TEXT__IS_HYPERLINK: return StructurePackage.LINKABLE__IS_HYPERLINK;
				case StructurePackage.OUTPUT_TEXT__URI: return StructurePackage.LINKABLE__URI;
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
				case StructurePackage.LINKABLE__IS_HYPERLINK: return StructurePackage.OUTPUT_TEXT__IS_HYPERLINK;
				case StructurePackage.LINKABLE__URI: return StructurePackage.OUTPUT_TEXT__URI;
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

} //OutputTextImpl
