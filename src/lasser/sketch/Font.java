/**
 */
package lasser.sketch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Font#getType <em>Type</em>}</li>
 *   <li>{@link lasser.sketch.Font#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lasser.sketch.FontType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see lasser.sketch.FontType
	 * @see #setType(FontType)
	 * @see lasser.sketch.SketchPackage#getFont_Type()
	 * @model
	 * @generated
	 */
	FontType getType();

	/**
	 * Sets the value of the '{@link lasser.sketch.Font#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see lasser.sketch.FontType
	 * @see #getType()
	 * @generated
	 */
	void setType(FontType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see lasser.sketch.SketchPackage#getFont_Size()
	 * @model default="12" required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link lasser.sketch.Font#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // Font
