import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
   This program generates a spiral.
 */
public class SpiralGenerator {
	/**
      This method draws the spiral on the frame.
      @param g the Graphics context
	 */
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// Use 200 for the width and height of the frame
		// Use 10 for the increment between tracks
		for(int i = 1; i <= 10; i++) {
			Line2D.Double topLine = new Line2D.Double(10*i,10*i,210-10*i,10*i);
			g2.draw(topLine);
			Line2D.Double leftLine = new Line2D.Double(10*i,10*i,10*i,210-10*i);
			g2.draw(leftLine);
			Line2D.Double rightLine = new Line2D.Double(210-10*i,10*i,210-10*i,200-10*i);
			g2.draw(rightLine);
			Line2D.Double bottomLine = new Line2D.Double(10*i,210-10*i,220-10*i,210-10*i);
			g2.draw(bottomLine);
		}
		Line2D.Double rightLine1 = new Line2D.Double(210,10,210,200);
		g2.draw(rightLine1);
	}
}
