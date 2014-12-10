/**
 */
package lasser.sketch.util;

import lasser.sketch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lasser.sketch.SketchPackage
 * @generated
 */
public class SketchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SketchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SketchPackage.eINSTANCE;
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
	protected SketchSwitch<Adapter> modelSwitch =
		new SketchSwitch<Adapter>() {
			@Override
			public Adapter caseSketchRoot(SketchRoot object) {
				return createSketchRootAdapter();
			}
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTextElement(TextElement object) {
				return createTextElementAdapter();
			}
			@Override
			public Adapter casePositionable(Positionable object) {
				return createPositionableAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseCompositeWidget(CompositeWidget object) {
				return createCompositeWidgetAdapter();
			}
			@Override
			public Adapter caseWindow(Window object) {
				return createWindowAdapter();
			}
			@Override
			public Adapter caseToolBar(ToolBar object) {
				return createToolBarAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter casePlainPanel(PlainPanel object) {
				return createPlainPanelAdapter();
			}
			@Override
			public Adapter caseTabbedPanel(TabbedPanel object) {
				return createTabbedPanelAdapter();
			}
			@Override
			public Adapter caseWidgetGroup(WidgetGroup object) {
				return createWidgetGroupAdapter();
			}
			@Override
			public Adapter caseTextWidget(TextWidget object) {
				return createTextWidgetAdapter();
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
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseListBox(ListBox object) {
				return createListBoxAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
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
			public Adapter caseCheckGroup(CheckGroup object) {
				return createCheckGroupAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseFont(Font object) {
				return createFontAdapter();
			}
			@Override
			public Adapter caseScrollBar(ScrollBar object) {
				return createScrollBarAdapter();
			}
			@Override
			public Adapter caseBorder(Border object) {
				return createBorderAdapter();
			}
			@Override
			public Adapter caseTreeViewer(TreeViewer object) {
				return createTreeViewerAdapter();
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
	 * Creates a new adapter for an object of class '{@link lasser.sketch.SketchRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.SketchRoot
	 * @generated
	 */
	public Adapter createSketchRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Positionable <em>Positionable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Positionable
	 * @generated
	 */
	public Adapter createPositionableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.CompositeWidget <em>Composite Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.CompositeWidget
	 * @generated
	 */
	public Adapter createCompositeWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Window
	 * @generated
	 */
	public Adapter createWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.ToolBar
	 * @generated
	 */
	public Adapter createToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.PlainPanel <em>Plain Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.PlainPanel
	 * @generated
	 */
	public Adapter createPlainPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TabbedPanel <em>Tabbed Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TabbedPanel
	 * @generated
	 */
	public Adapter createTabbedPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.WidgetGroup <em>Widget Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.WidgetGroup
	 * @generated
	 */
	public Adapter createWidgetGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TextWidget <em>Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TextWidget
	 * @generated
	 */
	public Adapter createTextWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TextBox
	 * @generated
	 */
	public Adapter createTextBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TextArea
	 * @generated
	 */
	public Adapter createTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.CheckBox
	 * @generated
	 */
	public Adapter createCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.ListBox <em>List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.ListBox
	 * @generated
	 */
	public Adapter createListBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.ComboBox
	 * @generated
	 */
	public Adapter createComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.RadioGroup
	 * @generated
	 */
	public Adapter createRadioGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.CheckGroup <em>Check Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.CheckGroup
	 * @generated
	 */
	public Adapter createCheckGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.RadioButton
	 * @generated
	 */
	public Adapter createRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Font
	 * @generated
	 */
	public Adapter createFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.ScrollBar <em>Scroll Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.ScrollBar
	 * @generated
	 */
	public Adapter createScrollBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.Border
	 * @generated
	 */
	public Adapter createBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lasser.sketch.TreeViewer <em>Tree Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lasser.sketch.TreeViewer
	 * @generated
	 */
	public Adapter createTreeViewerAdapter() {
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

} //SketchAdapterFactory
