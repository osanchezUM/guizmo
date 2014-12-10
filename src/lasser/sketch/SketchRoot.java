/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.SketchRoot#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getSketchRoot()
 * @model
 * @generated
 */
public interface SketchRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getSketchRoot_Windows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Window> getWindows();

} // SketchRoot
