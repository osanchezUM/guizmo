/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.Gap#getType <em>Type</em>}</li>
 *   <li>{@link guizmo.layout.Gap#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getGap()
 * @model
 * @generated
 */
public interface Gap extends Separation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.GapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.GapType
	 * @see #setType(GapType)
	 * @see guizmo.layout.LayoutPackage#getGap_Type()
	 * @model
	 * @generated
	 */
	GapType getType();

	/**
	 * Sets the value of the '{@link guizmo.layout.Gap#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see guizmo.layout.GapType
	 * @see #getType()
	 * @generated
	 */
	void setType(GapType value);

	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getRefGaps <em>Ref Gaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layouts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getGap_Layouts()
	 * @see guizmo.layout.Layout#getRefGaps
	 * @model opposite="refGaps" lower="2" upper="2"
	 * @generated
	 */
	EList<Layout> getLayouts();

} // Gap
