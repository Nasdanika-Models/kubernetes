/**
 */
package org.nasdanika.models.kubernetes.storage;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StorageClass provides a way for administrators to describe the 'classes' of storage they offer. Different classes might map to quality-of-service levels, or to backup policies, or to arbitrary policies determined by the cluster administrators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.StorageClass#getProvisioner <em>Provisioner</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.StorageClass#getReclaimPolicy <em>Reclaim Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.StorageClass#getVolumeBindingMode <em>Volume Binding Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.StorageClass#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getStorageClass()
 * @model
 * @generated
 */
public interface StorageClass extends Resource {
	/**
	 * Returns the value of the '<em><b>Provisioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provisioner indicates the type of the provisioner (e.g. kubernetes.io/aws-ebs, kubernetes.io/gce-pd).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provisioner</em>' attribute.
	 * @see #setProvisioner(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getStorageClass_Provisioner()
	 * @model required="true"
	 * @generated
	 */
	String getProvisioner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getProvisioner <em>Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisioner</em>' attribute.
	 * @see #getProvisioner()
	 * @generated
	 */
	void setProvisioner(String value);

	/**
	 * Returns the value of the '<em><b>Reclaim Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reclaim Policy</em>' attribute.
	 * @see #setReclaimPolicy(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getStorageClass_ReclaimPolicy()
	 * @model
	 * @generated
	 */
	String getReclaimPolicy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getReclaimPolicy <em>Reclaim Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclaim Policy</em>' attribute.
	 * @see #getReclaimPolicy()
	 * @generated
	 */
	void setReclaimPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Volume Binding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how PersistentVolumeClaims should be provisioned and bound. Valid values: Immediate, WaitForFirstConsumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Binding Mode</em>' attribute.
	 * @see #setVolumeBindingMode(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getStorageClass_VolumeBindingMode()
	 * @model
	 * @generated
	 */
	String getVolumeBindingMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getVolumeBindingMode <em>Volume Binding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Binding Mode</em>' attribute.
	 * @see #getVolumeBindingMode()
	 * @generated
	 */
	void setVolumeBindingMode(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getStorageClass_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getParameters();

} // StorageClass
