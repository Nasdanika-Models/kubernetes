/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.IngressRule#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.IngressRule#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngressRule()
 * @model
 * @generated
 */
public interface IngressRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Host is the fully qualified domain name of a network host, as defined by RFC 3986.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngressRule_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.IngressRule#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of paths that map requests to backends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngressRule_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTTPIngressPath> getPaths();

} // IngressRule
