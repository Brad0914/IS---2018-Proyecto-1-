package Mover_sprites.copy;

import listas.Enemigo;
import listas.Lista;
import listas.Nodo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Escenario extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Timer timer;
	private Nave nave;
	private Proyectile misiles;
	private Lista enemies;
	private int distanciaNoBoss = 60;
	private int distanciaBoss = 135;
	private Nodo E1;
	private Nodo E2;
	private Nodo E3;
	private Nodo E4;
	private Nodo E5;
	private Nodo E6;
	private Nodo E7;
	private String escenario = "C:\\Users\\Ba\\Desktop\\Sprites\\Background.png";
	public ImageIcon image_icon;

	public Escenario(Nave n, KeyListener K, Proyectile proyectiles, Lista enemies) {

		addKeyListener(K);
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		this.image_icon = new ImageIcon(escenario);

		this.enemies = enemies;
		this.nave = n;
		this.misiles = proyectiles;
		
		this.E1 = this.enemies.getPrimero();
		this.E2 = this.E1.getSiguiente();
		this.E3 = this.E2.getSiguiente();
		this.E4 = this.E3.getSiguiente();
		this.E5 = this.E4.getSiguiente();
		this.E6 = this.E5.getSiguiente();
		this.E7 = this.E6.getSiguiente();	
	

		this.timer = new Timer(5, this);
		this.timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);

		
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image_icon.getImage(), 0, 0, this);
		g2d.drawImage(nave.getImageN(), nave.getDx1(), nave.getDy1(), nave.getDx2(), nave.getDy2(), nave.getSx1(),
				nave.getSy1(), nave.getSx2(), nave.getSy2(), this);
		
		if (this.E4.getValor().isBoss() == false) {

			this.E2.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 1);
			this.E3.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 2);
			this.E4.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 3);
			this.E5.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 4);
			this.E6.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 5);
			this.E7.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 6);

			this.E2.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 1);
			this.E3.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 2);
			this.E4.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 3);
			this.E5.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 4);
			this.E6.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 5);
			this.E7.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 6);

			g2d.drawImage(E1.getValor().getImage(), E1.getValor().getDx1(), E1.getValor().getDy1(),
					E1.getValor().getDx2(), E1.getValor().getDy2(), E1.getValor().getSx1(), E1.getValor().getSy1(),
					E1.getValor().getSx2(), E1.getValor().getSy2(), this);
			g2d.drawImage(E2.getValor().getImage(), E2.getValor().getDx1(), E2.getValor().getDy1(),
					E2.getValor().getDx2(), E2.getValor().getDy2(), E2.getValor().getSx1(), E2.getValor().getSy1(),
					E2.getValor().getSx2(), E2.getValor().getSy2(), this);
			g2d.drawImage(E3.getValor().getImage(), E3.getValor().getDx1(), E3.getValor().getDy1(),
					E3.getValor().getDx2(), E3.getValor().getDy2(), E3.getValor().getSx1(), E3.getValor().getSy1(),
					E3.getValor().getSx2(), E3.getValor().getSy2(), this);
			g2d.drawImage(E4.getValor().getImage(), E4.getValor().getDx1(), E4.getValor().getDy1(),
					E4.getValor().getDx2(), E4.getValor().getDy2(), E4.getValor().getSx1(), E4.getValor().getSy1(),
					E4.getValor().getSx2(), E4.getValor().getSy2(), this);
			g2d.drawImage(E5.getValor().getImage(), E5.getValor().getDx1(), E5.getValor().getDy1(),
					E5.getValor().getDx2(), E5.getValor().getDy2(), E5.getValor().getSx1(), E5.getValor().getSy1(),
					E5.getValor().getSx2(), E5.getValor().getSy2(), this);
			g2d.drawImage(E6.getValor().getImage(), E6.getValor().getDx1(), E6.getValor().getDy1(),
					E6.getValor().getDx2(), E6.getValor().getDy2(), E6.getValor().getSx1(), E6.getValor().getSy1(),
					E6.getValor().getSx2(), E6.getValor().getSy2(), this);
			g2d.drawImage(E7.getValor().getImage(), E7.getValor().getDx1(), E7.getValor().getDy1(),
					E7.getValor().getDx2(), E7.getValor().getDy2(), E7.getValor().getSx1(), E7.getValor().getSy1(),
					E7.getValor().getSx2(), E7.getValor().getSy2(), this);
		}else
		if (this.E4.getValor().isBoss() == true) {

			this.E2.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 1);
			this.E3.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 2);
			this.E4.getValor().setDx1(this.E1.getValor().getDx1() - 37 - this.distanciaBoss * 3);
			this.E5.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 4);
			this.E6.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 5);
			this.E7.getValor().setDx1(this.E1.getValor().getDx1() - this.distanciaBoss * 6);

			this.E2.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 1);
			this.E3.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 2);
			this.E4.getValor().setDx2(this.E1.getValor().getDx2() +  38 -this.distanciaBoss * 3);
			this.E5.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 4);
			this.E6.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 5);
			this.E7.getValor().setDx2(this.E1.getValor().getDx2() - this.distanciaBoss * 6);

			g2d.drawImage(E1.getValor().getImage(), E1.getValor().getDx1(), E1.getValor().getDy1(),
					E1.getValor().getDx2(), E1.getValor().getDy2(), E1.getValor().getSx1(), E1.getValor().getSy1(),
					E1.getValor().getSx2(), E1.getValor().getSy2(), this);
			g2d.drawImage(E2.getValor().getImage(), E2.getValor().getDx1(), E2.getValor().getDy1(),
					E2.getValor().getDx2(), E2.getValor().getDy2(), E2.getValor().getSx1(), E2.getValor().getSy1(),
					E2.getValor().getSx2(), E2.getValor().getSy2(), this);
			g2d.drawImage(E3.getValor().getImage(), E3.getValor().getDx1(), E3.getValor().getDy1(),
					E3.getValor().getDx2(), E3.getValor().getDy2(), E3.getValor().getSx1(), E3.getValor().getSy1(),
					E3.getValor().getSx2(), E3.getValor().getSy2(), this);
			g2d.drawImage(E4.getValor().getImage(), E4.getValor().getDx1(), E4.getValor().getDy1(),
					E4.getValor().getDx2(), E4.getValor().getDy2(), E4.getValor().getSx1(), E4.getValor().getSy1(),
					E4.getValor().getSx2(), E4.getValor().getSy2(), this);
			g2d.drawImage(E5.getValor().getImage(), E5.getValor().getDx1(), E5.getValor().getDy1(),
					E5.getValor().getDx2(), E5.getValor().getDy2(), E5.getValor().getSx1(), E5.getValor().getSy1(),
					E5.getValor().getSx2(), E5.getValor().getSy2(), this);
			g2d.drawImage(E6.getValor().getImage(), E6.getValor().getDx1(), E6.getValor().getDy1(),
					E6.getValor().getDx2(), E6.getValor().getDy2(), E6.getValor().getSx1(), E6.getValor().getSy1(),
					E6.getValor().getSx2(), E6.getValor().getSy2(), this);
			g2d.drawImage(E7.getValor().getImage(), E7.getValor().getDx1(), E7.getValor().getDy1(),
					E7.getValor().getDx2(), E7.getValor().getDy2(), E7.getValor().getSx1(), E7.getValor().getSy1(),
					E7.getValor().getSx2(), E7.getValor().getSy2(), this);
		}


		if (misiles.isShot() == true) {
			g2d.drawImage(misiles.getImage(), misiles.getDx1(), misiles.getDy1(), misiles.getDx2(), misiles.getDy2(),
					misiles.getSx1(), misiles.getSy1(), misiles.getSx2(), misiles.getSy2(), this);
			misiles.setDx1Inicial(nave.getDx1() + 36);
			misiles.setDx2Inicial(nave.getDx2() - 34);

		}
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		this.nave.move();
		

		this.E1.getValor().moveBoss(1);
		this.E2.getValor().moveBoss(1);
		this.E3.getValor().moveBoss(1);
		this.E4.getValor().moveBoss(1);
		this.E5.getValor().moveBoss(1);
		this.E6.getValor().moveBoss(1);
		this.E7.getValor().moveBoss(1);

		
		this.E1.getValor().colision();
		this.E2.getValor().colision();
		this.E3.getValor().colision();
		this.E4.getValor().colision();
		this.E5.getValor().colision();
		this.E6.getValor().colision();
		this.E7.getValor().colision();
		

		
		this.misiles.move();

		repaint();
	}

}

