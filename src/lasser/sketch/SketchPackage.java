/**
 */
package lasser.sketch;

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
 * @see lasser.sketch.SketchFactory
 * @model kind="package"
 * @generated
 */
public interface SketchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sketch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/layoutGuesser/sketch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sketch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SketchPackage eINSTANCE = lasser.sketch.impl.SketchPackageImpl.init();

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.SketchRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.SketchRootImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getSketchRoot()
	 * @generated
	 */
	int SKETCH_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_ROOT__WINDOWS = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.IdentifiedElementImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.NamedElementImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TextElementImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.PositionableImpl <em>Positionable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.PositionableImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getPositionable()
	 * @generated
	 */
	int POSITIONABLE = 4;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__XPOS = 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__YPOS = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Positionable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.WidgetImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 5;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__XPOS = POSITIONABLE__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__YPOS = POSITIONABLE__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = POSITIONABLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = POSITIONABLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ID = POSITIONABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = POSITIONABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ContainerImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WIDGETS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.CompositeWidgetImpl <em>Composite Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.CompositeWidgetImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getCompositeWidget()
	 * @generated
	 */
	int COMPOSITE_WIDGET = 7;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET__COMPONENTS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.WindowImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 8;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__XPOS = CONTAINER__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__YPOS = CONTAINER__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDTH = CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HEIGHT = CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ToolBarImpl <em>Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ToolBarImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getToolBar()
	 * @generated
	 */
	int TOOL_BAR = 9;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.MenuImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 10;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.MenuItemImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 11;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.PanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.PanelImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getPanel()
	 * @generated
	 */
	int PANEL = 12;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__XPOS = CONTAINER__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__YPOS = CONTAINER__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__WIDTH = CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__HEIGHT = CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PANEL_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.PlainPanelImpl <em>Plain Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.PlainPanelImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getPlainPanel()
	 * @generated
	 */
	int PLAIN_PANEL = 13;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__XPOS = PANEL__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__YPOS = PANEL__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__WIDTH = PANEL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__HEIGHT = PANEL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__ID = PANEL__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL__WIDGETS = PANEL__WIDGETS;

	/**
	 * The number of structural features of the '<em>Plain Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TabbedPanelImpl <em>Tabbed Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TabbedPanelImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTabbedPanel()
	 * @generated
	 */
	int TABBED_PANEL = 14;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__XPOS = PANEL__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__YPOS = PANEL__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__WIDTH = PANEL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__HEIGHT = PANEL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__ID = PANEL__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL__WIDGETS = PANEL__WIDGETS;

	/**
	 * The number of structural features of the '<em>Tabbed Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABBED_PANEL_FEATURE_COUNT = PANEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.WidgetGroupImpl <em>Widget Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.WidgetGroupImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getWidgetGroup()
	 * @generated
	 */
	int WIDGET_GROUP = 15;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__XPOS = CONTAINER__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__YPOS = CONTAINER__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__WIDTH = CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__HEIGHT = CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__WIDGETS = CONTAINER__WIDGETS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP__TEXT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_GROUP_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TextWidgetImpl <em>Text Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TextWidgetImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTextWidget()
	 * @generated
	 */
	int TEXT_WIDGET = 16;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_WIDGET_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TextBoxImpl <em>Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TextBoxImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTextBox()
	 * @generated
	 */
	int TEXT_BOX = 17;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The number of structural features of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TextAreaImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 18;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ROWS = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__COLUMNS = TEXT_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.LabelImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 19;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ImageImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 20;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.CheckBoxImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 25;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ButtonImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 21;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ListBoxImpl <em>List Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ListBoxImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getListBox()
	 * @generated
	 */
	int LIST_BOX = 22;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>List Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ComboBoxImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 23;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.RadioGroupImpl <em>Radio Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.RadioGroupImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getRadioGroup()
	 * @generated
	 */
	int RADIO_GROUP = 26;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.CheckGroupImpl <em>Check Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.CheckGroupImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getCheckGroup()
	 * @generated
	 */
	int CHECK_GROUP = 27;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.RadioButtonImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 24;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__SELECTED = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__XPOS = TEXT_WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__YPOS = TEXT_WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = TEXT_WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGHT = TEXT_WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID = TEXT_WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT = TEXT_WIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SELECTED = TEXT_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = TEXT_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__SELECTED = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP__ITEMS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radio Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_GROUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP__ITEMS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_GROUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TableImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 28;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = WIDGET__ID;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.RowImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 29;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.FontImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.ScrollBarImpl <em>Scroll Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.ScrollBarImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getScrollBar()
	 * @generated
	 */
	int SCROLL_BAR = 31;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>Scroll Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.BorderImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lasser.sketch.impl.TreeViewerImpl <em>Tree Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.impl.TreeViewerImpl
	 * @see lasser.sketch.impl.SketchPackageImpl#getTreeViewer()
	 * @generated
	 */
	int TREE_VIEWER = 33;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER__XPOS = WIDGET__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER__YPOS = WIDGET__YPOS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER__ID = WIDGET__ID;

	/**
	 * The number of structural features of the '<em>Tree Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEWER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lasser.sketch.AlignmentType <em>Alignment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.AlignmentType
	 * @see lasser.sketch.impl.SketchPackageImpl#getAlignmentType()
	 * @generated
	 */
	int ALIGNMENT_TYPE = 34;

	/**
	 * The meta object id for the '{@link lasser.sketch.FontType <em>Font Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.FontType
	 * @see lasser.sketch.impl.SketchPackageImpl#getFontType()
	 * @generated
	 */
	int FONT_TYPE = 35;

	/**
	 * The meta object id for the '{@link lasser.sketch.ColourType <em>Colour Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.ColourType
	 * @see lasser.sketch.impl.SketchPackageImpl#getColourType()
	 * @generated
	 */
	int COLOUR_TYPE = 36;

	/**
	 * The meta object id for the '{@link lasser.sketch.BorderType <em>Border Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.sketch.BorderType
	 * @see lasser.sketch.impl.SketchPackageImpl#getBorderType()
	 * @generated
	 */
	int BORDER_TYPE = 37;


	/**
	 * Returns the meta object for class '{@link lasser.sketch.SketchRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see lasser.sketch.SketchRoot
	 * @generated
	 */
	EClass getSketchRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.SketchRoot#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see lasser.sketch.SketchRoot#getWindows()
	 * @see #getSketchRoot()
	 * @generated
	 */
	EReference getSketchRoot_Windows();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see lasser.sketch.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lasser.sketch.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see lasser.sketch.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lasser.sketch.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see lasser.sketch.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see lasser.sketch.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Positionable <em>Positionable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable</em>'.
	 * @see lasser.sketch.Positionable
	 * @generated
	 */
	EClass getPositionable();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Positionable#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see lasser.sketch.Positionable#getXPos()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_XPos();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Positionable#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see lasser.sketch.Positionable#getYPos()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_YPos();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Positionable#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see lasser.sketch.Positionable#getWidth()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_Width();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Positionable#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see lasser.sketch.Positionable#getHeight()
	 * @see #getPositionable()
	 * @generated
	 */
	EAttribute getPositionable_Height();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see lasser.sketch.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see lasser.sketch.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.Container#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see lasser.sketch.Container#getWidgets()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Widgets();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.CompositeWidget <em>Composite Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Widget</em>'.
	 * @see lasser.sketch.CompositeWidget
	 * @generated
	 */
	EClass getCompositeWidget();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.CompositeWidget#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see lasser.sketch.CompositeWidget#getComponents()
	 * @see #getCompositeWidget()
	 * @generated
	 */
	EReference getCompositeWidget_Components();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see lasser.sketch.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Bar</em>'.
	 * @see lasser.sketch.ToolBar
	 * @generated
	 */
	EClass getToolBar();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see lasser.sketch.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see lasser.sketch.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see lasser.sketch.Panel
	 * @generated
	 */
	EClass getPanel();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.PlainPanel <em>Plain Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Panel</em>'.
	 * @see lasser.sketch.PlainPanel
	 * @generated
	 */
	EClass getPlainPanel();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TabbedPanel <em>Tabbed Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabbed Panel</em>'.
	 * @see lasser.sketch.TabbedPanel
	 * @generated
	 */
	EClass getTabbedPanel();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.WidgetGroup <em>Widget Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Group</em>'.
	 * @see lasser.sketch.WidgetGroup
	 * @generated
	 */
	EClass getWidgetGroup();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TextWidget <em>Text Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Widget</em>'.
	 * @see lasser.sketch.TextWidget
	 * @generated
	 */
	EClass getTextWidget();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box</em>'.
	 * @see lasser.sketch.TextBox
	 * @generated
	 */
	EClass getTextBox();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see lasser.sketch.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.TextArea#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see lasser.sketch.TextArea#getRows()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Rows();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.TextArea#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see lasser.sketch.TextArea#getColumns()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_Columns();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see lasser.sketch.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see lasser.sketch.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see lasser.sketch.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.CheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see lasser.sketch.CheckBox#isSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Selected();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see lasser.sketch.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.ListBox <em>List Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Box</em>'.
	 * @see lasser.sketch.ListBox
	 * @generated
	 */
	EClass getListBox();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see lasser.sketch.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.RadioGroup <em>Radio Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Group</em>'.
	 * @see lasser.sketch.RadioGroup
	 * @generated
	 */
	EClass getRadioGroup();

	/**
	 * Returns the meta object for the reference '{@link lasser.sketch.RadioGroup#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see lasser.sketch.RadioGroup#getSelected()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_Selected();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.RadioGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see lasser.sketch.RadioGroup#getItems()
	 * @see #getRadioGroup()
	 * @generated
	 */
	EReference getRadioGroup_Items();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.CheckGroup <em>Check Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Group</em>'.
	 * @see lasser.sketch.CheckGroup
	 * @generated
	 */
	EClass getCheckGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.CheckGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see lasser.sketch.CheckGroup#getItems()
	 * @see #getCheckGroup()
	 * @generated
	 */
	EReference getCheckGroup_Items();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see lasser.sketch.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.sketch.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see lasser.sketch.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see lasser.sketch.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute list '{@link lasser.sketch.Row#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see lasser.sketch.Row#getValues()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Values();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see lasser.sketch.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.RadioButton#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see lasser.sketch.RadioButton#isSelected()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Selected();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see lasser.sketch.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Font#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lasser.sketch.Font#getType()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Type();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see lasser.sketch.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.ScrollBar <em>Scroll Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Bar</em>'.
	 * @see lasser.sketch.ScrollBar
	 * @generated
	 */
	EClass getScrollBar();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see lasser.sketch.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the attribute '{@link lasser.sketch.Border#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lasser.sketch.Border#getType()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Type();

	/**
	 * Returns the meta object for class '{@link lasser.sketch.TreeViewer <em>Tree Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Viewer</em>'.
	 * @see lasser.sketch.TreeViewer
	 * @generated
	 */
	EClass getTreeViewer();

	/**
	 * Returns the meta object for enum '{@link lasser.sketch.AlignmentType <em>Alignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Type</em>'.
	 * @see lasser.sketch.AlignmentType
	 * @generated
	 */
	EEnum getAlignmentType();

	/**
	 * Returns the meta object for enum '{@link lasser.sketch.FontType <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Type</em>'.
	 * @see lasser.sketch.FontType
	 * @generated
	 */
	EEnum getFontType();

	/**
	 * Returns the meta object for enum '{@link lasser.sketch.ColourType <em>Colour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour Type</em>'.
	 * @see lasser.sketch.ColourType
	 * @generated
	 */
	EEnum getColourType();

	/**
	 * Returns the meta object for enum '{@link lasser.sketch.BorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Type</em>'.
	 * @see lasser.sketch.BorderType
	 * @generated
	 */
	EEnum getBorderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SketchFactory getSketchFactory();

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
		 * The meta object literal for the '{@link lasser.sketch.impl.SketchRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.SketchRootImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getSketchRoot()
		 * @generated
		 */
		EClass SKETCH_ROOT = eINSTANCE.getSketchRoot();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH_ROOT__WINDOWS = eINSTANCE.getSketchRoot_Windows();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.IdentifiedElementImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.NamedElementImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TextElementImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.PositionableImpl <em>Positionable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.PositionableImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getPositionable()
		 * @generated
		 */
		EClass POSITIONABLE = eINSTANCE.getPositionable();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__XPOS = eINSTANCE.getPositionable_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__YPOS = eINSTANCE.getPositionable_YPos();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__WIDTH = eINSTANCE.getPositionable_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE__HEIGHT = eINSTANCE.getPositionable_Height();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.WidgetImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ContainerImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getContainer()
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
		 * The meta object literal for the '{@link lasser.sketch.impl.CompositeWidgetImpl <em>Composite Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.CompositeWidgetImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getCompositeWidget()
		 * @generated
		 */
		EClass COMPOSITE_WIDGET = eINSTANCE.getCompositeWidget();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_WIDGET__COMPONENTS = eINSTANCE.getCompositeWidget_Components();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.WindowImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ToolBarImpl <em>Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ToolBarImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getToolBar()
		 * @generated
		 */
		EClass TOOL_BAR = eINSTANCE.getToolBar();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.MenuImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.MenuItemImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.PanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.PanelImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getPanel()
		 * @generated
		 */
		EClass PANEL = eINSTANCE.getPanel();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.PlainPanelImpl <em>Plain Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.PlainPanelImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getPlainPanel()
		 * @generated
		 */
		EClass PLAIN_PANEL = eINSTANCE.getPlainPanel();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TabbedPanelImpl <em>Tabbed Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TabbedPanelImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTabbedPanel()
		 * @generated
		 */
		EClass TABBED_PANEL = eINSTANCE.getTabbedPanel();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.WidgetGroupImpl <em>Widget Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.WidgetGroupImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getWidgetGroup()
		 * @generated
		 */
		EClass WIDGET_GROUP = eINSTANCE.getWidgetGroup();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TextWidgetImpl <em>Text Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TextWidgetImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTextWidget()
		 * @generated
		 */
		EClass TEXT_WIDGET = eINSTANCE.getTextWidget();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TextBoxImpl <em>Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TextBoxImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTextBox()
		 * @generated
		 */
		EClass TEXT_BOX = eINSTANCE.getTextBox();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TextAreaImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__ROWS = eINSTANCE.getTextArea_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__COLUMNS = eINSTANCE.getTextArea_Columns();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.LabelImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ImageImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.CheckBoxImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__SELECTED = eINSTANCE.getCheckBox_Selected();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ButtonImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ListBoxImpl <em>List Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ListBoxImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getListBox()
		 * @generated
		 */
		EClass LIST_BOX = eINSTANCE.getListBox();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ComboBoxImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.RadioGroupImpl <em>Radio Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.RadioGroupImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getRadioGroup()
		 * @generated
		 */
		EClass RADIO_GROUP = eINSTANCE.getRadioGroup();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_GROUP__SELECTED = eINSTANCE.getRadioGroup_Selected();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO_GROUP__ITEMS = eINSTANCE.getRadioGroup_Items();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.CheckGroupImpl <em>Check Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.CheckGroupImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getCheckGroup()
		 * @generated
		 */
		EClass CHECK_GROUP = eINSTANCE.getCheckGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_GROUP__ITEMS = eINSTANCE.getCheckGroup_Items();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TableImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.RowImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__VALUES = eINSTANCE.getRow_Values();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.RadioButtonImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__SELECTED = eINSTANCE.getRadioButton_Selected();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.FontImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__TYPE = eINSTANCE.getFont_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.ScrollBarImpl <em>Scroll Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.ScrollBarImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getScrollBar()
		 * @generated
		 */
		EClass SCROLL_BAR = eINSTANCE.getScrollBar();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.BorderImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__TYPE = eINSTANCE.getBorder_Type();

		/**
		 * The meta object literal for the '{@link lasser.sketch.impl.TreeViewerImpl <em>Tree Viewer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.impl.TreeViewerImpl
		 * @see lasser.sketch.impl.SketchPackageImpl#getTreeViewer()
		 * @generated
		 */
		EClass TREE_VIEWER = eINSTANCE.getTreeViewer();

		/**
		 * The meta object literal for the '{@link lasser.sketch.AlignmentType <em>Alignment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.AlignmentType
		 * @see lasser.sketch.impl.SketchPackageImpl#getAlignmentType()
		 * @generated
		 */
		EEnum ALIGNMENT_TYPE = eINSTANCE.getAlignmentType();

		/**
		 * The meta object literal for the '{@link lasser.sketch.FontType <em>Font Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.FontType
		 * @see lasser.sketch.impl.SketchPackageImpl#getFontType()
		 * @generated
		 */
		EEnum FONT_TYPE = eINSTANCE.getFontType();

		/**
		 * The meta object literal for the '{@link lasser.sketch.ColourType <em>Colour Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.ColourType
		 * @see lasser.sketch.impl.SketchPackageImpl#getColourType()
		 * @generated
		 */
		EEnum COLOUR_TYPE = eINSTANCE.getColourType();

		/**
		 * The meta object literal for the '{@link lasser.sketch.BorderType <em>Border Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.sketch.BorderType
		 * @see lasser.sketch.impl.SketchPackageImpl#getBorderType()
		 * @generated
		 */
		EEnum BORDER_TYPE = eINSTANCE.getBorderType();

	}

} //SketchPackage
