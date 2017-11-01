package edu.ucsb.cs56.drawings.calsheikh.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
	A simple drawing of an EtchASketch that can be drawn, rotated, and scaled (Implements the Shape Interface.)
	@author Christopher Alsheikh 
   
*/
public class EtchASketch extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       @param x x coord of center of EtchASketch
       @param y y coord of center of EtchASketch
       @param size the size of the EtchASketch
       
    */
    public EtchASketch(double x, double y, double size)
    {


        double Height = .70 * size;

        // Make the first story

        Rectangle2D.Double outerFrame =
            new Rectangle2D.Double(x - size / 2, y - size / 2,
                                   size, size * .7);
        
	Rectangle2D.Double innerFrame =
            new Rectangle2D.Double(x - .8 * size / 2, y - .8 * size / 2,
                                   size * .8, size * .7 * .8);

        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen


        // put the whole house together

        GeneralPath wholeSketch = this.get();
        wholeSketch.append(outerFrame, false);
	wholeSketch.append(innerFrame, false);
    }
}

