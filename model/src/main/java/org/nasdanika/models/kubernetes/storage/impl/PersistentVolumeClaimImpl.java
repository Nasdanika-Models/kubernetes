/**
 */
package org.nasdanika.models.kubernetes.storage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;
import org.nasdanika.models.kubernetes.storage.StoragePackage;

import org.nasdanika.models.kubernetes.workloads.ResourceRequirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Volume Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl#getAccessModes <em>Access Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl#getStorageClassName <em>Storage Class Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentVolumeClaimImpl extends ResourceImpl implements PersistentVolumeClaim {
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
	protected PersistentVolumeClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getAccessModes() {
		return (EList<String>)eDynamicGet(StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES, StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageClassName() {
		return (String)eDynamicGet(StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME, StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageClassName(String newStorageClassName) {
		eDynamicSet(StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME, StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME, newStorageClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRequirements getResources() {
		return (ResourceRequirements)eDynamicGet(StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES, StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourceRequirements newResources, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResources, StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(ResourceRequirements newResources) {
		eDynamicSet(StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES, StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__RESOURCES, newResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES:
				return basicSetResources(null, msgs);
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES:
				return getAccessModes();
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME:
				return getStorageClassName();
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES:
				return getResources();
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES:
				getAccessModes().clear();
				getAccessModes().addAll((Collection<? extends String>)newValue);
				return;
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME:
				setStorageClassName((String)newValue);
				return;
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES:
				setResources((ResourceRequirements)newValue);
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES:
				getAccessModes().clear();
				return;
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME:
				setStorageClassName(STORAGE_CLASS_NAME_EDEFAULT);
				return;
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES:
				setResources((ResourceRequirements)null);
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES:
				return !getAccessModes().isEmpty();
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME:
				return STORAGE_CLASS_NAME_EDEFAULT == null ? getStorageClassName() != null : !STORAGE_CLASS_NAME_EDEFAULT.equals(getStorageClassName());
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__RESOURCES:
				return getResources() != null;
		}
		return super.eIsSet(featureID);
	}

} //PersistentVolumeClaimImpl
