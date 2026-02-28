/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single application container that you want to run within a pod. Each container in a Pod has its own image, ports, environment, and resource requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getImagePullPolicy <em>Image Pull Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getEnv <em>Env</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getVolumeMounts <em>Volume Mounts</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getCommand <em>Command</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.Container#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the container. Each container in a pod must have a unique name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container image name (e.g. nginx:1.14.2, registry.example.com/my-app:latest).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Container#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #setImagePullPolicy(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_ImagePullPolicy()
	 * @model
	 * @generated
	 */
	String getImagePullPolicy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Container#getImagePullPolicy <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #getImagePullPolicy()
	 * @generated
	 */
	void setImagePullPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.ContainerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of ports to expose from the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.EnvVar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of environment variables to set in the container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvVar> getEnv();

	/**
	 * Returns the value of the '<em><b>Volume Mounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.workloads.VolumeMount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pod volumes to mount into the container's filesystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Mounts</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_VolumeMounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<VolumeMount> getVolumeMounts();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compute resource requirements for this container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourceRequirements)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Resources()
	 * @model containment="true"
	 * @generated
	 */
	ResourceRequirements getResources();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.Container#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourceRequirements value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entrypoint array. Not executed within a shell. If not provided, the container image's ENTRYPOINT is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Command()
	 * @model
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arguments to the entrypoint. If not provided, the container image's CMD is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getContainer_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

} // Container
