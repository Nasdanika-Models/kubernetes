/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Node is a worker machine in Kubernetes - either a VM or a physical machine, depending on the cluster. Each node contains the services necessary to run Pods and is managed by the control plane.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.Node#getPodCIDR <em>Pod CIDR</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Node#isUnschedulable <em>Unschedulable</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Node#getTaints <em>Taints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Resource {
	/**
	 * Returns the value of the '<em><b>Pod CIDR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PodCIDR represents the pod IP range assigned to the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pod CIDR</em>' attribute.
	 * @see #setPodCIDR(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNode_PodCIDR()
	 * @model
	 * @generated
	 */
	String getPodCIDR();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Node#getPodCIDR <em>Pod CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pod CIDR</em>' attribute.
	 * @see #getPodCIDR()
	 * @generated
	 */
	void setPodCIDR(String value);

	/**
	 * Returns the value of the '<em><b>Unschedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unschedulable controls node schedulability of new pods. By default, node is schedulable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unschedulable</em>' attribute.
	 * @see #setUnschedulable(boolean)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNode_Unschedulable()
	 * @model
	 * @generated
	 */
	boolean isUnschedulable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Node#isUnschedulable <em>Unschedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unschedulable</em>' attribute.
	 * @see #isUnschedulable()
	 * @generated
	 */
	void setUnschedulable(boolean value);

	/**
	 * Returns the value of the '<em><b>Taints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.Taint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Taints applied to the node. Taints allow a node to repel a set of pods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taints</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getNode_Taints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taint> getTaints();

} // Node
