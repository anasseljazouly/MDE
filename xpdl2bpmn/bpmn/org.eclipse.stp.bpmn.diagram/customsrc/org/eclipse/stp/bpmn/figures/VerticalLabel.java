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

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ScaledGraphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;

/**
 * A vertical label.
 * 
 * @author hmalphettes
 */
public class VerticalLabel extends WrapLabel {
	
	/**
	 * [Hugues] this was the code suggested here: http://www.eclipsezone.com/eclipse/forums/t73282.html
	 */
	public void paintFigure(final Graphics graphics) {
		String theText = super.getText();
		if (theText == null || theText.trim().length() == 0) {
			theText = "-";
//			super.paintFigure(graphics);
		}
        
        if (graphics instanceof ScaledGraphics) {
            
        }
        
		//this might have issues on mac. ImageUtilities clips the lower parts of
        //the letters
		Image foo = createRotatedImageOfString(
				theText, super.getFont(),
				super.getForegroundColor(), super.getBackgroundColor());
		graphics.drawImage(foo, super.getBounds().getTopLeft());
        //TODO: something better for the centering the label!
//				super.getBounds().getTopLeft().getCopy().translate(4, 0));
		foo.dispose();
        
        //this does not work inside GMF graphics :(
//		//alternative: might have same issue on the mac too
//		graphics.pushState();
//		graphics.setFont(super.getFont());
//		graphics.rotate(90.0f);
//		graphics.drawText(theText, super.getBounds().getTopLeft());
//		graphics.popState(); 
		
	}
    
    /**
     * Fix the issues in the ImageUtilities where the size of the image
     * is the ascent of the font instead of being its height.
     * 
     * Also uses the GC for the rotation.
     * 
     * The biggest issue is the very idea of using an image.
     * The size of the font should be given by the mapmode, not in absolute
     * device pixel as it does look ugly when zooming in.
     * 
     * 
     * @param string the String to be rendered
     * @param font the font
     * @param foreground the text's color
     * @param background the background color
     * @return an Image which must be disposed
     */
    public Image createRotatedImageOfString(String string, Font font, 
                                                   Color foreground, Color background) {
        Display display = Display.getCurrent();
        if (display == null) {
            SWT.error(SWT.ERROR_THREAD_INVALID_ACCESS);
        }
        
//        double scale = DiagramMapModeUtil.getScale(MapModeUtil.getMapMode(this));
//        FontData oriFont = font.getFontData()[0];
//        FontData data = new FontData(oriFont.getName(),
//                (int) Math.floor(scale*oriFont.getHeight()), SWT.NORMAL);
//        
//        Font nFont = new Font(font.getDevice(), data);
        
        FontMetrics metrics = FigureUtilities.getFontMetrics(font);
        Dimension strSize = FigureUtilities.getStringExtents(string, font);
        Image srcImage = new Image(display, metrics.getHeight(), strSize.width);
        GC gc = new GC(srcImage);
        Transform transform = new Transform(display);
        transform.rotate(-90);
        gc.setTransform(transform);
        gc.setFont(font);
        gc.setForeground(foreground);
        gc.setBackground(background);
        gc.fillRectangle(gc.getClipping());
        gc.drawString(string, gc.getClipping().x, 
                gc.getClipping().y - metrics.getLeading());
        gc.dispose();
        return srcImage;
    }

	
//	/**
//	 * This does not change a thing!
//	 */
//	@Override
//    protected Point getTextLocation() {
//        if(textLocationRotated != null) {
//            return textLocationRotated;
//        } else {
//        	textLocationRotated = new Point(super.getTextLocation());
//        	textLocationRotated = new Point(textLocationRotated.y, textLocationRotated.x);
//            return textLocationRotated;
//        }
//    }

	
	@Override
	public Rectangle getTextBounds() {
		Rectangle rect = super.getTextBounds();
		return new Rectangle(rect.x, rect.y, rect.height, rect.width);
	}
	
	@Override
    protected Dimension calculateLabelSize(Dimension txtSize) {
    	return new Dimension(txtSize.height, txtSize.width + 4);
    }

    
}
