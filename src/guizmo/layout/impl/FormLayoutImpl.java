/**
 */
package guizmo.layout.impl;

import guizmo.layout.AlignedColumn;
import guizmo.layout.AlignmentMark;
import guizmo.layout.FormLayout;
import guizmo.layout.LayoutPackage;
import guizmo.layout.NodeLine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.layout.impl.FormLayoutImpl#getMarks <em>Marks</em>}</li>
 *   <li>{@link guizmo.layout.impl.FormLayoutImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link guizmo.layout.impl.FormLayoutImpl#getNumNodesLongestLine <em>Num Nodes Longest Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormLayoutImpl extends LayoutImpl implements FormLayout {
	/**
	 * The cached value of the '{@link #getMarks() <em>Marks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarks()
	 * @generated
	 * @ordered
	 */
	protected EList<AlignmentMark> marks;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<AlignedColumn> columns;

	/**
	 * The default value of the '{@link #getNumNodesLongestLine() <em>Num Nodes Longest Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumNodesLongestLine()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NODES_LONGEST_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumNodesLongestLine() <em>Num Nodes Longest Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumNodesLongestLine()
	 * @generated
	 * @ordered
	 */
	protected int numNodesLongestLine = NUM_NODES_LONGEST_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutPackage.Literals.FORM_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlignmentMark> getMarks() {
		if (marks == null) {
			marks = new EObjectContainmentEList<AlignmentMark>(AlignmentMark.class, this, LayoutPackage.FORM_LAYOUT__MARKS);
		}
		return marks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlignedColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<AlignedColumn>(AlignedColumn.class, this, LayoutPackage.FORM_LAYOUT__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumNodesLongestLine() {
		return numNodesLongestLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumNodesLongestLine(int newNumNodesLongestLine) {
		int oldNumNodesLongestLine = numNodesLongestLine;
		numNodesLongestLine = newNumNodesLongestLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutPackage.FORM_LAYOUT__NUM_NODES_LONGEST_LINE, oldNumNodesLongestLine, numNodesLongestLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutPackage.FORM_LAYOUT__MARKS:
				return ((InternalEList<?>)getMarks()).basicRemove(otherEnd, msgs);
			case LayoutPackage.FORM_LAYOUT__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case LayoutPackage.FORM_LAYOUT__MARKS:
				return getMarks();
			case LayoutPackage.FORM_LAYOUT__COLUMNS:
				return getColumns();
			case LayoutPackage.FORM_LAYOUT__NUM_NODES_LONGEST_LINE:
				return getNumNodesLongestLine();
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
			case LayoutPackage.FORM_LAYOUT__MARKS:
				getMarks().clear();
				getMarks().addAll((Collection<? extends AlignmentMark>)newValue);
				return;
			case LayoutPackage.FORM_LAYOUT__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends AlignedColumn>)newValue);
				return;
			case LayoutPackage.FORM_LAYOUT__NUM_NODES_LONGEST_LINE:
				setNumNodesLongestLine((Integer)newValue);
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
			case LayoutPackage.FORM_LAYOUT__MARKS:
				getMarks().clear();
				return;
			case LayoutPackage.FORM_LAYOUT__COLUMNS:
				getColumns().clear();
				return;
			case LayoutPackage.FORM_LAYOUT__NUM_NODES_LONGEST_LINE:
				setNumNodesLongestLine(NUM_NODES_LONGEST_LINE_EDEFAULT);
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
			case LayoutPackage.FORM_LAYOUT__MARKS:
				return marks != null && !marks.isEmpty();
			case LayoutPackage.FORM_LAYOUT__COLUMNS:
				return columns != null && !columns.isEmpty();
			case LayoutPackage.FORM_LAYOUT__NUM_NODES_LONGEST_LINE:
				return numNodesLongestLine != NUM_NODES_LONGEST_LINE_EDEFAULT;
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
		result.append(" (numNodesLongestLine: ");
		result.append(numNodesLongestLine);
		result.append(')');
		return result.toString();
	}

} //FormLayoutImpl
