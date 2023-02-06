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
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * 
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class MessagePolylineSourceDecoration extends FilledPolylineDecoration {
	
	public MessagePolylineSourceDecoration() {
		super();
		this.setFillXOR(true);
		this.setFill(true);
		this.setBackgroundColor(org.eclipse.draw2d.ColorConstants.white);
		this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
	}
	
    protected void fillShape(Graphics graphics) {
        graphics.fillOval(getBounds());
    }

    protected void outlineShape(Graphics graphics) {
        Rectangle r = Rectangle.SINGLETON;
        r.setBounds(getBounds());
        r.width--;
        r.height--;
        r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
        graphics.drawOval(r);
    }
	
	
	
}
