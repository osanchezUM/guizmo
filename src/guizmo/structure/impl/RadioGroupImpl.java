/**
 */
package guizmo.structure.impl;

import guizmo.structure.Item;
import guizmo.structure.Itemizable;
import guizmo.structure.RadioButton;
import guizmo.structure.RadioGroup;
import guizmo.structure.StructurePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.RadioGroupImpl#getItems <em>Items</em>}</li>
 *   <li>{@link guizmo.structure.impl.RadioGroupImpl#isMultipleSelection <em>Multiple Selection</em>}</li>
 *   <li>{@link guizmo.structure.impl.RadioGroupImpl#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioGroupImpl extends SingleWidgetImpl implements RadioGroup {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleSelection = MULTIPLE_SELECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> selected;

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
		return StructurePackage.Literals.RADIO_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, StructurePackage.RADIO_GROUP__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleSelection() {
		return multipleSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleSelection(boolean newMultipleSelection) {
		boolean oldMultipleSelection = multipleSelection;
		multipleSelection = newMultipleSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.RADIO_GROUP__MULTIPLE_SELECTION, oldMultipleSelection, multipleSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getSelected() {
		if (selected == null) {
			selected = new EObjectResolvingEList<Item>(Item.class, this, StructurePackage.RADIO_GROUP__SELECTED);
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.RADIO_GROUP__ITEMS:
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
			case StructurePackage.RADIO_GROUP__ITEMS:
				return getItems();
			case StructurePackage.RADIO_GROUP__MULTIPLE_SELECTION:
				return isMultipleSelection();
			case StructurePackage.RADIO_GROUP__SELECTED:
				return getSelected();
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
			case StructurePackage.RADIO_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case StructurePackage.RADIO_GROUP__MULTIPLE_SELECTION:
				setMultipleSelection((Boolean)newValue);
				return;
			case StructurePackage.RADIO_GROUP__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends Item>)newValue);
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
			case StructurePackage.RADIO_GROUP__ITEMS:
				getItems().clear();
				return;
			case StructurePackage.RADIO_GROUP__MULTIPLE_SELECTION:
				setMultipleSelection(MULTIPLE_SELECTION_EDEFAULT);
				return;
			case StructurePackage.RADIO_GROUP__SELECTED:
				getSelected().clear();
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
			case StructurePackage.RADIO_GROUP__ITEMS:
				return items != null && !items.isEmpty();
			case StructurePackage.RADIO_GROUP__MULTIPLE_SELECTION:
				return multipleSelection != MULTIPLE_SELECTION_EDEFAULT;
			case StructurePackage.RADIO_GROUP__SELECTED:
				return selected != null && !selected.isEmpty();
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
		if (baseClass == Itemizable.class) {
			switch (derivedFeatureID) {
				case StructurePackage.RADIO_GROUP__ITEMS: return StructurePackage.ITEMIZABLE__ITEMS;
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
		if (baseClass == Itemizable.class) {
			switch (baseFeatureID) {
				case StructurePackage.ITEMIZABLE__ITEMS: return StructurePackage.RADIO_GROUP__ITEMS;
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
		result.append(" (multipleSelection: ");
		result.append(multipleSelection);
		result.append(')');
		return result.toString();
	}

} //RadioGroupImpl
