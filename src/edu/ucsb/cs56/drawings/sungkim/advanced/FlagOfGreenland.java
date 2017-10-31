package edu.ucsb.cs56.drawings.sungkim.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

/**
   A flagpole and a flag with the flag of Greenland's design

   @author Sung Kim
   @version for CS56, F17, UCSB

*/
public class FlagOfGreenland extends Flag implements Shape
{
    /**
     * Constructor for objects of class FlagOfGreenland
        @param x x coord of the tip of the flagpole
        @param y y coord of the tip of the flagpole
        @param height height of the entire flagpole
    */
    public FlagOfGreenland(double x, double y, double height)
    {
	// construct the basic flag shell
	super(x,y,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

        // in the flag of Greenland, a horizontal line runs halfway
        // through the flag
	double horizontalStartX = x + height * .1;
	double horizontalStartY = y + height * .3;
	double horizontalEndX = horizontalStartX + height * .6;
        double horizontalEndY = y + height * .3;

        // in the flag of Greenland, a circle exists closer to the
        // left side of the flag
        double ellipseX = horizontalStartX + .166 * height * .6;
        double ellipseY = horizontalStartY - .166 * height * .6;
        double ellipseDiam = height * .2;

	Line2D.Double comp1 =
	    new Line2D.Double(horizontalStartX, horizontalStartY, horizontalEndX, horizontalEndY);

	Ellipse2D.Double comp2 =
	    new Ellipse2D.Double(ellipseX, ellipseY, ellipseDiam, ellipseDiam);

        //Adds the flag of Greenland's characteristics to your regular flag

        GeneralPath wholeFlag = this.get();
        wholeFlag.append(comp1, false);
        wholeFlag.append(comp2, false);
    }
}
