/**
 */
package guizmo.tiles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aligned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.tiles.AlignedElement#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link guizmo.tiles.AlignedElement#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.tiles.TilesPackage#getAlignedElement()
 * @model abstract="true"
 * @generated
 */
public interface AlignedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.VAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see guizmo.tiles.VAlignmentType
	 * @see #setVerticalAlignment(VAlignmentType)
	 * @see guizmo.tiles.TilesPackage#getAlignedElement_VerticalAlignment()
	 * @model required="true"
	 * @generated
	 */
	VAlignmentType getVerticalAlignment();

	/**
	 * Sets the value of the '{@link guizmo.tiles.AlignedElement#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see guizmo.tiles.VAlignmentType
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(VAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.HAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see guizmo.tiles.HAlignmentType
	 * @see #setHorizontalAlignment(HAlignmentType)
	 * @see guizmo.tiles.TilesPackage#getAlignedElement_HorizontalAlignment()
	 * @model required="true"
	 * @generated
	 */
	HAlignmentType getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link guizmo.tiles.AlignedElement#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see guizmo.tiles.HAlignmentType
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(HAlignmentType value);

} // AlignedElement
