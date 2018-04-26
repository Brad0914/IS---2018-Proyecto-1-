package Mover_sprites.copy;

import javax.swing.JFrame;

public class MoverSprites extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JFrame window;

	public MoverSprites(Escenario scene) {
		window = new JFrame("Invaders");
		window.add(scene);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1095, 730);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
	}
}

