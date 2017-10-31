package edu.ucsb.cs56.drawings.sungkim.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a flag on a flagpole that implements the Shape interface
   so that it can be drawn, rotated, scaled, etc.

   @author Sung Kim
   @version for CS56, F17, UCSB

*/
public class Flag extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of the tip of the flagpole
       @param y y coord of the tip of the flagpole
       @param height height of house (including the pole)
    */
    public Flag(double x, double y, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

        double flagPoleHeight = height * .9;
        double flagPoleTipHeight = height - flagPoleHeight;
        double flagHeight = height * .4;

        double flagPoleTipY = y + height;

        // Make the flag pole tip

        Ellipse2D.Double flagPoleTip =
            new Ellipse2D.Double(x, y,
				   flagPoleTipHeight, flagPoleTipHeight);

        // make the flagpole and flag.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen

        Rectangle2D.Double flagPole =
            new Rectangle2D.Double(x, y + flagPoleTipHeight,
                                    flagPoleTipHeight, flagPoleHeight);

        Rectangle2D.Double flag =
            new Rectangle2D.Double(x + flagPoleTipHeight, y + flagPoleTipHeight,
                                    flagHeight * 1.5, flagHeight);

        // put the whole flag together

        GeneralPath wholeFlag = this.get();
        wholeFlag.append(flagPoleTip, false);
        wholeFlag.append(flagPole, false);
        wholeFlag.append(flag, false);
    }
}
