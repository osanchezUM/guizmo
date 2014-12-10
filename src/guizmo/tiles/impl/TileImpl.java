/**
 */
package guizmo.tiles.impl;

import guizmo.structure.GraphicalElement;

import guizmo.tiles.AlignedElement;
import guizmo.tiles.AssociationKind;
import guizmo.tiles.HAlignmentType;
import guizmo.tiles.Relation;
import guizmo.tiles.Tile;
import guizmo.tiles.TileType;
import guizmo.tiles.TilesPackage;
import guizmo.tiles.VAlignmentType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getUp <em>Up</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getDown <em>Down</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getRight <em>Right</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getElement <em>Element</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getXMinPos <em>XMin Pos</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getXMaxPos <em>XMax Pos</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getYMinPos <em>YMin Pos</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getYMaxPos <em>YMax Pos</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getHSize <em>HSize</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getVSize <em>VSize</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getAssociationKind <em>Association Kind</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getTileType <em>Tile Type</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getSubtiles <em>Subtiles</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getLeftMargin <em>Left Margin</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getRightMargin <em>Right Margin</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getTopMargin <em>Top Margin</em>}</li>
 *   <li>{@link guizmo.tiles.impl.TileImpl#getBottomMargin <em>Bottom Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TileImpl extends NamedElementImpl implements Tile {
	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VAlignmentType VERTICAL_ALIGNMENT_EDEFAULT = VAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected VAlignmentType verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final HAlignmentType HORIZONTAL_ALIGNMENT_EDEFAULT = HAlignmentType.NONE;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected HAlignmentType horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incoming;

	/**
	 * The cached value of the '{@link #getUp() <em>Up</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUp()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> up;

	/**
	 * The cached value of the '{@link #getDown() <em>Down</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDown()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> down;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> right;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected GraphicalElement element;

	/**
	 * The default value of the '{@link #getXMinPos() <em>XMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMinPos()
	 * @generated
	 * @ordered
	 */
	protected static final int XMIN_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXMinPos() <em>XMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMinPos()
	 * @generated
	 * @ordered
	 */
	protected int xMinPos = XMIN_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMaxPos() <em>XMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMaxPos()
	 * @generated
	 * @ordered
	 */
	protected static final int XMAX_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXMaxPos() <em>XMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMaxPos()
	 * @generated
	 * @ordered
	 */
	protected int xMaxPos = XMAX_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMinPos() <em>YMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMinPos()
	 * @generated
	 * @ordered
	 */
	protected static final int YMIN_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYMinPos() <em>YMin Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMinPos()
	 * @generated
	 * @ordered
	 */
	protected int yMinPos = YMIN_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMaxPos() <em>YMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMaxPos()
	 * @generated
	 * @ordered
	 */
	protected static final int YMAX_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYMaxPos() <em>YMax Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMaxPos()
	 * @generated
	 * @ordered
	 */
	protected int yMaxPos = YMAX_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHSize() <em>HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSize()
	 * @generated
	 * @ordered
	 */
	protected static final float HSIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHSize() <em>HSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSize()
	 * @generated
	 * @ordered
	 */
	protected float hSize = HSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSize() <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSize()
	 * @generated
	 * @ordered
	 */
	protected static final float VSIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVSize() <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSize()
	 * @generated
	 * @ordered
	 */
	protected float vSize = VSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociationKind() <em>Association Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationKind()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationKind ASSOCIATION_KIND_EDEFAULT = AssociationKind.NONE;

	/**
	 * The cached value of the '{@link #getAssociationKind() <em>Association Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationKind()
	 * @generated
	 * @ordered
	 */
	protected AssociationKind associationKind = ASSOCIATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileType() <em>Tile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileType()
	 * @generated
	 * @ordered
	 */
	protected static final TileType TILE_TYPE_EDEFAULT = TileType.COARSE;

	/**
	 * The cached value of the '{@link #getTileType() <em>Tile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileType()
	 * @generated
	 * @ordered
	 */
	protected TileType tileType = TILE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtiles() <em>Subtiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> subtiles;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The default value of the '{@link #getLeftMargin() <em>Left Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMargin()
	 * @generated
	 * @ordered
	 */
	protected static final float LEFT_MARGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeftMargin() <em>Left Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftMargin()
	 * @generated
	 * @ordered
	 */
	protected float leftMargin = LEFT_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightMargin() <em>Right Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMargin()
	 * @generated
	 * @ordered
	 */
	protected static final float RIGHT_MARGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRightMargin() <em>Right Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightMargin()
	 * @generated
	 * @ordered
	 */
	protected float rightMargin = RIGHT_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopMargin() <em>Top Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMargin()
	 * @generated
	 * @ordered
	 */
	protected static final float TOP_MARGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTopMargin() <em>Top Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopMargin()
	 * @generated
	 * @ordered
	 */
	protected float topMargin = TOP_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottomMargin() <em>Bottom Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomMargin()
	 * @generated
	 * @ordered
	 */
	protected static final float BOTTOM_MARGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBottomMargin() <em>Bottom Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomMargin()
	 * @generated
	 * @ordered
	 */
	protected float bottomMargin = BOTTOM_MARGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TilesPackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAlignmentType getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(VAlignmentType newVerticalAlignment) {
		VAlignmentType oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAlignmentType getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(HAlignmentType newHorizontalAlignment) {
		HAlignmentType oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, TilesPackage.TILE__OUTGOING, TilesPackage.RELATION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, TilesPackage.TILE__INCOMING, TilesPackage.RELATION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getUp() {
		if (up == null) {
			up = new EObjectWithInverseResolvingEList.ManyInverse<Tile>(Tile.class, this, TilesPackage.TILE__UP, TilesPackage.TILE__DOWN);
		}
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getDown() {
		if (down == null) {
			down = new EObjectWithInverseResolvingEList.ManyInverse<Tile>(Tile.class, this, TilesPackage.TILE__DOWN, TilesPackage.TILE__UP);
		}
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getLeft() {
		if (left == null) {
			left = new EObjectWithInverseResolvingEList.ManyInverse<Tile>(Tile.class, this, TilesPackage.TILE__LEFT, TilesPackage.TILE__RIGHT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getRight() {
		if (right == null) {
			right = new EObjectWithInverseResolvingEList.ManyInverse<Tile>(Tile.class, this, TilesPackage.TILE__RIGHT, TilesPackage.TILE__LEFT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (GraphicalElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TilesPackage.TILE__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(GraphicalElement newElement) {
		GraphicalElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXMinPos() {
		return xMinPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMinPos(int newXMinPos) {
		int oldXMinPos = xMinPos;
		xMinPos = newXMinPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__XMIN_POS, oldXMinPos, xMinPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXMaxPos() {
		return xMaxPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMaxPos(int newXMaxPos) {
		int oldXMaxPos = xMaxPos;
		xMaxPos = newXMaxPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__XMAX_POS, oldXMaxPos, xMaxPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYMinPos() {
		return yMinPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMinPos(int newYMinPos) {
		int oldYMinPos = yMinPos;
		yMinPos = newYMinPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__YMIN_POS, oldYMinPos, yMinPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYMaxPos() {
		return yMaxPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMaxPos(int newYMaxPos) {
		int oldYMaxPos = yMaxPos;
		yMaxPos = newYMaxPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__YMAX_POS, oldYMaxPos, yMaxPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHSize() {
		return hSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHSize(float newHSize) {
		float oldHSize = hSize;
		hSize = newHSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__HSIZE, oldHSize, hSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVSize() {
		return vSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSize(float newVSize) {
		float oldVSize = vSize;
		vSize = newVSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__VSIZE, oldVSize, vSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationKind getAssociationKind() {
		return associationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationKind(AssociationKind newAssociationKind) {
		AssociationKind oldAssociationKind = associationKind;
		associationKind = newAssociationKind == null ? ASSOCIATION_KIND_EDEFAULT : newAssociationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__ASSOCIATION_KIND, oldAssociationKind, associationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileType getTileType() {
		return tileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTileType(TileType newTileType) {
		TileType oldTileType = tileType;
		tileType = newTileType == null ? TILE_TYPE_EDEFAULT : newTileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__TILE_TYPE, oldTileType, tileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getSubtiles() {
		if (subtiles == null) {
			subtiles = new EObjectContainmentEList<Tile>(Tile.class, this, TilesPackage.TILE__SUBTILES);
		}
		return subtiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, TilesPackage.TILE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeftMargin() {
		return leftMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMargin(float newLeftMargin) {
		float oldLeftMargin = leftMargin;
		leftMargin = newLeftMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__LEFT_MARGIN, oldLeftMargin, leftMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRightMargin() {
		return rightMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMargin(float newRightMargin) {
		float oldRightMargin = rightMargin;
		rightMargin = newRightMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__RIGHT_MARGIN, oldRightMargin, rightMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTopMargin() {
		return topMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopMargin(float newTopMargin) {
		float oldTopMargin = topMargin;
		topMargin = newTopMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__TOP_MARGIN, oldTopMargin, topMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBottomMargin() {
		return bottomMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomMargin(float newBottomMargin) {
		float oldBottomMargin = bottomMargin;
		bottomMargin = newBottomMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TilesPackage.TILE__BOTTOM_MARGIN, oldBottomMargin, bottomMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TilesPackage.TILE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case TilesPackage.TILE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case TilesPackage.TILE__UP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUp()).basicAdd(otherEnd, msgs);
			case TilesPackage.TILE__DOWN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDown()).basicAdd(otherEnd, msgs);
			case TilesPackage.TILE__LEFT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeft()).basicAdd(otherEnd, msgs);
			case TilesPackage.TILE__RIGHT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRight()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TilesPackage.TILE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__UP:
				return ((InternalEList<?>)getUp()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__DOWN:
				return ((InternalEList<?>)getDown()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__SUBTILES:
				return ((InternalEList<?>)getSubtiles()).basicRemove(otherEnd, msgs);
			case TilesPackage.TILE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TilesPackage.TILE__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case TilesPackage.TILE__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case TilesPackage.TILE__OUTGOING:
				return getOutgoing();
			case TilesPackage.TILE__INCOMING:
				return getIncoming();
			case TilesPackage.TILE__UP:
				return getUp();
			case TilesPackage.TILE__DOWN:
				return getDown();
			case TilesPackage.TILE__LEFT:
				return getLeft();
			case TilesPackage.TILE__RIGHT:
				return getRight();
			case TilesPackage.TILE__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case TilesPackage.TILE__XMIN_POS:
				return getXMinPos();
			case TilesPackage.TILE__XMAX_POS:
				return getXMaxPos();
			case TilesPackage.TILE__YMIN_POS:
				return getYMinPos();
			case TilesPackage.TILE__YMAX_POS:
				return getYMaxPos();
			case TilesPackage.TILE__HSIZE:
				return getHSize();
			case TilesPackage.TILE__VSIZE:
				return getVSize();
			case TilesPackage.TILE__ASSOCIATION_KIND:
				return getAssociationKind();
			case TilesPackage.TILE__TILE_TYPE:
				return getTileType();
			case TilesPackage.TILE__SUBTILES:
				return getSubtiles();
			case TilesPackage.TILE__RELATIONS:
				return getRelations();
			case TilesPackage.TILE__LEFT_MARGIN:
				return getLeftMargin();
			case TilesPackage.TILE__RIGHT_MARGIN:
				return getRightMargin();
			case TilesPackage.TILE__TOP_MARGIN:
				return getTopMargin();
			case TilesPackage.TILE__BOTTOM_MARGIN:
				return getBottomMargin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TilesPackage.TILE__VERTICAL_ALIGNMENT:
				setVerticalAlignment((VAlignmentType)newValue);
				return;
			case TilesPackage.TILE__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((HAlignmentType)newValue);
				return;
			case TilesPackage.TILE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
				return;
			case TilesPackage.TILE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Relation>)newValue);
				return;
			case TilesPackage.TILE__UP:
				getUp().clear();
				getUp().addAll((Collection<? extends Tile>)newValue);
				return;
			case TilesPackage.TILE__DOWN:
				getDown().clear();
				getDown().addAll((Collection<? extends Tile>)newValue);
				return;
			case TilesPackage.TILE__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends Tile>)newValue);
				return;
			case TilesPackage.TILE__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends Tile>)newValue);
				return;
			case TilesPackage.TILE__ELEMENT:
				setElement((GraphicalElement)newValue);
				return;
			case TilesPackage.TILE__XMIN_POS:
				setXMinPos((Integer)newValue);
				return;
			case TilesPackage.TILE__XMAX_POS:
				setXMaxPos((Integer)newValue);
				return;
			case TilesPackage.TILE__YMIN_POS:
				setYMinPos((Integer)newValue);
				return;
			case TilesPackage.TILE__YMAX_POS:
				setYMaxPos((Integer)newValue);
				return;
			case TilesPackage.TILE__HSIZE:
				setHSize((Float)newValue);
				return;
			case TilesPackage.TILE__VSIZE:
				setVSize((Float)newValue);
				return;
			case TilesPackage.TILE__ASSOCIATION_KIND:
				setAssociationKind((AssociationKind)newValue);
				return;
			case TilesPackage.TILE__TILE_TYPE:
				setTileType((TileType)newValue);
				return;
			case TilesPackage.TILE__SUBTILES:
				getSubtiles().clear();
				getSubtiles().addAll((Collection<? extends Tile>)newValue);
				return;
			case TilesPackage.TILE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case TilesPackage.TILE__LEFT_MARGIN:
				setLeftMargin((Float)newValue);
				return;
			case TilesPackage.TILE__RIGHT_MARGIN:
				setRightMargin((Float)newValue);
				return;
			case TilesPackage.TILE__TOP_MARGIN:
				setTopMargin((Float)newValue);
				return;
			case TilesPackage.TILE__BOTTOM_MARGIN:
				setBottomMargin((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TilesPackage.TILE__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case TilesPackage.TILE__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case TilesPackage.TILE__OUTGOING:
				getOutgoing().clear();
				return;
			case TilesPackage.TILE__INCOMING:
				getIncoming().clear();
				return;
			case TilesPackage.TILE__UP:
				getUp().clear();
				return;
			case TilesPackage.TILE__DOWN:
				getDown().clear();
				return;
			case TilesPackage.TILE__LEFT:
				getLeft().clear();
				return;
			case TilesPackage.TILE__RIGHT:
				getRight().clear();
				return;
			case TilesPackage.TILE__ELEMENT:
				setElement((GraphicalElement)null);
				return;
			case TilesPackage.TILE__XMIN_POS:
				setXMinPos(XMIN_POS_EDEFAULT);
				return;
			case TilesPackage.TILE__XMAX_POS:
				setXMaxPos(XMAX_POS_EDEFAULT);
				return;
			case TilesPackage.TILE__YMIN_POS:
				setYMinPos(YMIN_POS_EDEFAULT);
				return;
			case TilesPackage.TILE__YMAX_POS:
				setYMaxPos(YMAX_POS_EDEFAULT);
				return;
			case TilesPackage.TILE__HSIZE:
				setHSize(HSIZE_EDEFAULT);
				return;
			case TilesPackage.TILE__VSIZE:
				setVSize(VSIZE_EDEFAULT);
				return;
			case TilesPackage.TILE__ASSOCIATION_KIND:
				setAssociationKind(ASSOCIATION_KIND_EDEFAULT);
				return;
			case TilesPackage.TILE__TILE_TYPE:
				setTileType(TILE_TYPE_EDEFAULT);
				return;
			case TilesPackage.TILE__SUBTILES:
				getSubtiles().clear();
				return;
			case TilesPackage.TILE__RELATIONS:
				getRelations().clear();
				return;
			case TilesPackage.TILE__LEFT_MARGIN:
				setLeftMargin(LEFT_MARGIN_EDEFAULT);
				return;
			case TilesPackage.TILE__RIGHT_MARGIN:
				setRightMargin(RIGHT_MARGIN_EDEFAULT);
				return;
			case TilesPackage.TILE__TOP_MARGIN:
				setTopMargin(TOP_MARGIN_EDEFAULT);
				return;
			case TilesPackage.TILE__BOTTOM_MARGIN:
				setBottomMargin(BOTTOM_MARGIN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TilesPackage.TILE__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
			case TilesPackage.TILE__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
			case TilesPackage.TILE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case TilesPackage.TILE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case TilesPackage.TILE__UP:
				return up != null && !up.isEmpty();
			case TilesPackage.TILE__DOWN:
				return down != null && !down.isEmpty();
			case TilesPackage.TILE__LEFT:
				return left != null && !left.isEmpty();
			case TilesPackage.TILE__RIGHT:
				return right != null && !right.isEmpty();
			case TilesPackage.TILE__ELEMENT:
				return element != null;
			case TilesPackage.TILE__XMIN_POS:
				return xMinPos != XMIN_POS_EDEFAULT;
			case TilesPackage.TILE__XMAX_POS:
				return xMaxPos != XMAX_POS_EDEFAULT;
			case TilesPackage.TILE__YMIN_POS:
				return yMinPos != YMIN_POS_EDEFAULT;
			case TilesPackage.TILE__YMAX_POS:
				return yMaxPos != YMAX_POS_EDEFAULT;
			case TilesPackage.TILE__HSIZE:
				return hSize != HSIZE_EDEFAULT;
			case TilesPackage.TILE__VSIZE:
				return vSize != VSIZE_EDEFAULT;
			case TilesPackage.TILE__ASSOCIATION_KIND:
				return associationKind != ASSOCIATION_KIND_EDEFAULT;
			case TilesPackage.TILE__TILE_TYPE:
				return tileType != TILE_TYPE_EDEFAULT;
			case TilesPackage.TILE__SUBTILES:
				return subtiles != null && !subtiles.isEmpty();
			case TilesPackage.TILE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case TilesPackage.TILE__LEFT_MARGIN:
				return leftMargin != LEFT_MARGIN_EDEFAULT;
			case TilesPackage.TILE__RIGHT_MARGIN:
				return rightMargin != RIGHT_MARGIN_EDEFAULT;
			case TilesPackage.TILE__TOP_MARGIN:
				return topMargin != TOP_MARGIN_EDEFAULT;
			case TilesPackage.TILE__BOTTOM_MARGIN:
				return bottomMargin != BOTTOM_MARGIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AlignedElement.class) {
			switch (derivedFeatureID) {
				case TilesPackage.TILE__VERTICAL_ALIGNMENT: return TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT;
				case TilesPackage.TILE__HORIZONTAL_ALIGNMENT: return TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AlignedElement.class) {
			switch (baseFeatureID) {
				case TilesPackage.ALIGNED_ELEMENT__VERTICAL_ALIGNMENT: return TilesPackage.TILE__VERTICAL_ALIGNMENT;
				case TilesPackage.ALIGNED_ELEMENT__HORIZONTAL_ALIGNMENT: return TilesPackage.TILE__HORIZONTAL_ALIGNMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", xMinPos: ");
		result.append(xMinPos);
		result.append(", xMaxPos: ");
		result.append(xMaxPos);
		result.append(", yMinPos: ");
		result.append(yMinPos);
		result.append(", yMaxPos: ");
		result.append(yMaxPos);
		result.append(", hSize: ");
		result.append(hSize);
		result.append(", vSize: ");
		result.append(vSize);
		result.append(", associationKind: ");
		result.append(associationKind);
		result.append(", tileType: ");
		result.append(tileType);
		result.append(", leftMargin: ");
		result.append(leftMargin);
		result.append(", rightMargin: ");
		result.append(rightMargin);
		result.append(", topMargin: ");
		result.append(topMargin);
		result.append(", bottomMargin: ");
		result.append(bottomMargin);
		result.append(')');
		return result.toString();
	}

} //TileImpl
