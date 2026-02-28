/**
 */
package org.nasdanika.models.kubernetes.workloads;

import org.nasdanika.models.kubernetes.LabelSelector;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daemon Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DaemonSet ensures that all (or some) Nodes run a copy of a Pod. As nodes are added to the cluster, Pods are added to them. As nodes are removed from the cluster, those Pods are garbage collected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDaemonSet()
 * @model
 * @generated
 */
public interface DaemonSet extends Resource {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A label query over pods that are managed by the daemon set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(LabelSelector)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDaemonSet_Selector()
	 * @model containment="true"
	 * @generated
	 */
	LabelSelector getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(LabelSelector value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object that describes the pod that will be created on each node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(PodTemplateSpec)
	 * @see org.nasdanika.models.kubernetes.workloads.WorkloadsPackage#getDaemonSet_Template()
	 * @model containment="true"
	 * @generated
	 */
	PodTemplateSpec getTemplate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.workloads.DaemonSet#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(PodTemplateSpec value);

} // DaemonSet
