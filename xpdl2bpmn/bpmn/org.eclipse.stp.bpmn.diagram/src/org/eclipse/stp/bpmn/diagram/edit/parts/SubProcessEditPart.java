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
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessGraphicalNodeEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.SubProcessItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;
import org.eclipse.stp.bpmn.diagram.providers.BpmnElementTypes;

/**
 * @generated
 */
public class SubProcessEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public SubProcessEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPoliciesGen() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy() {

					public Command getCommand(Request request) {
						if (understandsRequest(request)) {
							if (request instanceof CreateViewAndElementRequest) {
								CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
										.getViewAndElementDescriptor()
										.getCreateElementRequestAdapter();
								IElementType type = (IElementType) adapter
										.getAdapter(IElementType.class);
								if (type == BpmnElementTypes.Activity_2003) {
									EditPart compartmentEditPart = getChildBySemanticHint(BpmnVisualIDRegistry
											.getType(SubProcessSubProcessBorderCompartmentEditPart.VISUAL_ID));
									return compartmentEditPart == null ? null
											: compartmentEditPart
													.getCommand(request);
								}
							}
							return super.getCommand(request);
						}
						return null;
					}
				});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SubProcessItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new SubProcessGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SubProcessCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @notgenerated
	 */
	protected void createDefaultEditPolicies() {
		createDefaultEditPoliciesGen();
		// no we don't want to generate an activity for a given subprocess
		// we want it to be in either the body or the border
		removeEditPolicy(EditPolicyRoles.CREATION_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SubProcessFigure figure = new SubProcessFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SubProcessFigure getPrimaryShape() {
		return (SubProcessFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SubProcessNameEditPart) {
			((SubProcessNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSubProcessNameFigure());
			return true;
		}
		if (childEditPart instanceof SubProcessSubProcessBodyCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSubProcessBodyFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((SubProcessSubProcessBodyCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof SubProcessSubProcessBorderCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSubProcessBorderFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((SubProcessSubProcessBorderCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SubProcessSubProcessBodyCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSubProcessBodyFigure();
			pane
					.remove(((SubProcessSubProcessBodyCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof SubProcessSubProcessBorderCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSubProcessBorderFigure();
			pane
					.remove(((SubProcessSubProcessBorderCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		return new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode()
				.DPtoLP(40));
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPaneGen(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * Set the border to null
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @notgenerated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(0);
			nodeShape.setLayoutManager(layout);
			nodeShape.setBorder(null);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(BpmnVisualIDRegistry
				.getType(SubProcessNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	public class SubProcessFigure extends
			org.eclipse.stp.bpmn.figures.SubProcessFigure {

		/**
		 * @generated
		 */
		public SubProcessFigure() {

			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_0.setText("");

			setFigureSubProcessNameFigure(fig_0);

			Object layData0 = null;

			this.add(fig_0, layData0);
			org.eclipse.stp.bpmn.figures.SubProcessBodyFigure fig_1 = new org.eclipse.stp.bpmn.figures.SubProcessBodyFigure();

			setFigureSubProcessBodyFigure(fig_1);

			Object layData1 = null;

			this.add(fig_1, layData1);
			org.eclipse.stp.bpmn.figures.SubProcessBorderFigure fig_2 = new org.eclipse.stp.bpmn.figures.SubProcessBorderFigure();

			setFigureSubProcessBorderFigure(fig_2);

			Object layData2 = null;

			this.add(fig_2, layData2);
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fSubProcessNameFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureSubProcessNameFigure() {
			return fSubProcessNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureSubProcessNameFigure(
				org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fSubProcessNameFigure = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.stp.bpmn.figures.SubProcessBodyFigure fSubProcessBodyFigure;

		/**
		 * @generated
		 */
		public org.eclipse.stp.bpmn.figures.SubProcessBodyFigure getFigureSubProcessBodyFigure() {
			return fSubProcessBodyFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureSubProcessBodyFigure(
				org.eclipse.stp.bpmn.figures.SubProcessBodyFigure fig) {
			fSubProcessBodyFigure = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.stp.bpmn.figures.SubProcessBorderFigure fSubProcessBorderFigure;

		/**
		 * @generated
		 */
		public org.eclipse.stp.bpmn.figures.SubProcessBorderFigure getFigureSubProcessBorderFigure() {
			return fSubProcessBorderFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureSubProcessBorderFigure(
				org.eclipse.stp.bpmn.figures.SubProcessBorderFigure fig) {
			fSubProcessBorderFigure = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
