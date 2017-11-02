package edu.ucsb.cs56.drawings.richa_wadaskar.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various computers and laptops
 * 
 * @author Richa Wadaskar 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few computers 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Computer c1 = new Computer(100,250,75,50);
	g2.setColor(Color.CYAN); g2.draw(c1);
	
	// Make a black computer that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Here's a computer that's 4x as big (2x the original)
	// and moved over 150 more pixels to right and 10 pixels down.
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,50,10);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2);
	
	Computer c3 = new Computer(50,250,400,250);
	g2.setColor(Color.GREEN);
	g2.draw(c3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few computers by Richard", 20,20);
    }
    
    
    /** Draw a picture with a few computers and laptops
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some keyboards and computers
	
	ComputerWithKeyboard large = new ComputerWithKeyboard(100,50,225,150);
	ComputerWithKeyboard smallCC = new ComputerWithKeyboard(20,50,40,30);
	ComputerWithKeyboard tallSkinny = new ComputerWithKeyboard(20,150,20,40);
	ComputerWithKeyboard shortFat = new ComputerWithKeyboard(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Computer c1 = new Computer(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(c1);
	
	// Make a black computer that's half the size, 
	// and moved over 150 pixels in x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Here's a computer that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2); 

	//Draw a laptop
	
	ComputerWithKeyboard l1 = new ComputerWithKeyboard(50,350,40,75);
	
	g2.draw(l1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the computer wiht keyboard 45 degrees around its center.
	Shape l2 = ShapeTransforms.rotatedCopyOf(l1, Math.PI/4.0);
	
	g2.draw(l2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Computers and Keyboards by Richard", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of twisted Computers by Richard", 20,20);

	Computer c3 = new Computer(100,75,300,200);
	g2.draw(c3);
	
	// Draw some computers.
	
	Computer large = new Computer(100,50,225,150);
	Computer smallCC = new Computer(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);

	Shape c4 = ShapeTransforms.rotatedCopyOf(c3, Math.PI/2.0);
	g2.setColor(Color.BLACK);
	g2.draw(c4);

	ComputerWithKeyboard c1 = new ComputerWithKeyboard(200,100,85,100);
	Shape c5 = ShapeTransforms.rotatedCopyOf(c3, Math.PI/6.0);
	g2.draw(c5);
    }       
}
