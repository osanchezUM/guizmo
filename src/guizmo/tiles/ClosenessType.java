/**
 */
package guizmo.tiles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Closeness Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage#getClosenessType()
 * @model
 * @generated
 */
public enum ClosenessType implements Enumerator {
	/**
	 * The '<em><b>VERY CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_CLOSE(0, "VERY_CLOSE", "VERY_CLOSE"),

	/**
	 * The '<em><b>CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE(1, "CLOSE", "CLOSE"),

	/**
	 * The '<em><b>FAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAR_VALUE
	 * @generated
	 * @ordered
	 */
	FAR(2, "FAR", "FAR"),

	/**
	 * The '<em><b>VERY FAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_FAR_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_FAR(3, "VERY_FAR", "VERY_FAR");

	/**
	 * The '<em><b>VERY CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERY CLOSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERY_CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_CLOSE_VALUE = 0;

	/**
	 * The '<em><b>CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_VALUE = 1;

	/**
	 * The '<em><b>FAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAR_VALUE = 2;

	/**
	 * The '<em><b>VERY FAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERY FAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERY_FAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERY_FAR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Closeness Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClosenessType[] VALUES_ARRAY =
		new ClosenessType[] {
			VERY_CLOSE,
			CLOSE,
			FAR,
			VERY_FAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Closeness Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClosenessType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Closeness Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClosenessType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClosenessType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Closeness Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClosenessType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClosenessType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Closeness Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClosenessType get(int value) {
		switch (value) {
			case VERY_CLOSE_VALUE: return VERY_CLOSE;
			case CLOSE_VALUE: return CLOSE;
			case FAR_VALUE: return FAR;
			case VERY_FAR_VALUE: return VERY_FAR;
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
	private ClosenessType(int value, String name, String literal) {
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
	
} //ClosenessType
