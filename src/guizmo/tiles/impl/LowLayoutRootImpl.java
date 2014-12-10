/**
 */
package guizmo.tiles.impl;

import guizmo.tiles.LowLayoutRoot;
import guizmo.tiles.Tile;
import guizmo.tiles.TilesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Low Layout Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.tiles.impl.LowLayoutRootImpl#getViewTiles <em>View Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LowLayoutRootImpl extends EObjectImpl implements LowLayoutRoot {
	/**
	 * The cached value of the '{@link #getViewTiles() <em>View Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> viewTiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowLayoutRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TilesPackage.Literals.LOW_LAYOUT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getViewTiles() {
		if (viewTiles == null) {
			viewTiles = new EObjectContainmentEList<Tile>(Tile.class, this, TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES);
		}
		return viewTiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES:
				return ((InternalEList<?>)getViewTiles()).basicRemove(otherEnd, msgs);
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
			case TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES:
				return getViewTiles();
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
			case TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES:
				getViewTiles().clear();
				getViewTiles().addAll((Collection<? extends Tile>)newValue);
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
			case TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES:
				getViewTiles().clear();
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
			case TilesPackage.LOW_LAYOUT_ROOT__VIEW_TILES:
				return viewTiles != null && !viewTiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LowLayoutRootImpl
