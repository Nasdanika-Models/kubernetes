/**
 */
package org.nasdanika.models.kubernetes.configuration;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Secret is an object that contains a small amount of sensitive data such as a password, a token, or a key. Using a Secret means that you don't need to include confidential data in your application code.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.configuration.Secret#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.configuration.Secret#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#getSecret()
 * @model
 * @generated
 */
public interface Secret extends Resource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to facilitate programmatic handling of secret data. Common types include Opaque, kubernetes.io/service-account-token, kubernetes.io/tls, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#getSecret_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.configuration.Secret#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The values are base64 encoded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.configuration.ConfigurationPackage#getSecret_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getData();

} // Secret
