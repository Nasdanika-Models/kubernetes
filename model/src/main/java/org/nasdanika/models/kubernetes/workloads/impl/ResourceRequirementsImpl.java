/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;

import org.nasdanika.models.kubernetes.workloads.ResourceRequirements;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ResourceRequirementsImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRequirementsImpl extends MinimalEObjectImpl.Container implements ResourceRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.RESOURCE_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getLimits() {
		return (EList<KeyValuePair>)eDynamicGet(WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS, WorkloadsPackage.Literals.RESOURCE_REQUIREMENTS__LIMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getRequests() {
		return (EList<KeyValuePair>)eDynamicGet(WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS, WorkloadsPackage.Literals.RESOURCE_REQUIREMENTS__REQUESTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return ((InternalEList<?>)getLimits()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
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
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return getLimits();
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return getRequests();
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
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS:
				getLimits().clear();
				getLimits().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS:
				getLimits().clear();
				return;
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				getRequests().clear();
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
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return !getLimits().isEmpty();
			case WorkloadsPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return !getRequests().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceRequirementsImpl
