/**
 */
package guizmo.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.structure.ImageContainer#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.structure.StructurePackage#getImageContainer()
 * @model
 * @generated
 */
public interface ImageContainer extends SingleWidget, Linkable {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see guizmo.structure.StructurePackage#getImageContainer_Image()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link guizmo.structure.ImageContainer#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

} // ImageContainer
