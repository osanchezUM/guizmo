/**
 */
package lasser.sketch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colour Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lasser.sketch.SketchPackage#getColourType()
 * @model
 * @generated
 */
public enum ColourType implements Enumerator {
	/**
	 * The '<em><b>BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	BLACK(0, "BLACK", "BLACK"),

	/**
	 * The '<em><b>WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	WHITE(1, "WHITE", "WHITE"),

	/**
	 * The '<em><b>GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	GRAY(2, "GRAY", "GRAY");

	/**
	 * The '<em><b>BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLACK_VALUE = 0;

	/**
	 * The '<em><b>WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHITE_VALUE = 1;

	/**
	 * The '<em><b>GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Colour Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ColourType[] VALUES_ARRAY =
		new ColourType[] {
			BLACK,
			WHITE,
			GRAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Colour Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ColourType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colour Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColourType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColourType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colour Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColourType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ColourType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colour Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColourType get(int value) {
		switch (value) {
			case BLACK_VALUE: return BLACK;
			case WHITE_VALUE: return WHITE;
			case GRAY_VALUE: return GRAY;
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
	private ColourType(int value, String name, String literal) {
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
	
} //ColourType
