package edu.ucsb.cs56.drawings.ryan.lorica.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

/**

  A Turtle with a hat

  @author Ryan Lorica
  @version for CS56, F17, UCSB

  */

public class TurtleWithHat extends Turtle implements Shape
{
  /**
   * Constructor for Turtles with Hats
   */
   public TurtleWithHat(double x, double y, double width, double height)
   {
     super(x, y, width, height);

     GeneralPath hat = new GeneralPath();
     hat.moveTo(x + (0.85 * width), y + (0.33 * height));
     hat.lineTo(x + (0.95 * width), y + (0.33 * height));
     hat.lineTo(x + (0.90 * width), y + (0.25 * height));
     hat.lineTo(x + (0.85 * width), y + (0.33 * height));

     GeneralPath turtle = this.get();
     turtle.append(hat, false);
   }
}
