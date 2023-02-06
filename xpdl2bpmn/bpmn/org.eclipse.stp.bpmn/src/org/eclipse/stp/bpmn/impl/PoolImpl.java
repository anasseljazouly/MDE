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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Lane;
import org.eclipse.stp.bpmn.Pool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.impl.PoolImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.PoolImpl#getBpmnDiagram <em>Bpmn Diagram</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.PoolImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.PoolImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.PoolImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends GraphImpl implements Pool {
	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList lanes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLanes() {
		if (lanes == null) {
			lanes = new EObjectContainmentWithInverseEList(Lane.class, this, BpmnPackage.POOL__LANES, BpmnPackage.LANE__POOL);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiagram getBpmnDiagram() {
		if (eContainerFeatureID() != BpmnPackage.POOL__BPMN_DIAGRAM) return null;
		return (BpmnDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBpmnDiagram(BpmnDiagram newBpmnDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBpmnDiagram, BpmnPackage.POOL__BPMN_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnDiagram(BpmnDiagram newBpmnDiagram) {
		if (newBpmnDiagram != eInternalContainer() || (eContainerFeatureID() != BpmnPackage.POOL__BPMN_DIAGRAM && newBpmnDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newBpmnDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBpmnDiagram != null)
				msgs = ((InternalEObject)newBpmnDiagram).eInverseAdd(this, BpmnPackage.BPMN_DIAGRAM__POOLS, BpmnDiagram.class, msgs);
			msgs = basicSetBpmnDiagram(newBpmnDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.POOL__BPMN_DIAGRAM, newBpmnDiagram, newBpmnDiagram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.POOL__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.POOL__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.POOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.POOL__LANES:
				return ((InternalEList)getLanes()).basicAdd(otherEnd, msgs);
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBpmnDiagram((BpmnDiagram)otherEnd, msgs);
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
			case BpmnPackage.POOL__LANES:
				return ((InternalEList)getLanes()).basicRemove(otherEnd, msgs);
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				return basicSetBpmnDiagram(null, msgs);
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
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, BpmnPackage.BPMN_DIAGRAM__POOLS, BpmnDiagram.class, msgs);
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
			case BpmnPackage.POOL__LANES:
				return getLanes();
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				return getBpmnDiagram();
			case BpmnPackage.POOL__DOCUMENTATION:
				return getDocumentation();
			case BpmnPackage.POOL__ID:
				return getID();
			case BpmnPackage.POOL__NAME:
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
			case BpmnPackage.POOL__LANES:
				getLanes().clear();
				getLanes().addAll((Collection)newValue);
				return;
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				setBpmnDiagram((BpmnDiagram)newValue);
				return;
			case BpmnPackage.POOL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case BpmnPackage.POOL__ID:
				setID((String)newValue);
				return;
			case BpmnPackage.POOL__NAME:
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
			case BpmnPackage.POOL__LANES:
				getLanes().clear();
				return;
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				setBpmnDiagram((BpmnDiagram)null);
				return;
			case BpmnPackage.POOL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case BpmnPackage.POOL__ID:
				setID(ID_EDEFAULT);
				return;
			case BpmnPackage.POOL__NAME:
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
			case BpmnPackage.POOL__LANES:
				return lanes != null && !lanes.isEmpty();
			case BpmnPackage.POOL__BPMN_DIAGRAM:
				return getBpmnDiagram() != null;
			case BpmnPackage.POOL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case BpmnPackage.POOL__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case BpmnPackage.POOL__NAME:
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PoolImpl