/**
 */
package org.nasdanika.models.kubernetes.storage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.kubernetes.KubernetesPackage;

import org.nasdanika.models.kubernetes.configuration.ConfigurationPackage;

import org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl;

import org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl;

import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

import org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl;

import org.nasdanika.models.kubernetes.storage.PersistentVolume;
import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;
import org.nasdanika.models.kubernetes.storage.StorageClass;
import org.nasdanika.models.kubernetes.storage.StorageFactory;
import org.nasdanika.models.kubernetes.storage.StoragePackage;

import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

import org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoragePackageImpl extends EPackageImpl implements StoragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentVolumeClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageClassEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.kubernetes.storage.StoragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StoragePackageImpl() {
		super(eNS_URI, StorageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StoragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StoragePackage init() {
		if (isInited) return (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStoragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StoragePackageImpl theStoragePackage = registeredStoragePackage instanceof StoragePackageImpl ? (StoragePackageImpl)registeredStoragePackage : new StoragePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = (KubernetesPackageImpl)(registeredPackage instanceof KubernetesPackageImpl ? registeredPackage : KubernetesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);
		WorkloadsPackageImpl theWorkloadsPackage = (WorkloadsPackageImpl)(registeredPackage instanceof WorkloadsPackageImpl ? registeredPackage : WorkloadsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(registeredPackage instanceof ConfigurationPackageImpl ? registeredPackage : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theStoragePackage.createPackageContents();
		theKubernetesPackage.createPackageContents();
		theWorkloadsPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theStoragePackage.initializePackageContents();
		theKubernetesPackage.initializePackageContents();
		theWorkloadsPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStoragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StoragePackage.eNS_URI, theStoragePackage);
		return theStoragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistentVolume() {
		return persistentVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistentVolume_Capacity() {
		return (EReference)persistentVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistentVolume_AccessModes() {
		return (EAttribute)persistentVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistentVolume_ReclaimPolicy() {
		return (EAttribute)persistentVolumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistentVolume_StorageClassName() {
		return (EAttribute)persistentVolumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistentVolumeClaim() {
		return persistentVolumeClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistentVolumeClaim_AccessModes() {
		return (EAttribute)persistentVolumeClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersistentVolumeClaim_StorageClassName() {
		return (EAttribute)persistentVolumeClaimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistentVolumeClaim_Resources() {
		return (EReference)persistentVolumeClaimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageClass() {
		return storageClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageClass_Provisioner() {
		return (EAttribute)storageClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageClass_ReclaimPolicy() {
		return (EAttribute)storageClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageClass_VolumeBindingMode() {
		return (EAttribute)storageClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageClass_Parameters() {
		return (EReference)storageClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFactory getStorageFactory() {
		return (StorageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		persistentVolumeEClass = createEClass(PERSISTENT_VOLUME);
		createEReference(persistentVolumeEClass, PERSISTENT_VOLUME__CAPACITY);
		createEAttribute(persistentVolumeEClass, PERSISTENT_VOLUME__ACCESS_MODES);
		createEAttribute(persistentVolumeEClass, PERSISTENT_VOLUME__RECLAIM_POLICY);
		createEAttribute(persistentVolumeEClass, PERSISTENT_VOLUME__STORAGE_CLASS_NAME);

		persistentVolumeClaimEClass = createEClass(PERSISTENT_VOLUME_CLAIM);
		createEAttribute(persistentVolumeClaimEClass, PERSISTENT_VOLUME_CLAIM__ACCESS_MODES);
		createEAttribute(persistentVolumeClaimEClass, PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME);
		createEReference(persistentVolumeClaimEClass, PERSISTENT_VOLUME_CLAIM__RESOURCES);

		storageClassEClass = createEClass(STORAGE_CLASS);
		createEAttribute(storageClassEClass, STORAGE_CLASS__PROVISIONER);
		createEAttribute(storageClassEClass, STORAGE_CLASS__RECLAIM_POLICY);
		createEAttribute(storageClassEClass, STORAGE_CLASS__VOLUME_BINDING_MODE);
		createEReference(storageClassEClass, STORAGE_CLASS__PARAMETERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KubernetesPackage theKubernetesPackage = (KubernetesPackage)EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);
		WorkloadsPackage theWorkloadsPackage = (WorkloadsPackage)EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		persistentVolumeEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		persistentVolumeClaimEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		storageClassEClass.getESuperTypes().add(theKubernetesPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(persistentVolumeEClass, PersistentVolume.class, "PersistentVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistentVolume_Capacity(), theKubernetesPackage.getKeyValuePair(), null, "capacity", null, 0, -1, PersistentVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentVolume_AccessModes(), ecorePackage.getEString(), "accessModes", null, 0, -1, PersistentVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentVolume_ReclaimPolicy(), ecorePackage.getEString(), "reclaimPolicy", null, 0, 1, PersistentVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentVolume_StorageClassName(), ecorePackage.getEString(), "storageClassName", null, 0, 1, PersistentVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistentVolumeClaimEClass, PersistentVolumeClaim.class, "PersistentVolumeClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistentVolumeClaim_AccessModes(), ecorePackage.getEString(), "accessModes", null, 0, -1, PersistentVolumeClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistentVolumeClaim_StorageClassName(), ecorePackage.getEString(), "storageClassName", null, 0, 1, PersistentVolumeClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistentVolumeClaim_Resources(), theWorkloadsPackage.getResourceRequirements(), null, "resources", null, 0, 1, PersistentVolumeClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageClassEClass, StorageClass.class, "StorageClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageClass_Provisioner(), ecorePackage.getEString(), "provisioner", null, 1, 1, StorageClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageClass_ReclaimPolicy(), ecorePackage.getEString(), "reclaimPolicy", null, 0, 1, StorageClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageClass_VolumeBindingMode(), ecorePackage.getEString(), "volumeBindingMode", null, 0, 1, StorageClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStorageClass_Parameters(), theKubernetesPackage.getKeyValuePair(), null, "parameters", null, 0, -1, StorageClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Storage resources for persistent data. Kubernetes supports many types of volumes. PersistentVolumes and PersistentVolumeClaims provide an API for users and administrators that abstracts details of how storage is provided from how it is consumed."
		   });
		addAnnotation
		  (persistentVolumeEClass,
		   source,
		   new String[] {
			   "documentation", "A PersistentVolume (PV) is a piece of storage in the cluster that has been provisioned by an administrator or dynamically provisioned using Storage Classes. It is a resource in the cluster just like a node is a cluster resource."
		   });
		addAnnotation
		  (getPersistentVolume_Capacity(),
		   source,
		   new String[] {
			   "documentation", "A description of the persistent volume\'s resources and capacity (e.g. storage: 5Gi)."
		   });
		addAnnotation
		  (getPersistentVolume_AccessModes(),
		   source,
		   new String[] {
			   "documentation", "Access modes the volume can be mounted with. Valid values: ReadWriteOnce, ReadOnlyMany, ReadWriteMany, ReadWriteOncePod."
		   });
		addAnnotation
		  (getPersistentVolume_ReclaimPolicy(),
		   source,
		   new String[] {
			   "documentation", "What happens to a persistent volume when released from its claim. Valid values: Retain, Recycle, Delete."
		   });
		addAnnotation
		  (getPersistentVolume_StorageClassName(),
		   source,
		   new String[] {
			   "documentation", "Name of StorageClass to which this persistent volume belongs."
		   });
		addAnnotation
		  (persistentVolumeClaimEClass,
		   source,
		   new String[] {
			   "documentation", "A PersistentVolumeClaim (PVC) is a request for storage by a user. It is similar to a Pod. Pods consume node resources and PVCs consume PV resources. Claims can request specific size and access modes."
		   });
		addAnnotation
		  (getPersistentVolumeClaim_AccessModes(),
		   source,
		   new String[] {
			   "documentation", "The desired access modes the volume should have (e.g. ReadWriteOnce)."
		   });
		addAnnotation
		  (getPersistentVolumeClaim_StorageClassName(),
		   source,
		   new String[] {
			   "documentation", "Name of the StorageClass required by the claim."
		   });
		addAnnotation
		  (getPersistentVolumeClaim_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources represents the minimum resources the volume should have (e.g. storage: 8Gi)."
		   });
		addAnnotation
		  (storageClassEClass,
		   source,
		   new String[] {
			   "documentation", "A StorageClass provides a way for administrators to describe the \'classes\' of storage they offer. Different classes might map to quality-of-service levels, or to backup policies, or to arbitrary policies determined by the cluster administrators."
		   });
		addAnnotation
		  (getStorageClass_Provisioner(),
		   source,
		   new String[] {
			   "documentation", "Provisioner indicates the type of the provisioner (e.g. kubernetes.io/aws-ebs, kubernetes.io/gce-pd)."
		   });
		addAnnotation
		  (getStorageClass_ReclaimPolicy(),
		   source,
		   new String[] {
			   "documentation", "Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete."
		   });
		addAnnotation
		  (getStorageClass_VolumeBindingMode(),
		   source,
		   new String[] {
			   "documentation", "Indicates how PersistentVolumeClaims should be provisioned and bound. Valid values: Immediate, WaitForFirstConsumer."
		   });
		addAnnotation
		  (getStorageClass_Parameters(),
		   source,
		   new String[] {
			   "documentation", "Parameters holds the parameters for the provisioner that should create volumes of this storage class."
		   });
	}

} //StoragePackageImpl
