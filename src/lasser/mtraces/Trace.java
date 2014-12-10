/**
 */
package lasser.mtraces;

import guizmo.structure.GraphicalElement;

import lasser.sketch.Widget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.mtraces.Trace#getName <em>Name</em>}</li>
 *   <li>{@link lasser.mtraces.Trace#getSource <em>Source</em>}</li>
 *   <li>{@link lasser.mtraces.Trace#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.mtraces.MtracesPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lasser.mtraces.MtracesPackage#getTrace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lasser.mtraces.Trace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link lasser.sketch.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see lasser.mtraces.MtracesPackage#getTrace_Source()
	 * @model required="true"
	 * @generated
	 */
	EList<Widget> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GraphicalElement)
	 * @see lasser.mtraces.MtracesPackage#getTrace_Target()
	 * @model required="true"
	 * @generated
	 */
	GraphicalElement getTarget();

	/**
	 * Sets the value of the '{@link lasser.mtraces.Trace#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GraphicalElement value);

} // Trace
