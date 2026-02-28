/**
 */
package org.nasdanika.models.kubernetes.workloads.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.kubernetes.workloads.ContainerPort;
import org.nasdanika.models.kubernetes.workloads.WorkloadsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.workloads.impl.ContainerPortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerPortImpl extends MinimalEObjectImpl.Container implements ContainerPort {
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
	 * The default value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadsPackage.Literals.CONTAINER_PORT;
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
		return (String)eDynamicGet(WorkloadsPackage.CONTAINER_PORT__NAME, WorkloadsPackage.Literals.CONTAINER_PORT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(WorkloadsPackage.CONTAINER_PORT__NAME, WorkloadsPackage.Literals.CONTAINER_PORT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContainerPort() {
		return (Integer)eDynamicGet(WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT, WorkloadsPackage.Literals.CONTAINER_PORT__CONTAINER_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPort(int newContainerPort) {
		eDynamicSet(WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT, WorkloadsPackage.Literals.CONTAINER_PORT__CONTAINER_PORT, newContainerPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHostPort() {
		return (Integer)eDynamicGet(WorkloadsPackage.CONTAINER_PORT__HOST_PORT, WorkloadsPackage.Literals.CONTAINER_PORT__HOST_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPort(int newHostPort) {
		eDynamicSet(WorkloadsPackage.CONTAINER_PORT__HOST_PORT, WorkloadsPackage.Literals.CONTAINER_PORT__HOST_PORT, newHostPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return (String)eDynamicGet(WorkloadsPackage.CONTAINER_PORT__PROTOCOL, WorkloadsPackage.Literals.CONTAINER_PORT__PROTOCOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		eDynamicSet(WorkloadsPackage.CONTAINER_PORT__PROTOCOL, WorkloadsPackage.Literals.CONTAINER_PORT__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkloadsPackage.CONTAINER_PORT__NAME:
				return getName();
			case WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT:
				return getContainerPort();
			case WorkloadsPackage.CONTAINER_PORT__HOST_PORT:
				return getHostPort();
			case WorkloadsPackage.CONTAINER_PORT__PROTOCOL:
				return getProtocol();
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
			case WorkloadsPackage.CONTAINER_PORT__NAME:
				setName((String)newValue);
				return;
			case WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT:
				setContainerPort((Integer)newValue);
				return;
			case WorkloadsPackage.CONTAINER_PORT__HOST_PORT:
				setHostPort((Integer)newValue);
				return;
			case WorkloadsPackage.CONTAINER_PORT__PROTOCOL:
				setProtocol((String)newValue);
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
			case WorkloadsPackage.CONTAINER_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT:
				setContainerPort(CONTAINER_PORT_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER_PORT__HOST_PORT:
				setHostPort(HOST_PORT_EDEFAULT);
				return;
			case WorkloadsPackage.CONTAINER_PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
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
			case WorkloadsPackage.CONTAINER_PORT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WorkloadsPackage.CONTAINER_PORT__CONTAINER_PORT:
				return getContainerPort() != CONTAINER_PORT_EDEFAULT;
			case WorkloadsPackage.CONTAINER_PORT__HOST_PORT:
				return getHostPort() != HOST_PORT_EDEFAULT;
			case WorkloadsPackage.CONTAINER_PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
		}
		return super.eIsSet(featureID);
	}

} //ContainerPortImpl
