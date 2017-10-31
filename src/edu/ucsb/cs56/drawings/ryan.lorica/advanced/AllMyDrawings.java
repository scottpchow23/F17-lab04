package edu.ucsb.cs56.drawings.ryan.lorica.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Ryan Lorica
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
  /**
  Draw a picture with a turtles
  */
  public static void drawPicture1(Graphics2D g2) {

    Turtle t1 = new Turtle(100,100,100,75);
    g2.setColor(Color.CYAN);
    g2.draw(t1);

    // Make a black turtle that's half the size,
    // and moved over 150 pixels in x direction
    Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
    t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
    g2.setColor(Color.BLACK);
    g2.draw(t2);

    // Here's a turtle that's 4x as big (2x the original)
    // and moved over 150 more pixels to right.
    t2 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
    t2 = ShapeTransforms.translatedCopyOf(t2,150,100);

    // We'll draw this with a thicker stroke
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

    // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
    // #002FA7 is "International Klein Blue" according to Wikipedia
    // In HTML we use #, but in Java (and C/C++) its 0x
    Stroke orig = g2.getStroke();
    g2.setStroke(thick);
    g2.setColor(new Color(0x002FA7));
    g2.draw(t2);


    // Draw two turtles with hats
    TurtleWithHat th1 = new TurtleWithHat(150,300,100,70);
    TurtleWithHat th2 = new TurtleWithHat(300,250,200,150);

    g2.draw(th1);

    g2.setColor(new Color(0x8F00FF));
    g2.draw(th2);


    // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

    g2.setStroke(orig);
    g2.setColor(Color.BLACK);
    g2.drawString("Some turtles, by Ryan Lorica", 20,20);
  }


  /**
  Draw a picture with a few turtles and turtles with hats
  */
  public static void drawPicture2(Graphics2D g2) {

    // Draw some coffee cups.

    Turtle large = new Turtle(100,50,225,150);
    Turtle smallTurtle = new Turtle(20,50,40,30);
    Turtle tallSkinny = new Turtle(20,150,20,40);
    Turtle shortFat = new Turtle(20,250,40,20);

    g2.setColor(Color.RED);     g2.draw(large);
    g2.setColor(Color.GREEN);   g2.draw(smallTurtle);
    g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
    g2.setColor(Color.MAGENTA); g2.draw(shortFat);

    TurtleWithHat t1 = new TurtleWithHat(100,250,50,75);
    g2.setColor(Color.CYAN); g2.draw(t1);

    // Make a black turtle with hat that's half the size,
    // and moved over 150 pixels in x direction
    Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
    t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
    g2.setColor(Color.BLACK); g2.draw(t2);

    // Here's a turtle with hat that's 4x as big (2x the original)
    // and moved over 150 more pixels to right.
    t2 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
    t2 = ShapeTransforms.translatedCopyOf(t2,150,0);

    // We'll draw this with a thicker stroke
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

    // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
    // #002FA7 is "International Klein Blue" according to Wikipedia
    // In HTML we use #, but in Java (and C/C++) its 0x

    Stroke orig=g2.getStroke();
    g2.setStroke(thick);
    g2.setColor(new Color(0x002FA7));
    g2.draw(t2);

    // Draw two turtles with hats

    TurtleWithHat th1 = new TurtleWithHat(50,350,40,75);
    TurtleWithHat th2 = new TurtleWithHat(200,350,200,100);

    g2.draw(th1);
    g2.setColor(new Color(0x8F00FF));

    // Rotate the second house 45 degrees around its center.
    Shape th3 = ShapeTransforms.rotatedCopyOf(th2, Math.PI/4.0);

    g2.draw(th3);
    // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
    g2.setStroke(orig);

    g2.setColor(Color.BLACK);

    g2.drawString("A bunch of turtles, by Ryan Lorica", 20,20);
  }

  /**
    Draw a different picture with turtles with hats
  */
  public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A bunch of Turtles, by Ryan Lorica", 20,20);


	// Draw some turtles.

	TurtleWithHat large = new TurtleWithHat(100,50,225,150);

	g2.setColor(Color.RED);
  g2.draw(large);

  TurtleWithHat small = new TurtleWithHat(20,50,40,30);

	g2.setColor(Color.GREEN);
  g2.draw(small);

  }
}
