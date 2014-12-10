/**
 */
package guizmo.layout.impl;

import guizmo.layout.AlignedColumn;
import guizmo.layout.ElementNode;
import guizmo.layout.LayoutPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aligned Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.AlignedColumnImpl#getLgap <em>Lgap</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignedColumnImpl#getRgap <em>Rgap</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignedColumnImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignedColumnImpl#getLeftNodes <em>Left Nodes</em>}</li>
 *   <li>{@link guizmo.layout.impl.AlignedColumnImpl#getRightNodes <em>Right Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlignedColumnImpl extends EObjectImpl implements AlignedColumn {
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
	 * The default value of the '{@link #getRgap() <em>Rgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgap()
	 * @generated
	 * @ordered
	 */
	protected static final float RGAP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRgap() <em>Rgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgap()
	 * @generated
	 * @ordered
	 */
	protected float rgap = RGAP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNode> nodes;

	/**
	 * The cached value of the '{@link #getLeftNodes() <em>Left Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNode> leftNodes;

	/**
	 * The cached value of the '{@link #getRightNodes() <em>Right Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementNode> rightNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlignedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.ALIGNED_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.ALIGNED_COLUMN__LGAP, oldLgap, lgap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRgap() {
		return rgap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRgap(float newRgap) {
		float oldRgap = rgap;
		rgap = newRgap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.ALIGNED_COLUMN__RGAP, oldRgap, rgap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<ElementNode>(ElementNode.class, this, LayoutPackage.ALIGNED_COLUMN__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNode> getLeftNodes() {
		if (leftNodes == null) {
			leftNodes = new EObjectResolvingEList<ElementNode>(ElementNode.class, this, LayoutPackage.ALIGNED_COLUMN__LEFT_NODES);
		}
		return leftNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementNode> getRightNodes() {
		if (rightNodes == null) {
			rightNodes = new EObjectResolvingEList<ElementNode>(ElementNode.class, this, LayoutPackage.ALIGNED_COLUMN__RIGHT_NODES);
		}
		return rightNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.ALIGNED_COLUMN__LGAP:
				return getLgap();
			case LayoutPackage.ALIGNED_COLUMN__RGAP:
				return getRgap();
			case LayoutPackage.ALIGNED_COLUMN__NODES:
				return getNodes();
			case LayoutPackage.ALIGNED_COLUMN__LEFT_NODES:
				return getLeftNodes();
			case LayoutPackage.ALIGNED_COLUMN__RIGHT_NODES:
				return getRightNodes();
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
			case LayoutPackage.ALIGNED_COLUMN__LGAP:
				setLgap((Float)newValue);
				return;
			case LayoutPackage.ALIGNED_COLUMN__RGAP:
				setRgap((Float)newValue);
				return;
			case LayoutPackage.ALIGNED_COLUMN__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ElementNode>)newValue);
				return;
			case LayoutPackage.ALIGNED_COLUMN__LEFT_NODES:
				getLeftNodes().clear();
				getLeftNodes().addAll((Collection<? extends ElementNode>)newValue);
				return;
			case LayoutPackage.ALIGNED_COLUMN__RIGHT_NODES:
				getRightNodes().clear();
				getRightNodes().addAll((Collection<? extends ElementNode>)newValue);
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
			case LayoutPackage.ALIGNED_COLUMN__LGAP:
				setLgap(LGAP_EDEFAULT);
				return;
			case LayoutPackage.ALIGNED_COLUMN__RGAP:
				setRgap(RGAP_EDEFAULT);
				return;
			case LayoutPackage.ALIGNED_COLUMN__NODES:
				getNodes().clear();
				return;
			case LayoutPackage.ALIGNED_COLUMN__LEFT_NODES:
				getLeftNodes().clear();
				return;
			case LayoutPackage.ALIGNED_COLUMN__RIGHT_NODES:
				getRightNodes().clear();
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
			case LayoutPackage.ALIGNED_COLUMN__LGAP:
				return lgap != LGAP_EDEFAULT;
			case LayoutPackage.ALIGNED_COLUMN__RGAP:
				return rgap != RGAP_EDEFAULT;
			case LayoutPackage.ALIGNED_COLUMN__NODES:
				return nodes != null && !nodes.isEmpty();
			case LayoutPackage.ALIGNED_COLUMN__LEFT_NODES:
				return leftNodes != null && !leftNodes.isEmpty();
			case LayoutPackage.ALIGNED_COLUMN__RIGHT_NODES:
				return rightNodes != null && !rightNodes.isEmpty();
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
		result.append(", rgap: ");
		result.append(rgap);
		result.append(')');
		return result.toString();
	}

} //AlignedColumnImpl
