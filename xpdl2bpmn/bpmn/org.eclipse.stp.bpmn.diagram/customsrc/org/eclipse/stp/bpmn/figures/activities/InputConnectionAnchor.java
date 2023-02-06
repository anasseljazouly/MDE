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
* Date           Author             Changes
* Feb 24, 2006   Hugues Malphettes  Created
**/

package org.eclipse.stp.bpmn.figures.activities;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Input connection anchor is for inputs to the operator.
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class InputConnectionAnchor extends ChopboxAnchor {

	private static final Dimension SMALL_DIM = new Dimension(1, 1);

	private final int _index;

	private final Rectangle _box = new Rectangle();

	public InputConnectionAnchor(IFigure owner, int index) {
		super(owner);
		if (index == -1) {
			index = 0;
		}
		_index = index + 1;
	}

	/**
	 * @return a tiny rectangle on the left side of the owner's to anchor the
	 *         connection
	 */
	protected Rectangle getBox() {
		Rectangle owner = getOwner().getBounds();
		_box.y = owner.y
				+ Math.round(_index * owner.height
						/ (((ActivityNodeFigure) getOwner()).getNumberOfSourceConnections() + 1));
		_box.x = owner.x;
		_box.height = SMALL_DIM.height;
		_box.width = SMALL_DIM.width;
		return _box;
	}

}
