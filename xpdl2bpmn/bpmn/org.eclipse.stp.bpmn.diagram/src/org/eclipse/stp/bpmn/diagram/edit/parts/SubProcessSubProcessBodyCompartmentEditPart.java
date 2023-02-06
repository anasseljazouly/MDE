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

package org.eclipse.stp.bpmn.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessSubProcessBodyCompartmentCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessSubProcessBodyCompartmentItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.policies.PopupBarEditPolicyEx;

/**
 * @generated
 */
public class SubProcessSubProcessBodyCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5002;

	/**
	 * @generated
	 */
	public SubProcessSubProcessBodyCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return "SubProcessBodyCompartment";
	}

	/**
	 * @generated
	 */
	public IFigure createFigureGen() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @notgenerated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) this
				.createFigureGen();
		result.setBorder(null);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SubProcessSubProcessBodyCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SubProcessSubProcessBodyCompartmentCanonicalEditPolicy());
	}

	/**
	 * @notgenerated
	 */
	protected void createDefaultEditPolicies() {
		createDefaultEditPoliciesGen();
		// the following is added:
		installEditPolicy(EditPolicyRoles.POPUPBAR_ROLE,
				new PopupBarEditPolicyEx());

	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
}
