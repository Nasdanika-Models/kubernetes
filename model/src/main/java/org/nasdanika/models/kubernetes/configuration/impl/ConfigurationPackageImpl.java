/**
 */
package org.nasdanika.models.kubernetes.configuration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.kubernetes.KubernetesPackage;

import org.nasdanika.models.kubernetes.configuration.ConfigMap;
import org.nasdanika.models.kubernetes.configuration.ConfigurationFactory;
import org.nasdanika.models.kubernetes.configuration.ConfigurationPackage;
import org.nasdanika.models.kubernetes.configuration.Secret;

import org.nasdanika.models.kubernetes.impl.KubernetesPackageImpl;

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
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretEClass = null;

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
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = registeredConfigurationPackage instanceof ConfigurationPackageImpl ? (ConfigurationPackageImpl)registeredConfigurationPackage : new ConfigurationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KubernetesPackage.eNS_URI);
		KubernetesPackageImpl theKubernetesPackage = (KubernetesPackageImpl)(registeredPackage instanceof KubernetesPackageImpl ? registeredPackage : KubernetesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkloadsPackage.eNS_URI);
		WorkloadsPackageImpl theWorkloadsPackage = (WorkloadsPackageImpl)(registeredPackage instanceof WorkloadsPackageImpl ? registeredPackage : WorkloadsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theKubernetesPackage.createPackageContents();
		theWorkloadsPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theStoragePackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theKubernetesPackage.initializePackageContents();
		theWorkloadsPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigMap() {
		return configMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigMap_Data() {
		return (EReference)configMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecret() {
		return secretEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecret_Type() {
		return (EAttribute)secretEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecret_Data() {
		return (EReference)secretEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		configMapEClass = createEClass(CONFIG_MAP);
		createEReference(configMapEClass, CONFIG_MAP__DATA);

		secretEClass = createEClass(SECRET);
		createEAttribute(secretEClass, SECRET__TYPE);
		createEReference(secretEClass, SECRET__DATA);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configMapEClass.getESuperTypes().add(theKubernetesPackage.getResource());
		secretEClass.getESuperTypes().add(theKubernetesPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(configMapEClass, ConfigMap.class, "ConfigMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigMap_Data(), theKubernetesPackage.getKeyValuePair(), null, "data", null, 0, -1, ConfigMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secretEClass, Secret.class, "Secret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecret_Type(), ecorePackage.getEString(), "type", null, 0, 1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecret_Data(), theKubernetesPackage.getKeyValuePair(), null, "data", null, 0, -1, Secret.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "documentation", "Configuration resources for managing application configuration and sensitive data. ConfigMaps store non-confidential data in key-value pairs. Secrets are similar but intended for confidential data."
		   });
		addAnnotation
		  (configMapEClass,
		   source,
		   new String[] {
			   "documentation", "A ConfigMap is an API object used to store non-confidential data in key-value pairs. Pods can consume ConfigMaps as environment variables, command-line arguments, or as configuration files in a volume."
		   });
		addAnnotation
		  (getConfigMap_Data(),
		   source,
		   new String[] {
			   "documentation", "Data contains the configuration data. Each key must consist of alphanumeric characters, \'-\', \'_\' or \'.\'."
		   });
		addAnnotation
		  (secretEClass,
		   source,
		   new String[] {
			   "documentation", "A Secret is an object that contains a small amount of sensitive data such as a password, a token, or a key. Using a Secret means that you don\'t need to include confidential data in your application code."
		   });
		addAnnotation
		  (getSecret_Type(),
		   source,
		   new String[] {
			   "documentation", "Used to facilitate programmatic handling of secret data. Common types include Opaque, kubernetes.io/service-account-token, kubernetes.io/tls, etc."
		   });
		addAnnotation
		  (getSecret_Data(),
		   source,
		   new String[] {
			   "documentation", "Data contains the secret data. Each key must consist of alphanumeric characters, \'-\', \'_\' or \'.\'. The values are base64 encoded."
		   });
	}

} //ConfigurationPackageImpl
