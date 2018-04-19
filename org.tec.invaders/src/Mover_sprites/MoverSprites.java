package Mover_sprites;

import javax.swing.JFrame;

public class MoverSprites extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JFrame window;

	public MoverSprites() {
		window = new JFrame("Invaders");
		window.add(new Escenario());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1095, 730);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
	}
}

