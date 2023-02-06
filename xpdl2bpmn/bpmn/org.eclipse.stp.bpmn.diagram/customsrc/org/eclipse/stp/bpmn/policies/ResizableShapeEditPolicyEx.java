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
* Date           	Author              Changes 
* 11 Сер 2006   	MPeleshchyshyn  	Created 
**/

package org.eclipse.stp.bpmn.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Cursors;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Handle;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gef.handles.RelativeHandleLocator;
import org.eclipse.gef.handles.ResizableHandleKit;
import org.eclipse.gef.handles.SquareHandle;
import org.eclipse.gef.tools.ResizeTracker;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.stp.bpmn.diagram.edit.parts.ActivityEditPart;
import org.eclipse.stp.bpmn.diagram.edit.parts.PoolEditPart;


/**
 * @author MPeleshchyshyn
 * 
 */
public class ResizableShapeEditPolicyEx extends ResizableShapeEditPolicy {
	@Override
	protected List createSelectionHandles() {
		List list = new ArrayList();
		int directions = getResizeDirections();
		if (directions == 0)
			NonResizableHandleKit.addHandles((GraphicalEditPart) getHost(),
					list);
		else if (directions != -1) {
			ResizableHandleKit.addMoveHandle((GraphicalEditPart) getHost(),
					list);
			if ((directions & PositionConstants.EAST) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.EAST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.EAST);
			if ((directions & PositionConstants.SOUTH_EAST) == PositionConstants.SOUTH_EAST)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH_EAST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH_EAST);
			if ((directions & PositionConstants.SOUTH) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH);
			if ((directions & PositionConstants.SOUTH_WEST) == PositionConstants.SOUTH_WEST)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH_WEST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.SOUTH_WEST);
			if ((directions & PositionConstants.WEST) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.WEST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.WEST);
			if ((directions & PositionConstants.NORTH_WEST) == PositionConstants.NORTH_WEST)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH_WEST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH_WEST);
			if ((directions & PositionConstants.NORTH) != 0)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH);
			if ((directions & PositionConstants.NORTH_EAST) == PositionConstants.NORTH_EAST)
				ResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH_EAST);
			else
				NonResizableHandleKit.addHandle((GraphicalEditPart) getHost(),
						list, PositionConstants.NORTH_EAST);
		} else
			addHandles((GraphicalEditPart) getHost(), list);

		return list;
	}

	/**
	 * Fills the given List with handles at each corner and the north, south,
	 * east, and west of the GraphicalEditPart.
	 * 
	 * @param part
	 *            the owner GraphicalEditPart of the handles
	 * @param handles
	 *            the List to add the handles to
	 */
	private static void addHandles(GraphicalEditPart part, List handles) {
		ResizableHandleKit.addMoveHandle(part, handles);

		handles.add(createHandle(part, PositionConstants.EAST));
		handles.add(createHandle(part, PositionConstants.SOUTH_EAST));
		handles.add(createHandle(part, PositionConstants.SOUTH));
		handles.add(createHandle(part, PositionConstants.SOUTH_WEST));
		handles.add(createHandle(part, PositionConstants.WEST));
		handles.add(createHandle(part, PositionConstants.NORTH_WEST));
		handles.add(createHandle(part, PositionConstants.NORTH));
		handles.add(createHandle(part, PositionConstants.NORTH_EAST));
	}

	static Handle createHandle(GraphicalEditPart owner, int direction) {
		Handle handle = new ResizeHandleEx(owner, direction);
		// handle.setDragTracker(new ResizeTracker(direction));
		return handle;
	}

	private static class ResizeHandleEx extends SquareHandle {

		private int cursorDirection;

		public ResizeHandleEx(GraphicalEditPart owner, int direction) {
			setOwner(owner);
			setLocator(new RelativeHandleLocator(owner.getFigure(), direction));
			setCursor(Cursors.getDirectionalCursor(direction, owner.getFigure()
					.isMirrored()));
			cursorDirection = direction;
		}

		@Override
		protected DragTracker createDragTracker() {
			if (getOwner() instanceof ActivityEditPart) {
				return new ActivityResizeTracker(getOwner(), cursorDirection);
			} else if (getOwner() instanceof PoolEditPart) {
				return new PoolResizeTracker(getOwner(), cursorDirection);
			} else
				return new ResizeTracker(getOwner(), cursorDirection);
		}
	}
}
