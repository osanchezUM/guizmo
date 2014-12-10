/**
 */
package guizmo.tiles.util;

import guizmo.tiles.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage
 * @generated
 */
public class TilesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TilesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TilesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilesSwitch<Adapter> modelSwitch =
		new TilesSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLowLayoutRoot(LowLayoutRoot object) {
				return createLowLayoutRootAdapter();
			}
			@Override
			public Adapter caseAlignedElement(AlignedElement object) {
				return createAlignedElementAdapter();
			}
			@Override
			public Adapter caseTile(Tile object) {
				return createTileAdapter();
			}
			@Override
			public Adapter caseSimpleTile(SimpleTile object) {
				return createSimpleTileAdapter();
			}
			@Override
			public Adapter caseOverlappingTile(OverlappingTile object) {
				return createOverlappingTileAdapter();
			}
			@Override
			public Adapter caseLineTile(LineTile object) {
				return createLineTileAdapter();
			}
			@Override
			public Adapter caseHoleTile(HoleTile object) {
				return createHoleTileAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.LowLayoutRoot <em>Low Layout Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.LowLayoutRoot
	 * @generated
	 */
	public Adapter createLowLayoutRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.AlignedElement <em>Aligned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.AlignedElement
	 * @generated
	 */
	public Adapter createAlignedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.Tile
	 * @generated
	 */
	public Adapter createTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.SimpleTile <em>Simple Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.SimpleTile
	 * @generated
	 */
	public Adapter createSimpleTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.OverlappingTile <em>Overlapping Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.OverlappingTile
	 * @generated
	 */
	public Adapter createOverlappingTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.LineTile <em>Line Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.LineTile
	 * @generated
	 */
	public Adapter createLineTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.HoleTile <em>Hole Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.HoleTile
	 * @generated
	 */
	public Adapter createHoleTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.tiles.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.tiles.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TilesAdapterFactory
