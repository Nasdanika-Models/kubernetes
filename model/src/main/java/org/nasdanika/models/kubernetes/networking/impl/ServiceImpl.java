/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.networking.NetworkingPackage;
import org.nasdanika.models.kubernetes.networking.Service;
import org.nasdanika.models.kubernetes.networking.ServicePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl#getClusterIP <em>Cluster IP</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.ServiceImpl#getExternalName <em>External Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ResourceImpl implements Service {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClusterIP() <em>Cluster IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterIP()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_IP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExternalName() <em>External Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getSelector() {
		return (EList<KeyValuePair>)eDynamicGet(NetworkingPackage.SERVICE__SELECTOR, NetworkingPackage.Literals.SERVICE__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ServicePort> getPorts() {
		return (EList<ServicePort>)eDynamicGet(NetworkingPackage.SERVICE__PORTS, NetworkingPackage.Literals.SERVICE__PORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(NetworkingPackage.SERVICE__TYPE, NetworkingPackage.Literals.SERVICE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(NetworkingPackage.SERVICE__TYPE, NetworkingPackage.Literals.SERVICE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterIP() {
		return (String)eDynamicGet(NetworkingPackage.SERVICE__CLUSTER_IP, NetworkingPackage.Literals.SERVICE__CLUSTER_IP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterIP(String newClusterIP) {
		eDynamicSet(NetworkingPackage.SERVICE__CLUSTER_IP, NetworkingPackage.Literals.SERVICE__CLUSTER_IP, newClusterIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalName() {
		return (String)eDynamicGet(NetworkingPackage.SERVICE__EXTERNAL_NAME, NetworkingPackage.Literals.SERVICE__EXTERNAL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalName(String newExternalName) {
		eDynamicSet(NetworkingPackage.SERVICE__EXTERNAL_NAME, NetworkingPackage.Literals.SERVICE__EXTERNAL_NAME, newExternalName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.SERVICE__SELECTOR:
				return ((InternalEList<?>)getSelector()).basicRemove(otherEnd, msgs);
			case NetworkingPackage.SERVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case NetworkingPackage.SERVICE__SELECTOR:
				return getSelector();
			case NetworkingPackage.SERVICE__PORTS:
				return getPorts();
			case NetworkingPackage.SERVICE__TYPE:
				return getType();
			case NetworkingPackage.SERVICE__CLUSTER_IP:
				return getClusterIP();
			case NetworkingPackage.SERVICE__EXTERNAL_NAME:
				return getExternalName();
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
			case NetworkingPackage.SERVICE__SELECTOR:
				getSelector().clear();
				getSelector().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case NetworkingPackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ServicePort>)newValue);
				return;
			case NetworkingPackage.SERVICE__TYPE:
				setType((String)newValue);
				return;
			case NetworkingPackage.SERVICE__CLUSTER_IP:
				setClusterIP((String)newValue);
				return;
			case NetworkingPackage.SERVICE__EXTERNAL_NAME:
				setExternalName((String)newValue);
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
			case NetworkingPackage.SERVICE__SELECTOR:
				getSelector().clear();
				return;
			case NetworkingPackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case NetworkingPackage.SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE__CLUSTER_IP:
				setClusterIP(CLUSTER_IP_EDEFAULT);
				return;
			case NetworkingPackage.SERVICE__EXTERNAL_NAME:
				setExternalName(EXTERNAL_NAME_EDEFAULT);
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
			case NetworkingPackage.SERVICE__SELECTOR:
				return !getSelector().isEmpty();
			case NetworkingPackage.SERVICE__PORTS:
				return !getPorts().isEmpty();
			case NetworkingPackage.SERVICE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case NetworkingPackage.SERVICE__CLUSTER_IP:
				return CLUSTER_IP_EDEFAULT == null ? getClusterIP() != null : !CLUSTER_IP_EDEFAULT.equals(getClusterIP());
			case NetworkingPackage.SERVICE__EXTERNAL_NAME:
				return EXTERNAL_NAME_EDEFAULT == null ? getExternalName() != null : !EXTERNAL_NAME_EDEFAULT.equals(getExternalName());
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
