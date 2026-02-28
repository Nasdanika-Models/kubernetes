/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Resource;

import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StatefulSet is the workload API object used to manage stateful applications. Manages the deployment and scaling of a set of Pods, and provides guarantees about the ordering and uniqueness of these Pods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getVolumeClaimTemplates <em>Volume Claim Templates</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet()
 * @model
 * @generated
 */
public interface StatefulSet extends Resource {
	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of desired pods. Defaults to 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet_Replicas()
	 * @model default="1"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Selector is a label query over pods that should match the replica count.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(LabelSelector)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet_Selector()
	 * @model containment="true"
	 * @generated
	 */
	LabelSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(LabelSelector value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Template is the object that describes the pod that will be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(PodTemplateSpec)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet_Template()
	 * @model containment="true"
	 * @generated
	 */
	PodTemplateSpec getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplateSpec value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.StatefulSet#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Volume Claim Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VolumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Claim Templates</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getStatefulSet_VolumeClaimTemplates()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersistentVolumeClaim> getVolumeClaimTemplates();

} // StatefulSet
