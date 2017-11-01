package edu.ucsb.cs56.drawings.efreilafert.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;



import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Necklace with cross
      
   @author Eric Freilafert 
   @version for CS56, F17, UCSB
   
*/


public class NecklaceWithCross extends Necklace implements Shape
{   
	/**
     Constructor for objects of class Necklace   
       
       @param x x coord of lower left corner of necklace
       @param y y coord of lower left corner of necklace
       @param width width of the necklace
       @param height of necklace
     */
    public NecklaceWithCross(double x, double y, double width, double height)
    {
    	//Creates the basic necklace 
    	super(x,y,width,height);
    	 GeneralPath gp = this.get();


    	//Generates the cross pendant
		Rectangle2D.Double win1 = new Rectangle2D.Double(x + 0.5*width, y + height, 0.25, 0.25*height);
		gp.append(win1, false);
	
		Rectangle2D.Double win2 = new Rectangle2D.Double(x + 0.35*width, y+height + 5, 0.2*height, 0.25);
	

		//Attaches cross pendant to neckalce
		if(width > height)
		{
			Rectangle2D.Double win3 = new Rectangle2D.Double(x + 0.45*width, y+height + 10, 0.2*height, 0.25);
			gp.append(win3, false);
		}

		else
		{
			gp.append(win2, false);
		}
    }

}
