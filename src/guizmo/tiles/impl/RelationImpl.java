/**
 */
package guizmo.tiles.impl;

import guizmo.tiles.AllenIntervalType;
import guizmo.tiles.ClosenessType;
import guizmo.tiles.Relation;
import guizmo.tiles.Tile;
import guizmo.tiles.TilesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getXInterval <em>XInterval</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getYInterval <em>YInterval</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#getCloseness <em>Closeness</em>}</li>
 *   <li>{@link guizmo.tiles.impl.RelationImpl#isJoined <em>Joined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends EObjectImpl implements Relation {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Tile source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Tile target;

	/**
	 * The default value of the '{@link #getXInterval() <em>XInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXInterval()
	 * @generated
	 * @ordered
	 */
	protected static final AllenIntervalType XINTERVAL_EDEFAULT = AllenIntervalType.BEFORE;

	/**
	 * The cached value of the '{@link #getXInterval() <em>XInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXInterval()
	 * @generated
	 * @ordered
	 */
	protected AllenIntervalType xInterval = XINTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYInterval() <em>YInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYInterval()
	 * @generated
	 * @ordered
	 */
	protected static final AllenIntervalType YINTERVAL_EDEFAULT = AllenIntervalType.BEFORE;

	/**
	 * The cached value of the '{@link #getYInterval() <em>YInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYInterval()
	 * @generated
	 * @ordered
	 */
	protected AllenIntervalType yInterval = YINTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseness() <em>Closeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseness()
	 * @generated
	 * @ordered
	 */
	protected static final ClosenessType CLOSENESS_EDEFAULT = ClosenessType.VERY_CLOSE;

	/**
	 * The cached value of the '{@link #getCloseness() <em>Closeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseness()
	 * @generated
	 * @ordered
	 */
	protected ClosenessType closeness = CLOSENESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isJoined() <em>Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJoined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJoined() <em>Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJoined()
	 * @generated
	 * @ordered
	 */
	protected boolean joined = JOINED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TilesPackage.Literals.RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Tile)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TilesPackage.RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Tile newSource, NotificationChain msgs) {
		Tile oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Tile newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, TilesPackage.TILE__OUTGOING, Tile.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, TilesPackage.TILE__OUTGOING, Tile.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Tile)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TilesPackage.RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Tile newTarget, NotificationChain msgs) {
		Tile oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Tile newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, TilesPackage.TILE__INCOMING, Tile.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, TilesPackage.TILE__INCOMING, Tile.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllenIntervalType getXInterval() {
		return xInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXInterval(AllenIntervalType newXInterval) {
		AllenIntervalType oldXInterval = xInterval;
		xInterval = newXInterval == null ? XINTERVAL_EDEFAULT : newXInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__XINTERVAL, oldXInterval, xInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllenIntervalType getYInterval() {
		return yInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYInterval(AllenIntervalType newYInterval) {
		AllenIntervalType oldYInterval = yInterval;
		yInterval = newYInterval == null ? YINTERVAL_EDEFAULT : newYInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__YINTERVAL, oldYInterval, yInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosenessType getCloseness() {
		return closeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloseness(ClosenessType newCloseness) {
		ClosenessType oldCloseness = closeness;
		closeness = newCloseness == null ? CLOSENESS_EDEFAULT : newCloseness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__CLOSENESS, oldCloseness, closeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJoined() {
		return joined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoined(boolean newJoined) {
		boolean oldJoined = joined;
		joined = newJoined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.RELATION__JOINED, oldJoined, joined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TilesPackage.RELATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, TilesPackage.TILE__OUTGOING, Tile.class, msgs);
				return basicSetSource((Tile)otherEnd, msgs);
			case TilesPackage.RELATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, TilesPackage.TILE__INCOMING, Tile.class, msgs);
				return basicSetTarget((Tile)otherEnd, msgs);
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
			case TilesPackage.RELATION__SOURCE:
				return basicSetSource(null, msgs);
			case TilesPackage.RELATION__TARGET:
				return basicSetTarget(null, msgs);
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
			case TilesPackage.RELATION__NAME:
				return getName();
			case TilesPackage.RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TilesPackage.RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TilesPackage.RELATION__XINTERVAL:
				return getXInterval();
			case TilesPackage.RELATION__YINTERVAL:
				return getYInterval();
			case TilesPackage.RELATION__CLOSENESS:
				return getCloseness();
			case TilesPackage.RELATION__JOINED:
				return isJoined();
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
			case TilesPackage.RELATION__NAME:
				setName((String)newValue);
				return;
			case TilesPackage.RELATION__SOURCE:
				setSource((Tile)newValue);
				return;
			case TilesPackage.RELATION__TARGET:
				setTarget((Tile)newValue);
				return;
			case TilesPackage.RELATION__XINTERVAL:
				setXInterval((AllenIntervalType)newValue);
				return;
			case TilesPackage.RELATION__YINTERVAL:
				setYInterval((AllenIntervalType)newValue);
				return;
			case TilesPackage.RELATION__CLOSENESS:
				setCloseness((ClosenessType)newValue);
				return;
			case TilesPackage.RELATION__JOINED:
				setJoined((Boolean)newValue);
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
			case TilesPackage.RELATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TilesPackage.RELATION__SOURCE:
				setSource((Tile)null);
				return;
			case TilesPackage.RELATION__TARGET:
				setTarget((Tile)null);
				return;
			case TilesPackage.RELATION__XINTERVAL:
				setXInterval(XINTERVAL_EDEFAULT);
				return;
			case TilesPackage.RELATION__YINTERVAL:
				setYInterval(YINTERVAL_EDEFAULT);
				return;
			case TilesPackage.RELATION__CLOSENESS:
				setCloseness(CLOSENESS_EDEFAULT);
				return;
			case TilesPackage.RELATION__JOINED:
				setJoined(JOINED_EDEFAULT);
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
			case TilesPackage.RELATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TilesPackage.RELATION__SOURCE:
				return source != null;
			case TilesPackage.RELATION__TARGET:
				return target != null;
			case TilesPackage.RELATION__XINTERVAL:
				return xInterval != XINTERVAL_EDEFAULT;
			case TilesPackage.RELATION__YINTERVAL:
				return yInterval != YINTERVAL_EDEFAULT;
			case TilesPackage.RELATION__CLOSENESS:
				return closeness != CLOSENESS_EDEFAULT;
			case TilesPackage.RELATION__JOINED:
				return joined != JOINED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", xInterval: ");
		result.append(xInterval);
		result.append(", yInterval: ");
		result.append(yInterval);
		result.append(", closeness: ");
		result.append(closeness);
		result.append(", joined: ");
		result.append(joined);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
