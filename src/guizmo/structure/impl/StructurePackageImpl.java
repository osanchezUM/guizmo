/**
 */
package guizmo.structure.impl;

import guizmo.structure.Button;
import guizmo.structure.CheckBox;
import guizmo.structure.ComboBox;
import guizmo.structure.ComposableWidget;
import guizmo.structure.GUIRegion;
import guizmo.structure.GraphicalElement;
import guizmo.structure.GraphicalResource;
import guizmo.structure.GraphicalView;
import guizmo.structure.I18NResource;
import guizmo.structure.Image;
import guizmo.structure.ImageContainer;
import guizmo.structure.ImageResource;
import guizmo.structure.Item;
import guizmo.structure.Itemizable;
import guizmo.structure.LanguageType;
import guizmo.structure.Linkable;
import guizmo.structure.ListBox;
import guizmo.structure.ListItem;
import guizmo.structure.Locatable;
import guizmo.structure.Menu;
import guizmo.structure.ObjectWidget;
import guizmo.structure.OutputText;
import guizmo.structure.RadioButton;
import guizmo.structure.RadioGroup;
import guizmo.structure.Resource;
import guizmo.structure.ResourceRepository;
import guizmo.structure.SingleWidget;
import guizmo.structure.StructureFactory;
import guizmo.structure.StructurePackage;
import guizmo.structure.StructureRoot;
import guizmo.structure.Table;
import guizmo.structure.TableRow;
import guizmo.structure.Text;
import guizmo.structure.TextArea;
import guizmo.structure.TextBox;
import guizmo.structure.TextTranslation;
import guizmo.structure.Toolbar;
import guizmo.structure.VideoContainer;
import guizmo.structure.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
	
	
	@Override
	protected org.eclipse.emf.ecore.resource.Resource createResource(String uri) {
		return super.createResource(
				"../../guizmo.structureMM/bin/guizmo/structureMM/structure.ecore"	
				);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18NResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatableEClass = null;

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
	private EClass graphicalViewEClass = null;

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
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composableWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

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
	private EClass linkableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTextEClass = null;

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
	private EClass itemizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

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
	private EClass checkBoxEClass = null;

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
	private EClass listBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoContainerEClass = null;

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
	private EClass objectWidgetEClass = null;

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
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

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
	 * @see guizmo.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl() {
		super(eNS_URI, StructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructurePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStructurePackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI, theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureRoot() {
		return structureRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureRoot_Views() {
		return (EReference)structureRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureRoot_ResourceRepository() {
		return (EReference)structureRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRepository() {
		return resourceRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRepository_Resources() {
		return (EReference)resourceRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageResource() {
		return imageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI18NResource() {
		return i18NResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI18NResource_Language() {
		return (EAttribute)i18NResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getI18NResource_Translations() {
		return (EReference)i18NResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextTranslation() {
		return textTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextTranslation_Name() {
		return (EAttribute)textTranslationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextTranslation_Value() {
		return (EAttribute)textTranslationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalElement() {
		return graphicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_Id() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_Name() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_Description() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_BriefDescription() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_IsVisible() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_IsEnabled() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_IsResizable() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocatable() {
		return locatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatable_Xmin() {
		return (EAttribute)locatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatable_Ymin() {
		return (EAttribute)locatableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatable_Xmax() {
		return (EAttribute)locatableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocatable_Ymax() {
		return (EAttribute)locatableEClass.getEStructuralFeatures().get(3);
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
	public EClass getGraphicalView() {
		return graphicalViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalView_Title() {
		return (EReference)graphicalViewEClass.getEStructuralFeatures().get(0);
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
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolbar() {
		return toolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposableWidget() {
		return composableWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGUIRegion() {
		return guiRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIRegion_Border() {
		return (EAttribute)guiRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGUIRegion_Title() {
		return (EAttribute)guiRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleWidget() {
		return singleWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalResource() {
		return graphicalResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalResource_Key() {
		return (EAttribute)graphicalResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalResource_Value() {
		return (EAttribute)graphicalResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalResource_Resource() {
		return (EReference)graphicalResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
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
	public EClass getLinkable() {
		return linkableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkable_IsHyperlink() {
		return (EAttribute)linkableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkable_Uri() {
		return (EAttribute)linkableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputText() {
		return outputTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputText_Text() {
		return (EReference)outputTextEClass.getEStructuralFeatures().get(0);
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
	public EReference getTextBox_Text() {
		return (EReference)textBoxEClass.getEStructuralFeatures().get(0);
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
	public EReference getTextArea_Text() {
		return (EReference)textAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextArea_NumRows() {
		return (EAttribute)textAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemizable() {
		return itemizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemizable_Items() {
		return (EReference)itemizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Resource() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
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
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckBox_Resource() {
		return (EReference)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckBox_Selected() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRadioGroup_MultipleSelection() {
		return (EAttribute)radioGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadioGroup_Selected() {
		return (EReference)radioGroupEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getListBox_MultipleSelection() {
		return (EAttribute)listBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageContainer() {
		return imageContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageContainer_Image() {
		return (EReference)imageContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoContainer() {
		return videoContainerEClass;
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
	public EReference getButton_Graphic() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectWidget() {
		return objectWidgetEClass;
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
	public EReference getTable_Headers() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Types() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Values() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory() {
		return (StructureFactory)getEFactoryInstance();
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
		structureRootEClass = createEClass(STRUCTURE_ROOT);
		createEReference(structureRootEClass, STRUCTURE_ROOT__VIEWS);
		createEReference(structureRootEClass, STRUCTURE_ROOT__RESOURCE_REPOSITORY);

		resourceRepositoryEClass = createEClass(RESOURCE_REPOSITORY);
		createEReference(resourceRepositoryEClass, RESOURCE_REPOSITORY__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		imageResourceEClass = createEClass(IMAGE_RESOURCE);

		i18NResourceEClass = createEClass(I18N_RESOURCE);
		createEAttribute(i18NResourceEClass, I18N_RESOURCE__LANGUAGE);
		createEReference(i18NResourceEClass, I18N_RESOURCE__TRANSLATIONS);

		textTranslationEClass = createEClass(TEXT_TRANSLATION);
		createEAttribute(textTranslationEClass, TEXT_TRANSLATION__NAME);
		createEAttribute(textTranslationEClass, TEXT_TRANSLATION__VALUE);

		graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__ID);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__NAME);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__DESCRIPTION);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__IS_VISIBLE);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__IS_ENABLED);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__IS_RESIZABLE);

		locatableEClass = createEClass(LOCATABLE);
		createEAttribute(locatableEClass, LOCATABLE__XMIN);
		createEAttribute(locatableEClass, LOCATABLE__YMIN);
		createEAttribute(locatableEClass, LOCATABLE__XMAX);
		createEAttribute(locatableEClass, LOCATABLE__YMAX);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__WIDGETS);

		graphicalViewEClass = createEClass(GRAPHICAL_VIEW);
		createEReference(graphicalViewEClass, GRAPHICAL_VIEW__TITLE);

		widgetEClass = createEClass(WIDGET);

		menuEClass = createEClass(MENU);

		toolbarEClass = createEClass(TOOLBAR);

		composableWidgetEClass = createEClass(COMPOSABLE_WIDGET);

		guiRegionEClass = createEClass(GUI_REGION);
		createEAttribute(guiRegionEClass, GUI_REGION__BORDER);
		createEAttribute(guiRegionEClass, GUI_REGION__TITLE);

		singleWidgetEClass = createEClass(SINGLE_WIDGET);

		graphicalResourceEClass = createEClass(GRAPHICAL_RESOURCE);
		createEAttribute(graphicalResourceEClass, GRAPHICAL_RESOURCE__KEY);
		createEAttribute(graphicalResourceEClass, GRAPHICAL_RESOURCE__VALUE);
		createEReference(graphicalResourceEClass, GRAPHICAL_RESOURCE__RESOURCE);

		textEClass = createEClass(TEXT);

		imageEClass = createEClass(IMAGE);

		linkableEClass = createEClass(LINKABLE);
		createEAttribute(linkableEClass, LINKABLE__IS_HYPERLINK);
		createEAttribute(linkableEClass, LINKABLE__URI);

		outputTextEClass = createEClass(OUTPUT_TEXT);
		createEReference(outputTextEClass, OUTPUT_TEXT__TEXT);

		textBoxEClass = createEClass(TEXT_BOX);
		createEReference(textBoxEClass, TEXT_BOX__TEXT);

		textAreaEClass = createEClass(TEXT_AREA);
		createEReference(textAreaEClass, TEXT_AREA__TEXT);
		createEAttribute(textAreaEClass, TEXT_AREA__NUM_ROWS);

		itemizableEClass = createEClass(ITEMIZABLE);
		createEReference(itemizableEClass, ITEMIZABLE__ITEMS);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__RESOURCE);

		comboBoxEClass = createEClass(COMBO_BOX);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEReference(checkBoxEClass, CHECK_BOX__RESOURCE);
		createEAttribute(checkBoxEClass, CHECK_BOX__SELECTED);

		radioGroupEClass = createEClass(RADIO_GROUP);
		createEAttribute(radioGroupEClass, RADIO_GROUP__MULTIPLE_SELECTION);
		createEReference(radioGroupEClass, RADIO_GROUP__SELECTED);

		listBoxEClass = createEClass(LIST_BOX);
		createEAttribute(listBoxEClass, LIST_BOX__MULTIPLE_SELECTION);

		imageContainerEClass = createEClass(IMAGE_CONTAINER);
		createEReference(imageContainerEClass, IMAGE_CONTAINER__IMAGE);

		videoContainerEClass = createEClass(VIDEO_CONTAINER);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__GRAPHIC);

		objectWidgetEClass = createEClass(OBJECT_WIDGET);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__HEADERS);
		createEReference(tableEClass, TABLE__TYPES);
		createEReference(tableEClass, TABLE__ROWS);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__VALUES);

		// Create enums
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
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
		imageResourceEClass.getESuperTypes().add(this.getResource());
		imageResourceEClass.getESuperTypes().add(this.getLocatable());
		i18NResourceEClass.getESuperTypes().add(this.getResource());
		containerEClass.getESuperTypes().add(this.getGraphicalElement());
		containerEClass.getESuperTypes().add(this.getLocatable());
		graphicalViewEClass.getESuperTypes().add(this.getContainer());
		widgetEClass.getESuperTypes().add(this.getGraphicalElement());
		menuEClass.getESuperTypes().add(this.getWidget());
		toolbarEClass.getESuperTypes().add(this.getWidget());
		composableWidgetEClass.getESuperTypes().add(this.getWidget());
		composableWidgetEClass.getESuperTypes().add(this.getLocatable());
		guiRegionEClass.getESuperTypes().add(this.getContainer());
		guiRegionEClass.getESuperTypes().add(this.getComposableWidget());
		singleWidgetEClass.getESuperTypes().add(this.getComposableWidget());
		textEClass.getESuperTypes().add(this.getGraphicalResource());
		imageEClass.getESuperTypes().add(this.getGraphicalResource());
		outputTextEClass.getESuperTypes().add(this.getSingleWidget());
		outputTextEClass.getESuperTypes().add(this.getLinkable());
		textBoxEClass.getESuperTypes().add(this.getSingleWidget());
		textAreaEClass.getESuperTypes().add(this.getSingleWidget());
		itemEClass.getESuperTypes().add(this.getGraphicalElement());
		comboBoxEClass.getESuperTypes().add(this.getSingleWidget());
		comboBoxEClass.getESuperTypes().add(this.getItemizable());
		checkBoxEClass.getESuperTypes().add(this.getSingleWidget());
		radioGroupEClass.getESuperTypes().add(this.getSingleWidget());
		radioGroupEClass.getESuperTypes().add(this.getItemizable());
		listBoxEClass.getESuperTypes().add(this.getSingleWidget());
		listBoxEClass.getESuperTypes().add(this.getItemizable());
		imageContainerEClass.getESuperTypes().add(this.getSingleWidget());
		imageContainerEClass.getESuperTypes().add(this.getLinkable());
		videoContainerEClass.getESuperTypes().add(this.getSingleWidget());
		buttonEClass.getESuperTypes().add(this.getSingleWidget());
		objectWidgetEClass.getESuperTypes().add(this.getSingleWidget());
		tableEClass.getESuperTypes().add(this.getSingleWidget());

		// Initialize classes and features; add operations and parameters
		initEClass(structureRootEClass, StructureRoot.class, "StructureRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureRoot_Views(), this.getGraphicalView(), null, "views", null, 0, -1, StructureRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureRoot_ResourceRepository(), this.getResourceRepository(), null, "resourceRepository", null, 0, 1, StructureRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRepositoryEClass, ResourceRepository.class, "ResourceRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRepository_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageResourceEClass, ImageResource.class, "ImageResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(i18NResourceEClass, I18NResource.class, "I18NResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18NResource_Language(), this.getLanguageType(), "language", null, 1, 1, I18NResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getI18NResource_Translations(), this.getTextTranslation(), null, "translations", null, 0, -1, I18NResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textTranslationEClass, TextTranslation.class, "TextTranslation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextTranslation_Name(), ecorePackage.getEString(), "name", null, 0, 1, TextTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextTranslation_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextTranslation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalElementEClass, GraphicalElement.class, "GraphicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_BriefDescription(), ecorePackage.getEString(), "briefDescription", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_IsVisible(), ecorePackage.getEBoolean(), "isVisible", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_IsEnabled(), ecorePackage.getEBoolean(), "isEnabled", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_IsResizable(), ecorePackage.getEBoolean(), "isResizable", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatableEClass, Locatable.class, "Locatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocatable_Xmin(), ecorePackage.getEInt(), "xmin", null, 0, 1, Locatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatable_Ymin(), ecorePackage.getEInt(), "ymin", null, 0, 1, Locatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatable_Xmax(), ecorePackage.getEInt(), "xmax", null, 0, 1, Locatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocatable_Ymax(), ecorePackage.getEInt(), "ymax", null, 0, 1, Locatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, guizmo.structure.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Widgets(), this.getComposableWidget(), null, "widgets", null, 0, -1, guizmo.structure.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalViewEClass, GraphicalView.class, "GraphicalView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicalView_Title(), this.getText(), null, "title", null, 0, 1, GraphicalView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuEClass, Menu.class, "Menu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toolbarEClass, Toolbar.class, "Toolbar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composableWidgetEClass, ComposableWidget.class, "ComposableWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guiRegionEClass, GUIRegion.class, "GUIRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUIRegion_Border(), ecorePackage.getEBoolean(), "border", null, 0, 1, GUIRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGUIRegion_Title(), ecorePackage.getEString(), "title", null, 0, 1, GUIRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleWidgetEClass, SingleWidget.class, "SingleWidget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicalResourceEClass, GraphicalResource.class, "GraphicalResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalResource_Key(), ecorePackage.getEString(), "key", null, 0, 1, GraphicalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, GraphicalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicalResource_Resource(), this.getResource(), null, "resource", null, 0, 1, GraphicalResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkableEClass, Linkable.class, "Linkable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkable_IsHyperlink(), ecorePackage.getEBoolean(), "isHyperlink", null, 0, 1, Linkable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkable_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Linkable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputTextEClass, OutputText.class, "OutputText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputText_Text(), this.getText(), null, "text", null, 1, 1, OutputText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textBoxEClass, TextBox.class, "TextBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextBox_Text(), this.getText(), null, "text", null, 0, 1, TextBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textAreaEClass, TextArea.class, "TextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextArea_Text(), this.getText(), null, "text", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextArea_NumRows(), ecorePackage.getEInt(), "numRows", null, 0, 1, TextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemizableEClass, Itemizable.class, "Itemizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemizable_Items(), this.getItem(), null, "items", null, 0, -1, Itemizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Resource(), this.getGraphicalResource(), null, "resource", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckBox_Resource(), this.getGraphicalResource(), null, "resource", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckBox_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radioGroupEClass, RadioGroup.class, "RadioGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadioGroup_MultipleSelection(), ecorePackage.getEBoolean(), "multipleSelection", null, 0, 1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRadioGroup_Selected(), this.getItem(), null, "selected", null, 0, -1, RadioGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listBoxEClass, ListBox.class, "ListBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListBox_MultipleSelection(), ecorePackage.getEBoolean(), "multipleSelection", null, 0, 1, ListBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageContainerEClass, ImageContainer.class, "ImageContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageContainer_Image(), this.getImage(), null, "image", null, 1, 1, ImageContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoContainerEClass, VideoContainer.class, "VideoContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Graphic(), this.getGraphicalResource(), null, "graphic", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectWidgetEClass, ObjectWidget.class, "ObjectWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Headers(), this.getGraphicalResource(), null, "headers", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Types(), this.getSingleWidget(), null, "types", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Rows(), this.getTableRow(), null, "rows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Values(), this.getGraphicalResource(), null, "values", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.EN);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ES);
		addEEnumLiteral(languageTypeEEnum, LanguageType.FR);

		// Create resource
		createResource(eNS_URI);
	}

} //StructurePackageImpl
