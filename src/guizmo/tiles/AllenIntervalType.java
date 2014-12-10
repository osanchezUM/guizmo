/**
 */
package guizmo.tiles;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allen Interval Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see guizmo.tiles.TilesPackage#getAllenIntervalType()
 * @model
 * @generated
 */
public enum AllenIntervalType implements Enumerator {
	/**
	 * The '<em><b>BEFORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(0, "BEFORE", "BEFORE"),

	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(1, "AFTER", "AFTER"),

	/**
	 * The '<em><b>MEETS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEETS_VALUE
	 * @generated
	 * @ordered
	 */
	MEETS(2, "MEETS", "MEETS"),

	/**
	 * The '<em><b>MET BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MET_BY_VALUE
	 * @generated
	 * @ordered
	 */
	MET_BY(3, "MET_BY", "MET_BY"),

	/**
	 * The '<em><b>STARTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_VALUE
	 * @generated
	 * @ordered
	 */
	STARTS(4, "STARTS", "STARTS"),

	/**
	 * The '<em><b>STARTED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	STARTED_BY(5, "STARTED_BY", "STARTED_BY"),

	/**
	 * The '<em><b>FINISHES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHES_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHES(6, "FINISHES", "FINISHES"),

	/**
	 * The '<em><b>FINISHED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED_BY(7, "FINISHED_BY", "FINISHED_BY"),

	/**
	 * The '<em><b>DURING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURING_VALUE
	 * @generated
	 * @ordered
	 */
	DURING(8, "DURING", "DURING"),

	/**
	 * The '<em><b>CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(9, "CONTAINS", "CONTAINS"),

	/**
	 * The '<em><b>OVERLAPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPS(10, "OVERLAPS", "OVERLAPS"),

	/**
	 * The '<em><b>OVERLAPPED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPPED_BY(11, "OVERLAPPED_BY", "OVERLAPPED_BY"),

	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(12, "EQUAL", "EQUAL");

	/**
	 * The '<em><b>BEFORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEFORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 0;

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AFTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 1;

	/**
	 * The '<em><b>MEETS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEETS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEETS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEETS_VALUE = 2;

	/**
	 * The '<em><b>MET BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MET BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MET_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MET_BY_VALUE = 3;

	/**
	 * The '<em><b>STARTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTS_VALUE = 4;

	/**
	 * The '<em><b>STARTED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STARTED BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTED_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTED_BY_VALUE = 5;

	/**
	 * The '<em><b>FINISHES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINISHES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINISHES_VALUE = 6;

	/**
	 * The '<em><b>FINISHED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINISHED BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHED_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_BY_VALUE = 7;

	/**
	 * The '<em><b>DURING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DURING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DURING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DURING_VALUE = 8;

	/**
	 * The '<em><b>CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTAINS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 9;

	/**
	 * The '<em><b>OVERLAPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERLAPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPS_VALUE = 10;

	/**
	 * The '<em><b>OVERLAPPED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERLAPPED BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPED_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPPED_BY_VALUE = 11;

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Allen Interval Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllenIntervalType[] VALUES_ARRAY =
		new AllenIntervalType[] {
			BEFORE,
			AFTER,
			MEETS,
			MET_BY,
			STARTS,
			STARTED_BY,
			FINISHES,
			FINISHED_BY,
			DURING,
			CONTAINS,
			OVERLAPS,
			OVERLAPPED_BY,
			EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Allen Interval Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllenIntervalType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allen Interval Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllenIntervalType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllenIntervalType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allen Interval Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllenIntervalType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllenIntervalType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allen Interval Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllenIntervalType get(int value) {
		switch (value) {
			case BEFORE_VALUE: return BEFORE;
			case AFTER_VALUE: return AFTER;
			case MEETS_VALUE: return MEETS;
			case MET_BY_VALUE: return MET_BY;
			case STARTS_VALUE: return STARTS;
			case STARTED_BY_VALUE: return STARTED_BY;
			case FINISHES_VALUE: return FINISHES;
			case FINISHED_BY_VALUE: return FINISHED_BY;
			case DURING_VALUE: return DURING;
			case CONTAINS_VALUE: return CONTAINS;
			case OVERLAPS_VALUE: return OVERLAPS;
			case OVERLAPPED_BY_VALUE: return OVERLAPPED_BY;
			case EQUAL_VALUE: return EQUAL;
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
	private AllenIntervalType(int value, String name, String literal) {
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
	
} //AllenIntervalType
