/**
 */
package guizmo.layout;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link guizmo.layout.Layout#getSublayouts <em>Sublayouts</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getParentLayout <em>Parent Layout</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getRefNode <em>Ref Node</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getAbsHAlignment <em>Abs HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getAbsVAlignment <em>Abs VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getContentHAlignment <em>Content HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getContentVAlignment <em>Content VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getParentHAlignment <em>Parent HAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getParentVAlignment <em>Parent VAlignment</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getHSize <em>HSize</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getVSize <em>VSize</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getFitness <em>Fitness</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getGaps <em>Gaps</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getRefGaps <em>Ref Gaps</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getMargins <em>Margins</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getLborder <em>Lborder</em>}</li>
 *   <li>{@link guizmo.layout.Layout#getRborder <em>Rborder</em>}</li>
 * </ul>
 * </p>
 *
 * @see guizmo.layout.LayoutPackage#getLayout()
 * @model abstract="true"
 * @generated
 */
public interface Layout extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sublayouts</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.Layout}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getParentLayout <em>Parent Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sublayouts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublayouts</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayout_Sublayouts()
	 * @see guizmo.layout.Layout#getParentLayout
	 * @model opposite="parentLayout" containment="true" required="true"
	 * @generated
	 */
	EList<Layout> getSublayouts();

	/**
	 * Returns the value of the '<em><b>Parent Layout</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Layout#getSublayouts <em>Sublayouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Layout</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Layout</em>' container reference.
	 * @see #setParentLayout(Layout)
	 * @see guizmo.layout.LayoutPackage#getLayout_ParentLayout()
	 * @see guizmo.layout.Layout#getSublayouts
	 * @model opposite="sublayouts" transient="false"
	 * @generated
	 */
	Layout getParentLayout();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getParentLayout <em>Parent Layout</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Layout</em>' container reference.
	 * @see #getParentLayout()
	 * @generated
	 */
	void setParentLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Ref Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.LayoutInfoTreeNode#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Node</em>' reference.
	 * @see #setRefNode(LayoutInfoTreeNode)
	 * @see guizmo.layout.LayoutPackage#getLayout_RefNode()
	 * @see guizmo.layout.LayoutInfoTreeNode#getReferredBy
	 * @model opposite="referredBy"
	 * @generated
	 */
	LayoutInfoTreeNode getRefNode();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getRefNode <em>Ref Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Node</em>' reference.
	 * @see #getRefNode()
	 * @generated
	 */
	void setRefNode(LayoutInfoTreeNode value);

	/**
	 * Returns the value of the '<em><b>Abs HAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.HAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abs HAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #setAbsHAlignment(HAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_AbsHAlignment()
	 * @model
	 * @generated
	 */
	HAlignmentType getAbsHAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getAbsHAlignment <em>Abs HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #getAbsHAlignment()
	 * @generated
	 */
	void setAbsHAlignment(HAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Abs VAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.VAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abs VAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abs VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #setAbsVAlignment(VAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_AbsVAlignment()
	 * @model
	 * @generated
	 */
	VAlignmentType getAbsVAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getAbsVAlignment <em>Abs VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abs VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #getAbsVAlignment()
	 * @generated
	 */
	void setAbsVAlignment(VAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Content HAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.HAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content HAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #setContentHAlignment(HAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_ContentHAlignment()
	 * @model
	 * @generated
	 */
	HAlignmentType getContentHAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getContentHAlignment <em>Content HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #getContentHAlignment()
	 * @generated
	 */
	void setContentHAlignment(HAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Content VAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.VAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content VAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #setContentVAlignment(VAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_ContentVAlignment()
	 * @model
	 * @generated
	 */
	VAlignmentType getContentVAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getContentVAlignment <em>Content VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #getContentVAlignment()
	 * @generated
	 */
	void setContentVAlignment(VAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Parent HAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.HAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent HAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #setParentHAlignment(HAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_ParentHAlignment()
	 * @model
	 * @generated
	 */
	HAlignmentType getParentHAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getParentHAlignment <em>Parent HAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent HAlignment</em>' attribute.
	 * @see guizmo.layout.HAlignmentType
	 * @see #getParentHAlignment()
	 * @generated
	 */
	void setParentHAlignment(HAlignmentType value);

	/**
	 * Returns the value of the '<em><b>Parent VAlignment</b></em>' attribute.
	 * The literals are from the enumeration {@link guizmo.layout.VAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent VAlignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #setParentVAlignment(VAlignmentType)
	 * @see guizmo.layout.LayoutPackage#getLayout_ParentVAlignment()
	 * @model
	 * @generated
	 */
	VAlignmentType getParentVAlignment();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getParentVAlignment <em>Parent VAlignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent VAlignment</em>' attribute.
	 * @see guizmo.layout.VAlignmentType
	 * @see #getParentVAlignment()
	 * @generated
	 */
	void setParentVAlignment(VAlignmentType value);

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
	 * @see guizmo.layout.LayoutPackage#getLayout_HSize()
	 * @model
	 * @generated
	 */
	float getHSize();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getHSize <em>HSize</em>}' attribute.
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
	 * @see guizmo.layout.LayoutPackage#getLayout_VSize()
	 * @model
	 * @generated
	 */
	float getVSize();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getVSize <em>VSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSize</em>' attribute.
	 * @see #getVSize()
	 * @generated
	 */
	void setVSize(float value);

	/**
	 * Returns the value of the '<em><b>Fitness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fitness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fitness</em>' attribute.
	 * @see #setFitness(float)
	 * @see guizmo.layout.LayoutPackage#getLayout_Fitness()
	 * @model
	 * @generated
	 */
	float getFitness();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getFitness <em>Fitness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fitness</em>' attribute.
	 * @see #getFitness()
	 * @generated
	 */
	void setFitness(float value);

	/**
	 * Returns the value of the '<em><b>Gaps</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.Gap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gaps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gaps</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayout_Gaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gap> getGaps();

	/**
	 * Returns the value of the '<em><b>Ref Gaps</b></em>' reference list.
	 * The list contents are of type {@link guizmo.layout.Gap}.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.Gap#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Gaps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Gaps</em>' reference list.
	 * @see guizmo.layout.LayoutPackage#getLayout_RefGaps()
	 * @see guizmo.layout.Gap#getLayouts
	 * @model opposite="layouts"
	 * @generated
	 */
	EList<Gap> getRefGaps();

	/**
	 * Returns the value of the '<em><b>Margins</b></em>' containment reference list.
	 * The list contents are of type {@link guizmo.layout.Margin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margins</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margins</em>' containment reference list.
	 * @see guizmo.layout.LayoutPackage#getLayout_Margins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Margin> getMargins();

	/**
	 * Returns the value of the '<em><b>Lborder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.AlignmentMark#getLnodes <em>Lnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lborder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lborder</em>' reference.
	 * @see #setLborder(AlignmentMark)
	 * @see guizmo.layout.LayoutPackage#getLayout_Lborder()
	 * @see guizmo.layout.AlignmentMark#getLnodes
	 * @model opposite="lnodes"
	 * @generated
	 */
	AlignmentMark getLborder();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getLborder <em>Lborder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lborder</em>' reference.
	 * @see #getLborder()
	 * @generated
	 */
	void setLborder(AlignmentMark value);

	/**
	 * Returns the value of the '<em><b>Rborder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link guizmo.layout.AlignmentMark#getRnodes <em>Rnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rborder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rborder</em>' reference.
	 * @see #setRborder(AlignmentMark)
	 * @see guizmo.layout.LayoutPackage#getLayout_Rborder()
	 * @see guizmo.layout.AlignmentMark#getRnodes
	 * @model opposite="rnodes"
	 * @generated
	 */
	AlignmentMark getRborder();

	/**
	 * Sets the value of the '{@link guizmo.layout.Layout#getRborder <em>Rborder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rborder</em>' reference.
	 * @see #getRborder()
	 * @generated
	 */
	void setRborder(AlignmentMark value);

} // Layout
