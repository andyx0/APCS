import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		JLabel label = new JLabel("Hello, Andy!");
		label.setOpaque(true);
		Color lightGreen = new Color(152,251,152);
		label.setBackground(lightGreen);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}