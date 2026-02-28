/**
 */
package org.nasdanika.models.kubernetes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.kubernetes.Cluster;
import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.KubernetesFactory;
import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Namespace;
import org.nasdanika.models.kubernetes.Node;
import org.nasdanika.models.kubernetes.Resource;
import org.nasdanika.models.kubernetes.Taint;

import org.nasdanika.models.kubernetes.configuration.ConfigurationPackage;

import org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl;

import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

import org.nasdanika.models.kubernetes.networking.impl.NetworkingPackageImpl;

import org.nasdanika.models.kubernetes.storage.StoragePackage;

import org.nasdanika.models.kubernetes.storage.impl.StoragePackageImpl;

import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

import org.nasdanika.models.kubernetes.workloads.impl.WorkloadsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KubernetesPackageImpl extends EPackageImpl implements KubernetesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taintEClass = null;

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
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KubernetesPackageImpl() {
		super(eNS_URI, KubernetesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KubernetesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KubernetesPackage init() {
		if (isInited) return (KubernetesPackage)EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKubernetesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = registeredKubernetesPackage instanceof KubernetesPackageImpl ? (KubernetesPackageImpl)registeredKubernetesPackage : new KubernetesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);
		WorkloadsPackageImpl theWorkloadsPackage = (WorkloadsPackageImpl)(registeredPackage instanceof WorkloadsPackageImpl ? registeredPackage : WorkloadsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(registeredPackage instanceof ConfigurationPackageImpl ? registeredPackage : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theKubernetesPackage.createPackageContents();
		theWorkloadsPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theKubernetesPackage.initializePackageContents();
		theWorkloadsPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKubernetesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KubernetesPackage.eNS_URI, theKubernetesPackage);
		return theKubernetesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValuePair_Key() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValuePair_Value() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelSelector() {
		return labelSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelSelector_MatchLabels() {
		return (EReference)labelSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Namespace() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ApiVersion() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Kind() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Labels() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Annotations() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_Namespaces() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_Nodes() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_PersistentVolumes() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCluster_StorageClasses() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Deployments() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_StatefulSets() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_DaemonSets() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_ReplicaSets() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Pods() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Services() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Ingresses() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_ConfigMaps() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Secrets() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Jobs() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_CronJobs() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_PersistentVolumeClaims() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_PodCIDR() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Unschedulable() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Taints() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaint() {
		return taintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaint_Key() {
		return (EAttribute)taintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaint_Value() {
		return (EAttribute)taintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaint_Effect() {
		return (EAttribute)taintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesFactory getKubernetesFactory() {
		return (KubernetesFactory)getEFactoryInstance();
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
		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		labelSelectorEClass = createEClass(LABEL_SELECTOR);
		createEReference(labelSelectorEClass, LABEL_SELECTOR__MATCH_LABELS);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__NAMESPACE);
		createEAttribute(resourceEClass, RESOURCE__API_VERSION);
		createEAttribute(resourceEClass, RESOURCE__KIND);
		createEReference(resourceEClass, RESOURCE__LABELS);
		createEReference(resourceEClass, RESOURCE__ANNOTATIONS);

		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__NAMESPACES);
		createEReference(clusterEClass, CLUSTER__NODES);
		createEReference(clusterEClass, CLUSTER__PERSISTENT_VOLUMES);
		createEReference(clusterEClass, CLUSTER__STORAGE_CLASSES);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__DEPLOYMENTS);
		createEReference(namespaceEClass, NAMESPACE__STATEFUL_SETS);
		createEReference(namespaceEClass, NAMESPACE__DAEMON_SETS);
		createEReference(namespaceEClass, NAMESPACE__REPLICA_SETS);
		createEReference(namespaceEClass, NAMESPACE__PODS);
		createEReference(namespaceEClass, NAMESPACE__SERVICES);
		createEReference(namespaceEClass, NAMESPACE__INGRESSES);
		createEReference(namespaceEClass, NAMESPACE__CONFIG_MAPS);
		createEReference(namespaceEClass, NAMESPACE__SECRETS);
		createEReference(namespaceEClass, NAMESPACE__JOBS);
		createEReference(namespaceEClass, NAMESPACE__CRON_JOBS);
		createEReference(namespaceEClass, NAMESPACE__PERSISTENT_VOLUME_CLAIMS);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__POD_CIDR);
		createEAttribute(nodeEClass, NODE__UNSCHEDULABLE);
		createEReference(nodeEClass, NODE__TAINTS);

		taintEClass = createEClass(TAINT);
		createEAttribute(taintEClass, TAINT__KEY);
		createEAttribute(taintEClass, TAINT__VALUE);
		createEAttribute(taintEClass, TAINT__EFFECT);
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
		WorkloadsPackage theWorkloadsPackage = (WorkloadsPackage)EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);
		NetworkingPackage theNetworkingPackage = (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		StoragePackage theStoragePackage = (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theWorkloadsPackage);
		getESubpackages().add(theNetworkingPackage);
		getESubpackages().add(theStoragePackage);
		getESubpackages().add(theConfigurationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clusterEClass.getESuperTypes().add(this.getResource());
		namespaceEClass.getESuperTypes().add(this.getResource());
		nodeEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(keyValuePairEClass, KeyValuePair.class, "KeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 1, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, KeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelSelectorEClass, LabelSelector.class, "LabelSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelSelector_MatchLabels(), this.getKeyValuePair(), null, "matchLabels", null, 0, -1, LabelSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ApiVersion(), ecorePackage.getEString(), "apiVersion", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Labels(), this.getKeyValuePair(), null, "labels", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Annotations(), this.getKeyValuePair(), null, "annotations", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_PersistentVolumes(), theStoragePackage.getPersistentVolume(), null, "persistentVolumes", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_StorageClasses(), theStoragePackage.getStorageClass(), null, "storageClasses", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_Deployments(), theWorkloadsPackage.getDeployment(), null, "deployments", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_StatefulSets(), theWorkloadsPackage.getStatefulSet(), null, "statefulSets", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_DaemonSets(), theWorkloadsPackage.getDaemonSet(), null, "daemonSets", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_ReplicaSets(), theWorkloadsPackage.getReplicaSet(), null, "replicaSets", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Pods(), theWorkloadsPackage.getPod(), null, "pods", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Services(), theNetworkingPackage.getService(), null, "services", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Ingresses(), theNetworkingPackage.getIngress(), null, "ingresses", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_ConfigMaps(), theConfigurationPackage.getConfigMap(), null, "configMaps", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Secrets(), theConfigurationPackage.getSecret(), null, "secrets", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Jobs(), theWorkloadsPackage.getJob(), null, "jobs", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_CronJobs(), theWorkloadsPackage.getCronJob(), null, "cronJobs", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_PersistentVolumeClaims(), theStoragePackage.getPersistentVolumeClaim(), null, "persistentVolumeClaims", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_PodCIDR(), ecorePackage.getEString(), "podCIDR", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Unschedulable(), ecorePackage.getEBoolean(), "unschedulable", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Taints(), this.getTaint(), null, "taints", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taintEClass, Taint.class, "Taint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaint_Key(), ecorePackage.getEString(), "key", null, 1, 1, Taint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaint_Value(), ecorePackage.getEString(), "value", null, 0, 1, Taint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaint_Effect(), ecorePackage.getEString(), "effect", null, 1, 1, Taint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

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
			   "documentation", "Ecore model for Kubernetes concepts. Supports creating models of Kubernetes solutions (deployments, services, etc.) and loading information about Kubernetes clusters for reporting, analysis, and generation of recommendations."
		   });
		addAnnotation
		  (keyValuePairEClass,
		   source,
		   new String[] {
			   "documentation", "A generic key-value pair used for labels, annotations, selectors, environment variables, and data maps."
		   });
		addAnnotation
		  (getKeyValuePair_Key(),
		   source,
		   new String[] {
			   "documentation", "The key of the pair."
		   });
		addAnnotation
		  (getKeyValuePair_Value(),
		   source,
		   new String[] {
			   "documentation", "The value of the pair."
		   });
		addAnnotation
		  (labelSelectorEClass,
		   source,
		   new String[] {
			   "documentation", "A label selector is a label query over a set of resources. Used by controllers and services to select pods."
		   });
		addAnnotation
		  (getLabelSelector_MatchLabels(),
		   source,
		   new String[] {
			   "documentation", "A map of key-value pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions whose key field is the key, the operator is In, and the values array contains only the value."
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for all Kubernetes API resources. Corresponds to the common fields in Kubernetes object metadata."
		   });
		addAnnotation
		  (getResource_Name(),
		   source,
		   new String[] {
			   "documentation", "Name must be unique within a namespace. Is required when creating resources. Name is primarily intended for creation idempotence and configuration definition."
		   });
		addAnnotation
		  (getResource_Namespace(),
		   source,
		   new String[] {
			   "documentation", "Namespace defines the space within which each name must be unique."
		   });
		addAnnotation
		  (getResource_ApiVersion(),
		   source,
		   new String[] {
			   "documentation", "APIVersion defines the versioned schema of this representation of an object (e.g. apps/v1, v1, batch/v1)."
		   });
		addAnnotation
		  (getResource_Kind(),
		   source,
		   new String[] {
			   "documentation", "Kind is a string value representing the REST resource this object represents (e.g. Deployment, Service, Pod)."
		   });
		addAnnotation
		  (getResource_Labels(),
		   source,
		   new String[] {
			   "documentation", "Map of string keys and values that can be used to organize and categorize objects. Matches selectors."
		   });
		addAnnotation
		  (getResource_Annotations(),
		   source,
		   new String[] {
			   "documentation", "Annotations is an unstructured key-value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata."
		   });
		addAnnotation
		  (clusterEClass,
		   source,
		   new String[] {
			   "documentation", "A Kubernetes cluster is a set of nodes that run containerized applications. The cluster is the top-level resource containing namespaces, nodes, and cluster-scoped resources."
		   });
		addAnnotation
		  (getCluster_Namespaces(),
		   source,
		   new String[] {
			   "documentation", "Namespaces in this cluster."
		   });
		addAnnotation
		  (getCluster_Nodes(),
		   source,
		   new String[] {
			   "documentation", "Worker nodes in this cluster."
		   });
		addAnnotation
		  (getCluster_PersistentVolumes(),
		   source,
		   new String[] {
			   "documentation", "Cluster-scoped persistent volumes."
		   });
		addAnnotation
		  (getCluster_StorageClasses(),
		   source,
		   new String[] {
			   "documentation", "Storage classes available in this cluster."
		   });
		addAnnotation
		  (namespaceEClass,
		   source,
		   new String[] {
			   "documentation", "Namespaces provide a mechanism for isolating groups of resources within a single cluster. Names of resources need to be unique within a namespace, but not across namespaces."
		   });
		addAnnotation
		  (getNamespace_Deployments(),
		   source,
		   new String[] {
			   "documentation", "Deployments in this namespace."
		   });
		addAnnotation
		  (getNamespace_StatefulSets(),
		   source,
		   new String[] {
			   "documentation", "StatefulSets in this namespace."
		   });
		addAnnotation
		  (getNamespace_DaemonSets(),
		   source,
		   new String[] {
			   "documentation", "DaemonSets in this namespace."
		   });
		addAnnotation
		  (getNamespace_ReplicaSets(),
		   source,
		   new String[] {
			   "documentation", "ReplicaSets in this namespace."
		   });
		addAnnotation
		  (getNamespace_Pods(),
		   source,
		   new String[] {
			   "documentation", "Pods in this namespace."
		   });
		addAnnotation
		  (getNamespace_Services(),
		   source,
		   new String[] {
			   "documentation", "Services in this namespace."
		   });
		addAnnotation
		  (getNamespace_Ingresses(),
		   source,
		   new String[] {
			   "documentation", "Ingress resources in this namespace."
		   });
		addAnnotation
		  (getNamespace_ConfigMaps(),
		   source,
		   new String[] {
			   "documentation", "ConfigMaps in this namespace."
		   });
		addAnnotation
		  (getNamespace_Secrets(),
		   source,
		   new String[] {
			   "documentation", "Secrets in this namespace."
		   });
		addAnnotation
		  (getNamespace_Jobs(),
		   source,
		   new String[] {
			   "documentation", "Jobs in this namespace."
		   });
		addAnnotation
		  (getNamespace_CronJobs(),
		   source,
		   new String[] {
			   "documentation", "CronJobs in this namespace."
		   });
		addAnnotation
		  (getNamespace_PersistentVolumeClaims(),
		   source,
		   new String[] {
			   "documentation", "PersistentVolumeClaims in this namespace."
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "documentation", "A Node is a worker machine in Kubernetes - either a VM or a physical machine, depending on the cluster. Each node contains the services necessary to run Pods and is managed by the control plane."
		   });
		addAnnotation
		  (getNode_PodCIDR(),
		   source,
		   new String[] {
			   "documentation", "PodCIDR represents the pod IP range assigned to the node."
		   });
		addAnnotation
		  (getNode_Unschedulable(),
		   source,
		   new String[] {
			   "documentation", "Unschedulable controls node schedulability of new pods. By default, node is schedulable."
		   });
		addAnnotation
		  (getNode_Taints(),
		   source,
		   new String[] {
			   "documentation", "Taints applied to the node. Taints allow a node to repel a set of pods."
		   });
		addAnnotation
		  (taintEClass,
		   source,
		   new String[] {
			   "documentation", "A taint allows a node to repel a set of pods. Taints and tolerations work together to ensure that pods are not scheduled onto inappropriate nodes."
		   });
		addAnnotation
		  (getTaint_Key(),
		   source,
		   new String[] {
			   "documentation", "The taint key to be applied to a node."
		   });
		addAnnotation
		  (getTaint_Value(),
		   source,
		   new String[] {
			   "documentation", "The taint value corresponding to the taint key."
		   });
		addAnnotation
		  (getTaint_Effect(),
		   source,
		   new String[] {
			   "documentation", "The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule, and NoExecute."
		   });
	}

} //KubernetesPackageImpl
