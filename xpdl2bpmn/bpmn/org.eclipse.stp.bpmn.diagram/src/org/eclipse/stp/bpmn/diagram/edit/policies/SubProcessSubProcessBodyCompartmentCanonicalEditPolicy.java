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

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.Graph;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.SubProcessEditPart;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class SubProcessSubProcessBodyCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Graph) modelObject).getVertices().iterator(); values
				.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = BpmnVisualIDRegistry.getNodeVisualID(viewObject,
					nextValue);
			switch (nodeVID) {
			case ActivityEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case SubProcessEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null
				&& view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

}
