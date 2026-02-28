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

import org.nasdanika.models.kubernetes.workloads.ContainerPort;
import org.nasdanika.models.kubernetes.workloads.EnvVar;
import org.nasdanika.models.kubernetes.workloads.ResourceRequirements;
import org.nasdanika.models.kubernetes.workloads.VolumeMount;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getImagePullPolicy <em>Image Pull Policy</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getVolumeMounts <em>Volume Mounts</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements org.nasdanika.models.kubernetes.workloads.Container {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImagePullPolicy() <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePullPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PULL_POLICY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.CONTAINER;
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
	@Override
	public String getName() {
		return (String)eDynamicGet(WorkloadsPackage.CONTAINER__NAME, WorkloadsPackage.Literals.CONTAINER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(WorkloadsPackage.CONTAINER__NAME, WorkloadsPackage.Literals.CONTAINER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return (String)eDynamicGet(WorkloadsPackage.CONTAINER__IMAGE, WorkloadsPackage.Literals.CONTAINER__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		eDynamicSet(WorkloadsPackage.CONTAINER__IMAGE, WorkloadsPackage.Literals.CONTAINER__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImagePullPolicy() {
		return (String)eDynamicGet(WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY, WorkloadsPackage.Literals.CONTAINER__IMAGE_PULL_POLICY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePullPolicy(String newImagePullPolicy) {
		eDynamicSet(WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY, WorkloadsPackage.Literals.CONTAINER__IMAGE_PULL_POLICY, newImagePullPolicy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ContainerPort> getPorts() {
		return (EList<ContainerPort>)eDynamicGet(WorkloadsPackage.CONTAINER__PORTS, WorkloadsPackage.Literals.CONTAINER__PORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnvVar> getEnv() {
		return (EList<EnvVar>)eDynamicGet(WorkloadsPackage.CONTAINER__ENV, WorkloadsPackage.Literals.CONTAINER__ENV, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VolumeMount> getVolumeMounts() {
		return (EList<VolumeMount>)eDynamicGet(WorkloadsPackage.CONTAINER__VOLUME_MOUNTS, WorkloadsPackage.Literals.CONTAINER__VOLUME_MOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRequirements getResources() {
		return (ResourceRequirements)eDynamicGet(WorkloadsPackage.CONTAINER__RESOURCES, WorkloadsPackage.Literals.CONTAINER__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourceRequirements newResources, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResources, WorkloadsPackage.CONTAINER__RESOURCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(ResourceRequirements newResources) {
		eDynamicSet(WorkloadsPackage.CONTAINER__RESOURCES, WorkloadsPackage.Literals.CONTAINER__RESOURCES, newResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getCommand() {
		return (EList<String>)eDynamicGet(WorkloadsPackage.CONTAINER__COMMAND, WorkloadsPackage.Literals.CONTAINER__COMMAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getArgs() {
		return (EList<String>)eDynamicGet(WorkloadsPackage.CONTAINER__ARGS, WorkloadsPackage.Literals.CONTAINER__ARGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadsPackage.CONTAINER__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.CONTAINER__ENV:
				return ((InternalEList<?>)getEnv()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.CONTAINER__VOLUME_MOUNTS:
				return ((InternalEList<?>)getVolumeMounts()).basicRemove(otherEnd, msgs);
			case WorkloadsPackage.CONTAINER__RESOURCES:
				return basicSetResources(null, msgs);
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
			case WorkloadsPackage.CONTAINER__NAME:
				return getName();
			case WorkloadsPackage.CONTAINER__IMAGE:
				return getImage();
			case WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY:
				return getImagePullPolicy();
			case WorkloadsPackage.CONTAINER__PORTS:
				return getPorts();
			case WorkloadsPackage.CONTAINER__ENV:
				return getEnv();
			case WorkloadsPackage.CONTAINER__VOLUME_MOUNTS:
				return getVolumeMounts();
			case WorkloadsPackage.CONTAINER__RESOURCES:
				return getResources();
			case WorkloadsPackage.CONTAINER__COMMAND:
				return getCommand();
			case WorkloadsPackage.CONTAINER__ARGS:
				return getArgs();
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
			case WorkloadsPackage.CONTAINER__NAME:
				setName((String)newValue);
				return;
			case WorkloadsPackage.CONTAINER__IMAGE:
				setImage((String)newValue);
				return;
			case WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY:
				setImagePullPolicy((String)newValue);
				return;
			case WorkloadsPackage.CONTAINER__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ContainerPort>)newValue);
				return;
			case WorkloadsPackage.CONTAINER__ENV:
				getEnv().clear();
				getEnv().addAll((Collection<? extends EnvVar>)newValue);
				return;
			case WorkloadsPackage.CONTAINER__VOLUME_MOUNTS:
				getVolumeMounts().clear();
				getVolumeMounts().addAll((Collection<? extends VolumeMount>)newValue);
				return;
			case WorkloadsPackage.CONTAINER__RESOURCES:
				setResources((ResourceRequirements)newValue);
				return;
			case WorkloadsPackage.CONTAINER__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends String>)newValue);
				return;
			case WorkloadsPackage.CONTAINER__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends String>)newValue);
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
			case WorkloadsPackage.CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY:
				setImagePullPolicy(IMAGE_PULL_POLICY_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER__PORTS:
				getPorts().clear();
				return;
			case WorkloadsPackage.CONTAINER__ENV:
				getEnv().clear();
				return;
			case WorkloadsPackage.CONTAINER__VOLUME_MOUNTS:
				getVolumeMounts().clear();
				return;
			case WorkloadsPackage.CONTAINER__RESOURCES:
				setResources((ResourceRequirements)null);
				return;
			case WorkloadsPackage.CONTAINER__COMMAND:
				getCommand().clear();
				return;
			case WorkloadsPackage.CONTAINER__ARGS:
				getArgs().clear();
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
			case WorkloadsPackage.CONTAINER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WorkloadsPackage.CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? getImage() != null : !IMAGE_EDEFAULT.equals(getImage());
			case WorkloadsPackage.CONTAINER__IMAGE_PULL_POLICY:
				return IMAGE_PULL_POLICY_EDEFAULT == null ? getImagePullPolicy() != null : !IMAGE_PULL_POLICY_EDEFAULT.equals(getImagePullPolicy());
			case WorkloadsPackage.CONTAINER__PORTS:
				return !getPorts().isEmpty();
			case WorkloadsPackage.CONTAINER__ENV:
				return !getEnv().isEmpty();
			case WorkloadsPackage.CONTAINER__VOLUME_MOUNTS:
				return !getVolumeMounts().isEmpty();
			case WorkloadsPackage.CONTAINER__RESOURCES:
				return getResources() != null;
			case WorkloadsPackage.CONTAINER__COMMAND:
				return !getCommand().isEmpty();
			case WorkloadsPackage.CONTAINER__ARGS:
				return !getArgs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
