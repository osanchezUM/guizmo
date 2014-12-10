/**
 */
package guizmo.layout;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HAlignment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see guizmo.layout.LayoutPackage#getHAlignmentType()
 * @model
 * @generated
 */
public enum HAlignmentType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(1, "LEFT", "LEFT"),

	/**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(2, "CENTER", "CENTER"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(3, "RIGHT", "RIGHT"),
	
	/**
	 * The '<em><b>BOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(4, "BOTH", "BOTH");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 1;

	/**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 2;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 3;
	
	/**
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 4;

	/**
	 * An array of all the '<em><b>HAlignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HAlignmentType[] VALUES_ARRAY =
		new HAlignmentType[] {
			NONE,
			LEFT,
			CENTER,
			RIGHT,
			BOTH,
		};

	/**
	 * A public read-only list of all the '<em><b>HAlignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HAlignmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HAlignment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HAlignmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HAlignmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HAlignment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HAlignmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HAlignmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HAlignment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HAlignmentType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LEFT_VALUE: return LEFT;
			case CENTER_VALUE: return CENTER;
			case RIGHT_VALUE: return RIGHT;
			case BOTH_VALUE: return BOTH;
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
	private HAlignmentType(int value, String name, String literal) {
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
	
} //HAlignmentType
