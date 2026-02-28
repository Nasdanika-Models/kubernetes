/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replica Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReplicaSet's purpose is to maintain a stable set of replica Pods running at any given time. It is often used to guarantee the availability of a specified number of identical Pods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getReplicaSet()
 * @model
 * @generated
 */
public interface ReplicaSet extends Resource {
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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getReplicaSet_Replicas()
	 * @model default="1"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getReplicas <em>Replicas</em>}' attribute.
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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getReplicaSet_Selector()
	 * @model containment="true"
	 * @generated
	 */
	LabelSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getSelector <em>Selector</em>}' containment reference.
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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getReplicaSet_Template()
	 * @model containment="true"
	 * @generated
	 */
	PodTemplateSpec getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ReplicaSet#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplateSpec value);

} // ReplicaSet
