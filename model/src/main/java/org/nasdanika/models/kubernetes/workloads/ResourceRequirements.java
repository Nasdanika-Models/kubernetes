/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.kubernetes.KeyValuePair;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the compute resource requirements for a container, including CPU and memory limits and requests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getLimits <em>Limits</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.ResourceRequirements#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getResourceRequirements()
 * @model
 * @generated
 */
public interface ResourceRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Limits</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of compute resources allowed (e.g. cpu: 500m, memory: 128Mi).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limits</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getResourceRequirements_Limits()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getLimits();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum amount of compute resources required (e.g. cpu: 250m, memory: 64Mi).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getResourceRequirements_Requests()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getRequests();

} // ResourceRequirements
