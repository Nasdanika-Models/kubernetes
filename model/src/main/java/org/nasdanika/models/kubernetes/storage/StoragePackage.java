/**
 */
package org.nasdanika.models.kubernetes.storage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.kubernetes.KubernetesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Storage resources for persistent data. Kubernetes supports many types of volumes. PersistentVolumes and PersistentVolumeClaims provide an API for users and administrators that abstracts details of how storage is provided from how it is consumed.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.kubernetes.storage.StorageFactory
 * @model kind="package"
 * @generated
 */
public interface StoragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/kubernetes/storage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.kubernetes.storage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoragePackage eINSTANCE = org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl
	 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getPersistentVolume()
	 * @generated
	 */
	int PERSISTENT_VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__CAPACITY = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__ACCESS_MODES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reclaim Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__RECLAIM_POLICY = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__STORAGE_CLASS_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl <em>Persistent Volume Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl
	 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getPersistentVolumeClaim()
	 * @generated
	 */
	int PERSISTENT_VOLUME_CLAIM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Access Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__ACCESS_MODES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Storage Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__RESOURCES = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl
	 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getStorageClass()
	 * @generated
	 */
	int STORAGE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Provisioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__PROVISIONER = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reclaim Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__RECLAIM_POLICY = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volume Binding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__VOLUME_BINDING_MODE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS__PARAMETERS = KubernetesPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CLASS_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume <em>Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Volume</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolume
	 * @generated
	 */
	EClass getPersistentVolume();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capacity</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolume#getCapacity()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EReference getPersistentVolume_Capacity();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getAccessModes <em>Access Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Modes</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolume#getAccessModes()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_AccessModes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getReclaimPolicy <em>Reclaim Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclaim Policy</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolume#getReclaimPolicy()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_ReclaimPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.PersistentVolume#getStorageClassName <em>Storage Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Class Name</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolume#getStorageClassName()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_StorageClassName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim <em>Persistent Volume Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Volume Claim</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim
	 * @generated
	 */
	EClass getPersistentVolumeClaim();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getAccessModes <em>Access Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Modes</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getAccessModes()
	 * @see #getPersistentVolumeClaim()
	 * @generated
	 */
	EAttribute getPersistentVolumeClaim_AccessModes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getStorageClassName <em>Storage Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Class Name</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getStorageClassName()
	 * @see #getPersistentVolumeClaim()
	 * @generated
	 */
	EAttribute getPersistentVolumeClaim_StorageClassName();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim#getResources()
	 * @see #getPersistentVolumeClaim()
	 * @generated
	 */
	EReference getPersistentVolumeClaim_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.storage.StorageClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.StorageClass
	 * @generated
	 */
	EClass getStorageClass();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getProvisioner <em>Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provisioner</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.StorageClass#getProvisioner()
	 * @see #getStorageClass()
	 * @generated
	 */
	EAttribute getStorageClass_Provisioner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getReclaimPolicy <em>Reclaim Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclaim Policy</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.StorageClass#getReclaimPolicy()
	 * @see #getStorageClass()
	 * @generated
	 */
	EAttribute getStorageClass_ReclaimPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getVolumeBindingMode <em>Volume Binding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Binding Mode</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.StorageClass#getVolumeBindingMode()
	 * @see #getStorageClass()
	 * @generated
	 */
	EAttribute getStorageClass_VolumeBindingMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.storage.StorageClass#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.models.kubernetes.storage.StorageClass#getParameters()
	 * @see #getStorageClass()
	 * @generated
	 */
	EReference getStorageClass_Parameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorageFactory getStorageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeImpl
		 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getPersistentVolume()
		 * @generated
		 */
		EClass PERSISTENT_VOLUME = eINSTANCE.getPersistentVolume();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENT_VOLUME__CAPACITY = eINSTANCE.getPersistentVolume_Capacity();

		/**
		 * The meta object literal for the '<em><b>Access Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__ACCESS_MODES = eINSTANCE.getPersistentVolume_AccessModes();

		/**
		 * The meta object literal for the '<em><b>Reclaim Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__RECLAIM_POLICY = eINSTANCE.getPersistentVolume_ReclaimPolicy();

		/**
		 * The meta object literal for the '<em><b>Storage Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__STORAGE_CLASS_NAME = eINSTANCE.getPersistentVolume_StorageClassName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl <em>Persistent Volume Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.storage.impl.PersistentVolumeClaimImpl
		 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getPersistentVolumeClaim()
		 * @generated
		 */
		EClass PERSISTENT_VOLUME_CLAIM = eINSTANCE.getPersistentVolumeClaim();

		/**
		 * The meta object literal for the '<em><b>Access Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME_CLAIM__ACCESS_MODES = eINSTANCE.getPersistentVolumeClaim_AccessModes();

		/**
		 * The meta object literal for the '<em><b>Storage Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME = eINSTANCE.getPersistentVolumeClaim_StorageClassName();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENT_VOLUME_CLAIM__RESOURCES = eINSTANCE.getPersistentVolumeClaim_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.storage.impl.StorageClassImpl
		 * @see org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl#getStorageClass()
		 * @generated
		 */
		EClass STORAGE_CLASS = eINSTANCE.getStorageClass();

		/**
		 * The meta object literal for the '<em><b>Provisioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CLASS__PROVISIONER = eINSTANCE.getStorageClass_Provisioner();

		/**
		 * The meta object literal for the '<em><b>Reclaim Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CLASS__RECLAIM_POLICY = eINSTANCE.getStorageClass_ReclaimPolicy();

		/**
		 * The meta object literal for the '<em><b>Volume Binding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CLASS__VOLUME_BINDING_MODE = eINSTANCE.getStorageClass_VolumeBindingMode();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CLASS__PARAMETERS = eINSTANCE.getStorageClass_Parameters();

	}

} //StoragePackage
