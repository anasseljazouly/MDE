/******************************************************************************
* Copyright (c) 2006, Intalio Inc.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
*     Intalio Inc. - initial API and implementation
*******************************************************************************/

package org.eclipse.stp.bpmn.impl;



import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.Properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getBpmnDiagram <em>Bpmn Diagram</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.MessageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected Properties properties;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
    protected String iD = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Activity source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Activity target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProperties(Properties newProperties) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiagram getBpmnDiagram() {
		if (eContainerFeatureID() != BpmnPackage.MESSAGE__BPMN_DIAGRAM) return null;
		return (BpmnDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBpmnDiagram(BpmnDiagram newBpmnDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBpmnDiagram, BpmnPackage.MESSAGE__BPMN_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnDiagram(BpmnDiagram newBpmnDiagram) {
		if (newBpmnDiagram != eInternalContainer() || (eContainerFeatureID() != BpmnPackage.MESSAGE__BPMN_DIAGRAM && newBpmnDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newBpmnDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBpmnDiagram != null)
				msgs = ((InternalEObject)newBpmnDiagram).eInverseAdd(this, BpmnPackage.BPMN_DIAGRAM__MESSAGES, BpmnDiagram.class, msgs);
			msgs = basicSetBpmnDiagram(newBpmnDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__BPMN_DIAGRAM, newBpmnDiagram, newBpmnDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Activity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.MESSAGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Activity newSource, NotificationChain msgs) {
		Activity oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Activity newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, BpmnPackage.ACTIVITY__OUTGOING_MESSAGES, Activity.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, BpmnPackage.ACTIVITY__OUTGOING_MESSAGES, Activity.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Activity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.MESSAGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Activity newTarget, NotificationChain msgs) {
		Activity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Activity newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, BpmnPackage.ACTIVITY__INCOMING_MESSAGES, Activity.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, BpmnPackage.ACTIVITY__INCOMING_MESSAGES, Activity.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBpmnDiagram((BpmnDiagram)otherEnd, msgs);
			case BpmnPackage.MESSAGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, BpmnPackage.ACTIVITY__OUTGOING_MESSAGES, Activity.class, msgs);
				return basicSetSource((Activity)otherEnd, msgs);
			case BpmnPackage.MESSAGE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, BpmnPackage.ACTIVITY__INCOMING_MESSAGES, Activity.class, msgs);
				return basicSetTarget((Activity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				return basicSetBpmnDiagram(null, msgs);
			case BpmnPackage.MESSAGE__SOURCE:
				return basicSetSource(null, msgs);
			case BpmnPackage.MESSAGE__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, BpmnPackage.BPMN_DIAGRAM__MESSAGES, BpmnDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__PROPERTIES:
				return getProperties();
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				return getBpmnDiagram();
			case BpmnPackage.MESSAGE__DOCUMENTATION:
				return getDocumentation();
			case BpmnPackage.MESSAGE__ID:
				return getID();
			case BpmnPackage.MESSAGE__NAME:
				return getName();
			case BpmnPackage.MESSAGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case BpmnPackage.MESSAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				setBpmnDiagram((BpmnDiagram)newValue);
				return;
			case BpmnPackage.MESSAGE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case BpmnPackage.MESSAGE__ID:
				setID((String)newValue);
				return;
			case BpmnPackage.MESSAGE__NAME:
				setName((String)newValue);
				return;
			case BpmnPackage.MESSAGE__SOURCE:
				setSource((Activity)newValue);
				return;
			case BpmnPackage.MESSAGE__TARGET:
				setTarget((Activity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__PROPERTIES:
				setProperties((Properties)null);
				return;
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				setBpmnDiagram((BpmnDiagram)null);
				return;
			case BpmnPackage.MESSAGE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case BpmnPackage.MESSAGE__ID:
				setID(ID_EDEFAULT);
				return;
			case BpmnPackage.MESSAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpmnPackage.MESSAGE__SOURCE:
				setSource((Activity)null);
				return;
			case BpmnPackage.MESSAGE__TARGET:
				setTarget((Activity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnPackage.MESSAGE__PROPERTIES:
				return properties != null;
			case BpmnPackage.MESSAGE__BPMN_DIAGRAM:
				return getBpmnDiagram() != null;
			case BpmnPackage.MESSAGE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case BpmnPackage.MESSAGE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case BpmnPackage.MESSAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpmnPackage.MESSAGE__SOURCE:
				return source != null;
			case BpmnPackage.MESSAGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MessageImpl