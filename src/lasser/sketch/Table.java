/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Table#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Widget {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

} // Table
