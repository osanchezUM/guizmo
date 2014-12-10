/**
 */
package lasser.sketch.impl;

import java.util.Collection;
import lasser.sketch.RadioButton;
import lasser.sketch.RadioGroup;
import lasser.sketch.SketchPackage;

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
 * An implementation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lasser.sketch.impl.RadioGroupImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link lasser.sketch.impl.RadioGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioGroupImpl extends WidgetImpl implements RadioGroup {
	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected RadioButton selected;
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<RadioButton> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SketchPackage.Literals.RADIO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton getSelected() {
		if (selected != null && selected.eIsProxy()) {
			InternalEObject oldSelected = (InternalEObject)selected;
			selected = (RadioButton)eResolveProxy(oldSelected);
			if (selected != oldSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SketchPackage.RADIO_GROUP__SELECTED, oldSelected, selected));
			}
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton basicGetSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(RadioButton newSelected) {
		RadioButton oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.RADIO_GROUP__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RadioButton> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<RadioButton>(RadioButton.class, this, SketchPackage.RADIO_GROUP__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SketchPackage.RADIO_GROUP__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case SketchPackage.RADIO_GROUP__SELECTED:
				if (resolve) return getSelected();
				return basicGetSelected();
			case SketchPackage.RADIO_GROUP__ITEMS:
				return getItems();
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
			case SketchPackage.RADIO_GROUP__SELECTED:
				setSelected((RadioButton)newValue);
				return;
			case SketchPackage.RADIO_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends RadioButton>)newValue);
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
			case SketchPackage.RADIO_GROUP__SELECTED:
				setSelected((RadioButton)null);
				return;
			case SketchPackage.RADIO_GROUP__ITEMS:
				getItems().clear();
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
			case SketchPackage.RADIO_GROUP__SELECTED:
				return selected != null;
			case SketchPackage.RADIO_GROUP__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RadioGroupImpl
