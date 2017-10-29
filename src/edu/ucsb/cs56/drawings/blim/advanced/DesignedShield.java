
package edu.ucsb.cs56.drawings.blim.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
   A Shield with a Design
      
   @author Brian Lim
   @version for CS56, F17, UCSB
   
*/
public class DesignedShield extends Shield implements Shape
{
    /**
     * Constructor for objects of class DesignedShield
     */
    public DesignedShield(double x, double y, double width, double height)
    {
	// construct the basic shield shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	
	double centerline = x+width/2.0;
	double crossline = y+height*0.4;
	double circleCenterX = centerline;
	double circleCenterY = crossline;
	double circleRadiusX = width/4.0;
	double circleRadiusY = height*0.25;
	
	Line2D.Double vertLine =
	    new Line2D.Double(centerline, y, centerline, y+height);
	Line2D.Double horizLine =
	    new Line2D.Double(x, crossline, x+width, crossline);
	Ellipse2D.Double circle = 
	    new Ellipse2D.Double(circleCenterX-circleRadiusX, circleCenterY-circleRadiusY, circleRadiusX*2.0, circleRadiusY*2.0);

	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
	
        GeneralPath wholeShield = this.get();
        wholeShield.append(vertLine, false);
        wholeShield.append(horizLine, false);
        wholeShield.append(circle, false); 
    }    
}
