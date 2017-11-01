package edu.ucsb.cs56.drawings.jnilsen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an ordinary plane that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Justin Nilsen 
   @version for CS56, F17, UCSB
   
*/
public class Plane extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of Plane
       @param y y coord of lower left corner of Plane
       @param width width of the Plane
       @param height of Plane (including body and tail fin)
    */
    public Plane(double x, double y, double width, double height)
    {
	
	//DIMENSIONS
	double bodyHeight = 0.5 * height;
	double finHeight = 0.25 * height;
	double wingHeight = height - (finHeight + bodyHeight/1.5);
	double planeBodyUpperLeftY = y + finHeight;
	double wingUpperLeftY = y + finHeight + bodyHeight;

	// MAKE THE BODY

	Ellipse2D.Double body = new Ellipse2D.Double(x, planeBodyUpperLeftY, width, bodyHeight);
	
	// MAKE THE WINGS
	
	Rectangle2D.Double leftWing = new Rectangle2D.Double(x + width/2.0, y + finHeight + bodyHeight/1.5, width/5.0, wingHeight);

	Rectangle2D.Double rightWing = new Rectangle2D.Double(x + width/2.0, y + (bodyHeight - bodyHeight/1.5), width/5.0, wingHeight);

	// MAKE THE FIN

	Line2D.Double leftFin = new Line2D.Double (x + (4*(width/5.0)), y + finHeight + bodyHeight/2.0, x + width, y + finHeight/2.5);
	Line2D.Double rightFin = new Line2D.Double (x + width, y + finHeight/2.5, x + width, y + finHeight + bodyHeight/2.0); 

	// PUT THE PLANE TOGETHER BOIS

	GeneralPath wholePlane = this.get();
	wholePlane.append(body, false);
	wholePlane.append(leftWing, false);
	wholePlane.append(rightWing, false);
	wholePlane.append(leftFin, false);
	wholePlane.append(rightFin, false);
	
    }
}
