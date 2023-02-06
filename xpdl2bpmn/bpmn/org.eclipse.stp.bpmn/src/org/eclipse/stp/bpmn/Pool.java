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

package org.eclipse.stp.bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.Pool#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Pool#getBpmnDiagram <em>Bpmn Diagram</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Pool#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Pool#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Pool#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool()
 * @model extendedMetaData="name='Pool' kind='elementOnly'"
 * @generated
 */
public interface Pool extends Graph {
	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Lane}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Lane#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' containment reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool_Lanes()
	 * @see org.eclipse.stp.bpmn.Lane#getPool
	 * @model type="org.eclipse.stp.bpmn.Lane" opposite="pool" containment="true"
	 *        extendedMetaData="kind='element' name='lanes'"
	 * @generated
	 */
	EList getLanes();

	/**
	 * Returns the value of the '<em><b>Bpmn Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.BpmnDiagram#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Diagram</em>' container reference.
	 * @see #setBpmnDiagram(BpmnDiagram)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool_BpmnDiagram()
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getPools
	 * @model opposite="pools" transient="false"
	 *        extendedMetaData="kind='attribute' name='bpmnDiagram'"
	 * @generated
	 */
	BpmnDiagram getBpmnDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Pool#getBpmnDiagram <em>Bpmn Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Diagram</em>' container reference.
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	void setBpmnDiagram(BpmnDiagram value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Pool#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool_ID()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
    String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Pool#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
    void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getPool_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Pool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Pool