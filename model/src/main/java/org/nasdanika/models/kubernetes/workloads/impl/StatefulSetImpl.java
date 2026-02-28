/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.LabelSelector;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;

import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.StatefulSet;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateful Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.StatefulSetImpl#getVolumeClaimTemplates <em>Volume Claim Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatefulSetImpl extends ResourceImpl implements StatefulSet {
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
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatefulSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.STATEFUL_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplicas() {
		return (Integer)eDynamicGet(WorkloadsPackage.STATEFUL_SET__REPLICAS, WorkloadsPackage.Literals.STATEFUL_SET__REPLICAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicas(int newReplicas) {
		eDynamicSet(WorkloadsPackage.STATEFUL_SET__REPLICAS, WorkloadsPackage.Literals.STATEFUL_SET__REPLICAS, newReplicas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelSelector getSelector() {
		return (LabelSelector)eDynamicGet(WorkloadsPackage.STATEFUL_SET__SELECTOR, WorkloadsPackage.Literals.STATEFUL_SET__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(LabelSelector newSelector, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelector, WorkloadsPackage.STATEFUL_SET__SELECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelector(LabelSelector newSelector) {
		eDynamicSet(WorkloadsPackage.STATEFUL_SET__SELECTOR, WorkloadsPackage.Literals.STATEFUL_SET__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PodTemplateSpec getTemplate() {
		return (PodTemplateSpec)eDynamicGet(WorkloadsPackage.STATEFUL_SET__TEMPLATE, WorkloadsPackage.Literals.STATEFUL_SET__TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(PodTemplateSpec newTemplate, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTemplate, WorkloadsPackage.STATEFUL_SET__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplate(PodTemplateSpec newTemplate) {
		eDynamicSet(WorkloadsPackage.STATEFUL_SET__TEMPLATE, WorkloadsPackage.Literals.STATEFUL_SET__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eDynamicGet(WorkloadsPackage.STATEFUL_SET__SERVICE_NAME, WorkloadsPackage.Literals.STATEFUL_SET__SERVICE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eDynamicSet(WorkloadsPackage.STATEFUL_SET__SERVICE_NAME, WorkloadsPackage.Literals.STATEFUL_SET__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PersistentVolumeClaim> getVolumeClaimTemplates() {
		return (EList<PersistentVolumeClaim>)eDynamicGet(WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES, WorkloadsPackage.Literals.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.STATEFUL_SET__SELECTOR:
				return basicSetSelector(null, msgs);
			case WorkloadsPackage.STATEFUL_SET__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES:
				return ((InternalEList<?>)getVolumeClaimTemplates()).basicRemove(otherEnd, msgs);
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
			case WorkloadsPackage.STATEFUL_SET__REPLICAS:
				return getReplicas();
			case WorkloadsPackage.STATEFUL_SET__SELECTOR:
				return getSelector();
			case WorkloadsPackage.STATEFUL_SET__TEMPLATE:
				return getTemplate();
			case WorkloadsPackage.STATEFUL_SET__SERVICE_NAME:
				return getServiceName();
			case WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES:
				return getVolumeClaimTemplates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkloadsPackage.STATEFUL_SET__REPLICAS:
				setReplicas((Integer)newValue);
				return;
			case WorkloadsPackage.STATEFUL_SET__SELECTOR:
				setSelector((LabelSelector)newValue);
				return;
			case WorkloadsPackage.STATEFUL_SET__TEMPLATE:
				setTemplate((PodTemplateSpec)newValue);
				return;
			case WorkloadsPackage.STATEFUL_SET__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES:
				getVolumeClaimTemplates().clear();
				getVolumeClaimTemplates().addAll((Collection<? extends PersistentVolumeClaim>)newValue);
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
			case WorkloadsPackage.STATEFUL_SET__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
				return;
			case WorkloadsPackage.STATEFUL_SET__SELECTOR:
				setSelector((LabelSelector)null);
				return;
			case WorkloadsPackage.STATEFUL_SET__TEMPLATE:
				setTemplate((PodTemplateSpec)null);
				return;
			case WorkloadsPackage.STATEFUL_SET__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES:
				getVolumeClaimTemplates().clear();
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
			case WorkloadsPackage.STATEFUL_SET__REPLICAS:
				return getReplicas() != REPLICAS_EDEFAULT;
			case WorkloadsPackage.STATEFUL_SET__SELECTOR:
				return getSelector() != null;
			case WorkloadsPackage.STATEFUL_SET__TEMPLATE:
				return getTemplate() != null;
			case WorkloadsPackage.STATEFUL_SET__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? getServiceName() != null : !SERVICE_NAME_EDEFAULT.equals(getServiceName());
			case WorkloadsPackage.STATEFUL_SET__VOLUME_CLAIM_TEMPLATES:
				return !getVolumeClaimTemplates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatefulSetImpl
