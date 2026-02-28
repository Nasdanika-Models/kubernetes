package org.nasdanika.models.kubernetes.workloads;

import org.nasdanika.models.kubernetes.Resource;

public interface CronJob extends Resource {
	
	String getSchedule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.CronJob#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(String value);

	/**
	 * Returns the value of the '<em><b>Job Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the job that will be created when executing a CronJob.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Template</em>' containment reference.
	 * @see #setJobTemplate(Job)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getCronJob_JobTemplate()
	 * @model containment="true"
	 * @generated
	 */
	Job getJobTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.CronJob#getJobTemplate <em>Job Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Template</em>' containment reference.
	 * @see #getJobTemplate()
	 * @generated
	 */
	void setJobTemplate(Job value);

	/**
	 * Returns the value of the '<em><b>Suspend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions. Defaults to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Suspend</em>' attribute.
	 * @see #setSuspend(boolean)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getCronJob_Suspend()
	 * @model
	 * @generated
	 */
	boolean isSuspend();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.CronJob#isSuspend <em>Suspend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend</em>' attribute.
	 * @see #isSuspend()
	 * @generated
	 */
	void setSuspend(boolean value);

} // CronJob
