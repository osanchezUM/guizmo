/**
 */
package guizmo.layout.impl;

import guizmo.layout.AlignmentMark;
import guizmo.layout.Gap;
import guizmo.layout.HAlignmentType;
import guizmo.layout.Layout;
import guizmo.layout.LayoutInfoTreeNode;
import guizmo.layout.LayoutPackage;
import guizmo.layout.Margin;
import guizmo.layout.NodeLine;
import guizmo.layout.VAlignmentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getSublayouts <em>Sublayouts</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getParentLayout <em>Parent Layout</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getRefNode <em>Ref Node</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getAbsHAlignment <em>Abs HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getAbsVAlignment <em>Abs VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getContentHAlignment <em>Content HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getContentVAlignment <em>Content VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getParentHAlignment <em>Parent HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getParentVAlignment <em>Parent VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getHSize <em>HSize</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getVSize <em>VSize</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getFitness <em>Fitness</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getGaps <em>Gaps</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getRefGaps <em>Ref Gaps</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getMargins <em>Margins</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getLborder <em>Lborder</em>}</li>
 *   <li>{@link guizmo.layout.impl.LayoutImpl#getRborder <em>Rborder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayoutImpl extends NamedElementImpl implements Layout {
	/**
	 * The cached value of the '{@link #getSublayouts() <em>Sublayouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSublayouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> sublayouts;

	/**
	 * The cached value of the '{@link #getRefNode() <em>Ref Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefNode()
	 * @generated
	 * @ordered
	 */
	protected LayoutInfoTreeNode refNode;

	/**
	 * The default value of the '{@link #getAbsHAlignment() <em>Abs HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsHAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HAlignmentType ABS_HALIGNMENT_EDEFAULT = HAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getAbsHAlignment() <em>Abs HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsHAlignment()
	 * @generated
	 * @ordered
	 */
	protected HAlignmentType absHAlignment = ABS_HALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsVAlignment() <em>Abs VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsVAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignmentType ABS_VALIGNMENT_EDEFAULT = VAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getAbsVAlignment() <em>Abs VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsVAlignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignmentType absVAlignment = ABS_VALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentHAlignment() <em>Content HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HAlignmentType CONTENT_HALIGNMENT_EDEFAULT = HAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getContentHAlignment() <em>Content HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentHAlignment()
	 * @generated
	 * @ordered
	 */
	protected HAlignmentType contentHAlignment = CONTENT_HALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentVAlignment() <em>Content VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignmentType CONTENT_VALIGNMENT_EDEFAULT = VAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getContentVAlignment() <em>Content VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVAlignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignmentType contentVAlignment = CONTENT_VALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentHAlignment() <em>Parent HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentHAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HAlignmentType PARENT_HALIGNMENT_EDEFAULT = HAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getParentHAlignment() <em>Parent HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentHAlignment()
	 * @generated
	 * @ordered
	 */
	protected HAlignmentType parentHAlignment = PARENT_HALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentVAlignment() <em>Parent VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignmentType PARENT_VALIGNMENT_EDEFAULT = VAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getParentVAlignment() <em>Parent VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVAlignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignmentType parentVAlignment = PARENT_VALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHSize() <em>HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSize()
	 * @generated
	 * @ordered
	 */
	protected static final float HSIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHSize() <em>HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSize()
	 * @generated
	 * @ordered
	 */
	protected float hSize = HSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSize() <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSize()
	 * @generated
	 * @ordered
	 */
	protected static final float VSIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVSize() <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSize()
	 * @generated
	 * @ordered
	 */
	protected float vSize = VSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFitness() <em>Fitness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitness()
	 * @generated
	 * @ordered
	 */
	protected static final float FITNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFitness() <em>Fitness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFitness()
	 * @generated
	 * @ordered
	 */
	protected float fitness = FITNESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGaps() <em>Gaps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGaps()
	 * @generated
	 * @ordered
	 */
	protected EList<Gap> gaps;

	/**
	 * The cached value of the '{@link #getRefGaps() <em>Ref Gaps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefGaps()
	 * @generated
	 * @ordered
	 */
	protected EList<Gap> refGaps;

	/**
	 * The cached value of the '{@link #getMargins() <em>Margins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargins()
	 * @generated
	 * @ordered
	 */
	protected EList<Margin> margins;

	/**
	 * The cached value of the '{@link #getLborder() <em>Lborder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLborder()
	 * @generated
	 * @ordered
	 */
	protected AlignmentMark lborder;

	/**
	 * The cached value of the '{@link #getRborder() <em>Rborder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRborder()
	 * @generated
	 * @ordered
	 */
	protected AlignmentMark rborder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getSublayouts() {
		if (sublayouts == null) {
			sublayouts = new EObjectContainmentWithInverseEList<Layout>(Layout.class, this, LayoutPackage.LAYOUT__SUBLAYOUTS, LayoutPackage.LAYOUT__PARENT_LAYOUT);
		}
		return sublayouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getParentLayout() {
		if (eContainerFeatureID() != LayoutPackage.LAYOUT__PARENT_LAYOUT) return null;
		return (Layout)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentLayout(Layout newParentLayout, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentLayout, LayoutPackage.LAYOUT__PARENT_LAYOUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentLayout(Layout newParentLayout) {
		if (newParentLayout != eInternalContainer() || (eContainerFeatureID() != LayoutPackage.LAYOUT__PARENT_LAYOUT && newParentLayout != null)) {
			if (EcoreUtil.isAncestor(this, newParentLayout))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentLayout != null)
				msgs = ((InternalEObject)newParentLayout).eInverseAdd(this, LayoutPackage.LAYOUT__SUBLAYOUTS, Layout.class, msgs);
			msgs = basicSetParentLayout(newParentLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__PARENT_LAYOUT, newParentLayout, newParentLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInfoTreeNode getRefNode() {
		if (refNode != null && refNode.eIsProxy()) {
			InternalEObject oldRefNode = (InternalEObject)refNode;
			refNode = (LayoutInfoTreeNode)eResolveProxy(oldRefNode);
			if (refNode != oldRefNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.LAYOUT__REF_NODE, oldRefNode, refNode));
			}
		}
		return refNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInfoTreeNode basicGetRefNode() {
		return refNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefNode(LayoutInfoTreeNode newRefNode, NotificationChain msgs) {
		LayoutInfoTreeNode oldRefNode = refNode;
		refNode = newRefNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__REF_NODE, oldRefNode, newRefNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefNode(LayoutInfoTreeNode newRefNode) {
		if (newRefNode != refNode) {
			NotificationChain msgs = null;
			if (refNode != null)
				msgs = ((InternalEObject)refNode).eInverseRemove(this, LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY, LayoutInfoTreeNode.class, msgs);
			if (newRefNode != null)
				msgs = ((InternalEObject)newRefNode).eInverseAdd(this, LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY, LayoutInfoTreeNode.class, msgs);
			msgs = basicSetRefNode(newRefNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__REF_NODE, newRefNode, newRefNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType getAbsHAlignment() {
		return absHAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsHAlignment(HAlignmentType newAbsHAlignment) {
		HAlignmentType oldAbsHAlignment = absHAlignment;
		absHAlignment = newAbsHAlignment == null ? ABS_HALIGNMENT_EDEFAULT : newAbsHAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__ABS_HALIGNMENT, oldAbsHAlignment, absHAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType getAbsVAlignment() {
		return absVAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsVAlignment(VAlignmentType newAbsVAlignment) {
		VAlignmentType oldAbsVAlignment = absVAlignment;
		absVAlignment = newAbsVAlignment == null ? ABS_VALIGNMENT_EDEFAULT : newAbsVAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__ABS_VALIGNMENT, oldAbsVAlignment, absVAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType getContentHAlignment() {
		return contentHAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentHAlignment(HAlignmentType newContentHAlignment) {
		HAlignmentType oldContentHAlignment = contentHAlignment;
		contentHAlignment = newContentHAlignment == null ? CONTENT_HALIGNMENT_EDEFAULT : newContentHAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__CONTENT_HALIGNMENT, oldContentHAlignment, contentHAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType getContentVAlignment() {
		return contentVAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVAlignment(VAlignmentType newContentVAlignment) {
		VAlignmentType oldContentVAlignment = contentVAlignment;
		contentVAlignment = newContentVAlignment == null ? CONTENT_VALIGNMENT_EDEFAULT : newContentVAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__CONTENT_VALIGNMENT, oldContentVAlignment, contentVAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType getParentHAlignment() {
		return parentHAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHAlignment(HAlignmentType newParentHAlignment) {
		HAlignmentType oldParentHAlignment = parentHAlignment;
		parentHAlignment = newParentHAlignment == null ? PARENT_HALIGNMENT_EDEFAULT : newParentHAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__PARENT_HALIGNMENT, oldParentHAlignment, parentHAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType getParentVAlignment() {
		return parentVAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVAlignment(VAlignmentType newParentVAlignment) {
		VAlignmentType oldParentVAlignment = parentVAlignment;
		parentVAlignment = newParentVAlignment == null ? PARENT_VALIGNMENT_EDEFAULT : newParentVAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__PARENT_VALIGNMENT, oldParentVAlignment, parentVAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHSize() {
		return hSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHSize(float newHSize) {
		float oldHSize = hSize;
		hSize = newHSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__HSIZE, oldHSize, hSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVSize() {
		return vSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSize(float newVSize) {
		float oldVSize = vSize;
		vSize = newVSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__VSIZE, oldVSize, vSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFitness() {
		return fitness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFitness(float newFitness) {
		float oldFitness = fitness;
		fitness = newFitness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__FITNESS, oldFitness, fitness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gap> getGaps() {
		if (gaps == null) {
			gaps = new EObjectContainmentEList<Gap>(Gap.class, this, LayoutPackage.LAYOUT__GAPS);
		}
		return gaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gap> getRefGaps() {
		if (refGaps == null) {
			refGaps = new EObjectWithInverseResolvingEList.ManyInverse<Gap>(Gap.class, this, LayoutPackage.LAYOUT__REF_GAPS, LayoutPackage.GAP__LAYOUTS);
		}
		return refGaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Margin> getMargins() {
		if (margins == null) {
			margins = new EObjectContainmentEList<Margin>(Margin.class, this, LayoutPackage.LAYOUT__MARGINS);
		}
		return margins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentMark getLborder() {
		if (lborder != null && lborder.eIsProxy()) {
			InternalEObject oldLborder = (InternalEObject)lborder;
			lborder = (AlignmentMark)eResolveProxy(oldLborder);
			if (lborder != oldLborder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.LAYOUT__LBORDER, oldLborder, lborder));
			}
		}
		return lborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentMark basicGetLborder() {
		return lborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLborder(AlignmentMark newLborder, NotificationChain msgs) {
		AlignmentMark oldLborder = lborder;
		lborder = newLborder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__LBORDER, oldLborder, newLborder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLborder(AlignmentMark newLborder) {
		if (newLborder != lborder) {
			NotificationChain msgs = null;
			if (lborder != null)
				msgs = ((InternalEObject)lborder).eInverseRemove(this, LayoutPackage.ALIGNMENT_MARK__LNODES, AlignmentMark.class, msgs);
			if (newLborder != null)
				msgs = ((InternalEObject)newLborder).eInverseAdd(this, LayoutPackage.ALIGNMENT_MARK__LNODES, AlignmentMark.class, msgs);
			msgs = basicSetLborder(newLborder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__LBORDER, newLborder, newLborder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentMark getRborder() {
		if (rborder != null && rborder.eIsProxy()) {
			InternalEObject oldRborder = (InternalEObject)rborder;
			rborder = (AlignmentMark)eResolveProxy(oldRborder);
			if (rborder != oldRborder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutPackage.LAYOUT__RBORDER, oldRborder, rborder));
			}
		}
		return rborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentMark basicGetRborder() {
		return rborder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRborder(AlignmentMark newRborder, NotificationChain msgs) {
		AlignmentMark oldRborder = rborder;
		rborder = newRborder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__RBORDER, oldRborder, newRborder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRborder(AlignmentMark newRborder) {
		if (newRborder != rborder) {
			NotificationChain msgs = null;
			if (rborder != null)
				msgs = ((InternalEObject)rborder).eInverseRemove(this, LayoutPackage.ALIGNMENT_MARK__RNODES, AlignmentMark.class, msgs);
			if (newRborder != null)
				msgs = ((InternalEObject)newRborder).eInverseAdd(this, LayoutPackage.ALIGNMENT_MARK__RNODES, AlignmentMark.class, msgs);
			msgs = basicSetRborder(newRborder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.LAYOUT__RBORDER, newRborder, newRborder));
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
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSublayouts()).basicAdd(otherEnd, msgs);
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentLayout((Layout)otherEnd, msgs);
			case LayoutPackage.LAYOUT__REF_NODE:
				if (refNode != null)
					msgs = ((InternalEObject)refNode).eInverseRemove(this, LayoutPackage.LAYOUT_INFO_TREE_NODE__REFERRED_BY, LayoutInfoTreeNode.class, msgs);
				return basicSetRefNode((LayoutInfoTreeNode)otherEnd, msgs);
			case LayoutPackage.LAYOUT__REF_GAPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefGaps()).basicAdd(otherEnd, msgs);
			case LayoutPackage.LAYOUT__LBORDER:
				if (lborder != null)
					msgs = ((InternalEObject)lborder).eInverseRemove(this, LayoutPackage.ALIGNMENT_MARK__LNODES, AlignmentMark.class, msgs);
				return basicSetLborder((AlignmentMark)otherEnd, msgs);
			case LayoutPackage.LAYOUT__RBORDER:
				if (rborder != null)
					msgs = ((InternalEObject)rborder).eInverseRemove(this, LayoutPackage.ALIGNMENT_MARK__RNODES, AlignmentMark.class, msgs);
				return basicSetRborder((AlignmentMark)otherEnd, msgs);
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
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				return ((InternalEList<?>)getSublayouts()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				return basicSetParentLayout(null, msgs);
			case LayoutPackage.LAYOUT__REF_NODE:
				return basicSetRefNode(null, msgs);
			case LayoutPackage.LAYOUT__GAPS:
				return ((InternalEList<?>)getGaps()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT__REF_GAPS:
				return ((InternalEList<?>)getRefGaps()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT__MARGINS:
				return ((InternalEList<?>)getMargins()).basicRemove(otherEnd, msgs);
			case LayoutPackage.LAYOUT__LBORDER:
				return basicSetLborder(null, msgs);
			case LayoutPackage.LAYOUT__RBORDER:
				return basicSetRborder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				return eInternalContainer().eInverseRemove(this, LayoutPackage.LAYOUT__SUBLAYOUTS, Layout.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				return getSublayouts();
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				return getParentLayout();
			case LayoutPackage.LAYOUT__REF_NODE:
				if (resolve) return getRefNode();
				return basicGetRefNode();
			case LayoutPackage.LAYOUT__ABS_HALIGNMENT:
				return getAbsHAlignment();
			case LayoutPackage.LAYOUT__ABS_VALIGNMENT:
				return getAbsVAlignment();
			case LayoutPackage.LAYOUT__CONTENT_HALIGNMENT:
				return getContentHAlignment();
			case LayoutPackage.LAYOUT__CONTENT_VALIGNMENT:
				return getContentVAlignment();
			case LayoutPackage.LAYOUT__PARENT_HALIGNMENT:
				return getParentHAlignment();
			case LayoutPackage.LAYOUT__PARENT_VALIGNMENT:
				return getParentVAlignment();
			case LayoutPackage.LAYOUT__HSIZE:
				return getHSize();
			case LayoutPackage.LAYOUT__VSIZE:
				return getVSize();
			case LayoutPackage.LAYOUT__FITNESS:
				return getFitness();
			case LayoutPackage.LAYOUT__GAPS:
				return getGaps();
			case LayoutPackage.LAYOUT__REF_GAPS:
				return getRefGaps();
			case LayoutPackage.LAYOUT__MARGINS:
				return getMargins();
			case LayoutPackage.LAYOUT__LBORDER:
				if (resolve) return getLborder();
				return basicGetLborder();
			case LayoutPackage.LAYOUT__RBORDER:
				if (resolve) return getRborder();
				return basicGetRborder();
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
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				getSublayouts().clear();
				getSublayouts().addAll((Collection<? extends Layout>)newValue);
				return;
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				setParentLayout((Layout)newValue);
				return;
			case LayoutPackage.LAYOUT__REF_NODE:
				setRefNode((LayoutInfoTreeNode)newValue);
				return;
			case LayoutPackage.LAYOUT__ABS_HALIGNMENT:
				setAbsHAlignment((HAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__ABS_VALIGNMENT:
				setAbsVAlignment((VAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__CONTENT_HALIGNMENT:
				setContentHAlignment((HAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__CONTENT_VALIGNMENT:
				setContentVAlignment((VAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__PARENT_HALIGNMENT:
				setParentHAlignment((HAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__PARENT_VALIGNMENT:
				setParentVAlignment((VAlignmentType)newValue);
				return;
			case LayoutPackage.LAYOUT__HSIZE:
				setHSize((Float)newValue);
				return;
			case LayoutPackage.LAYOUT__VSIZE:
				setVSize((Float)newValue);
				return;
			case LayoutPackage.LAYOUT__FITNESS:
				setFitness((Float)newValue);
				return;
			case LayoutPackage.LAYOUT__GAPS:
				getGaps().clear();
				getGaps().addAll((Collection<? extends Gap>)newValue);
				return;
			case LayoutPackage.LAYOUT__REF_GAPS:
				getRefGaps().clear();
				getRefGaps().addAll((Collection<? extends Gap>)newValue);
				return;
			case LayoutPackage.LAYOUT__MARGINS:
				getMargins().clear();
				getMargins().addAll((Collection<? extends Margin>)newValue);
				return;
			case LayoutPackage.LAYOUT__LBORDER:
				setLborder((AlignmentMark)newValue);
				return;
			case LayoutPackage.LAYOUT__RBORDER:
				setRborder((AlignmentMark)newValue);
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
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				getSublayouts().clear();
				return;
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				setParentLayout((Layout)null);
				return;
			case LayoutPackage.LAYOUT__REF_NODE:
				setRefNode((LayoutInfoTreeNode)null);
				return;
			case LayoutPackage.LAYOUT__ABS_HALIGNMENT:
				setAbsHAlignment(ABS_HALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__ABS_VALIGNMENT:
				setAbsVAlignment(ABS_VALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__CONTENT_HALIGNMENT:
				setContentHAlignment(CONTENT_HALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__CONTENT_VALIGNMENT:
				setContentVAlignment(CONTENT_VALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__PARENT_HALIGNMENT:
				setParentHAlignment(PARENT_HALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__PARENT_VALIGNMENT:
				setParentVAlignment(PARENT_VALIGNMENT_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__HSIZE:
				setHSize(HSIZE_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__VSIZE:
				setVSize(VSIZE_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__FITNESS:
				setFitness(FITNESS_EDEFAULT);
				return;
			case LayoutPackage.LAYOUT__GAPS:
				getGaps().clear();
				return;
			case LayoutPackage.LAYOUT__REF_GAPS:
				getRefGaps().clear();
				return;
			case LayoutPackage.LAYOUT__MARGINS:
				getMargins().clear();
				return;
			case LayoutPackage.LAYOUT__LBORDER:
				setLborder((AlignmentMark)null);
				return;
			case LayoutPackage.LAYOUT__RBORDER:
				setRborder((AlignmentMark)null);
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
			case LayoutPackage.LAYOUT__SUBLAYOUTS:
				return sublayouts != null && !sublayouts.isEmpty();
			case LayoutPackage.LAYOUT__PARENT_LAYOUT:
				return getParentLayout() != null;
			case LayoutPackage.LAYOUT__REF_NODE:
				return refNode != null;
			case LayoutPackage.LAYOUT__ABS_HALIGNMENT:
				return absHAlignment != ABS_HALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__ABS_VALIGNMENT:
				return absVAlignment != ABS_VALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__CONTENT_HALIGNMENT:
				return contentHAlignment != CONTENT_HALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__CONTENT_VALIGNMENT:
				return contentVAlignment != CONTENT_VALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__PARENT_HALIGNMENT:
				return parentHAlignment != PARENT_HALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__PARENT_VALIGNMENT:
				return parentVAlignment != PARENT_VALIGNMENT_EDEFAULT;
			case LayoutPackage.LAYOUT__HSIZE:
				return hSize != HSIZE_EDEFAULT;
			case LayoutPackage.LAYOUT__VSIZE:
				return vSize != VSIZE_EDEFAULT;
			case LayoutPackage.LAYOUT__FITNESS:
				return fitness != FITNESS_EDEFAULT;
			case LayoutPackage.LAYOUT__GAPS:
				return gaps != null && !gaps.isEmpty();
			case LayoutPackage.LAYOUT__REF_GAPS:
				return refGaps != null && !refGaps.isEmpty();
			case LayoutPackage.LAYOUT__MARGINS:
				return margins != null && !margins.isEmpty();
			case LayoutPackage.LAYOUT__LBORDER:
				return lborder != null;
			case LayoutPackage.LAYOUT__RBORDER:
				return rborder != null;
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
		result.append(" (absHAlignment: ");
		result.append(absHAlignment);
		result.append(", absVAlignment: ");
		result.append(absVAlignment);
		result.append(", contentHAlignment: ");
		result.append(contentHAlignment);
		result.append(", contentVAlignment: ");
		result.append(contentVAlignment);
		result.append(", parentHAlignment: ");
		result.append(parentHAlignment);
		result.append(", parentVAlignment: ");
		result.append(parentVAlignment);
		result.append(", hSize: ");
		result.append(hSize);
		result.append(", vSize: ");
		result.append(vSize);
		result.append(", fitness: ");
		result.append(fitness);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
