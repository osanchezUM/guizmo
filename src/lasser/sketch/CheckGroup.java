/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.CheckGroup#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getCheckGroup()
 * @model
 * @generated
 */
public interface CheckGroup extends Widget {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.CheckBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getCheckGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckBox> getItems();

} // CheckGroup
