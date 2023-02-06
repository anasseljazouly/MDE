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
 * 
 * Date         	Author             Changes 
 * 1 Sep 2006   	MPeleshchyshyn  	Created 
 */
package org.eclipse.stp.bpmn.figures.activities;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.internal.figures.OvalFigure;

/**
 * Oval node figure for event activities.
 */
public class ActivityOvalFigure extends OvalFigure {

	/**
	 * Sets the bounds of this Figure to the Rectangle <i>rect</i> and stores
	 * these bounds as figure's preferred size when this method is called on
	 * object for the forst time. Note that <i>rect</i> is compared to the
	 * Figure's current bounds to determine what needs to be repainted and/or
	 * exposed and if validation is required. Since {@link #getBounds()} may
	 * return the current bounds by reference, it is not safe to modify that
	 * Rectangle and then call setBounds() after making modifications. The
	 * figure would assume that the bounds are unchanged, and no layout or paint
	 * would occur. For proper behavior, always use a copy.
	 * 
	 * @param rect
	 *            The new bounds
	 */
	@Override
	public void setBounds(Rectangle rect) {
		if (prefSize == null) {
			prefSize = rect.getSize();
		} else {
			rect.height = rect.width;
		}
		super.setBounds(rect);
	}
}
