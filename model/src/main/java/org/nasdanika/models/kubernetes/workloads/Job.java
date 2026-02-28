/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Job creates one or more Pods and will continue to retry execution of the Pods until a specified number of them successfully terminate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Job#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Job#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Job#getCompletions <em>Completions</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Job#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Job#getBackoffLimit <em>Backoff Limit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends Resource {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label query over pods that should match the pod count.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(LabelSelector)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob_Selector()
	 * @model containment="true"
	 * @generated
	 */
	LabelSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Job#getSelector <em>Selector</em>}' containment reference.
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
	 * Describes the pod that will be created when executing a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(PodTemplateSpec)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob_Template()
	 * @model containment="true"
	 * @generated
	 */
	PodTemplateSpec getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Job#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplateSpec value);

	/**
	 * Returns the value of the '<em><b>Completions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the desired number of successfully finished pods the job should be run with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Completions</em>' attribute.
	 * @see #setCompletions(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob_Completions()
	 * @model
	 * @generated
	 */
	int getCompletions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Job#getCompletions <em>Completions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completions</em>' attribute.
	 * @see #getCompletions()
	 * @generated
	 */
	void setCompletions(int value);

	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum desired number of pods the job should run at any given time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob_Parallelism()
	 * @model
	 * @generated
	 */
	int getParallelism();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Job#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(int value);

	/**
	 * Returns the value of the '<em><b>Backoff Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the number of retries before marking this job failed. Defaults to 6.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backoff Limit</em>' attribute.
	 * @see #setBackoffLimit(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getJob_BackoffLimit()
	 * @model
	 * @generated
	 */
	int getBackoffLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Job#getBackoffLimit <em>Backoff Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backoff Limit</em>' attribute.
	 * @see #getBackoffLimit()
	 * @generated
	 */
	void setBackoffLimit(int value);

} // Job
