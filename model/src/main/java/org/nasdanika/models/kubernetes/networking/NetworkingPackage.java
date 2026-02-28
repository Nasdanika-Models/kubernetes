/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.kubernetes.KubernetesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Networking resources for exposing applications. Services provide stable network endpoints for pods, and Ingress manages external HTTP/HTTPS access.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.kubernetes.networking.NetworkingFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/kubernetes/networking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.kubernetes.networking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingPackage eINSTANCE = org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.networking.impl.ServiceImpl
	 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cluster IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLUSTER_IP = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXTERNAL_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl <em>Service Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl
	 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getServicePort()
	 * @generated
	 */
	int SERVICE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT__PORT = 1;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT__TARGET_PORT = 2;

	/**
	 * The feature id for the '<em><b>Node Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT__NODE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT__PROTOCOL = 4;

	/**
	 * The number of structural features of the '<em>Service Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.networking.impl.IngressImpl <em>Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.networking.impl.IngressImpl
	 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getIngress()
	 * @generated
	 */
	int INGRESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__RULES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ingress Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__INGRESS_CLASS_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl <em>Ingress Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl
	 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getIngressRule()
	 * @generated
	 */
	int INGRESS_RULE = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__HOST = 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__PATHS = 1;

	/**
	 * The number of structural features of the '<em>Ingress Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ingress Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl <em>HTTP Ingress Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl
	 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getHTTPIngressPath()
	 * @generated
	 */
	int HTTP_INGRESS_PATH = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH__PATH = 0;

	/**
	 * The feature id for the '<em><b>Path Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH__PATH_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH__SERVICE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH__SERVICE_PORT = 3;

	/**
	 * The number of structural features of the '<em>HTTP Ingress Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>HTTP Ingress Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INGRESS_PATH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.networking.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.networking.Service#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service#getSelector()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.networking.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ports();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.Service#getClusterIP <em>Cluster IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster IP</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service#getClusterIP()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ClusterIP();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.Service#getExternalName <em>External Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Name</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Service#getExternalName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ExternalName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.networking.ServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Port</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort
	 * @generated
	 */
	EClass getServicePort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort#getName()
	 * @see #getServicePort()
	 * @generated
	 */
	EAttribute getServicePort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort#getPort()
	 * @see #getServicePort()
	 * @generated
	 */
	EAttribute getServicePort_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Port</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort#getTargetPort()
	 * @see #getServicePort()
	 * @generated
	 */
	EAttribute getServicePort_TargetPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getNodePort <em>Node Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Port</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort#getNodePort()
	 * @see #getServicePort()
	 * @generated
	 */
	EAttribute getServicePort_NodePort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.ServicePort#getProtocol()
	 * @see #getServicePort()
	 * @generated
	 */
	EAttribute getServicePort_Protocol();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.networking.Ingress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Ingress
	 * @generated
	 */
	EClass getIngress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.networking.Ingress#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Ingress#getRules()
	 * @see #getIngress()
	 * @generated
	 */
	EReference getIngress_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.Ingress#getIngressClassName <em>Ingress Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ingress Class Name</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.Ingress#getIngressClassName()
	 * @see #getIngress()
	 * @generated
	 */
	EAttribute getIngress_IngressClassName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.networking.IngressRule <em>Ingress Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress Rule</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.IngressRule
	 * @generated
	 */
	EClass getIngressRule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.IngressRule#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.IngressRule#getHost()
	 * @see #getIngressRule()
	 * @generated
	 */
	EAttribute getIngressRule_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.networking.IngressRule#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.IngressRule#getPaths()
	 * @see #getIngressRule()
	 * @generated
	 */
	EReference getIngressRule_Paths();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath <em>HTTP Ingress Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Ingress Path</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.HTTPIngressPath
	 * @generated
	 */
	EClass getHTTPIngressPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPath()
	 * @see #getHTTPIngressPath()
	 * @generated
	 */
	EAttribute getHTTPIngressPath_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Type</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPathType()
	 * @see #getHTTPIngressPath()
	 * @generated
	 */
	EAttribute getHTTPIngressPath_PathType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServiceName()
	 * @see #getHTTPIngressPath()
	 * @generated
	 */
	EAttribute getHTTPIngressPath_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Port</em>'.
	 * @see org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServicePort()
	 * @see #getHTTPIngressPath()
	 * @generated
	 */
	EAttribute getHTTPIngressPath_ServicePort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkingFactory getNetworkingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.networking.impl.ServiceImpl
		 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SELECTOR = eINSTANCE.getService_Selector();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '<em><b>Cluster IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__CLUSTER_IP = eINSTANCE.getService_ClusterIP();

		/**
		 * The meta object literal for the '<em><b>External Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__EXTERNAL_NAME = eINSTANCE.getService_ExternalName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl <em>Service Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl
		 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getServicePort()
		 * @generated
		 */
		EClass SERVICE_PORT = eINSTANCE.getServicePort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT__NAME = eINSTANCE.getServicePort_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT__PORT = eINSTANCE.getServicePort_Port();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT__TARGET_PORT = eINSTANCE.getServicePort_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Node Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT__NODE_PORT = eINSTANCE.getServicePort_NodePort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT__PROTOCOL = eINSTANCE.getServicePort_Protocol();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.networking.impl.IngressImpl <em>Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.networking.impl.IngressImpl
		 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getIngress()
		 * @generated
		 */
		EClass INGRESS = eINSTANCE.getIngress();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGRESS__RULES = eINSTANCE.getIngress_Rules();

		/**
		 * The meta object literal for the '<em><b>Ingress Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS__INGRESS_CLASS_NAME = eINSTANCE.getIngress_IngressClassName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl <em>Ingress Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl
		 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getIngressRule()
		 * @generated
		 */
		EClass INGRESS_RULE = eINSTANCE.getIngressRule();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS_RULE__HOST = eINSTANCE.getIngressRule_Host();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGRESS_RULE__PATHS = eINSTANCE.getIngressRule_Paths();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl <em>HTTP Ingress Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl
		 * @see org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl#getHTTPIngressPath()
		 * @generated
		 */
		EClass HTTP_INGRESS_PATH = eINSTANCE.getHTTPIngressPath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INGRESS_PATH__PATH = eINSTANCE.getHTTPIngressPath_Path();

		/**
		 * The meta object literal for the '<em><b>Path Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INGRESS_PATH__PATH_TYPE = eINSTANCE.getHTTPIngressPath_PathType();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INGRESS_PATH__SERVICE_NAME = eINSTANCE.getHTTPIngressPath_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Service Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INGRESS_PATH__SERVICE_PORT = eINSTANCE.getHTTPIngressPath_ServicePort();

	}

} //NetworkingPackage
