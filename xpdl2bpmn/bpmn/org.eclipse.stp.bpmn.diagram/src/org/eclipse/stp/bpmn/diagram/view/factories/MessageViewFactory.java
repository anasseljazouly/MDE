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

package org.eclipse.stp.bpmn.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.Message;
import org.eclipse.stp.bpmn.diagram.edit.parts.BpmnDiagramEditPart;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;

/**
 * @generated
 */
public class MessageViewFactory extends ConnectionViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createRoutingStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = BpmnVisualIDRegistry
					.getType(org.eclipse.stp.bpmn.diagram.edit.parts.MessageEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!BpmnDiagramEditPart.MODEL_ID.equals(BpmnVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", BpmnDiagramEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * For some reason, when creating a message edge from the the diagram, A
	 * long compund command is created by GMF. First it "creates connection"
	 * (the notation) Second it "creates connector" (the MessageEdge) but then
	 * it creates the notation again! This makes sure that we don't ceate the
	 * view twice for the same message
	 */
	@Override
	public View createView(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Message msg = (Message) semanticAdapter.getAdapter(Message.class);
		if (msg != null) {
			if (containerView instanceof Diagram) {
				Diagram diag = (Diagram) containerView;
				for (Object oo : diag.getPersistedEdges()) {
					Edge edge = (Edge) oo;
					if (edge.getElement() == msg) {
						return edge;
					}
				}
			}
		}

		return super.createView(semanticAdapter, containerView, semanticHint,
				index, persisted, preferencesHint);
	}

}
