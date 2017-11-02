package edu.ucsb.cs56.drawings.richa_wadaskar.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a general computer that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Richa Wadaskar
   @version for CS56, F17, UCSB
   
*/
public class Computer extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left corner of computer
       @param y y coord of top left corner of computer
       @param width width of the computer
       @param height of computer (including the stand)
    */
    public Computer(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.

	double screenHeight = 0.80 * height ;
	double standHeight = 0.10 * height;
	double standWidth = 0.12 * width;

	double innerScreenWidth = 0.10*width;

	double standX = x + (width/2 - 0.5*standWidth);
	double standY = y + screenHeight;

	double standBaseWidth = 2.5*standWidth;
	double standBaseHeight = height - screenHeight - standHeight;
	
        // Make the outer screen
        
        Rectangle2D.Double outerScreen = 
            new Rectangle2D.Double(x, y,
				   width, screenHeight);

	Rectangle2D.Double innerScreen =
	    new Rectangle2D.Double(x + innerScreenWidth, y + innerScreenWidth,
				   width - (2*innerScreenWidth), screenHeight - (2*innerScreenWidth));
	
	Rectangle2D.Double stand = new Rectangle2D.Double(standX, standY,
				   standWidth, standHeight);
	
	Rectangle2D.Double standBase =
	    new Rectangle2D.Double(x + width/2 - 0.5*standBaseWidth, standY + standHeight, standBaseWidth, standBaseHeight);
	
        // put the whole computer together
	
        GeneralPath wholeComputer = this.get();
        wholeComputer.append(outerScreen, false);
        wholeComputer.append(innerScreen, false);
        wholeComputer.append(stand, false);
	wholeComputer.append(standBase, false);
    }
}
