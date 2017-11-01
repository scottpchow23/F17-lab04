package edu.ucsb.cs56.drawings.calsheikh.advanced;

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
 * @author Christopher Alsheikh
 */

public class AllMyDrawings
{
    /** Draw a picture with a small EtchASketch and a bigger one with knobs. 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	EtchASketchWithKnobs e1 = new EtchASketchWithKnobs(150,200,300);
	g2.setColor(Color.CYAN); g2.draw(e1);


	EtchASketch e2 = new EtchASketch(500,400,100);
	g2.setColor(Color.RED); g2.draw(e2);
	
	
	g2.drawString("Big Etch a Sketch with knobs and small EtchASketch", 300,20);
    }
    
    
    /** Draw several EtchASketches with some copies that are scaled and transformed.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some EtchASketches.
	
	EtchASketchWithKnobs large = new EtchASketchWithKnobs(150,150,225);
	EtchASketchWithKnobs small = new EtchASketchWithKnobs(20,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
	EtchASketchWithKnobs e1 = new EtchASketchWithKnobs(200,250,300);
	g2.setColor(Color.CYAN); g2.draw(e1);
	
	// Make a black EtchASketch that's half the size, 
	// and moved over 150 pixels in x direction
	Shape e2 = ShapeTransforms.scaledCopyOfLL(e1,0.5,0.5);
	e2 = ShapeTransforms.translatedCopyOf(e2,150,0);
	g2.setColor(Color.BLACK); g2.draw(e2);
	
	

	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(e2); 
	
	
	
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Several EtchASketches with knobs, with scaled and transformed copies.", 30,30);
    }
    
    /** Draw an EtchASketch with knobs and a rotated copy over it.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("An EtchASketch with knobs with a rotated one on top", 20,20);
	
	
	
	EtchASketchWithKnobs e1 = new EtchASketchWithKnobs(300,300,225);
	Shape e2 = ShapeTransforms.rotatedCopyOf(e1, Math.PI/4.0);
	g2.setColor(Color.RED);     g2.draw(e1);
	g2.setColor(Color.GREEN);   g2.draw(e2);
	
    }       
}
