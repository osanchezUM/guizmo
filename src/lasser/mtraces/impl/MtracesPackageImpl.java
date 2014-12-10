/**
 */
package lasser.mtraces.impl;

import guizmo.structure.StructurePackage;

import lasser.mtraces.MtracesFactory;
import lasser.mtraces.MtracesPackage;
import lasser.mtraces.Trace;

import lasser.mtraces.TraceRoot;
import lasser.sketch.SketchPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class MtracesPackageImpl extends EPackageImpl implements MtracesPackage {
	
	
	@Override
	protected Resource createResource(String uri) {
		return super.createResource(
				"../../lasser.sketch2structure/bin/lasser/mtracesMM/mtraces.ecore");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceRootEClass = null;

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
	 * @see lasser.mtraces.MtracesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MtracesPackageImpl() {
		super(eNS_URI, MtracesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MtracesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MtracesPackage init() {
		if (isInited) return (MtracesPackage)EPackage.Registry.INSTANCE.getEPackage(MtracesPackage.eNS_URI);

		// Obtain or create and register package
		MtracesPackageImpl theMtracesPackage = (MtracesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MtracesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MtracesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SketchPackage.eINSTANCE.eClass();
		StructurePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMtracesPackage.createPackageContents();

		// Initialize created meta-data
		theMtracesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMtracesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MtracesPackage.eNS_URI, theMtracesPackage);
		return theMtracesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_Name() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Source() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Target() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceRoot() {
		return traceRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceRoot_Traces() {
		return (EReference)traceRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtracesFactory getMtracesFactory() {
		return (MtracesFactory)getEFactoryInstance();
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
		traceEClass = createEClass(TRACE);
		createEAttribute(traceEClass, TRACE__NAME);
		createEReference(traceEClass, TRACE__SOURCE);
		createEReference(traceEClass, TRACE__TARGET);

		traceRootEClass = createEClass(TRACE_ROOT);
		createEReference(traceRootEClass, TRACE_ROOT__TRACES);
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

		// Obtain other dependent packages
		SketchPackage theSketchPackage = (SketchPackage)EPackage.Registry.INSTANCE.getEPackage(SketchPackage.eNS_URI);
		StructurePackage theStructurePackage = (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Source(), theSketchPackage.getWidget(), null, "source", null, 1, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Target(), theStructurePackage.getGraphicalElement(), null, "target", null, 1, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceRootEClass, TraceRoot.class, "TraceRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceRoot_Traces(), this.getTrace(), null, "traces", null, 0, -1, TraceRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MtracesPackageImpl
