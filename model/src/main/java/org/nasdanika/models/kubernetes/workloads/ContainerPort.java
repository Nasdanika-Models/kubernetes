/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a network port in a single container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainerPort()
 * @model
 * @generated
 */
public interface ContainerPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If specified, this must be an IANA_SVC_NAME and unique within the pod.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainerPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of port to expose on the pod's IP address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Port</em>' attribute.
	 * @see #setContainerPort(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainerPort_ContainerPort()
	 * @model required="true"
	 * @generated
	 */
	int getContainerPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getContainerPort <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Port</em>' attribute.
	 * @see #getContainerPort()
	 * @generated
	 */
	void setContainerPort(int value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of port to expose on the host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(int)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainerPort_HostPort()
	 * @model
	 * @generated
	 */
	int getHostPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to TCP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainerPort_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.ContainerPort#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // ContainerPort
