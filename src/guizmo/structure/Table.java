/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Table#getHeaders <em>Headers</em>}</li>
 *   <li>{@link guizmo.structure.Table#getTypes <em>Types</em>}</li>
 *   <li>{@link guizmo.structure.Table#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends SingleWidget {
	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.GraphicalResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getTable_Headers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphicalResource> getHeaders();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.SingleWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getTable_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleWidget> getTypes();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.TableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // Table
