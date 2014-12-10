/**
 */
package guizmo.tiles.util;

import guizmo.tiles.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage
 * @generated
 */
public class TilesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TilesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesSwitch() {
		if (modelPackage == null) {
			modelPackage = TilesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TilesPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.LOW_LAYOUT_ROOT: {
				LowLayoutRoot lowLayoutRoot = (LowLayoutRoot)theEObject;
				T result = caseLowLayoutRoot(lowLayoutRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.ALIGNED_ELEMENT: {
				AlignedElement alignedElement = (AlignedElement)theEObject;
				T result = caseAlignedElement(alignedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.TILE: {
				Tile tile = (Tile)theEObject;
				T result = caseTile(tile);
				if (result == null) result = caseNamedElement(tile);
				if (result == null) result = caseAlignedElement(tile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.SIMPLE_TILE: {
				SimpleTile simpleTile = (SimpleTile)theEObject;
				T result = caseSimpleTile(simpleTile);
				if (result == null) result = caseTile(simpleTile);
				if (result == null) result = caseNamedElement(simpleTile);
				if (result == null) result = caseAlignedElement(simpleTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.OVERLAPPING_TILE: {
				OverlappingTile overlappingTile = (OverlappingTile)theEObject;
				T result = caseOverlappingTile(overlappingTile);
				if (result == null) result = caseTile(overlappingTile);
				if (result == null) result = caseNamedElement(overlappingTile);
				if (result == null) result = caseAlignedElement(overlappingTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.LINE_TILE: {
				LineTile lineTile = (LineTile)theEObject;
				T result = caseLineTile(lineTile);
				if (result == null) result = caseTile(lineTile);
				if (result == null) result = caseNamedElement(lineTile);
				if (result == null) result = caseAlignedElement(lineTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.HOLE_TILE: {
				HoleTile holeTile = (HoleTile)theEObject;
				T result = caseHoleTile(holeTile);
				if (result == null) result = caseTile(holeTile);
				if (result == null) result = caseNamedElement(holeTile);
				if (result == null) result = caseAlignedElement(holeTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TilesPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Low Layout Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Low Layout Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowLayoutRoot(LowLayoutRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aligned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aligned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignedElement(AlignedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTile(Tile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTile(SimpleTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlapping Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlapping Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlappingTile(OverlappingTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineTile(LineTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hole Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hole Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHoleTile(HoleTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TilesSwitch
