/**
 */
package guizmo.structure.impl;

import guizmo.structure.GraphicalView;
import guizmo.structure.ResourceRepository;
import guizmo.structure.StructurePackage;
import guizmo.structure.StructureRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.structure.impl.StructureRootImpl#getViews <em>Views</em>}</li>
 *   <li>{@link guizmo.structure.impl.StructureRootImpl#getResourceRepository <em>Resource Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureRootImpl extends EObjectImpl implements StructureRoot {
	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalView> views;

	/**
	 * The cached value of the '{@link #getResourceRepository() <em>Resource Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRepository()
	 * @generated
	 * @ordered
	 */
	protected ResourceRepository resourceRepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.STRUCTURE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphicalView> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<GraphicalView>(GraphicalView.class, this, StructurePackage.STRUCTURE_ROOT__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRepository getResourceRepository() {
		return resourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRepository(ResourceRepository newResourceRepository, NotificationChain msgs) {
		ResourceRepository oldResourceRepository = resourceRepository;
		resourceRepository = newResourceRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY, oldResourceRepository, newResourceRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRepository(ResourceRepository newResourceRepository) {
		if (newResourceRepository != resourceRepository) {
			NotificationChain msgs = null;
			if (resourceRepository != null)
				msgs = ((InternalEObject)resourceRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY, null, msgs);
			if (newResourceRepository != null)
				msgs = ((InternalEObject)newResourceRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY, null, msgs);
			msgs = basicSetResourceRepository(newResourceRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY, newResourceRepository, newResourceRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.STRUCTURE_ROOT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY:
				return basicSetResourceRepository(null, msgs);
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
			case StructurePackage.STRUCTURE_ROOT__VIEWS:
				return getViews();
			case StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY:
				return getResourceRepository();
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
			case StructurePackage.STRUCTURE_ROOT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends GraphicalView>)newValue);
				return;
			case StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY:
				setResourceRepository((ResourceRepository)newValue);
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
			case StructurePackage.STRUCTURE_ROOT__VIEWS:
				getViews().clear();
				return;
			case StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY:
				setResourceRepository((ResourceRepository)null);
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
			case StructurePackage.STRUCTURE_ROOT__VIEWS:
				return views != null && !views.isEmpty();
			case StructurePackage.STRUCTURE_ROOT__RESOURCE_REPOSITORY:
				return resourceRepository != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureRootImpl
