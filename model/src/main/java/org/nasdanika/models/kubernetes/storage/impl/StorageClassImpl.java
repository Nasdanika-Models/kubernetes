/**
 */
package org.nasdanika.models.kubernetes.storage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.storage.StorageClass;
import org.nasdanika.models.kubernetes.storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl#getProvisioner <em>Provisioner</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl#getReclaimPolicy <em>Reclaim Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl#getVolumeBindingMode <em>Volume Binding Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageClassImpl extends ResourceImpl implements StorageClass {
	/**
	 * The default value of the '{@link #getProvisioner() <em>Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioner()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVISIONER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReclaimPolicy() <em>Reclaim Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReclaimPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RECLAIM_POLICY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVolumeBindingMode() <em>Volume Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeBindingMode()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_BINDING_MODE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.STORAGE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvisioner() {
		return (String)eDynamicGet(StoragePackage.STORAGE_CLASS__PROVISIONER, StoragePackage.Literals.STORAGE_CLASS__PROVISIONER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvisioner(String newProvisioner) {
		eDynamicSet(StoragePackage.STORAGE_CLASS__PROVISIONER, StoragePackage.Literals.STORAGE_CLASS__PROVISIONER, newProvisioner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReclaimPolicy() {
		return (String)eDynamicGet(StoragePackage.STORAGE_CLASS__RECLAIM_POLICY, StoragePackage.Literals.STORAGE_CLASS__RECLAIM_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReclaimPolicy(String newReclaimPolicy) {
		eDynamicSet(StoragePackage.STORAGE_CLASS__RECLAIM_POLICY, StoragePackage.Literals.STORAGE_CLASS__RECLAIM_POLICY, newReclaimPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumeBindingMode() {
		return (String)eDynamicGet(StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE, StoragePackage.Literals.STORAGE_CLASS__VOLUME_BINDING_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeBindingMode(String newVolumeBindingMode) {
		eDynamicSet(StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE, StoragePackage.Literals.STORAGE_CLASS__VOLUME_BINDING_MODE, newVolumeBindingMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getParameters() {
		return (EList<KeyValuePair>)eDynamicGet(StoragePackage.STORAGE_CLASS__PARAMETERS, StoragePackage.Literals.STORAGE_CLASS__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StoragePackage.STORAGE_CLASS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case StoragePackage.STORAGE_CLASS__PROVISIONER:
				return getProvisioner();
			case StoragePackage.STORAGE_CLASS__RECLAIM_POLICY:
				return getReclaimPolicy();
			case StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE:
				return getVolumeBindingMode();
			case StoragePackage.STORAGE_CLASS__PARAMETERS:
				return getParameters();
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
			case StoragePackage.STORAGE_CLASS__PROVISIONER:
				setProvisioner((String)newValue);
				return;
			case StoragePackage.STORAGE_CLASS__RECLAIM_POLICY:
				setReclaimPolicy((String)newValue);
				return;
			case StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE:
				setVolumeBindingMode((String)newValue);
				return;
			case StoragePackage.STORAGE_CLASS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case StoragePackage.STORAGE_CLASS__PROVISIONER:
				setProvisioner(PROVISIONER_EDEFAULT);
				return;
			case StoragePackage.STORAGE_CLASS__RECLAIM_POLICY:
				setReclaimPolicy(RECLAIM_POLICY_EDEFAULT);
				return;
			case StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE:
				setVolumeBindingMode(VOLUME_BINDING_MODE_EDEFAULT);
				return;
			case StoragePackage.STORAGE_CLASS__PARAMETERS:
				getParameters().clear();
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
			case StoragePackage.STORAGE_CLASS__PROVISIONER:
				return PROVISIONER_EDEFAULT == null ? getProvisioner() != null : !PROVISIONER_EDEFAULT.equals(getProvisioner());
			case StoragePackage.STORAGE_CLASS__RECLAIM_POLICY:
				return RECLAIM_POLICY_EDEFAULT == null ? getReclaimPolicy() != null : !RECLAIM_POLICY_EDEFAULT.equals(getReclaimPolicy());
			case StoragePackage.STORAGE_CLASS__VOLUME_BINDING_MODE:
				return VOLUME_BINDING_MODE_EDEFAULT == null ? getVolumeBindingMode() != null : !VOLUME_BINDING_MODE_EDEFAULT.equals(getVolumeBindingMode());
			case StoragePackage.STORAGE_CLASS__PARAMETERS:
				return !getParameters().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageClassImpl
