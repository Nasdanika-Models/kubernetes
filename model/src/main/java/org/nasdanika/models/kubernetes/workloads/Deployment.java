/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Deployment provides declarative updates for Pods and ReplicaSets. You describe a desired state in a Deployment, and the Deployment Controller changes the actual state to the desired state at a controlled rate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Deployment#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Deployment#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Deployment#getStrategyType <em>Strategy Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Resource {
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
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDeployment_Replicas()
	 * @model default="1"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getReplicas <em>Replicas</em>}' attribute.
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
	 * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(LabelSelector)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDeployment_Selector()
	 * @model containment="true"
	 * @generated
	 */
	LabelSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getSelector <em>Selector</em>}' containment reference.
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
	 * Template describes the pods that will be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(PodTemplateSpec)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDeployment_Template()
	 * @model containment="true"
	 * @generated
	 */
	PodTemplateSpec getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplateSpec value);

	/**
	 * Returns the value of the '<em><b>Strategy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of deployment strategy. Can be Recreate or RollingUpdate. Default is RollingUpdate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Type</em>' attribute.
	 * @see #setStrategyType(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDeployment_StrategyType()
	 * @model
	 * @generated
	 */
	String getStrategyType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Deployment#getStrategyType <em>Strategy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Type</em>' attribute.
	 * @see #getStrategyType()
	 * @generated
	 */
	void setStrategyType(String value);

} // Deployment
