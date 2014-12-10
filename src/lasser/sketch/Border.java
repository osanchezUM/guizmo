/**
 */
package lasser.sketch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Border#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getBorder()
 * @model
 * @generated
 */
public interface Border extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lasser.sketch.BorderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lasser.sketch.BorderType
	 * @see #setType(BorderType)
	 * @see lasser.sketch.SketchPackage#getBorder_Type()
	 * @model required="true"
	 * @generated
	 */
	BorderType getType();

	/**
	 * Sets the value of the '{@link lasser.sketch.Border#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lasser.sketch.BorderType
	 * @see #getType()
	 * @generated
	 */
	void setType(BorderType value);

} // Border
