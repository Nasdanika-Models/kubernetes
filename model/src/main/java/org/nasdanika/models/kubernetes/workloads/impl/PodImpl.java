/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.workloads.Pod;
import org.nasdanika.models.kubernetes.workloads.Volume;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getServiceAccountName <em>Service Account Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodImpl extends ResourceImpl implements Pod {
	/**
	 * The default value of the '{@link #getRestartPolicy() <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_POLICY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNodeName() <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceAccountName() <em>Service Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ACCOUNT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.POD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.kubernetes.workloads.Container> getContainers() {
		return (EList<org.nasdanika.models.kubernetes.workloads.Container>)eDynamicGet(WorkloadsPackage.POD__CONTAINERS, WorkloadsPackage.Literals.POD__CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.kubernetes.workloads.Container> getInitContainers() {
		return (EList<org.nasdanika.models.kubernetes.workloads.Container>)eDynamicGet(WorkloadsPackage.POD__INIT_CONTAINERS, WorkloadsPackage.Literals.POD__INIT_CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Volume> getVolumes() {
		return (EList<Volume>)eDynamicGet(WorkloadsPackage.POD__VOLUMES, WorkloadsPackage.Literals.POD__VOLUMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestartPolicy() {
		return (String)eDynamicGet(WorkloadsPackage.POD__RESTART_POLICY, WorkloadsPackage.Literals.POD__RESTART_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestartPolicy(String newRestartPolicy) {
		eDynamicSet(WorkloadsPackage.POD__RESTART_POLICY, WorkloadsPackage.Literals.POD__RESTART_POLICY, newRestartPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeName() {
		return (String)eDynamicGet(WorkloadsPackage.POD__NODE_NAME, WorkloadsPackage.Literals.POD__NODE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeName(String newNodeName) {
		eDynamicSet(WorkloadsPackage.POD__NODE_NAME, WorkloadsPackage.Literals.POD__NODE_NAME, newNodeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceAccountName() {
		return (String)eDynamicGet(WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME, WorkloadsPackage.Literals.POD__SERVICE_ACCOUNT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceAccountName(String newServiceAccountName) {
		eDynamicSet(WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME, WorkloadsPackage.Literals.POD__SERVICE_ACCOUNT_NAME, newServiceAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhase() {
		return (String)eDynamicGet(WorkloadsPackage.POD__PHASE, WorkloadsPackage.Literals.POD__PHASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhase(String newPhase) {
		eDynamicSet(WorkloadsPackage.POD__PHASE, WorkloadsPackage.Literals.POD__PHASE, newPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.POD__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD__INIT_CONTAINERS:
				return ((InternalEList<?>)getInitContainers()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
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
			case WorkloadsPackage.POD__CONTAINERS:
				return getContainers();
			case WorkloadsPackage.POD__INIT_CONTAINERS:
				return getInitContainers();
			case WorkloadsPackage.POD__VOLUMES:
				return getVolumes();
			case WorkloadsPackage.POD__RESTART_POLICY:
				return getRestartPolicy();
			case WorkloadsPackage.POD__NODE_NAME:
				return getNodeName();
			case WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME:
				return getServiceAccountName();
			case WorkloadsPackage.POD__PHASE:
				return getPhase();
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
			case WorkloadsPackage.POD__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends org.nasdanika.models.kubernetes.workloads.Container>)newValue);
				return;
			case WorkloadsPackage.POD__INIT_CONTAINERS:
				getInitContainers().clear();
				getInitContainers().addAll((Collection<? extends org.nasdanika.models.kubernetes.workloads.Container>)newValue);
				return;
			case WorkloadsPackage.POD__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case WorkloadsPackage.POD__RESTART_POLICY:
				setRestartPolicy((String)newValue);
				return;
			case WorkloadsPackage.POD__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME:
				setServiceAccountName((String)newValue);
				return;
			case WorkloadsPackage.POD__PHASE:
				setPhase((String)newValue);
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
			case WorkloadsPackage.POD__CONTAINERS:
				getContainers().clear();
				return;
			case WorkloadsPackage.POD__INIT_CONTAINERS:
				getInitContainers().clear();
				return;
			case WorkloadsPackage.POD__VOLUMES:
				getVolumes().clear();
				return;
			case WorkloadsPackage.POD__RESTART_POLICY:
				setRestartPolicy(RESTART_POLICY_EDEFAULT);
				return;
			case WorkloadsPackage.POD__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME:
				setServiceAccountName(SERVICE_ACCOUNT_NAME_EDEFAULT);
				return;
			case WorkloadsPackage.POD__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case WorkloadsPackage.POD__CONTAINERS:
				return !getContainers().isEmpty();
			case WorkloadsPackage.POD__INIT_CONTAINERS:
				return !getInitContainers().isEmpty();
			case WorkloadsPackage.POD__VOLUMES:
				return !getVolumes().isEmpty();
			case WorkloadsPackage.POD__RESTART_POLICY:
				return RESTART_POLICY_EDEFAULT == null ? getRestartPolicy() != null : !RESTART_POLICY_EDEFAULT.equals(getRestartPolicy());
			case WorkloadsPackage.POD__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? getNodeName() != null : !NODE_NAME_EDEFAULT.equals(getNodeName());
			case WorkloadsPackage.POD__SERVICE_ACCOUNT_NAME:
				return SERVICE_ACCOUNT_NAME_EDEFAULT == null ? getServiceAccountName() != null : !SERVICE_ACCOUNT_NAME_EDEFAULT.equals(getServiceAccountName());
			case WorkloadsPackage.POD__PHASE:
				return PHASE_EDEFAULT == null ? getPhase() != null : !PHASE_EDEFAULT.equals(getPhase());
		}
		return super.eIsSet(featureID);
	}

} //PodImpl
