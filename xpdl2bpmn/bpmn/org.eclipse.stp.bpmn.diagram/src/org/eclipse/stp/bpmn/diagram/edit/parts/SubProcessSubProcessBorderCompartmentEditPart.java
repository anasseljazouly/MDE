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

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessSubProcessBorderCompartmentCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessSubProcessBorderCompartmentItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.policies.PopupBarEditPolicyEx;

/**
 * @generated
 */
public class SubProcessSubProcessBorderCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5003;

	/**
	 * @generated
	 */
	public SubProcessSubProcessBorderCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return "SubProcessBorderCompartment";
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
	 * USing a flow layout otherwise nothing shows up and weird stuff happens!
	 * 
	 * @notgenerated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) this
				.createFigureGen();
		FlowLayout layout = new FlowLayout();
		layout.setMinorAlignment(FlowLayout.ALIGN_CENTER);
		layout.setMajorAlignment(FlowLayout.ALIGN_CENTER);
		layout.setMajorSpacing(getMapMode().DPtoLP(5));
		layout.setMinorSpacing(getMapMode().DPtoLP(5));
		result.getContentPane().setLayoutManager(layout);
		result.setBorder(null);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SubProcessSubProcessBorderCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SubProcessSubProcessBorderCompartmentCanonicalEditPolicy());
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
