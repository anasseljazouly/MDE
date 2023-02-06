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

package org.eclipse.stp.bpmn.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.SubProcess;
import org.eclipse.stp.bpmn.commands.IElementTypeEx;

/**
 * @generated
 */
public class ActivityEditHelperAdvice extends AbstractEditHelperAdvice {
	/**
	 * @notgenerated
	 */
	public static final IEditHelperAdvice THE_INSTANCE = new ActivityEditHelperAdvice();

	/**
	 * @notgenerated
	 */
	public static final IEditHelperAdvice[] INSTANCE = { THE_INSTANCE };

	/**
	 * @notgenerated
	 */
	@Override
	public ICommand getAfterEditCommand(IEditCommandRequest request) {
		return super.getAfterEditCommand(request);
	}

	/**
	 * @notgenerated
	 */
	@Override
	public ICommand getBeforeEditCommand(IEditCommandRequest request) {
		return super.getBeforeEditCommand(request);
	}

	/**
	 * Hugues: for some reason: just retunring false does nothing! Have to
	 * replace the command by an unexecutable one.
	 * 
	 * @notgenerated
	 */
	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		if (request instanceof GetEditContextRequest) {
			GetEditContextRequest gec = (GetEditContextRequest) request;
			if (gec.getEditContext() instanceof SubProcess) {
				if (gec.getEditCommandRequest() instanceof CreateElementRequest) {
					CreateElementRequest creq = (CreateElementRequest) gec
							.getEditCommandRequest();
					if (creq.getContainmentFeature() != null
							&& "eventHandlers".equals(creq
									.getContainmentFeature().getName())) {
						// make sure the type of the request is for an activity
						// of type intermediate event
						// for now just an experiment.
						if (creq.getElementType() instanceof IElementTypeEx) {
							ActivityType at = ActivityType
									.get(((IElementTypeEx) creq
											.getElementType())
											.getSecondarySemanticHint());
							if (at != null) {
								switch (at.getValue()) {
								case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
								case ActivityType.EVENT_INTERMEDIATE_ERROR:
								case ActivityType.EVENT_INTERMEDIATE_TIMER:
									super.configureRequest(request);
									return true;
								}
							}
						}
						return false;
					}
				}
				// System.err.println("Returning TRUE from the helperadvice");
			}
		}

		//a single intermediate compensation event per sub-process can be created
		if ((request instanceof CreateElementRequest)
				&& (((CreateElementRequest) request).getElementType() instanceof IElementTypeEx)) {
			if (((CreateElementRequest) request).getContainer() instanceof SubProcess) {
				ActivityType at = ActivityType
						.get(((IElementTypeEx) ((CreateElementRequest) request)
								.getElementType()).getSecondarySemanticHint());
				if (at.getValue() == ActivityType.EVENT_INTERMEDIATE_COMPENSATION) {
					Object[] events = ((CreateElementRequest) request)
							.getContainer().eContents().toArray();

					for (int i = 0; i < events.length; i++) {
						if (((Activity) events[i]).getActivityType().getValue() == ActivityType.EVENT_INTERMEDIATE_COMPENSATION) {

							return false;
						}
					}
				}

			}
		}

		//a single intermediate compensation event per sub-process can be dropped
		if (request instanceof MoveRequest) {
			if (((MoveRequest) request).getTargetContainer() instanceof SubProcess) {
				Object[] srcEvents = ((MoveRequest) request)
						.getElementsToMove().keySet().toArray();

				for (int i = 0; i < srcEvents.length; i++) {
					if (((Activity) srcEvents[i]).getActivityType().getValue() == ActivityType.EVENT_INTERMEDIATE_COMPENSATION) {
						Object[] trgEvents = ((MoveRequest) request)
								.getTargetContainer().eContents().toArray();

						for (int j = 0; j < trgEvents.length; j++) {
							if (((Activity) trgEvents[j]).getActivityType()
									.getValue() == ActivityType.EVENT_INTERMEDIATE_COMPENSATION) {

								return false;
							}
						}
					}
				}

			}
		}

		return super.approveRequest(request);
	}

	/**
	 * @notgenerated
	 */
	@Override
	public void configureRequest(IEditCommandRequest request) {
		if (request instanceof GetEditContextRequest) {
			GetEditContextRequest gec = (GetEditContextRequest) request;
			if (gec.getEditContext() instanceof SubProcess) {
				if (gec.getEditCommandRequest() instanceof CreateElementRequest) {
					CreateElementRequest creq = (CreateElementRequest) gec
							.getEditCommandRequest();
					if (creq.getContainmentFeature() != null
							&& "eventHandlers".equals(creq
									.getContainmentFeature().getName())) {
						// make sure the type of the request is for an activity
						// of type intermediate event for now just an
						// experiment.
						if (creq.getElementType() instanceof IElementTypeEx) {
							ActivityType at = ActivityType
									.get(((IElementTypeEx) creq
											.getElementType())
											.getSecondarySemanticHint());
							if (at != null) {
								switch (at.getValue()) {
								case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
								case ActivityType.EVENT_INTERMEDIATE_ERROR:
								case ActivityType.EVENT_INTERMEDIATE_TIMER:
									super.configureRequest(request);
									return;
								}
							}
						}
						creq.setParameter(
								IEditCommandRequest.REPLACE_DEFAULT_COMMAND,
								true);
						creq.setParameter(
								BpmnBaseEditHelper.EDIT_POLICY_COMMAND,
								UnexecutableCommand.INSTANCE);
					}
				}
			}
		}
		super.configureRequest(request);
	}
}