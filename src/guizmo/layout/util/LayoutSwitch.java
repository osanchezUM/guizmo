/**
 */
package guizmo.layout.util;

import guizmo.layout.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see guizmo.layout.LayoutPackage
 * @generated
 */
public class LayoutSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayoutPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutSwitch() {
		if (modelPackage == null) {
			modelPackage = LayoutPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LayoutPackage.LAYOUT_ROOT: {
				LayoutRoot layoutRoot = (LayoutRoot)theEObject;
				T result = caseLayoutRoot(layoutRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.LAYOUT_INFO_TREE_NODE: {
				LayoutInfoTreeNode layoutInfoTreeNode = (LayoutInfoTreeNode)theEObject;
				T result = caseLayoutInfoTreeNode(layoutInfoTreeNode);
				if (result == null) result = caseNamedElement(layoutInfoTreeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseNamedElement(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.FLOW_LAYOUT: {
				FlowLayout flowLayout = (FlowLayout)theEObject;
				T result = caseFlowLayout(flowLayout);
				if (result == null) result = caseLayout(flowLayout);
				if (result == null) result = caseNamedElement(flowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.BORDER_LAYOUT: {
				BorderLayout borderLayout = (BorderLayout)theEObject;
				T result = caseBorderLayout(borderLayout);
				if (result == null) result = caseLayout(borderLayout);
				if (result == null) result = caseNamedElement(borderLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.GRID_LAYOUT: {
				GridLayout gridLayout = (GridLayout)theEObject;
				T result = caseGridLayout(gridLayout);
				if (result == null) result = caseLayout(gridLayout);
				if (result == null) result = caseNamedElement(gridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.FORM_LAYOUT: {
				FormLayout formLayout = (FormLayout)theEObject;
				T result = caseFormLayout(formLayout);
				if (result == null) result = caseLayout(formLayout);
				if (result == null) result = caseNamedElement(formLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.ALIGNED_COLUMN: {
				AlignedColumn alignedColumn = (AlignedColumn)theEObject;
				T result = caseAlignedColumn(alignedColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.ALIGNMENT_MARK: {
				AlignmentMark alignmentMark = (AlignmentMark)theEObject;
				T result = caseAlignmentMark(alignmentMark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.CUSTOM_LAYOUT: {
				CustomLayout customLayout = (CustomLayout)theEObject;
				T result = caseCustomLayout(customLayout);
				if (result == null) result = caseLayout(customLayout);
				if (result == null) result = caseNamedElement(customLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.ELEMENT_NODE: {
				ElementNode elementNode = (ElementNode)theEObject;
				T result = caseElementNode(elementNode);
				if (result == null) result = caseLayout(elementNode);
				if (result == null) result = caseNamedElement(elementNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.SEPARATION: {
				Separation separation = (Separation)theEObject;
				T result = caseSeparation(separation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.GAP: {
				Gap gap = (Gap)theEObject;
				T result = caseGap(gap);
				if (result == null) result = caseSeparation(gap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LayoutPackage.MARGIN: {
				Margin margin = (Margin)theEObject;
				T result = caseMargin(margin);
				if (result == null) result = caseSeparation(margin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutRoot(LayoutRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutInfoTreeNode(LayoutInfoTreeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLayout(FlowLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderLayout(BorderLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLayout(GridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLayout(FormLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aligned Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aligned Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignedColumn(AlignedColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alignment Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alignment Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignmentMark(AlignmentMark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLayout(CustomLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementNode(ElementNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparation(Separation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGap(Gap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMargin(Margin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LayoutSwitch
