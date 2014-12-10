/**
 */
package guizmo.tiles;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Low Layout Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.tiles.LowLayoutRoot#getViewTiles <em>View Tiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.tiles.TilesPackage#getLowLayoutRoot()
 * @model
 * @generated
 */
public interface LowLayoutRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>View Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Tiles</em>' containment reference list.
	 * @see guizmo.tiles.TilesPackage#getLowLayoutRoot_ViewTiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tile> getViewTiles();

} // LowLayoutRoot
