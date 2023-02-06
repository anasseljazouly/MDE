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
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.PoolPoolCompartmentCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.PoolPoolCompartmentItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.figures.FixedOneLineBorder;
import org.eclipse.stp.bpmn.policies.PopupBarEditPolicyEx;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class PoolPoolCompartmentEditPart extends ShapeCompartmentEditPart {
	/**
	 * @notgenerated
	 */
	public static final Color POOLCOMPARTMENTFIGURE_BACK = new Color(null, 224,
			224, 255);

	/**
	 * @notgenerated
	 */
	public static final Color POOLCOMPARTMENTFIGURE_BORDER = new Color(null,
			169, 169, 169);

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5001;

	/**
	 * @generated
	 */
	public PoolPoolCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return "PoolCompartment";
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
	 * Hugues: a couple of details to take care of the vertical orientation. and
	 * the background color that is not the sme for the compartment than it is
	 * for the pool name label.
	 * 
	 * @notgenerated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) this
				.createFigureGen();

		result.setBackgroundColor(POOLCOMPARTMENTFIGURE_BACK);
		result.setOpaque(true);

		FixedOneLineBorder border = new FixedOneLineBorder(
				POOLCOMPARTMENTFIGURE_BORDER, 1, PositionConstants.LEFT);
		result.setBorder(border);

		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PoolPoolCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PoolPoolCompartmentCanonicalEditPolicy());
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
