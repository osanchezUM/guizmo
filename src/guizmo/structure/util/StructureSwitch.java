/**
 */
package guizmo.structure.util;

import guizmo.structure.*;

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
 * @see guizmo.structure.StructurePackage
 * @generated
 */
public class StructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSwitch() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
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
			case StructurePackage.STRUCTURE_ROOT: {
				StructureRoot structureRoot = (StructureRoot)theEObject;
				T result = caseStructureRoot(structureRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.RESOURCE_REPOSITORY: {
				ResourceRepository resourceRepository = (ResourceRepository)theEObject;
				T result = caseResourceRepository(resourceRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.IMAGE_RESOURCE: {
				ImageResource imageResource = (ImageResource)theEObject;
				T result = caseImageResource(imageResource);
				if (result == null) result = caseResource(imageResource);
				if (result == null) result = caseLocatable(imageResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.I18N_RESOURCE: {
				I18NResource i18NResource = (I18NResource)theEObject;
				T result = caseI18NResource(i18NResource);
				if (result == null) result = caseResource(i18NResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TEXT_TRANSLATION: {
				TextTranslation textTranslation = (TextTranslation)theEObject;
				T result = caseTextTranslation(textTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GRAPHICAL_ELEMENT: {
				GraphicalElement graphicalElement = (GraphicalElement)theEObject;
				T result = caseGraphicalElement(graphicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.LOCATABLE: {
				Locatable locatable = (Locatable)theEObject;
				T result = caseLocatable(locatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseGraphicalElement(container);
				if (result == null) result = caseLocatable(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GRAPHICAL_VIEW: {
				GraphicalView graphicalView = (GraphicalView)theEObject;
				T result = caseGraphicalView(graphicalView);
				if (result == null) result = caseContainer(graphicalView);
				if (result == null) result = caseGraphicalElement(graphicalView);
				if (result == null) result = caseLocatable(graphicalView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseGraphicalElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseWidget(menu);
				if (result == null) result = caseGraphicalElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TOOLBAR: {
				Toolbar toolbar = (Toolbar)theEObject;
				T result = caseToolbar(toolbar);
				if (result == null) result = caseWidget(toolbar);
				if (result == null) result = caseGraphicalElement(toolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.COMPOSABLE_WIDGET: {
				ComposableWidget composableWidget = (ComposableWidget)theEObject;
				T result = caseComposableWidget(composableWidget);
				if (result == null) result = caseWidget(composableWidget);
				if (result == null) result = caseLocatable(composableWidget);
				if (result == null) result = caseGraphicalElement(composableWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GUI_REGION: {
				GUIRegion guiRegion = (GUIRegion)theEObject;
				T result = caseGUIRegion(guiRegion);
				if (result == null) result = caseContainer(guiRegion);
				if (result == null) result = caseComposableWidget(guiRegion);
				if (result == null) result = caseLocatable(guiRegion);
				if (result == null) result = caseWidget(guiRegion);
				if (result == null) result = caseGraphicalElement(guiRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.SINGLE_WIDGET: {
				SingleWidget singleWidget = (SingleWidget)theEObject;
				T result = caseSingleWidget(singleWidget);
				if (result == null) result = caseComposableWidget(singleWidget);
				if (result == null) result = caseWidget(singleWidget);
				if (result == null) result = caseLocatable(singleWidget);
				if (result == null) result = caseGraphicalElement(singleWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GRAPHICAL_RESOURCE: {
				GraphicalResource graphicalResource = (GraphicalResource)theEObject;
				T result = caseGraphicalResource(graphicalResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseGraphicalResource(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseGraphicalResource(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.LINKABLE: {
				Linkable linkable = (Linkable)theEObject;
				T result = caseLinkable(linkable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OUTPUT_TEXT: {
				OutputText outputText = (OutputText)theEObject;
				T result = caseOutputText(outputText);
				if (result == null) result = caseSingleWidget(outputText);
				if (result == null) result = caseLinkable(outputText);
				if (result == null) result = caseComposableWidget(outputText);
				if (result == null) result = caseWidget(outputText);
				if (result == null) result = caseLocatable(outputText);
				if (result == null) result = caseGraphicalElement(outputText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TEXT_BOX: {
				TextBox textBox = (TextBox)theEObject;
				T result = caseTextBox(textBox);
				if (result == null) result = caseSingleWidget(textBox);
				if (result == null) result = caseComposableWidget(textBox);
				if (result == null) result = caseWidget(textBox);
				if (result == null) result = caseLocatable(textBox);
				if (result == null) result = caseGraphicalElement(textBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TEXT_AREA: {
				TextArea textArea = (TextArea)theEObject;
				T result = caseTextArea(textArea);
				if (result == null) result = caseSingleWidget(textArea);
				if (result == null) result = caseComposableWidget(textArea);
				if (result == null) result = caseWidget(textArea);
				if (result == null) result = caseLocatable(textArea);
				if (result == null) result = caseGraphicalElement(textArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ITEMIZABLE: {
				Itemizable itemizable = (Itemizable)theEObject;
				T result = caseItemizable(itemizable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseGraphicalElement(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.COMBO_BOX: {
				ComboBox comboBox = (ComboBox)theEObject;
				T result = caseComboBox(comboBox);
				if (result == null) result = caseSingleWidget(comboBox);
				if (result == null) result = caseItemizable(comboBox);
				if (result == null) result = caseComposableWidget(comboBox);
				if (result == null) result = caseWidget(comboBox);
				if (result == null) result = caseLocatable(comboBox);
				if (result == null) result = caseGraphicalElement(comboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CHECK_BOX: {
				CheckBox checkBox = (CheckBox)theEObject;
				T result = caseCheckBox(checkBox);
				if (result == null) result = caseSingleWidget(checkBox);
				if (result == null) result = caseComposableWidget(checkBox);
				if (result == null) result = caseWidget(checkBox);
				if (result == null) result = caseLocatable(checkBox);
				if (result == null) result = caseGraphicalElement(checkBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.RADIO_GROUP: {
				RadioGroup radioGroup = (RadioGroup)theEObject;
				T result = caseRadioGroup(radioGroup);
				if (result == null) result = caseSingleWidget(radioGroup);
				if (result == null) result = caseItemizable(radioGroup);
				if (result == null) result = caseComposableWidget(radioGroup);
				if (result == null) result = caseWidget(radioGroup);
				if (result == null) result = caseLocatable(radioGroup);
				if (result == null) result = caseGraphicalElement(radioGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.LIST_BOX: {
				ListBox listBox = (ListBox)theEObject;
				T result = caseListBox(listBox);
				if (result == null) result = caseSingleWidget(listBox);
				if (result == null) result = caseItemizable(listBox);
				if (result == null) result = caseComposableWidget(listBox);
				if (result == null) result = caseWidget(listBox);
				if (result == null) result = caseLocatable(listBox);
				if (result == null) result = caseGraphicalElement(listBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.IMAGE_CONTAINER: {
				ImageContainer imageContainer = (ImageContainer)theEObject;
				T result = caseImageContainer(imageContainer);
				if (result == null) result = caseSingleWidget(imageContainer);
				if (result == null) result = caseLinkable(imageContainer);
				if (result == null) result = caseComposableWidget(imageContainer);
				if (result == null) result = caseWidget(imageContainer);
				if (result == null) result = caseLocatable(imageContainer);
				if (result == null) result = caseGraphicalElement(imageContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VIDEO_CONTAINER: {
				VideoContainer videoContainer = (VideoContainer)theEObject;
				T result = caseVideoContainer(videoContainer);
				if (result == null) result = caseSingleWidget(videoContainer);
				if (result == null) result = caseComposableWidget(videoContainer);
				if (result == null) result = caseWidget(videoContainer);
				if (result == null) result = caseLocatable(videoContainer);
				if (result == null) result = caseGraphicalElement(videoContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseSingleWidget(button);
				if (result == null) result = caseComposableWidget(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = caseLocatable(button);
				if (result == null) result = caseGraphicalElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.OBJECT_WIDGET: {
				ObjectWidget objectWidget = (ObjectWidget)theEObject;
				T result = caseObjectWidget(objectWidget);
				if (result == null) result = caseSingleWidget(objectWidget);
				if (result == null) result = caseComposableWidget(objectWidget);
				if (result == null) result = caseWidget(objectWidget);
				if (result == null) result = caseLocatable(objectWidget);
				if (result == null) result = caseGraphicalElement(objectWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseSingleWidget(table);
				if (result == null) result = caseComposableWidget(table);
				if (result == null) result = caseWidget(table);
				if (result == null) result = caseLocatable(table);
				if (result == null) result = caseGraphicalElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
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
	public T caseStructureRoot(StructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRepository(ResourceRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageResource(ImageResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I18N Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I18N Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18NResource(I18NResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextTranslation(TextTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalElement(GraphicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatable(Locatable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Graphical View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalView(GraphicalView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolbar(Toolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composable Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composable Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposableWidget(ComposableWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GUI Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GUI Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGUIRegion(GUIRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleWidget(SingleWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalResource(GraphicalResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Linkable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkable(Linkable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputText(OutputText object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Itemizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itemizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemizable(Itemizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Image Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageContainer(ImageContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoContainer(VideoContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectWidget(ObjectWidget object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
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

} //StructureSwitch
