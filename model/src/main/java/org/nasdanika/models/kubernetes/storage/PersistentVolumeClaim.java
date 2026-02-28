/**
 */
package org.nasdanika.models.kubernetes.storage;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.Resource;

import org.nasdanika.models.kubernetes.workloads.ResourceRequirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Volume Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PersistentVolumeClaim (PVC) is a request for storage by a user. It is similar to a Pod. Pods consume node resources and PVCs consume PV resources. Claims can request specific size and access modes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getAccessModes <em>Access Modes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getStorageClassName <em>Storage Class Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolumeClaim()
 * @model
 * @generated
 */
public interface PersistentVolumeClaim extends Resource {
	/**
	 * Returns the value of the '<em><b>Access Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired access modes the volume should have (e.g. ReadWriteOnce).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Modes</em>' attribute list.
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolumeClaim_AccessModes()
	 * @model
	 * @generated
	 */
	EList<String> getAccessModes();

	/**
	 * Returns the value of the '<em><b>Storage Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the StorageClass required by the claim.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Class Name</em>' attribute.
	 * @see #setStorageClassName(String)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolumeClaim_StorageClassName()
	 * @model
	 * @generated
	 */
	String getStorageClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getStorageClassName <em>Storage Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Class Name</em>' attribute.
	 * @see #getStorageClassName()
	 * @generated
	 */
	void setStorageClassName(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources represents the minimum resources the volume should have (e.g. storage: 8Gi).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourceRequirements)
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#getPersistentVolumeClaim_Resources()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRequirements getResources();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourceRequirements value);

} // PersistentVolumeClaim
