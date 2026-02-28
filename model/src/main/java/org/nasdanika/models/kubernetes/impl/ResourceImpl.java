/**
 */
package org.nasdanika.models.kubernetes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.kubernetes.KeyValuePair;
import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.ResourceImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.RESOURCE;
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
		return (String)eDynamicGet(KubernetesPackage.RESOURCE__NAME, KubernetesPackage.Literals.RESOURCE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(KubernetesPackage.RESOURCE__NAME, KubernetesPackage.Literals.RESOURCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return (String)eDynamicGet(KubernetesPackage.RESOURCE__NAMESPACE, KubernetesPackage.Literals.RESOURCE__NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		eDynamicSet(KubernetesPackage.RESOURCE__NAMESPACE, KubernetesPackage.Literals.RESOURCE__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiVersion() {
		return (String)eDynamicGet(KubernetesPackage.RESOURCE__API_VERSION, KubernetesPackage.Literals.RESOURCE__API_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		eDynamicSet(KubernetesPackage.RESOURCE__API_VERSION, KubernetesPackage.Literals.RESOURCE__API_VERSION, newApiVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return (String)eDynamicGet(KubernetesPackage.RESOURCE__KIND, KubernetesPackage.Literals.RESOURCE__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		eDynamicSet(KubernetesPackage.RESOURCE__KIND, KubernetesPackage.Literals.RESOURCE__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getLabels() {
		return (EList<KeyValuePair>)eDynamicGet(KubernetesPackage.RESOURCE__LABELS, KubernetesPackage.Literals.RESOURCE__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValuePair> getAnnotations() {
		return (EList<KeyValuePair>)eDynamicGet(KubernetesPackage.RESOURCE__ANNOTATIONS, KubernetesPackage.Literals.RESOURCE__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KubernetesPackage.RESOURCE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case KubernetesPackage.RESOURCE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case KubernetesPackage.RESOURCE__NAME:
				return getName();
			case KubernetesPackage.RESOURCE__NAMESPACE:
				return getNamespace();
			case KubernetesPackage.RESOURCE__API_VERSION:
				return getApiVersion();
			case KubernetesPackage.RESOURCE__KIND:
				return getKind();
			case KubernetesPackage.RESOURCE__LABELS:
				return getLabels();
			case KubernetesPackage.RESOURCE__ANNOTATIONS:
				return getAnnotations();
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
			case KubernetesPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case KubernetesPackage.RESOURCE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case KubernetesPackage.RESOURCE__API_VERSION:
				setApiVersion((String)newValue);
				return;
			case KubernetesPackage.RESOURCE__KIND:
				setKind((String)newValue);
				return;
			case KubernetesPackage.RESOURCE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends KeyValuePair>)newValue);
				return;
			case KubernetesPackage.RESOURCE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends KeyValuePair>)newValue);
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
			case KubernetesPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KubernetesPackage.RESOURCE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case KubernetesPackage.RESOURCE__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case KubernetesPackage.RESOURCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case KubernetesPackage.RESOURCE__LABELS:
				getLabels().clear();
				return;
			case KubernetesPackage.RESOURCE__ANNOTATIONS:
				getAnnotations().clear();
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
			case KubernetesPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case KubernetesPackage.RESOURCE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals(getNamespace());
			case KubernetesPackage.RESOURCE__API_VERSION:
				return API_VERSION_EDEFAULT == null ? getApiVersion() != null : !API_VERSION_EDEFAULT.equals(getApiVersion());
			case KubernetesPackage.RESOURCE__KIND:
				return KIND_EDEFAULT == null ? getKind() != null : !KIND_EDEFAULT.equals(getKind());
			case KubernetesPackage.RESOURCE__LABELS:
				return !getLabels().isEmpty();
			case KubernetesPackage.RESOURCE__ANNOTATIONS:
				return !getAnnotations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
