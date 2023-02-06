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

package org.eclipse.stp.bpmn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.BpmnDiagram;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.Edge;
import org.eclipse.stp.bpmn.Graph;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.Vertex;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends
		BpmnBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (BpmnElementTypes.Edge_3001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingEdge3001Command(req)
					: getCreateCompleteIncomingEdge3001Command(req);
		}
		if (BpmnElementTypes.Message_3002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingMessage3002Command(req)
					: getCreateCompleteIncomingMessage3002Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingEdge3001Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingEdge3001Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Vertex)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Graph element = (Graph) getRelationshipContainer(req.getSource(),
				BpmnPackage.eINSTANCE.getGraph(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(BpmnPackage.eINSTANCE.getGraph_Edges());
		}
		return getMSLWrapper(new CreateIncomingEdge3001Command(req) {

			/**
			 * @generated
			 */
			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingEdge3001Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingEdge3001Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getGraph();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Edge newElement = (Edge) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTarget((Vertex) getTarget());
				newElement.setSource((Vertex) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingMessage3002Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingMessage3002Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Activity)) {
			return UnexecutableCommand.INSTANCE;
		}
		final BpmnDiagram element = (BpmnDiagram) getRelationshipContainer(req
				.getSource(), BpmnPackage.eINSTANCE.getBpmnDiagram(), req
				.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(BpmnPackage.eINSTANCE
					.getBpmnDiagram_Messages());
		}
		return getMSLWrapper(new CreateIncomingMessage3002Command(req) {

			/**
			 * @generated
			 */
			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingMessage3002Command extends
			CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingMessage3002Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getBpmnDiagram();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Message newElement = (Message) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTarget((Activity) getTarget());
				newElement.setSource((Activity) getSource());
			}
			return newElement;
		}
	}
}
