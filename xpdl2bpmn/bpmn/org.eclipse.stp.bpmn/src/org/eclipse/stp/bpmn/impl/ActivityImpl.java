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


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Lane;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.Properties;
import org.eclipse.stp.bpmn.SubProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * Mostly generated except the code to keep track of the ordered messages.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getIncomingMessages <em>Incoming Messages</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getOutgoingMessages <em>Outgoing Messages</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getOrderedMessages <em>Ordered Messages</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getEventHandlerFor <em>Event Handler For</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#isLooping <em>Looping</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.ActivityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends VertexImpl implements Activity {
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
	 * The cached value of the '{@link #getIncomingMessages() <em>Incoming Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingMessages()
	 * @generated
	 * @ordered
	 */
	protected EList incomingMessages;

	/**
	 * The cached value of the '{@link #getOutgoingMessages() <em>Outgoing Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingMessages()
	 * @generated
	 * @ordered
	 */
	protected EList outgoingMessages;

	/**
	 * The cached value of the '{@link #getOrderedMessages() <em>Ordered Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList orderedMessages;

	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_TYPE_EDEFAULT = ActivityType.TASK_LITERAL;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * This is true if the Activity Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityTypeESet;

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
	 * The cached value of the '{@link #getLane() <em>Lane</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLane()
	 * @generated
	 * @ordered
	 */
    protected Lane lane;

	/**
	 * The default value of the '{@link #isLooping() <em>Looping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLooping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLooping() <em>Looping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLooping()
	 * @generated
	 * @ordered
	 */
	protected boolean looping = LOOPING_EDEFAULT;

	/**
	 * This is true if the Looping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loopingESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncomingMessages() {
		if (incomingMessages == null) {
			incomingMessages = new EObjectWithInverseResolvingEList(Message.class, this, BpmnPackage.ACTIVITY__INCOMING_MESSAGES, BpmnPackage.MESSAGE__TARGET);
		}
		return incomingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutgoingMessages() {
		if (outgoingMessages == null) {
			outgoingMessages = new EObjectWithInverseResolvingEList(Message.class, this, BpmnPackage.ACTIVITY__OUTGOING_MESSAGES, BpmnPackage.MESSAGE__SOURCE);
		}
		return outgoingMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrderedMessages() {
		if (orderedMessages == null) {
			orderedMessages = new EObjectResolvingEList(Message.class, this, BpmnPackage.ACTIVITY__ORDERED_MESSAGES);
		}
		return orderedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityType(ActivityType newActivityType) {
		ActivityType oldActivityType = activityType;
		activityType = newActivityType == null ? ACTIVITY_TYPE_EDEFAULT : newActivityType;
		boolean oldActivityTypeESet = activityTypeESet;
		activityTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__ACTIVITY_TYPE, oldActivityType, activityType, !oldActivityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivityType() {
		ActivityType oldActivityType = activityType;
		boolean oldActivityTypeESet = activityTypeESet;
		activityType = ACTIVITY_TYPE_EDEFAULT;
		activityTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ACTIVITY__ACTIVITY_TYPE, oldActivityType, ACTIVITY_TYPE_EDEFAULT, oldActivityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivityType() {
		return activityTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess getEventHandlerFor() {
		if (eContainerFeatureID() != BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR) return null;
		return (SubProcess)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventHandlerFor(SubProcess newEventHandlerFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEventHandlerFor, BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandlerFor(SubProcess newEventHandlerFor) {
		if (newEventHandlerFor != eInternalContainer() || (eContainerFeatureID() != BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR && newEventHandlerFor != null)) {
			if (EcoreUtil.isAncestor(this, newEventHandlerFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEventHandlerFor != null)
				msgs = ((InternalEObject)newEventHandlerFor).eInverseAdd(this, BpmnPackage.SUB_PROCESS__EVENT_HANDLERS, SubProcess.class, msgs);
			msgs = basicSetEventHandlerFor(newEventHandlerFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR, newEventHandlerFor, newEventHandlerFor));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Lane getLane() {
		if (lane != null && lane.eIsProxy()) {
			InternalEObject oldLane = (InternalEObject)lane;
			lane = (Lane)eResolveProxy(oldLane);
			if (lane != oldLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.ACTIVITY__LANE, oldLane, lane));
			}
		}
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Lane basicGetLane() {
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLane(Lane newLane, NotificationChain msgs) {
		Lane oldLane = lane;
		lane = newLane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__LANE, oldLane, newLane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLane(Lane newLane) {
		if (newLane != lane) {
			NotificationChain msgs = null;
			if (lane != null)
				msgs = ((InternalEObject)lane).eInverseRemove(this, BpmnPackage.LANE__ACTIVITIES, Lane.class, msgs);
			if (newLane != null)
				msgs = ((InternalEObject)newLane).eInverseAdd(this, BpmnPackage.LANE__ACTIVITIES, Lane.class, msgs);
			msgs = basicSetLane(newLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__LANE, newLane, newLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLooping() {
		return looping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLooping(boolean newLooping) {
		boolean oldLooping = looping;
		looping = newLooping;
		boolean oldLoopingESet = loopingESet;
		loopingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__LOOPING, oldLooping, looping, !oldLoopingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLooping() {
		boolean oldLooping = looping;
		boolean oldLoopingESet = loopingESet;
		looping = LOOPING_EDEFAULT;
		loopingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.ACTIVITY__LOOPING, oldLooping, LOOPING_EDEFAULT, oldLoopingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLooping() {
		return loopingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ACTIVITY__NAME, oldName, name));
	}

    /**
     * <!-- begin-user-doc -->
     * Add the code to update the ordered messages
     * <!-- end-user-doc -->
     * @notgenerated
     */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
                msgs = ((InternalEList)getIncomingMessages()).basicAdd(otherEnd, msgs);
                return ((InternalEList)getOrderedMessages()).basicAdd(otherEnd, msgs);
            case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
                msgs = ((InternalEList)getOutgoingMessages()).basicAdd(otherEnd, msgs);
                return ((InternalEList)getOrderedMessages()).basicAdd(otherEnd, msgs);
            case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEventHandlerFor((SubProcess)otherEnd, msgs);
            case BpmnPackage.ACTIVITY__LANE:
                if (lane != null)
                    msgs = ((InternalEObject)lane).eInverseRemove(this, BpmnPackage.LANE__ACTIVITIES, Lane.class, msgs);
                return basicSetLane((Lane)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * Add the code to update the orderedMessage
     * <!-- end-user-doc -->
     * @notgenerated Added the ordered message update
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
                msgs = ((InternalEList)getIncomingMessages()).basicRemove(otherEnd, msgs);
                return ((InternalEList)getOrderedMessages()).basicRemove(otherEnd, msgs);
            case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
                msgs = ((InternalEList)getOutgoingMessages()).basicRemove(otherEnd, msgs);
                return ((InternalEList)getOrderedMessages()).basicRemove(otherEnd, msgs);
            case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
                return basicSetEventHandlerFor(null, msgs);
            case BpmnPackage.ACTIVITY__LANE:
                return basicSetLane(null, msgs);
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
			case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
				return eInternalContainer().eInverseRemove(this, BpmnPackage.SUB_PROCESS__EVENT_HANDLERS, SubProcess.class, msgs);
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
			case BpmnPackage.ACTIVITY__PROPERTIES:
				return getProperties();
			case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
				return getIncomingMessages();
			case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
				return getOutgoingMessages();
			case BpmnPackage.ACTIVITY__ORDERED_MESSAGES:
				return getOrderedMessages();
			case BpmnPackage.ACTIVITY__ACTIVITY_TYPE:
				return getActivityType();
			case BpmnPackage.ACTIVITY__DOCUMENTATION:
				return getDocumentation();
			case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
				return getEventHandlerFor();
			case BpmnPackage.ACTIVITY__LANE:
				if (resolve) return getLane();
				return basicGetLane();
			case BpmnPackage.ACTIVITY__LOOPING:
				return isLooping() ? Boolean.TRUE : Boolean.FALSE;
			case BpmnPackage.ACTIVITY__NAME:
				return getName();
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
			case BpmnPackage.ACTIVITY__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
				getIncomingMessages().clear();
				getIncomingMessages().addAll((Collection)newValue);
				return;
			case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
				getOutgoingMessages().clear();
				getOutgoingMessages().addAll((Collection)newValue);
				return;
			case BpmnPackage.ACTIVITY__ORDERED_MESSAGES:
				getOrderedMessages().clear();
				getOrderedMessages().addAll((Collection)newValue);
				return;
			case BpmnPackage.ACTIVITY__ACTIVITY_TYPE:
				setActivityType((ActivityType)newValue);
				return;
			case BpmnPackage.ACTIVITY__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
				setEventHandlerFor((SubProcess)newValue);
				return;
			case BpmnPackage.ACTIVITY__LANE:
				setLane((Lane)newValue);
				return;
			case BpmnPackage.ACTIVITY__LOOPING:
				setLooping(((Boolean)newValue).booleanValue());
				return;
			case BpmnPackage.ACTIVITY__NAME:
				setName((String)newValue);
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
			case BpmnPackage.ACTIVITY__PROPERTIES:
				setProperties((Properties)null);
				return;
			case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
				getIncomingMessages().clear();
				return;
			case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
				getOutgoingMessages().clear();
				return;
			case BpmnPackage.ACTIVITY__ORDERED_MESSAGES:
				getOrderedMessages().clear();
				return;
			case BpmnPackage.ACTIVITY__ACTIVITY_TYPE:
				unsetActivityType();
				return;
			case BpmnPackage.ACTIVITY__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
				setEventHandlerFor((SubProcess)null);
				return;
			case BpmnPackage.ACTIVITY__LANE:
				setLane((Lane)null);
				return;
			case BpmnPackage.ACTIVITY__LOOPING:
				unsetLooping();
				return;
			case BpmnPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
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
			case BpmnPackage.ACTIVITY__PROPERTIES:
				return properties != null;
			case BpmnPackage.ACTIVITY__INCOMING_MESSAGES:
				return incomingMessages != null && !incomingMessages.isEmpty();
			case BpmnPackage.ACTIVITY__OUTGOING_MESSAGES:
				return outgoingMessages != null && !outgoingMessages.isEmpty();
			case BpmnPackage.ACTIVITY__ORDERED_MESSAGES:
				return orderedMessages != null && !orderedMessages.isEmpty();
			case BpmnPackage.ACTIVITY__ACTIVITY_TYPE:
				return isSetActivityType();
			case BpmnPackage.ACTIVITY__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR:
				return getEventHandlerFor() != null;
			case BpmnPackage.ACTIVITY__LANE:
				return lane != null;
			case BpmnPackage.ACTIVITY__LOOPING:
				return isSetLooping();
			case BpmnPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (activityType: ");
		if (activityTypeESet) result.append(activityType); else result.append("<unset>");
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", looping: ");
		if (loopingESet) result.append(looping); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl