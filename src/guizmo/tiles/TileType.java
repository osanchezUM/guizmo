/**
 */
package guizmo.tiles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tile Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage#getTileType()
 * @model
 * @generated
 */
public enum TileType implements Enumerator {
	/**
	 * The '<em><b>COARSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COARSE_VALUE
	 * @generated
	 * @ordered
	 */
	COARSE(0, "COARSE", "COARSE"),

	/**
	 * The '<em><b>FINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINE_VALUE
	 * @generated
	 * @ordered
	 */
	FINE(1, "FINE", "FINE"),

	/**
	 * The '<em><b>ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM(2, "ITEM", "ITEM");

	/**
	 * The '<em><b>COARSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COARSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COARSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COARSE_VALUE = 0;

	/**
	 * The '<em><b>FINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINE_VALUE = 1;

	/**
	 * The '<em><b>ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TileType[] VALUES_ARRAY =
		new TileType[] {
			COARSE,
			FINE,
			ITEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Tile Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tile Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TileType get(int value) {
		switch (value) {
			case COARSE_VALUE: return COARSE;
			case FINE_VALUE: return FINE;
			case ITEM_VALUE: return ITEM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TileType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TileType
