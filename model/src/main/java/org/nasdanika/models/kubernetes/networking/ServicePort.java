/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a port on a Kubernetes Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.ServicePort#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.ServicePort#getPort <em>Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.ServicePort#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.ServicePort#getNodePort <em>Node Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.ServicePort#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort()
 * @model
 * @generated
 */
public interface ServicePort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this port within the service. This must be a DNS_LABEL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port that will be exposed by this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of the port to access on the pods targeted by the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Port</em>' attribute.
	 * @see #setTargetPort(int)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort_TargetPort()
	 * @model
	 * @generated
	 */
	int getTargetPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getTargetPort <em>Target Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' attribute.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(int value);

	/**
	 * Returns the value of the '<em><b>Node Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Port</em>' attribute.
	 * @see #setNodePort(int)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort_NodePort()
	 * @model
	 * @generated
	 */
	int getNodePort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getNodePort <em>Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Port</em>' attribute.
	 * @see #getNodePort()
	 * @generated
	 */
	void setNodePort(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP protocol for this port. Supports TCP, UDP, and SCTP. Default is TCP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getServicePort_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.ServicePort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // ServicePort
