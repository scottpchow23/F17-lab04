package edu.ucsb.cs56.drawings.ryankirkpatrick.advanced;

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
 * @author Ryan Kirkpatrick
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Stars
     */

    public static void drawPicture1(Graphics2D g2) {

	Star s1 = new Star(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(s1);

	// Make a black Star that's half the size,
	// and moved over 150 pixels in x direction

	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);

	// Here's a Star that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(s2);

	// Draw two MarioStars

	MarioStar ms1 = new MarioStar(50,350,40);
	MarioStar ms2 = new MarioStar(200,350,200);

	g2.draw(ms1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ms2);

    //Sign and label drawing
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few Stars by Ryan Kirkpatrick", 20,20);
    }


    /** Draw a different picture with a few stars
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some stars.

	Star largeStar = new Star(100,50,225);
	Star smallStar = new Star(20,50,40);
	Star tallSkinny = new Star(20,150,20);
	Star shortFat = new Star(20,250,40);

	g2.setColor(Color.RED);     g2.draw(largeStar);
	g2.setColor(Color.GREEN);   g2.draw(smallStar);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);

	Star s1 = new Star(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(s1);

	// Make a black Star that's half the size,
	// and moved over 150 pixels in x direction
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);

	// Here's a Star that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(s2);

	// Draw two Mario Stars

	MarioStar ms1 = new MarioStar(50,350,40);
	MarioStar ms2 = new MarioStar(200,350,200);

	g2.draw(ms1);
	g2.setColor(new Color(0x8F00FF));

	// Rotate the second Star 45 degrees around its center.
	Shape ms3 = ShapeTransforms.rotatedCopyOf(ms2, Math.PI/4.0);

	g2.draw(ms3);

	// Sign and label
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of Stars 2 by Ryan Kirkpatrick", 20,20);
    }

    /** Draw a different picture with a few Stars
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A bunch of Stars 3 by Ryan Kirkpatrick", 20,20);


	// Draw some stars.

	Star largeStar = new Star(100,50,225);
	Star smallStar = new Star(20,50,40);

	g2.setColor(Color.RED);     g2.draw(largeStar);
	g2.setColor(Color.GREEN);   g2.draw(smallStar);

    MarioStar bigStar = new MarioStar(300, 400, 100);
    MarioStar littleStar = new MarioStar(400, 400, 25);

    g2.setColor(Color.BLUE);  g2.draw(littleStar);
    g2.setColor(new Color(0x8F00FF));  g2.draw(bigStar);


    }
}
