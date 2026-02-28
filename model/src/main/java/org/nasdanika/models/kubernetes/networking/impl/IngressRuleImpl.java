/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.networking.HTTPIngressPath;
import org.nasdanika.models.kubernetes.networking.IngressRule;
import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingress Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.IngressRuleImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngressRuleImpl extends MinimalEObjectImpl.Container implements IngressRule {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngressRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.INGRESS_RULE;
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
	public String getHost() {
		return (String)eDynamicGet(NetworkingPackage.INGRESS_RULE__HOST, NetworkingPackage.Literals.INGRESS_RULE__HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		eDynamicSet(NetworkingPackage.INGRESS_RULE__HOST, NetworkingPackage.Literals.INGRESS_RULE__HOST, newHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HTTPIngressPath> getPaths() {
		return (EList<HTTPIngressPath>)eDynamicGet(NetworkingPackage.INGRESS_RULE__PATHS, NetworkingPackage.Literals.INGRESS_RULE__PATHS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.INGRESS_RULE__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
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
			case NetworkingPackage.INGRESS_RULE__HOST:
				return getHost();
			case NetworkingPackage.INGRESS_RULE__PATHS:
				return getPaths();
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
			case NetworkingPackage.INGRESS_RULE__HOST:
				setHost((String)newValue);
				return;
			case NetworkingPackage.INGRESS_RULE__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends HTTPIngressPath>)newValue);
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
			case NetworkingPackage.INGRESS_RULE__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case NetworkingPackage.INGRESS_RULE__PATHS:
				getPaths().clear();
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
			case NetworkingPackage.INGRESS_RULE__HOST:
				return HOST_EDEFAULT == null ? getHost() != null : !HOST_EDEFAULT.equals(getHost());
			case NetworkingPackage.INGRESS_RULE__PATHS:
				return !getPaths().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IngressRuleImpl
