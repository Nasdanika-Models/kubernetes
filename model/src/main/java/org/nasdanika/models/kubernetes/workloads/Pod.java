/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Pod is the smallest deployable units of computing that you can create and manage in Kubernetes. A Pod is a group of one or more containers, with shared storage and network resources, and a specification for how to run the containers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getServiceAccountName <em>Service Account Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Pod#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod()
 * @model
 * @generated
 */
public interface Pod extends Resource {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of containers belonging to the pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_Containers()
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
	 * List of initialization containers belonging to the pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Containers</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_InitContainers()
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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restart policy for all containers within the pod. One of Always, OnFailure, Never.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Pod#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NodeName is a request to schedule this pod onto a specific node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_NodeName()
	 * @model
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Pod#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

	/**
	 * Returns the value of the '<em><b>Service Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the ServiceAccount to use to run this pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Account Name</em>' attribute.
	 * @see #setServiceAccountName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_ServiceAccountName()
	 * @model
	 * @generated
	 */
	String getServiceAccountName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Pod#getServiceAccountName <em>Service Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Account Name</em>' attribute.
	 * @see #getServiceAccountName()
	 * @generated
	 */
	void setServiceAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. Possible values: Pending, Running, Succeeded, Failed, Unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getPod_Phase()
	 * @model
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Pod#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

} // Pod
