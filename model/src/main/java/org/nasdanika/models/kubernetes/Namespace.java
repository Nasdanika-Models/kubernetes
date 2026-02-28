/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.configuration.ConfigMap;
import org.nasdanika.models.kubernetes.configuration.Secret;

import org.nasdanika.models.kubernetes.networking.Ingress;
import org.nasdanika.models.kubernetes.networking.Service;

import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;

import org.nasdanika.models.kubernetes.workloads.CronJob;
import org.nasdanika.models.kubernetes.workloads.DaemonSet;
import org.nasdanika.models.kubernetes.workloads.Deployment;
import org.nasdanika.models.kubernetes.workloads.Job;
import org.nasdanika.models.kubernetes.workloads.Pod;
import org.nasdanika.models.kubernetes.workloads.ReplicaSet;
import org.nasdanika.models.kubernetes.workloads.StatefulSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Namespaces provide a mechanism for isolating groups of resources within a single cluster. Names of resources need to be unique within a namespace, but not across namespaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getStatefulSets <em>Stateful Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getDaemonSets <em>Daemon Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getReplicaSets <em>Replica Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getPods <em>Pods</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getServices <em>Services</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getIngresses <em>Ingresses</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getConfigMaps <em>Config Maps</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getCronJobs <em>Cron Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Namespace#getPersistentVolumeClaims <em>Persistent Volume Claims</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends Resource {
	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deployments in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Deployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Stateful Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.StatefulSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StatefulSets in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stateful Sets</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_StatefulSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatefulSet> getStatefulSets();

	/**
	 * Returns the value of the '<em><b>Daemon Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.DaemonSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DaemonSets in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daemon Sets</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_DaemonSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaemonSet> getDaemonSets();

	/**
	 * Returns the value of the '<em><b>Replica Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.ReplicaSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReplicaSets in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replica Sets</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_ReplicaSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReplicaSet> getReplicaSets();

	/**
	 * Returns the value of the '<em><b>Pods</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Pod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pods in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pods</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Pods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pod> getPods();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.networking.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Services in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Ingresses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.networking.Ingress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ingress resources in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingresses</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Ingresses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingress> getIngresses();

	/**
	 * Returns the value of the '<em><b>Config Maps</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.configuration.ConfigMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConfigMaps in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Maps</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_ConfigMaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigMap> getConfigMaps();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.configuration.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secrets in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jobs in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Cron Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.CronJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CronJobs in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cron Jobs</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_CronJobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<CronJob> getCronJobs();

	/**
	 * Returns the value of the '<em><b>Persistent Volume Claims</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PersistentVolumeClaims in this namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Volume Claims</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNamespace_PersistentVolumeClaims()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersistentVolumeClaim> getPersistentVolumeClaims();

} // Namespace
