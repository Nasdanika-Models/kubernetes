/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.impl.ResourceImpl;

import org.nasdanika.models.kubernetes.networking.Ingress;
import org.nasdanika.models.kubernetes.networking.IngressRule;
import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.IngressImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.IngressImpl#getIngressClassName <em>Ingress Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngressImpl extends ResourceImpl implements Ingress {
	/**
	 * The default value of the '{@link #getIngressClassName() <em>Ingress Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngressClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INGRESS_CLASS_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.INGRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IngressRule> getRules() {
		return (EList<IngressRule>)eDynamicGet(NetworkingPackage.INGRESS__RULES, NetworkingPackage.Literals.INGRESS__RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIngressClassName() {
		return (String)eDynamicGet(NetworkingPackage.INGRESS__INGRESS_CLASS_NAME, NetworkingPackage.Literals.INGRESS__INGRESS_CLASS_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIngressClassName(String newIngressClassName) {
		eDynamicSet(NetworkingPackage.INGRESS__INGRESS_CLASS_NAME, NetworkingPackage.Literals.INGRESS__INGRESS_CLASS_NAME, newIngressClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.INGRESS__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case NetworkingPackage.INGRESS__RULES:
				return getRules();
			case NetworkingPackage.INGRESS__INGRESS_CLASS_NAME:
				return getIngressClassName();
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
			case NetworkingPackage.INGRESS__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends IngressRule>)newValue);
				return;
			case NetworkingPackage.INGRESS__INGRESS_CLASS_NAME:
				setIngressClassName((String)newValue);
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
			case NetworkingPackage.INGRESS__RULES:
				getRules().clear();
				return;
			case NetworkingPackage.INGRESS__INGRESS_CLASS_NAME:
				setIngressClassName(INGRESS_CLASS_NAME_EDEFAULT);
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
			case NetworkingPackage.INGRESS__RULES:
				return !getRules().isEmpty();
			case NetworkingPackage.INGRESS__INGRESS_CLASS_NAME:
				return INGRESS_CLASS_NAME_EDEFAULT == null ? getIngressClassName() != null : !INGRESS_CLASS_NAME_EDEFAULT.equals(getIngressClassName());
		}
		return super.eIsSet(featureID);
	}

} //IngressImpl
