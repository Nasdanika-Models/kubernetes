/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.LabelSelector;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.DaemonSet;
import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daemon Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DaemonSetImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaemonSetImpl extends ResourceImpl implements DaemonSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaemonSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.DAEMON_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSelector getSelector() {
		return (LabelSelector)eDynamicGet(WorkloadsPackage.DAEMON_SET__SELECTOR, WorkloadsPackage.Literals.DAEMON_SET__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(LabelSelector newSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelector, WorkloadsPackage.DAEMON_SET__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(LabelSelector newSelector) {
		eDynamicSet(WorkloadsPackage.DAEMON_SET__SELECTOR, WorkloadsPackage.Literals.DAEMON_SET__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec getTemplate() {
		return (PodTemplateSpec)eDynamicGet(WorkloadsPackage.DAEMON_SET__TEMPLATE, WorkloadsPackage.Literals.DAEMON_SET__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplateSpec newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, WorkloadsPackage.DAEMON_SET__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(PodTemplateSpec newTemplate) {
		eDynamicSet(WorkloadsPackage.DAEMON_SET__TEMPLATE, WorkloadsPackage.Literals.DAEMON_SET__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.DAEMON_SET__SELECTOR:
				return basicSetSelector(null, msgs);
			case WorkloadsPackage.DAEMON_SET__TEMPLATE:
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
			case WorkloadsPackage.DAEMON_SET__SELECTOR:
				return getSelector();
			case WorkloadsPackage.DAEMON_SET__TEMPLATE:
				return getTemplate();
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
			case WorkloadsPackage.DAEMON_SET__SELECTOR:
				setSelector((LabelSelector)newValue);
				return;
			case WorkloadsPackage.DAEMON_SET__TEMPLATE:
				setTemplate((PodTemplateSpec)newValue);
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
			case WorkloadsPackage.DAEMON_SET__SELECTOR:
				setSelector((LabelSelector)null);
				return;
			case WorkloadsPackage.DAEMON_SET__TEMPLATE:
				setTemplate((PodTemplateSpec)null);
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
			case WorkloadsPackage.DAEMON_SET__SELECTOR:
				return getSelector() != null;
			case WorkloadsPackage.DAEMON_SET__TEMPLATE:
				return getTemplate() != null;
		}
		return super.eIsSet(featureID);
	}

} //DaemonSetImpl
