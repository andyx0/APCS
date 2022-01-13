import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class idkComponent extends JComponent
{  
	public void paintComponent(Graphics g)
	{  
		Graphics2D g2 = (Graphics2D) g;

		Rectangle rectangle1 = new Rectangle(100,100,120,120);
		g2.draw(rectangle1);
		Rectangle rectangle2 = new Rectangle(175,120,30,30);
		g2.draw(rectangle2);
		Rectangle rectangle3 = new Rectangle(115,120,30,30);
		g2.draw(rectangle3);
		Rectangle rectangle4 = new Rectangle(145,170,30,50);
		g2.draw(rectangle4);
		Line2D.Double line1 = new Line2D.Double(100,100,160,60);
		g2.draw(line1);
		Line2D.Double line2 = new Line2D.Double(160,60,220,100);
		g2.draw(line2);
	}
}