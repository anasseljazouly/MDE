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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.commands.CreateElementCommandEx;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;

/**
 * @generated
 */
public class PoolPoolCompartmentItemSemanticEditPolicy extends
		BpmnBaseItemSemanticEditPolicy {

	/**
	 * @notgenerated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		// Hugues: using getId() it is not == with the IElementTypeEx
		if (BpmnElementTypes.Activity_2001.getId().equals(
				req.getElementType().getId())) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(BpmnPackage.eINSTANCE.getGraph_Vertices());
			}
			return getMSLWrapper(new CreateActivity_2001Command(req));
		} else if (BpmnElementTypes.SubProcess_2002.getId().equals(
				req.getElementType().getId())) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(BpmnPackage.eINSTANCE.getGraph_Vertices());
			}
			return getMSLWrapper(new CreateSubProcess_2002Command(req));
		} else if (BpmnElementTypes.Lane_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(BpmnPackage.eINSTANCE.getPool_Lanes());
			}
			return getMSLWrapper(new CreateLane_2004Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @notgenerated
	 */
	private static class CreateActivity_2001Command extends
			CreateElementCommandEx {

		/**
		 * @generated
		 */
		public CreateActivity_2001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getPool();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateSubProcess_2002Command extends
			CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateSubProcess_2002Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getPool();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateLane_2004Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateLane_2004Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getPool();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

}
