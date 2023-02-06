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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Edge;
import org.eclipse.stp.bpmn.Graph;
import org.eclipse.stp.bpmn.SubProcess;
import org.eclipse.stp.bpmn.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.impl.SubProcessImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.SubProcessImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.SubProcessImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.impl.SubProcessImpl#isIsTransaction <em>Is Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList vertices;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList edges;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList eventHandlers;

	/**
	 * The default value of the '{@link #isIsTransaction() <em>Is Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTransaction() <em>Is Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransaction()
	 * @generated
	 * @ordered
	 */
	protected boolean isTransaction = IS_TRANSACTION_EDEFAULT;

	/**
	 * This is true if the Is Transaction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTransactionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentWithInverseEList(Vertex.class, this, BpmnPackage.SUB_PROCESS__VERTICES, BpmnPackage.VERTEX__GRAPH);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList(Edge.class, this, BpmnPackage.SUB_PROCESS__EDGES, BpmnPackage.EDGE__GRAPH);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEventHandlers() {
		if (eventHandlers == null) {
			eventHandlers = new EObjectContainmentWithInverseEList(Activity.class, this, BpmnPackage.SUB_PROCESS__EVENT_HANDLERS, BpmnPackage.ACTIVITY__EVENT_HANDLER_FOR);
		}
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTransaction() {
		return isTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransaction(boolean newIsTransaction) {
		boolean oldIsTransaction = isTransaction;
		isTransaction = newIsTransaction;
		boolean oldIsTransactionESet = isTransactionESet;
		isTransactionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SUB_PROCESS__IS_TRANSACTION, oldIsTransaction, isTransaction, !oldIsTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsTransaction() {
		boolean oldIsTransaction = isTransaction;
		boolean oldIsTransactionESet = isTransactionESet;
		isTransaction = IS_TRANSACTION_EDEFAULT;
		isTransactionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BpmnPackage.SUB_PROCESS__IS_TRANSACTION, oldIsTransaction, IS_TRANSACTION_EDEFAULT, oldIsTransactionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsTransaction() {
		return isTransactionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.SUB_PROCESS__VERTICES:
				return ((InternalEList)getVertices()).basicAdd(otherEnd, msgs);
			case BpmnPackage.SUB_PROCESS__EDGES:
				return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				return ((InternalEList)getEventHandlers()).basicAdd(otherEnd, msgs);
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
			case BpmnPackage.SUB_PROCESS__VERTICES:
				return ((InternalEList)getVertices()).basicRemove(otherEnd, msgs);
			case BpmnPackage.SUB_PROCESS__EDGES:
				return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				return ((InternalEList)getEventHandlers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.SUB_PROCESS__VERTICES:
				return getVertices();
			case BpmnPackage.SUB_PROCESS__EDGES:
				return getEdges();
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				return getEventHandlers();
			case BpmnPackage.SUB_PROCESS__IS_TRANSACTION:
				return isIsTransaction() ? Boolean.TRUE : Boolean.FALSE;
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
			case BpmnPackage.SUB_PROCESS__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection)newValue);
				return;
			case BpmnPackage.SUB_PROCESS__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				getEventHandlers().clear();
				getEventHandlers().addAll((Collection)newValue);
				return;
			case BpmnPackage.SUB_PROCESS__IS_TRANSACTION:
				setIsTransaction(((Boolean)newValue).booleanValue());
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
			case BpmnPackage.SUB_PROCESS__VERTICES:
				getVertices().clear();
				return;
			case BpmnPackage.SUB_PROCESS__EDGES:
				getEdges().clear();
				return;
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				getEventHandlers().clear();
				return;
			case BpmnPackage.SUB_PROCESS__IS_TRANSACTION:
				unsetIsTransaction();
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
			case BpmnPackage.SUB_PROCESS__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case BpmnPackage.SUB_PROCESS__EDGES:
				return edges != null && !edges.isEmpty();
			case BpmnPackage.SUB_PROCESS__EVENT_HANDLERS:
				return eventHandlers != null && !eventHandlers.isEmpty();
			case BpmnPackage.SUB_PROCESS__IS_TRANSACTION:
				return isSetIsTransaction();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Graph.class) {
			switch (derivedFeatureID) {
				case BpmnPackage.SUB_PROCESS__VERTICES: return BpmnPackage.GRAPH__VERTICES;
				case BpmnPackage.SUB_PROCESS__EDGES: return BpmnPackage.GRAPH__EDGES;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Graph.class) {
			switch (baseFeatureID) {
				case BpmnPackage.GRAPH__VERTICES: return BpmnPackage.SUB_PROCESS__VERTICES;
				case BpmnPackage.GRAPH__EDGES: return BpmnPackage.SUB_PROCESS__EDGES;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isTransaction: ");
		if (isTransactionESet) result.append(isTransaction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubProcessImpl