/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.kubernetes.networking.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkingFactoryImpl extends EFactoryImpl implements NetworkingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkingFactory init() {
		try {
			NetworkingFactory theNetworkingFactory = (NetworkingFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkingPackage.eNS_URI);
			if (theNetworkingFactory != null) {
				return theNetworkingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingFactoryImpl() {
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
			case NetworkingPackage.SERVICE: return createService();
			case NetworkingPackage.SERVICE_PORT: return createServicePort();
			case NetworkingPackage.INGRESS: return createIngress();
			case NetworkingPackage.INGRESS_RULE: return createIngressRule();
			case NetworkingPackage.HTTP_INGRESS_PATH: return createHTTPIngressPath();
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
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicePort createServicePort() {
		ServicePortImpl servicePort = new ServicePortImpl();
		return servicePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ingress createIngress() {
		IngressImpl ingress = new IngressImpl();
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IngressRule createIngressRule() {
		IngressRuleImpl ingressRule = new IngressRuleImpl();
		return ingressRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPIngressPath createHTTPIngressPath() {
		HTTPIngressPathImpl httpIngressPath = new HTTPIngressPathImpl();
		return httpIngressPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkingPackage getNetworkingPackage() {
		return (NetworkingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkingPackage getPackage() {
		return NetworkingPackage.eINSTANCE;
	}

} //NetworkingFactoryImpl
