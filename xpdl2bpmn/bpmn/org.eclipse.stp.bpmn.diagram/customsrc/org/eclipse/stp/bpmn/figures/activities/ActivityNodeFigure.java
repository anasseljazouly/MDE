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
 * Date			    Author			    Changes
 * Jul 19, 2006		hmalphettes			Created
 **/

package org.eclipse.stp.bpmn.figures.activities;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.BaseSlidableAnchor;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;

/**
 * Manages connection anchors.
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class ActivityNodeFigure extends DefaultSizeNodeFigure {

	public static final int DEFAULT_ANCHORS = 1;

	public static final int SNAP_ANCHORS_TO_SIDES = 2;

	public static final int ENFORCE_LEFT_TO_RIGHT = 3;

	public ActivityNodeFigure(int width, int height) {
		super(width, height);
	}

	/**
	 * false to use the default anchor points. true to make sure sequence edges
	 * enter an activity from its left side and exit an activity from its right
	 * side and messages on the left or received or sent before the one on the
	 * right.
	 */
	public static int ANCHORS_ROUTING = ENFORCE_LEFT_TO_RIGHT;

	/**
	 * Added our own parsing of the position in th terminal name
	 * 
	 * @see org.eclipse.gmf.runtime.draw2d.ui.figures.IAnchorableFigure
	 *      #getConnectionAnchor(java.lang.String)
	 */
	public ConnectionAnchor getConnectionAnchor(String terminal) {

		ConnectionAnchor connectAnchor = (ConnectionAnchor) getConnectionAnchors()
				.get(terminal);
		if (connectAnchor == null) {
			if (terminal.equals(szAnchor)) {
				// get a new one - this figure doesn't support static anchors
				connectAnchor = createDefaultAnchor();
				getConnectionAnchors().put(terminal, connectAnchor);
			} else {
				int pos = PositionConstants.LEFT;
				if (!terminal.endsWith(")")) {
					int i = terminal.lastIndexOf(")");
					try {
						pos = Integer.parseInt(terminal.substring(i + 1));
					} catch (NumberFormatException nfe) {
						nfe.printStackTrace();
					}
					terminal = terminal.substring(0, i + 1);
				}
				// System.err.println("Parsing '" + terminal + "' pos=" +pos );
				connectAnchor = new ConstrainedToOneSideSlidableAnchor(this,
						SlidableAnchor.parseTerminalString(terminal), pos);
			}
		}

		return connectAnchor;
	}

	/**
	 * TODO: somehow be aware that the connection is a message or not
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchorAt(Point p) {
		if (p != null && ANCHORS_ROUTING == ENFORCE_LEFT_TO_RIGHT) {
			Rectangle r = super.getBounds().getCopy();
			super.translateToAbsolute(r);
			p.x = r.x + r.width;
		}
		return super.getSourceConnectionAnchorAt(p);
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchorAt(Point p) {
		if (p != null && ANCHORS_ROUTING == ENFORCE_LEFT_TO_RIGHT) {
			Rectangle r = super.getBounds().getCopy();
			super.translateToAbsolute(r);
			p.x = r.x;
		}
		return super.getTargetConnectionAnchorAt(p);
	}

	/**
	 * Creates a slidable anchor at the specified point (from the ratio of the
	 * reference's coordinates and bounds of the figure
	 * 
	 * @param p -
	 *            relative reference for the <Code>SlidableAnchor</Code>
	 * @return a <code>SlidableAnchor</code> for this figure with relative
	 *         reference at p
	 */
	protected ConnectionAnchor createAnchor(PrecisionPoint p) {
		if (p == null) {
			// If the old terminal for the connection anchor cannot be resolved
			// (by SlidableAnchor) a null
			// PrecisionPoint will passed in - this is handled here
			System.err.println("DEFAULT");
			return createDefaultAnchor();
		}
		int pos = PositionConstants.LEFT;
		if (Math.abs(p.preciseX - 0.5) > Math.abs(p.preciseY - 0.5)) {
			// left or right
			if (p.preciseX < 0.5) {
				// System.err.println("LEFT");
				pos = PositionConstants.LEFT;
			} else {
				// System.err.println("RIGHT");
				pos = PositionConstants.RIGHT;
			}
		} else {
			if (p.preciseY < 0.5) {
				// System.err.println("TOP");
				pos = PositionConstants.TOP;
			} else {
				// System.err.println("BOTTOM");
				pos = PositionConstants.BOTTOM;
			}
		}

		return new ConstrainedToOneSideSlidableAnchor(this, p, pos);
	}

	// @Override
	// protected ConnectionAnchor createConnectionAnchor(Point p) {
	// return new ConstrainedToOneSideSlidableAnchor(this, p);
	// }

	public int getNumberOfTargetConnections() {
		return super.getConnectionAnchors().size();
	}

	public int getNumberOfSourceConnections() {
		return super.getConnectionAnchors().size();
	}

	// just debugging
	/**
	 * Returns a new anchor for this node figure.
	 * 
	 * @param p
	 *            <code>Point</code> on the figure that gives a hint which
	 *            anchor to return.
	 * @return <code>ConnectionAnchor</code> reference to an anchor associated
	 *         with the given point on the figure.
	 */
	protected ConnectionAnchor createConnectionAnchor(Point p) {
		if (p == null) {
			return getConnectionAnchor(szAnchor);
		} else {
			Point temp = p.getCopy();
			translateToRelative(temp);
			PrecisionPoint pt = BaseSlidableAnchor.getAnchorRelativeLocation(
					temp, getBounds());
			if (isDefaultAnchorArea(pt))
				return getConnectionAnchor(szAnchor);
			// System.err.println(getBounds() + " -- " + p.x + "; " + p.y + " ->
			// " + pt.preciseX +"," +pt.preciseY);
			return createAnchor(pt);
		}
	}

	// /**
	// * Same code than in BaseSlidableAnchor except that it fixes an issue with
	// the casting in double.
	// * Without the extra parenthisis is always retunrs 0.
	// */
	// static public PrecisionPoint MYgetAnchorRelativeLocation(Point p,
	// Rectangle bounds) {
	// PrecisionPoint relLocation;
	// Point temp = new Point(p);
	// if (p.x < bounds.x || p.x > bounds.x + bounds.width
	// || p.y < bounds.y || p.y > bounds.y + bounds.height) {
	//            
	// if (p.x < bounds.x || p.x > bounds.x + bounds.width) {
	// temp.x = p.x < bounds.x ? bounds.x
	// : bounds.x + bounds.width;
	// }
	// if (p.y < bounds.y || p.y > bounds.y + bounds.height) {
	// temp.y = p.y < bounds.y ? bounds.y
	// : bounds.y + bounds.height;
	// }
	// }
	// relLocation = new PrecisionPoint(
	// ((double)temp.x - (double)bounds.x) / ((double)bounds.width) ,
	// ((double)temp.y - (double)bounds.y)
	// / ((double)bounds.height) );
	// return relLocation;
	// }
}
