/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.kubernetes.KeyValuePair;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod Template Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the data a pod should have when created from a template. Used in Deployments, ReplicaSets, Jobs, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getServiceAccountName <em>Service Account Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeSelector <em>Node Selector</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec()
 * @model
 * @generated
 */
public interface PodTemplateSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Labels for pods created from this template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getLabels();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotations for pods created from this template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of containers belonging to the pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Init Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of initialization containers belonging to the pod. Init containers are executed in order prior to the main containers being started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Containers</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_InitContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getInitContainers();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of volumes that can be mounted by containers belonging to the pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Service Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the ServiceAccount to use to run this pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Account Name</em>' attribute.
	 * @see #setServiceAccountName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_ServiceAccountName()
	 * @model
	 * @generated
	 */
	String getServiceAccountName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getServiceAccountName <em>Service Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Account Name</em>' attribute.
	 * @see #getServiceAccountName()
	 * @generated
	 */
	void setServiceAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NodeName is a request to schedule this pod onto a specific node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_NodeName()
	 * @model
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.PodTemplateSpec#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Node Selector</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selector which must match a node's labels for the pod to be scheduled on that node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Selector</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPodTemplateSpec_NodeSelector()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getNodeSelector();

} // PodTemplateSpec
