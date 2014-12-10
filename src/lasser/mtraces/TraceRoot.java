/**
 */
package lasser.mtraces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.mtraces.TraceRoot#getTraces <em>Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.mtraces.MtracesPackage#getTraceRoot()
 * @model
 * @generated
 */
public interface TraceRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.mtraces.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see lasser.mtraces.MtracesPackage#getTraceRoot_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trace> getTraces();

} // TraceRoot
