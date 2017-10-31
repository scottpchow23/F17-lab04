package edu.ucsb.cs56.drawings.ryan.lorica.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

import edu.ucsb.cs56.drawings.pconrad.simple.Circle;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**

  An outline of a turtle

  @author Ryan lorica
  @version for CS56, F17 Lab 04

  */

public class Turtle extends GeneralPathWrapper implements Shape
{

  /**
   * Constructor for Turtle
   */
   public Turtle(double x, double y, double width, double height)
   {

     final double ORIG_ULX = 100.0;
     final double ORIG_ULY = 100.0;
     final double ORIG_HEIGHT = 300.0;
     final double ORIG_WIDTH = 500.0;

     // Shell
     GeneralPath shell = new GeneralPath();
     shell.moveTo(100, 300);
     shell.lineTo(100, 200);
     shell.lineTo(200, 100);
     shell.lineTo(400, 100);
     shell.lineTo(500, 200);
     shell.lineTo(500, 300);
     shell.lineTo(100, 300);

     // Left leg
     Circle leftleg = new Circle(200, 325, 25);

     // Right leg
     Circle rightleg = new Circle(400, 325, 25);

     // Head
     Circle head = new Circle(550, 250, 50);

     // Put it together
     GeneralPath turtle = new GeneralPath();
     turtle.append(shell, false);
     turtle.append(leftleg, false);
     turtle.append(rightleg, false);
     turtle.append(head, false);

     Shape s = ShapeTransforms.translatedCopyOf(turtle, -ORIG_ULX + x, -ORIG_ULY + y);
     s = ShapeTransforms.scaledCopyOf(s, width/ORIG_WIDTH, height/ORIG_HEIGHT);

     this.set(new GeneralPath(s));

   }
}
