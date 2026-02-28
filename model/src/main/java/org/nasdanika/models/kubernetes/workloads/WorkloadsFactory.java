/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage
 * @generated
 */
public interface WorkloadsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkloadsFactory eINSTANCE = org.nasdanika.models.kubernetes.workloads.impl.WorkloadsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Container Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Port</em>'.
	 * @generated
	 */
	ContainerPort createContainerPort();

	/**
	 * Returns a new object of class '<em>Env Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Var</em>'.
	 * @generated
	 */
	EnvVar createEnvVar();

	/**
	 * Returns a new object of class '<em>Volume Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Mount</em>'.
	 * @generated
	 */
	VolumeMount createVolumeMount();

	/**
	 * Returns a new object of class '<em>Resource Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Requirements</em>'.
	 * @generated
	 */
	ResourceRequirements createResourceRequirements();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Pod Template Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pod Template Spec</em>'.
	 * @generated
	 */
	PodTemplateSpec createPodTemplateSpec();

	/**
	 * Returns a new object of class '<em>Pod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pod</em>'.
	 * @generated
	 */
	Pod createPod();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Replica Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replica Set</em>'.
	 * @generated
	 */
	ReplicaSet createReplicaSet();

	/**
	 * Returns a new object of class '<em>Stateful Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateful Set</em>'.
	 * @generated
	 */
	StatefulSet createStatefulSet();

	/**
	 * Returns a new object of class '<em>Daemon Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Daemon Set</em>'.
	 * @generated
	 */
	DaemonSet createDaemonSet();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	Job createJob();

	/**
	 * Returns a new object of class '<em>Cron Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Job</em>'.
	 * @generated
	 */
	CronJob createCronJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkloadsPackage getWorkloadsPackage();

} //WorkloadsFactory
