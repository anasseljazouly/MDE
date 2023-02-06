/******************************************************************************
 * Copyright (c) 2006 Intalio Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Intalio Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.stp.bpmn.figures.activities;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.stp.bpmn.ActivityType;

/**
 * 
 * 
 * @author hmalphettes
 * @author <a href="http://www.intalio.com">&copy; Intalio, Inc.</a>
 */
public class ActivityPainter {

	public static void paint(Graphics graphics, ActivityFigure fig) {
		switch (fig.getActivityType()) {
		case ActivityType.EVENT_START_EMPTY:
		case ActivityType.EVENT_START_MESSAGE:
		case ActivityType.EVENT_START_RULE:
			paintEventStart(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
		case ActivityType.EVENT_INTERMEDIATE_EMPTY:
		case ActivityType.EVENT_INTERMEDIATE_ERROR:
		case ActivityType.EVENT_INTERMEDIATE_MESSAGE:
		case ActivityType.EVENT_INTERMEDIATE_RULE:
		case ActivityType.EVENT_INTERMEDIATE_TIMER:
			paintEventIntermediate(graphics, fig);
			break;
		case ActivityType.EVENT_END_COMPENSATION:
		case ActivityType.EVENT_END_EMPTY:
		case ActivityType.EVENT_END_ERROR:
		case ActivityType.EVENT_END_MESSAGE:
		case ActivityType.EVENT_END_TERMINATE:
			paintEventEnd(graphics, fig);
			break;
		case ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_DATA_BASED_INCLUSIVE:
		case ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE:
		case ActivityType.GATEWAY_PARALLEL:
			paintGateway(graphics, fig);
			break;
		}
		switch (fig.getActivityType()) {
		case ActivityType.EVENT_START_EMPTY:
			break;
		case ActivityType.EVENT_START_MESSAGE:
			paintMessage(graphics, fig);
			break;
		case ActivityType.EVENT_START_RULE:
			paintRule(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_COMPENSATION:
			paintCompensation(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_EMPTY:
			break;
		case ActivityType.EVENT_INTERMEDIATE_ERROR:
			paintError(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_MESSAGE:
			paintMessage(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_RULE:
			paintRule(graphics, fig);
			break;
		case ActivityType.EVENT_INTERMEDIATE_TIMER:
			paintTimer(graphics, fig);
			break;
		case ActivityType.EVENT_END_COMPENSATION:
			paintCompensation(graphics, fig);
			break;
		case ActivityType.EVENT_END_EMPTY:
			break;
		case ActivityType.EVENT_END_ERROR:
			paintError(graphics, fig);
			break;
		case ActivityType.EVENT_END_MESSAGE:
			paintMessage(graphics, fig);
			break;
		case ActivityType.EVENT_END_TERMINATE:
			paintTerminate(graphics, fig);
			break;
		case ActivityType.GATEWAY_DATA_BASED_EXCLUSIVE:
			paintX(graphics, fig);
			break;
		case ActivityType.GATEWAY_DATA_BASED_INCLUSIVE:
			// TODO: what is it again?
			paintBoldOval(graphics, fig);
			break;
		case ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE:
			paintStar(graphics, fig);
			break;
		case ActivityType.GATEWAY_PARALLEL:
			paintPlus(graphics, fig);
			break;
		}
		if (fig.isLooping()) {
			paintLoop(graphics, fig);
		}
	}

	public static void paintGateway(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.black);

		Rectangle r = fig.getBounds().getCopy();
		PointList pointList = new PointList();

		r.width = r.width - 1;
		r.height = r.height - 1;
		pointList.removeAllPoints();
		pointList.addPoint(r.x + r.width / 2, r.y);
		pointList.addPoint(r.x + r.width, r.y + r.height / 2);
		pointList.addPoint(r.x + r.width / 2, r.y + r.height);
		pointList.addPoint(r.x, r.y + r.height / 2);
		graphics.fillPolygon(pointList);
		graphics.drawPolygon(pointList);

		graphics.popState();
	}

	public static void paintEventStart(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.white);

		// first fill the biggest oval with white:
		Rectangle rect = fig.getBounds().getCopy();
		graphics.fillOval(rect);

		// second draw oval at the border. linewidth is 1/22 of the figure.
		graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(1));// (int)Math.floor(1
		// *
		// Math.max(rect.width,rect.height)/22));
		graphics.drawOval(calcInnerRectangle(rect, graphics.getLineWidth()));

		graphics.popState();
	}

	private static Rectangle calcInnerRectangle(Rectangle rect, int lineWidth) {
		PrecisionRectangle newRect = new PrecisionRectangle(rect);
		double halfLineWidth = lineWidth / 2.0;
		newRect.setX(newRect.preciseX + halfLineWidth);
		newRect.setY(newRect.preciseY + halfLineWidth);
		newRect.setWidth(newRect.preciseWidth - lineWidth);
		newRect.setHeight(newRect.preciseHeight - lineWidth);
		return newRect;
	}

	public static void paintEventIntermediate(Graphics graphics,
			ActivityFigure fig) {
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.white);

		// first fill the biggest oval with white:
		Rectangle rect = fig.getBounds().getCopy();
		graphics.fillOval(rect);

		// second draw oval at the border. linewidth is 1/22 of the figure.
		graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(1));// (int)Math.floor(Math.max(rect.width,rect.height)/22));

		int oriw = rect.width;
		int orih = rect.height;

		// //shrink the rectangle by the line width to make sure it will br
		// drawn _inside_
		// graphics.drawOval(rect.getCopy().shrink(graphics.getLineWidth()/2,
		// graphics.getLineWidth()/2));

		graphics
				.drawOval(calcInnerRectangle(rect, graphics.getLineWidth() * 2));

		// third. for a radius of 11, the interior radius should be 9 pixels.
		// hence 22 for the diameters 2*dim/22
		rect.shrink(2 * oriw / 22, 2 * orih / 22);
		graphics.drawOval(rect);

		// done
		graphics.popState();
	}

	public static void paintEventEnd(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();

		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.white);

		// first fill the biggest oval with white:
		Rectangle rect = fig.getBounds().getCopy();
		graphics.fillOval(rect);

		// second draw oval at the border. linewidth is 3/22 of the figure.
		graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(3));
		// (int)Math.floor(3 * Math.max(rect.width,rect.height)/22));

		// shrink the rectangle by the line width to make sure it will br drawn
		// _inside_
		// System.err.println("Before: " + rect.width + " line width " +
		// graphics.getLineWidth()/2);
		graphics.drawOval(calcInnerRectangle(rect, graphics.getLineWidth()));

		// System.err.println("After: " + rect.width);
		graphics.popState();
	}

	public static void paintTerminate(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);

		graphics.fillOval(rect.shrink(rect.width / 5, rect.height / 5));

		graphics.popState();
	}

	public static void paintMessage(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setLineWidth((int) Math.floor(Math
				.max(rect.width, rect.height) / 22));

		// graphics.drawRoundedRectangle(rect.shrink(10, 10), 8, 8);
		// System.err.println("Before: " + rect.width + " line width " +
		// graphics.getLineWidth()/2);
		graphics.drawRectangle(rect.shrink(graphics.getLineWidth() / 2
				+ rect.width / 4,// *12/22,
				graphics.getLineWidth() / 2 + rect.height * (22 - 10)
						/ (22 * 2)));

		// System.err.println("After: " + rect.width);
		// ok. now just need to compute 2 point around the center:
		// basically it is the center -1 on the y and + 1 on the x
		// then -1 and +1
		graphics.drawPolyline(new int[] { rect.getTopLeft().x,
				rect.getTopLeft().y, rect.getCenter().x, rect.getCenter().y,
				rect.getTopRight().x, rect.getTopRight().y });

		graphics.popState();
	}

	public static void paintCompensation(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);

		// shrink to the same size of rectangle than the message
		rect.shrink(rect.width / 4,// *12/22,
				rect.height * (22 - 10) / (22 * 2));// *12/22;
		rect.translate(-rect.width / 16, 0);
		PointList pl = new PointList(3);
		pl.addPoint(rect.getLeft());
		pl.addPoint(rect.getTop());
		pl.addPoint(rect.getBottom());
		graphics.fillPolygon(pl);
		pl = new PointList(3);
		pl.addPoint(rect.getCenter());
		pl.addPoint(rect.getTopRight());
		pl.addPoint(rect.getBottomRight());
		graphics.fillPolygon(pl);

		graphics.popState();
	}

	public static void paintTimer(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();

		int lineWidth = MapModeUtil.getMapMode(fig).LPtoDP(1);

		PrecisionRectangle rect = new PrecisionRectangle(fig.getBounds());

		// is it necessry?
		rect.setX(rect.preciseX + lineWidth / 2.0);
		rect.setY(rect.preciseY + lineWidth / 2.0);
		rect.setWidth(rect.preciseWidth - lineWidth);
		rect.setHeight(rect.preciseHeight - lineWidth);

		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);

		graphics.setLineWidth(lineWidth);
		// (int)Math.floor(Math.max(rect.width,rect.height)/22));

		// rect.shrink(rect.width / 5, rect.height / 5);
		// just let's use something more precise
		rect.setX(rect.preciseX + rect.preciseWidth / 5.0);
		rect.setY(rect.preciseY + rect.preciseHeight / 5.0);
		rect.setWidth(rect.preciseWidth - 2.0 * rect.preciseWidth / 5.0);
		rect.setHeight(rect.preciseHeight - 2.0 * rect.preciseHeight / 5.0);

		graphics.drawOval(rect);

		// now draw ticks
		double a = rect.preciseWidth / 2;
		double b = rect.preciseHeight / 2;
		double x0 = rect.preciseX + a;
		double y0 = rect.preciseY + b;

		final double RATIO = 0.8;
		for (int i = 0; i < 12; i++) {
			int angleGrad = i * 30;

			double x = a * Math.cos(Math.toRadians(angleGrad));
			double y = b * Math.sin(Math.toRadians(angleGrad));

			PrecisionPoint pp1 = new PrecisionPoint(x0 + x * RATIO, y0 + y
					* RATIO);
			PrecisionPoint pp2 = new PrecisionPoint(x0 + x, y0 + y);

			graphics.drawLine(pp1, pp2);
		}

		// draw hands
		graphics.drawLine(rect.getCenter(), rect.getTop().translate(
				1 * rect.width / 16, 1 * rect.height / 12));
		graphics.drawLine(rect.getCenter(), rect.getCenter().translate(
				3 * rect.width / 10, -1 * rect.width / 14));

		graphics.popState();
	}

	public static void paintError(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);

		graphics.setLineWidth((int) Math.floor(2 * Math.max(rect.width,
				rect.height) / 22));
		// graphics.setLineCap(SWT.CAP_ROUND);
		rect.shrink(rect.width / 4, rect.height / 4);

		// graphics.drawRoundRectangle(rect, 6, 6);

		Point one = rect.getTopLeft().translate(1 * rect.width / 3,
				1 * rect.height / 3);
		Point onebis = one.getCopy().translate(1 * rect.width / 10,
				1 * rect.height / 10);
		Point two = rect.getTopLeft().translate(2 * rect.width / 3,
				2 * rect.height / 3);
		Point twobis = two.getCopy().translate(-1 * rect.width / 10,
				-1 * rect.height / 10);

		graphics.drawLine(one, two);

		// graphics.setLineCap(SWT.CAP_FLAT);
		PointList pl = new PointList(4);
		pl.addPoint(rect.getBottomLeft());
		pl.addPoint(one);
		pl.addPoint(onebis);
		graphics.fillPolygon(pl);

		pl = new PointList(4);
		pl.addPoint(rect.getTopRight());
		pl.addPoint(two);
		pl.addPoint(twobis);
		graphics.fillPolygon(pl);

		// PointList pl = new PointList(4);
		// pl.addPoint(rect.getBottomLeft());
		// pl.addPoint(one);
		// pl.addPoint(two);
		// pl.addPoint(rect.getTopRight());
		// graphics.drawPolyline(pl);
		graphics.popState();
	}

	public static void paintRule(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);

		// external rectangle is twice thicker
		graphics.setLineWidth((int) Math.floor(2 * Math.max(rect.width,
				rect.height) / 22));

		// graphics.drawRoundedRectangle(rect.shrink(10, 10), 8, 8);
		// System.err.println("Before: " + rect.width + " line width " +
		// graphics.getLineWidth()/2);
		graphics.drawRectangle(rect.shrink(graphics.getLineWidth() / 2
				+ rect.width * (22 - 10) / (22 * 2), graphics.getLineWidth()
				/ 2 + rect.height / 4));

		// internal lines are thin
		graphics.setLineWidth((int) Math.floor(Math
				.max(rect.width, rect.height) / 22));

		rect.shrink(graphics.getLineWidth(), graphics.getLineWidth() * 4);

		for (int i = 0; i < 5; i++) {
			graphics.drawLine(rect.getTopLeft()
					.translate(0, i * rect.width / 5), rect.getTopRight()
					.translate(0, i * rect.width / 5));
		}

		graphics.popState();
	}

	public static void paintStar(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);

		int orih = rect.height;
		int oriw = rect.width;

		// if it is a gateway, paint the 2 ovals
		if (fig.getActivityType() == ActivityType.GATEWAY_EVENT_BASED_EXCLUSIVE) {
			Rectangle rr = rect.getCopy().shrink(9 * oriw / 44, 9 * orih / 44);
			graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(1));
			graphics.drawOval(rr);
			rr = rect.getCopy().shrink(11 * oriw / 44, 11 * orih / 44);
			graphics.drawOval(rr);
			rect.shrink(16 * oriw / 44, 16 * orih / 44);
		} else {
			// 2 triangles, one north one, one south
			// the only difficulty is to compute the center.

			// first shrink to the same size than the message width (about)
			rect.shrink(rect.width / 5,// *12/22,
					rect.height / 4);// *12/22;
		}

		// not a true hexagram but good enough for now

		// now translate to
		// graphics.fillPolygon(getStarPolygon(Math.PI/4, Math.PI / 6));
		rect.translate(0, -1 * rect.height / 5);
		PointList pl = new PointList(3);
		pl.addPoint(rect.getTop());
		pl.addPoint(rect.getBottomLeft());
		pl.addPoint(rect.getBottomRight());
		graphics.fillPolygon(pl);

		rect.translate(0, 2 * rect.height / 5);
		pl = new PointList(3);
		pl.addPoint(rect.getBottom());
		pl.addPoint(rect.getTopRight());
		pl.addPoint(rect.getTopLeft());
		graphics.fillPolygon(pl);

		graphics.popState();
	}

	static PointList getStarPolygon(double radius, double rotation) {
		PointList pointList = new PointList(10);
		/*
		 * radius2: the distance between the inner tip and the center
		 */
		double radius2 = radius * Math.sin(Math.PI / 10)
				/ Math.cos(Math.PI / 5);
		for (int i = 0; i < 5; i++) {
			// outer tip
			double xAngle = Math.PI * 2 * i / 5 + rotation - Math.PI / 2;
			float x1 = (float) (radius * Math.cos(xAngle));
			float y1 = (float) (radius * Math.sin(xAngle));
			Point point1 = new Point(Math.round(x1), Math.round(y1));
			pointList.addPoint(point1);
			// inner tip
			double xAngle2 = xAngle + Math.PI / 5;
			float x2 = (float) (radius2 * Math.cos(xAngle2));
			float y2 = (float) (radius2 * Math.sin(xAngle2));
			Point point2 = new Point(Math.round(x2), Math.round(y2));
			pointList.addPoint(point2);
		}
		return pointList;
	}

	public static void paintX(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);
		// /3 /6
		rect.shrink(rect.width / 3, rect.height / 4);
		// rect.x--;
		// rect.y--;
		rect.height--;
		rect.width--;

		// graphics.drawRoundRectangle(rect, 4, 4);

		PointList pl = new PointList(4);
		pl.addPoint(rect.getTopLeft());
		pl.addPoint(rect.getTopLeft().translate(rect.width / 3, 0));
		pl.addPoint(rect.getBottomRight());
		pl.addPoint(rect.getBottomRight().translate(-rect.width / 3, 0));
		graphics.fillPolygon(pl);

		pl = new PointList(4);
		pl.addPoint(rect.getTopRight());
		pl.addPoint(rect.getTopRight().translate(-rect.width / 3, 0));
		pl.addPoint(rect.getBottomLeft());
		pl.addPoint(rect.getBottomLeft().translate(rect.width / 3, 0));
		graphics.fillPolygon(pl);

		graphics.popState();

	}

	public static void paintPlus(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);
		// /3 /6
		rect.shrink(rect.width / 4, rect.height / 4);
		// rect.x--;
		// rect.y--;
		rect.height--;
		rect.width--;

		int delta = Math.min(rect.width, rect.height) / 7;

		// graphics.setLineWidth(1);
		// graphics.drawRoundRectangle(rect, 4, 4);

		PointList pl = new PointList(4);
		pl.addPoint(rect.getTop().translate(-delta, 0));
		pl.addPoint(rect.getTop().translate(delta, 0));
		pl.addPoint(rect.getBottom().translate(delta, 0));
		pl.addPoint(rect.getBottom().translate(-delta, 0));
		graphics.fillPolygon(pl);

		pl = new PointList(4);
		pl.addPoint(rect.getRight().translate(0, -delta));
		pl.addPoint(rect.getRight().translate(0, delta));
		pl.addPoint(rect.getLeft().translate(0, delta));
		pl.addPoint(rect.getLeft().translate(0, -delta));
		graphics.fillPolygon(pl);

		graphics.popState();

	}

	public static void paintBoldOval(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		Rectangle rect = fig.getBounds().getCopy();
		// linewidth is 1/22 of the figure. rectangle width is 12 for 22:
		// and height is 10 for 22
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.setForegroundColor(ColorConstants.black);

		int orih = rect.height;
		int oriw = rect.width;

		Rectangle rr = rect.getCopy().shrink(9 * oriw / 44, 9 * orih / 44);
		graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(3));
		graphics.drawOval(rr);

		graphics.popState();

	}

	public static void paintLoop(Graphics graphics, ActivityFigure fig) {
		graphics.pushState();
		graphics.setLineWidth(MapModeUtil.getMapMode(fig).LPtoDP(1));

		final double RATIO = 5.0;
		Rectangle figureRect = fig.getBounds().getCopy();
		double loopHeight = figureRect.height / RATIO;
		double loopWidth = Math.min(loopHeight, figureRect.width);

		double loopX = figureRect.x + (figureRect.width - loopWidth) / 2.0;
		double loopY = figureRect.y + figureRect.height - loopHeight
				- graphics.getLineWidth() * 2;
		PrecisionRectangle loopRect = new PrecisionRectangle();
		loopRect.setX(loopX);
		loopRect.setY(loopY);
		loopRect.setWidth(loopWidth);
		loopRect.setHeight(loopHeight);
		int angleGrad = 30;// between 0 and 90 - angle between vertical axis
		// and start of arc
		graphics.drawArc(loopRect, -(90 - angleGrad), 360 - 2 * angleGrad);

		// now calculate end of arc coordinates
		double dx = loopWidth / 2 * Math.cos(Math.toRadians(90 - angleGrad));
		double dy = loopHeight / 2 * Math.sin(Math.toRadians(90 - angleGrad));

		double endX = loopRect.preciseX + loopRect.preciseWidth / 2 - dx;
		double endY = loopRect.preciseY + loopRect.preciseHeight / 2 + dy;
		double length = endX - loopRect.preciseX;

		// and draw arrow
		PrecisionPoint pp1 = new PrecisionPoint(loopRect.preciseX, endY);
		PrecisionPoint pp2 = new PrecisionPoint(endX, endY);
		graphics.drawLine(pp1, pp2);
		PrecisionPoint pp3 = new PrecisionPoint(endX, endY - length);
		graphics.drawLine(pp2, pp3);

		graphics.popState();
	}

}
