package invaders;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JFrame window;

	public Window(JPanel scene) {
		window = new JFrame("Invaders");
		window.add(scene); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1095, 730);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
	}
}

