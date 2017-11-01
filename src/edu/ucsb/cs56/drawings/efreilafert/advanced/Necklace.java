package edu.ucsb.cs56.drawings.efreilafert.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;


import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a necklace that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Eric Freilafert 
   @version for CS56, F17, UCSB
   
*/


public class Necklace extends GeneralPathWrapper implements Shape
{   
    /**
     Constructor for objects of class Necklace   
       
       @param x x coord of lower left corner of necklace
       @param y y coord of lower left corner of necklace
       @param width width of the necklace
       @param height of necklace
     */
    public Necklace(double x, double y, double width, double height)
    {
    	//Creates the necklace of specified parameters.
        Ellipse2D.Double newNecklace = new Ellipse2D.Double(x, y, width, height);

        GeneralPath wholeNecklace = this.get();
         // put the whole necklace together
        wholeNecklace.append(newNecklace, false);
    }

}
