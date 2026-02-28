/**
 */
package org.nasdanika.models.kubernetes.storage;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PersistentVolume (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes. It is a resource in the cluster just like a node is a cluster resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getAccessModes <em>Access Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getReclaimPolicy <em>Reclaim Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getStorageClassName <em>Storage Class Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolume()
 * @model
 * @generated
 */
public interface PersistentVolume extends Resource {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the persistent volume's resources and capacity (e.g. storage: 5Gi).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolume_Capacity()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getCapacity();

	/**
	 * Returns the value of the '<em><b>Access Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access modes the volume can be mounted with. Valid values: ReadWriteOnce, ReadOnlyMany, ReadWriteMany, ReadWriteOncePod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Modes</em>' attribute list.
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolume_AccessModes()
	 * @model
	 * @generated
	 */
	EList<String> getAccessModes();

	/**
	 * Returns the value of the '<em><b>Reclaim Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens to a persistent volume when released from its claim. Valid values: Retain, Recycle, Delete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reclaim Policy</em>' attribute.
	 * @see #setReclaimPolicy(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolume_ReclaimPolicy()
	 * @model
	 * @generated
	 */
	String getReclaimPolicy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getReclaimPolicy <em>Reclaim Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclaim Policy</em>' attribute.
	 * @see #getReclaimPolicy()
	 * @generated
	 */
	void setReclaimPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Storage Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of StorageClass to which this persistent volume belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Class Name</em>' attribute.
	 * @see #setStorageClassName(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolume_StorageClassName()
	 * @model
	 * @generated
	 */
	String getStorageClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getStorageClassName <em>Storage Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Class Name</em>' attribute.
	 * @see #getStorageClassName()
	 * @generated
	 */
	void setStorageClassName(String value);

} // PersistentVolume
