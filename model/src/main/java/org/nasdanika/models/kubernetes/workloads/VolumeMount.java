/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a volume mount within a container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getVolumeMount()
 * @model
 * @generated
 */
public interface VolumeMount extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This must match the Name of a Volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getVolumeMount_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path within the container at which the volume should be mounted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute.
	 * @see #setMountPath(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getVolumeMount_MountPath()
	 * @model required="true"
	 * @generated
	 */
	String getMountPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getMountPath <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Path</em>' attribute.
	 * @see #getMountPath()
	 * @generated
	 */
	void setMountPath(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getVolumeMount_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path within the volume from which the container's volume should be mounted. Defaults to the volume's root.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Path</em>' attribute.
	 * @see #setSubPath(String)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getVolumeMount_SubPath()
	 * @model
	 * @generated
	 */
	String getSubPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.VolumeMount#getSubPath <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Path</em>' attribute.
	 * @see #getSubPath()
	 * @generated
	 */
	void setSubPath(String value);

} // VolumeMount
