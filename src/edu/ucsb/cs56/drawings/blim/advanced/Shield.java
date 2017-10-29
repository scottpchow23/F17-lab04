package edu.ucsb.cs56.drawings.blim.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a shield that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Brian Lim
   @version for CS56, F17, UCSB
   
*/
public class Shield extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of the shield
       @param y y coord of upper left corner of the shield
       @param width width of the shield
       @param height height of the shield
    */
    public Shield(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double topHeight = .6 * height;
        // Make the top 2/3 of the shield
        
	Line2D.Double leftShield =
	    new Line2D.Double(x,y,x,y+topHeight);
	Line2D.Double topShield =
	    new Line2D.Double(x,y,x+width,y);
	Line2D.Double rightShield =
	    new Line2D.Double(x+width,y,x+width,y+topHeight);
	
        // make the bottom tapered section.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftTaper = 
            new Line2D.Double (x, y + topHeight,
                               x + width/2.0, y+height);
	
        Line2D.Double rightTaper =
            new Line2D.Double (x + width/2.0, y+height,
                               x + width, y + topHeight);
	
        // put the whole house together
	
        GeneralPath wholeShield = this.get();
        wholeShield.append(leftShield, false);
        wholeShield.append(topShield, false);
        wholeShield.append(rightShield, false);
	wholeShield.append(leftTaper, false);
	wholeShield.append(rightTaper, false);
    }
}
