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


import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnFactory;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Edge;
import org.eclipse.stp.bpmn.Graph;
import org.eclipse.stp.bpmn.Lane;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.Pool;
import org.eclipse.stp.bpmn.Properties;
import org.eclipse.stp.bpmn.SubProcess;
import org.eclipse.stp.bpmn.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnPackageImpl extends EPackageImpl implements BpmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activityTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stp.bpmn.BpmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnPackageImpl() {
		super(eNS_URI, BpmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BpmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BpmnPackage init() {
		if (isInited) return (BpmnPackage)EPackage.Registry.INSTANCE.getEPackage(BpmnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBpmnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BpmnPackageImpl theBpmnPackage = registeredBpmnPackage instanceof BpmnPackageImpl ? (BpmnPackageImpl)registeredBpmnPackage : new BpmnPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBpmnPackage.createPackageContents();

		// Initialize created meta-data
		theBpmnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpmnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnPackage.eNS_URI, theBpmnPackage);
		return theBpmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Properties() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_IncomingMessages() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OutgoingMessages() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OrderedMessages() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_ActivityType() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Documentation() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_EventHandlerFor() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActivity_Lane() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Looping() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpmnDiagram() {
		return bpmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpmnDiagram_Pools() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpmnDiagram_Messages() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBpmnDiagram_Author() {
		return (EAttribute)bpmnDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBpmnDiagram_Documentation() {
		return (EAttribute)bpmnDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBpmnDiagram_Name() {
		return (EAttribute)bpmnDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBpmnDiagram_Title() {
		return (EAttribute)bpmnDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Properties() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Documentation() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Graph() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEdge_ID() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Name() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Vertices() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Edges() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Properties() {
		return (EReference)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getLane_Activities() {
		return (EReference)laneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLane_Documentation() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLane_ID() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLane_Name() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Pool() {
		return (EReference)laneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMessage_Properties() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_BpmnDiagram() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Documentation() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMessage_ID() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Source() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Target() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_Lanes() {
		return (EReference)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPool_BpmnDiagram() {
		return (EReference)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPool_Documentation() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getPool_ID() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPool_Name() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Properties() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesType_Key() {
		return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesType_Value() {
		return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubProcess() {
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubProcess_EventHandlers() {
		return (EReference)subProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubProcess_IsTransaction() {
		return (EAttribute)subProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_IncomingEdges() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_OutgoingEdges() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Graph() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getVertex_ID() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityType() {
		return activityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActivityTypeObject() {
		return activityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnFactory getBpmnFactory() {
		return (BpmnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PROPERTIES);
		createEReference(activityEClass, ACTIVITY__INCOMING_MESSAGES);
		createEReference(activityEClass, ACTIVITY__OUTGOING_MESSAGES);
		createEReference(activityEClass, ACTIVITY__ORDERED_MESSAGES);
		createEAttribute(activityEClass, ACTIVITY__ACTIVITY_TYPE);
		createEAttribute(activityEClass, ACTIVITY__DOCUMENTATION);
		createEReference(activityEClass, ACTIVITY__EVENT_HANDLER_FOR);
		createEReference(activityEClass, ACTIVITY__LANE);
		createEAttribute(activityEClass, ACTIVITY__LOOPING);
		createEAttribute(activityEClass, ACTIVITY__NAME);

		bpmnDiagramEClass = createEClass(BPMN_DIAGRAM);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__POOLS);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__MESSAGES);
		createEAttribute(bpmnDiagramEClass, BPMN_DIAGRAM__AUTHOR);
		createEAttribute(bpmnDiagramEClass, BPMN_DIAGRAM__DOCUMENTATION);
		createEAttribute(bpmnDiagramEClass, BPMN_DIAGRAM__NAME);
		createEAttribute(bpmnDiagramEClass, BPMN_DIAGRAM__TITLE);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__PROPERTIES);
		createEAttribute(edgeEClass, EDGE__DOCUMENTATION);
		createEReference(edgeEClass, EDGE__GRAPH);
		createEAttribute(edgeEClass, EDGE__ID);
		createEAttribute(edgeEClass, EDGE__NAME);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__VERTICES);
		createEReference(graphEClass, GRAPH__EDGES);

		laneEClass = createEClass(LANE);
		createEReference(laneEClass, LANE__PROPERTIES);
		createEReference(laneEClass, LANE__ACTIVITIES);
		createEAttribute(laneEClass, LANE__DOCUMENTATION);
		createEAttribute(laneEClass, LANE__ID);
		createEAttribute(laneEClass, LANE__NAME);
		createEReference(laneEClass, LANE__POOL);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__PROPERTIES);
		createEReference(messageEClass, MESSAGE__BPMN_DIAGRAM);
		createEAttribute(messageEClass, MESSAGE__DOCUMENTATION);
		createEAttribute(messageEClass, MESSAGE__ID);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEReference(messageEClass, MESSAGE__SOURCE);
		createEReference(messageEClass, MESSAGE__TARGET);

		poolEClass = createEClass(POOL);
		createEReference(poolEClass, POOL__LANES);
		createEReference(poolEClass, POOL__BPMN_DIAGRAM);
		createEAttribute(poolEClass, POOL__DOCUMENTATION);
		createEAttribute(poolEClass, POOL__ID);
		createEAttribute(poolEClass, POOL__NAME);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__KEY);
		createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__VALUE);

		subProcessEClass = createEClass(SUB_PROCESS);
		createEReference(subProcessEClass, SUB_PROCESS__EVENT_HANDLERS);
		createEAttribute(subProcessEClass, SUB_PROCESS__IS_TRANSACTION);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__INCOMING_EDGES);
		createEReference(vertexEClass, VERTEX__OUTGOING_EDGES);
		createEReference(vertexEClass, VERTEX__GRAPH);
		createEAttribute(vertexEClass, VERTEX__ID);

		// Create enums
		activityTypeEEnum = createEEnum(ACTIVITY_TYPE);

		// Create data types
		activityTypeObjectEDataType = createEDataType(ACTIVITY_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getVertex());
		poolEClass.getESuperTypes().add(this.getGraph());
		subProcessEClass.getESuperTypes().add(this.getActivity());
		subProcessEClass.getESuperTypes().add(this.getGraph());

		// Initialize classes and features; add operations and parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Properties(), this.getProperties(), null, "properties", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_IncomingMessages(), this.getMessage(), this.getMessage_Target(), "incomingMessages", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OutgoingMessages(), this.getMessage(), this.getMessage_Source(), "outgoingMessages", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OrderedMessages(), this.getMessage(), null, "orderedMessages", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_ActivityType(), this.getActivityType(), "activityType", "Task", 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_EventHandlerFor(), this.getSubProcess(), this.getSubProcess_EventHandlers(), "eventHandlerFor", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Lane(), this.getLane(), this.getLane_Activities(), "lane", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Looping(), theXMLTypePackage.getBoolean(), "looping", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmnDiagramEClass, BpmnDiagram.class, "BpmnDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpmnDiagram_Pools(), this.getPool(), this.getPool_BpmnDiagram(), "pools", null, 0, -1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBpmnDiagram_Messages(), this.getMessage(), this.getMessage_BpmnDiagram(), "messages", null, 0, -1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBpmnDiagram_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBpmnDiagram_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBpmnDiagram_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBpmnDiagram_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, BpmnDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Properties(), this.getProperties(), null, "properties", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Graph(), this.getGraph(), this.getGraph_Edges(), "graph", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Source(), this.getVertex(), this.getVertex_IncomingEdges(), "source", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getVertex(), this.getVertex_OutgoingEdges(), "target", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Vertices(), this.getVertex(), this.getVertex_Graph(), "vertices", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Edges(), this.getEdge(), this.getEdge_Graph(), "edges", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLane_Properties(), this.getProperties(), null, "properties", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Activities(), this.getActivity(), this.getActivity_Lane(), "activities", null, 0, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLane_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLane_Pool(), this.getPool(), this.getPool_Lanes(), "pool", null, 0, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Properties(), this.getProperties(), null, "properties", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_BpmnDiagram(), this.getBpmnDiagram(), this.getBpmnDiagram_Messages(), "bpmnDiagram", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Source(), this.getActivity(), this.getActivity_OutgoingMessages(), "source", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Target(), this.getActivity(), this.getActivity_IncomingMessages(), "target", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPool_Lanes(), this.getLane(), this.getLane_Pool(), "lanes", null, 0, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPool_BpmnDiagram(), this.getBpmnDiagram(), this.getBpmnDiagram_Pools(), "bpmnDiagram", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPool_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Properties(), this.getPropertiesType(), null, "properties", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, Map.Entry.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesType_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subProcessEClass, SubProcess.class, "SubProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubProcess_EventHandlers(), this.getActivity(), this.getActivity_EventHandlerFor(), "eventHandlers", null, 0, -1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubProcess_IsTransaction(), theXMLTypePackage.getBoolean(), "isTransaction", null, 0, 1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_IncomingEdges(), this.getEdge(), this.getEdge_Source(), "incomingEdges", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_OutgoingEdges(), this.getEdge(), this.getEdge_Target(), "outgoingEdges", null, 0, -1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Graph(), this.getGraph(), this.getGraph_Vertices(), "graph", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertex_ID(), theXMLTypePackage.getID(), "iD", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activityTypeEEnum, ActivityType.class, "ActivityType");
		addEEnumLiteral(activityTypeEEnum, ActivityType.TASK_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.SUB_PROCESS_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_START_EMPTY_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_START_MESSAGE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_START_RULE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_EMPTY_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_MESSAGE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_TIMER_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_ERROR_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_COMPENSATION_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_INTERMEDIATE_RULE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_END_EMPTY_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_END_MESSAGE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_END_ERROR_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_END_COMPENSATION_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.EVENT_END_TERMINATE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.GATEWAY_DATA_BASED_INCLUSIVE_LITERAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.GATEWAY_PARALLEL_LITERAL);

		// Initialize data types
		initEDataType(activityTypeObjectEDataType, ActivityType.class, "ActivityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "name", "Activity",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getActivity_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (getActivity_IncomingMessages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "incomingMessages"
		   });
		addAnnotation
		  (getActivity_OutgoingMessages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outgoingMessages"
		   });
		addAnnotation
		  (getActivity_OrderedMessages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "orderedMessages"
		   });
		addAnnotation
		  (getActivity_ActivityType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "activityType"
		   });
		addAnnotation
		  (getActivity_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getActivity_EventHandlerFor(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "eventHandlerFor"
		   });
		addAnnotation
		  (getActivity_Lane(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lane"
		   });
		addAnnotation
		  (getActivity_Looping(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "looping"
		   });
		addAnnotation
		  (getActivity_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (activityTypeEEnum,
		   source,
		   new String[] {
			   "name", "ActivityType"
		   });
		addAnnotation
		  (activityTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ActivityType:Object",
			   "baseType", "ActivityType"
		   });
		addAnnotation
		  (bpmnDiagramEClass,
		   source,
		   new String[] {
			   "name", "BpmnDiagram",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBpmnDiagram_Pools(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "pools"
		   });
		addAnnotation
		  (getBpmnDiagram_Messages(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "messages"
		   });
		addAnnotation
		  (getBpmnDiagram_Author(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "author"
		   });
		addAnnotation
		  (getBpmnDiagram_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getBpmnDiagram_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getBpmnDiagram_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title"
		   });
		addAnnotation
		  (edgeEClass,
		   source,
		   new String[] {
			   "name", "Edge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEdge_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (getEdge_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getEdge_Graph(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "graph"
		   });
		addAnnotation
		  (getEdge_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID"
		   });
		addAnnotation
		  (getEdge_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getEdge_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (getEdge_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "target"
		   });
		addAnnotation
		  (graphEClass,
		   source,
		   new String[] {
			   "name", "Graph",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGraph_Vertices(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "vertices"
		   });
		addAnnotation
		  (getGraph_Edges(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "edges"
		   });
		addAnnotation
		  (laneEClass,
		   source,
		   new String[] {
			   "name", "Lane",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLane_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (getLane_Activities(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activities"
		   });
		addAnnotation
		  (getLane_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getLane_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID"
		   });
		addAnnotation
		  (getLane_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getLane_Pool(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "pool"
		   });
		addAnnotation
		  (messageEClass,
		   source,
		   new String[] {
			   "name", "Message",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMessage_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (getMessage_BpmnDiagram(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bpmnDiagram"
		   });
		addAnnotation
		  (getMessage_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getMessage_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID"
		   });
		addAnnotation
		  (getMessage_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getMessage_Source(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "source"
		   });
		addAnnotation
		  (getMessage_Target(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "target"
		   });
		addAnnotation
		  (poolEClass,
		   source,
		   new String[] {
			   "name", "Pool",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPool_Lanes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lanes"
		   });
		addAnnotation
		  (getPool_BpmnDiagram(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bpmnDiagram"
		   });
		addAnnotation
		  (getPool_Documentation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "documentation"
		   });
		addAnnotation
		  (getPool_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID"
		   });
		addAnnotation
		  (getPool_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (propertiesEClass,
		   source,
		   new String[] {
			   "name", "Properties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getProperties_Properties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "properties"
		   });
		addAnnotation
		  (propertiesTypeEClass,
		   source,
		   new String[] {
			   "name", "properties_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPropertiesType_Key(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "key"
		   });
		addAnnotation
		  (getPropertiesType_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (subProcessEClass,
		   source,
		   new String[] {
			   "name", "SubProcess",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubProcess_EventHandlers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eventHandlers"
		   });
		addAnnotation
		  (getSubProcess_IsTransaction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isTransaction"
		   });
		addAnnotation
		  (vertexEClass,
		   source,
		   new String[] {
			   "name", "Vertex",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVertex_IncomingEdges(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "incomingEdges"
		   });
		addAnnotation
		  (getVertex_OutgoingEdges(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outgoingEdges"
		   });
		addAnnotation
		  (getVertex_Graph(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "graph"
		   });
		addAnnotation
		  (getVertex_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID"
		   });
	}

} //BpmnPackageImpl
