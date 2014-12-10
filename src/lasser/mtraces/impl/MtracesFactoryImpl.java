/**
 */
package lasser.mtraces.impl;

import lasser.mtraces.*;

import org.eclipse.emf.ecore.EClass;
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
public class MtracesFactoryImpl extends EFactoryImpl implements MtracesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MtracesFactory init() {
		try {
			MtracesFactory theMtracesFactory = (MtracesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.modelum.es/layoutGuesser/traces"); 
			if (theMtracesFactory != null) {
				return theMtracesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MtracesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtracesFactoryImpl() {
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
			case MtracesPackage.TRACE: return createTrace();
			case MtracesPackage.TRACE_ROOT: return createTraceRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceRoot createTraceRoot() {
		TraceRootImpl traceRoot = new TraceRootImpl();
		return traceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MtracesPackage getMtracesPackage() {
		return (MtracesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MtracesPackage getPackage() {
		return MtracesPackage.eINSTANCE;
	}

} //MtracesFactoryImpl
