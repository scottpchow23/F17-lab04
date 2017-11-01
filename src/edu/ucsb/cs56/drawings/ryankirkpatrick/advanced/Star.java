package edu.ucsb.cs56.drawings.ryankirkpatrick.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a star that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Ryan Kirkpatrick
   @version for CS56, F17, UCSB

*/
public class Star extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of center of star
       @param y y coord of center of star
       @param r distance from center to one of the points
    */
    public Star(double x, double y, double r)
    {
        double sin18 = Math.sin(Math.toRadians(18));
        double cos18 = Math.cos(Math.toRadians(18));
        double sin54 = Math.sin(Math.toRadians(54));
        double cos54 = Math.cos(Math.toRadians(54));


        double Tx = x; //Top x
        double Ty = y-r; //Top y
        double ULx = x - r*cos18; //Upper left x
        double ULy = y - r*sin18; //Upper left y
        double URx = x + r*cos18; //Upper right x
        double URy = y - r*sin18; //Upper right y
        double LLx = x - r*cos54; //Lower left x
        double LLy = y + r*sin54; //Lower left y
        double LRx = x + r*cos54; //Lower right x
        double LRy = y + r*sin54; //Lower right y


        //Make lines for the star
        Line2D.Double TLL  = new Line2D.Double(Tx, Ty, LLx, LLy); //Top to lower left
        Line2D.Double LLUR = new Line2D.Double(LLx, LLy, URx, URy); //Lower left to upper right
        Line2D.Double URUL = new Line2D.Double(URx, URy, ULx, ULy); //upper right to upper left
        Line2D.Double ULLR = new Line2D.Double(ULx, ULy, LRx, LRy); // upper left to lower right
        Line2D.Double LRT  = new Line2D.Double(LRx, LRy, Tx, Ty); //lower right to top


        //Put all the lines together
        GeneralPath wholeStar = this.get();
        wholeStar.append(TLL, false);
        wholeStar.append(LLUR, false);
        wholeStar.append(URUL, false);
        wholeStar.append(ULLR, false);
        wholeStar.append(LRT, false);
    }
}
