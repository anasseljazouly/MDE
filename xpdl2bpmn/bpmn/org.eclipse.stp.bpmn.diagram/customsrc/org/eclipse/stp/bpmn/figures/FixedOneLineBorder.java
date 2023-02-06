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
 * Date             Author              Changes
 * Jul 12, 2006     hmalphettes         Created
**/
package org.eclipse.stp.bpmn.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.swt.graphics.Color;

/**
 * The OneLineBorder has a bug: it does ot take into account the
 * color passed.
 * @author hmalphettes
 *
 */
public class FixedOneLineBorder extends OneLineBorder {

	
    public FixedOneLineBorder(Color color, int width, int position)
    {
        super(color, width, position);
    }
	
	@Override
	public void paint(IFigure arg0, Graphics arg1, Insets arg2) {
		arg1.pushState();
		try {
			arg1.setForegroundColor(getColor());
			super.paint(arg0, arg1, arg2);
		} finally {
			arg1.popState();
		}
	}

}
