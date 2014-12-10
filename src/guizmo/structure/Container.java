/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Container#getWidgets <em>Widgets</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends GraphicalElement, Locatable {
	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.structure.ComposableWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see guizmo.structure.StructurePackage#getContainer_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComposableWidget> getWidgets();

} // Container
