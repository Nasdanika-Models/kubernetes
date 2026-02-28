/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.LabelSelector;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.ReplicaSet;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replica Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ReplicaSetImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicaSetImpl extends ResourceImpl implements ReplicaSet {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicaSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.REPLICA_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicas() {
		return (Integer)eDynamicGet(WorkloadsPackage.REPLICA_SET__REPLICAS, WorkloadsPackage.Literals.REPLICA_SET__REPLICAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicas(int newReplicas) {
		eDynamicSet(WorkloadsPackage.REPLICA_SET__REPLICAS, WorkloadsPackage.Literals.REPLICA_SET__REPLICAS, newReplicas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSelector getSelector() {
		return (LabelSelector)eDynamicGet(WorkloadsPackage.REPLICA_SET__SELECTOR, WorkloadsPackage.Literals.REPLICA_SET__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(LabelSelector newSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelector, WorkloadsPackage.REPLICA_SET__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(LabelSelector newSelector) {
		eDynamicSet(WorkloadsPackage.REPLICA_SET__SELECTOR, WorkloadsPackage.Literals.REPLICA_SET__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec getTemplate() {
		return (PodTemplateSpec)eDynamicGet(WorkloadsPackage.REPLICA_SET__TEMPLATE, WorkloadsPackage.Literals.REPLICA_SET__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplateSpec newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, WorkloadsPackage.REPLICA_SET__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(PodTemplateSpec newTemplate) {
		eDynamicSet(WorkloadsPackage.REPLICA_SET__TEMPLATE, WorkloadsPackage.Literals.REPLICA_SET__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.REPLICA_SET__SELECTOR:
				return basicSetSelector(null, msgs);
			case WorkloadsPackage.REPLICA_SET__TEMPLATE:
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
			case WorkloadsPackage.REPLICA_SET__REPLICAS:
				return getReplicas();
			case WorkloadsPackage.REPLICA_SET__SELECTOR:
				return getSelector();
			case WorkloadsPackage.REPLICA_SET__TEMPLATE:
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
			case WorkloadsPackage.REPLICA_SET__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case WorkloadsPackage.REPLICA_SET__SELECTOR:
				setSelector((LabelSelector)newValue);
				return;
			case WorkloadsPackage.REPLICA_SET__TEMPLATE:
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
			case WorkloadsPackage.REPLICA_SET__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case WorkloadsPackage.REPLICA_SET__SELECTOR:
				setSelector((LabelSelector)null);
				return;
			case WorkloadsPackage.REPLICA_SET__TEMPLATE:
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
			case WorkloadsPackage.REPLICA_SET__REPLICAS:
				return getReplicas() != REPLICAS_EDEFAULT;
			case WorkloadsPackage.REPLICA_SET__SELECTOR:
				return getSelector() != null;
			case WorkloadsPackage.REPLICA_SET__TEMPLATE:
				return getTemplate() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReplicaSetImpl
