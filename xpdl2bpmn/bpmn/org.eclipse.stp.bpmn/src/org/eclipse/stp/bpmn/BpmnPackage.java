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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stp.bpmn.BpmnFactory
 * @model kind="package"
 * @generated
 */
public interface BpmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://stp.eclipse.org/bpmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpmnPackage eINSTANCE = org.eclipse.stp.bpmn.impl.BpmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.VertexImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 10;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_EDGES = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_EDGES = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__GRAPH = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VERTEX__ID = 3;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.ActivityImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_EDGES = VERTEX__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_EDGES = VERTEX__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GRAPH = VERTEX__GRAPH;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVITY__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTIES = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_MESSAGES = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_MESSAGES = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordered Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ORDERED_MESSAGES = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTIVITY_TYPE = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Handler For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EVENT_HANDLER_FOR = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTIVITY__LANE = VERTEX_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Looping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOOPING = VERTEX_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = VERTEX_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.BpmnDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.BpmnDiagramImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getBpmnDiagram()
	 * @generated
	 */
	int BPMN_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Pools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__POOLS = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM__TITLE = 5;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.EdgeImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__GRAPH = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EDGE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 6;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.GraphImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VERTICES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.LaneImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LANE__ACTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LANE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__POOL = 5;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.MessageImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MESSAGE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Bpmn Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BPMN_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MESSAGE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TARGET = 6;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.PoolImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 6;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__VERTICES = GRAPH__VERTICES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__EDGES = GRAPH__EDGES;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LANES = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bpmn Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__BPMN_DIAGRAM = GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__DOCUMENTATION = GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POOL__ID = GRAPH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME = GRAPH_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.PropertiesImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.PropertiesTypeImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.impl.SubProcessImpl
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 9;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING_EDGES = ACTIVITY__INCOMING_EDGES;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING_EDGES = ACTIVITY__OUTGOING_EDGES;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__GRAPH = ACTIVITY__GRAPH;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUB_PROCESS__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Incoming Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING_MESSAGES = ACTIVITY__INCOMING_MESSAGES;

	/**
	 * The feature id for the '<em><b>Outgoing Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING_MESSAGES = ACTIVITY__OUTGOING_MESSAGES;

	/**
	 * The feature id for the '<em><b>Ordered Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ORDERED_MESSAGES = ACTIVITY__ORDERED_MESSAGES;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ACTIVITY_TYPE = ACTIVITY__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Event Handler For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EVENT_HANDLER_FOR = ACTIVITY__EVENT_HANDLER_FOR;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUB_PROCESS__LANE = ACTIVITY__LANE;

	/**
	 * The feature id for the '<em><b>Looping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOOPING = ACTIVITY__LOOPING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__VERTICES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EDGES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EVENT_HANDLERS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_TRANSACTION = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.stp.bpmn.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.ActivityType
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 11;

	/**
	 * The meta object id for the '<em>Activity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.stp.bpmn.ActivityType
	 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivityTypeObject()
	 * @generated
	 */
	int ACTIVITY_TYPE_OBJECT = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.stp.bpmn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Activity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getProperties()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Properties();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Activity#getIncomingMessages <em>Incoming Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Messages</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getIncomingMessages()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_IncomingMessages();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Activity#getOutgoingMessages <em>Outgoing Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Messages</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getOutgoingMessages()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OutgoingMessages();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Activity#getOrderedMessages <em>Ordered Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Messages</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getOrderedMessages()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OrderedMessages();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Activity#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getActivityType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_ActivityType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Activity#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getDocumentation()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Documentation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Activity#getEventHandlerFor <em>Event Handler For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event Handler For</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getEventHandlerFor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_EventHandlerFor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Activity#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lane</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getLane()
	 * @see #getActivity()
	 * @generated
	 */
    EReference getActivity_Lane();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Activity#isLooping <em>Looping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Looping</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#isLooping()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Looping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.BpmnDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram
	 * @generated
	 */
	EClass getBpmnDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.BpmnDiagram#getPools <em>Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pools</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getPools()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EReference getBpmnDiagram_Pools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.BpmnDiagram#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getMessages()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EReference getBpmnDiagram_Messages();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.BpmnDiagram#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getAuthor()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EAttribute getBpmnDiagram_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.BpmnDiagram#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getDocumentation()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EAttribute getBpmnDiagram_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.BpmnDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getName()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EAttribute getBpmnDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.BpmnDiagram#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.stp.bpmn.BpmnDiagram#getTitle()
	 * @see #getBpmnDiagram()
	 * @generated
	 */
	EAttribute getBpmnDiagram_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.eclipse.stp.bpmn.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Edge#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getProperties()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Edge#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getDocumentation()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Documentation();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getGraph()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Graph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Edge#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getID()
	 * @see #getEdge()
	 * @generated
	 */
    EAttribute getEdge_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Edge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getName()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.stp.bpmn.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.eclipse.stp.bpmn.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see org.eclipse.stp.bpmn.Graph#getVertices()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Vertices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.eclipse.stp.bpmn.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see org.eclipse.stp.bpmn.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Lane#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getProperties()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Properties();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Lane#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getActivities()
	 * @see #getLane()
	 * @generated
	 */
    EReference getLane_Activities();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Lane#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getDocumentation()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Lane#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getID()
	 * @see #getLane()
	 * @generated
	 */
    EAttribute getLane_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Lane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getName()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Lane#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pool</em>'.
	 * @see org.eclipse.stp.bpmn.Lane#getPool()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Pool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.eclipse.stp.bpmn.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Message#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getProperties()
	 * @see #getMessage()
	 * @generated
	 */
    EReference getMessage_Properties();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Message#getBpmnDiagram <em>Bpmn Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bpmn Diagram</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getBpmnDiagram()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_BpmnDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Message#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getDocumentation()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Message#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getID()
	 * @see #getMessage()
	 * @generated
	 */
    EAttribute getMessage_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Message#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getSource()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.stp.bpmn.Message#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.stp.bpmn.Message#getTarget()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see org.eclipse.stp.bpmn.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.Pool#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see org.eclipse.stp.bpmn.Pool#getLanes()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Lanes();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Pool#getBpmnDiagram <em>Bpmn Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bpmn Diagram</em>'.
	 * @see org.eclipse.stp.bpmn.Pool#getBpmnDiagram()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_BpmnDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Pool#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.stp.bpmn.Pool#getDocumentation()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Pool#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.stp.bpmn.Pool#getID()
	 * @see #getPool()
	 * @generated
	 */
    EAttribute getPool_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Pool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.stp.bpmn.Pool#getName()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.stp.bpmn.Properties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.eclipse.stp.bpmn.Properties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Properties();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        keyExtendedMetaData="kind='attribute' name='key'"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.xml.type.String"
	 *        valueExtendedMetaData="kind='attribute' name='value'"
	 *        extendedMetaData="name='properties_._type' kind='empty'"
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see org.eclipse.stp.bpmn.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.stp.bpmn.SubProcess#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Handlers</em>'.
	 * @see org.eclipse.stp.bpmn.SubProcess#getEventHandlers()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_EventHandlers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.SubProcess#isIsTransaction <em>Is Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transaction</em>'.
	 * @see org.eclipse.stp.bpmn.SubProcess#isIsTransaction()
	 * @see #getSubProcess()
	 * @generated
	 */
	EAttribute getSubProcess_IsTransaction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.stp.bpmn.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.eclipse.stp.bpmn.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Vertex#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see org.eclipse.stp.bpmn.Vertex#getIncomingEdges()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingEdges();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.stp.bpmn.Vertex#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see org.eclipse.stp.bpmn.Vertex#getOutgoingEdges()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingEdges();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.stp.bpmn.Vertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see org.eclipse.stp.bpmn.Vertex#getGraph()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Graph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.stp.bpmn.Vertex#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.stp.bpmn.Vertex#getID()
	 * @see #getVertex()
	 * @generated
	 */
    EAttribute getVertex_ID();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.stp.bpmn.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see org.eclipse.stp.bpmn.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.stp.bpmn.ActivityType <em>Activity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Activity Type Object</em>'.
	 * @see org.eclipse.stp.bpmn.ActivityType
	 * @model instanceClass="org.eclipse.stp.bpmn.ActivityType"
	 *        extendedMetaData="name='ActivityType:Object' baseType='ActivityType'"
	 * @generated
	 */
	EDataType getActivityTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpmnFactory getBpmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.ActivityImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PROPERTIES = eINSTANCE.getActivity_Properties();

		/**
		 * The meta object literal for the '<em><b>Incoming Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INCOMING_MESSAGES = eINSTANCE.getActivity_IncomingMessages();

		/**
		 * The meta object literal for the '<em><b>Outgoing Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTGOING_MESSAGES = eINSTANCE.getActivity_OutgoingMessages();

		/**
		 * The meta object literal for the '<em><b>Ordered Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ORDERED_MESSAGES = eINSTANCE.getActivity_OrderedMessages();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACTIVITY_TYPE = eINSTANCE.getActivity_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__DOCUMENTATION = eINSTANCE.getActivity_Documentation();

		/**
		 * The meta object literal for the '<em><b>Event Handler For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EVENT_HANDLER_FOR = eINSTANCE.getActivity_EventHandlerFor();

		/**
		 * The meta object literal for the '<em><b>Lane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTIVITY__LANE = eINSTANCE.getActivity_Lane();

		/**
		 * The meta object literal for the '<em><b>Looping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__LOOPING = eINSTANCE.getActivity_Looping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.BpmnDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.BpmnDiagramImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getBpmnDiagram()
		 * @generated
		 */
		EClass BPMN_DIAGRAM = eINSTANCE.getBpmnDiagram();

		/**
		 * The meta object literal for the '<em><b>Pools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DIAGRAM__POOLS = eINSTANCE.getBpmnDiagram_Pools();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN_DIAGRAM__MESSAGES = eINSTANCE.getBpmnDiagram_Messages();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_DIAGRAM__AUTHOR = eINSTANCE.getBpmnDiagram_Author();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_DIAGRAM__DOCUMENTATION = eINSTANCE.getBpmnDiagram_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_DIAGRAM__NAME = eINSTANCE.getBpmnDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN_DIAGRAM__TITLE = eINSTANCE.getBpmnDiagram_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.EdgeImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__PROPERTIES = eINSTANCE.getEdge_Properties();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__DOCUMENTATION = eINSTANCE.getEdge_Documentation();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__GRAPH = eINSTANCE.getEdge_Graph();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute EDGE__ID = eINSTANCE.getEdge_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.GraphImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__VERTICES = eINSTANCE.getGraph_Vertices();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.LaneImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__PROPERTIES = eINSTANCE.getLane_Properties();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference LANE__ACTIVITIES = eINSTANCE.getLane_Activities();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__DOCUMENTATION = eINSTANCE.getLane_Documentation();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LANE__ID = eINSTANCE.getLane_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__NAME = eINSTANCE.getLane_Name();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__POOL = eINSTANCE.getLane_Pool();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.MessageImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MESSAGE__PROPERTIES = eINSTANCE.getMessage_Properties();

		/**
		 * The meta object literal for the '<em><b>Bpmn Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__BPMN_DIAGRAM = eINSTANCE.getMessage_BpmnDiagram();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DOCUMENTATION = eINSTANCE.getMessage_Documentation();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MESSAGE__ID = eINSTANCE.getMessage_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SOURCE = eINSTANCE.getMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TARGET = eINSTANCE.getMessage_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.PoolImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__LANES = eINSTANCE.getPool_Lanes();

		/**
		 * The meta object literal for the '<em><b>Bpmn Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__BPMN_DIAGRAM = eINSTANCE.getPool_BpmnDiagram();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__DOCUMENTATION = eINSTANCE.getPool_Documentation();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POOL__ID = eINSTANCE.getPool_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__NAME = eINSTANCE.getPool_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.PropertiesImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.PropertiesTypeImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__KEY = eINSTANCE.getPropertiesType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__VALUE = eINSTANCE.getPropertiesType_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.SubProcessImpl <em>Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.SubProcessImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getSubProcess()
		 * @generated
		 */
		EClass SUB_PROCESS = eINSTANCE.getSubProcess();

		/**
		 * The meta object literal for the '<em><b>Event Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROCESS__EVENT_HANDLERS = eINSTANCE.getSubProcess_EventHandlers();

		/**
		 * The meta object literal for the '<em><b>Is Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS__IS_TRANSACTION = eINSTANCE.getSubProcess_IsTransaction();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.impl.VertexImpl
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING_EDGES = eINSTANCE.getVertex_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING_EDGES = eINSTANCE.getVertex_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__GRAPH = eINSTANCE.getVertex_Graph();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute VERTEX__ID = eINSTANCE.getVertex_ID();

		/**
		 * The meta object literal for the '{@link org.eclipse.stp.bpmn.ActivityType <em>Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.ActivityType
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '<em>Activity Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.stp.bpmn.ActivityType
		 * @see org.eclipse.stp.bpmn.impl.BpmnPackageImpl#getActivityTypeObject()
		 * @generated
		 */
		EDataType ACTIVITY_TYPE_OBJECT = eINSTANCE.getActivityTypeObject();

	}

} //BpmnPackage
