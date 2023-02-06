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

/** 
* Date          	Author             Changes 
* 11 Сер 2006   	BIlchyshyn         Created 
**/

package org.eclipse.stp.bpmn.policies;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionDimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.tools.ResizeTracker;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolEditPart;
import org.eclipse.swt.SWT;


/**
 * A Tracker for dragging a resize handle. The ResizeTracker will resize all of
 * the selected editparts in the viewer which understand a RESIZE request. A
 * {@link ChangeBoundsRequest} is sent to each member of the operation set. The
 * tracker allows for the resize direction to be specified in the constructor.
 * 
 * @author hudsonr
 */
public class PoolResizeTracker extends ResizeTracker {
	private GraphicalEditPart owner;

	private PrecisionRectangle sourceRect;

	private SnapToHelper snapToHelper;

	/**
	 * Constructs a resize tracker that resizes in the specified direction. The
	 * direction is specified using {@link PositionConstants#NORTH},
	 * {@link PositionConstants#NORTH_EAST}, etc.
	 * 
	 * @param owner
	 *            of the resize handle which returned this tracker
	 * @param direction
	 *            the direction
	 */
	public PoolResizeTracker(GraphicalEditPart owner, int direction) {
		super(owner, direction);
		this.owner = owner;
	}

	/**
	 * @see org.eclipse.gef.Tool#activate()
	 */
	public void activate() {
		if (owner != null) {
			if (getTargetEditPart() != null)
				snapToHelper = (SnapToHelper) getTargetEditPart().getAdapter(
						SnapToHelper.class);

			IFigure figure = owner.getFigure();
			if (figure instanceof HandleBounds)
				sourceRect = new PrecisionRectangle(((HandleBounds) figure)
						.getHandleBounds());
			else
				sourceRect = new PrecisionRectangle(figure.getBounds());
		}
		super.activate();
	}

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#deactivate()
	 */
	public void deactivate() {
		super.deactivate();
		sourceRect = null;
		snapToHelper = null;
	}

	/**
	 * @see org.eclipse.gef.tools.SimpleDragTracker#updateSourceRequest()
	 */
	protected void updateSourceRequest() {
		ChangeBoundsRequest request = (ChangeBoundsRequest) getSourceRequest();
		Dimension d = getDragMoveDelta();

		Point location = new Point(getLocation());
		Point moveDelta = new Point(0, 0);
		Dimension resizeDelta = new Dimension(0, 0);
		int direction = getResizeDirection();
		List part = getOperationSet();
		List siblings = null;

		request.setConstrainedResize(false);
		request.setCenteredResize(getCurrentInput().isModKeyDown(SWT.MOD1));

		// When the length of a pool is modified, all pools, are modified
		// to have the same length.
		if (hasPoolEditPart(part)&& ((direction == PositionConstants.EAST)
						|| (direction == PositionConstants.WEST)
						|| (direction == PositionConstants.NORTH_EAST)
						|| (direction == PositionConstants.NORTH_WEST)
						|| (direction == PositionConstants.SOUTH_EAST) 
						|| (direction == PositionConstants.SOUTH_EAST))) {
			for (int k = 0; k < part.size(); k++) {
				if (part.get(k) instanceof PoolEditPart) {
					siblings = ((PoolEditPart) part.get(k)).getParent()
							.getChildren();
				}
			}

			for (int i = 0; i < siblings.size(); i++) {
				if (!(part.contains(siblings.get(i)))) {
					part.add(siblings.get(i));
				}
			}
		}

		if (((direction & PositionConstants.NORTH) != 0) && (part.size() < 2)) {
			//prevents from children shapes clipping
			
			if (getCurrentInput().isControlKeyDown()) {
				if ((getMinPoolSize(part).height > owner.getFigure().getBounds().height - 2 * d.height)) {
					d.setSize(new Dimension(d.width,
							(owner.getFigure().getBounds().height - getMinPoolSize(part).height)/2));
				}
				resizeDelta.height -= d.height;
			} else if ((getMinPoolSize(part).height > owner.getFigure().getBounds().height - d.height)) {
				d.setSize(new Dimension(d.width, owner.getFigure().getBounds().height - getMinPoolSize(part).height));
			}
			moveDelta.y += d.height;
			resizeDelta.height -= d.height;
		}
		if (((direction & PositionConstants.SOUTH) != 0) && (part.size() < 2)){
			if (getCurrentInput().isControlKeyDown()) {
				if ((getMinPoolSize(part).height > owner.getFigure().getBounds().height + 2 * d.height)) {
					d.setSize(new Dimension(d.width, -(owner.getFigure().getBounds().height - getMinPoolSize(part).height)/2));
				}
				moveDelta.y -= d.height;
				resizeDelta.height += d.height;
			} else if ((getMinPoolSize(part).height > owner.getFigure().getBounds().height + d.height)) {
				d.setSize(new Dimension(d.width, -(owner.getFigure().getBounds().height - getMinPoolSize(part).height)));
			}
			resizeDelta.height += d.height;
		}
		if ((direction & PositionConstants.WEST) != 0) {
			if ((getMinPoolSize(part).width > owner.getFigure().getBounds().width - d.width)) {
				d.setSize(new Dimension(owner.getFigure().getBounds().width
						- getMinPoolSize(siblings).width, d.height));
			}
			moveDelta.x += d.width;
			resizeDelta.width -= d.width;
		}
		if ((direction & PositionConstants.EAST) != 0) {
			if ((getMinPoolSize(part).width > owner.getFigure().getBounds().width + d.width)) {
				d.setSize(new Dimension(-(owner.getFigure().getBounds().width
						- getMinPoolSize(siblings).width), d.height));
			}
			resizeDelta.width += d.width;
		}

		request.setMoveDelta(moveDelta);
		request.setSizeDelta(resizeDelta);
		request.setLocation(location);
		request.setEditParts(part);
		request.getExtendedData().clear();

		if (!getCurrentInput().isAltKeyDown() && snapToHelper != null) {
			PrecisionRectangle rect = sourceRect.getPreciseCopy();
			rect.translate(moveDelta);
			rect.resize(resizeDelta);
			PrecisionRectangle result = new PrecisionRectangle();

			snapToHelper.snapRectangle(request, request.getResizeDirection(),
					rect, result);
			if (request.isCenteredResize()) {
				if (result.preciseX != 0.0)
					result.preciseWidth += -result.preciseX;
				else if (result.preciseWidth != 0.0) {
					result.preciseX = -result.preciseWidth;
					result.preciseWidth *= 2.0;
				}

				if (result.preciseY != 0.0)
					result.preciseHeight += -result.preciseY;
				else if (result.preciseHeight != 0.0) {
					result.preciseY = -result.preciseHeight;
					result.preciseHeight *= 2.0;
				}
				result.updateInts();
			}

			PrecisionPoint preciseMove = new PrecisionPoint(result.x
					+ moveDelta.x, result.y + moveDelta.y);

			PrecisionDimension preciseResize = new PrecisionDimension(
					result.width + resizeDelta.width, result.height
							+ resizeDelta.height);

			request.setMoveDelta(preciseMove);
			request.setSizeDelta(preciseResize);
		}
	}
	
	private boolean hasPoolEditPart(List parts) {
		for (int i = 0; i < parts.size(); i++) {
			if (parts.get(i) instanceof PoolEditPart) 
				return true;
		}
		
		return false;
	}
	
	private Dimension getMinPoolSize(List parts) {
		Dimension result = new Dimension(150, 50);
		for (int i = 0; i < parts.size(); i++) {
			if (parts.get(i) instanceof PoolEditPart) {
				Rectangle rect = ((PoolEditPart) parts.get(i)).getPoolContainRectangle();
				if (rect.height + 10 > result.height) {
					result.setSize(new Dimension(result.width, rect.height + 10));
				}
				if (rect.width + 30 > result.width) {
					result.setSize(new Dimension(rect.width + 30, result.height));
				}
			}
		}
		
		return result;
	}
}
