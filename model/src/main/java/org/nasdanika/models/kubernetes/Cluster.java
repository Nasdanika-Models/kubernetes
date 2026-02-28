/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.kubernetes.storage.PersistentVolume;
import org.nasdanika.models.kubernetes.storage.StorageClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Kubernetes cluster is a set of nodes that run containerized applications. The cluster is the top-level resource containing namespaces, nodes, and cluster-scoped resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.Cluster#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Cluster#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Cluster#getPersistentVolumes <em>Persistent Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Cluster#getStorageClasses <em>Storage Classes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends Resource {
	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namespaces in this cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getCluster_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Worker nodes in this cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getCluster_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Persistent Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.storage.PersistentVolume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cluster-scoped persistent volumes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Volumes</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getCluster_PersistentVolumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersistentVolume> getPersistentVolumes();

	/**
	 * Returns the value of the '<em><b>Storage Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.kubernetes.storage.StorageClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storage classes available in this cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Classes</em>' containment reference list.
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getCluster_StorageClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<StorageClass> getStorageClasses();

} // Cluster
