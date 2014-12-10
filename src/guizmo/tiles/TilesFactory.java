/**
 */
package guizmo.tiles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage
 * @generated
 */
public interface TilesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TilesFactory eINSTANCE = guizmo.tiles.impl.TilesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Low Layout Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Low Layout Root</em>'.
	 * @generated
	 */
	LowLayoutRoot createLowLayoutRoot();

	/**
	 * Returns a new object of class '<em>Simple Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Tile</em>'.
	 * @generated
	 */
	SimpleTile createSimpleTile();

	/**
	 * Returns a new object of class '<em>Overlapping Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overlapping Tile</em>'.
	 * @generated
	 */
	OverlappingTile createOverlappingTile();

	/**
	 * Returns a new object of class '<em>Line Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Tile</em>'.
	 * @generated
	 */
	LineTile createLineTile();

	/**
	 * Returns a new object of class '<em>Hole Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hole Tile</em>'.
	 * @generated
	 */
	HoleTile createHoleTile();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TilesPackage getTilesPackage();

} //TilesFactory
