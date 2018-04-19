package Mover_sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Escenario extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Timer timer;
	private Nave nave;
	private enemigoPrueba enemy;
	private String escenario = "C:\\Users\\Ba\\Desktop\\Sprites\\Background.png";
	public ImageIcon image_icon;

	public Escenario() {

		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		this.image_icon = new ImageIcon(escenario);

		this.enemy = new enemigoPrueba();
		this.nave = new Nave();
		this.timer = new Timer(5, this);
		this.timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image_icon.getImage(), 0, 0, this);
		g2d.drawImage(nave.getImage(), nave.getDx1(), nave.getDy1(), nave.getDx2(), nave.getDy2(), nave.getSx1(),
				nave.getSy1(), nave.getSx2(), nave.getSy2(), this);
		g2d.drawImage(enemy.getImage(), enemy.getDx1(), enemy.getDy1(), enemy.getDx2(), enemy.getDy2(), enemy.getSx1(), 
				enemy.getSy1(), enemy.getSx2(), enemy.getSy2(), this); 
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		nave.move();
		enemy.move();
		repaint();
	}

	private class TAdapter extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			nave.keyPressed(e);
		}
	}
}

