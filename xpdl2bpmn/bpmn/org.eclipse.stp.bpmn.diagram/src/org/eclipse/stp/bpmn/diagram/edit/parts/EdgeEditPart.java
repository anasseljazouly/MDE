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

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.EdgeItemSemanticEditPolicy;

/**
 * @generated
 */
public class EdgeEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	public EdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EdgeItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new EdgeFigure();
	}

	/**
	 * @generated
	 */
	public class EdgeFigure extends
			org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EdgeFigure() {
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private org.eclipse.stp.bpmn.figures.EdgePolylineTargetDecoration createTargetDecoration() {
			org.eclipse.stp.bpmn.figures.EdgePolylineTargetDecoration df = new org.eclipse.stp.bpmn.figures.EdgePolylineTargetDecoration();

			return df;
		}

	}

}
