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
* Date		    	Author		    	Changes
* Jul 19, 2006		hmalphettes			Created
**/

package org.eclipse.stp.bpmn.figures.activities;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;

/**
 *
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class ConstrainedToOneSideSlidableAnchor extends SlidableAnchor {

    /** private and unchanged in the super class */
    private int _position;

    public ConstrainedToOneSideSlidableAnchor(IFigure fig,
            PrecisionPoint ref, int position) {
        super(fig, ref);
        _position = position;
    }
    
    /**
     * Gets the anchors associated figure's bounding box in absolute coordinates.
     * 
     * @return a <code>Rectangle</code> that is the bounding box of the owner figure 
     * in absolute coordinates
     */
    protected Rectangle getBox() {
        if (ActivityNodeFigure.ANCHORS_ROUTING == ActivityNodeFigure.DEFAULT_ANCHORS) {
            return super.getBox();
        }
        Rectangle rBox = super.getBox();
        switch (_position) {
        case PositionConstants.LEFT:
            rBox.width = 1;
            break;
        case PositionConstants.RIGHT:
            rBox.x = rBox.x + rBox.width;
            rBox.width = 1;
            break;
        case PositionConstants.BOTTOM:
            rBox.y = rBox.y + rBox.height;
            rBox.height = 1;
            break;
        case PositionConstants.TOP:
        default:
            rBox.height = 1;
        }
        return rBox;
    }

//    /* 
//     * (non-Javadoc)
//     * @see org.eclipse.draw2d.ConnectionAnchor#getReferencePoint()
//     */
//    public Point getReferencePoint() {
//        Point absRef = super.getReferencePoint();
//        switch (_position) {
//        case PositionConstants.LEFT:
//            return getBox().getLeft().getCopy();
////            return new Point(getBox().getLeft().x, absRef.y);
//        case PositionConstants.RIGHT:
//            return getBox().getRight().getCopy();
////            return new Point(getBox().getRight().x, absRef.y);
//        case PositionConstants.BOTTOM:
//            return new Point(absRef.x, getBox().getBottom().y);
//        case PositionConstants.TOP:
//        default:
//            return new Point(absRef.x, getBox().getTop().y);
//        }
//    }
    
    /**
     * Creates terminal string for slidable anchor
     * 
     * @return <code>String</code> terminal for slidable anchor
     */
    public String getTerminal() {
        if (isDefaultAnchor())
            return StringStatics.BLANK;
        return super.getTerminal() + _position;
    }
}
