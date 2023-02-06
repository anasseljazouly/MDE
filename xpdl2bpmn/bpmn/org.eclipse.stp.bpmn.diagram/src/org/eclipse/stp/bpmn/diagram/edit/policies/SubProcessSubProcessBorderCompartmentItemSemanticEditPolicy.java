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
public class SubProcessSubProcessBorderCompartmentItemSemanticEditPolicy extends
		BpmnBaseItemSemanticEditPolicy {

	/**
	 * @notgenerated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		// was
		// if (BpmnElementTypes.Activity_2003 == req.getElementType())
		if (BpmnElementTypes.Activity_2003.getId().equals(
				req.getElementType().getId())) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(BpmnPackage.eINSTANCE
						.getSubProcess_EventHandlers());
			}
			return getMSLWrapper(new CreateActivity_2003Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @notgenerated
	 */
	private static class CreateActivity_2003Command extends
			CreateElementCommandEx {

		/**
		 * @generated
		 */
		public CreateActivity_2003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return BpmnPackage.eINSTANCE.getSubProcess();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest())
					.getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}
	}

}
