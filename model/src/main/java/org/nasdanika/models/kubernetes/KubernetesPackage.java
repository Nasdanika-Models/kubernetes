/**
 */
package org.nasdanika.models.kubernetes;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ecore model for Kubernetes concepts. Supports creating models of Kubernetes solutions (deployments, services, etc.) and loading information about Kubernetes clusters for reporting, analysis, and generation of recommendations.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.kubernetes.KubernetesFactory
 * @model kind="package"
 * @generated
 */
public interface KubernetesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kubernetes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/kubernetes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.kubernetes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KubernetesPackage eINSTANCE = org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.KeyValuePairImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.LabelSelectorImpl <em>Label Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.LabelSelectorImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getLabelSelector()
	 * @generated
	 */
	int LABEL_SELECTOR = 1;

	/**
	 * The feature id for the '<em><b>Match Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR__MATCH_LABELS = 0;

	/**
	 * The number of structural features of the '<em>Label Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.ResourceImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getResource()
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
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__API_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KIND = 3;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABELS = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ANNOTATIONS = 5;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.ClusterImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAMESPACE = RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__API_VERSION = RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__KIND = RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LABELS = RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAMESPACES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NODES = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistent Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__PERSISTENT_VOLUMES = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__STORAGE_CLASSES = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.NamespaceImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE = RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__API_VERSION = RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__KIND = RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__LABELS = RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DEPLOYMENTS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stateful Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__STATEFUL_SETS = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Daemon Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DAEMON_SETS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replica Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__REPLICA_SETS = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PODS = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SERVICES = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ingresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__INGRESSES = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Config Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CONFIG_MAPS = RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SECRETS = RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__JOBS = RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cron Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CRON_JOBS = RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Persistent Volume Claims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PERSISTENT_VOLUME_CLAIMS = RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.NodeImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAMESPACE = RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__API_VERSION = RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__KIND = RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABELS = RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ANNOTATIONS = RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Pod CIDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__POD_CIDR = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unschedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNSCHEDULABLE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Taints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TAINTS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.impl.TaintImpl <em>Taint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.impl.TaintImpl
	 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getTaint()
	 * @generated
	 */
	int TAINT = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINT__EFFECT = 2;

	/**
	 * The number of structural features of the '<em>Taint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Taint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see org.nasdanika.models.kubernetes.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.kubernetes.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.kubernetes.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.LabelSelector <em>Label Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.LabelSelector
	 * @generated
	 */
	EClass getLabelSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.LabelSelector#getMatchLabels <em>Match Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match Labels</em>'.
	 * @see org.nasdanika.models.kubernetes.LabelSelector#getMatchLabels()
	 * @see #getLabelSelector()
	 * @generated
	 */
	EReference getLabelSelector_MatchLabels();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Resource#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getNamespace()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Resource#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getApiVersion()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Resource#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getKind()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Resource#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getLabels()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Resource#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.nasdanika.models.kubernetes.Resource#getAnnotations()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Annotations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.nasdanika.models.kubernetes.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Cluster#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see org.nasdanika.models.kubernetes.Cluster#getNamespaces()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Namespaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Cluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.nasdanika.models.kubernetes.Cluster#getNodes()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Cluster#getPersistentVolumes <em>Persistent Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistent Volumes</em>'.
	 * @see org.nasdanika.models.kubernetes.Cluster#getPersistentVolumes()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_PersistentVolumes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Cluster#getStorageClasses <em>Storage Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Classes</em>'.
	 * @see org.nasdanika.models.kubernetes.Cluster#getStorageClasses()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_StorageClasses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployments</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getDeployments()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Deployments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getStatefulSets <em>Stateful Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stateful Sets</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getStatefulSets()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_StatefulSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getDaemonSets <em>Daemon Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daemon Sets</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getDaemonSets()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_DaemonSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getReplicaSets <em>Replica Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replica Sets</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getReplicaSets()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ReplicaSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pods</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getPods()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Pods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getServices()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getIngresses <em>Ingresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingresses</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getIngresses()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Ingresses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getConfigMaps <em>Config Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Maps</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getConfigMaps()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ConfigMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getSecrets()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Secrets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getJobs()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getCronJobs <em>Cron Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cron Jobs</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getCronJobs()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_CronJobs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Namespace#getPersistentVolumeClaims <em>Persistent Volume Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistent Volume Claims</em>'.
	 * @see org.nasdanika.models.kubernetes.Namespace#getPersistentVolumeClaims()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_PersistentVolumeClaims();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.kubernetes.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Node#getPodCIDR <em>Pod CIDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pod CIDR</em>'.
	 * @see org.nasdanika.models.kubernetes.Node#getPodCIDR()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_PodCIDR();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Node#isUnschedulable <em>Unschedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unschedulable</em>'.
	 * @see org.nasdanika.models.kubernetes.Node#isUnschedulable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Unschedulable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.Node#getTaints <em>Taints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taints</em>'.
	 * @see org.nasdanika.models.kubernetes.Node#getTaints()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Taints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.Taint <em>Taint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taint</em>'.
	 * @see org.nasdanika.models.kubernetes.Taint
	 * @generated
	 */
	EClass getTaint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Taint#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.kubernetes.Taint#getKey()
	 * @see #getTaint()
	 * @generated
	 */
	EAttribute getTaint_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Taint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.kubernetes.Taint#getValue()
	 * @see #getTaint()
	 * @generated
	 */
	EAttribute getTaint_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.Taint#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see org.nasdanika.models.kubernetes.Taint#getEffect()
	 * @see #getTaint()
	 * @generated
	 */
	EAttribute getTaint_Effect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KubernetesFactory getKubernetesFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.KeyValuePairImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.LabelSelectorImpl <em>Label Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.LabelSelectorImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getLabelSelector()
		 * @generated
		 */
		EClass LABEL_SELECTOR = eINSTANCE.getLabelSelector();

		/**
		 * The meta object literal for the '<em><b>Match Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_SELECTOR__MATCH_LABELS = eINSTANCE.getLabelSelector_MatchLabels();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.ResourceImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getResource()
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
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAMESPACE = eINSTANCE.getResource_Namespace();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__API_VERSION = eINSTANCE.getResource_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__KIND = eINSTANCE.getResource_Kind();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LABELS = eINSTANCE.getResource_Labels();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ANNOTATIONS = eINSTANCE.getResource_Annotations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.ClusterImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NAMESPACES = eINSTANCE.getCluster_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NODES = eINSTANCE.getCluster_Nodes();

		/**
		 * The meta object literal for the '<em><b>Persistent Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__PERSISTENT_VOLUMES = eINSTANCE.getCluster_PersistentVolumes();

		/**
		 * The meta object literal for the '<em><b>Storage Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__STORAGE_CLASSES = eINSTANCE.getCluster_StorageClasses();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.NamespaceImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__DEPLOYMENTS = eINSTANCE.getNamespace_Deployments();

		/**
		 * The meta object literal for the '<em><b>Stateful Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__STATEFUL_SETS = eINSTANCE.getNamespace_StatefulSets();

		/**
		 * The meta object literal for the '<em><b>Daemon Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__DAEMON_SETS = eINSTANCE.getNamespace_DaemonSets();

		/**
		 * The meta object literal for the '<em><b>Replica Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__REPLICA_SETS = eINSTANCE.getNamespace_ReplicaSets();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PODS = eINSTANCE.getNamespace_Pods();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__SERVICES = eINSTANCE.getNamespace_Services();

		/**
		 * The meta object literal for the '<em><b>Ingresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__INGRESSES = eINSTANCE.getNamespace_Ingresses();

		/**
		 * The meta object literal for the '<em><b>Config Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__CONFIG_MAPS = eINSTANCE.getNamespace_ConfigMaps();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__SECRETS = eINSTANCE.getNamespace_Secrets();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__JOBS = eINSTANCE.getNamespace_Jobs();

		/**
		 * The meta object literal for the '<em><b>Cron Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__CRON_JOBS = eINSTANCE.getNamespace_CronJobs();

		/**
		 * The meta object literal for the '<em><b>Persistent Volume Claims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PERSISTENT_VOLUME_CLAIMS = eINSTANCE.getNamespace_PersistentVolumeClaims();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.NodeImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Pod CIDR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__POD_CIDR = eINSTANCE.getNode_PodCIDR();

		/**
		 * The meta object literal for the '<em><b>Unschedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__UNSCHEDULABLE = eINSTANCE.getNode_Unschedulable();

		/**
		 * The meta object literal for the '<em><b>Taints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TAINTS = eINSTANCE.getNode_Taints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.impl.TaintImpl <em>Taint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.impl.TaintImpl
		 * @see org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl#getTaint()
		 * @generated
		 */
		EClass TAINT = eINSTANCE.getTaint();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAINT__KEY = eINSTANCE.getTaint_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAINT__VALUE = eINSTANCE.getTaint_Value();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAINT__EFFECT = eINSTANCE.getTaint_Effect();

	}

} //KubernetesPackage
