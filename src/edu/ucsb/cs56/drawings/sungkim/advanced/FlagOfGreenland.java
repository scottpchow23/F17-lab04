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
	// construct the basic house shell
	super(x,y,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;



	double horizontalStartX = x + height * .1;
	double horizontalStartY = y + height * .3;
	double horizontalEndX = horizontalStartX + height * .6;
        double horizontalEndY = y + height * .3;

        double ellipseX = horizontalStartX + .166 * height * .6;
        double ellipseY = horizontalStartY - .166 * height * .6;
        double ellipseDiam = height * .2;

	Line2D.Double comp1 =
	    new Line2D.Double(horizontalStartX, horizontalStartY, horizontalEndX, horizontalEndY);

	Ellipse2D.Double comp2 =
	    new Ellipse2D.Double(ellipseX, ellipseY, ellipseDiam, ellipseDiam);


	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeFlag = this.get();
        wholeFlag.append(comp1, false);
        wholeFlag.append(comp2, false);
    }
}
