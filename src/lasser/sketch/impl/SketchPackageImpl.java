/**
 */
package lasser.sketch.impl;

import lasser.sketch.AlignmentType;
import lasser.sketch.Border;
import lasser.sketch.BorderType;
import lasser.sketch.Button;
import lasser.sketch.CheckBox;
import lasser.sketch.CheckGroup;
import lasser.sketch.ColourType;
import lasser.sketch.ComboBox;
import lasser.sketch.CompositeWidget;
import lasser.sketch.Font;
import lasser.sketch.FontType;
import lasser.sketch.IdentifiedElement;
import lasser.sketch.Image;
import lasser.sketch.Label;
import lasser.sketch.ListBox;
import lasser.sketch.Menu;
import lasser.sketch.MenuItem;
import lasser.sketch.NamedElement;
import lasser.sketch.Panel;
import lasser.sketch.PlainPanel;
import lasser.sketch.Positionable;
import lasser.sketch.RadioButton;
import lasser.sketch.RadioGroup;
import lasser.sketch.Row;
import lasser.sketch.ScrollBar;
import lasser.sketch.SketchFactory;
import lasser.sketch.SketchPackage;
import lasser.sketch.SketchRoot;
import lasser.sketch.TabbedPanel;
import lasser.sketch.Table;
import lasser.sketch.TextArea;
import lasser.sketch.TextBox;
import lasser.sketch.TextElement;
import lasser.sketch.TextWidget;
import lasser.sketch.ToolBar;
import lasser.sketch.TreeViewer;
import lasser.sketch.Widget;
import lasser.sketch.WidgetGroup;
import lasser.sketch.Window;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SketchPackageImpl extends EPackageImpl implements SketchPackage {
	
	
	@Override
	protected Resource createResource(String uri) {
		return super.createResource(
				"../../lasser.sketchMM/bin/lasser/sketchMM/sketch.ecore");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabbedPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colourTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lasser.sketch.SketchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SketchPackageImpl() {
		super(eNS_URI, SketchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SketchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SketchPackage init() {
		if (isInited) return (SketchPackage)EPackage.Registry.INSTANCE.getEPackage(SketchPackage.eNS_URI);

		// Obtain or create and register package
		SketchPackageImpl theSketchPackage = (SketchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SketchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SketchPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSketchPackage.createPackageContents();

		// Initialize created meta-data
		theSketchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSketchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SketchPackage.eNS_URI, theSketchPackage);
		return theSketchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketchRoot() {
		return sketchRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketchRoot_Windows() {
		return (EReference)sketchRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Text() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionable() {
		return positionableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionable_XPos() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionable_YPos() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionable_Width() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionable_Height() {
		return (EAttribute)positionableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Widgets() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeWidget() {
		return compositeWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeWidget_Components() {
		return (EReference)compositeWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolBar() {
		return toolBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItem() {
		return menuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainPanel() {
		return plainPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabbedPanel() {
		return tabbedPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetGroup() {
		return widgetGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextWidget() {
		return textWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextBox() {
		return textBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextArea() {
		return textAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Rows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_Columns() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckBox_Selected() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListBox() {
		return listBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioGroup() {
		return radioGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadioGroup_Selected() {
		return (EReference)radioGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadioGroup_Items() {
		return (EReference)radioGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckGroup() {
		return checkGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckGroup_Items() {
		return (EReference)checkGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Values() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioButton_Selected() {
		return (EAttribute)radioButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFont() {
		return fontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Type() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFont_Size() {
		return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollBar() {
		return scrollBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorder() {
		return borderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorder_Type() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeViewer() {
		return treeViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentType() {
		return alignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontType() {
		return fontTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColourType() {
		return colourTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBorderType() {
		return borderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchFactory getSketchFactory() {
		return (SketchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sketchRootEClass = createEClass(SKETCH_ROOT);
		createEReference(sketchRootEClass, SKETCH_ROOT__WINDOWS);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		textElementEClass = createEClass(TEXT_ELEMENT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__TEXT);

		positionableEClass = createEClass(POSITIONABLE);
		createEAttribute(positionableEClass, POSITIONABLE__XPOS);
		createEAttribute(positionableEClass, POSITIONABLE__YPOS);
		createEAttribute(positionableEClass, POSITIONABLE__WIDTH);
		createEAttribute(positionableEClass, POSITIONABLE__HEIGHT);

		widgetEClass = createEClass(WIDGET);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__WIDGETS);

		compositeWidgetEClass = createEClass(COMPOSITE_WIDGET);
		createEReference(compositeWidgetEClass, COMPOSITE_WIDGET__COMPONENTS);

		windowEClass = createEClass(WINDOW);

		toolBarEClass = createEClass(TOOL_BAR);

		menuEClass = createEClass(MENU);

		menuItemEClass = createEClass(MENU_ITEM);

		panelEClass = createEClass(PANEL);

		plainPanelEClass = createEClass(PLAIN_PANEL);

		tabbedPanelEClass = createEClass(TABBED_PANEL);

		widgetGroupEClass = createEClass(WIDGET_GROUP);

		textWidgetEClass = createEClass(TEXT_WIDGET);

		textBoxEClass = createEClass(TEXT_BOX);

		textAreaEClass = createEClass(TEXT_AREA);
		createEAttribute(textAreaEClass, TEXT_AREA__ROWS);
		createEAttribute(textAreaEClass, TEXT_AREA__COLUMNS);

		labelEClass = createEClass(LABEL);

		imageEClass = createEClass(IMAGE);

		buttonEClass = createEClass(BUTTON);

		listBoxEClass = createEClass(LIST_BOX);

		comboBoxEClass = createEClass(COMBO_BOX);

		radioButtonEClass = createEClass(RADIO_BUTTON);
		createEAttribute(radioButtonEClass, RADIO_BUTTON__SELECTED);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__SELECTED);

		radioGroupEClass = createEClass(RADIO_GROUP);
		createEReference(radioGroupEClass, RADIO_GROUP__SELECTED);
		createEReference(radioGroupEClass, RADIO_GROUP__ITEMS);

		checkGroupEClass = createEClass(CHECK_GROUP);
		createEReference(checkGroupEClass, CHECK_GROUP__ITEMS);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__ROWS);

		rowEClass = createEClass(ROW);
		createEAttribute(rowEClass, ROW__VALUES);

		fontEClass = createEClass(FONT);
		createEAttribute(fontEClass, FONT__TYPE);
		createEAttribute(fontEClass, FONT__SIZE);

		scrollBarEClass = createEClass(SCROLL_BAR);

		borderEClass = createEClass(BORDER);
		createEAttribute(borderEClass, BORDER__TYPE);

		treeViewerEClass = createEClass(TREE_VIEWER);

		// Create enums
		alignmentTypeEEnum = createEEnum(ALIGNMENT_TYPE);
		fontTypeEEnum = createEEnum(FONT_TYPE);
		colourTypeEEnum = createEEnum(COLOUR_TYPE);
		borderTypeEEnum = createEEnum(BORDER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		widgetEClass.getESuperTypes().add(this.getPositionable());
		widgetEClass.getESuperTypes().add(this.getIdentifiedElement());
		containerEClass.getESuperTypes().add(this.getWidget());
		compositeWidgetEClass.getESuperTypes().add(this.getWidget());
		windowEClass.getESuperTypes().add(this.getContainer());
		windowEClass.getESuperTypes().add(this.getNamedElement());
		toolBarEClass.getESuperTypes().add(this.getWidget());
		menuEClass.getESuperTypes().add(this.getWidget());
		menuItemEClass.getESuperTypes().add(this.getWidget());
		panelEClass.getESuperTypes().add(this.getContainer());
		plainPanelEClass.getESuperTypes().add(this.getPanel());
		tabbedPanelEClass.getESuperTypes().add(this.getPanel());
		widgetGroupEClass.getESuperTypes().add(this.getContainer());
		widgetGroupEClass.getESuperTypes().add(this.getTextElement());
		textWidgetEClass.getESuperTypes().add(this.getWidget());
		textWidgetEClass.getESuperTypes().add(this.getTextElement());
		textBoxEClass.getESuperTypes().add(this.getTextWidget());
		textAreaEClass.getESuperTypes().add(this.getTextWidget());
		labelEClass.getESuperTypes().add(this.getTextWidget());
		imageEClass.getESuperTypes().add(this.getTextWidget());
		buttonEClass.getESuperTypes().add(this.getTextWidget());
		listBoxEClass.getESuperTypes().add(this.getWidget());
		comboBoxEClass.getESuperTypes().add(this.getTextWidget());
		radioButtonEClass.getESuperTypes().add(this.getTextWidget());
		checkBoxEClass.getESuperTypes().add(this.getTextWidget());
		radioGroupEClass.getESuperTypes().add(this.getWidget());
		checkGroupEClass.getESuperTypes().add(this.getWidget());
		tableEClass.getESuperTypes().add(this.getWidget());
		scrollBarEClass.getESuperTypes().add(this.getWidget());
		treeViewerEClass.getESuperTypes().add(this.getWidget());

		// Initialize classes and features; add operations and parameters
		initEClass(sketchRootEClass, SketchRoot.class, "SketchRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketchRoot_Windows(), this.getWindow(), null, "windows", null, 0, -1, SketchRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textElementEClass, TextElement.class, "TextElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionableEClass, Positionable.class, "Positionable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionable_XPos(), ecorePackage.getEInt(), "xPos", "0", 1, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionable_YPos(), ecorePackage.getEInt(), "yPos", "0", 1, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionable_Width(), ecorePackage.getEInt(), "width", "0", 1, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionable_Height(), ecorePackage.getEInt(), "height", "0", 1, 1, Positionable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, lasser.sketch.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, lasser.sketch.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeWidgetEClass, CompositeWidget.class, "CompositeWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeWidget_Components(), this.getWidget(), null, "components", null, 0, -1, CompositeWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolBarEClass, ToolBar.class, "ToolBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(panelEClass, Panel.class, "Panel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plainPanelEClass, PlainPanel.class, "PlainPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabbedPanelEClass, TabbedPanel.class, "TabbedPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(widgetGroupEClass, WidgetGroup.class, "WidgetGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textWidgetEClass, TextWidget.class, "TextWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textBoxEClass, TextBox.class, "TextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextArea_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listBoxEClass, ListBox.class, "ListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioButton_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, RadioButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioGroupEClass, RadioGroup.class, "RadioGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadioGroup_Selected(), this.getRadioButton(), null, "selected", null, 0, 1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRadioGroup_Items(), this.getRadioButton(), null, "items", null, 0, -1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkGroupEClass, CheckGroup.class, "CheckGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckGroup_Items(), this.getCheckBox(), null, "items", null, 0, -1, CheckGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Rows(), this.getRow(), null, "rows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRow_Values(), ecorePackage.getEString(), "values", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontEClass, Font.class, "Font", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFont_Type(), this.getFontType(), "type", null, 0, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFont_Size(), ecorePackage.getEInt(), "size", "12", 1, 1, Font.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scrollBarEClass, ScrollBar.class, "ScrollBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(borderEClass, Border.class, "Border", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorder_Type(), this.getBorderType(), "type", null, 1, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeViewerEClass, TreeViewer.class, "TreeViewer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(alignmentTypeEEnum, AlignmentType.class, "AlignmentType");
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.NONE);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.TOP);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.BOTTOM);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.LEFT);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.RIGHT);
		addEEnumLiteral(alignmentTypeEEnum, AlignmentType.REST);

		initEEnum(fontTypeEEnum, FontType.class, "FontType");
		addEEnumLiteral(fontTypeEEnum, FontType.DEFAULT);
		addEEnumLiteral(fontTypeEEnum, FontType.TIMES_NEW_ROMAN);
		addEEnumLiteral(fontTypeEEnum, FontType.ARIAL);
		addEEnumLiteral(fontTypeEEnum, FontType.COURIER_NEW);

		initEEnum(colourTypeEEnum, ColourType.class, "ColourType");
		addEEnumLiteral(colourTypeEEnum, ColourType.BLACK);
		addEEnumLiteral(colourTypeEEnum, ColourType.WHITE);
		addEEnumLiteral(colourTypeEEnum, ColourType.GRAY);

		initEEnum(borderTypeEEnum, BorderType.class, "BorderType");
		addEEnumLiteral(borderTypeEEnum, BorderType.DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //SketchPackageImpl
