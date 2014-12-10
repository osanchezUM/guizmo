/**
 */
package guizmo.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.Linkable#isIsHyperlink <em>Is Hyperlink</em>}</li>
 *   <li>{@link guizmo.structure.Linkable#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getLinkable()
 * @model abstract="true"
 * @generated
 */
public interface Linkable extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hyperlink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hyperlink</em>' attribute.
	 * @see #setIsHyperlink(boolean)
	 * @see guizmo.structure.StructurePackage#getLinkable_IsHyperlink()
	 * @model
	 * @generated
	 */
	boolean isIsHyperlink();

	/**
	 * Sets the value of the '{@link guizmo.structure.Linkable#isIsHyperlink <em>Is Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hyperlink</em>' attribute.
	 * @see #isIsHyperlink()
	 * @generated
	 */
	void setIsHyperlink(boolean value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see guizmo.structure.StructurePackage#getLinkable_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link guizmo.structure.Linkable#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // Linkable
