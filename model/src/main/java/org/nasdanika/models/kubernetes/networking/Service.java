/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Service is an abstract way to expose an application running on a set of Pods as a network service. With Kubernetes you don't need to modify your application to use an unfamiliar service discovery mechanism.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Service#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Service#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Service#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Service#getClusterIP <em>Cluster IP</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.Service#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Resource {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Route service traffic to pods with label keys and values matching this selector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService_Selector()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getSelector();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.networking.ServicePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of ports that are exposed by this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServicePort> getPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.Service#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Cluster IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClusterIP is the IP address of the service. It is usually assigned randomly. Set to 'None' for headless services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cluster IP</em>' attribute.
	 * @see #setClusterIP(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService_ClusterIP()
	 * @model
	 * @generated
	 */
	String getClusterIP();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.Service#getClusterIP <em>Cluster IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster IP</em>' attribute.
	 * @see #getClusterIP()
	 * @generated
	 */
	void setClusterIP(String value);

	/**
	 * Returns the value of the '<em><b>External Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The external reference that discovery mechanisms will return as an alias for this service (e.g. a DNS CNAME record). Only applies to ExternalName type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Name</em>' attribute.
	 * @see #setExternalName(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getService_ExternalName()
	 * @model
	 * @generated
	 */
	String getExternalName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.Service#getExternalName <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Name</em>' attribute.
	 * @see #getExternalName()
	 * @generated
	 */
	void setExternalName(String value);

} // Service
