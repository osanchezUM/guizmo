/**
 */
package lasser.sketch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lasser.sketch.SketchPackage#getFontType()
 * @model
 * @generated
 */
public enum FontType implements Enumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>TIMES NEW ROMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMES_NEW_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	TIMES_NEW_ROMAN(1, "TIMES_NEW_ROMAN", "TIMES_NEW_ROMAN"),

	/**
	 * The '<em><b>ARIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARIAL_VALUE
	 * @generated
	 * @ordered
	 */
	ARIAL(2, "ARIAL", "ARIAL"),

	/**
	 * The '<em><b>COURIER NEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURIER_NEW_VALUE
	 * @generated
	 * @ordered
	 */
	COURIER_NEW(3, "COURIER_NEW", "COURIER_NEW");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>TIMES NEW ROMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMES NEW ROMAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMES_NEW_ROMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMES_NEW_ROMAN_VALUE = 1;

	/**
	 * The '<em><b>ARIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARIAL_VALUE = 2;

	/**
	 * The '<em><b>COURIER NEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COURIER NEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COURIER_NEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COURIER_NEW_VALUE = 3;

	/**
	 * An array of all the '<em><b>Font Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontType[] VALUES_ARRAY =
		new FontType[] {
			DEFAULT,
			TIMES_NEW_ROMAN,
			ARIAL,
			COURIER_NEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontType get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case TIMES_NEW_ROMAN_VALUE: return TIMES_NEW_ROMAN;
			case ARIAL_VALUE: return ARIAL;
			case COURIER_NEW_VALUE: return COURIER_NEW;
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
	private FontType(int value, String name, String literal) {
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
	
} //FontType
