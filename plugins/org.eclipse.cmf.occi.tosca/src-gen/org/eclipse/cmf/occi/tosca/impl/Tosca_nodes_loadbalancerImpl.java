/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.tosca.impl;

import java.util.Map;

import org.eclipse.cmf.occi.tosca.ToscaPackage;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint;
import org.eclipse.cmf.occi.tosca.Tosca_capabilities_endpoint_public;
import org.eclipse.cmf.occi.tosca.Tosca_nodes_loadbalancer;
import org.eclipse.cmf.occi.tosca.initiatorEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tosca nodes loadbalancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getNetworkName <em>Network Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getUrlPath <em>Url Path</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getFloating <em>Floating</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getDnsName <em>Dns Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.tosca.impl.Tosca_nodes_loadbalancerImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tosca_nodes_loadbalancerImpl extends Tosca_nodes_rootImpl implements Tosca_nodes_loadbalancer {
	/**
	 * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortName()
	 * @generated
	 * @ordered
	 */
	protected String portName = PORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = "tcp";

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Short PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Short port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final initiatorEnum INITIATOR_EDEFAULT = initiatorEnum.SOURCE;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected initiatorEnum initiator = INITIATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NAME_EDEFAULT = "PRIVATE";

	/**
	 * The cached value of the '{@link #getNetworkName() <em>Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String networkName = NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SECURE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSecure() <em>Secure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected Boolean secure = SECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Map PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected Map ports = PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPath()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlPath() <em>Url Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPath()
	 * @generated
	 * @ordered
	 */
	protected String urlPath = URL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FLOATING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFloating() <em>Floating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloating()
	 * @generated
	 * @ordered
	 */
	protected Boolean floating = FLOATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected String dnsName = DNS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tosca_nodes_loadbalancerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TOSCA_NODES_LOADBALANCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortName() {
		return portName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortName(String newPortName) {
		String oldPortName = portName;
		portName = newPortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME, oldPortName, portName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Short newPort) {
		Short oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public initiatorEnum getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(initiatorEnum newInitiator) {
		initiatorEnum oldInitiator = initiator;
		initiator = newInitiator == null ? INITIATOR_EDEFAULT : newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkName(String newNetworkName) {
		String oldNetworkName = networkName;
		networkName = newNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME, oldNetworkName, networkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSecure() {
		return secure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecure(Boolean newSecure) {
		Boolean oldSecure = secure;
		secure = newSecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE, oldSecure, secure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(Map newPorts) {
		Map oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS, oldPorts, ports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlPath() {
		return urlPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlPath(String newUrlPath) {
		String oldUrlPath = urlPath;
		urlPath = newUrlPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH, oldUrlPath, urlPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFloating() {
		return floating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloating(Boolean newFloating) {
		Boolean oldFloating = floating;
		floating = newFloating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING, oldFloating, floating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDnsName() {
		return dnsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsName(String newDnsName) {
		String oldDnsName = dnsName;
		dnsName = newDnsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME, oldDnsName, dnsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOSCA_NODES_LOADBALANCER__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME:
				return getPortName();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL:
				return getProtocol();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT:
				return getPort();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR:
				return getInitiator();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME:
				return getNetworkName();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE:
				return getSecure();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS:
				return getPorts();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH:
				return getUrlPath();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING:
				return getFloating();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME:
				return getDnsName();
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__ALGORITHM:
				return getAlgorithm();
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
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME:
				setPortName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT:
				setPort((Short)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR:
				setInitiator((initiatorEnum)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME:
				setNetworkName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE:
				setSecure((Boolean)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS:
				setPorts((Map)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH:
				setUrlPath((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING:
				setFloating((Boolean)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME:
				setDnsName((String)newValue);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__ALGORITHM:
				setAlgorithm((String)newValue);
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
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME:
				setPortName(PORT_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME:
				setNetworkName(NETWORK_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE:
				setSecure(SECURE_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS:
				setPorts(PORTS_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH:
				setUrlPath(URL_PATH_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING:
				setFloating(FLOATING_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME:
				setDnsName(DNS_NAME_EDEFAULT);
				return;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
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
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME:
				return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME:
				return NETWORK_NAME_EDEFAULT == null ? networkName != null : !NETWORK_NAME_EDEFAULT.equals(networkName);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE:
				return SECURE_EDEFAULT == null ? secure != null : !SECURE_EDEFAULT.equals(secure);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS:
				return PORTS_EDEFAULT == null ? ports != null : !PORTS_EDEFAULT.equals(ports);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH:
				return URL_PATH_EDEFAULT == null ? urlPath != null : !URL_PATH_EDEFAULT.equals(urlPath);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING:
				return FLOATING_EDEFAULT == null ? floating != null : !FLOATING_EDEFAULT.equals(floating);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME:
				return DNS_NAME_EDEFAULT == null ? dnsName != null : !DNS_NAME_EDEFAULT.equals(dnsName);
			case ToscaPackage.TOSCA_NODES_LOADBALANCER__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_public.class) {
			switch (derivedFeatureID) {
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING;
				case ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME: return ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tosca_capabilities_endpoint.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT_NAME: return ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PROTOCOL: return ToscaPackage.TOSCA_NODES_LOADBALANCER__PROTOCOL;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORT: return ToscaPackage.TOSCA_NODES_LOADBALANCER__PORT;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__INITIATOR: return ToscaPackage.TOSCA_NODES_LOADBALANCER__INITIATOR;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__NETWORK_NAME: return ToscaPackage.TOSCA_NODES_LOADBALANCER__NETWORK_NAME;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__SECURE: return ToscaPackage.TOSCA_NODES_LOADBALANCER__SECURE;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__PORTS: return ToscaPackage.TOSCA_NODES_LOADBALANCER__PORTS;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT__URL_PATH: return ToscaPackage.TOSCA_NODES_LOADBALANCER__URL_PATH;
				default: return -1;
			}
		}
		if (baseClass == Tosca_capabilities_endpoint_public.class) {
			switch (baseFeatureID) {
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__FLOATING: return ToscaPackage.TOSCA_NODES_LOADBALANCER__FLOATING;
				case ToscaPackage.TOSCA_CAPABILITIES_ENDPOINT_PUBLIC__DNS_NAME: return ToscaPackage.TOSCA_NODES_LOADBALANCER__DNS_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (portName: ");
		result.append(portName);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", port: ");
		result.append(port);
		result.append(", initiator: ");
		result.append(initiator);
		result.append(", networkName: ");
		result.append(networkName);
		result.append(", secure: ");
		result.append(secure);
		result.append(", ports: ");
		result.append(ports);
		result.append(", urlPath: ");
		result.append(urlPath);
		result.append(", floating: ");
		result.append(floating);
		result.append(", dnsName: ");
		result.append(dnsName);
		result.append(", algorithm: ");
		result.append(algorithm);
		result.append(')');
		return result.toString();
	}

} //Tosca_nodes_loadbalancerImpl
