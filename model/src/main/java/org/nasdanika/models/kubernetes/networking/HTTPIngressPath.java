/**
 */
package org.nasdanika.models.kubernetes.networking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Ingress Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates a path with a backend. Incoming URLs matching the path are forwarded to the backend.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPathType <em>Path Type</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServicePort <em>Service Port</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getHTTPIngressPath()
 * @model
 * @generated
 */
public interface HTTPIngressPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path is matched against the path of an incoming request (e.g. /testpath).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getHTTPIngressPath_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Path Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PathType determines the interpretation of the Path matching. Valid values: Exact, Prefix, ImplementationSpecific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Type</em>' attribute.
	 * @see #setPathType(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getHTTPIngressPath_PathType()
	 * @model required="true"
	 * @generated
	 */
	String getPathType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getPathType <em>Path Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Type</em>' attribute.
	 * @see #getPathType()
	 * @generated
	 */
	void setPathType(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the referenced service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getHTTPIngressPath_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port of the referenced service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Port</em>' attribute.
	 * @see #setServicePort(int)
	 * @see org.nasdanika.models.kubernetes.networking.NetworkingPackage#getHTTPIngressPath_ServicePort()
	 * @model required="true"
	 * @generated
	 */
	int getServicePort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.networking.HTTPIngressPath#getServicePort <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Port</em>' attribute.
	 * @see #getServicePort()
	 * @generated
	 */
	void setServicePort(int value);

} // HTTPIngressPath
