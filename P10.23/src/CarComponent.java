import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Timer;

public class CarComponent extends JComponent implements ActionListener
{  
	private int x;
	private int y;
	private int dx;
	private int dy;
	private final int DELAY = 10; // Milliseconds between timer ticks
	private Timer t = new Timer(DELAY, this);

	public CarComponent(int dx, int dy)
	{
		x = 0;
		y = 100;
		this.dx = dx;
		this.dy = dy;
	}

	public void paintComponent(Graphics g)
	{  
		Graphics2D g2 = (Graphics2D) g;

		CarGraphics car1 = new CarGraphics(x, getHeight()/2 - y, 60, 10);

		CarGraphics car2 = new CarGraphics(getWidth()-getWidth()/5 - x, getHeight()/2, 60, 10);

		g2.setColor(Color.green);
		car1.draw(g2);

		g2.setColor(Color.blue);
		car2.draw(g2);

		t.start();
	}

	public void actionPerformed(ActionEvent event)
	{
		x += dx;
		y += dy;
		repaint();
	}
}