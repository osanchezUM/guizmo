/**
 */
package guizmo.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.GraphicalElement#getId <em>Id</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#getName <em>Name</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#getDescription <em>Description</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#isIsEnabled <em>Is Enabled</em>}</li>
 *   <li>{@link guizmo.structure.GraphicalElement#isIsResizable <em>Is Resizable</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getGraphicalElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brief Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brief Description</em>' attribute.
	 * @see #setBriefDescription(String)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_BriefDescription()
	 * @model
	 * @generated
	 */
	String getBriefDescription();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#getBriefDescription <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brief Description</em>' attribute.
	 * @see #getBriefDescription()
	 * @generated
	 */
	void setBriefDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Visible</em>' attribute.
	 * @see #setIsVisible(boolean)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_IsVisible()
	 * @model
	 * @generated
	 */
	boolean isIsVisible();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#isIsVisible <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Visible</em>' attribute.
	 * @see #isIsVisible()
	 * @generated
	 */
	void setIsVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enabled</em>' attribute.
	 * @see #setIsEnabled(boolean)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_IsEnabled()
	 * @model
	 * @generated
	 */
	boolean isIsEnabled();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#isIsEnabled <em>Is Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enabled</em>' attribute.
	 * @see #isIsEnabled()
	 * @generated
	 */
	void setIsEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Resizable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Resizable</em>' attribute.
	 * @see #setIsResizable(boolean)
	 * @see guizmo.structure.StructurePackage#getGraphicalElement_IsResizable()
	 * @model
	 * @generated
	 */
	boolean isIsResizable();

	/**
	 * Sets the value of the '{@link guizmo.structure.GraphicalElement#isIsResizable <em>Is Resizable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Resizable</em>' attribute.
	 * @see #isIsResizable()
	 * @generated
	 */
	void setIsResizable(boolean value);

} // GraphicalElement
