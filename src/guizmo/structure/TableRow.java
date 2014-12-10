/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.TableRow#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.GraphicalResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getTableRow_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicalResource> getValues();

} // TableRow
