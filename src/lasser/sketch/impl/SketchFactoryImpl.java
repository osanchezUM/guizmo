/**
 */
package lasser.sketch.impl;

import lasser.sketch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SketchFactoryImpl extends EFactoryImpl implements SketchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SketchFactory init() {
		try {
			SketchFactory theSketchFactory = (SketchFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelum.es/layoutGuesser/sketch"); 
			if (theSketchFactory != null) {
				return theSketchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SketchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SketchPackage.SKETCH_ROOT: return createSketchRoot();
			case SketchPackage.COMPOSITE_WIDGET: return createCompositeWidget();
			case SketchPackage.WINDOW: return createWindow();
			case SketchPackage.TOOL_BAR: return createToolBar();
			case SketchPackage.MENU: return createMenu();
			case SketchPackage.MENU_ITEM: return createMenuItem();
			case SketchPackage.PLAIN_PANEL: return createPlainPanel();
			case SketchPackage.TABBED_PANEL: return createTabbedPanel();
			case SketchPackage.WIDGET_GROUP: return createWidgetGroup();
			case SketchPackage.TEXT_BOX: return createTextBox();
			case SketchPackage.TEXT_AREA: return createTextArea();
			case SketchPackage.LABEL: return createLabel();
			case SketchPackage.IMAGE: return createImage();
			case SketchPackage.BUTTON: return createButton();
			case SketchPackage.LIST_BOX: return createListBox();
			case SketchPackage.COMBO_BOX: return createComboBox();
			case SketchPackage.RADIO_BUTTON: return createRadioButton();
			case SketchPackage.CHECK_BOX: return createCheckBox();
			case SketchPackage.RADIO_GROUP: return createRadioGroup();
			case SketchPackage.CHECK_GROUP: return createCheckGroup();
			case SketchPackage.TABLE: return createTable();
			case SketchPackage.ROW: return createRow();
			case SketchPackage.FONT: return createFont();
			case SketchPackage.SCROLL_BAR: return createScrollBar();
			case SketchPackage.BORDER: return createBorder();
			case SketchPackage.TREE_VIEWER: return createTreeViewer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SketchPackage.ALIGNMENT_TYPE:
				return createAlignmentTypeFromString(eDataType, initialValue);
			case SketchPackage.FONT_TYPE:
				return createFontTypeFromString(eDataType, initialValue);
			case SketchPackage.COLOUR_TYPE:
				return createColourTypeFromString(eDataType, initialValue);
			case SketchPackage.BORDER_TYPE:
				return createBorderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SketchPackage.ALIGNMENT_TYPE:
				return convertAlignmentTypeToString(eDataType, instanceValue);
			case SketchPackage.FONT_TYPE:
				return convertFontTypeToString(eDataType, instanceValue);
			case SketchPackage.COLOUR_TYPE:
				return convertColourTypeToString(eDataType, instanceValue);
			case SketchPackage.BORDER_TYPE:
				return convertBorderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchRoot createSketchRoot() {
		SketchRootImpl sketchRoot = new SketchRootImpl();
		return sketchRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeWidget createCompositeWidget() {
		CompositeWidgetImpl compositeWidget = new CompositeWidgetImpl();
		return compositeWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolBar createToolBar() {
		ToolBarImpl toolBar = new ToolBarImpl();
		return toolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainPanel createPlainPanel() {
		PlainPanelImpl plainPanel = new PlainPanelImpl();
		return plainPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabbedPanel createTabbedPanel() {
		TabbedPanelImpl tabbedPanel = new TabbedPanelImpl();
		return tabbedPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetGroup createWidgetGroup() {
		WidgetGroupImpl widgetGroup = new WidgetGroupImpl();
		return widgetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBox createTextBox() {
		TextBoxImpl textBox = new TextBoxImpl();
		return textBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListBox createListBox() {
		ListBoxImpl listBox = new ListBoxImpl();
		return listBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioGroup createRadioGroup() {
		RadioGroupImpl radioGroup = new RadioGroupImpl();
		return radioGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckGroup createCheckGroup() {
		CheckGroupImpl checkGroup = new CheckGroupImpl();
		return checkGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFont() {
		FontImpl font = new FontImpl();
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrollBar createScrollBar() {
		ScrollBarImpl scrollBar = new ScrollBarImpl();
		return scrollBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border createBorder() {
		BorderImpl border = new BorderImpl();
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeViewer createTreeViewer() {
		TreeViewerImpl treeViewer = new TreeViewerImpl();
		return treeViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		AlignmentType result = AlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontType createFontTypeFromString(EDataType eDataType, String initialValue) {
		FontType result = FontType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourType createColourTypeFromString(EDataType eDataType, String initialValue) {
		ColourType result = ColourType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColourTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderType createBorderTypeFromString(EDataType eDataType, String initialValue) {
		BorderType result = BorderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchPackage getSketchPackage() {
		return (SketchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SketchPackage getPackage() {
		return SketchPackage.eINSTANCE;
	}

} //SketchFactoryImpl
