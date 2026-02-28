/**
 */
package org.nasdanika.models.kubernetes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.LabelSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.LabelSelectorImpl#getMatchLabels <em>Match Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelSelectorImpl extends MinimalEObjectImpl.Container implements LabelSelector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.LABEL_SELECTOR;
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
	public EList<KeyValuePair> getMatchLabels() {
		return (EList<KeyValuePair>)eDynamicGet(KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS, KubernetesPackage.Literals.LABEL_SELECTOR__MATCH_LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS:
				return ((InternalEList<?>)getMatchLabels()).basicRemove(otherEnd, msgs);
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
			case KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS:
				return getMatchLabels();
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
			case KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS:
				getMatchLabels().clear();
				getMatchLabels().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS:
				getMatchLabels().clear();
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
			case KubernetesPackage.LABEL_SELECTOR__MATCH_LABELS:
				return !getMatchLabels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabelSelectorImpl
