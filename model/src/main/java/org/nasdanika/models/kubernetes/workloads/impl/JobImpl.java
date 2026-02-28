/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.LabelSelector;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.Job;
import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl#getCompletions <em>Completions</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.JobImpl#getBackoffLimit <em>Backoff Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends ResourceImpl implements Job {
	/**
	 * The default value of the '{@link #getCompletions() <em>Completions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletions()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETIONS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final int PARALLELISM_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getBackoffLimit() <em>Backoff Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackoffLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int BACKOFF_LIMIT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSelector getSelector() {
		return (LabelSelector)eDynamicGet(WorkloadsPackage.JOB__SELECTOR, WorkloadsPackage.Literals.JOB__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(LabelSelector newSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelector, WorkloadsPackage.JOB__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(LabelSelector newSelector) {
		eDynamicSet(WorkloadsPackage.JOB__SELECTOR, WorkloadsPackage.Literals.JOB__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec getTemplate() {
		return (PodTemplateSpec)eDynamicGet(WorkloadsPackage.JOB__TEMPLATE, WorkloadsPackage.Literals.JOB__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplateSpec newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, WorkloadsPackage.JOB__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(PodTemplateSpec newTemplate) {
		eDynamicSet(WorkloadsPackage.JOB__TEMPLATE, WorkloadsPackage.Literals.JOB__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCompletions() {
		return (Integer)eDynamicGet(WorkloadsPackage.JOB__COMPLETIONS, WorkloadsPackage.Literals.JOB__COMPLETIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletions(int newCompletions) {
		eDynamicSet(WorkloadsPackage.JOB__COMPLETIONS, WorkloadsPackage.Literals.JOB__COMPLETIONS, newCompletions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getParallelism() {
		return (Integer)eDynamicGet(WorkloadsPackage.JOB__PARALLELISM, WorkloadsPackage.Literals.JOB__PARALLELISM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelism(int newParallelism) {
		eDynamicSet(WorkloadsPackage.JOB__PARALLELISM, WorkloadsPackage.Literals.JOB__PARALLELISM, newParallelism);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBackoffLimit() {
		return (Integer)eDynamicGet(WorkloadsPackage.JOB__BACKOFF_LIMIT, WorkloadsPackage.Literals.JOB__BACKOFF_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackoffLimit(int newBackoffLimit) {
		eDynamicSet(WorkloadsPackage.JOB__BACKOFF_LIMIT, WorkloadsPackage.Literals.JOB__BACKOFF_LIMIT, newBackoffLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.JOB__SELECTOR:
				return basicSetSelector(null, msgs);
			case WorkloadsPackage.JOB__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case WorkloadsPackage.JOB__SELECTOR:
				return getSelector();
			case WorkloadsPackage.JOB__TEMPLATE:
				return getTemplate();
			case WorkloadsPackage.JOB__COMPLETIONS:
				return getCompletions();
			case WorkloadsPackage.JOB__PARALLELISM:
				return getParallelism();
			case WorkloadsPackage.JOB__BACKOFF_LIMIT:
				return getBackoffLimit();
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
			case WorkloadsPackage.JOB__SELECTOR:
				setSelector((LabelSelector)newValue);
				return;
			case WorkloadsPackage.JOB__TEMPLATE:
				setTemplate((PodTemplateSpec)newValue);
				return;
			case WorkloadsPackage.JOB__COMPLETIONS:
				setCompletions((Integer)newValue);
				return;
			case WorkloadsPackage.JOB__PARALLELISM:
				setParallelism((Integer)newValue);
				return;
			case WorkloadsPackage.JOB__BACKOFF_LIMIT:
				setBackoffLimit((Integer)newValue);
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
			case WorkloadsPackage.JOB__SELECTOR:
				setSelector((LabelSelector)null);
				return;
			case WorkloadsPackage.JOB__TEMPLATE:
				setTemplate((PodTemplateSpec)null);
				return;
			case WorkloadsPackage.JOB__COMPLETIONS:
				setCompletions(COMPLETIONS_EDEFAULT);
				return;
			case WorkloadsPackage.JOB__PARALLELISM:
				setParallelism(PARALLELISM_EDEFAULT);
				return;
			case WorkloadsPackage.JOB__BACKOFF_LIMIT:
				setBackoffLimit(BACKOFF_LIMIT_EDEFAULT);
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
			case WorkloadsPackage.JOB__SELECTOR:
				return getSelector() != null;
			case WorkloadsPackage.JOB__TEMPLATE:
				return getTemplate() != null;
			case WorkloadsPackage.JOB__COMPLETIONS:
				return getCompletions() != COMPLETIONS_EDEFAULT;
			case WorkloadsPackage.JOB__PARALLELISM:
				return getParallelism() != PARALLELISM_EDEFAULT;
			case WorkloadsPackage.JOB__BACKOFF_LIMIT:
				return getBackoffLimit() != BACKOFF_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //JobImpl
