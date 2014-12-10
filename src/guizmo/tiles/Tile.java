/**
 */
package guizmo.tiles;

import guizmo.structure.GraphicalElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.tiles.Tile#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getUp <em>Up</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getDown <em>Down</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getLeft <em>Left</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getRight <em>Right</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getElement <em>Element</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getXMinPos <em>XMin Pos</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getXMaxPos <em>XMax Pos</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getYMinPos <em>YMin Pos</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getYMaxPos <em>YMax Pos</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getHSize <em>HSize</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getVSize <em>VSize</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getAssociationKind <em>Association Kind</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getTileType <em>Tile Type</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getSubtiles <em>Subtiles</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getRelations <em>Relations</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getLeftMargin <em>Left Margin</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getRightMargin <em>Right Margin</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getTopMargin <em>Top Margin</em>}</li>
 *   <li>{@link guizmo.tiles.Tile#getBottomMargin <em>Bottom Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.tiles.TilesPackage#getTile()
 * @model abstract="true"
 * @generated
 */
public interface Tile extends NamedElement, AlignedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Relation}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Outgoing()
	 * @see guizmo.tiles.Relation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Relation> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Relation}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Incoming()
	 * @see guizmo.tiles.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getIncoming();

	/**
	 * Returns the value of the '<em><b>Up</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Up()
	 * @see guizmo.tiles.Tile#getDown
	 * @model opposite="down"
	 * @generated
	 */
	EList<Tile> getUp();

	/**
	 * Returns the value of the '<em><b>Down</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Down()
	 * @see guizmo.tiles.Tile#getUp
	 * @model opposite="up"
	 * @generated
	 */
	EList<Tile> getDown();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Left()
	 * @see guizmo.tiles.Tile#getRight
	 * @model opposite="right"
	 * @generated
	 */
	EList<Tile> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * It is bidirectional and its opposite is '{@link guizmo.tiles.Tile#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Right()
	 * @see guizmo.tiles.Tile#getLeft
	 * @model opposite="left"
	 * @generated
	 */
	EList<Tile> getRight();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(GraphicalElement)
	 * @see guizmo.tiles.TilesPackage#getTile_Element()
	 * @model required="true"
	 * @generated
	 */
	GraphicalElement getElement();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GraphicalElement value);

	/**
	 * Returns the value of the '<em><b>XMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMin Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMin Pos</em>' attribute.
	 * @see #setXMinPos(int)
	 * @see guizmo.tiles.TilesPackage#getTile_XMinPos()
	 * @model
	 * @generated
	 */
	int getXMinPos();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getXMinPos <em>XMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMin Pos</em>' attribute.
	 * @see #getXMinPos()
	 * @generated
	 */
	void setXMinPos(int value);

	/**
	 * Returns the value of the '<em><b>XMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMax Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMax Pos</em>' attribute.
	 * @see #setXMaxPos(int)
	 * @see guizmo.tiles.TilesPackage#getTile_XMaxPos()
	 * @model
	 * @generated
	 */
	int getXMaxPos();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getXMaxPos <em>XMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMax Pos</em>' attribute.
	 * @see #getXMaxPos()
	 * @generated
	 */
	void setXMaxPos(int value);

	/**
	 * Returns the value of the '<em><b>YMin Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YMin Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMin Pos</em>' attribute.
	 * @see #setYMinPos(int)
	 * @see guizmo.tiles.TilesPackage#getTile_YMinPos()
	 * @model
	 * @generated
	 */
	int getYMinPos();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getYMinPos <em>YMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMin Pos</em>' attribute.
	 * @see #getYMinPos()
	 * @generated
	 */
	void setYMinPos(int value);

	/**
	 * Returns the value of the '<em><b>YMax Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YMax Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMax Pos</em>' attribute.
	 * @see #setYMaxPos(int)
	 * @see guizmo.tiles.TilesPackage#getTile_YMaxPos()
	 * @model
	 * @generated
	 */
	int getYMaxPos();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getYMaxPos <em>YMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMax Pos</em>' attribute.
	 * @see #getYMaxPos()
	 * @generated
	 */
	void setYMaxPos(int value);

	/**
	 * Returns the value of the '<em><b>HSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HSize</em>' attribute.
	 * @see #setHSize(float)
	 * @see guizmo.tiles.TilesPackage#getTile_HSize()
	 * @model annotation="http://www.modelum.es/guizmo comment='Represents a percentage of the horizontal space that takes up. Values are normalized between [0,1], so a 0.6 represents a 60%.'"
	 * @generated
	 */
	float getHSize();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getHSize <em>HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HSize</em>' attribute.
	 * @see #getHSize()
	 * @generated
	 */
	void setHSize(float value);

	/**
	 * Returns the value of the '<em><b>VSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSize</em>' attribute.
	 * @see #setVSize(float)
	 * @see guizmo.tiles.TilesPackage#getTile_VSize()
	 * @model annotation="http://www.modelum.es/guizmo comment='Represents a percentage of the vertical space that takes up. Values are normalized between [0,1], so a 0.6 represents a 60%.'"
	 * @generated
	 */
	float getVSize();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getVSize <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSize</em>' attribute.
	 * @see #getVSize()
	 * @generated
	 */
	void setVSize(float value);

	/**
	 * Returns the value of the '<em><b>Association Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.AssociationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Kind</em>' attribute.
	 * @see guizmo.tiles.AssociationKind
	 * @see #setAssociationKind(AssociationKind)
	 * @see guizmo.tiles.TilesPackage#getTile_AssociationKind()
	 * @model
	 * @generated
	 */
	AssociationKind getAssociationKind();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getAssociationKind <em>Association Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Kind</em>' attribute.
	 * @see guizmo.tiles.AssociationKind
	 * @see #getAssociationKind()
	 * @generated
	 */
	void setAssociationKind(AssociationKind value);

	/**
	 * Returns the value of the '<em><b>Tile Type</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.tiles.TileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Type</em>' attribute.
	 * @see guizmo.tiles.TileType
	 * @see #setTileType(TileType)
	 * @see guizmo.tiles.TilesPackage#getTile_TileType()
	 * @model
	 * @generated
	 */
	TileType getTileType();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getTileType <em>Tile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Type</em>' attribute.
	 * @see guizmo.tiles.TileType
	 * @see #getTileType()
	 * @generated
	 */
	void setTileType(TileType value);

	/**
	 * Returns the value of the '<em><b>Subtiles</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.tiles.Tile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtiles</em>' containment reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Subtiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tile> getSubtiles();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.tiles.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see guizmo.tiles.TilesPackage#getTile_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Left Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Margin</em>' attribute.
	 * @see #setLeftMargin(float)
	 * @see guizmo.tiles.TilesPackage#getTile_LeftMargin()
	 * @model
	 * @generated
	 */
	float getLeftMargin();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getLeftMargin <em>Left Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Margin</em>' attribute.
	 * @see #getLeftMargin()
	 * @generated
	 */
	void setLeftMargin(float value);

	/**
	 * Returns the value of the '<em><b>Right Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Margin</em>' attribute.
	 * @see #setRightMargin(float)
	 * @see guizmo.tiles.TilesPackage#getTile_RightMargin()
	 * @model
	 * @generated
	 */
	float getRightMargin();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getRightMargin <em>Right Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Margin</em>' attribute.
	 * @see #getRightMargin()
	 * @generated
	 */
	void setRightMargin(float value);

	/**
	 * Returns the value of the '<em><b>Top Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Margin</em>' attribute.
	 * @see #setTopMargin(float)
	 * @see guizmo.tiles.TilesPackage#getTile_TopMargin()
	 * @model
	 * @generated
	 */
	float getTopMargin();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getTopMargin <em>Top Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Margin</em>' attribute.
	 * @see #getTopMargin()
	 * @generated
	 */
	void setTopMargin(float value);

	/**
	 * Returns the value of the '<em><b>Bottom Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Margin</em>' attribute.
	 * @see #setBottomMargin(float)
	 * @see guizmo.tiles.TilesPackage#getTile_BottomMargin()
	 * @model
	 * @generated
	 */
	float getBottomMargin();

	/**
	 * Sets the value of the '{@link guizmo.tiles.Tile#getBottomMargin <em>Bottom Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Margin</em>' attribute.
	 * @see #getBottomMargin()
	 * @generated
	 */
	void setBottomMargin(float value);

} // Tile
