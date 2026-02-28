/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;

import org.nasdanika.models.kubernetes.workloads.PodTemplateSpec;
import org.nasdanika.models.kubernetes.workloads.Volume;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod Template Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getServiceAccountName <em>Service Account Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.PodTemplateSpecImpl#getNodeSelector <em>Node Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodTemplateSpecImpl extends MinimalEObjectImpl.Container implements PodTemplateSpec {
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
	 * The default value of the '{@link #getServiceAccountName() <em>Service Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ACCOUNT_NAME_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodTemplateSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.POD_TEMPLATE_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getLabels() {
		return (EList<KeyValuePair>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getAnnotations() {
		return (EList<KeyValuePair>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.kubernetes.workloads.Container> getContainers() {
		return (EList<org.nasdanika.models.kubernetes.workloads.Container>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.kubernetes.workloads.Container> getInitContainers() {
		return (EList<org.nasdanika.models.kubernetes.workloads.Container>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__INIT_CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Volume> getVolumes() {
		return (EList<Volume>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__VOLUMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestartPolicy() {
		return (String)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__RESTART_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestartPolicy(String newRestartPolicy) {
		eDynamicSet(WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__RESTART_POLICY, newRestartPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceAccountName() {
		return (String)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceAccountName(String newServiceAccountName) {
		eDynamicSet(WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME, newServiceAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeName() {
		return (String)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__NODE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeName(String newNodeName) {
		eDynamicSet(WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__NODE_NAME, newNodeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getNodeSelector() {
		return (EList<KeyValuePair>)eDynamicGet(WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR, WorkloadsPackage.Literals.POD_TEMPLATE_SPEC__NODE_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS:
				return ((InternalEList<?>)getInitContainers()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR:
				return ((InternalEList<?>)getNodeSelector()).basicRemove(otherEnd, msgs);
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
			case WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS:
				return getLabels();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS:
				return getAnnotations();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS:
				return getContainers();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS:
				return getInitContainers();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES:
				return getVolumes();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY:
				return getRestartPolicy();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME:
				return getServiceAccountName();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME:
				return getNodeName();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR:
				return getNodeSelector();
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
			case WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends org.nasdanika.models.kubernetes.workloads.Container>)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS:
				getInitContainers().clear();
				getInitContainers().addAll((Collection<? extends org.nasdanika.models.kubernetes.workloads.Container>)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY:
				setRestartPolicy((String)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME:
				setServiceAccountName((String)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME:
				setNodeName((String)newValue);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR:
				getNodeSelector().clear();
				getNodeSelector().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS:
				getLabels().clear();
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS:
				getContainers().clear();
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS:
				getInitContainers().clear();
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES:
				getVolumes().clear();
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY:
				setRestartPolicy(RESTART_POLICY_EDEFAULT);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME:
				setServiceAccountName(SERVICE_ACCOUNT_NAME_EDEFAULT);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME:
				setNodeName(NODE_NAME_EDEFAULT);
				return;
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR:
				getNodeSelector().clear();
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
			case WorkloadsPackage.POD_TEMPLATE_SPEC__LABELS:
				return !getLabels().isEmpty();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__CONTAINERS:
				return !getContainers().isEmpty();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__INIT_CONTAINERS:
				return !getInitContainers().isEmpty();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__VOLUMES:
				return !getVolumes().isEmpty();
			case WorkloadsPackage.POD_TEMPLATE_SPEC__RESTART_POLICY:
				return RESTART_POLICY_EDEFAULT == null ? getRestartPolicy() != null : !RESTART_POLICY_EDEFAULT.equals(getRestartPolicy());
			case WorkloadsPackage.POD_TEMPLATE_SPEC__SERVICE_ACCOUNT_NAME:
				return SERVICE_ACCOUNT_NAME_EDEFAULT == null ? getServiceAccountName() != null : !SERVICE_ACCOUNT_NAME_EDEFAULT.equals(getServiceAccountName());
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_NAME:
				return NODE_NAME_EDEFAULT == null ? getNodeName() != null : !NODE_NAME_EDEFAULT.equals(getNodeName());
			case WorkloadsPackage.POD_TEMPLATE_SPEC__NODE_SELECTOR:
				return !getNodeSelector().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PodTemplateSpecImpl
