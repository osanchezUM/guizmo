/**
 */
package lasser.mtraces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see lasser.mtraces.MtracesFactory
 * @model kind="package"
 * @generated
 */
public interface MtracesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mtraces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.modelum.es/layoutGuesser/traces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mtraces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtracesPackage eINSTANCE = lasser.mtraces.impl.MtracesPackageImpl.init();

	/**
	 * The meta object id for the '{@link lasser.mtraces.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.mtraces.impl.TraceImpl
	 * @see lasser.mtraces.impl.MtracesPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link lasser.mtraces.impl.TraceRootImpl <em>Trace Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lasser.mtraces.impl.TraceRootImpl
	 * @see lasser.mtraces.impl.MtracesPackageImpl#getTraceRoot()
	 * @generated
	 */
	int TRACE_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ROOT__TRACES = 0;

	/**
	 * The number of structural features of the '<em>Trace Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ROOT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link lasser.mtraces.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see lasser.mtraces.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link lasser.mtraces.Trace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lasser.mtraces.Trace#getName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Name();

	/**
	 * Returns the meta object for the reference list '{@link lasser.mtraces.Trace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see lasser.mtraces.Trace#getSource()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Source();

	/**
	 * Returns the meta object for the reference '{@link lasser.mtraces.Trace#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see lasser.mtraces.Trace#getTarget()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Target();

	/**
	 * Returns the meta object for class '{@link lasser.mtraces.TraceRoot <em>Trace Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Root</em>'.
	 * @see lasser.mtraces.TraceRoot
	 * @generated
	 */
	EClass getTraceRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link lasser.mtraces.TraceRoot#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see lasser.mtraces.TraceRoot#getTraces()
	 * @see #getTraceRoot()
	 * @generated
	 */
	EReference getTraceRoot_Traces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MtracesFactory getMtracesFactory();

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
		 * The meta object literal for the '{@link lasser.mtraces.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.mtraces.impl.TraceImpl
		 * @see lasser.mtraces.impl.MtracesPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__NAME = eINSTANCE.getTrace_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE = eINSTANCE.getTrace_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET = eINSTANCE.getTrace_Target();

		/**
		 * The meta object literal for the '{@link lasser.mtraces.impl.TraceRootImpl <em>Trace Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lasser.mtraces.impl.TraceRootImpl
		 * @see lasser.mtraces.impl.MtracesPackageImpl#getTraceRoot()
		 * @generated
		 */
		EClass TRACE_ROOT = eINSTANCE.getTraceRoot();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ROOT__TRACES = eINSTANCE.getTraceRoot_Traces();

	}

} //MtracesPackage
