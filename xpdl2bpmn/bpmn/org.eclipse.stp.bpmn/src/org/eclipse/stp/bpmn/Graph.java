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
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stp.bpmn.Graph#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.eclipse.stp.bpmn.Graph#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stp.bpmn.BpmnPackage#getGraph()
 * @model extendedMetaData="name='Graph' kind='elementOnly'"
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Vertex}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Vertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getGraph_Vertices()
	 * @see org.eclipse.stp.bpmn.Vertex#getGraph
	 * @model type="org.eclipse.stp.bpmn.Vertex" opposite="graph" containment="true"
	 *        extendedMetaData="kind='element' name='vertices'"
	 * @generated
	 */
	EList getVertices();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.stp.bpmn.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.stp.bpmn.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.eclipse.stp.bpmn.BpmnPackage#getGraph_Edges()
	 * @see org.eclipse.stp.bpmn.Edge#getGraph
	 * @model type="org.eclipse.stp.bpmn.Edge" opposite="graph" containment="true"
	 *        extendedMetaData="kind='element' name='edges'"
	 * @generated
	 */
	EList getEdges();

} // Graph