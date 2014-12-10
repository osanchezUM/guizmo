/**
 */
package guizmo.layout.impl;

import guizmo.layout.AlignmentMark;
import guizmo.layout.Layout;
import guizmo.layout.LayoutPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.AlignmentMarkImpl#getLgap <em>Lgap</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignmentMarkImpl#getLnodes <em>Lnodes</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignmentMarkImpl#getRnodes <em>Rnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignmentMarkImpl extends EObjectImpl implements AlignmentMark {
	/**
	 * The default value of the '{@link #getLgap() <em>Lgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLgap()
	 * @generated
	 * @ordered
	 */
	protected static final float LGAP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLgap() <em>Lgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLgap()
	 * @generated
	 * @ordered
	 */
	protected float lgap = LGAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLnodes() <em>Lnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> lnodes;

	/**
	 * The cached value of the '{@link #getRnodes() <em>Rnodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> rnodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignmentMarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.ALIGNMENT_MARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLgap() {
		return lgap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLgap(float newLgap) {
		float oldLgap = lgap;
		lgap = newLgap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.ALIGNMENT_MARK__LGAP, oldLgap, lgap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getLnodes() {
		if (lnodes == null) {
			lnodes = new EObjectWithInverseResolvingEList<Layout>(Layout.class, this, LayoutPackage.ALIGNMENT_MARK__LNODES, LayoutPackage.LAYOUT__LBORDER);
		}
		return lnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getRnodes() {
		if (rnodes == null) {
			rnodes = new EObjectWithInverseResolvingEList<Layout>(Layout.class, this, LayoutPackage.ALIGNMENT_MARK__RNODES, LayoutPackage.LAYOUT__RBORDER);
		}
		return rnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLnodes()).basicAdd(otherEnd, msgs);
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRnodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				return ((InternalEList<?>)getLnodes()).basicRemove(otherEnd, msgs);
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				return ((InternalEList<?>)getRnodes()).basicRemove(otherEnd, msgs);
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
			case LayoutPackage.ALIGNMENT_MARK__LGAP:
				return getLgap();
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				return getLnodes();
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				return getRnodes();
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
			case LayoutPackage.ALIGNMENT_MARK__LGAP:
				setLgap((Float)newValue);
				return;
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				getLnodes().clear();
				getLnodes().addAll((Collection<? extends Layout>)newValue);
				return;
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				getRnodes().clear();
				getRnodes().addAll((Collection<? extends Layout>)newValue);
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
			case LayoutPackage.ALIGNMENT_MARK__LGAP:
				setLgap(LGAP_EDEFAULT);
				return;
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				getLnodes().clear();
				return;
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				getRnodes().clear();
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
			case LayoutPackage.ALIGNMENT_MARK__LGAP:
				return lgap != LGAP_EDEFAULT;
			case LayoutPackage.ALIGNMENT_MARK__LNODES:
				return lnodes != null && !lnodes.isEmpty();
			case LayoutPackage.ALIGNMENT_MARK__RNODES:
				return rnodes != null && !rnodes.isEmpty();
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
		result.append(" (lgap: ");
		result.append(lgap);
		result.append(')');
		return result.toString();
	}

} //AlignmentMarkImpl
