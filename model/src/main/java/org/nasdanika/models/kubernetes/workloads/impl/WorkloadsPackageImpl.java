/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.kubernetes.KubernetesPackage;

import org.nasdanika.models.kubernetes.configuration.ConfigurationPackage;

import org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl;

import org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl;

import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

import org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl;

import org.nasdanika.models.kubernetes.storage.StoragePackage;

import org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl;

import org.nasdanika.models.kubernetes.workloads.ContainerPort;
import org.nasdanika.models.kubernetes.workloads.CronJob;
import org.nasdanika.models.kubernetes.workloads.DaemonSet;
import org.nasdanika.models.kubernetes.workloads.Deployment;
import org.nasdanika.models.kubernetes.workloads.EnvVar;
import org.nasdanika.models.kubernetes.workloads.Job;
import org.nasdanika.models.kubernetes.workloads.Pod;
import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.ReplicaSet;
import org.nasdanika.models.kubernetes.workloads.ResourceRequirements;
import org.nasdanika.models.kubernetes.workloads.StatefulSet;
import org.nasdanika.models.kubernetes.workloads.Volume;
import org.nasdanika.models.kubernetes.workloads.VolumeMount;
import org.nasdanika.models.kubernetes.workloads.WorkloadsFactory;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadsPackageImpl extends EPackageImpl implements WorkloadsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeMountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podTemplateSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass podEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicaSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statefulSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daemonSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronJobEClass = null;

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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkloadsPackageImpl() {
		super(eNS_URI, WorkloadsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkloadsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkloadsPackage init() {
		if (isInited) return (WorkloadsPackage)EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkloadsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WorkloadsPackageImpl theWorkloadsPackage = registeredWorkloadsPackage instanceof WorkloadsPackageImpl ? (WorkloadsPackageImpl)registeredWorkloadsPackage : new WorkloadsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = (KubernetesPackageImpl)(registeredPackage instanceof KubernetesPackageImpl ? registeredPackage : KubernetesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(registeredPackage instanceof ConfigurationPackageImpl ? registeredPackage : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theWorkloadsPackage.createPackageContents();
		theKubernetesPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theWorkloadsPackage.initializePackageContents();
		theKubernetesPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkloadsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkloadsPackage.eNS_URI, theWorkloadsPackage);
		return theWorkloadsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Name() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Image() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_ImagePullPolicy() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Ports() {
		return (EReference)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Env() {
		return (EReference)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_VolumeMounts() {
		return (EReference)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Resources() {
		return (EReference)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Command() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Args() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPort() {
		return containerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPort_Name() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPort_ContainerPort() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPort_HostPort() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPort_Protocol() {
		return (EAttribute)containerPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvVar() {
		return envVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvVar_Name() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvVar_Value() {
		return (EAttribute)envVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeMount() {
		return volumeMountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeMount_Name() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeMount_MountPath() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeMount_ReadOnly() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeMount_SubPath() {
		return (EAttribute)volumeMountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceRequirements() {
		return resourceRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRequirements_Limits() {
		return (EReference)resourceRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRequirements_Requests() {
		return (EReference)resourceRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolume_Type() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPodTemplateSpec() {
		return podTemplateSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_Labels() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_Annotations() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_Containers() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_InitContainers() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_Volumes() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodTemplateSpec_RestartPolicy() {
		return (EAttribute)podTemplateSpecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodTemplateSpec_ServiceAccountName() {
		return (EAttribute)podTemplateSpecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPodTemplateSpec_NodeName() {
		return (EAttribute)podTemplateSpecEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPodTemplateSpec_NodeSelector() {
		return (EReference)podTemplateSpecEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPod() {
		return podEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPod_Containers() {
		return (EReference)podEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPod_InitContainers() {
		return (EReference)podEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPod_Volumes() {
		return (EReference)podEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPod_RestartPolicy() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPod_NodeName() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPod_ServiceAccountName() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPod_Phase() {
		return (EAttribute)podEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_Replicas() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Selector() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Template() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_StrategyType() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReplicaSet() {
		return replicaSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReplicaSet_Replicas() {
		return (EAttribute)replicaSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicaSet_Selector() {
		return (EReference)replicaSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReplicaSet_Template() {
		return (EReference)replicaSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatefulSet() {
		return statefulSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatefulSet_Replicas() {
		return (EAttribute)statefulSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatefulSet_Selector() {
		return (EReference)statefulSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatefulSet_Template() {
		return (EReference)statefulSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatefulSet_ServiceName() {
		return (EAttribute)statefulSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatefulSet_VolumeClaimTemplates() {
		return (EReference)statefulSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDaemonSet() {
		return daemonSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDaemonSet_Selector() {
		return (EReference)daemonSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDaemonSet_Template() {
		return (EReference)daemonSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Selector() {
		return (EReference)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Template() {
		return (EReference)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Completions() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Parallelism() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_BackoffLimit() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCronJob() {
		return cronJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCronJob_Schedule() {
		return (EAttribute)cronJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCronJob_JobTemplate() {
		return (EReference)cronJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCronJob_Suspend() {
		return (EAttribute)cronJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkloadsFactory getWorkloadsFactory() {
		return (WorkloadsFactory)getEFactoryInstance();
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
		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__NAME);
		createEAttribute(containerEClass, CONTAINER__IMAGE);
		createEAttribute(containerEClass, CONTAINER__IMAGE_PULL_POLICY);
		createEReference(containerEClass, CONTAINER__PORTS);
		createEReference(containerEClass, CONTAINER__ENV);
		createEReference(containerEClass, CONTAINER__VOLUME_MOUNTS);
		createEReference(containerEClass, CONTAINER__RESOURCES);
		createEAttribute(containerEClass, CONTAINER__COMMAND);
		createEAttribute(containerEClass, CONTAINER__ARGS);

		containerPortEClass = createEClass(CONTAINER_PORT);
		createEAttribute(containerPortEClass, CONTAINER_PORT__NAME);
		createEAttribute(containerPortEClass, CONTAINER_PORT__CONTAINER_PORT);
		createEAttribute(containerPortEClass, CONTAINER_PORT__HOST_PORT);
		createEAttribute(containerPortEClass, CONTAINER_PORT__PROTOCOL);

		envVarEClass = createEClass(ENV_VAR);
		createEAttribute(envVarEClass, ENV_VAR__NAME);
		createEAttribute(envVarEClass, ENV_VAR__VALUE);

		volumeMountEClass = createEClass(VOLUME_MOUNT);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__NAME);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__MOUNT_PATH);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__READ_ONLY);
		createEAttribute(volumeMountEClass, VOLUME_MOUNT__SUB_PATH);

		resourceRequirementsEClass = createEClass(RESOURCE_REQUIREMENTS);
		createEReference(resourceRequirementsEClass, RESOURCE_REQUIREMENTS__LIMITS);
		createEReference(resourceRequirementsEClass, RESOURCE_REQUIREMENTS__REQUESTS);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__NAME);
		createEAttribute(volumeEClass, VOLUME__TYPE);

		podTemplateSpecEClass = createEClass(POD_TEMPLATE_SPEC);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__LABELS);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__ANNOTATIONS);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__CONTAINERS);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__INIT_CONTAINERS);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__VOLUMES);
		createEAttribute(podTemplateSpecEClass, POD_TEMPLATE_SPEC__RESTART_POLICY);
		createEAttribute(podTemplateSpecEClass, POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME);
		createEAttribute(podTemplateSpecEClass, POD_TEMPLATE_SPEC__NODE_NAME);
		createEReference(podTemplateSpecEClass, POD_TEMPLATE_SPEC__NODE_SELECTOR);

		podEClass = createEClass(POD);
		createEReference(podEClass, POD__CONTAINERS);
		createEReference(podEClass, POD__INIT_CONTAINERS);
		createEReference(podEClass, POD__VOLUMES);
		createEAttribute(podEClass, POD__RESTART_POLICY);
		createEAttribute(podEClass, POD__NODE_NAME);
		createEAttribute(podEClass, POD__SERVICE_ACCOUNT_NAME);
		createEAttribute(podEClass, POD__PHASE);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__REPLICAS);
		createEReference(deploymentEClass, DEPLOYMENT__SELECTOR);
		createEReference(deploymentEClass, DEPLOYMENT__TEMPLATE);
		createEAttribute(deploymentEClass, DEPLOYMENT__STRATEGY_TYPE);

		replicaSetEClass = createEClass(REPLICA_SET);
		createEAttribute(replicaSetEClass, REPLICA_SET__REPLICAS);
		createEReference(replicaSetEClass, REPLICA_SET__SELECTOR);
		createEReference(replicaSetEClass, REPLICA_SET__TEMPLATE);

		statefulSetEClass = createEClass(STATEFUL_SET);
		createEAttribute(statefulSetEClass, STATEFUL_SET__REPLICAS);
		createEReference(statefulSetEClass, STATEFUL_SET__SELECTOR);
		createEReference(statefulSetEClass, STATEFUL_SET__TEMPLATE);
		createEAttribute(statefulSetEClass, STATEFUL_SET__SERVICE_NAME);
		createEReference(statefulSetEClass, STATEFUL_SET__VOLUME_CLAIM_TEMPLATES);

		daemonSetEClass = createEClass(DAEMON_SET);
		createEReference(daemonSetEClass, DAEMON_SET__SELECTOR);
		createEReference(daemonSetEClass, DAEMON_SET__TEMPLATE);

		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__SELECTOR);
		createEReference(jobEClass, JOB__TEMPLATE);
		createEAttribute(jobEClass, JOB__COMPLETIONS);
		createEAttribute(jobEClass, JOB__PARALLELISM);
		createEAttribute(jobEClass, JOB__BACKOFF_LIMIT);

		cronJobEClass = createEClass(CRON_JOB);
		createEAttribute(cronJobEClass, CRON_JOB__SCHEDULE);
		createEReference(cronJobEClass, CRON_JOB__JOB_TEMPLATE);
		createEAttribute(cronJobEClass, CRON_JOB__SUSPEND);
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
		StoragePackage theStoragePackage = (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		podEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		deploymentEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		replicaSetEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		statefulSetEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		daemonSetEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		jobEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		cronJobEClass.getESuperTypes().add(theKubernetesPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, org.nasdanika.models.kubernetes.workloads.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Image(), ecorePackage.getEString(), "image", null, 0, 1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_ImagePullPolicy(), ecorePackage.getEString(), "imagePullPolicy", null, 0, 1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Ports(), this.getContainerPort(), null, "ports", null, 0, -1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Env(), this.getEnvVar(), null, "env", null, 0, -1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_VolumeMounts(), this.getVolumeMount(), null, "volumeMounts", null, 0, -1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Resources(), this.getResourceRequirements(), null, "resources", null, 0, 1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Command(), ecorePackage.getEString(), "command", null, 0, -1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Args(), ecorePackage.getEString(), "args", null, 0, -1, org.nasdanika.models.kubernetes.workloads.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerPortEClass, ContainerPort.class, "ContainerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_ContainerPort(), ecorePackage.getEInt(), "containerPort", null, 1, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_HostPort(), ecorePackage.getEInt(), "hostPort", null, 0, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPort_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ContainerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarEClass, EnvVar.class, "EnvVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVar_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnvVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeMountEClass, VolumeMount.class, "VolumeMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeMount_Name(), ecorePackage.getEString(), "name", null, 1, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeMount_MountPath(), ecorePackage.getEString(), "mountPath", null, 1, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeMount_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeMount_SubPath(), ecorePackage.getEString(), "subPath", null, 0, 1, VolumeMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRequirementsEClass, ResourceRequirements.class, "ResourceRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceRequirements_Limits(), theKubernetesPackage.getKeyValuePair(), null, "limits", null, 0, -1, ResourceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRequirements_Requests(), theKubernetesPackage.getKeyValuePair(), null, "requests", null, 0, -1, ResourceRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_Name(), ecorePackage.getEString(), "name", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Type(), ecorePackage.getEString(), "type", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(podTemplateSpecEClass, PodTemplateSpec.class, "PodTemplateSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPodTemplateSpec_Labels(), theKubernetesPackage.getKeyValuePair(), null, "labels", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplateSpec_Annotations(), theKubernetesPackage.getKeyValuePair(), null, "annotations", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplateSpec_Containers(), this.getContainer(), null, "containers", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplateSpec_InitContainers(), this.getContainer(), null, "initContainers", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplateSpec_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodTemplateSpec_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodTemplateSpec_ServiceAccountName(), ecorePackage.getEString(), "serviceAccountName", null, 0, 1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPodTemplateSpec_NodeName(), ecorePackage.getEString(), "nodeName", null, 0, 1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPodTemplateSpec_NodeSelector(), theKubernetesPackage.getKeyValuePair(), null, "nodeSelector", null, 0, -1, PodTemplateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(podEClass, Pod.class, "Pod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPod_Containers(), this.getContainer(), null, "containers", null, 0, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_InitContainers(), this.getContainer(), null, "initContainers", null, 0, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPod_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_RestartPolicy(), ecorePackage.getEString(), "restartPolicy", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_NodeName(), ecorePackage.getEString(), "nodeName", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_ServiceAccountName(), ecorePackage.getEString(), "serviceAccountName", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPod_Phase(), ecorePackage.getEString(), "phase", null, 0, 1, Pod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Replicas(), ecorePackage.getEInt(), "replicas", "1", 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Selector(), theKubernetesPackage.getLabelSelector(), null, "selector", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Template(), this.getPodTemplateSpec(), null, "template", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_StrategyType(), ecorePackage.getEString(), "strategyType", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replicaSetEClass, ReplicaSet.class, "ReplicaSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplicaSet_Replicas(), ecorePackage.getEInt(), "replicas", "1", 0, 1, ReplicaSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicaSet_Selector(), theKubernetesPackage.getLabelSelector(), null, "selector", null, 0, 1, ReplicaSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplicaSet_Template(), this.getPodTemplateSpec(), null, "template", null, 0, 1, ReplicaSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statefulSetEClass, StatefulSet.class, "StatefulSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatefulSet_Replicas(), ecorePackage.getEInt(), "replicas", "1", 0, 1, StatefulSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatefulSet_Selector(), theKubernetesPackage.getLabelSelector(), null, "selector", null, 0, 1, StatefulSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatefulSet_Template(), this.getPodTemplateSpec(), null, "template", null, 0, 1, StatefulSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatefulSet_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, StatefulSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatefulSet_VolumeClaimTemplates(), theStoragePackage.getPersistentVolumeClaim(), null, "volumeClaimTemplates", null, 0, -1, StatefulSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daemonSetEClass, DaemonSet.class, "DaemonSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDaemonSet_Selector(), theKubernetesPackage.getLabelSelector(), null, "selector", null, 0, 1, DaemonSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaemonSet_Template(), this.getPodTemplateSpec(), null, "template", null, 0, 1, DaemonSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Selector(), theKubernetesPackage.getLabelSelector(), null, "selector", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Template(), this.getPodTemplateSpec(), null, "template", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Completions(), ecorePackage.getEInt(), "completions", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Parallelism(), ecorePackage.getEInt(), "parallelism", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_BackoffLimit(), ecorePackage.getEInt(), "backoffLimit", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cronJobEClass, CronJob.class, "CronJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCronJob_Schedule(), ecorePackage.getEString(), "schedule", null, 1, 1, CronJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCronJob_JobTemplate(), this.getJob(), null, "jobTemplate", null, 0, 1, CronJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCronJob_Suspend(), ecorePackage.getEBoolean(), "suspend", null, 0, 1, CronJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "documentation", "Workload resources manage Pods. Pods represent a set of running containers in your cluster. Controllers manage the lifecycle and scaling of pods."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "A single application container that you want to run within a pod. Each container in a Pod has its own image, ports, environment, and resource requirements."
		   });
		addAnnotation
		  (getContainer_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the container. Each container in a pod must have a unique name."
		   });
		addAnnotation
		  (getContainer_Image(),
		   source,
		   new String[] {
			   "documentation", "Container image name (e.g. nginx:1.14.2, registry.example.com/my-app:latest)."
		   });
		addAnnotation
		  (getContainer_ImagePullPolicy(),
		   source,
		   new String[] {
			   "documentation", "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise."
		   });
		addAnnotation
		  (getContainer_Ports(),
		   source,
		   new String[] {
			   "documentation", "List of ports to expose from the container."
		   });
		addAnnotation
		  (getContainer_Env(),
		   source,
		   new String[] {
			   "documentation", "List of environment variables to set in the container."
		   });
		addAnnotation
		  (getContainer_VolumeMounts(),
		   source,
		   new String[] {
			   "documentation", "Pod volumes to mount into the container\'s filesystem."
		   });
		addAnnotation
		  (getContainer_Resources(),
		   source,
		   new String[] {
			   "documentation", "Compute resource requirements for this container."
		   });
		addAnnotation
		  (getContainer_Command(),
		   source,
		   new String[] {
			   "documentation", "Entrypoint array. Not executed within a shell. If not provided, the container image\'s ENTRYPOINT is used."
		   });
		addAnnotation
		  (getContainer_Args(),
		   source,
		   new String[] {
			   "documentation", "Arguments to the entrypoint. If not provided, the container image\'s CMD is used."
		   });
		addAnnotation
		  (containerPortEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a network port in a single container."
		   });
		addAnnotation
		  (getContainerPort_Name(),
		   source,
		   new String[] {
			   "documentation", "If specified, this must be an IANA_SVC_NAME and unique within the pod."
		   });
		addAnnotation
		  (getContainerPort_ContainerPort(),
		   source,
		   new String[] {
			   "documentation", "Number of port to expose on the pod\'s IP address."
		   });
		addAnnotation
		  (getContainerPort_HostPort(),
		   source,
		   new String[] {
			   "documentation", "Number of port to expose on the host."
		   });
		addAnnotation
		  (getContainerPort_Protocol(),
		   source,
		   new String[] {
			   "documentation", "Protocol for port. Must be UDP, TCP, or SCTP. Defaults to TCP."
		   });
		addAnnotation
		  (envVarEClass,
		   source,
		   new String[] {
			   "documentation", "An environment variable to set in a container."
		   });
		addAnnotation
		  (getEnvVar_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of the environment variable."
		   });
		addAnnotation
		  (getEnvVar_Value(),
		   source,
		   new String[] {
			   "documentation", "Value of the environment variable. Defaults to empty string."
		   });
		addAnnotation
		  (volumeMountEClass,
		   source,
		   new String[] {
			   "documentation", "Describes a volume mount within a container."
		   });
		addAnnotation
		  (getVolumeMount_Name(),
		   source,
		   new String[] {
			   "documentation", "This must match the Name of a Volume."
		   });
		addAnnotation
		  (getVolumeMount_MountPath(),
		   source,
		   new String[] {
			   "documentation", "Path within the container at which the volume should be mounted."
		   });
		addAnnotation
		  (getVolumeMount_ReadOnly(),
		   source,
		   new String[] {
			   "documentation", "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false."
		   });
		addAnnotation
		  (getVolumeMount_SubPath(),
		   source,
		   new String[] {
			   "documentation", "Path within the volume from which the container\'s volume should be mounted. Defaults to the volume\'s root."
		   });
		addAnnotation
		  (resourceRequirementsEClass,
		   source,
		   new String[] {
			   "documentation", "Describes the compute resource requirements for a container, including CPU and memory limits and requests."
		   });
		addAnnotation
		  (getResourceRequirements_Limits(),
		   source,
		   new String[] {
			   "documentation", "Maximum amount of compute resources allowed (e.g. cpu: 500m, memory: 128Mi)."
		   });
		addAnnotation
		  (getResourceRequirements_Requests(),
		   source,
		   new String[] {
			   "documentation", "Minimum amount of compute resources required (e.g. cpu: 250m, memory: 64Mi)."
		   });
		addAnnotation
		  (volumeEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a named volume in a pod that may be accessed by any container in the pod."
		   });
		addAnnotation
		  (getVolume_Name(),
		   source,
		   new String[] {
			   "documentation", "Volume\'s name. Must be a DNS_LABEL and unique within the pod."
		   });
		addAnnotation
		  (getVolume_Type(),
		   source,
		   new String[] {
			   "documentation", "Volume source type (e.g. emptyDir, hostPath, configMap, secret, persistentVolumeClaim, nfs)."
		   });
		addAnnotation
		  (podTemplateSpecEClass,
		   source,
		   new String[] {
			   "documentation", "Describes the data a pod should have when created from a template. Used in Deployments, ReplicaSets, Jobs, etc."
		   });
		addAnnotation
		  (getPodTemplateSpec_Labels(),
		   source,
		   new String[] {
			   "documentation", "Labels for pods created from this template."
		   });
		addAnnotation
		  (getPodTemplateSpec_Annotations(),
		   source,
		   new String[] {
			   "documentation", "Annotations for pods created from this template."
		   });
		addAnnotation
		  (getPodTemplateSpec_Containers(),
		   source,
		   new String[] {
			   "documentation", "List of containers belonging to the pod."
		   });
		addAnnotation
		  (getPodTemplateSpec_InitContainers(),
		   source,
		   new String[] {
			   "documentation", "List of initialization containers belonging to the pod. Init containers are executed in order prior to the main containers being started."
		   });
		addAnnotation
		  (getPodTemplateSpec_Volumes(),
		   source,
		   new String[] {
			   "documentation", "List of volumes that can be mounted by containers belonging to the pod."
		   });
		addAnnotation
		  (getPodTemplateSpec_RestartPolicy(),
		   source,
		   new String[] {
			   "documentation", "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always."
		   });
		addAnnotation
		  (getPodTemplateSpec_ServiceAccountName(),
		   source,
		   new String[] {
			   "documentation", "Name of the ServiceAccount to use to run this pod."
		   });
		addAnnotation
		  (getPodTemplateSpec_NodeName(),
		   source,
		   new String[] {
			   "documentation", "NodeName is a request to schedule this pod onto a specific node."
		   });
		addAnnotation
		  (getPodTemplateSpec_NodeSelector(),
		   source,
		   new String[] {
			   "documentation", "Selector which must match a node\'s labels for the pod to be scheduled on that node."
		   });
		addAnnotation
		  (podEClass,
		   source,
		   new String[] {
			   "documentation", "A Pod is the smallest deployable units of computing that you can create and manage in Kubernetes. A Pod is a group of one or more containers, with shared storage and network resources, and a specification for how to run the containers."
		   });
		addAnnotation
		  (getPod_Containers(),
		   source,
		   new String[] {
			   "documentation", "List of containers belonging to the pod."
		   });
		addAnnotation
		  (getPod_InitContainers(),
		   source,
		   new String[] {
			   "documentation", "List of initialization containers belonging to the pod."
		   });
		addAnnotation
		  (getPod_Volumes(),
		   source,
		   new String[] {
			   "documentation", "List of volumes that can be mounted by containers belonging to the pod."
		   });
		addAnnotation
		  (getPod_RestartPolicy(),
		   source,
		   new String[] {
			   "documentation", "Restart policy for all containers within the pod. One of Always, OnFailure, Never."
		   });
		addAnnotation
		  (getPod_NodeName(),
		   source,
		   new String[] {
			   "documentation", "NodeName is a request to schedule this pod onto a specific node."
		   });
		addAnnotation
		  (getPod_ServiceAccountName(),
		   source,
		   new String[] {
			   "documentation", "Name of the ServiceAccount to use to run this pod."
		   });
		addAnnotation
		  (getPod_Phase(),
		   source,
		   new String[] {
			   "documentation", "The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod\'s status. Possible values: Pending, Running, Succeeded, Failed, Unknown."
		   });
		addAnnotation
		  (deploymentEClass,
		   source,
		   new String[] {
			   "documentation", "A Deployment provides declarative updates for Pods and ReplicaSets. You describe a desired state in a Deployment, and the Deployment Controller changes the actual state to the desired state at a controlled rate."
		   });
		addAnnotation
		  (getDeployment_Replicas(),
		   source,
		   new String[] {
			   "documentation", "Number of desired pods. Defaults to 1."
		   });
		addAnnotation
		  (getDeployment_Selector(),
		   source,
		   new String[] {
			   "documentation", "Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment."
		   });
		addAnnotation
		  (getDeployment_Template(),
		   source,
		   new String[] {
			   "documentation", "Template describes the pods that will be created."
		   });
		addAnnotation
		  (getDeployment_StrategyType(),
		   source,
		   new String[] {
			   "documentation", "Type of deployment strategy. Can be Recreate or RollingUpdate. Default is RollingUpdate."
		   });
		addAnnotation
		  (replicaSetEClass,
		   source,
		   new String[] {
			   "documentation", "A ReplicaSet\'s purpose is to maintain a stable set of replica Pods running at any given time. It is often used to guarantee the availability of a specified number of identical Pods."
		   });
		addAnnotation
		  (getReplicaSet_Replicas(),
		   source,
		   new String[] {
			   "documentation", "Number of desired pods. Defaults to 1."
		   });
		addAnnotation
		  (getReplicaSet_Selector(),
		   source,
		   new String[] {
			   "documentation", "Selector is a label query over pods that should match the replica count."
		   });
		addAnnotation
		  (getReplicaSet_Template(),
		   source,
		   new String[] {
			   "documentation", "Template is the object that describes the pod that will be created."
		   });
		addAnnotation
		  (statefulSetEClass,
		   source,
		   new String[] {
			   "documentation", "StatefulSet is the workload API object used to manage stateful applications. Manages the deployment and scaling of a set of Pods, and provides guarantees about the ordering and uniqueness of these Pods."
		   });
		addAnnotation
		  (getStatefulSet_Replicas(),
		   source,
		   new String[] {
			   "documentation", "Number of desired pods. Defaults to 1."
		   });
		addAnnotation
		  (getStatefulSet_Selector(),
		   source,
		   new String[] {
			   "documentation", "Selector is a label query over pods that should match the replica count."
		   });
		addAnnotation
		  (getStatefulSet_Template(),
		   source,
		   new String[] {
			   "documentation", "Template is the object that describes the pod that will be created."
		   });
		addAnnotation
		  (getStatefulSet_ServiceName(),
		   source,
		   new String[] {
			   "documentation", "ServiceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set."
		   });
		addAnnotation
		  (getStatefulSet_VolumeClaimTemplates(),
		   source,
		   new String[] {
			   "documentation", "VolumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod."
		   });
		addAnnotation
		  (daemonSetEClass,
		   source,
		   new String[] {
			   "documentation", "A DaemonSet ensures that all (or some) Nodes run a copy of a Pod. As nodes are added to the cluster, Pods are added to them. As nodes are removed from the cluster, those Pods are garbage collected."
		   });
		addAnnotation
		  (getDaemonSet_Selector(),
		   source,
		   new String[] {
			   "documentation", "A label query over pods that are managed by the daemon set."
		   });
		addAnnotation
		  (getDaemonSet_Template(),
		   source,
		   new String[] {
			   "documentation", "An object that describes the pod that will be created on each node."
		   });
		addAnnotation
		  (jobEClass,
		   source,
		   new String[] {
			   "documentation", "A Job creates one or more Pods and will continue to retry execution of the Pods until a specified number of them successfully terminate."
		   });
		addAnnotation
		  (getJob_Selector(),
		   source,
		   new String[] {
			   "documentation", "A label query over pods that should match the pod count."
		   });
		addAnnotation
		  (getJob_Template(),
		   source,
		   new String[] {
			   "documentation", "Describes the pod that will be created when executing a job."
		   });
		addAnnotation
		  (getJob_Completions(),
		   source,
		   new String[] {
			   "documentation", "Specifies the desired number of successfully finished pods the job should be run with."
		   });
		addAnnotation
		  (getJob_Parallelism(),
		   source,
		   new String[] {
			   "documentation", "Specifies the maximum desired number of pods the job should run at any given time."
		   });
		addAnnotation
		  (getJob_BackoffLimit(),
		   source,
		   new String[] {
			   "documentation", "Specifies the number of retries before marking this job failed. Defaults to 6."
		   });
		addAnnotation
		  (cronJobEClass,
		   source,
		   new String[] {
			   "documentation", "A CronJob creates Jobs on a repeating schedule. CronJob is meant for performing regular scheduled actions such as backups, report generation, and so on."
		   });
		addAnnotation
		  (getCronJob_Schedule(),
		   source,
		   new String[] {
			   "documentation", "The schedule in Cron format (e.g. \'*/5 * * * *\' for every 5 minutes)."
		   });
		addAnnotation
		  (getCronJob_JobTemplate(),
		   source,
		   new String[] {
			   "documentation", "Specifies the job that will be created when executing a CronJob."
		   });
		addAnnotation
		  (getCronJob_Suspend(),
		   source,
		   new String[] {
			   "documentation", "This flag tells the controller to suspend subsequent executions, it does not apply to already started executions. Defaults to false."
		   });
	}

} //WorkloadsPackageImpl
