/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.AlignmentMark#getLgap <em>Lgap</em>}</li>
 *   <li>{@link guizmo.layout.AlignmentMark#getLnodes <em>Lnodes</em>}</li>
 *   <li>{@link guizmo.layout.AlignmentMark#getRnodes <em>Rnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getAlignmentMark()
 * @model
 * @generated
 */
public interface AlignmentMark extends EObject {
	/**
	 * Returns the value of the '<em><b>Lgap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lgap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lgap</em>' attribute.
	 * @see #setLgap(float)
	 * @see guizmo.layout.LayoutPackage#getAlignmentMark_Lgap()
	 * @model required="true"
	 * @generated
	 */
	float getLgap();

	/**
	 * Sets the value of the '{@link guizmo.layout.AlignmentMark#getLgap <em>Lgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lgap</em>' attribute.
	 * @see #getLgap()
	 * @generated
	 */
	void setLgap(float value);

	/**
	 * Returns the value of the '<em><b>Lnodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getLborder <em>Lborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lnodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lnodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getAlignmentMark_Lnodes()
	 * @see guizmo.layout.Layout#getLborder
	 * @model opposite="lborder"
	 * @generated
	 */
	EList<Layout> getLnodes();

	/**
	 * Returns the value of the '<em><b>Rnodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getRborder <em>Rborder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rnodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rnodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getAlignmentMark_Rnodes()
	 * @see guizmo.layout.Layout#getRborder
	 * @model opposite="rborder"
	 * @generated
	 */
	EList<Layout> getRnodes();

} // AlignmentMark
