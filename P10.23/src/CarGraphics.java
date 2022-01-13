import java.awt.*;
import java.awt.geom.*;

/**
 * @(#)CarGraphics.java
 *
 * CarGraphics application
 *
 * @author 
 * @version 1.00 2018/10/8
 */

/**
   A car shape that can be positioned anywhere on the screen.
 */
public class CarGraphics
{
	private int xLeft;
	private int yTop;
	private int width;
	private int height;

	/**
      Constructs a car with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
	 */
	public CarGraphics(int x, int y, int w, int h)
	{
		xLeft = x;
		yTop = y;
		width = w;
		height = h;
	}

	/**
      Draws the car.
      @param g2 the graphics context
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xLeft, yTop + 10, width, height);      
		Ellipse2D.Double frontTire
		= new Ellipse2D.Double(xLeft + 10, yTop + 20, 10 * (width/50), 10 * (height/10));
		Ellipse2D.Double rearTire
		= new Ellipse2D.Double(xLeft + 40*(width/60), yTop + 20, 10 * (width/50), 10 * (height/10));

		// The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(xLeft + 10*(width/60), yTop + 10);
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double(xLeft + 20*(width/60), yTop);
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double(xLeft + 40*(width/60), yTop);
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(xLeft + 50*(width/60), yTop + 10);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}
}