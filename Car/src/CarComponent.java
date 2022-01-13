import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent extends JComponent
{  
	public void paintComponent(Graphics g)
	{  
		Graphics2D g2 = (Graphics2D) g;

		CarGraphics car1 = new CarGraphics(0, 0, 60, 10);

		int x = getWidth() - 60;
		int y = getHeight() - 30;

		CarGraphics car2 = new CarGraphics(x, y, 60, 10);

		CarGraphics car3 = new CarGraphics(x/2, y/2, 120, 20);

		car1.draw(g2);

		g2.setColor(Color.blue);
		car2.draw(g2);

		g2.setColor(Color.green);
		car3.draw(g2);
	}
}