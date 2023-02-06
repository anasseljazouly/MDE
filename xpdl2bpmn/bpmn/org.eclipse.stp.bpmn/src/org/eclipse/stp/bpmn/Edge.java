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
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge()
 * @model extendedMetaData="name='Edge' kind='elementOnly'"
 * @generated
 */
public interface Edge extends EObject {
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Properties()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Documentation()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Graph()
	 * @see org.eclipse.stp.bpmn.Graph#getEdges
	 * @model opposite="edges" transient="false"
	 *        extendedMetaData="kind='attribute' name='graph'"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_ID()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
    String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Vertex#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Source()
	 * @see org.eclipse.stp.bpmn.Vertex#getIncomingEdges
	 * @model opposite="incomingEdges"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getEdge_Target()
	 * @see org.eclipse.stp.bpmn.Vertex#getOutgoingEdges
	 * @model opposite="outgoingEdges"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.stp.bpmn.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

} // Edge