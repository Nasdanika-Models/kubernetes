/**
 */
package org.nasdanika.models.kubernetes.workloads;

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
 * Workload resources manage Pods. Pods represent a set of running containers in your cluster. Controllers manage the lifecycle and scaling of pods.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsFactory
 * @model kind="package"
 * @generated
 */
public interface WorkloadsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workloads";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/kubernetes/workloads";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.kubernetes.workloads";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkloadsPackage eINSTANCE = org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE_PULL_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = 3;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENV = 4;

	/**
	 * The feature id for the '<em><b>Volume Mounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUME_MOUNTS = 5;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESOURCES = 6;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ARGS = 8;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl <em>Container Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getContainerPort()
	 * @generated
	 */
	int CONTAINER_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__CONTAINER_PORT = 1;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__HOST_PORT = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT__PROTOCOL = 3;

	/**
	 * The number of structural features of the '<em>Container Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.EnvVarImpl <em>Env Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.EnvVarImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getEnvVar()
	 * @generated
	 */
	int ENV_VAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Env Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl <em>Volume Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getVolumeMount()
	 * @generated
	 */
	int VOLUME_MOUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__MOUNT_PATH = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__READ_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT__SUB_PATH = 3;

	/**
	 * The number of structural features of the '<em>Volume Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Volume Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_MOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl <em>Resource Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getResourceRequirements()
	 * @generated
	 */
	int RESOURCE_REQUIREMENTS = 4;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS__LIMITS = 0;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS__REQUESTS = 1;

	/**
	 * The number of structural features of the '<em>Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.VolumeImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl <em>Pod Template Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getPodTemplateSpec()
	 * @generated
	 */
	int POD_TEMPLATE_SPEC = 6;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__ANNOTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__CONTAINERS = 2;

	/**
	 * The feature id for the '<em><b>Init Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__INIT_CONTAINERS = 3;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__VOLUMES = 4;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__RESTART_POLICY = 5;

	/**
	 * The feature id for the '<em><b>Service Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__NODE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Node Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC__NODE_SELECTOR = 8;

	/**
	 * The number of structural features of the '<em>Pod Template Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pod Template Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_TEMPLATE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl <em>Pod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.PodImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getPod()
	 * @generated
	 */
	int POD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__CONTAINERS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__INIT_CONTAINERS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__VOLUMES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__RESTART_POLICY = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NODE_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__SERVICE_ACCOUNT_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__PHASE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICAS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__STRATEGY_TYPE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl <em>Replica Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getReplicaSet()
	 * @generated
	 */
	int REPLICA_SET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__REPLICAS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Replica Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Replica Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl <em>Stateful Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getStatefulSet()
	 * @generated
	 */
	int STATEFUL_SET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__REPLICAS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__SERVICE_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Volume Claim Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__VOLUME_CLAIM_TEMPLATES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl <em>Daemon Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getDaemonSet()
	 * @generated
	 */
	int DAEMON_SET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.JobImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SELECTOR = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__COMPLETIONS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLELISM = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Backoff Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__BACKOFF_LIMIT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl <em>Cron Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl
	 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getCronJob()
	 * @generated
	 */
	int CRON_JOB = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__SCHEDULE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__JOB_TEMPLATE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suspend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__SUSPEND = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Container#getImagePullPolicy <em>Image Pull Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Pull Policy</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getImagePullPolicy()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ImagePullPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Container#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getEnv()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Container#getVolumeMounts <em>Volume Mounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume Mounts</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getVolumeMounts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_VolumeMounts();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.Container#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getResources()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Resources();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.kubernetes.workloads.Container#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getCommand()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Command();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.kubernetes.workloads.Container#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Container#getArgs()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Args();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Port</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ContainerPort
	 * @generated
	 */
	EClass getContainerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ContainerPort#getName()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Port</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ContainerPort#getContainerPort()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_ContainerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ContainerPort#getHostPort()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_HostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ContainerPort#getProtocol()
	 * @see #getContainerPort()
	 * @generated
	 */
	EAttribute getContainerPort_Protocol();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.EnvVar <em>Env Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Var</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.EnvVar
	 * @generated
	 */
	EClass getEnvVar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.EnvVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.EnvVar#getName()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.EnvVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.EnvVar#getValue()
	 * @see #getEnvVar()
	 * @generated
	 */
	EAttribute getEnvVar_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount <em>Volume Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Mount</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.VolumeMount
	 * @generated
	 */
	EClass getVolumeMount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.VolumeMount#getName()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getMountPath <em>Mount Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Path</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.VolumeMount#getMountPath()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_MountPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.VolumeMount#isReadOnly()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getSubPath <em>Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Path</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.VolumeMount#getSubPath()
	 * @see #getVolumeMount()
	 * @generated
	 */
	EAttribute getVolumeMount_SubPath();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.ResourceRequirements <em>Resource Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Requirements</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ResourceRequirements
	 * @generated
	 */
	EClass getResourceRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Limits</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getLimits()
	 * @see #getResourceRequirements()
	 * @generated
	 */
	EReference getResourceRequirements_Limits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requests</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getRequests()
	 * @see #getResourceRequirements()
	 * @generated
	 */
	EReference getResourceRequirements_Requests();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Volume#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Volume#getType()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec <em>Pod Template Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod Template Spec</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec
	 * @generated
	 */
	EClass getPodTemplateSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getLabels()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getAnnotations()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getContainers()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getInitContainers <em>Init Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Containers</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getInitContainers()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_InitContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getVolumes()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getRestartPolicy()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EAttribute getPodTemplateSpec_RestartPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getServiceAccountName <em>Service Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Account Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getServiceAccountName()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EAttribute getPodTemplateSpec_ServiceAccountName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeName()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EAttribute getPodTemplateSpec_NodeName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeSelector <em>Node Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeSelector()
	 * @see #getPodTemplateSpec()
	 * @generated
	 */
	EReference getPodTemplateSpec_NodeSelector();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.Pod <em>Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod
	 * @generated
	 */
	EClass getPod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Pod#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getContainers()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Pod#getInitContainers <em>Init Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Containers</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getInitContainers()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_InitContainers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.Pod#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getVolumes()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Pod#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getRestartPolicy()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_RestartPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Pod#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getNodeName()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Pod#getServiceAccountName <em>Service Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Account Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getServiceAccountName()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_ServiceAccountName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Pod#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Pod#getPhase()
	 * @see #getPod()
	 * @generated
	 */
	EAttribute getPod_Phase();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Deployment#getReplicas()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Replicas();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Deployment#getSelector()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Deployment#getTemplate()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getStrategyType <em>Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Type</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Deployment#getStrategyType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_StrategyType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet <em>Replica Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replica Set</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ReplicaSet
	 * @generated
	 */
	EClass getReplicaSet();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ReplicaSet#getReplicas()
	 * @see #getReplicaSet()
	 * @generated
	 */
	EAttribute getReplicaSet_Replicas();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ReplicaSet#getSelector()
	 * @see #getReplicaSet()
	 * @generated
	 */
	EReference getReplicaSet_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.ReplicaSet#getTemplate()
	 * @see #getReplicaSet()
	 * @generated
	 */
	EReference getReplicaSet_Template();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet <em>Stateful Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Set</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet
	 * @generated
	 */
	EClass getStatefulSet();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet#getReplicas()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EAttribute getStatefulSet_Replicas();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet#getSelector()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EReference getStatefulSet_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet#getTemplate()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EReference getStatefulSet_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet#getServiceName()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EAttribute getStatefulSet_ServiceName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getVolumeClaimTemplates <em>Volume Claim Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume Claim Templates</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.StatefulSet#getVolumeClaimTemplates()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EReference getStatefulSet_VolumeClaimTemplates();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.DaemonSet <em>Daemon Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daemon Set</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.DaemonSet
	 * @generated
	 */
	EClass getDaemonSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.DaemonSet#getSelector()
	 * @see #getDaemonSet()
	 * @generated
	 */
	EReference getDaemonSet_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.DaemonSet#getTemplate()
	 * @see #getDaemonSet()
	 * @generated
	 */
	EReference getDaemonSet_Template();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.Job#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job#getSelector()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Selector();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.Job#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job#getTemplate()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Job#getCompletions <em>Completions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completions</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job#getCompletions()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Completions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Job#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job#getParallelism()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Parallelism();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.Job#getBackoffLimit <em>Backoff Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backoff Limit</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.Job#getBackoffLimit()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_BackoffLimit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.workloads.CronJob <em>Cron Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Job</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.CronJob
	 * @generated
	 */
	EClass getCronJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.CronJob#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.CronJob#getSchedule()
	 * @see #getCronJob()
	 * @generated
	 */
	EAttribute getCronJob_Schedule();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.workloads.CronJob#getJobTemplate <em>Job Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Template</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.CronJob#getJobTemplate()
	 * @see #getCronJob()
	 * @generated
	 */
	EReference getCronJob_JobTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.workloads.CronJob#isSuspend <em>Suspend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend</em>'.
	 * @see org.nasdanika.models.kubernetes.workloads.CronJob#isSuspend()
	 * @see #getCronJob()
	 * @generated
	 */
	EAttribute getCronJob_Suspend();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkloadsFactory getWorkloadsFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Image Pull Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE_PULL_POLICY = eINSTANCE.getContainer_ImagePullPolicy();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PORTS = eINSTANCE.getContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ENV = eINSTANCE.getContainer_Env();

		/**
		 * The meta object literal for the '<em><b>Volume Mounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOLUME_MOUNTS = eINSTANCE.getContainer_VolumeMounts();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__RESOURCES = eINSTANCE.getContainer_Resources();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__COMMAND = eINSTANCE.getContainer_Command();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ARGS = eINSTANCE.getContainer_Args();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl <em>Container Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getContainerPort()
		 * @generated
		 */
		EClass CONTAINER_PORT = eINSTANCE.getContainerPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__NAME = eINSTANCE.getContainerPort_Name();

		/**
		 * The meta object literal for the '<em><b>Container Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__CONTAINER_PORT = eINSTANCE.getContainerPort_ContainerPort();

		/**
		 * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__HOST_PORT = eINSTANCE.getContainerPort_HostPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT__PROTOCOL = eINSTANCE.getContainerPort_Protocol();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.EnvVarImpl <em>Env Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.EnvVarImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getEnvVar()
		 * @generated
		 */
		EClass ENV_VAR = eINSTANCE.getEnvVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__NAME = eINSTANCE.getEnvVar_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR__VALUE = eINSTANCE.getEnvVar_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl <em>Volume Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getVolumeMount()
		 * @generated
		 */
		EClass VOLUME_MOUNT = eINSTANCE.getVolumeMount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__NAME = eINSTANCE.getVolumeMount_Name();

		/**
		 * The meta object literal for the '<em><b>Mount Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__MOUNT_PATH = eINSTANCE.getVolumeMount_MountPath();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__READ_ONLY = eINSTANCE.getVolumeMount_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Sub Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_MOUNT__SUB_PATH = eINSTANCE.getVolumeMount_SubPath();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl <em>Resource Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getResourceRequirements()
		 * @generated
		 */
		EClass RESOURCE_REQUIREMENTS = eINSTANCE.getResourceRequirements();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENTS__LIMITS = eINSTANCE.getResourceRequirements_Limits();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUIREMENTS__REQUESTS = eINSTANCE.getResourceRequirements_Requests();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.VolumeImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TYPE = eINSTANCE.getVolume_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl <em>Pod Template Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getPodTemplateSpec()
		 * @generated
		 */
		EClass POD_TEMPLATE_SPEC = eINSTANCE.getPodTemplateSpec();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__LABELS = eINSTANCE.getPodTemplateSpec_Labels();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__ANNOTATIONS = eINSTANCE.getPodTemplateSpec_Annotations();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__CONTAINERS = eINSTANCE.getPodTemplateSpec_Containers();

		/**
		 * The meta object literal for the '<em><b>Init Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__INIT_CONTAINERS = eINSTANCE.getPodTemplateSpec_InitContainers();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__VOLUMES = eINSTANCE.getPodTemplateSpec_Volumes();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD_TEMPLATE_SPEC__RESTART_POLICY = eINSTANCE.getPodTemplateSpec_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Service Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME = eINSTANCE.getPodTemplateSpec_ServiceAccountName();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD_TEMPLATE_SPEC__NODE_NAME = eINSTANCE.getPodTemplateSpec_NodeName();

		/**
		 * The meta object literal for the '<em><b>Node Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD_TEMPLATE_SPEC__NODE_SELECTOR = eINSTANCE.getPodTemplateSpec_NodeSelector();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl <em>Pod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.PodImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getPod()
		 * @generated
		 */
		EClass POD = eINSTANCE.getPod();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__CONTAINERS = eINSTANCE.getPod_Containers();

		/**
		 * The meta object literal for the '<em><b>Init Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__INIT_CONTAINERS = eINSTANCE.getPod_InitContainers();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__VOLUMES = eINSTANCE.getPod_Volumes();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__RESTART_POLICY = eINSTANCE.getPod_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__NODE_NAME = eINSTANCE.getPod_NodeName();

		/**
		 * The meta object literal for the '<em><b>Service Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__SERVICE_ACCOUNT_NAME = eINSTANCE.getPod_ServiceAccountName();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POD__PHASE = eINSTANCE.getPod_Phase();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SELECTOR = eINSTANCE.getDeployment_Selector();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__TEMPLATE = eINSTANCE.getDeployment_Template();

		/**
		 * The meta object literal for the '<em><b>Strategy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__STRATEGY_TYPE = eINSTANCE.getDeployment_StrategyType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl <em>Replica Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getReplicaSet()
		 * @generated
		 */
		EClass REPLICA_SET = eINSTANCE.getReplicaSet();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLICA_SET__REPLICAS = eINSTANCE.getReplicaSet_Replicas();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA_SET__SELECTOR = eINSTANCE.getReplicaSet_Selector();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA_SET__TEMPLATE = eINSTANCE.getReplicaSet_Template();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl <em>Stateful Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getStatefulSet()
		 * @generated
		 */
		EClass STATEFUL_SET = eINSTANCE.getStatefulSet();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEFUL_SET__REPLICAS = eINSTANCE.getStatefulSet_Replicas();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFUL_SET__SELECTOR = eINSTANCE.getStatefulSet_Selector();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFUL_SET__TEMPLATE = eINSTANCE.getStatefulSet_Template();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEFUL_SET__SERVICE_NAME = eINSTANCE.getStatefulSet_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Volume Claim Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFUL_SET__VOLUME_CLAIM_TEMPLATES = eINSTANCE.getStatefulSet_VolumeClaimTemplates();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl <em>Daemon Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getDaemonSet()
		 * @generated
		 */
		EClass DAEMON_SET = eINSTANCE.getDaemonSet();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAEMON_SET__SELECTOR = eINSTANCE.getDaemonSet_Selector();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAEMON_SET__TEMPLATE = eINSTANCE.getDaemonSet_Template();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.JobImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SELECTOR = eINSTANCE.getJob_Selector();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TEMPLATE = eINSTANCE.getJob_Template();

		/**
		 * The meta object literal for the '<em><b>Completions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__COMPLETIONS = eINSTANCE.getJob_Completions();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__PARALLELISM = eINSTANCE.getJob_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Backoff Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__BACKOFF_LIMIT = eINSTANCE.getJob_BackoffLimit();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl <em>Cron Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl
		 * @see org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl#getCronJob()
		 * @generated
		 */
		EClass CRON_JOB = eINSTANCE.getCronJob();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_JOB__SCHEDULE = eINSTANCE.getCronJob_Schedule();

		/**
		 * The meta object literal for the '<em><b>Job Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRON_JOB__JOB_TEMPLATE = eINSTANCE.getCronJob_JobTemplate();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_JOB__SUSPEND = eINSTANCE.getCronJob_Suspend();

	}

} //WorkloadsPackage
