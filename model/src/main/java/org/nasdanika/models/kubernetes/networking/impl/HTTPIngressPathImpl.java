/**
 */
package org.nasdanika.models.kubernetes.networking.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.kubernetes.networking.HTTPIngressPath;
import org.nasdanika.models.kubernetes.networking.NetworkingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Ingress Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl#getPathType <em>Path Type</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.models.kubernetes.networking.impl.HTTPIngressPathImpl#getServicePort <em>Service Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPIngressPathImpl extends MinimalEObjectImpl.Container implements HTTPIngressPath {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPathType() <em>Path Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathType()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_PORT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPIngressPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.HTTP_INGRESS_PATH;
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
	public String getPath() {
		return (String)eDynamicGet(NetworkingPackage.HTTP_INGRESS_PATH__PATH, NetworkingPackage.Literals.HTTP_INGRESS_PATH__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(NetworkingPackage.HTTP_INGRESS_PATH__PATH, NetworkingPackage.Literals.HTTP_INGRESS_PATH__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathType() {
		return (String)eDynamicGet(NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE, NetworkingPackage.Literals.HTTP_INGRESS_PATH__PATH_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathType(String newPathType) {
		eDynamicSet(NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE, NetworkingPackage.Literals.HTTP_INGRESS_PATH__PATH_TYPE, newPathType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eDynamicGet(NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME, NetworkingPackage.Literals.HTTP_INGRESS_PATH__SERVICE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eDynamicSet(NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME, NetworkingPackage.Literals.HTTP_INGRESS_PATH__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServicePort() {
		return (Integer)eDynamicGet(NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT, NetworkingPackage.Literals.HTTP_INGRESS_PATH__SERVICE_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicePort(int newServicePort) {
		eDynamicSet(NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT, NetworkingPackage.Literals.HTTP_INGRESS_PATH__SERVICE_PORT, newServicePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH:
				return getPath();
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE:
				return getPathType();
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME:
				return getServiceName();
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT:
				return getServicePort();
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
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH:
				setPath((String)newValue);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE:
				setPathType((String)newValue);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT:
				setServicePort((Integer)newValue);
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
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE:
				setPathType(PATH_TYPE_EDEFAULT);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT:
				setServicePort(SERVICE_PORT_EDEFAULT);
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
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case NetworkingPackage.HTTP_INGRESS_PATH__PATH_TYPE:
				return PATH_TYPE_EDEFAULT == null ? getPathType() != null : !PATH_TYPE_EDEFAULT.equals(getPathType());
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? getServiceName() != null : !SERVICE_NAME_EDEFAULT.equals(getServiceName());
			case NetworkingPackage.HTTP_INGRESS_PATH__SERVICE_PORT:
				return getServicePort() != SERVICE_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //HTTPIngressPathImpl
