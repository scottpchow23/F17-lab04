package edu.ucsb.cs56.drawings.jnilsen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Plane
      
   @author Justin Nilsen 
   @version for CS56, F17, UCSB
   
*/
public class Biplane extends Plane implements Shape
{
    /**
     * Constructor for objects of class Biplane
     */
    public Biplane(double x, double y, double width, double height)
    {
	// construct the basic plane shell
	super(x,y,width,height);

        double bodyHeight = 0.5 * height;
        double finHeight = 0.25 * height;
        double wingHeight = height - (finHeight + bodyHeight/1.5);
        double planeBodyUpperLeftY = y + finHeight;
        double wingUpperLeftY = y + finHeight + bodyHeight;

	Rectangle2D.Double leftWingTop = new Rectangle2D.Double(x + width/1.9, y + finHeight + bodyHeight/2.0, width/5.0, wingHeight);

        Rectangle2D.Double rightWingTop = new Rectangle2D.Double(x + width/1.9, y, width/5.0, wingHeight);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
        GeneralPath wholePlane = this.get();
        wholePlane.append(leftWingTop, false);
        wholePlane.append(rightWingTop, false);
    }    
}
