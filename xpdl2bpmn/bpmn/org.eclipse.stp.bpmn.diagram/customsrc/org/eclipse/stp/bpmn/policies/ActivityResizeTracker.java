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
* Date         	    Author              Changes 
* 11 Сер 2006   	MPeleshchyshyn  	Created 
**/

package org.eclipse.stp.bpmn.policies;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionDimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.handles.HandleBounds;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.tools.ResizeTracker;
import org.eclipse.swt.SWT;

/**
 * A Tracker for dragging a resize handle. The ResizeTracker will resize all of
 * the selected editparts in the viewer which understand a RESIZE request. A
 * {@link ChangeBoundsRequest} is sent to each member of the operation set. The
 * tracker allows for the resize direction to be specified in the constructor.
 * 
 * @author hudsonr
 */
public class ActivityResizeTracker extends ResizeTracker {
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
	public ActivityResizeTracker(GraphicalEditPart owner, int direction) {
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

		if (owner != null) {
			request.setConstrainedResize(true);

			int origHeight = owner.getFigure().getBounds().height;
			int origWidth = owner.getFigure().getBounds().width;
			float ratio = 1;

			if (origWidth != 0 && origHeight != 0)
				ratio = ((float) origHeight / (float) origWidth);

			if (direction == PositionConstants.SOUTH_EAST) {
				if (d.height > (d.width * ratio))
					d.width = (int) (d.height / ratio);
				else
					d.height = (int) (d.width * ratio);
			} else if (direction == PositionConstants.NORTH_WEST) {
				if (d.height < (d.width * ratio))
					d.width = (int) (d.height / ratio);
				else
					d.height = (int) (d.width * ratio);
			} else if (direction == PositionConstants.NORTH_EAST) {
				if (-(d.height) > (d.width * ratio))
					d.width = -(int) (d.height / ratio);
				else
					d.height = -(int) (d.width * ratio);
			} else if (direction == PositionConstants.SOUTH_WEST) {
				if (-(d.height) < (d.width * ratio))
					d.width = -(int) (d.height / ratio);
				else
					d.height = -(int) (d.width * ratio);
			} else if (direction == PositionConstants.NORTH) {
				direction = direction | PositionConstants.EAST;
				d.width = -(int) (d.height / ratio);
			} else if (direction == PositionConstants.SOUTH) {
				direction = direction | PositionConstants.EAST;
				d.width = (int) (d.height / ratio);
			} else if (direction == PositionConstants.EAST) {
				direction = direction | PositionConstants.SOUTH;
				d.height = (int) (d.width * ratio);
			} else if (direction == PositionConstants.WEST) {
				direction = direction | PositionConstants.SOUTH;
				d.height = -(int) (d.width * ratio);
			}
		} else
			request.setConstrainedResize(false);

		request.setCenteredResize(getCurrentInput().isModKeyDown(SWT.MOD1));

		if ((direction & PositionConstants.NORTH) != 0) {
			if (getCurrentInput().isControlKeyDown()) {
				resizeDelta.height -= d.height;
			}
			moveDelta.y += d.height;
			resizeDelta.height -= d.height;
		}
		if ((direction & PositionConstants.SOUTH) != 0) {
			if (getCurrentInput().isControlKeyDown()) {
				moveDelta.y -= d.height;
				resizeDelta.height += d.height;
			}
			resizeDelta.height += d.height;
		}
		if ((direction & PositionConstants.WEST) != 0) {
			if (getCurrentInput().isControlKeyDown()) {
				resizeDelta.width -= d.width;
			}
			moveDelta.x += d.width;
			resizeDelta.width -= d.width;
		}
		if ((direction & PositionConstants.EAST) != 0) {
			if (getCurrentInput().isControlKeyDown()) {
				moveDelta.x -= d.width;
				resizeDelta.width += d.width;
			}
			resizeDelta.width += d.width;
		}

		request.setMoveDelta(moveDelta);
		request.setSizeDelta(resizeDelta);
		request.setLocation(location);
		request.setEditParts(getOperationSet());

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

}
