/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.CompositeWidget#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getCompositeWidget()
 * @model
 * @generated
 */
public interface CompositeWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getCompositeWidget_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getComponents();

} // CompositeWidget
