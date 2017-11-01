package edu.ucsb.cs56.drawings.jnilsen.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures of planes and biplanes
 * 
 * @author Justin Nilsen
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /** Draw a picture with a few planes and biplanes
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Plane p1 = new Plane(100,250,50,30);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black plane that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a plane that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two Biplanes
	
	Biplane bp1 = new Biplane(50,350,40,30);
	Biplane bp2 = new Biplane(200,350,200,50);
	
	g2.draw(bp1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bp2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few planes by Justin Nilsen", 20,20);
    }
    
    
    /** Draw a picture with a few planes
     */
    public static void drawPicture2(Graphics2D g2) {
	
	Plane p1 = new Plane(100,250,100,30);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black plane that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a plane that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two biplanes
	
	Biplane bp1 = new Biplane(50,350,80,30);
	Biplane bp2 = new Biplane(200,350,400,50);
	
	g2.draw(bp1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second biplane 45 degrees around its center.
	Shape bp3 = ShapeTransforms.rotatedCopyOf(bp2, Math.PI/4.0);
	
	g2.draw(bp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Planes and Biplanes by Justin Nilsen", 20,20);
    }
    
    /** Draw a different picture with a few planes
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Planes by Justin Nilsen", 20,20);
	
	
	// Draw some planes.
	
	Plane p1 = new Plane(100,50,225,150);
	Biplane bp1 = new Biplane(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(p1);
	g2.setColor(Color.GREEN);   g2.draw(bp1);
	
    }       
}
