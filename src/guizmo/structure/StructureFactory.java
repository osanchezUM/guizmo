/**
 */
package guizmo.structure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guizmo.structure.StructurePackage
 * @generated
 */
public interface StructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureFactory eINSTANCE = guizmo.structure.impl.StructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	StructureRoot createStructureRoot();

	/**
	 * Returns a new object of class '<em>Resource Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Repository</em>'.
	 * @generated
	 */
	ResourceRepository createResourceRepository();

	/**
	 * Returns a new object of class '<em>Image Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Resource</em>'.
	 * @generated
	 */
	ImageResource createImageResource();

	/**
	 * Returns a new object of class '<em>I18N Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I18N Resource</em>'.
	 * @generated
	 */
	I18NResource createI18NResource();

	/**
	 * Returns a new object of class '<em>Text Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Translation</em>'.
	 * @generated
	 */
	TextTranslation createTextTranslation();

	/**
	 * Returns a new object of class '<em>Graphical View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphical View</em>'.
	 * @generated
	 */
	GraphicalView createGraphicalView();

	/**
	 * Returns a new object of class '<em>GUI Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GUI Region</em>'.
	 * @generated
	 */
	GUIRegion createGUIRegion();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Output Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Text</em>'.
	 * @generated
	 */
	OutputText createOutputText();

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
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combo Box</em>'.
	 * @generated
	 */
	ComboBox createComboBox();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns a new object of class '<em>Radio Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radio Group</em>'.
	 * @generated
	 */
	RadioGroup createRadioGroup();

	/**
	 * Returns a new object of class '<em>List Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Box</em>'.
	 * @generated
	 */
	ListBox createListBox();

	/**
	 * Returns a new object of class '<em>Image Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Container</em>'.
	 * @generated
	 */
	ImageContainer createImageContainer();

	/**
	 * Returns a new object of class '<em>Video Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Container</em>'.
	 * @generated
	 */
	VideoContainer createVideoContainer();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Object Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Widget</em>'.
	 * @generated
	 */
	ObjectWidget createObjectWidget();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructurePackage getStructurePackage();

} //StructureFactory
