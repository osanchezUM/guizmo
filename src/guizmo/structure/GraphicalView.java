/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.GraphicalView#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getGraphicalView()
 * @model
 * @generated
 */
public interface GraphicalView extends Container {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Text)
	 * @see guizmo.structure.StructurePackage#getGraphicalView_Title()
	 * @model containment="true"
	 * @generated
	 */
	Text getTitle();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalView#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Text value);

} // GraphicalView
