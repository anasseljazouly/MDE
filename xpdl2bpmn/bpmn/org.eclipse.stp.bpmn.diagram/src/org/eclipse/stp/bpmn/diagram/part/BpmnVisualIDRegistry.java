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

package org.eclipse.stp.bpmn.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Edge;
import org.eclipse.stp.bpmn.Lane;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.Pool;
import org.eclipse.stp.bpmn.SubProcess;
import org.eclipse.stp.bpmn.diagram.edit.parts.Activity2EditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityName2EditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.BpmnDiagramEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.EdgeEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.LaneEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.LaneNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.MessageEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolPoolCompartmentEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessNameEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessSubProcessBodyCompartmentEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessSubProcessBorderCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented by
 * a domain model object.
 * 
 * @generated
 */
public class BpmnVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = BpmnDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (BpmnDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return BpmnDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				BpmnDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (BpmnPackage.eINSTANCE.getBpmnDiagram().isSuperTypeOf(
				domainElementMetaclass)
				&& isDiagramBpmnDiagram_79((BpmnDiagram) domainElement)) {
			return BpmnDiagramEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement,
				domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView,
			EObject domainElement, EClass domainElementMetaclass,
			String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!BpmnDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (BpmnDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BpmnDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint)
				: -1;
		switch (containerVisualID) {
		case PoolEditPart.VISUAL_ID:
			if (PoolNameEditPart.VISUAL_ID == nodeVisualID) {
				return PoolNameEditPart.VISUAL_ID;
			}
			if (PoolPoolCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return PoolPoolCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedPool_1001ChildNodeID(domainElement,
					semanticHint);
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return ActivityNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedActivity_2001ChildNodeID(domainElement,
					semanticHint);
		case SubProcessEditPart.VISUAL_ID:
			if (SubProcessNameEditPart.VISUAL_ID == nodeVisualID) {
				return SubProcessNameEditPart.VISUAL_ID;
			}
			if (SubProcessSubProcessBodyCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return SubProcessSubProcessBodyCompartmentEditPart.VISUAL_ID;
			}
			if (SubProcessSubProcessBorderCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return SubProcessSubProcessBorderCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedSubProcess_2002ChildNodeID(domainElement,
					semanticHint);
		case Activity2EditPart.VISUAL_ID:
			if (ActivityName2EditPart.VISUAL_ID == nodeVisualID) {
				return ActivityName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedActivity_2003ChildNodeID(domainElement,
					semanticHint);
		case LaneEditPart.VISUAL_ID:
			if (LaneNameEditPart.VISUAL_ID == nodeVisualID) {
				return LaneNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedLane_2004ChildNodeID(domainElement,
					semanticHint);
		case PoolPoolCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || ActivityEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getActivity().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeActivity_2001((Activity) domainElement))) {
				return ActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || SubProcessEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getSubProcess().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSubProcess_2002((SubProcess) domainElement))) {
				return SubProcessEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || LaneEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getLane().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeLane_2004((Lane) domainElement))) {
				return LaneEditPart.VISUAL_ID;
			}
			return getUnrecognizedPoolPoolCompartment_5001ChildNodeID(
					domainElement, semanticHint);
		case SubProcessSubProcessBodyCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || ActivityEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getActivity().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeActivity_2001((Activity) domainElement))) {
				return ActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || SubProcessEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getSubProcess().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeSubProcess_2002((SubProcess) domainElement))) {
				return SubProcessEditPart.VISUAL_ID;
			}
			return getUnrecognizedSubProcessSubProcessBodyCompartment_5002ChildNodeID(
					domainElement, semanticHint);
		case SubProcessSubProcessBorderCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || Activity2EditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getActivity().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodeActivity_2003((Activity) domainElement))) {
				return Activity2EditPart.VISUAL_ID;
			}
			return getUnrecognizedSubProcessSubProcessBorderCompartment_5003ChildNodeID(
					domainElement, semanticHint);
		case BpmnDiagramEditPart.VISUAL_ID:
			if ((semanticHint == null || PoolEditPart.VISUAL_ID == nodeVisualID)
					&& BpmnPackage.eINSTANCE.getPool().isSuperTypeOf(
							domainElementMetaclass)
					&& (domainElement == null || isNodePool_1001((Pool) domainElement))) {
				return PoolEditPart.VISUAL_ID;
			}
			return getUnrecognizedBpmnDiagram_79ChildNodeID(domainElement,
					semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement,
			EClass domainElementMetaclass) {
		if (BpmnPackage.eINSTANCE.getEdge().isSuperTypeOf(
				domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassEdge_3001((Edge) domainElement))) {
			return EdgeEditPart.VISUAL_ID;
		} else if (BpmnPackage.eINSTANCE.getMessage().isSuperTypeOf(
				domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassMessage_3002((Message) domainElement))) {
			return MessageEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isDiagramBpmnDiagram_79(BpmnDiagram element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isNodePool_1001(Pool element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isNodeActivity_2001(Activity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isNodeSubProcess_2002(SubProcess element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isNodeActivity_2003(Activity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isNodeLane_2004(Lane element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedPool_1001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedActivity_2001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedSubProcess_2002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedActivity_2003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedLane_2004ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedPoolPoolCompartment_5001ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedSubProcessSubProcessBodyCompartment_5002ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedSubProcessSubProcessBorderCompartment_5003ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedBpmnDiagram_79ChildNodeID(
			EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isLinkWithClassEdge_3001(Edge element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional
	 * conditions here.
	 * 
	 * @generated
	 */
	private static boolean isLinkWithClassMessage_3002(Message element) {
		return true;
	}
}
