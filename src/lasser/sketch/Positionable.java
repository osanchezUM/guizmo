/**
 */
package lasser.sketch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positionable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Positionable#getXPos <em>XPos</em>}</li>
 *   <li>{@link lasser.sketch.Positionable#getYPos <em>YPos</em>}</li>
 *   <li>{@link lasser.sketch.Positionable#getWidth <em>Width</em>}</li>
 *   <li>{@link lasser.sketch.Positionable#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getPositionable()
 * @model abstract="true"
 * @generated
 */
public interface Positionable extends EObject {
	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(int)
	 * @see lasser.sketch.SketchPackage#getPositionable_XPos()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getXPos();

	/**
	 * Sets the value of the '{@link lasser.sketch.Positionable#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(int value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(int)
	 * @see lasser.sketch.SketchPackage#getPositionable_YPos()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getYPos();

	/**
	 * Sets the value of the '{@link lasser.sketch.Positionable#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see lasser.sketch.SketchPackage#getPositionable_Width()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link lasser.sketch.Positionable#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see lasser.sketch.SketchPackage#getPositionable_Height()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link lasser.sketch.Positionable#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Positionable
