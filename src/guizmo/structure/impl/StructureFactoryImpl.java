/**
 */
package guizmo.structure.impl;

import guizmo.structure.*;

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
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureFactory init() {
		try {
			StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelum.es/guizmo/structure"); 
			if (theStructureFactory != null) {
				return theStructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactoryImpl() {
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
			case StructurePackage.STRUCTURE_ROOT: return createStructureRoot();
			case StructurePackage.RESOURCE_REPOSITORY: return createResourceRepository();
			case StructurePackage.IMAGE_RESOURCE: return createImageResource();
			case StructurePackage.I18N_RESOURCE: return createI18NResource();
			case StructurePackage.TEXT_TRANSLATION: return createTextTranslation();
			case StructurePackage.GRAPHICAL_VIEW: return createGraphicalView();
			case StructurePackage.GUI_REGION: return createGUIRegion();
			case StructurePackage.TEXT: return createText();
			case StructurePackage.IMAGE: return createImage();
			case StructurePackage.OUTPUT_TEXT: return createOutputText();
			case StructurePackage.TEXT_BOX: return createTextBox();
			case StructurePackage.TEXT_AREA: return createTextArea();
			case StructurePackage.ITEM: return createItem();
			case StructurePackage.COMBO_BOX: return createComboBox();
			case StructurePackage.CHECK_BOX: return createCheckBox();
			case StructurePackage.RADIO_GROUP: return createRadioGroup();
			case StructurePackage.LIST_BOX: return createListBox();
			case StructurePackage.IMAGE_CONTAINER: return createImageContainer();
			case StructurePackage.VIDEO_CONTAINER: return createVideoContainer();
			case StructurePackage.BUTTON: return createButton();
			case StructurePackage.OBJECT_WIDGET: return createObjectWidget();
			case StructurePackage.TABLE: return createTable();
			case StructurePackage.TABLE_ROW: return createTableRow();
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
			case StructurePackage.LANGUAGE_TYPE:
				return createLanguageTypeFromString(eDataType, initialValue);
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
			case StructurePackage.LANGUAGE_TYPE:
				return convertLanguageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureRoot createStructureRoot() {
		StructureRootImpl structureRoot = new StructureRootImpl();
		return structureRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRepository createResourceRepository() {
		ResourceRepositoryImpl resourceRepository = new ResourceRepositoryImpl();
		return resourceRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageResource createImageResource() {
		ImageResourceImpl imageResource = new ImageResourceImpl();
		return imageResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18NResource createI18NResource() {
		I18NResourceImpl i18NResource = new I18NResourceImpl();
		return i18NResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTranslation createTextTranslation() {
		TextTranslationImpl textTranslation = new TextTranslationImpl();
		return textTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalView createGraphicalView() {
		GraphicalViewImpl graphicalView = new GraphicalViewImpl();
		return graphicalView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GUIRegion createGUIRegion() {
		GUIRegionImpl guiRegion = new GUIRegionImpl();
		return guiRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
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
	public OutputText createOutputText() {
		OutputTextImpl outputText = new OutputTextImpl();
		return outputText;
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
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
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
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
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
	public ListBox createListBox() {
		ListBoxImpl listBox = new ListBoxImpl();
		return listBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageContainer createImageContainer() {
		ImageContainerImpl imageContainer = new ImageContainerImpl();
		return imageContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoContainer createVideoContainer() {
		VideoContainerImpl videoContainer = new VideoContainerImpl();
		return videoContainer;
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
	public ObjectWidget createObjectWidget() {
		ObjectWidgetImpl objectWidget = new ObjectWidgetImpl();
		return objectWidget;
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
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurePackage getStructurePackage() {
		return (StructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurePackage getPackage() {
		return StructurePackage.eINSTANCE;
	}

} //StructureFactoryImpl
