import javax.swing.JFrame;

public class idkViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		frame.setSize(300, 400);
		frame.setTitle("Two Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		idkComponent component = new idkComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}
