/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.CheckBox#getResource <em>Resource</em>}</li>
 *   <li>{@link guizmo.structure.CheckBox#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends SingleWidget {

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(GraphicalResource)
	 * @see guizmo.structure.StructurePackage#getCheckBox_Resource()
	 * @model containment="true"
	 * @generated
	 */
	GraphicalResource getResource();

	/**
	 * Sets the value of the '{@link guizmo.structure.CheckBox#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(GraphicalResource value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see guizmo.structure.StructurePackage#getCheckBox_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link guizmo.structure.CheckBox#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);
} // CheckBox
