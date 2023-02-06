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
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.GravityConstrainedFlowLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.GravityDirectionType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.stp.bpmn.diagram.edit.policies.PoolCanonicalEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.PoolGraphicalNodeEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.policies.PoolItemSemanticEditPolicy;
import org.eclipse.stp.bpmn.diagram.part.BpmnVisualIDRegistry;
import org.eclipse.stp.bpmn.policies.ResizableShapeEditPolicyEx;

/**
 * @generated
 */
public class PoolEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

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
	public PoolEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PoolItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new PoolGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PoolCanonicalEditPolicy());
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

	/**
	 * @generated
	 */
	protected IFigure createNodeShapeGen() {
		PoolFigure figure = new PoolFigure();
		return primaryShape = figure;
	}

	/**
	 * @return ugly.
	 * @notgenerated
	 */
	private int getSuggestedPoolWidth() {
		int widthInPx = super.getViewer().getControl().getBounds().width - 30;
		if (widthInPx < 150) {
			widthInPx = 150;
		}
		int res = getMapMode().DPtoLP(widthInPx);
		int written = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Width())).intValue();
		List<PoolEditPart> siblings = getParent().getChildren();

		if (siblings.size() > 0) {
			written = ((Integer) siblings.get(0).getStructuralFeatureValue(
					NotationPackage.eINSTANCE.getSize_Width())).intValue();
		}

		if (written > res || written > 150)
			return written;
		return res;
	}

	/**
	 * Moves children shapes to make them visible after pool resize.
	 * @notgenerated
	 * @author BIlchyshyn
	 */
	private void refreshChildrenLocation() {
		int newWidth = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Width())).intValue();
		int newHeight = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Height())).intValue();
		Point moveDelta = new Point(0, 0);
		List<GraphicalEditPart> children = getChildren();

		if (children.size() > 0) {
			children = children.get(1).getChildren();
		} else
			return;

		Rectangle rect = getPoolContainRectangle();

		if (newWidth < rect.width) {
			newWidth = rect.width;
		}
		if (newHeight < rect.height) {
			newHeight = rect.height;
		}

		if (newWidth < rect.x + rect.width) {
			moveDelta.x = rect.x + rect.width - newWidth;
		}
		if (newHeight < rect.y + rect.height) {
			moveDelta.y = rect.y + rect.height - newHeight;
		}

		if ((moveDelta.x + moveDelta.y) > 0) {
			for (int i = 0; i < children.size(); i++) {
				GraphicalEditPart part = children.get(i);
				Rectangle bound = part.getFigure().getBounds();
				Point loc = new Point(bound.x - moveDelta.x, bound.y
						- moveDelta.y);
				((GraphicalEditPart) part.getParent()).setLayoutConstraint(
						part, part.getFigure(), new Rectangle(loc, bound
								.getSize()));
			}
		}
	}

	/**
	 * @notgenerated
	 * @author BIlchyshyn
	 * @return minimal rectangle that contains all child shapes
	 */
	public Rectangle getPoolContainRectangle() {
		final Dimension borderThickness = new Dimension(35, 15);
		List<GraphicalEditPart> children = getChildren();
		Rectangle poolContRect = null;
		if (children.size() > 0) {
			poolContRect = children.get(1).getFigure().getBounds();
			children = children.get(1).getChildren();
		} else
			return new Rectangle();

		int maxX = 0;
		int maxY = 0;
		int minX = poolContRect.x + poolContRect.width;
		int minY = poolContRect.y + poolContRect.height;

		for (int i = 0; i < children.size(); i++) {
			Rectangle rect = children.get(i).getFigure().getBounds();

			if (rect.x < minX) {
				minX = rect.x;
			}

			if (rect.y < minY) {
				minY = rect.y;
			}

			if (rect.x + rect.width > maxX) {
				maxX = rect.x + rect.width;
			}

			if (rect.y + rect.height > maxY) {
				maxY = rect.y + rect.height;
			}
		}

		return new Rectangle(minX, minY, maxX - minX + borderThickness.width,
				maxY - minY + borderThickness.height);
	}

	/**
	 * @notgenerated
	 */
	protected IFigure createNodeShape() {
		PoolFigure figure = (PoolFigure) createNodeShapeGen();
		figure.setPreferredSize(getSuggestedPoolWidth(), getMapMode()
				.DPtoLP(90));

		return figure;
	}

	/**
	 * @notgenerated-added
	 */
	@Override
	protected void refreshBounds() {
		List<PoolEditPart> siblings = getParent().getChildren();
		int width = //((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		getSuggestedPoolWidth();
		int height = //getSuggestedPoolSize().y;
		((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getSize_Height())).intValue();
		int x = 9;// ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getLocation_Y())).intValue();

		for (int i = 0; i < siblings.size(); i++) {
			if (!siblings.get(i).equals(this)) {
				Dimension dim = new Dimension(width, ((Integer) siblings.get(i)
						.getStructuralFeatureValue(
								NotationPackage.eINSTANCE.getSize_Height()))
						.intValue());
				Point location = new Point(9, ((Integer) siblings.get(i)
						.getStructuralFeatureValue(
								NotationPackage.eINSTANCE.getLocation_Y()))
						.intValue());

				((GraphicalEditPart) getParent()).setLayoutConstraint(siblings
						.get(i), siblings.get(i).getFigure(), new Rectangle(
						location, dim));
			}
		}

		Dimension size = new Dimension(width, height);
		Point loc = new Point(x, y);

		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), new Rectangle(loc, size));

		refreshChildrenLocation();
		//		
		//		siblings = SortList(siblings);
		//		for (int i = 0; i < siblings.size(); i++) {
		//			Dimension dim = new Dimension(((Integer) siblings.get(i).getStructuralFeatureValue(
		//							NotationPackage.eINSTANCE.getSize_Width())).intValue(),
		//							((Integer) siblings.get(i).getStructuralFeatureValue(
		//							NotationPackage.eINSTANCE.getSize_Height())).intValue());
		//			Point location = new Point(9, ((Integer) siblings.get(i)
		//					.getStructuralFeatureValue(
		//							NotationPackage.eINSTANCE.getLocation_Y())).intValue());
		//			if (i > 0) {
		//				int newLocationY = ((Integer) siblings.get(i - 1).getStructuralFeatureValue(
		//						NotationPackage.eINSTANCE.getLocation_Y())).intValue() 
		//						+ ((Integer) siblings.get(i - 1).getStructuralFeatureValue(
		//						NotationPackage.eINSTANCE.getSize_Height())).intValue();
		//				if (location.y < newLocationY + 5) {
		//					location.setLocation(9, newLocationY + 5);
		//				}
		//			}
		//			((GraphicalEditPart) getParent()).setLayoutConstraint(siblings
		//					.get(i), siblings.get(i).getFigure(), new Rectangle(
		//					location, dim));
		//		}
	}

	//	private List SortList(List<PoolEditPart> siblings) {
	//		if (siblings.size() < 1) return null;
	//		for (int j = 0; j < siblings.size() - 1; j++) {
	//			for (int i = 0; i < siblings.size() - 1; i++) {
	//				if (siblings.get(i).getLocation().y > siblings.get(i + 1)
	//						.getLocation().y) {
	//					PoolEditPart temp = siblings.get(i);
	//					siblings.remove(i);
	//					siblings.add(i + 1, temp);
	//				}
	//			}
	//		}
	//		
	//		return siblings;
	//	}

	/**
	 * @generated
	 */
	public PoolFigure getPrimaryShape() {
		return (PoolFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PoolNameEditPart) {
			((PoolNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePoolNameFigure());
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
	 * Difference with the generated one: the layout is
	 * GravityConstrainedFlowLayout.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @notgenerated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			GravityConstrainedFlowLayout layout = new GravityConstrainedFlowLayout();
			layout.setGravity(GravityDirectionType.WEST);// WEST is default
			//			 anyways
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
				.getType(PoolNameEditPart.VISUAL_ID));
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
	public class PoolFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public PoolFigure() {

			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);
			this.setBackgroundColor(POOLFIGURE_BACK

			);
			this.setBorder(new org.eclipse.draw2d.LineBorder(BORDER

			));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.stp.bpmn.figures.VerticalLabel fig_0 = new org.eclipse.stp.bpmn.figures.VerticalLabel();

			fig_0.setBackgroundColor(POOLNAMEFIGURE_BACK

			);

			setFigurePoolNameFigure(fig_0);

			Object layData0 = null;

			this.add(fig_0, layData0);
		}

		/**
		 * @generated
		 */
		private org.eclipse.stp.bpmn.figures.VerticalLabel fPoolNameFigure;

		/**
		 * @generated
		 */
		public org.eclipse.stp.bpmn.figures.VerticalLabel getFigurePoolNameFigure() {
			return fPoolNameFigure;
		}

		/**
		 * @generated
		 */
		private void setFigurePoolNameFigure(
				org.eclipse.stp.bpmn.figures.VerticalLabel fig) {
			fPoolNameFigure = fig;
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

	/**
	 * @generated
	 */
	public static final org.eclipse.swt.graphics.Color POOLNAMEFIGURE_BACK = new org.eclipse.swt.graphics.Color(
			null, 227, 235, 251);

	/**
	 * @generated
	 */
	public static final org.eclipse.swt.graphics.Color POOLFIGURE_BACK = new org.eclipse.swt.graphics.Color(
			null, 232, 232, 255);

	/**
	 * @generated
	 */
	public static final org.eclipse.swt.graphics.Color BORDER = new org.eclipse.swt.graphics.Color(
			null, 169, 169, 169);

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {

		return new ResizableShapeEditPolicyEx();
	}

}
