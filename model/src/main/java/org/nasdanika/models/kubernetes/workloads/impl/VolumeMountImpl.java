/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.kubernetes.workloads.VolumeMount;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.VolumeMountImpl#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeMountImpl extends MinimalEObjectImpl.Container implements VolumeMount {
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
	 * The default value of the '{@link #getMountPath() <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSubPath() <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeMountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.VOLUME_MOUNT;
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
		return (String)eDynamicGet(WorkloadsPackage.VOLUME_MOUNT__NAME, WorkloadsPackage.Literals.VOLUME_MOUNT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(WorkloadsPackage.VOLUME_MOUNT__NAME, WorkloadsPackage.Literals.VOLUME_MOUNT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMountPath() {
		return (String)eDynamicGet(WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH, WorkloadsPackage.Literals.VOLUME_MOUNT__MOUNT_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMountPath(String newMountPath) {
		eDynamicSet(WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH, WorkloadsPackage.Literals.VOLUME_MOUNT__MOUNT_PATH, newMountPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return (Boolean)eDynamicGet(WorkloadsPackage.VOLUME_MOUNT__READ_ONLY, WorkloadsPackage.Literals.VOLUME_MOUNT__READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		eDynamicSet(WorkloadsPackage.VOLUME_MOUNT__READ_ONLY, WorkloadsPackage.Literals.VOLUME_MOUNT__READ_ONLY, newReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubPath() {
		return (String)eDynamicGet(WorkloadsPackage.VOLUME_MOUNT__SUB_PATH, WorkloadsPackage.Literals.VOLUME_MOUNT__SUB_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubPath(String newSubPath) {
		eDynamicSet(WorkloadsPackage.VOLUME_MOUNT__SUB_PATH, WorkloadsPackage.Literals.VOLUME_MOUNT__SUB_PATH, newSubPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkloadsPackage.VOLUME_MOUNT__NAME:
				return getName();
			case WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH:
				return getMountPath();
			case WorkloadsPackage.VOLUME_MOUNT__READ_ONLY:
				return isReadOnly();
			case WorkloadsPackage.VOLUME_MOUNT__SUB_PATH:
				return getSubPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkloadsPackage.VOLUME_MOUNT__NAME:
				setName((String)newValue);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH:
				setMountPath((String)newValue);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__SUB_PATH:
				setSubPath((String)newValue);
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
			case WorkloadsPackage.VOLUME_MOUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH:
				setMountPath(MOUNT_PATH_EDEFAULT);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WorkloadsPackage.VOLUME_MOUNT__SUB_PATH:
				setSubPath(SUB_PATH_EDEFAULT);
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
			case WorkloadsPackage.VOLUME_MOUNT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WorkloadsPackage.VOLUME_MOUNT__MOUNT_PATH:
				return MOUNT_PATH_EDEFAULT == null ? getMountPath() != null : !MOUNT_PATH_EDEFAULT.equals(getMountPath());
			case WorkloadsPackage.VOLUME_MOUNT__READ_ONLY:
				return isReadOnly() != READ_ONLY_EDEFAULT;
			case WorkloadsPackage.VOLUME_MOUNT__SUB_PATH:
				return SUB_PATH_EDEFAULT == null ? getSubPath() != null : !SUB_PATH_EDEFAULT.equals(getSubPath());
		}
		return super.eIsSet(featureID);
	}

} //VolumeMountImpl
