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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getPools <em>Pools</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.BpmnDiagram#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram()
 * @model extendedMetaData="name='BpmnDiagram' kind='elementOnly'"
 * @generated
 */
public interface BpmnDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Pools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Pool}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Pool#getBpmnDiagram <em>Bpmn Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pools</em>' containment reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Pools()
	 * @see org.eclipse.stp.bpmn.Pool#getBpmnDiagram
	 * @model type="org.eclipse.stp.bpmn.Pool" opposite="bpmnDiagram" containment="true"
	 *        extendedMetaData="kind='element' name='pools'"
	 * @generated
	 */
	EList getPools();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Message}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Message#getBpmnDiagram <em>Bpmn Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Messages()
	 * @see org.eclipse.stp.bpmn.Message#getBpmnDiagram
	 * @model type="org.eclipse.stp.bpmn.Message" opposite="bpmnDiagram" containment="true"
	 *        extendedMetaData="kind='element' name='messages'"
	 * @generated
	 */
	EList getMessages();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Author()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.BpmnDiagram#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.BpmnDiagram#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.BpmnDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getBpmnDiagram_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.BpmnDiagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // BpmnDiagram