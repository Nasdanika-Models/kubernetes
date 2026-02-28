/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.kubernetes.workloads.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadsFactoryImpl extends EFactoryImpl implements WorkloadsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkloadsFactory init() {
		try {
			WorkloadsFactory theWorkloadsFactory = (WorkloadsFactory)EPackage.Registry.INSTANCE.getEFactory(WorkloadsPackage.eNS_URI);
			if (theWorkloadsFactory != null) {
				return theWorkloadsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkloadsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadsFactoryImpl() {
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
			case WorkloadsPackage.CONTAINER: return createContainer();
			case WorkloadsPackage.CONTAINER_PORT: return createContainerPort();
			case WorkloadsPackage.ENV_VAR: return createEnvVar();
			case WorkloadsPackage.VOLUME_MOUNT: return createVolumeMount();
			case WorkloadsPackage.RESOURCE_REQUIREMENTS: return createResourceRequirements();
			case WorkloadsPackage.VOLUME: return createVolume();
			case WorkloadsPackage.POD_TEMPLATE_SPEC: return createPodTemplateSpec();
			case WorkloadsPackage.POD: return createPod();
			case WorkloadsPackage.DEPLOYMENT: return createDeployment();
			case WorkloadsPackage.REPLICA_SET: return createReplicaSet();
			case WorkloadsPackage.STATEFUL_SET: return createStatefulSet();
			case WorkloadsPackage.DAEMON_SET: return createDaemonSet();
			case WorkloadsPackage.JOB: return createJob();
			case WorkloadsPackage.CRON_JOB: return createCronJob();
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
	public org.nasdanika.models.kubernetes.workloads.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPort createContainerPort() {
		ContainerPortImpl containerPort = new ContainerPortImpl();
		return containerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvVar createEnvVar() {
		EnvVarImpl envVar = new EnvVarImpl();
		return envVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeMount createVolumeMount() {
		VolumeMountImpl volumeMount = new VolumeMountImpl();
		return volumeMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRequirements createResourceRequirements() {
		ResourceRequirementsImpl resourceRequirements = new ResourceRequirementsImpl();
		return resourceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec createPodTemplateSpec() {
		PodTemplateSpecImpl podTemplateSpec = new PodTemplateSpecImpl();
		return podTemplateSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pod createPod() {
		PodImpl pod = new PodImpl();
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplicaSet createReplicaSet() {
		ReplicaSetImpl replicaSet = new ReplicaSetImpl();
		return replicaSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatefulSet createStatefulSet() {
		StatefulSetImpl statefulSet = new StatefulSetImpl();
		return statefulSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DaemonSet createDaemonSet() {
		DaemonSetImpl daemonSet = new DaemonSetImpl();
		return daemonSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CronJob createCronJob() {
		CronJobImpl cronJob = new CronJobImpl();
		return cronJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkloadsPackage getWorkloadsPackage() {
		return (WorkloadsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkloadsPackage getPackage() {
		return WorkloadsPackage.eINSTANCE;
	}

} //WorkloadsFactoryImpl
