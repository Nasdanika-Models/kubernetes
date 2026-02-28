/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.LabelSelector;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.Deployment;
import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.DeploymentImpl#getStrategyType <em>Strategy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends ResourceImpl implements Deployment {
	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getStrategyType() <em>Strategy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyType()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicas() {
		return (Integer)eDynamicGet(WorkloadsPackage.DEPLOYMENT__REPLICAS, WorkloadsPackage.Literals.DEPLOYMENT__REPLICAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicas(int newReplicas) {
		eDynamicSet(WorkloadsPackage.DEPLOYMENT__REPLICAS, WorkloadsPackage.Literals.DEPLOYMENT__REPLICAS, newReplicas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSelector getSelector() {
		return (LabelSelector)eDynamicGet(WorkloadsPackage.DEPLOYMENT__SELECTOR, WorkloadsPackage.Literals.DEPLOYMENT__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(LabelSelector newSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelector, WorkloadsPackage.DEPLOYMENT__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(LabelSelector newSelector) {
		eDynamicSet(WorkloadsPackage.DEPLOYMENT__SELECTOR, WorkloadsPackage.Literals.DEPLOYMENT__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec getTemplate() {
		return (PodTemplateSpec)eDynamicGet(WorkloadsPackage.DEPLOYMENT__TEMPLATE, WorkloadsPackage.Literals.DEPLOYMENT__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplateSpec newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, WorkloadsPackage.DEPLOYMENT__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(PodTemplateSpec newTemplate) {
		eDynamicSet(WorkloadsPackage.DEPLOYMENT__TEMPLATE, WorkloadsPackage.Literals.DEPLOYMENT__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategyType() {
		return (String)eDynamicGet(WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE, WorkloadsPackage.Literals.DEPLOYMENT__STRATEGY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategyType(String newStrategyType) {
		eDynamicSet(WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE, WorkloadsPackage.Literals.DEPLOYMENT__STRATEGY_TYPE, newStrategyType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.DEPLOYMENT__SELECTOR:
				return basicSetSelector(null, msgs);
			case WorkloadsPackage.DEPLOYMENT__TEMPLATE:
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
			case WorkloadsPackage.DEPLOYMENT__REPLICAS:
				return getReplicas();
			case WorkloadsPackage.DEPLOYMENT__SELECTOR:
				return getSelector();
			case WorkloadsPackage.DEPLOYMENT__TEMPLATE:
				return getTemplate();
			case WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE:
				return getStrategyType();
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
			case WorkloadsPackage.DEPLOYMENT__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case WorkloadsPackage.DEPLOYMENT__SELECTOR:
				setSelector((LabelSelector)newValue);
				return;
			case WorkloadsPackage.DEPLOYMENT__TEMPLATE:
				setTemplate((PodTemplateSpec)newValue);
				return;
			case WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE:
				setStrategyType((String)newValue);
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
			case WorkloadsPackage.DEPLOYMENT__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case WorkloadsPackage.DEPLOYMENT__SELECTOR:
				setSelector((LabelSelector)null);
				return;
			case WorkloadsPackage.DEPLOYMENT__TEMPLATE:
				setTemplate((PodTemplateSpec)null);
				return;
			case WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE:
				setStrategyType(STRATEGY_TYPE_EDEFAULT);
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
			case WorkloadsPackage.DEPLOYMENT__REPLICAS:
				return getReplicas() != REPLICAS_EDEFAULT;
			case WorkloadsPackage.DEPLOYMENT__SELECTOR:
				return getSelector() != null;
			case WorkloadsPackage.DEPLOYMENT__TEMPLATE:
				return getTemplate() != null;
			case WorkloadsPackage.DEPLOYMENT__STRATEGY_TYPE:
				return STRATEGY_TYPE_EDEFAULT == null ? getStrategyType() != null : !STRATEGY_TYPE_EDEFAULT.equals(getStrategyType());
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
