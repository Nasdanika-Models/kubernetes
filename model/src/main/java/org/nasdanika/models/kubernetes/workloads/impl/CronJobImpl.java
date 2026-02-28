/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.CronJob;
import org.nasdanika.models.kubernetes.workloads.Job;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cron Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl#getJobTemplate <em>Job Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.CronJobImpl#isSuspend <em>Suspend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CronJobImpl extends ResourceImpl implements CronJob {
	/**
	 * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isSuspend() <em>Suspend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPEND_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CronJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.CRON_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchedule() {
		return (String)eDynamicGet(WorkloadsPackage.CRON_JOB__SCHEDULE, WorkloadsPackage.Literals.CRON_JOB__SCHEDULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedule(String newSchedule) {
		eDynamicSet(WorkloadsPackage.CRON_JOB__SCHEDULE, WorkloadsPackage.Literals.CRON_JOB__SCHEDULE, newSchedule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job getJobTemplate() {
		return (Job)eDynamicGet(WorkloadsPackage.CRON_JOB__JOB_TEMPLATE, WorkloadsPackage.Literals.CRON_JOB__JOB_TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobTemplate(Job newJobTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newJobTemplate, WorkloadsPackage.CRON_JOB__JOB_TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobTemplate(Job newJobTemplate) {
		eDynamicSet(WorkloadsPackage.CRON_JOB__JOB_TEMPLATE, WorkloadsPackage.Literals.CRON_JOB__JOB_TEMPLATE, newJobTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSuspend() {
		return (Boolean)eDynamicGet(WorkloadsPackage.CRON_JOB__SUSPEND, WorkloadsPackage.Literals.CRON_JOB__SUSPEND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspend(boolean newSuspend) {
		eDynamicSet(WorkloadsPackage.CRON_JOB__SUSPEND, WorkloadsPackage.Literals.CRON_JOB__SUSPEND, newSuspend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.CRON_JOB__JOB_TEMPLATE:
				return basicSetJobTemplate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkloadsPackage.CRON_JOB__SCHEDULE:
				return getSchedule();
			case WorkloadsPackage.CRON_JOB__JOB_TEMPLATE:
				return getJobTemplate();
			case WorkloadsPackage.CRON_JOB__SUSPEND:
				return isSuspend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkloadsPackage.CRON_JOB__SCHEDULE:
				setSchedule((String)newValue);
				return;
			case WorkloadsPackage.CRON_JOB__JOB_TEMPLATE:
				setJobTemplate((Job)newValue);
				return;
			case WorkloadsPackage.CRON_JOB__SUSPEND:
				setSuspend((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkloadsPackage.CRON_JOB__SCHEDULE:
				setSchedule(SCHEDULE_EDEFAULT);
				return;
			case WorkloadsPackage.CRON_JOB__JOB_TEMPLATE:
				setJobTemplate((Job)null);
				return;
			case WorkloadsPackage.CRON_JOB__SUSPEND:
				setSuspend(SUSPEND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkloadsPackage.CRON_JOB__SCHEDULE:
				return SCHEDULE_EDEFAULT == null ? getSchedule() != null : !SCHEDULE_EDEFAULT.equals(getSchedule());
			case WorkloadsPackage.CRON_JOB__JOB_TEMPLATE:
				return getJobTemplate() != null;
			case WorkloadsPackage.CRON_JOB__SUSPEND:
				return isSuspend() != SUSPEND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CronJobImpl
