/**
 */
package lasser.mtraces;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lasser.mtraces.MtracesPackage
 * @generated
 */
public interface MtracesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtracesFactory eINSTANCE = lasser.mtraces.impl.MtracesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Trace Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Root</em>'.
	 * @generated
	 */
	TraceRoot createTraceRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MtracesPackage getMtracesPackage();

} //MtracesFactory
