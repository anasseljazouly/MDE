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
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.Activity;
import org.eclipse.stp.bpmn.ActivityType;
import org.eclipse.stp.bpmn.BpmnPackage;
import org.eclipse.stp.bpmn.diagram.edit.policies.ActivityCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.ActivityGraphicalNodeEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.ActivityItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;
import org.eclipse.stp.bpmn.figures.activities.ActivityDiamondFigure;
import org.eclipse.stp.bpmn.figures.activities.ActivityNodeFigure;
import org.eclipse.stp.bpmn.figures.activities.ActivityOvalFigure;
import org.eclipse.stp.bpmn.policies.ResizableShapeEditPolicyEx;

/**
 * @generated
 */
public class ActivityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ActivityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActivityItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new ActivityGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ActivityCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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

	@Override
	public void installEditPolicy(Object key, EditPolicy editPolicy) {
		// TODO Auto-generated method stub
		super.installEditPolicy(key, editPolicy);
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShapeGen() {
		ActivityFigure figure = new ActivityFigure();
		return primaryShape = figure;
	}

	/**
	 * @notgenerated
	 */
	protected IFigure createNodeShape() {
		ActivityFigure figure = (ActivityFigure) createNodeShapeGen();
		Activity activity = (Activity) getPrimaryView().getElement();
		figure.setActivityType(activity.getActivityType().getLiteral());
		figure.setLooping(activity.isLooping());
		return figure;
	}

	/**
	 * @generated
	 */
	public ActivityFigure getPrimaryShape() {
		return (ActivityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
			((ActivityNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActivityNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @notgenerated
	 */
	protected NodeFigure createNodePlate() {
		Activity activity = (Activity) getPrimaryView().getElement();
		final int activityType = activity.getActivityType().getValue();
		NodeFigure fig;
		int size = getMapMode().DPtoLP(40);
		switch (activityType) {
		case ActivityType.TASK:
			// rectangle
			fig = new ActivityNodeFigure(size, size);
			break;
		case ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_DATA_BASED_INCLUSIVE:
		case ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_PARALLEL:
			// diamond
			fig = new ActivityDiamondFigure(new Dimension(size, size));
			break;
		default:
			// circle
			fig = new ActivityOvalFigure();
			fig.setSize(size, size);
		}
		return fig;
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
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
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
				.getType(ActivityNameEditPart.VISUAL_ID));
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
	 * Synchronizes the shape with the activityType
	 * 
	 * @notgenerated
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#handlePropertyChangeEvent(java.beans.PropertyChangeEvent)
	 */
	protected void handleNotificationEvent(Notification notification) {
		if (notification.getEventType() == Notification.SET) {
			if (BpmnPackage.eINSTANCE.getActivity_ActivityType().equals(
					notification.getFeature())) {
				getPrimaryShape().setActivityType(
						((ActivityType) notification.getNewValue())
								.getLiteral());
				// refreshVisuals();
			} else if (BpmnPackage.eINSTANCE.getActivity_Looping().equals(
					notification.getFeature())) {
				// looping changed
				getPrimaryShape().setLooping(notification.getNewBooleanValue());
			}
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	public class ActivityFigure extends
			org.eclipse.stp.bpmn.figures.activities.ActivityFigure {

		/**
		 * @generated
		 */
		public ActivityFigure() {

			{
				this.setActivityType("Task");
			}

			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_0.setText("activity");

			setFigureActivityNameFigure(fig_0);

			Object layData0 = null;

			this.add(fig_0, layData0);
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fActivityNameFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureActivityNameFigure() {
			return fActivityNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureActivityNameFigure(
				org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fActivityNameFigure = fig;
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

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		View view = (View) getModel();
		Activity activity = (Activity) view.getElement();
		int activityType = activity.getActivityType().getValue();
		EditPolicy dragEditPolicy;
		switch (activityType) {
		case ActivityType.EVENT_START_EMPTY:
		case ActivityType.EVENT_START_MESSAGE:
		case ActivityType.EVENT_START_RULE:

		case ActivityType.EVENT_INTERMEDIATE_EMPTY:
		case ActivityType.EVENT_INTERMEDIATE_MESSAGE:
		case ActivityType.EVENT_INTERMEDIATE_TIMER:
		case ActivityType.EVENT_INTERMEDIATE_ERROR:
		case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
		case ActivityType.EVENT_INTERMEDIATE_RULE:

		case ActivityType.EVENT_END_EMPTY:
		case ActivityType.EVENT_END_MESSAGE:
		case ActivityType.EVENT_END_ERROR:
		case ActivityType.EVENT_END_COMPENSATION:
		case ActivityType.EVENT_END_TERMINATE:

		case ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_DATA_BASED_INCLUSIVE:
		case ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_PARALLEL:

			dragEditPolicy = new ResizableShapeEditPolicyEx();
			break;
		default:
			dragEditPolicy = super.getPrimaryDragEditPolicy();
		}
		// TODO Auto-generated method stub
		// return super.getPrimaryDragEditPolicy();
		return dragEditPolicy;
	}
}
