/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ingress exposes HTTP and HTTPS routes from outside the cluster to services within the cluster. Traffic routing is controlled by rules defined on the Ingress resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Ingress#getRules <em>Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Ingress#getIngressClassName <em>Ingress Class Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngress()
 * @model
 * @generated
 */
public interface Ingress extends Resource {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.networking.IngressRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of host rules used to configure the Ingress.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngress_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<IngressRule> getRules();

	/**
	 * Returns the value of the '<em><b>Ingress Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingress Class Name</em>' attribute.
	 * @see #setIngressClassName(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getIngress_IngressClassName()
	 * @model
	 * @generated
	 */
	String getIngressClassName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.Ingress#getIngressClassName <em>Ingress Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingress Class Name</em>' attribute.
	 * @see #getIngressClassName()
	 * @generated
	 */
	void setIngressClassName(String value);

} // Ingress
