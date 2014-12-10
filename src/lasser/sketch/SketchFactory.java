/**
 */
package lasser.sketch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lasser.sketch.SketchPackage
 * @generated
 */
public interface SketchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SketchFactory eINSTANCE = lasser.sketch.impl.SketchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	SketchRoot createSketchRoot();

	/**
	 * Returns a new object of class '<em>Composite Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Widget</em>'.
	 * @generated
	 */
	CompositeWidget createCompositeWidget();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Bar</em>'.
	 * @generated
	 */
	ToolBar createToolBar();

	/**
	 * Returns a new object of class '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu</em>'.
	 * @generated
	 */
	Menu createMenu();

	/**
	 * Returns a new object of class '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Item</em>'.
	 * @generated
	 */
	MenuItem createMenuItem();

	/**
	 * Returns a new object of class '<em>Plain Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Panel</em>'.
	 * @generated
	 */
	PlainPanel createPlainPanel();

	/**
	 * Returns a new object of class '<em>Tabbed Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabbed Panel</em>'.
	 * @generated
	 */
	TabbedPanel createTabbedPanel();

	/**
	 * Returns a new object of class '<em>Widget Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Group</em>'.
	 * @generated
	 */
	WidgetGroup createWidgetGroup();

	/**
	 * Returns a new object of class '<em>Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Box</em>'.
	 * @generated
	 */
	TextBox createTextBox();

	/**
	 * Returns a new object of class '<em>Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Area</em>'.
	 * @generated
	 */
	TextArea createTextArea();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>List Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Box</em>'.
	 * @generated
	 */
	ListBox createListBox();

	/**
	 * Returns a new object of class '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box</em>'.
	 * @generated
	 */
	ComboBox createComboBox();

	/**
	 * Returns a new object of class '<em>Radio Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Group</em>'.
	 * @generated
	 */
	RadioGroup createRadioGroup();

	/**
	 * Returns a new object of class '<em>Check Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Group</em>'.
	 * @generated
	 */
	CheckGroup createCheckGroup();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Button</em>'.
	 * @generated
	 */
	RadioButton createRadioButton();

	/**
	 * Returns a new object of class '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font</em>'.
	 * @generated
	 */
	Font createFont();

	/**
	 * Returns a new object of class '<em>Scroll Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scroll Bar</em>'.
	 * @generated
	 */
	ScrollBar createScrollBar();

	/**
	 * Returns a new object of class '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border</em>'.
	 * @generated
	 */
	Border createBorder();

	/**
	 * Returns a new object of class '<em>Tree Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Viewer</em>'.
	 * @generated
	 */
	TreeViewer createTreeViewer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SketchPackage getSketchPackage();

} //SketchFactory
