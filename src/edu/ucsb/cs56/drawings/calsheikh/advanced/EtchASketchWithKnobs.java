package edu.ucsb.cs56.drawings.calsheikh.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
	A simple drawing of an EtchASketch that has knobs.Extends the EtchASketch class.Also implements Shape. 
   @author Christopher Alsheikh 
   
*/
public class EtchASketchWithKnobs extends EtchASketch implements Shape
{
	/**
       Constructor
       @param x x coord of center of EtchASketch
       @param y y coord of center of EtchASketch
       @param size the size of the EtchASketch
*/
    public EtchASketchWithKnobs(double x, double y, double size)
    {
        // construct the basic house shell
        super(x,y,size);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();


        Ellipse2D.Double knob1 =
            new Ellipse2D.Double(x - size / 2, y, size * .1, size * .1);

        Ellipse2D.Double knob2 =
            new Ellipse2D.Double(x + size / 2 - .1 * size, y, size * .1, size * .1);


        GeneralPath wholeSketch = this.get();
        wholeSketch.append(knob1, false);
	wholeSketch.append(knob2, false);
    }
}

