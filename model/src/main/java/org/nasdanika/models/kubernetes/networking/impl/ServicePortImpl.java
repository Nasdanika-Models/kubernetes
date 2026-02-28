/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.kubernetes.networking.NetworkingPackage;
import org.nasdanika.models.kubernetes.networking.ServicePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl#getNodePort <em>Node Port</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServicePortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePortImpl extends MinimalEObjectImpl.Container implements ServicePort {
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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTargetPort() <em>Target Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_PORT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getNodePort() <em>Node Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePort()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_PORT_EDEFAULT = 0;

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
	protected ServicePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.SERVICE_PORT;
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
		return (String)eDynamicGet(NetworkingPackage.SERVICE_PORT__NAME, NetworkingPackage.Literals.SERVICE_PORT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(NetworkingPackage.SERVICE_PORT__NAME, NetworkingPackage.Literals.SERVICE_PORT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return (Integer)eDynamicGet(NetworkingPackage.SERVICE_PORT__PORT, NetworkingPackage.Literals.SERVICE_PORT__PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		eDynamicSet(NetworkingPackage.SERVICE_PORT__PORT, NetworkingPackage.Literals.SERVICE_PORT__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTargetPort() {
		return (Integer)eDynamicGet(NetworkingPackage.SERVICE_PORT__TARGET_PORT, NetworkingPackage.Literals.SERVICE_PORT__TARGET_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPort(int newTargetPort) {
		eDynamicSet(NetworkingPackage.SERVICE_PORT__TARGET_PORT, NetworkingPackage.Literals.SERVICE_PORT__TARGET_PORT, newTargetPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNodePort() {
		return (Integer)eDynamicGet(NetworkingPackage.SERVICE_PORT__NODE_PORT, NetworkingPackage.Literals.SERVICE_PORT__NODE_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodePort(int newNodePort) {
		eDynamicSet(NetworkingPackage.SERVICE_PORT__NODE_PORT, NetworkingPackage.Literals.SERVICE_PORT__NODE_PORT, newNodePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return (String)eDynamicGet(NetworkingPackage.SERVICE_PORT__PROTOCOL, NetworkingPackage.Literals.SERVICE_PORT__PROTOCOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		eDynamicSet(NetworkingPackage.SERVICE_PORT__PROTOCOL, NetworkingPackage.Literals.SERVICE_PORT__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkingPackage.SERVICE_PORT__NAME:
				return getName();
			case NetworkingPackage.SERVICE_PORT__PORT:
				return getPort();
			case NetworkingPackage.SERVICE_PORT__TARGET_PORT:
				return getTargetPort();
			case NetworkingPackage.SERVICE_PORT__NODE_PORT:
				return getNodePort();
			case NetworkingPackage.SERVICE_PORT__PROTOCOL:
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
			case NetworkingPackage.SERVICE_PORT__NAME:
				setName((String)newValue);
				return;
			case NetworkingPackage.SERVICE_PORT__PORT:
				setPort((Integer)newValue);
				return;
			case NetworkingPackage.SERVICE_PORT__TARGET_PORT:
				setTargetPort((Integer)newValue);
				return;
			case NetworkingPackage.SERVICE_PORT__NODE_PORT:
				setNodePort((Integer)newValue);
				return;
			case NetworkingPackage.SERVICE_PORT__PROTOCOL:
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
			case NetworkingPackage.SERVICE_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE_PORT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE_PORT__TARGET_PORT:
				setTargetPort(TARGET_PORT_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE_PORT__NODE_PORT:
				setNodePort(NODE_PORT_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE_PORT__PROTOCOL:
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
			case NetworkingPackage.SERVICE_PORT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case NetworkingPackage.SERVICE_PORT__PORT:
				return getPort() != PORT_EDEFAULT;
			case NetworkingPackage.SERVICE_PORT__TARGET_PORT:
				return getTargetPort() != TARGET_PORT_EDEFAULT;
			case NetworkingPackage.SERVICE_PORT__NODE_PORT:
				return getNodePort() != NODE_PORT_EDEFAULT;
			case NetworkingPackage.SERVICE_PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? getProtocol() != null : !PROTOCOL_EDEFAULT.equals(getProtocol());
		}
		return super.eIsSet(featureID);
	}

} //ServicePortImpl
