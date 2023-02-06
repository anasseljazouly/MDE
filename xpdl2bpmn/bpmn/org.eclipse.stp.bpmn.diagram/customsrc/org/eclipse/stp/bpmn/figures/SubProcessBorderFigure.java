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
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;

/**
 * More to come.
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class SubProcessBorderFigure extends RectangleFigure{
    
    public static final int getFixedHeightDP(IFigure fig) {
        return MapModeUtil.getMapMode(fig).LPtoDP(40);
    }
    
    public SubProcessBorderFigure() {
        
    }
    
	@Override
	public Dimension getMaximumSize() {
		return new Dimension(super.getMaximumSize().width, getFixedHeightDP(this));
	}

	@Override
	public Dimension getMinimumSize(int arg0, int arg1) {
		return new Dimension(super.getMinimumSize(arg0, arg1).width, getFixedHeightDP(this));
	}
    
    @Override
    public void paintFigure(Graphics graphics) {
        //transparent
//        graphics.pushState();
//        graphics.setBackgroundColor(ColorConstants.black);
//        graphics.setForegroundColor(ColorConstants.black);
//        graphics.drawLine(getBounds().getLeft(), getBounds().getRight());
//        graphics.popState();
    }

}
