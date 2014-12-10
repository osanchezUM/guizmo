/**
 */
package guizmo.structure.impl;

import guizmo.structure.GraphicalElement;
import guizmo.structure.StructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#isIsEnabled <em>Is Enabled</em>}</li>
 *   <li>{@link guizmo.structure.impl.GraphicalElementImpl#isIsResizable <em>Is Resizable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraphicalElementImpl extends EObjectImpl implements GraphicalElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BRIEF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected String briefDescription = BRIEF_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean isVisible = IS_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnabled() <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnabled = IS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsResizable() <em>Is Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResizable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESIZABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsResizable() <em>Is Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsResizable()
	 * @generated
	 * @ordered
	 */
	protected boolean isResizable = IS_RESIZABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.GRAPHICAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBriefDescription() {
		return briefDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBriefDescription(String newBriefDescription) {
		String oldBriefDescription = briefDescription;
		briefDescription = newBriefDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVisible() {
		return isVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisible(boolean newIsVisible) {
		boolean oldIsVisible = isVisible;
		isVisible = newIsVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__IS_VISIBLE, oldIsVisible, isVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnabled() {
		return isEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnabled(boolean newIsEnabled) {
		boolean oldIsEnabled = isEnabled;
		isEnabled = newIsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__IS_ENABLED, oldIsEnabled, isEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsResizable() {
		return isResizable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResizable(boolean newIsResizable) {
		boolean oldIsResizable = isResizable;
		isResizable = newIsResizable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.GRAPHICAL_ELEMENT__IS_RESIZABLE, oldIsResizable, isResizable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.GRAPHICAL_ELEMENT__ID:
				return getId();
			case StructurePackage.GRAPHICAL_ELEMENT__NAME:
				return getName();
			case StructurePackage.GRAPHICAL_ELEMENT__DESCRIPTION:
				return getDescription();
			case StructurePackage.GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case StructurePackage.GRAPHICAL_ELEMENT__IS_VISIBLE:
				return isIsVisible();
			case StructurePackage.GRAPHICAL_ELEMENT__IS_ENABLED:
				return isIsEnabled();
			case StructurePackage.GRAPHICAL_ELEMENT__IS_RESIZABLE:
				return isIsResizable();
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
			case StructurePackage.GRAPHICAL_ELEMENT__ID:
				setId((String)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_VISIBLE:
				setIsVisible((Boolean)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_ENABLED:
				setIsEnabled((Boolean)newValue);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_RESIZABLE:
				setIsResizable((Boolean)newValue);
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
			case StructurePackage.GRAPHICAL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_VISIBLE:
				setIsVisible(IS_VISIBLE_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_ENABLED:
				setIsEnabled(IS_ENABLED_EDEFAULT);
				return;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_RESIZABLE:
				setIsResizable(IS_RESIZABLE_EDEFAULT);
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
			case StructurePackage.GRAPHICAL_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StructurePackage.GRAPHICAL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurePackage.GRAPHICAL_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StructurePackage.GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case StructurePackage.GRAPHICAL_ELEMENT__IS_VISIBLE:
				return isVisible != IS_VISIBLE_EDEFAULT;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_ENABLED:
				return isEnabled != IS_ENABLED_EDEFAULT;
			case StructurePackage.GRAPHICAL_ELEMENT__IS_RESIZABLE:
				return isResizable != IS_RESIZABLE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", briefDescription: ");
		result.append(briefDescription);
		result.append(", isVisible: ");
		result.append(isVisible);
		result.append(", isEnabled: ");
		result.append(isEnabled);
		result.append(", isResizable: ");
		result.append(isResizable);
		result.append(')');
		return result.toString();
	}

} //GraphicalElementImpl
