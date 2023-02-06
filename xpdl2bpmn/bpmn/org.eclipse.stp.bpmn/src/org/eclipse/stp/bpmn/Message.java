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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getBpmnDiagram <em>Bpmn Diagram</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Message#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage()
 * @model extendedMetaData="name='Message' kind='elementOnly'"
 * @generated
 */
public interface Message extends EObject {
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_Properties()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
    Properties getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
    void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Bpmn Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.BpmnDiagram#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Diagram</em>' container reference.
	 * @see #setBpmnDiagram(BpmnDiagram)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_BpmnDiagram()
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getMessages
	 * @model opposite="messages" transient="false"
	 *        extendedMetaData="kind='attribute' name='bpmnDiagram'"
	 * @generated
	 */
	BpmnDiagram getBpmnDiagram();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getBpmnDiagram <em>Bpmn Diagram</em>}' container reference.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getDocumentation <em>Documentation</em>}' attribute.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_ID()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
    String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Activity#getOutgoingMessages <em>Outgoing Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Activity)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_Source()
	 * @see org.eclipse.stp.bpmn.Activity#getOutgoingMessages
	 * @model opposite="outgoingMessages"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	Activity getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Activity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Activity#getIncomingMessages <em>Incoming Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getMessage_Target()
	 * @see org.eclipse.stp.bpmn.Activity#getIncomingMessages
	 * @model opposite="incomingMessages"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Message#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

} // Message