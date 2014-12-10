/**
 */
package guizmo.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUI Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.GUIRegion#isBorder <em>Border</em>}</li>
 *   <li>{@link guizmo.structure.GUIRegion#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getGUIRegion()
 * @model
 * @generated
 */
public interface GUIRegion extends Container, ComposableWidget {

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(boolean)
	 * @see guizmo.structure.StructurePackage#getGUIRegion_Border()
	 * @model
	 * @generated
	 */
	boolean isBorder();

	/**
	 * Sets the value of the '{@link guizmo.structure.GUIRegion#isBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #isBorder()
	 * @generated
	 */
	void setBorder(boolean value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see guizmo.structure.StructurePackage#getGUIRegion_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link guizmo.structure.GUIRegion#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // GUIRegion
