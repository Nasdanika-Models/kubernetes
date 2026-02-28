/**
 */
package org.nasdanika.models.kubernetes.configuration;

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
 * Configuration resources for managing application configuration and sensitive data. ConfigMaps store non-confidential data in key-value pairs. Secrets are similar but intended for confidential data.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/kubernetes/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.kubernetes.configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.configuration.impl.ConfigMapImpl <em>Config Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigMapImpl
	 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl#getConfigMap()
	 * @generated
	 */
	int CONFIG_MAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__DATA = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.kubernetes.configuration.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.kubernetes.configuration.impl.SecretImpl
	 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__NAME = KubernetesPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__NAMESPACE = KubernetesPackage.RESOURCE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__API_VERSION = KubernetesPackage.RESOURCE__API_VERSION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__KIND = KubernetesPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__LABELS = KubernetesPackage.RESOURCE__LABELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ANNOTATIONS = KubernetesPackage.RESOURCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__TYPE = KubernetesPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__DATA = KubernetesPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = KubernetesPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = KubernetesPackage.RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.configuration.ConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Map</em>'.
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigMap
	 * @generated
	 */
	EClass getConfigMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.configuration.ConfigMap#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigMap#getData()
	 * @see #getConfigMap()
	 * @generated
	 */
	EReference getConfigMap_Data();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.kubernetes.configuration.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see org.nasdanika.models.kubernetes.configuration.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.kubernetes.configuration.Secret#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.kubernetes.configuration.Secret#getType()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.kubernetes.configuration.Secret#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.nasdanika.models.kubernetes.configuration.Secret#getData()
	 * @see #getSecret()
	 * @generated
	 */
	EReference getSecret_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.configuration.impl.ConfigMapImpl <em>Config Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigMapImpl
		 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl#getConfigMap()
		 * @generated
		 */
		EClass CONFIG_MAP = eINSTANCE.getConfigMap();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_MAP__DATA = eINSTANCE.getConfigMap_Data();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.kubernetes.configuration.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.kubernetes.configuration.impl.SecretImpl
		 * @see org.nasdanika.models.kubernetes.configuration.impl.ConfigurationPackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__TYPE = eINSTANCE.getSecret_Type();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRET__DATA = eINSTANCE.getSecret_Data();

	}

} //ConfigurationPackage
