/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Row#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see lasser.sketch.SketchPackage#getRow_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // Row
