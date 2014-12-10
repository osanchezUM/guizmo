/**
 */
package lasser.sketch.util;

import lasser.sketch.*;

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
 * @see lasser.sketch.SketchPackage
 * @generated
 */
public class SketchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SketchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchSwitch() {
		if (modelPackage == null) {
			modelPackage = SketchPackage.eINSTANCE;
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
			case SketchPackage.SKETCH_ROOT: {
				SketchRoot sketchRoot = (SketchRoot)theEObject;
				T result = caseSketchRoot(sketchRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TEXT_ELEMENT: {
				TextElement textElement = (TextElement)theEObject;
				T result = caseTextElement(textElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.POSITIONABLE: {
				Positionable positionable = (Positionable)theEObject;
				T result = casePositionable(positionable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = casePositionable(widget);
				if (result == null) result = caseIdentifiedElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseWidget(container);
				if (result == null) result = casePositionable(container);
				if (result == null) result = caseIdentifiedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.COMPOSITE_WIDGET: {
				CompositeWidget compositeWidget = (CompositeWidget)theEObject;
				T result = caseCompositeWidget(compositeWidget);
				if (result == null) result = caseWidget(compositeWidget);
				if (result == null) result = casePositionable(compositeWidget);
				if (result == null) result = caseIdentifiedElement(compositeWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.WINDOW: {
				Window window = (Window)theEObject;
				T result = caseWindow(window);
				if (result == null) result = caseContainer(window);
				if (result == null) result = caseNamedElement(window);
				if (result == null) result = caseWidget(window);
				if (result == null) result = casePositionable(window);
				if (result == null) result = caseIdentifiedElement(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TOOL_BAR: {
				ToolBar toolBar = (ToolBar)theEObject;
				T result = caseToolBar(toolBar);
				if (result == null) result = caseWidget(toolBar);
				if (result == null) result = casePositionable(toolBar);
				if (result == null) result = caseIdentifiedElement(toolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseWidget(menu);
				if (result == null) result = casePositionable(menu);
				if (result == null) result = caseIdentifiedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.MENU_ITEM: {
				MenuItem menuItem = (MenuItem)theEObject;
				T result = caseMenuItem(menuItem);
				if (result == null) result = caseWidget(menuItem);
				if (result == null) result = casePositionable(menuItem);
				if (result == null) result = caseIdentifiedElement(menuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.PANEL: {
				Panel panel = (Panel)theEObject;
				T result = casePanel(panel);
				if (result == null) result = caseContainer(panel);
				if (result == null) result = caseWidget(panel);
				if (result == null) result = casePositionable(panel);
				if (result == null) result = caseIdentifiedElement(panel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.PLAIN_PANEL: {
				PlainPanel plainPanel = (PlainPanel)theEObject;
				T result = casePlainPanel(plainPanel);
				if (result == null) result = casePanel(plainPanel);
				if (result == null) result = caseContainer(plainPanel);
				if (result == null) result = caseWidget(plainPanel);
				if (result == null) result = casePositionable(plainPanel);
				if (result == null) result = caseIdentifiedElement(plainPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TABBED_PANEL: {
				TabbedPanel tabbedPanel = (TabbedPanel)theEObject;
				T result = caseTabbedPanel(tabbedPanel);
				if (result == null) result = casePanel(tabbedPanel);
				if (result == null) result = caseContainer(tabbedPanel);
				if (result == null) result = caseWidget(tabbedPanel);
				if (result == null) result = casePositionable(tabbedPanel);
				if (result == null) result = caseIdentifiedElement(tabbedPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.WIDGET_GROUP: {
				WidgetGroup widgetGroup = (WidgetGroup)theEObject;
				T result = caseWidgetGroup(widgetGroup);
				if (result == null) result = caseContainer(widgetGroup);
				if (result == null) result = caseTextElement(widgetGroup);
				if (result == null) result = caseWidget(widgetGroup);
				if (result == null) result = casePositionable(widgetGroup);
				if (result == null) result = caseIdentifiedElement(widgetGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TEXT_WIDGET: {
				TextWidget textWidget = (TextWidget)theEObject;
				T result = caseTextWidget(textWidget);
				if (result == null) result = caseWidget(textWidget);
				if (result == null) result = caseTextElement(textWidget);
				if (result == null) result = casePositionable(textWidget);
				if (result == null) result = caseIdentifiedElement(textWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TEXT_BOX: {
				TextBox textBox = (TextBox)theEObject;
				T result = caseTextBox(textBox);
				if (result == null) result = caseTextWidget(textBox);
				if (result == null) result = caseWidget(textBox);
				if (result == null) result = caseTextElement(textBox);
				if (result == null) result = casePositionable(textBox);
				if (result == null) result = caseIdentifiedElement(textBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseTextWidget(textArea);
				if (result == null) result = caseWidget(textArea);
				if (result == null) result = caseTextElement(textArea);
				if (result == null) result = casePositionable(textArea);
				if (result == null) result = caseIdentifiedElement(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseTextWidget(label);
				if (result == null) result = caseWidget(label);
				if (result == null) result = caseTextElement(label);
				if (result == null) result = casePositionable(label);
				if (result == null) result = caseIdentifiedElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseTextWidget(image);
				if (result == null) result = caseWidget(image);
				if (result == null) result = caseTextElement(image);
				if (result == null) result = casePositionable(image);
				if (result == null) result = caseIdentifiedElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseTextWidget(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = caseTextElement(button);
				if (result == null) result = casePositionable(button);
				if (result == null) result = caseIdentifiedElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.LIST_BOX: {
				ListBox listBox = (ListBox)theEObject;
				T result = caseListBox(listBox);
				if (result == null) result = caseWidget(listBox);
				if (result == null) result = casePositionable(listBox);
				if (result == null) result = caseIdentifiedElement(listBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.COMBO_BOX: {
				ComboBox comboBox = (ComboBox)theEObject;
				T result = caseComboBox(comboBox);
				if (result == null) result = caseTextWidget(comboBox);
				if (result == null) result = caseWidget(comboBox);
				if (result == null) result = caseTextElement(comboBox);
				if (result == null) result = casePositionable(comboBox);
				if (result == null) result = caseIdentifiedElement(comboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.RADIO_BUTTON: {
				RadioButton radioButton = (RadioButton)theEObject;
				T result = caseRadioButton(radioButton);
				if (result == null) result = caseTextWidget(radioButton);
				if (result == null) result = caseWidget(radioButton);
				if (result == null) result = caseTextElement(radioButton);
				if (result == null) result = casePositionable(radioButton);
				if (result == null) result = caseIdentifiedElement(radioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseTextWidget(checkBox);
				if (result == null) result = caseWidget(checkBox);
				if (result == null) result = caseTextElement(checkBox);
				if (result == null) result = casePositionable(checkBox);
				if (result == null) result = caseIdentifiedElement(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.RADIO_GROUP: {
				RadioGroup radioGroup = (RadioGroup)theEObject;
				T result = caseRadioGroup(radioGroup);
				if (result == null) result = caseWidget(radioGroup);
				if (result == null) result = casePositionable(radioGroup);
				if (result == null) result = caseIdentifiedElement(radioGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.CHECK_GROUP: {
				CheckGroup checkGroup = (CheckGroup)theEObject;
				T result = caseCheckGroup(checkGroup);
				if (result == null) result = caseWidget(checkGroup);
				if (result == null) result = casePositionable(checkGroup);
				if (result == null) result = caseIdentifiedElement(checkGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseWidget(table);
				if (result == null) result = casePositionable(table);
				if (result == null) result = caseIdentifiedElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.FONT: {
				Font font = (Font)theEObject;
				T result = caseFont(font);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.SCROLL_BAR: {
				ScrollBar scrollBar = (ScrollBar)theEObject;
				T result = caseScrollBar(scrollBar);
				if (result == null) result = caseWidget(scrollBar);
				if (result == null) result = casePositionable(scrollBar);
				if (result == null) result = caseIdentifiedElement(scrollBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.BORDER: {
				Border border = (Border)theEObject;
				T result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SketchPackage.TREE_VIEWER: {
				TreeViewer treeViewer = (TreeViewer)theEObject;
				T result = caseTreeViewer(treeViewer);
				if (result == null) result = caseWidget(treeViewer);
				if (result == null) result = casePositionable(treeViewer);
				if (result == null) result = caseIdentifiedElement(treeViewer);
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
	public T caseSketchRoot(SketchRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement(TextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positionable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positionable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionable(Positionable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeWidget(CompositeWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindow(Window object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolBar(ToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanel(Panel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainPanel(PlainPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabbed Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabbed Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabbedPanel(TabbedPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidgetGroup(WidgetGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextWidget(TextWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBox(TextBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextArea(TextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckBox(CheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListBox(ListBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboBox(ComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioGroup(RadioGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckGroup(CheckGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioButton(RadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFont(Font object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scroll Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scroll Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrollBar(ScrollBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeViewer(TreeViewer object) {
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

} //SketchSwitch
