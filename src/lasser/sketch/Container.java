/**
 */
package lasser.sketch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lasser.sketch.Container#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see lasser.sketch.SketchPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends Widget {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link lasser.sketch.Widget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see lasser.sketch.SketchPackage#getContainer_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Widget> getWidgets();

} // Container
