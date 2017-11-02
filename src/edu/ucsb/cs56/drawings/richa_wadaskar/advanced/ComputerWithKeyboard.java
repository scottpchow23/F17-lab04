package edu.ucsb.cs56.drawings.richa_wadaskar.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A Laptop

   @author Richa Wadaskar
   @version for CS56, F17, UCSB

*/
public class ComputerWithKeyboard extends Computer implements Shape
{
    /**
     * Constructor for objects of class ComputerWithKeyboard
     */
    public ComputerWithKeyboard(double x, double y, double width, double height)
    {
	// construct the basic computer shell
	super(x,y,width,height);
        
	double keyboardHeight = 0.20 * height;
	double keyboardWidth = 0.80 * width;
	double keyboardX = x + width/2 - 0.5*keyboardWidth;
	double keyboardY = y + height + 0.10*height;

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Rectangle2D.Double keyboard = new Rectangle2D.Double(keyboardX, keyboardY, keyboardWidth, keyboardHeight);

	double keyboardInsideWidth = 0.9 * keyboardWidth;
	double keyboardInsideHeight = 0.9 * keyboardHeight;
	double keyboardInsideX = keyboardX + 0.5*keyboardWidth - 0.5*keyboardInsideWidth;
	double keyboardInsideY = keyboardY + 0.5*keyboardHeight - 0.5*keyboardInsideHeight;
	
	Rectangle2D.Double keyboardInside = new Rectangle2D.Double(keyboardInsideX, keyboardInsideY, keyboardInsideWidth, keyboardInsideHeight);
	
	GeneralPath wholeComputer = this.get();
	
	double increment = keyboardInsideWidth/14;

	// Create the keyboard grid
	
	for(double i = keyboardInsideX + increment; i < keyboardInsideX + keyboardInsideWidth; i += increment){
	    Line2D.Double a = new Line2D.Double(i, keyboardInsideY, i, keyboardInsideY + keyboardInsideHeight);
	    wholeComputer.append(a, false);
	}

	increment = keyboardInsideHeight/5;
	for(double i = keyboardInsideY + increment; i < keyboardInsideY + keyboardInsideHeight; i += increment){
	    Line2D.Double a = new Line2D.Double(keyboardInsideX, i, keyboardInsideX + keyboardInsideWidth, i);
	    wholeComputer.append(a, false);
	}

	wholeComputer.append(keyboard, false);
	wholeComputer.append(keyboardInside, false);
    }
}
