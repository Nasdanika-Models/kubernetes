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

import org.nasdanika.models.kubernetes.storage.PersistentVolume;
import org.nasdanika.models.kubernetes.storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl#getAccessModes <em>Access Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl#getReclaimPolicy <em>Reclaim Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl#getStorageClassName <em>Storage Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentVolumeImpl extends ResourceImpl implements PersistentVolume {
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
	 * The default value of the '{@link #getStorageClassName() <em>Storage Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_CLASS_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.PERSISTENT_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getCapacity() {
		return (EList<KeyValuePair>)eDynamicGet(StoragePackage.PERSISTENT_VOLUME__CAPACITY, StoragePackage.Literals.PERSISTENT_VOLUME__CAPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getAccessModes() {
		return (EList<String>)eDynamicGet(StoragePackage.PERSISTENT_VOLUME__ACCESS_MODES, StoragePackage.Literals.PERSISTENT_VOLUME__ACCESS_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReclaimPolicy() {
		return (String)eDynamicGet(StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY, StoragePackage.Literals.PERSISTENT_VOLUME__RECLAIM_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReclaimPolicy(String newReclaimPolicy) {
		eDynamicSet(StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY, StoragePackage.Literals.PERSISTENT_VOLUME__RECLAIM_POLICY, newReclaimPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageClassName() {
		return (String)eDynamicGet(StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME, StoragePackage.Literals.PERSISTENT_VOLUME__STORAGE_CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageClassName(String newStorageClassName) {
		eDynamicSet(StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME, StoragePackage.Literals.PERSISTENT_VOLUME__STORAGE_CLASS_NAME, newStorageClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StoragePackage.PERSISTENT_VOLUME__CAPACITY:
				return ((InternalEList<?>)getCapacity()).basicRemove(otherEnd, msgs);
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
			case StoragePackage.PERSISTENT_VOLUME__CAPACITY:
				return getCapacity();
			case StoragePackage.PERSISTENT_VOLUME__ACCESS_MODES:
				return getAccessModes();
			case StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY:
				return getReclaimPolicy();
			case StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME:
				return getStorageClassName();
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
			case StoragePackage.PERSISTENT_VOLUME__CAPACITY:
				getCapacity().clear();
				getCapacity().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case StoragePackage.PERSISTENT_VOLUME__ACCESS_MODES:
				getAccessModes().clear();
				getAccessModes().addAll((Collection<? extends String>)newValue);
				return;
			case StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY:
				setReclaimPolicy((String)newValue);
				return;
			case StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME:
				setStorageClassName((String)newValue);
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
			case StoragePackage.PERSISTENT_VOLUME__CAPACITY:
				getCapacity().clear();
				return;
			case StoragePackage.PERSISTENT_VOLUME__ACCESS_MODES:
				getAccessModes().clear();
				return;
			case StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY:
				setReclaimPolicy(RECLAIM_POLICY_EDEFAULT);
				return;
			case StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME:
				setStorageClassName(STORAGE_CLASS_NAME_EDEFAULT);
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
			case StoragePackage.PERSISTENT_VOLUME__CAPACITY:
				return !getCapacity().isEmpty();
			case StoragePackage.PERSISTENT_VOLUME__ACCESS_MODES:
				return !getAccessModes().isEmpty();
			case StoragePackage.PERSISTENT_VOLUME__RECLAIM_POLICY:
				return RECLAIM_POLICY_EDEFAULT == null ? getReclaimPolicy() != null : !RECLAIM_POLICY_EDEFAULT.equals(getReclaimPolicy());
			case StoragePackage.PERSISTENT_VOLUME__STORAGE_CLASS_NAME:
				return STORAGE_CLASS_NAME_EDEFAULT == null ? getStorageClassName() != null : !STORAGE_CLASS_NAME_EDEFAULT.equals(getStorageClassName());
		}
		return super.eIsSet(featureID);
	}

} //PersistentVolumeImpl
