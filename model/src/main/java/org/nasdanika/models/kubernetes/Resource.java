/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for all Kubernetes API resources. Corresponds to the common fields in Kubernetes object metadata.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Resource#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name must be unique within a namespace. Is required when creating resources. Name is primarily intended for creation idempotence and configuration definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namespace defines the space within which each name must be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Resource#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * APIVersion defines the versioned schema of this representation of an object (e.g. apps/v1, v1, batch/v1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_ApiVersion()
	 * @model
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Resource#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind is a string value representing the REST resource this object represents (e.g. Deployment, Service, Pod).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Resource#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Map of string keys and values that can be used to organize and categorize objects. Matches selectors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getLabels();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotations is an unstructured key-value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getResource_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getAnnotations();

} // Resource
