/**
 */
package guizmo.tiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.tiles.LineTile#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.tiles.TilesPackage#getLineTile()
 * @model
 * @generated
 */
public interface LineTile extends Tile {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.OrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see guizmo.tiles.OrientationType
	 * @see #setOrientation(OrientationType)
	 * @see guizmo.tiles.TilesPackage#getLineTile_Orientation()
	 * @model
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link guizmo.tiles.LineTile#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see guizmo.tiles.OrientationType
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

} // LineTile
