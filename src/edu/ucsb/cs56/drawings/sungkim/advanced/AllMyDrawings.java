package edu.ucsb.cs56.drawings.sungkim.advanced;

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
 * @author Sung Kim
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses
     */

    public static void drawPicture1(Graphics2D g2) {

        Flag f1 = new Flag(100, 200, 100);
        g2.setColor(Color.CYAN); g2.draw(f1);

	// Make a black house that's half the size,
	// and moved over 150 pixels in x direction

	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);

	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(f2);

	// Draw two houses with Windows

	FlagOfGreenland fg1 = new FlagOfGreenland(50, 100, 150);

	g2.draw(fg1);
	g2.setColor(new Color(0x8F00FF));

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few flags by Sung Kim", 20,20);
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some coffee cups.

	Flag f1 = new Flag(100,50,150);
	FlagOfGreenland fg1 = new FlagOfGreenland(20,50,30);
	Flag f2 = new Flag(20,150,40);
	FlagOfGreenland fg2 = new FlagOfGreenland(20,250,20);

	g2.setColor(Color.RED);     g2.draw(f1);
	g2.setColor(Color.GREEN);   g2.draw(fg1);
	g2.setColor(Color.BLUE);    g2.draw(f2);
	g2.setColor(Color.MAGENTA); g2.draw(fg2);

	FlagOfGreenland F1 = new FlagOfGreenland(100,250,175);
	g2.setColor(Color.CYAN); g2.draw(F1);

	// Make a black house that's half the size,
	// and moved over 150 pixels in x direction
	Shape F2 = ShapeTransforms.scaledCopyOfLL(F1,0.5,0.5);
	F2 = ShapeTransforms.translatedCopyOf(F2,150,0);
	g2.setColor(Color.BLACK); g2.draw(F2);

	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	F2 = ShapeTransforms.scaledCopyOfLL(F2,4,4);
	F2 = ShapeTransforms.translatedCopyOf(F2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(F2);

	// Draw two houses with Windows

	FlagOfGreenland fG1 = new FlagOfGreenland(50,350,175);
	FlagOfGreenland fG2 = new FlagOfGreenland(200,350,200);

	g2.draw(fG1);
	g2.setColor(new Color(0x8F00FF));

	// Rotate the second house 45 degrees around its center.
	Shape fG3 = ShapeTransforms.rotatedCopyOf(fG2, Math.PI/4.0);

	g2.draw(fG3);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of flags by Sung Kim", 20,20);
    }

    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A bunch of flags by Sung Kim", 20,20);


	// Draw some coffee cups.

	FlagOfGreenland largeF = new FlagOfGreenland(50,50,50);
	FlagOfGreenland smallF = new FlagOfGreenland(100,100,100);

	g2.setColor(Color.RED);     g2.draw(largeF);
	g2.setColor(Color.GREEN);   g2.draw(smallF);

    }
}
