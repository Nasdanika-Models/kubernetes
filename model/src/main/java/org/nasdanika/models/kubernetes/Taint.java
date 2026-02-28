/**
 */
package org.nasdanika.models.kubernetes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A taint allows a node to repel a set of pods. Taints and tolerations work together to ensure that pods are not scheduled onto inappropriate nodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.Taint#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Taint#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.Taint#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getTaint()
 * @model
 * @generated
 */
public interface Taint extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The taint key to be applied to a node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getTaint_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Taint#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The taint value corresponding to the taint key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getTaint_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Taint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule, and NoExecute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see #setEffect(String)
	 * @see org.nasdanika.models.kubernetes.KubernetesPackage#getTaint_Effect()
	 * @model required="true"
	 * @generated
	 */
	String getEffect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.kubernetes.Taint#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(String value);

} // Taint
