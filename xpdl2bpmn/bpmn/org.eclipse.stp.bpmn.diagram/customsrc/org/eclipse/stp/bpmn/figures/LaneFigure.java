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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;

/**
 * Fill a one line thick rectangle at the top of the client area
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class LaneFigure extends RectangleFigure {

    public void paintFigure(Graphics graphics) {
        graphics.pushState();
        graphics.setBackgroundColor(ColorConstants.black);
        graphics.setForegroundColor(ColorConstants.black);
        graphics.fillRectangle(getBounds().x, getBounds().y,
                getBounds().width,
                MapModeUtil.getMapMode(this).LPtoDP(1));
        graphics.popState();
    }
    
    
}
