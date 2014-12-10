/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.FormLayout#getMarks <em>Marks</em>}</li>
 *   <li>{@link guizmo.layout.FormLayout#getColumns <em>Columns</em>}</li>
 *   <li>{@link guizmo.layout.FormLayout#getNumNodesLongestLine <em>Num Nodes Longest Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getFormLayout()
 * @model
 * @generated
 */
public interface FormLayout extends Layout {
	/**
	 * Returns the value of the '<em><b>Marks</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.AlignmentMark}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marks</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getFormLayout_Marks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlignmentMark> getMarks();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.AlignedColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getFormLayout_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlignedColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Num Nodes Longest Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Nodes Longest Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Nodes Longest Line</em>' attribute.
	 * @see #setNumNodesLongestLine(int)
	 * @see guizmo.layout.LayoutPackage#getFormLayout_NumNodesLongestLine()
	 * @model
	 * @generated
	 */
	int getNumNodesLongestLine();

	/**
	 * Sets the value of the '{@link guizmo.layout.FormLayout#getNumNodesLongestLine <em>Num Nodes Longest Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Nodes Longest Line</em>' attribute.
	 * @see #getNumNodesLongestLine()
	 * @generated
	 */
	void setNumNodesLongestLine(int value);

} // FormLayout
