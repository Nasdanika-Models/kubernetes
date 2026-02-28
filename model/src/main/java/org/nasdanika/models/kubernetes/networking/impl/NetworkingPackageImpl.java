/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.kubernetes.KubernetesPackage;

import org.nasdanika.models.kubernetes.configuration.ConfigurationPackage;

import org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl;

import org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl;

import org.nasdanika.models.kubernetes.networking.HTTPIngressPath;
import org.nasdanika.models.kubernetes.networking.Ingress;
import org.nasdanika.models.kubernetes.networking.IngressRule;
import org.nasdanika.models.kubernetes.networking.NetworkingFactory;
import org.nasdanika.models.kubernetes.networking.NetworkingPackage;
import org.nasdanika.models.kubernetes.networking.Service;
import org.nasdanika.models.kubernetes.networking.ServicePort;

import org.nasdanika.models.kubernetes.storage.StoragePackage;

import org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl;

import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

import org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkingPackageImpl extends EPackageImpl implements NetworkingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingressRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpIngressPathEClass = null;

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
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkingPackageImpl() {
		super(eNS_URI, NetworkingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NetworkingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkingPackage init() {
		if (isInited) return (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = registeredNetworkingPackage instanceof NetworkingPackageImpl ? (NetworkingPackageImpl)registeredNetworkingPackage : new NetworkingPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = (KubernetesPackageImpl)(registeredPackage instanceof KubernetesPackageImpl ? registeredPackage : KubernetesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);
		WorkloadsPackageImpl theWorkloadsPackage = (WorkloadsPackageImpl)(registeredPackage instanceof WorkloadsPackageImpl ? registeredPackage : WorkloadsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(registeredPackage instanceof ConfigurationPackageImpl ? registeredPackage : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theNetworkingPackage.createPackageContents();
		theKubernetesPackage.createPackageContents();
		theWorkloadsPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theNetworkingPackage.initializePackageContents();
		theKubernetesPackage.initializePackageContents();
		theWorkloadsPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkingPackage.eNS_URI, theNetworkingPackage);
		return theNetworkingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Selector() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Ports() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Type() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ClusterIP() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ExternalName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicePort() {
		return servicePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePort_Name() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePort_Port() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePort_TargetPort() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePort_NodePort() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicePort_Protocol() {
		return (EAttribute)servicePortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngress() {
		return ingressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIngress_Rules() {
		return (EReference)ingressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIngress_IngressClassName() {
		return (EAttribute)ingressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIngressRule() {
		return ingressRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIngressRule_Host() {
		return (EAttribute)ingressRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIngressRule_Paths() {
		return (EReference)ingressRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTTPIngressPath() {
		return httpIngressPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTTPIngressPath_Path() {
		return (EAttribute)httpIngressPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTTPIngressPath_PathType() {
		return (EAttribute)httpIngressPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTTPIngressPath_ServiceName() {
		return (EAttribute)httpIngressPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHTTPIngressPath_ServicePort() {
		return (EAttribute)httpIngressPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkingFactory getNetworkingFactory() {
		return (NetworkingFactory)getEFactoryInstance();
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
		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SELECTOR);
		createEReference(serviceEClass, SERVICE__PORTS);
		createEAttribute(serviceEClass, SERVICE__TYPE);
		createEAttribute(serviceEClass, SERVICE__CLUSTER_IP);
		createEAttribute(serviceEClass, SERVICE__EXTERNAL_NAME);

		servicePortEClass = createEClass(SERVICE_PORT);
		createEAttribute(servicePortEClass, SERVICE_PORT__NAME);
		createEAttribute(servicePortEClass, SERVICE_PORT__PORT);
		createEAttribute(servicePortEClass, SERVICE_PORT__TARGET_PORT);
		createEAttribute(servicePortEClass, SERVICE_PORT__NODE_PORT);
		createEAttribute(servicePortEClass, SERVICE_PORT__PROTOCOL);

		ingressEClass = createEClass(INGRESS);
		createEReference(ingressEClass, INGRESS__RULES);
		createEAttribute(ingressEClass, INGRESS__INGRESS_CLASS_NAME);

		ingressRuleEClass = createEClass(INGRESS_RULE);
		createEAttribute(ingressRuleEClass, INGRESS_RULE__HOST);
		createEReference(ingressRuleEClass, INGRESS_RULE__PATHS);

		httpIngressPathEClass = createEClass(HTTP_INGRESS_PATH);
		createEAttribute(httpIngressPathEClass, HTTP_INGRESS_PATH__PATH);
		createEAttribute(httpIngressPathEClass, HTTP_INGRESS_PATH__PATH_TYPE);
		createEAttribute(httpIngressPathEClass, HTTP_INGRESS_PATH__SERVICE_NAME);
		createEAttribute(httpIngressPathEClass, HTTP_INGRESS_PATH__SERVICE_PORT);
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
		KubernetesPackage theKubernetesPackage = (KubernetesPackage)EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		ingressEClass.getESuperTypes().add(theKubernetesPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Selector(), theKubernetesPackage.getKeyValuePair(), null, "selector", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Ports(), this.getServicePort(), null, "ports", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Type(), ecorePackage.getEString(), "type", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ClusterIP(), ecorePackage.getEString(), "clusterIP", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ExternalName(), ecorePackage.getEString(), "externalName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePortEClass, ServicePort.class, "ServicePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServicePort_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePort_Port(), ecorePackage.getEInt(), "port", null, 1, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePort_TargetPort(), ecorePackage.getEInt(), "targetPort", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePort_NodePort(), ecorePackage.getEInt(), "nodePort", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePort_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ServicePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingressEClass, Ingress.class, "Ingress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIngress_Rules(), this.getIngressRule(), null, "rules", null, 0, -1, Ingress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngress_IngressClassName(), ecorePackage.getEString(), "ingressClassName", null, 0, 1, Ingress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingressRuleEClass, IngressRule.class, "IngressRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngressRule_Host(), ecorePackage.getEString(), "host", null, 0, 1, IngressRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIngressRule_Paths(), this.getHTTPIngressPath(), null, "paths", null, 0, -1, IngressRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpIngressPathEClass, HTTPIngressPath.class, "HTTPIngressPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHTTPIngressPath_Path(), ecorePackage.getEString(), "path", null, 0, 1, HTTPIngressPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPIngressPath_PathType(), ecorePackage.getEString(), "pathType", null, 1, 1, HTTPIngressPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPIngressPath_ServiceName(), ecorePackage.getEString(), "serviceName", null, 1, 1, HTTPIngressPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPIngressPath_ServicePort(), ecorePackage.getEInt(), "servicePort", null, 1, 1, HTTPIngressPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Networking resources for exposing applications. Services provide stable network endpoints for pods, and Ingress manages external HTTP/HTTPS access."
		   });
		addAnnotation
		  (serviceEClass,
		   source,
		   new String[] {
			   "documentation", "A Service is an abstract way to expose an application running on a set of Pods as a network service. With Kubernetes you don\'t need to modify your application to use an unfamiliar service discovery mechanism."
		   });
		addAnnotation
		  (getService_Selector(),
		   source,
		   new String[] {
			   "documentation", "Route service traffic to pods with label keys and values matching this selector."
		   });
		addAnnotation
		  (getService_Ports(),
		   source,
		   new String[] {
			   "documentation", "The list of ports that are exposed by this service."
		   });
		addAnnotation
		  (getService_Type(),
		   source,
		   new String[] {
			   "documentation", "Type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer."
		   });
		addAnnotation
		  (getService_ClusterIP(),
		   source,
		   new String[] {
			   "documentation", "ClusterIP is the IP address of the service. It is usually assigned randomly. Set to \'None\' for headless services."
		   });
		addAnnotation
		  (getService_ExternalName(),
		   source,
		   new String[] {
			   "documentation", "The external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). Only applies to ExternalName type."
		   });
		addAnnotation
		  (servicePortEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a port on a Kubernetes Service."
		   });
		addAnnotation
		  (getServicePort_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of this port within the service. This must be a DNS_LABEL."
		   });
		addAnnotation
		  (getServicePort_Port(),
		   source,
		   new String[] {
			   "documentation", "The port that will be exposed by this service."
		   });
		addAnnotation
		  (getServicePort_TargetPort(),
		   source,
		   new String[] {
			   "documentation", "Number of the port to access on the pods targeted by the service."
		   });
		addAnnotation
		  (getServicePort_NodePort(),
		   source,
		   new String[] {
			   "documentation", "The port on each node on which this service is exposed when type is NodePort or LoadBalancer."
		   });
		addAnnotation
		  (getServicePort_Protocol(),
		   source,
		   new String[] {
			   "documentation", "The IP protocol for this port. Supports TCP, UDP, and SCTP. Default is TCP."
		   });
		addAnnotation
		  (ingressEClass,
		   source,
		   new String[] {
			   "documentation", "Ingress exposes HTTP and HTTPS routes from outside the cluster to services within the cluster. Traffic routing is controlled by rules defined on the Ingress resource."
		   });
		addAnnotation
		  (getIngress_Rules(),
		   source,
		   new String[] {
			   "documentation", "A list of host rules used to configure the Ingress."
		   });
		addAnnotation
		  (getIngress_IngressClassName(),
		   source,
		   new String[] {
			   "documentation", "IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource."
		   });
		addAnnotation
		  (ingressRuleEClass,
		   source,
		   new String[] {
			   "documentation", "IngressRule represents the rules mapping the paths under a specified host to the related backend services."
		   });
		addAnnotation
		  (getIngressRule_Host(),
		   source,
		   new String[] {
			   "documentation", "Host is the fully qualified domain name of a network host, as defined by RFC 3986."
		   });
		addAnnotation
		  (getIngressRule_Paths(),
		   source,
		   new String[] {
			   "documentation", "A collection of paths that map requests to backends."
		   });
		addAnnotation
		  (httpIngressPathEClass,
		   source,
		   new String[] {
			   "documentation", "Associates a path with a backend. Incoming URLs matching the path are forwarded to the backend."
		   });
		addAnnotation
		  (getHTTPIngressPath_Path(),
		   source,
		   new String[] {
			   "documentation", "Path is matched against the path of an incoming request (e.g. /testpath)."
		   });
		addAnnotation
		  (getHTTPIngressPath_PathType(),
		   source,
		   new String[] {
			   "documentation", "PathType determines the interpretation of the Path matching. Valid values: Exact, Prefix, ImplementationSpecific."
		   });
		addAnnotation
		  (getHTTPIngressPath_ServiceName(),
		   source,
		   new String[] {
			   "documentation", "Name of the referenced service."
		   });
		addAnnotation
		  (getHTTPIngressPath_ServicePort(),
		   source,
		   new String[] {
			   "documentation", "Port of the referenced service."
		   });
	}

} //NetworkingPackageImpl
