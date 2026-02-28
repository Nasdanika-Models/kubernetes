/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage
 * @generated
 */
public interface NetworkingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingFactory eINSTANCE = org.nasdanika.models.kubernetes.networking.impl.NetworkingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Service Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Port</em>'.
	 * @generated
	 */
	ServicePort createServicePort();

	/**
	 * Returns a new object of class '<em>Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingress</em>'.
	 * @generated
	 */
	Ingress createIngress();

	/**
	 * Returns a new object of class '<em>Ingress Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingress Rule</em>'.
	 * @generated
	 */
	IngressRule createIngressRule();

	/**
	 * Returns a new object of class '<em>HTTP Ingress Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Ingress Path</em>'.
	 * @generated
	 */
	HTTPIngressPath createHTTPIngressPath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NetworkingPackage getNetworkingPackage();

} //NetworkingFactory
