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

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.BpmnDiagramCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.BpmnDiagramItemSemanticEditPolicy;

/**
 * @generated
 */
public class BpmnDiagramEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public static String MODEL_ID = "Bpmn"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 79;

	/**
	 * @generated
	 */
	public BpmnDiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BpmnDiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new BpmnDiagramCanonicalEditPolicy());
	}

	//	@Override
	//	protected void updatePageBreaksLocation() {
	//		// TODO Auto-generated method stub
	//		super.updatePageBreaksLocation();
	//	}
	//	
	//	
	private class ArrangeLayoutListener extends LayoutListener.Stub {

		public void postLayout(IFigure container) {
			super.postLayout(container);
			updatePoolsLocation();
		}

	}

	@Override
	protected IFigure createFigure() {
		IFigure f = super.createFigure();
		f.addLayoutListener(new ArrangeLayoutListener());
		return f;

	}

	private void updatePoolsLocation() {
		List<PoolEditPart> children = sortList(getChildren());
		//		for (int i = 1; i < children.size(); i++) {
		//			PoolEditPart pool = children.get(i);
		//			PoolEditPart neighborPool = children.get(i - 1);
		//			int neighborY = ((Integer) neighborPool.getStructuralFeatureValue(
		//					NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		//			int neighbourHeight = ((Integer) neighborPool.getStructuralFeatureValue(
		//					NotationPackage.eINSTANCE.getSize_Height())).intValue();
		//			int y = ((Integer) pool.getStructuralFeatureValue(
		//					NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		//			
		//			if (y < neighborY + neighbourHeight + 5) {
		////				int height = ((Integer) pool.getStructuralFeatureValue(
		////						NotationPackage.eINSTANCE.getSize_Height())).intValue();
		////				int width = ((Integer) pool.getStructuralFeatureValue(
		////						NotationPackage.eINSTANCE.getSize_Width())).intValue();
		//				int height = pool.getFigure().getBounds().height;
		//				int width = pool.getFigure().getBounds().width;
		//				setLayoutConstraint(pool, pool.getFigure(), new Rectangle(
		//						new Point(9, neighborY + neighbourHeight + 6), new Dimension(width, height)));
		//				pool.getFigure().setBounds(new Rectangle(9, neighborY + neighbourHeight + 6, width, height));
		//			}
		//		}
	}

	private List sortList(List<PoolEditPart> siblings) {
		if (siblings.size() < 1)
			return null;
		for (int j = 0; j < siblings.size() - 1; j++) {
			for (int i = 0; i < siblings.size() - 1; i++) {
				if (siblings.get(i).getLocation().y > siblings.get(i + 1)
						.getLocation().y) {
					PoolEditPart temp = siblings.get(i);
					siblings.remove(i);
					siblings.add(i + 1, temp);
				}
			}
		}

		return siblings;
	}

}
