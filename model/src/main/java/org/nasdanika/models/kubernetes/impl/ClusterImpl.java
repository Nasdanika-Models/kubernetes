/**
 */
package org.nasdanika.models.kubernetes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.Cluster;
import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.Namespace;
import org.nasdanika.models.kubernetes.Node;

import org.nasdanika.models.kubernetes.storage.PersistentVolume;
import org.nasdanika.models.kubernetes.storage.StorageClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ClusterImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ClusterImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ClusterImpl#getPersistentVolumes <em>Persistent Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ClusterImpl#getStorageClasses <em>Storage Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends ResourceImpl implements Cluster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Namespace> getNamespaces() {
		return (EList<Namespace>)eDynamicGet(KubernetesPackage.CLUSTER__NAMESPACES, KubernetesPackage.Literals.CLUSTER__NAMESPACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Node> getNodes() {
		return (EList<Node>)eDynamicGet(KubernetesPackage.CLUSTER__NODES, KubernetesPackage.Literals.CLUSTER__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PersistentVolume> getPersistentVolumes() {
		return (EList<PersistentVolume>)eDynamicGet(KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES, KubernetesPackage.Literals.CLUSTER__PERSISTENT_VOLUMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StorageClass> getStorageClasses() {
		return (EList<StorageClass>)eDynamicGet(KubernetesPackage.CLUSTER__STORAGE_CLASSES, KubernetesPackage.Literals.CLUSTER__STORAGE_CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KubernetesPackage.CLUSTER__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.CLUSTER__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES:
				return ((InternalEList<?>)getPersistentVolumes()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.CLUSTER__STORAGE_CLASSES:
				return ((InternalEList<?>)getStorageClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KubernetesPackage.CLUSTER__NAMESPACES:
				return getNamespaces();
			case KubernetesPackage.CLUSTER__NODES:
				return getNodes();
			case KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES:
				return getPersistentVolumes();
			case KubernetesPackage.CLUSTER__STORAGE_CLASSES:
				return getStorageClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KubernetesPackage.CLUSTER__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case KubernetesPackage.CLUSTER__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES:
				getPersistentVolumes().clear();
				getPersistentVolumes().addAll((Collection<? extends PersistentVolume>)newValue);
				return;
			case KubernetesPackage.CLUSTER__STORAGE_CLASSES:
				getStorageClasses().clear();
				getStorageClasses().addAll((Collection<? extends StorageClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KubernetesPackage.CLUSTER__NAMESPACES:
				getNamespaces().clear();
				return;
			case KubernetesPackage.CLUSTER__NODES:
				getNodes().clear();
				return;
			case KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES:
				getPersistentVolumes().clear();
				return;
			case KubernetesPackage.CLUSTER__STORAGE_CLASSES:
				getStorageClasses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KubernetesPackage.CLUSTER__NAMESPACES:
				return !getNamespaces().isEmpty();
			case KubernetesPackage.CLUSTER__NODES:
				return !getNodes().isEmpty();
			case KubernetesPackage.CLUSTER__PERSISTENT_VOLUMES:
				return !getPersistentVolumes().isEmpty();
			case KubernetesPackage.CLUSTER__STORAGE_CLASSES:
				return !getStorageClasses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClusterImpl
