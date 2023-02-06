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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stp.bpmn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnFactoryImpl extends EFactoryImpl implements BpmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnFactory init() {
		try {
			BpmnFactory theBpmnFactory = (BpmnFactory)EPackage.Registry.INSTANCE.getEFactory(BpmnPackage.eNS_URI);
			if (theBpmnFactory != null) {
				return theBpmnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpmnPackage.ACTIVITY: return createActivity();
			case BpmnPackage.BPMN_DIAGRAM: return createBpmnDiagram();
			case BpmnPackage.EDGE: return createEdge();
			case BpmnPackage.GRAPH: return createGraph();
			case BpmnPackage.LANE: return createLane();
			case BpmnPackage.MESSAGE: return createMessage();
			case BpmnPackage.POOL: return createPool();
			case BpmnPackage.PROPERTIES: return createProperties();
			case BpmnPackage.PROPERTIES_TYPE: return (EObject)createPropertiesType();
			case BpmnPackage.SUB_PROCESS: return createSubProcess();
			case BpmnPackage.VERTEX: return createVertex();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnPackage.ACTIVITY_TYPE:
				return createActivityTypeFromString(eDataType, initialValue);
			case BpmnPackage.ACTIVITY_TYPE_OBJECT:
				return createActivityTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnPackage.ACTIVITY_TYPE:
				return convertActivityTypeToString(eDataType, instanceValue);
			case BpmnPackage.ACTIVITY_TYPE_OBJECT:
				return convertActivityTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the UUID
     */
	public Activity createActivity() {
        ActivityImpl activity = new ActivityImpl();
        activity.iD = EcoreUtil.generateUUID();
        return activity;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiagram createBpmnDiagram() {
		BpmnDiagramImpl bpmnDiagram = new BpmnDiagramImpl();
		return bpmnDiagram;
	}

    /**
     * <!-- begin-user-doc -->
     * Added setId with a unique ID according to the post here:
     * http://dev.eclipse.org/newslists/news.eclipse.tools.emf/msg18192.html
	 * <!-- end-user-doc -->
     * @notgenerated
     */
	public Edge createEdge() {
        EdgeImpl edge = new EdgeImpl();
        edge.iD = EcoreUtil.generateUUID();
        return edge;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the UUID
     */
	public Lane createLane() {
        LaneImpl lane = new LaneImpl();
        lane.iD = EcoreUtil.generateUUID();
        return lane;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the UUID
     */
	public Message createMessage() {
        MessageImpl message = new MessageImpl();
        message.iD = EcoreUtil.generateUUID();
        return message;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the UUID
     */
	public Pool createPool() {
        PoolImpl pool = new PoolImpl();
        pool.iD = EcoreUtil.generateUUID();
        return pool;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the UUID
     */
	public SubProcess createSubProcess() {
        SubProcessImpl subProcess = new SubProcessImpl();
        subProcess.iD = EcoreUtil.generateUUID();
        return subProcess;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @notgenerated added the uiid
     */
	public Vertex createVertex() {
        VertexImpl vertex = new VertexImpl();
        vertex.iD = EcoreUtil.generateUUID();
        return vertex;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActivityTypeFromString(BpmnPackage.Literals.ACTIVITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivityTypeToString(BpmnPackage.Literals.ACTIVITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnPackage getBpmnPackage() {
		return (BpmnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static BpmnPackage getPackage() {
		return BpmnPackage.eINSTANCE;
	}

} //BpmnFactoryImpl
