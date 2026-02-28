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
import org.nasdanika.models.kubernetes.Node;
import org.nasdanika.models.kubernetes.Taint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NodeImpl#getPodCIDR <em>Pod CIDR</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NodeImpl#isUnschedulable <em>Unschedulable</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.NodeImpl#getTaints <em>Taints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ResourceImpl implements Node {
	/**
	 * The default value of the '{@link #getPodCIDR() <em>Pod CIDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodCIDR()
	 * @generated
	 * @ordered
	 */
	protected static final String POD_CIDR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isUnschedulable() <em>Unschedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnschedulable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSCHEDULABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPodCIDR() {
		return (String)eDynamicGet(KubernetesPackage.NODE__POD_CIDR, KubernetesPackage.Literals.NODE__POD_CIDR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPodCIDR(String newPodCIDR) {
		eDynamicSet(KubernetesPackage.NODE__POD_CIDR, KubernetesPackage.Literals.NODE__POD_CIDR, newPodCIDR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnschedulable() {
		return (Boolean)eDynamicGet(KubernetesPackage.NODE__UNSCHEDULABLE, KubernetesPackage.Literals.NODE__UNSCHEDULABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnschedulable(boolean newUnschedulable) {
		eDynamicSet(KubernetesPackage.NODE__UNSCHEDULABLE, KubernetesPackage.Literals.NODE__UNSCHEDULABLE, newUnschedulable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Taint> getTaints() {
		return (EList<Taint>)eDynamicGet(KubernetesPackage.NODE__TAINTS, KubernetesPackage.Literals.NODE__TAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KubernetesPackage.NODE__TAINTS:
				return ((InternalEList<?>)getTaints()).basicRemove(otherEnd, msgs);
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
			case KubernetesPackage.NODE__POD_CIDR:
				return getPodCIDR();
			case KubernetesPackage.NODE__UNSCHEDULABLE:
				return isUnschedulable();
			case KubernetesPackage.NODE__TAINTS:
				return getTaints();
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
			case KubernetesPackage.NODE__POD_CIDR:
				setPodCIDR((String)newValue);
				return;
			case KubernetesPackage.NODE__UNSCHEDULABLE:
				setUnschedulable((Boolean)newValue);
				return;
			case KubernetesPackage.NODE__TAINTS:
				getTaints().clear();
				getTaints().addAll((Collection<? extends Taint>)newValue);
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
			case KubernetesPackage.NODE__POD_CIDR:
				setPodCIDR(POD_CIDR_EDEFAULT);
				return;
			case KubernetesPackage.NODE__UNSCHEDULABLE:
				setUnschedulable(UNSCHEDULABLE_EDEFAULT);
				return;
			case KubernetesPackage.NODE__TAINTS:
				getTaints().clear();
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
			case KubernetesPackage.NODE__POD_CIDR:
				return POD_CIDR_EDEFAULT == null ? getPodCIDR() != null : !POD_CIDR_EDEFAULT.equals(getPodCIDR());
			case KubernetesPackage.NODE__UNSCHEDULABLE:
				return isUnschedulable() != UNSCHEDULABLE_EDEFAULT;
			case KubernetesPackage.NODE__TAINTS:
				return !getTaints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
