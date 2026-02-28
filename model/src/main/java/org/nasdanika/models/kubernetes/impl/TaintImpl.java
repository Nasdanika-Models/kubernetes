/**
 */
package org.nasdanika.models.kubernetes.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.kubernetes.KubernetesPackage;
import org.nasdanika.models.kubernetes.Taint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Taint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.TaintImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.TaintImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.impl.TaintImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaintImpl extends MinimalEObjectImpl.Container implements Taint {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KubernetesPackage.Literals.TAINT;
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
	public String getKey() {
		return (String)eDynamicGet(KubernetesPackage.TAINT__KEY, KubernetesPackage.Literals.TAINT__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(KubernetesPackage.TAINT__KEY, KubernetesPackage.Literals.TAINT__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(KubernetesPackage.TAINT__VALUE, KubernetesPackage.Literals.TAINT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(KubernetesPackage.TAINT__VALUE, KubernetesPackage.Literals.TAINT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEffect() {
		return (String)eDynamicGet(KubernetesPackage.TAINT__EFFECT, KubernetesPackage.Literals.TAINT__EFFECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(String newEffect) {
		eDynamicSet(KubernetesPackage.TAINT__EFFECT, KubernetesPackage.Literals.TAINT__EFFECT, newEffect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KubernetesPackage.TAINT__KEY:
				return getKey();
			case KubernetesPackage.TAINT__VALUE:
				return getValue();
			case KubernetesPackage.TAINT__EFFECT:
				return getEffect();
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
			case KubernetesPackage.TAINT__KEY:
				setKey((String)newValue);
				return;
			case KubernetesPackage.TAINT__VALUE:
				setValue((String)newValue);
				return;
			case KubernetesPackage.TAINT__EFFECT:
				setEffect((String)newValue);
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
			case KubernetesPackage.TAINT__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case KubernetesPackage.TAINT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case KubernetesPackage.TAINT__EFFECT:
				setEffect(EFFECT_EDEFAULT);
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
			case KubernetesPackage.TAINT__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case KubernetesPackage.TAINT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case KubernetesPackage.TAINT__EFFECT:
				return EFFECT_EDEFAULT == null ? getEffect() != null : !EFFECT_EDEFAULT.equals(getEffect());
		}
		return super.eIsSet(featureID);
	}

} //TaintImpl
