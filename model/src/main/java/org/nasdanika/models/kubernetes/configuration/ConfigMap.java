/**
 */
package org.nasdanika.models.kubernetes.configuration;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConfigMap is an API object used to store non-confidential data in key-value pairs. Pods can consume ConfigMaps as environment variables, command-line arguments, or as configuration files in a volume.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.configuration.ConfigMap#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#getConfigMap()
 * @model
 * @generated
 */
public interface ConfigMap extends Resource {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#getConfigMap_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getData();

} // ConfigMap
