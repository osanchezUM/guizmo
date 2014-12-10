/**
 */
package guizmo.structure.util;

import guizmo.structure.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.structure.StructurePackage
 * @generated
 */
public class StructureAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
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
	protected StructureSwitch<Adapter> modelSwitch =
		new StructureSwitch<Adapter>() {
			@Override
			public Adapter caseStructureRoot(StructureRoot object) {
				return createStructureRootAdapter();
			}
			@Override
			public Adapter caseResourceRepository(ResourceRepository object) {
				return createResourceRepositoryAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseImageResource(ImageResource object) {
				return createImageResourceAdapter();
			}
			@Override
			public Adapter caseI18NResource(I18NResource object) {
				return createI18NResourceAdapter();
			}
			@Override
			public Adapter caseTextTranslation(TextTranslation object) {
				return createTextTranslationAdapter();
			}
			@Override
			public Adapter caseGraphicalElement(GraphicalElement object) {
				return createGraphicalElementAdapter();
			}
			@Override
			public Adapter caseLocatable(Locatable object) {
				return createLocatableAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseGraphicalView(GraphicalView object) {
				return createGraphicalViewAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseToolbar(Toolbar object) {
				return createToolbarAdapter();
			}
			@Override
			public Adapter caseComposableWidget(ComposableWidget object) {
				return createComposableWidgetAdapter();
			}
			@Override
			public Adapter caseGUIRegion(GUIRegion object) {
				return createGUIRegionAdapter();
			}
			@Override
			public Adapter caseSingleWidget(SingleWidget object) {
				return createSingleWidgetAdapter();
			}
			@Override
			public Adapter caseGraphicalResource(GraphicalResource object) {
				return createGraphicalResourceAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseLinkable(Linkable object) {
				return createLinkableAdapter();
			}
			@Override
			public Adapter caseOutputText(OutputText object) {
				return createOutputTextAdapter();
			}
			@Override
			public Adapter caseTextBox(TextBox object) {
				return createTextBoxAdapter();
			}
			@Override
			public Adapter caseTextArea(TextArea object) {
				return createTextAreaAdapter();
			}
			@Override
			public Adapter caseItemizable(Itemizable object) {
				return createItemizableAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseRadioGroup(RadioGroup object) {
				return createRadioGroupAdapter();
			}
			@Override
			public Adapter caseListBox(ListBox object) {
				return createListBoxAdapter();
			}
			@Override
			public Adapter caseImageContainer(ImageContainer object) {
				return createImageContainerAdapter();
			}
			@Override
			public Adapter caseVideoContainer(VideoContainer object) {
				return createVideoContainerAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseObjectWidget(ObjectWidget object) {
				return createObjectWidgetAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
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
	 * Creates a new adapter for an object of class '{@link guizmo.structure.StructureRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.StructureRoot
	 * @generated
	 */
	public Adapter createStructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ResourceRepository <em>Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ResourceRepository
	 * @generated
	 */
	public Adapter createResourceRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ImageResource <em>Image Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ImageResource
	 * @generated
	 */
	public Adapter createImageResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.I18NResource <em>I18N Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.I18NResource
	 * @generated
	 */
	public Adapter createI18NResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.TextTranslation <em>Text Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.TextTranslation
	 * @generated
	 */
	public Adapter createTextTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.GraphicalElement
	 * @generated
	 */
	public Adapter createGraphicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Locatable <em>Locatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Locatable
	 * @generated
	 */
	public Adapter createLocatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.GraphicalView <em>Graphical View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.GraphicalView
	 * @generated
	 */
	public Adapter createGraphicalViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Toolbar
	 * @generated
	 */
	public Adapter createToolbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ComposableWidget <em>Composable Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ComposableWidget
	 * @generated
	 */
	public Adapter createComposableWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.GUIRegion <em>GUI Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.GUIRegion
	 * @generated
	 */
	public Adapter createGUIRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.SingleWidget <em>Single Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.SingleWidget
	 * @generated
	 */
	public Adapter createSingleWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.GraphicalResource <em>Graphical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.GraphicalResource
	 * @generated
	 */
	public Adapter createGraphicalResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Linkable
	 * @generated
	 */
	public Adapter createLinkableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.OutputText <em>Output Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.OutputText
	 * @generated
	 */
	public Adapter createOutputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.TextBox
	 * @generated
	 */
	public Adapter createTextBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Itemizable <em>Itemizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Itemizable
	 * @generated
	 */
	public Adapter createItemizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ComboBox
	 * @generated
	 */
	public Adapter createComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.RadioGroup
	 * @generated
	 */
	public Adapter createRadioGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ListBox <em>List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ListBox
	 * @generated
	 */
	public Adapter createListBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ImageContainer <em>Image Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ImageContainer
	 * @generated
	 */
	public Adapter createImageContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.VideoContainer <em>Video Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.VideoContainer
	 * @generated
	 */
	public Adapter createVideoContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.ObjectWidget <em>Object Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.ObjectWidget
	 * @generated
	 */
	public Adapter createObjectWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link guizmo.structure.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see guizmo.structure.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
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

} //StructureAdapterFactory
