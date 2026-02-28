/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A label selector is a label query over a set of resources. Used by controllers and services to select pods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.LabelSelector#getMatchLabels <em>Match Labels</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getLabelSelector()
 * @model
 * @generated
 */
public interface LabelSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A map of key-value pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions whose key field is the key, the operator is In, and the values array contains only the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Labels</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getLabelSelector_MatchLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getMatchLabels();

} // LabelSelector
