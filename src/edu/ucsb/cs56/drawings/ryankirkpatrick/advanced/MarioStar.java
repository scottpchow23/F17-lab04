package edu.ucsb.cs56.drawings.ryankirkpatrick.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Ellipse2D;
/**
   A Star with eyes that resemble the stars from Mario

   @author Ryan Kirkpatrick
   @version for CS56, F17, UCSB

*/
public class MarioStar extends Star implements Shape
{
    /**
     * Constructor for objects of class MarioStar
     @param x x coord of center of star
     @param y y coord of center of star
     @param r distance from center to one of the points
     */
    public MarioStar(double x, double y, double r)
    {
	// construct the basic star
	super(x,y,r);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	double eyeWidth = 0.10 * r;
	double eyeHeight =  0.25 * r;
	double eyeTop = y - 0.2 * r;
    double eyeLeft = x - 0.2 * r;

	RoundRectangle2D.Double leftEye = new RoundRectangle2D.Double(
                                        eyeLeft, eyeTop, eyeWidth, eyeHeight, 10, 10);
	RoundRectangle2D.Double rightEye = new RoundRectangle2D.Double(
                                        eyeLeft + 3*eyeWidth, eyeTop, eyeWidth, eyeHeight, 10, 10);
    Ellipse2D.Double leftGlare = new Ellipse2D.Double(
                                    eyeLeft, eyeTop,
                                    eyeWidth/2, eyeHeight/2);
    Ellipse2D.Double rightGlare = new Ellipse2D.Double(
                                    eyeLeft + 3*eyeWidth, eyeTop,
                                    eyeWidth/2, eyeHeight/2);
	// add the eyes to the star

    GeneralPath wholeStar = this.get();
    wholeStar.append(leftEye, false);
    wholeStar.append(rightEye, false);
    wholeStar.append(leftGlare, false);
    wholeStar.append(rightGlare, false);

    }
}
