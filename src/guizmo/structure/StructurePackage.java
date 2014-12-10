/**
 */
package guizmo.structure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see guizmo.structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/guizmo/structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "struc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurePackage eINSTANCE = guizmo.structure.impl.StructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.StructureRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.StructureRootImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getStructureRoot()
	 * @generated
	 */
	int STRUCTURE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ROOT__VIEWS = 0;

	/**
	 * The feature id for the '<em><b>Resource Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ROOT__RESOURCE_REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ResourceRepositoryImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getResourceRepository()
	 * @generated
	 */
	int RESOURCE_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Resource Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ResourceImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ImageResourceImpl <em>Image Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ImageResourceImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getImageResource()
	 * @generated
	 */
	int IMAGE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__XMIN = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__YMIN = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__XMAX = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE__YMAX = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.I18NResourceImpl <em>I18N Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.I18NResourceImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getI18NResource()
	 * @generated
	 */
	int I18N_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I18N_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I18N_RESOURCE__LANGUAGE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I18N_RESOURCE__TRANSLATIONS = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>I18N Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I18N_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TextTranslationImpl <em>Text Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TextTranslationImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getTextTranslation()
	 * @generated
	 */
	int TEXT_TRANSLATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TRANSLATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TRANSLATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Text Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TRANSLATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.GraphicalElementImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__IS_VISIBLE = 4;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__IS_ENABLED = 5;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__IS_RESIZABLE = 6;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.LocatableImpl <em>Locatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.LocatableImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getLocatable()
	 * @generated
	 */
	int LOCATABLE = 7;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE__XMIN = 0;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE__YMIN = 1;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE__XMAX = 2;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE__YMAX = 3;

	/**
	 * The number of structural features of the '<em>Locatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ContainerImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = GRAPHICAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BRIEF_DESCRIPTION = GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_VISIBLE = GRAPHICAL_ELEMENT__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_ENABLED = GRAPHICAL_ELEMENT__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IS_RESIZABLE = GRAPHICAL_ELEMENT__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__XMIN = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__YMIN = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__XMAX = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__YMAX = GRAPHICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDGETS = GRAPHICAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.GraphicalViewImpl <em>Graphical View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.GraphicalViewImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalView()
	 * @generated
	 */
	int GRAPHICAL_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__BRIEF_DESCRIPTION = CONTAINER__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__IS_VISIBLE = CONTAINER__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__IS_ENABLED = CONTAINER__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__IS_RESIZABLE = CONTAINER__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__XMIN = CONTAINER__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__YMIN = CONTAINER__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__XMAX = CONTAINER__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__YMAX = CONTAINER__YMAX;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW__TITLE = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphical View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_VIEW_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.WidgetImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DESCRIPTION = GRAPHICAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BRIEF_DESCRIPTION = GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IS_VISIBLE = GRAPHICAL_ELEMENT__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IS_ENABLED = GRAPHICAL_ELEMENT__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__IS_RESIZABLE = GRAPHICAL_ELEMENT__IS_RESIZABLE;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.MenuImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__DESCRIPTION = WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__BRIEF_DESCRIPTION = WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__IS_VISIBLE = WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__IS_ENABLED = WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__IS_RESIZABLE = WIDGET__IS_RESIZABLE;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ToolbarImpl <em>Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ToolbarImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getToolbar()
	 * @generated
	 */
	int TOOLBAR = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__DESCRIPTION = WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__BRIEF_DESCRIPTION = WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__IS_VISIBLE = WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__IS_ENABLED = WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__IS_RESIZABLE = WIDGET__IS_RESIZABLE;

	/**
	 * The number of structural features of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ComposableWidgetImpl <em>Composable Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ComposableWidgetImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getComposableWidget()
	 * @generated
	 */
	int COMPOSABLE_WIDGET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__DESCRIPTION = WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__BRIEF_DESCRIPTION = WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__IS_VISIBLE = WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__IS_ENABLED = WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__IS_RESIZABLE = WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__XMIN = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__YMIN = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__XMAX = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET__YMAX = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composable Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSABLE_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.GUIRegionImpl <em>GUI Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.GUIRegionImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getGUIRegion()
	 * @generated
	 */
	int GUI_REGION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__BRIEF_DESCRIPTION = CONTAINER__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__IS_VISIBLE = CONTAINER__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__IS_ENABLED = CONTAINER__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__IS_RESIZABLE = CONTAINER__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__XMIN = CONTAINER__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__YMIN = CONTAINER__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__XMAX = CONTAINER__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__YMAX = CONTAINER__YMAX;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__BORDER = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION__TITLE = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GUI Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_REGION_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.SingleWidgetImpl <em>Single Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.SingleWidgetImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getSingleWidget()
	 * @generated
	 */
	int SINGLE_WIDGET = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__ID = COMPOSABLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__NAME = COMPOSABLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__DESCRIPTION = COMPOSABLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__BRIEF_DESCRIPTION = COMPOSABLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__IS_VISIBLE = COMPOSABLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__IS_ENABLED = COMPOSABLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__IS_RESIZABLE = COMPOSABLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__XMIN = COMPOSABLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__YMIN = COMPOSABLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__XMAX = COMPOSABLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET__YMAX = COMPOSABLE_WIDGET__YMAX;

	/**
	 * The number of structural features of the '<em>Single Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_WIDGET_FEATURE_COUNT = COMPOSABLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.GraphicalResourceImpl <em>Graphical Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.GraphicalResourceImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalResource()
	 * @generated
	 */
	int GRAPHICAL_RESOURCE = 16;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_RESOURCE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_RESOURCE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_RESOURCE__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Graphical Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TextImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__KEY = GRAPHICAL_RESOURCE__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = GRAPHICAL_RESOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__RESOURCE = GRAPHICAL_RESOURCE__RESOURCE;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = GRAPHICAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ImageImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 18;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__KEY = GRAPHICAL_RESOURCE__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VALUE = GRAPHICAL_RESOURCE__VALUE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__RESOURCE = GRAPHICAL_RESOURCE__RESOURCE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHICAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.LinkableImpl <em>Linkable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.LinkableImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getLinkable()
	 * @generated
	 */
	int LINKABLE = 19;

	/**
	 * The feature id for the '<em><b>Is Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__IS_HYPERLINK = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__URI = 1;

	/**
	 * The number of structural features of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.OutputTextImpl <em>Output Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.OutputTextImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getOutputText()
	 * @generated
	 */
	int OUTPUT_TEXT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Is Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__IS_HYPERLINK = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__URI = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT__TEXT = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TEXT_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TextBoxImpl <em>Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TextBoxImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getTextBox()
	 * @generated
	 */
	int TEXT_BOX = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__TEXT = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TextAreaImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NUM_ROWS = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ItemizableImpl <em>Itemizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ItemizableImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getItemizable()
	 * @generated
	 */
	int ITEMIZABLE = 23;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMIZABLE__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Itemizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMIZABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ItemImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = GRAPHICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = GRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = GRAPHICAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BRIEF_DESCRIPTION = GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_VISIBLE = GRAPHICAL_ELEMENT__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_ENABLED = GRAPHICAL_ELEMENT__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_RESIZABLE = GRAPHICAL_ELEMENT__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__RESOURCE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ComboBoxImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ITEMS = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.CheckBoxImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__RESOURCE = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SELECTED = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.RadioGroupImpl <em>Radio Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.RadioGroupImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getRadioGroup()
	 * @generated
	 */
	int RADIO_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__ITEMS = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__MULTIPLE_SELECTION = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__SELECTED = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Radio Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ListBoxImpl <em>List Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ListBoxImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getListBox()
	 * @generated
	 */
	int LIST_BOX = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__ITEMS = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__MULTIPLE_SELECTION = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ImageContainerImpl <em>Image Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ImageContainerImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getImageContainer()
	 * @generated
	 */
	int IMAGE_CONTAINER = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Is Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__IS_HYPERLINK = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__URI = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER__IMAGE = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTAINER_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.VideoContainerImpl <em>Video Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.VideoContainerImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getVideoContainer()
	 * @generated
	 */
	int VIDEO_CONTAINER = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The number of structural features of the '<em>Video Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_CONTAINER_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ButtonImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__GRAPHIC = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.ObjectWidgetImpl <em>Object Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.ObjectWidgetImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getObjectWidget()
	 * @generated
	 */
	int OBJECT_WIDGET = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The number of structural features of the '<em>Object Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WIDGET_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TableImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = SINGLE_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = SINGLE_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = SINGLE_WIDGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Brief Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BRIEF_DESCRIPTION = SINGLE_WIDGET__BRIEF_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_VISIBLE = SINGLE_WIDGET__IS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Is Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_ENABLED = SINGLE_WIDGET__IS_ENABLED;

	/**
	 * The feature id for the '<em><b>Is Resizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_RESIZABLE = SINGLE_WIDGET__IS_RESIZABLE;

	/**
	 * The feature id for the '<em><b>Xmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__XMIN = SINGLE_WIDGET__XMIN;

	/**
	 * The feature id for the '<em><b>Ymin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__YMIN = SINGLE_WIDGET__YMIN;

	/**
	 * The feature id for the '<em><b>Xmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__XMAX = SINGLE_WIDGET__XMAX;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__YMAX = SINGLE_WIDGET__YMAX;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADERS = SINGLE_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPES = SINGLE_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = SINGLE_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = SINGLE_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link guizmo.structure.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.impl.TableRowImpl
	 * @see guizmo.structure.impl.StructurePackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 34;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link guizmo.structure.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see guizmo.structure.LanguageType
	 * @see guizmo.structure.impl.StructurePackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 35;


	/**
	 * Returns the meta object for class '{@link guizmo.structure.StructureRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see guizmo.structure.StructureRoot
	 * @generated
	 */
	EClass getStructureRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.StructureRoot#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see guizmo.structure.StructureRoot#getViews()
	 * @see #getStructureRoot()
	 * @generated
	 */
	EReference getStructureRoot_Views();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.StructureRoot#getResourceRepository <em>Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Repository</em>'.
	 * @see guizmo.structure.StructureRoot#getResourceRepository()
	 * @see #getStructureRoot()
	 * @generated
	 */
	EReference getStructureRoot_ResourceRepository();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ResourceRepository <em>Resource Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Repository</em>'.
	 * @see guizmo.structure.ResourceRepository
	 * @generated
	 */
	EClass getResourceRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.ResourceRepository#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see guizmo.structure.ResourceRepository#getResources()
	 * @see #getResourceRepository()
	 * @generated
	 */
	EReference getResourceRepository_Resources();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see guizmo.structure.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.structure.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ImageResource <em>Image Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Resource</em>'.
	 * @see guizmo.structure.ImageResource
	 * @generated
	 */
	EClass getImageResource();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.I18NResource <em>I18N Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I18N Resource</em>'.
	 * @see guizmo.structure.I18NResource
	 * @generated
	 */
	EClass getI18NResource();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.I18NResource#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see guizmo.structure.I18NResource#getLanguage()
	 * @see #getI18NResource()
	 * @generated
	 */
	EAttribute getI18NResource_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.I18NResource#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see guizmo.structure.I18NResource#getTranslations()
	 * @see #getI18NResource()
	 * @generated
	 */
	EReference getI18NResource_Translations();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.TextTranslation <em>Text Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Translation</em>'.
	 * @see guizmo.structure.TextTranslation
	 * @generated
	 */
	EClass getTextTranslation();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.TextTranslation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.structure.TextTranslation#getName()
	 * @see #getTextTranslation()
	 * @generated
	 */
	EAttribute getTextTranslation_Name();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.TextTranslation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see guizmo.structure.TextTranslation#getValue()
	 * @see #getTextTranslation()
	 * @generated
	 */
	EAttribute getTextTranslation_Value();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see guizmo.structure.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see guizmo.structure.GraphicalElement#getId()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see guizmo.structure.GraphicalElement#getName()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see guizmo.structure.GraphicalElement#getDescription()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#getBriefDescription <em>Brief Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brief Description</em>'.
	 * @see guizmo.structure.GraphicalElement#getBriefDescription()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_BriefDescription();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#isIsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Visible</em>'.
	 * @see guizmo.structure.GraphicalElement#isIsVisible()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_IsVisible();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#isIsEnabled <em>Is Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enabled</em>'.
	 * @see guizmo.structure.GraphicalElement#isIsEnabled()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_IsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalElement#isIsResizable <em>Is Resizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Resizable</em>'.
	 * @see guizmo.structure.GraphicalElement#isIsResizable()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_IsResizable();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Locatable <em>Locatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locatable</em>'.
	 * @see guizmo.structure.Locatable
	 * @generated
	 */
	EClass getLocatable();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Locatable#getXmin <em>Xmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmin</em>'.
	 * @see guizmo.structure.Locatable#getXmin()
	 * @see #getLocatable()
	 * @generated
	 */
	EAttribute getLocatable_Xmin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Locatable#getYmin <em>Ymin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymin</em>'.
	 * @see guizmo.structure.Locatable#getYmin()
	 * @see #getLocatable()
	 * @generated
	 */
	EAttribute getLocatable_Ymin();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Locatable#getXmax <em>Xmax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmax</em>'.
	 * @see guizmo.structure.Locatable#getXmax()
	 * @see #getLocatable()
	 * @generated
	 */
	EAttribute getLocatable_Xmax();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Locatable#getYmax <em>Ymax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymax</em>'.
	 * @see guizmo.structure.Locatable#getYmax()
	 * @see #getLocatable()
	 * @generated
	 */
	EAttribute getLocatable_Ymax();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see guizmo.structure.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.Container#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see guizmo.structure.Container#getWidgets()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Widgets();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.GraphicalView <em>Graphical View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical View</em>'.
	 * @see guizmo.structure.GraphicalView
	 * @generated
	 */
	EClass getGraphicalView();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.GraphicalView#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see guizmo.structure.GraphicalView#getTitle()
	 * @see #getGraphicalView()
	 * @generated
	 */
	EReference getGraphicalView_Title();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see guizmo.structure.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see guizmo.structure.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar</em>'.
	 * @see guizmo.structure.Toolbar
	 * @generated
	 */
	EClass getToolbar();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ComposableWidget <em>Composable Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composable Widget</em>'.
	 * @see guizmo.structure.ComposableWidget
	 * @generated
	 */
	EClass getComposableWidget();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.GUIRegion <em>GUI Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Region</em>'.
	 * @see guizmo.structure.GUIRegion
	 * @generated
	 */
	EClass getGUIRegion();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GUIRegion#isBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see guizmo.structure.GUIRegion#isBorder()
	 * @see #getGUIRegion()
	 * @generated
	 */
	EAttribute getGUIRegion_Border();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GUIRegion#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see guizmo.structure.GUIRegion#getTitle()
	 * @see #getGUIRegion()
	 * @generated
	 */
	EAttribute getGUIRegion_Title();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.SingleWidget <em>Single Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Widget</em>'.
	 * @see guizmo.structure.SingleWidget
	 * @generated
	 */
	EClass getSingleWidget();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.GraphicalResource <em>Graphical Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Resource</em>'.
	 * @see guizmo.structure.GraphicalResource
	 * @generated
	 */
	EClass getGraphicalResource();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalResource#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see guizmo.structure.GraphicalResource#getKey()
	 * @see #getGraphicalResource()
	 * @generated
	 */
	EAttribute getGraphicalResource_Key();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.GraphicalResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see guizmo.structure.GraphicalResource#getValue()
	 * @see #getGraphicalResource()
	 * @generated
	 */
	EAttribute getGraphicalResource_Value();

	/**
	 * Returns the meta object for the reference '{@link guizmo.structure.GraphicalResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see guizmo.structure.GraphicalResource#getResource()
	 * @see #getGraphicalResource()
	 * @generated
	 */
	EReference getGraphicalResource_Resource();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see guizmo.structure.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see guizmo.structure.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable</em>'.
	 * @see guizmo.structure.Linkable
	 * @generated
	 */
	EClass getLinkable();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Linkable#isIsHyperlink <em>Is Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hyperlink</em>'.
	 * @see guizmo.structure.Linkable#isIsHyperlink()
	 * @see #getLinkable()
	 * @generated
	 */
	EAttribute getLinkable_IsHyperlink();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.Linkable#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see guizmo.structure.Linkable#getUri()
	 * @see #getLinkable()
	 * @generated
	 */
	EAttribute getLinkable_Uri();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.OutputText <em>Output Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Text</em>'.
	 * @see guizmo.structure.OutputText
	 * @generated
	 */
	EClass getOutputText();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.OutputText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see guizmo.structure.OutputText#getText()
	 * @see #getOutputText()
	 * @generated
	 */
	EReference getOutputText_Text();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box</em>'.
	 * @see guizmo.structure.TextBox
	 * @generated
	 */
	EClass getTextBox();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.TextBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see guizmo.structure.TextBox#getText()
	 * @see #getTextBox()
	 * @generated
	 */
	EReference getTextBox_Text();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see guizmo.structure.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.TextArea#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see guizmo.structure.TextArea#getText()
	 * @see #getTextArea()
	 * @generated
	 */
	EReference getTextArea_Text();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.TextArea#getNumRows <em>Num Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Rows</em>'.
	 * @see guizmo.structure.TextArea#getNumRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_NumRows();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Itemizable <em>Itemizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itemizable</em>'.
	 * @see guizmo.structure.Itemizable
	 * @generated
	 */
	EClass getItemizable();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.Itemizable#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see guizmo.structure.Itemizable#getItems()
	 * @see #getItemizable()
	 * @generated
	 */
	EReference getItemizable_Items();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see guizmo.structure.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.Item#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see guizmo.structure.Item#getResource()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Resource();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see guizmo.structure.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see guizmo.structure.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.CheckBox#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see guizmo.structure.CheckBox#getResource()
	 * @see #getCheckBox()
	 * @generated
	 */
	EReference getCheckBox_Resource();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.CheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see guizmo.structure.CheckBox#isSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Selected();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Group</em>'.
	 * @see guizmo.structure.RadioGroup
	 * @generated
	 */
	EClass getRadioGroup();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.RadioGroup#isMultipleSelection <em>Multiple Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Selection</em>'.
	 * @see guizmo.structure.RadioGroup#isMultipleSelection()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EAttribute getRadioGroup_MultipleSelection();

	/**
	 * Returns the meta object for the reference list '{@link guizmo.structure.RadioGroup#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected</em>'.
	 * @see guizmo.structure.RadioGroup#getSelected()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_Selected();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ListBox <em>List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Box</em>'.
	 * @see guizmo.structure.ListBox
	 * @generated
	 */
	EClass getListBox();

	/**
	 * Returns the meta object for the attribute '{@link guizmo.structure.ListBox#isMultipleSelection <em>Multiple Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Selection</em>'.
	 * @see guizmo.structure.ListBox#isMultipleSelection()
	 * @see #getListBox()
	 * @generated
	 */
	EAttribute getListBox_MultipleSelection();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ImageContainer <em>Image Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Container</em>'.
	 * @see guizmo.structure.ImageContainer
	 * @generated
	 */
	EClass getImageContainer();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.ImageContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see guizmo.structure.ImageContainer#getImage()
	 * @see #getImageContainer()
	 * @generated
	 */
	EReference getImageContainer_Image();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.VideoContainer <em>Video Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Container</em>'.
	 * @see guizmo.structure.VideoContainer
	 * @generated
	 */
	EClass getVideoContainer();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see guizmo.structure.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link guizmo.structure.Button#getGraphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphic</em>'.
	 * @see guizmo.structure.Button#getGraphic()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Graphic();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.ObjectWidget <em>Object Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Widget</em>'.
	 * @see guizmo.structure.ObjectWidget
	 * @generated
	 */
	EClass getObjectWidget();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see guizmo.structure.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.Table#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see guizmo.structure.Table#getHeaders()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.Table#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see guizmo.structure.Table#getTypes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see guizmo.structure.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link guizmo.structure.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see guizmo.structure.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link guizmo.structure.TableRow#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see guizmo.structure.TableRow#getValues()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Values();

	/**
	 * Returns the meta object for enum '{@link guizmo.structure.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see guizmo.structure.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureFactory getStructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.StructureRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.StructureRootImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getStructureRoot()
		 * @generated
		 */
		EClass STRUCTURE_ROOT = eINSTANCE.getStructureRoot();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ROOT__VIEWS = eINSTANCE.getStructureRoot_Views();

		/**
		 * The meta object literal for the '<em><b>Resource Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_ROOT__RESOURCE_REPOSITORY = eINSTANCE.getStructureRoot_ResourceRepository();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ResourceRepositoryImpl <em>Resource Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ResourceRepositoryImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getResourceRepository()
		 * @generated
		 */
		EClass RESOURCE_REPOSITORY = eINSTANCE.getResourceRepository();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REPOSITORY__RESOURCES = eINSTANCE.getResourceRepository_Resources();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ResourceImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ImageResourceImpl <em>Image Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ImageResourceImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getImageResource()
		 * @generated
		 */
		EClass IMAGE_RESOURCE = eINSTANCE.getImageResource();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.I18NResourceImpl <em>I18N Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.I18NResourceImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getI18NResource()
		 * @generated
		 */
		EClass I18N_RESOURCE = eINSTANCE.getI18NResource();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I18N_RESOURCE__LANGUAGE = eINSTANCE.getI18NResource_Language();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I18N_RESOURCE__TRANSLATIONS = eINSTANCE.getI18NResource_Translations();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TextTranslationImpl <em>Text Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TextTranslationImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getTextTranslation()
		 * @generated
		 */
		EClass TEXT_TRANSLATION = eINSTANCE.getTextTranslation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TRANSLATION__NAME = eINSTANCE.getTextTranslation_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TRANSLATION__VALUE = eINSTANCE.getTextTranslation_Value();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.GraphicalElementImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__ID = eINSTANCE.getGraphicalElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__NAME = eINSTANCE.getGraphicalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__DESCRIPTION = eINSTANCE.getGraphicalElement_Description();

		/**
		 * The meta object literal for the '<em><b>Brief Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__BRIEF_DESCRIPTION = eINSTANCE.getGraphicalElement_BriefDescription();

		/**
		 * The meta object literal for the '<em><b>Is Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__IS_VISIBLE = eINSTANCE.getGraphicalElement_IsVisible();

		/**
		 * The meta object literal for the '<em><b>Is Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__IS_ENABLED = eINSTANCE.getGraphicalElement_IsEnabled();

		/**
		 * The meta object literal for the '<em><b>Is Resizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__IS_RESIZABLE = eINSTANCE.getGraphicalElement_IsResizable();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.LocatableImpl <em>Locatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.LocatableImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getLocatable()
		 * @generated
		 */
		EClass LOCATABLE = eINSTANCE.getLocatable();

		/**
		 * The meta object literal for the '<em><b>Xmin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATABLE__XMIN = eINSTANCE.getLocatable_Xmin();

		/**
		 * The meta object literal for the '<em><b>Ymin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATABLE__YMIN = eINSTANCE.getLocatable_Ymin();

		/**
		 * The meta object literal for the '<em><b>Xmax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATABLE__XMAX = eINSTANCE.getLocatable_Xmax();

		/**
		 * The meta object literal for the '<em><b>Ymax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATABLE__YMAX = eINSTANCE.getLocatable_Ymax();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ContainerImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__WIDGETS = eINSTANCE.getContainer_Widgets();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.GraphicalViewImpl <em>Graphical View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.GraphicalViewImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalView()
		 * @generated
		 */
		EClass GRAPHICAL_VIEW = eINSTANCE.getGraphicalView();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_VIEW__TITLE = eINSTANCE.getGraphicalView_Title();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.WidgetImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.MenuImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ToolbarImpl <em>Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ToolbarImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getToolbar()
		 * @generated
		 */
		EClass TOOLBAR = eINSTANCE.getToolbar();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ComposableWidgetImpl <em>Composable Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ComposableWidgetImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getComposableWidget()
		 * @generated
		 */
		EClass COMPOSABLE_WIDGET = eINSTANCE.getComposableWidget();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.GUIRegionImpl <em>GUI Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.GUIRegionImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getGUIRegion()
		 * @generated
		 */
		EClass GUI_REGION = eINSTANCE.getGUIRegion();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_REGION__BORDER = eINSTANCE.getGUIRegion_Border();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_REGION__TITLE = eINSTANCE.getGUIRegion_Title();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.SingleWidgetImpl <em>Single Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.SingleWidgetImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getSingleWidget()
		 * @generated
		 */
		EClass SINGLE_WIDGET = eINSTANCE.getSingleWidget();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.GraphicalResourceImpl <em>Graphical Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.GraphicalResourceImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getGraphicalResource()
		 * @generated
		 */
		EClass GRAPHICAL_RESOURCE = eINSTANCE.getGraphicalResource();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_RESOURCE__KEY = eINSTANCE.getGraphicalResource_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_RESOURCE__VALUE = eINSTANCE.getGraphicalResource_Value();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_RESOURCE__RESOURCE = eINSTANCE.getGraphicalResource_Resource();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TextImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ImageImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.LinkableImpl <em>Linkable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.LinkableImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getLinkable()
		 * @generated
		 */
		EClass LINKABLE = eINSTANCE.getLinkable();

		/**
		 * The meta object literal for the '<em><b>Is Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKABLE__IS_HYPERLINK = eINSTANCE.getLinkable_IsHyperlink();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKABLE__URI = eINSTANCE.getLinkable_Uri();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.OutputTextImpl <em>Output Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.OutputTextImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getOutputText()
		 * @generated
		 */
		EClass OUTPUT_TEXT = eINSTANCE.getOutputText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_TEXT__TEXT = eINSTANCE.getOutputText_Text();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TextBoxImpl <em>Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TextBoxImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getTextBox()
		 * @generated
		 */
		EClass TEXT_BOX = eINSTANCE.getTextBox();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_BOX__TEXT = eINSTANCE.getTextBox_Text();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TextAreaImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_AREA__TEXT = eINSTANCE.getTextArea_Text();

		/**
		 * The meta object literal for the '<em><b>Num Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__NUM_ROWS = eINSTANCE.getTextArea_NumRows();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ItemizableImpl <em>Itemizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ItemizableImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getItemizable()
		 * @generated
		 */
		EClass ITEMIZABLE = eINSTANCE.getItemizable();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMIZABLE__ITEMS = eINSTANCE.getItemizable_Items();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ItemImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__RESOURCE = eINSTANCE.getItem_Resource();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ComboBoxImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.CheckBoxImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_BOX__RESOURCE = eINSTANCE.getCheckBox_Resource();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__SELECTED = eINSTANCE.getCheckBox_Selected();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.RadioGroupImpl <em>Radio Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.RadioGroupImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getRadioGroup()
		 * @generated
		 */
		EClass RADIO_GROUP = eINSTANCE.getRadioGroup();

		/**
		 * The meta object literal for the '<em><b>Multiple Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_GROUP__MULTIPLE_SELECTION = eINSTANCE.getRadioGroup_MultipleSelection();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_GROUP__SELECTED = eINSTANCE.getRadioGroup_Selected();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ListBoxImpl <em>List Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ListBoxImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getListBox()
		 * @generated
		 */
		EClass LIST_BOX = eINSTANCE.getListBox();

		/**
		 * The meta object literal for the '<em><b>Multiple Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_BOX__MULTIPLE_SELECTION = eINSTANCE.getListBox_MultipleSelection();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ImageContainerImpl <em>Image Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ImageContainerImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getImageContainer()
		 * @generated
		 */
		EClass IMAGE_CONTAINER = eINSTANCE.getImageContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_CONTAINER__IMAGE = eINSTANCE.getImageContainer_Image();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.VideoContainerImpl <em>Video Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.VideoContainerImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getVideoContainer()
		 * @generated
		 */
		EClass VIDEO_CONTAINER = eINSTANCE.getVideoContainer();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ButtonImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Graphic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__GRAPHIC = eINSTANCE.getButton_Graphic();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.ObjectWidgetImpl <em>Object Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.ObjectWidgetImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getObjectWidget()
		 * @generated
		 */
		EClass OBJECT_WIDGET = eINSTANCE.getObjectWidget();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TableImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEADERS = eINSTANCE.getTable_Headers();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TYPES = eINSTANCE.getTable_Types();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link guizmo.structure.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.impl.TableRowImpl
		 * @see guizmo.structure.impl.StructurePackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__VALUES = eINSTANCE.getTableRow_Values();

		/**
		 * The meta object literal for the '{@link guizmo.structure.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see guizmo.structure.LanguageType
		 * @see guizmo.structure.impl.StructurePackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

	}

} //StructurePackage
