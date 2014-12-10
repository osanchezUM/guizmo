/**
 */
package guizmo.layout.util;

import guizmo.layout.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.layout.LayoutPackage
 * @generated
 */
public class LayoutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayoutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LayoutPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutSwitch<Adapter> modelSwitch =
		new LayoutSwitch<Adapter>() {
			@Override
			public Adapter caseLayoutRoot(LayoutRoot object) {
				return createLayoutRootAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseLayoutInfoTreeNode(LayoutInfoTreeNode object) {
				return createLayoutInfoTreeNodeAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseFlowLayout(FlowLayout object) {
				return createFlowLayoutAdapter();
			}
			@Override
			public Adapter caseBorderLayout(BorderLayout object) {
				return createBorderLayoutAdapter();
			}
			@Override
			public Adapter caseGridLayout(GridLayout object) {
				return createGridLayoutAdapter();
			}
			@Override
			public Adapter caseFormLayout(FormLayout object) {
				return createFormLayoutAdapter();
			}
			@Override
			public Adapter caseAlignedColumn(AlignedColumn object) {
				return createAlignedColumnAdapter();
			}
			@Override
			public Adapter caseAlignmentMark(AlignmentMark object) {
				return createAlignmentMarkAdapter();
			}
			@Override
			public Adapter caseCustomLayout(CustomLayout object) {
				return createCustomLayoutAdapter();
			}
			@Override
			public Adapter caseElementNode(ElementNode object) {
				return createElementNodeAdapter();
			}
			@Override
			public Adapter caseSeparation(Separation object) {
				return createSeparationAdapter();
			}
			@Override
			public Adapter caseGap(Gap object) {
				return createGapAdapter();
			}
			@Override
			public Adapter caseMargin(Margin object) {
				return createMarginAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.LayoutRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.LayoutRoot
	 * @generated
	 */
	public Adapter createLayoutRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.LayoutInfoTreeNode <em>Info Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.LayoutInfoTreeNode
	 * @generated
	 */
	public Adapter createLayoutInfoTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.FlowLayout
	 * @generated
	 */
	public Adapter createFlowLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.BorderLayout <em>Border Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.BorderLayout
	 * @generated
	 */
	public Adapter createBorderLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.GridLayout
	 * @generated
	 */
	public Adapter createGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.FormLayout <em>Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.FormLayout
	 * @generated
	 */
	public Adapter createFormLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.AlignedColumn <em>Aligned Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.AlignedColumn
	 * @generated
	 */
	public Adapter createAlignedColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.AlignmentMark <em>Alignment Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.AlignmentMark
	 * @generated
	 */
	public Adapter createAlignmentMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.CustomLayout <em>Custom Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.CustomLayout
	 * @generated
	 */
	public Adapter createCustomLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.ElementNode <em>Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.ElementNode
	 * @generated
	 */
	public Adapter createElementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.Separation <em>Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.Separation
	 * @generated
	 */
	public Adapter createSeparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.Gap
	 * @generated
	 */
	public Adapter createGapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.layout.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.layout.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LayoutAdapterFactory
