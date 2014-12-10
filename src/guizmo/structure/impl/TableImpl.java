/**
 */
package guizmo.structure.impl;

import guizmo.structure.GraphicalResource;
import guizmo.structure.SingleWidget;
import guizmo.structure.StructurePackage;
import guizmo.structure.Table;

import guizmo.structure.TableRow;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.TableImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link guizmo.structure.impl.TableImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link guizmo.structure.impl.TableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends SingleWidgetImpl implements Table {
	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalResource> headers;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleWidget> types;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicalResource> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<GraphicalResource>(GraphicalResource.class, this, StructurePackage.TABLE__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleWidget> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<SingleWidget>(SingleWidget.class, this, StructurePackage.TABLE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<TableRow>(TableRow.class, this, StructurePackage.TABLE__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.TABLE__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case StructurePackage.TABLE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case StructurePackage.TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.TABLE__HEADERS:
				return getHeaders();
			case StructurePackage.TABLE__TYPES:
				return getTypes();
			case StructurePackage.TABLE__ROWS:
				return getRows();
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
			case StructurePackage.TABLE__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends GraphicalResource>)newValue);
				return;
			case StructurePackage.TABLE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends SingleWidget>)newValue);
				return;
			case StructurePackage.TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends TableRow>)newValue);
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
			case StructurePackage.TABLE__HEADERS:
				getHeaders().clear();
				return;
			case StructurePackage.TABLE__TYPES:
				getTypes().clear();
				return;
			case StructurePackage.TABLE__ROWS:
				getRows().clear();
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
			case StructurePackage.TABLE__HEADERS:
				return headers != null && !headers.isEmpty();
			case StructurePackage.TABLE__TYPES:
				return types != null && !types.isEmpty();
			case StructurePackage.TABLE__ROWS:
				return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
