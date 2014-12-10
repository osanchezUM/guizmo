/**
 */
package guizmo.tiles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.tiles.Relation#getName <em>Name</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#getXInterval <em>XInterval</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#getYInterval <em>YInterval</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#getCloseness <em>Closeness</em>}</li>
 *   <li>{@link guizmo.tiles.Relation#isJoined <em>Joined</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.tiles.TilesPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see guizmo.tiles.TilesPackage#getRelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Tile)
	 * @see guizmo.tiles.TilesPackage#getRelation_Source()
	 * @see guizmo.tiles.Tile#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Tile getSource();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Tile value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Tile)
	 * @see guizmo.tiles.TilesPackage#getRelation_Target()
	 * @see guizmo.tiles.Tile#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Tile getTarget();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Tile value);

	/**
	 * Returns the value of the '<em><b>XInterval</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.AllenIntervalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XInterval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XInterval</em>' attribute.
	 * @see guizmo.tiles.AllenIntervalType
	 * @see #setXInterval(AllenIntervalType)
	 * @see guizmo.tiles.TilesPackage#getRelation_XInterval()
	 * @model required="true"
	 * @generated
	 */
	AllenIntervalType getXInterval();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getXInterval <em>XInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XInterval</em>' attribute.
	 * @see guizmo.tiles.AllenIntervalType
	 * @see #getXInterval()
	 * @generated
	 */
	void setXInterval(AllenIntervalType value);

	/**
	 * Returns the value of the '<em><b>YInterval</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.AllenIntervalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YInterval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YInterval</em>' attribute.
	 * @see guizmo.tiles.AllenIntervalType
	 * @see #setYInterval(AllenIntervalType)
	 * @see guizmo.tiles.TilesPackage#getRelation_YInterval()
	 * @model required="true"
	 * @generated
	 */
	AllenIntervalType getYInterval();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getYInterval <em>YInterval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YInterval</em>' attribute.
	 * @see guizmo.tiles.AllenIntervalType
	 * @see #getYInterval()
	 * @generated
	 */
	void setYInterval(AllenIntervalType value);

	/**
	 * Returns the value of the '<em><b>Closeness</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.ClosenessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closeness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closeness</em>' attribute.
	 * @see guizmo.tiles.ClosenessType
	 * @see #setCloseness(ClosenessType)
	 * @see guizmo.tiles.TilesPackage#getRelation_Closeness()
	 * @model required="true"
	 * @generated
	 */
	ClosenessType getCloseness();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#getCloseness <em>Closeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closeness</em>' attribute.
	 * @see guizmo.tiles.ClosenessType
	 * @see #getCloseness()
	 * @generated
	 */
	void setCloseness(ClosenessType value);

	/**
	 * Returns the value of the '<em><b>Joined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined</em>' attribute.
	 * @see #setJoined(boolean)
	 * @see guizmo.tiles.TilesPackage#getRelation_Joined()
	 * @model
	 * @generated
	 */
	boolean isJoined();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Relation#isJoined <em>Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joined</em>' attribute.
	 * @see #isJoined()
	 * @generated
	 */
	void setJoined(boolean value);

} // Relation
