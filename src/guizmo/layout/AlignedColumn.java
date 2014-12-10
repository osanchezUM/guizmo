/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aligned Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.AlignedColumn#getLgap <em>Lgap</em>}</li>
 *   <li>{@link guizmo.layout.AlignedColumn#getRgap <em>Rgap</em>}</li>
 *   <li>{@link guizmo.layout.AlignedColumn#getNodes <em>Nodes</em>}</li>
 *   <li>{@link guizmo.layout.AlignedColumn#getLeftNodes <em>Left Nodes</em>}</li>
 *   <li>{@link guizmo.layout.AlignedColumn#getRightNodes <em>Right Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getAlignedColumn()
 * @model
 * @generated
 */
public interface AlignedColumn extends EObject {
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
	 * @see guizmo.layout.LayoutPackage#getAlignedColumn_Lgap()
	 * @model
	 * @generated
	 */
	float getLgap();

	/**
	 * Sets the value of the '{@link guizmo.layout.AlignedColumn#getLgap <em>Lgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lgap</em>' attribute.
	 * @see #getLgap()
	 * @generated
	 */
	void setLgap(float value);

	/**
	 * Returns the value of the '<em><b>Rgap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rgap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rgap</em>' attribute.
	 * @see #setRgap(float)
	 * @see guizmo.layout.LayoutPackage#getAlignedColumn_Rgap()
	 * @model
	 * @generated
	 */
	float getRgap();

	/**
	 * Sets the value of the '{@link guizmo.layout.AlignedColumn#getRgap <em>Rgap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rgap</em>' attribute.
	 * @see #getRgap()
	 * @generated
	 */
	void setRgap(float value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.ElementNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getAlignedColumn_Nodes()
	 * @model
	 * @generated
	 */
	EList<ElementNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Left Nodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.ElementNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Nodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getAlignedColumn_LeftNodes()
	 * @model
	 * @generated
	 */
	EList<ElementNode> getLeftNodes();

	/**
	 * Returns the value of the '<em><b>Right Nodes</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.ElementNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Nodes</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getAlignedColumn_RightNodes()
	 * @model
	 * @generated
	 */
	EList<ElementNode> getRightNodes();

} // AlignedColumn
