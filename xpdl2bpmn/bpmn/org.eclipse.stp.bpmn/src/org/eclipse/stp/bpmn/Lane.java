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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Lane#getPool <em>Pool</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane()
 * @model extendedMetaData="name='Lane' kind='elementOnly'"
 * @generated
 */
public interface Lane extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(Properties)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_Properties()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Lane#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Activity}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Activity#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activities</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_Activities()
	 * @see org.eclipse.stp.bpmn.Activity#getLane
	 * @model type="org.eclipse.stp.bpmn.Activity" opposite="lane" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='activities'"
	 * @generated
	 */
    EList getActivities();

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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Lane#getDocumentation <em>Documentation</em>}' attribute.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_ID()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
    String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Lane#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pool</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Pool#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool</em>' container reference.
	 * @see #setPool(Pool)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getLane_Pool()
	 * @see org.eclipse.stp.bpmn.Pool#getLanes
	 * @model opposite="lanes" transient="false"
	 *        extendedMetaData="kind='attribute' name='pool'"
	 * @generated
	 */
	Pool getPool();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Lane#getPool <em>Pool</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool</em>' container reference.
	 * @see #getPool()
	 * @generated
	 */
	void setPool(Pool value);

} // Lane