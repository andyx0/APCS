import javax.swing.JFrame;

/** 	 	 	 	 	 	
   This frame contains a moving rectangle.
 */
public class CarViewer extends JFrame
{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;

	public static void main(String[] args)
	{
		CarComponent c = new CarComponent(1,0);
		JFrame frame = new JFrame();

		frame.add(c);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Animated Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}