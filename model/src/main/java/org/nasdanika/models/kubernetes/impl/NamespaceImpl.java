/**
 */
package org.nasdanika.models.kubernetes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.Namespace;

import org.nasdanika.models.kubernetes.configuration.ConfigMap;
import org.nasdanika.models.kubernetes.configuration.Secret;

import org.nasdanika.models.kubernetes.networking.Ingress;
import org.nasdanika.models.kubernetes.networking.Service;

import org.nasdanika.models.kubernetes.storage.PersistentVolumeClaim;

import org.nasdanika.models.kubernetes.workloads.CronJob;
import org.nasdanika.models.kubernetes.workloads.DaemonSet;
import org.nasdanika.models.kubernetes.workloads.Deployment;
import org.nasdanika.models.kubernetes.workloads.Job;
import org.nasdanika.models.kubernetes.workloads.Pod;
import org.nasdanika.models.kubernetes.workloads.ReplicaSet;
import org.nasdanika.models.kubernetes.workloads.StatefulSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getStatefulSets <em>Stateful Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getDaemonSets <em>Daemon Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getReplicaSets <em>Replica Sets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getPods <em>Pods</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getIngresses <em>Ingresses</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getConfigMaps <em>Config Maps</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getCronJobs <em>Cron Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NamespaceImpl#getPersistentVolumeClaims <em>Persistent Volume Claims</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends ResourceImpl implements Namespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Deployment> getDeployments() {
		return (EList<Deployment>)eDynamicGet(KubernetesPackage.NAMESPACE__DEPLOYMENTS, KubernetesPackage.Literals.NAMESPACE__DEPLOYMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StatefulSet> getStatefulSets() {
		return (EList<StatefulSet>)eDynamicGet(KubernetesPackage.NAMESPACE__STATEFUL_SETS, KubernetesPackage.Literals.NAMESPACE__STATEFUL_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DaemonSet> getDaemonSets() {
		return (EList<DaemonSet>)eDynamicGet(KubernetesPackage.NAMESPACE__DAEMON_SETS, KubernetesPackage.Literals.NAMESPACE__DAEMON_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ReplicaSet> getReplicaSets() {
		return (EList<ReplicaSet>)eDynamicGet(KubernetesPackage.NAMESPACE__REPLICA_SETS, KubernetesPackage.Literals.NAMESPACE__REPLICA_SETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Pod> getPods() {
		return (EList<Pod>)eDynamicGet(KubernetesPackage.NAMESPACE__PODS, KubernetesPackage.Literals.NAMESPACE__PODS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Service> getServices() {
		return (EList<Service>)eDynamicGet(KubernetesPackage.NAMESPACE__SERVICES, KubernetesPackage.Literals.NAMESPACE__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Ingress> getIngresses() {
		return (EList<Ingress>)eDynamicGet(KubernetesPackage.NAMESPACE__INGRESSES, KubernetesPackage.Literals.NAMESPACE__INGRESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConfigMap> getConfigMaps() {
		return (EList<ConfigMap>)eDynamicGet(KubernetesPackage.NAMESPACE__CONFIG_MAPS, KubernetesPackage.Literals.NAMESPACE__CONFIG_MAPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Secret> getSecrets() {
		return (EList<Secret>)eDynamicGet(KubernetesPackage.NAMESPACE__SECRETS, KubernetesPackage.Literals.NAMESPACE__SECRETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Job> getJobs() {
		return (EList<Job>)eDynamicGet(KubernetesPackage.NAMESPACE__JOBS, KubernetesPackage.Literals.NAMESPACE__JOBS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CronJob> getCronJobs() {
		return (EList<CronJob>)eDynamicGet(KubernetesPackage.NAMESPACE__CRON_JOBS, KubernetesPackage.Literals.NAMESPACE__CRON_JOBS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PersistentVolumeClaim> getPersistentVolumeClaims() {
		return (EList<PersistentVolumeClaim>)eDynamicGet(KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS, KubernetesPackage.Literals.NAMESPACE__PERSISTENT_VOLUME_CLAIMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KubernetesPackage.NAMESPACE__DEPLOYMENTS:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__STATEFUL_SETS:
				return ((InternalEList<?>)getStatefulSets()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__DAEMON_SETS:
				return ((InternalEList<?>)getDaemonSets()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__REPLICA_SETS:
				return ((InternalEList<?>)getReplicaSets()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__PODS:
				return ((InternalEList<?>)getPods()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__INGRESSES:
				return ((InternalEList<?>)getIngresses()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__CONFIG_MAPS:
				return ((InternalEList<?>)getConfigMaps()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__SECRETS:
				return ((InternalEList<?>)getSecrets()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__CRON_JOBS:
				return ((InternalEList<?>)getCronJobs()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS:
				return ((InternalEList<?>)getPersistentVolumeClaims()).basicRemove(otherEnd, msgs);
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
			case KubernetesPackage.NAMESPACE__DEPLOYMENTS:
				return getDeployments();
			case KubernetesPackage.NAMESPACE__STATEFUL_SETS:
				return getStatefulSets();
			case KubernetesPackage.NAMESPACE__DAEMON_SETS:
				return getDaemonSets();
			case KubernetesPackage.NAMESPACE__REPLICA_SETS:
				return getReplicaSets();
			case KubernetesPackage.NAMESPACE__PODS:
				return getPods();
			case KubernetesPackage.NAMESPACE__SERVICES:
				return getServices();
			case KubernetesPackage.NAMESPACE__INGRESSES:
				return getIngresses();
			case KubernetesPackage.NAMESPACE__CONFIG_MAPS:
				return getConfigMaps();
			case KubernetesPackage.NAMESPACE__SECRETS:
				return getSecrets();
			case KubernetesPackage.NAMESPACE__JOBS:
				return getJobs();
			case KubernetesPackage.NAMESPACE__CRON_JOBS:
				return getCronJobs();
			case KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS:
				return getPersistentVolumeClaims();
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
			case KubernetesPackage.NAMESPACE__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends Deployment>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__STATEFUL_SETS:
				getStatefulSets().clear();
				getStatefulSets().addAll((Collection<? extends StatefulSet>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__DAEMON_SETS:
				getDaemonSets().clear();
				getDaemonSets().addAll((Collection<? extends DaemonSet>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__REPLICA_SETS:
				getReplicaSets().clear();
				getReplicaSets().addAll((Collection<? extends ReplicaSet>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__PODS:
				getPods().clear();
				getPods().addAll((Collection<? extends Pod>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__INGRESSES:
				getIngresses().clear();
				getIngresses().addAll((Collection<? extends Ingress>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__CONFIG_MAPS:
				getConfigMaps().clear();
				getConfigMaps().addAll((Collection<? extends ConfigMap>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__SECRETS:
				getSecrets().clear();
				getSecrets().addAll((Collection<? extends Secret>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends Job>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__CRON_JOBS:
				getCronJobs().clear();
				getCronJobs().addAll((Collection<? extends CronJob>)newValue);
				return;
			case KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS:
				getPersistentVolumeClaims().clear();
				getPersistentVolumeClaims().addAll((Collection<? extends PersistentVolumeClaim>)newValue);
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
			case KubernetesPackage.NAMESPACE__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case KubernetesPackage.NAMESPACE__STATEFUL_SETS:
				getStatefulSets().clear();
				return;
			case KubernetesPackage.NAMESPACE__DAEMON_SETS:
				getDaemonSets().clear();
				return;
			case KubernetesPackage.NAMESPACE__REPLICA_SETS:
				getReplicaSets().clear();
				return;
			case KubernetesPackage.NAMESPACE__PODS:
				getPods().clear();
				return;
			case KubernetesPackage.NAMESPACE__SERVICES:
				getServices().clear();
				return;
			case KubernetesPackage.NAMESPACE__INGRESSES:
				getIngresses().clear();
				return;
			case KubernetesPackage.NAMESPACE__CONFIG_MAPS:
				getConfigMaps().clear();
				return;
			case KubernetesPackage.NAMESPACE__SECRETS:
				getSecrets().clear();
				return;
			case KubernetesPackage.NAMESPACE__JOBS:
				getJobs().clear();
				return;
			case KubernetesPackage.NAMESPACE__CRON_JOBS:
				getCronJobs().clear();
				return;
			case KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS:
				getPersistentVolumeClaims().clear();
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
			case KubernetesPackage.NAMESPACE__DEPLOYMENTS:
				return !getDeployments().isEmpty();
			case KubernetesPackage.NAMESPACE__STATEFUL_SETS:
				return !getStatefulSets().isEmpty();
			case KubernetesPackage.NAMESPACE__DAEMON_SETS:
				return !getDaemonSets().isEmpty();
			case KubernetesPackage.NAMESPACE__REPLICA_SETS:
				return !getReplicaSets().isEmpty();
			case KubernetesPackage.NAMESPACE__PODS:
				return !getPods().isEmpty();
			case KubernetesPackage.NAMESPACE__SERVICES:
				return !getServices().isEmpty();
			case KubernetesPackage.NAMESPACE__INGRESSES:
				return !getIngresses().isEmpty();
			case KubernetesPackage.NAMESPACE__CONFIG_MAPS:
				return !getConfigMaps().isEmpty();
			case KubernetesPackage.NAMESPACE__SECRETS:
				return !getSecrets().isEmpty();
			case KubernetesPackage.NAMESPACE__JOBS:
				return !getJobs().isEmpty();
			case KubernetesPackage.NAMESPACE__CRON_JOBS:
				return !getCronJobs().isEmpty();
			case KubernetesPackage.NAMESPACE__PERSISTENT_VOLUME_CLAIMS:
				return !getPersistentVolumeClaims().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamespaceImpl
