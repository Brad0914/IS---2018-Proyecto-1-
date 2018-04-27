package invaders;

import listas.Enemigo;
import listas.Lista;
import listas.ListaD;
import listas.ListaDC;
import listas.Nodo;
import listas.NodoD;
import listas.NodoDC;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Escenario extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	

	private Timer timer;
	private Nave nave;
	private Proyectile misiles;
	private Lista enemies;
	private ListaD enemiesD;
	private ListaDC enemiesDC;
	

	private int distanciaBoss = 135;
	private int contador;
	private int random = (int) ((Math.random() * 6) + 1); 

	private Nodo E0;
	private Nodo E1;
	private Nodo E2;
	private Nodo E3;
	private Nodo E4;
	private Nodo E5;
	private Nodo E6;
	private Nodo E7;
	private NodoD E0D;
	private NodoD E1D;
	private NodoD E2D;
	private NodoD E3D;
	private NodoD E4D;
	private NodoD E5D;
	private NodoD E6D;
	private NodoD E7D;
	private NodoDC E0DC;
	private NodoDC E1DC;
	private NodoDC E2DC;
	private NodoDC E3DC;
	private NodoDC E4DC;
	private NodoDC E5DC;
	private NodoDC E6DC;
	private NodoDC E7DC;

	private String escenario = "C:\\Users\\Ba\\Desktop\\Sprites\\Background.png";
	private String win = "C:\\Users\\Ba\\Desktop\\Sprites\\YouWin.png";
	private String lose = "C:\\Users\\Ba\\Desktop\\Sprites\\YouLose.png";
	
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

		this.E0 = this.enemies.getPrimero();
		this.E1 = this.E0.getSiguiente();
		this.E2 = this.E1.getSiguiente();
		this.E3 = this.E2.getSiguiente();
		this.E4 = this.E3.getSiguiente();
		this.E5 = this.E4.getSiguiente();
		this.E6 = this.E5.getSiguiente();
		this.E7 = this.E6.getSiguiente();

		this.timer = new Timer(5, this);
		this.timer.start();
	}

	public Escenario(Nave n, KeyListener K, Proyectile proyectiles, ListaD enemies) {

		addKeyListener(K);
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		
		
		this.contador = 0;
		
		this.image_icon = new ImageIcon(escenario);

		this.enemiesD = enemies;
		this.nave = n;
		this.misiles = proyectiles;

		this.E0D = this.enemiesD.getPrimero();
		this.E1D = this.E0D.getSiguiente();
		this.E2D = this.E1D.getSiguiente();
		this.E3D = this.E2D.getSiguiente();
		this.E4D = this.E3D.getSiguiente();
		this.E5D = this.E4D.getSiguiente();
		this.E6D = this.E5D.getSiguiente();
		this.E7D = this.E6D.getSiguiente();

		this.timer = new Timer(5, this);
		this.timer.start();
	}

	public Escenario(Nave n, KeyListener K, Proyectile proyectiles, ListaDC enemies) {

		addKeyListener(K);
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		
		
		this.image_icon = new ImageIcon(escenario);

		this.enemiesDC = enemies;
		this.nave = n;
		this.misiles = proyectiles;

		this.E0DC = this.enemiesDC.getPrimero();
		this.E1DC = this.E0DC.getSiguiente();
		this.E2DC = this.E1DC.getSiguiente();
		this.E3DC = this.E2DC.getSiguiente();
		this.E4DC = this.E3DC.getSiguiente();
		this.E5DC = this.E4DC.getSiguiente();
		this.E6DC = this.E5DC.getSiguiente();
		this.E7DC = this.E6DC.getSiguiente();

		this.timer = new Timer(5, this);
		this.timer.start();
	}

	public void paint(Graphics g) { 
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image_icon.getImage(), 0, 0, this);
		g2d.drawImage(nave.getImageN(), nave.getDx1(), nave.getDy1(), nave.getDx2(), nave.getDy2(), nave.getSx1(),
				nave.getSy1(), nave.getSx2(), nave.getSy2(), this);
		// Inicia Basic y Clase A
		if (this.E4D == null && this.E4DC == null) {

			// Basic
			if (this.E4.getValor().isBoss() == false) {

				this.E1.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 1);
				this.E2.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 2);
				this.E3.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 3);
				this.E4.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 4);
				this.E5.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 5);
				this.E6.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 6);
				this.E7.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 7);

				this.E1.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 1);
				this.E2.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 2);
				this.E3.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 3);
				this.E4.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 4);
				this.E5.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 5);
				this.E6.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 6);
				this.E7.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 7);

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
				if (this.E1.getValor().getVida() <= 0 && this.E2.getValor().getVida() <= 0 && this.E3.getValor().getVida() <= 0 && this.E4.getValor().getVida() <= 0 &&
						this.E5.getValor().getVida() <= 0 && this.E6.getValor().getVida() <= 0 && this.E7.getValor().getVida() <= 0) {
					this.image_icon = new ImageIcon(win);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				}else if (this.E1.getValor().getDy2() >= this.nave.getDy1() || this.E2.getValor().getDy2() >= this.nave.getDy1() ||this.E3.getValor().getDy2() >= this.nave.getDy1() ||
						this.E4.getValor().getDy2() >= this.nave.getDy1() || this.E5.getValor().getDy2() >= this.nave.getDy1() ||
						this.E6.getValor().getDy2() >= this.nave.getDy1() || this.E7.getValor().getDy2() >= this.nave.getDy1() ) {
					this.image_icon = new ImageIcon(lose);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				}
				

			} // Termina Basic

			// Clase A
			else if (this.E4.getValor().isBoss() == true) {

				this.E1.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 1);
				this.E2.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 2);
				this.E3.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 3);
				this.E4.getValor().setDx1(this.E0.getValor().getDx1() - 37 - this.distanciaBoss * 4);
				this.E5.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 5);
				this.E6.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 6);
				this.E7.getValor().setDx1(this.E0.getValor().getDx1() - this.distanciaBoss * 7);

				this.E1.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 1);
				this.E2.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 2);
				this.E3.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 3);
				this.E4.getValor().setDx2(this.E0.getValor().getDx2() + 38 - this.distanciaBoss * 4);
				this.E5.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 5);
				this.E6.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 6);
				this.E7.getValor().setDx2(this.E0.getValor().getDx2() - this.distanciaBoss * 7);

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
				if (this.E1.getValor().getVida() <= 0 && this.E2.getValor().getVida() <= 0 && this.E3.getValor().getVida() <= 0 && this.E4.getValor().getVida() <= 0 &&
						this.E5.getValor().getVida() <= 0 && this.E6.getValor().getVida() <= 0 && this.E7.getValor().getVida() <= 0) {
					this.image_icon = new ImageIcon(win);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				}else if (this.E1.getValor().getDy2() >= this.nave.getDy1() || this.E2.getValor().getDy2() >= this.nave.getDy1() ||this.E3.getValor().getDy2() >= this.nave.getDy1() ||
						this.E4.getValor().getDy2() >= this.nave.getDy1() || this.E5.getValor().getDy2() >= this.nave.getDy1() ||
						this.E6.getValor().getDy2() >= this.nave.getDy1() || this.E7.getValor().getDy2() >= this.nave.getDy1() ) {
					this.image_icon = new ImageIcon(lose);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				}
			}
			// Termina Clase A

			// Inicia Clase B
		} else if (this.E4 == null && this.E4DC == null) {

			// Clase B
			if (this.E4D.getValor().isBoss() == true) {

				if (this.contador >= 0 && this.contador < 200) {
					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 4);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 4);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 200 && this.contador < 400) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 3);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 3);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 400 && this.contador < 600) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 2);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 2);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 600 && this.contador < 800) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 1);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 1);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 800 && this.contador < 1000) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 5);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 5);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 1000 && this.contador < 1200) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 6);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 6);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				} else if (this.contador >= 1200 && this.contador < 1400) {

					this.E1D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx1(this.E0D.getValor().getDx1() - 37 - this.distanciaBoss * 7);
					this.E5D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx1(this.E0D.getValor().getDx1() - this.distanciaBoss * 4);

					this.E1D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4D.getValor().setDx2(this.E0D.getValor().getDx2() + 38 - this.distanciaBoss * 7);
					this.E5D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7D.getValor().setDx2(this.E0D.getValor().getDx2() - this.distanciaBoss * 4);

					g2d.drawImage(E1D.getValor().getImage(), E1D.getValor().getDx1(), E1D.getValor().getDy1(),
							E1D.getValor().getDx2(), E1D.getValor().getDy2(), E1D.getValor().getSx1(),
							E1D.getValor().getSy1(), E1D.getValor().getSx2(), E1D.getValor().getSy2(), this);
					g2d.drawImage(E2D.getValor().getImage(), E2D.getValor().getDx1(), E2D.getValor().getDy1(),
							E2D.getValor().getDx2(), E2D.getValor().getDy2(), E2D.getValor().getSx1(),
							E2D.getValor().getSy1(), E2D.getValor().getSx2(), E2D.getValor().getSy2(), this);
					g2d.drawImage(E3D.getValor().getImage(), E3D.getValor().getDx1(), E3D.getValor().getDy1(),
							E3D.getValor().getDx2(), E3D.getValor().getDy2(), E3D.getValor().getSx1(),
							E3D.getValor().getSy1(), E3D.getValor().getSx2(), E3D.getValor().getSy2(), this);
					g2d.drawImage(E4D.getValor().getImage(), E4D.getValor().getDx1(), E4D.getValor().getDy1(),
							E4D.getValor().getDx2(), E4D.getValor().getDy2(), E4D.getValor().getSx1(),
							E4D.getValor().getSy1(), E4D.getValor().getSx2(), E4D.getValor().getSy2(), this);
					g2d.drawImage(E5D.getValor().getImage(), E5D.getValor().getDx1(), E5D.getValor().getDy1(),
							E5D.getValor().getDx2(), E5D.getValor().getDy2(), E5D.getValor().getSx1(),
							E5D.getValor().getSy1(), E5D.getValor().getSx2(), E5D.getValor().getSy2(), this);
					g2d.drawImage(E6D.getValor().getImage(), E6D.getValor().getDx1(), E6D.getValor().getDy1(),
							E6D.getValor().getDx2(), E6D.getValor().getDy2(), E6D.getValor().getSx1(),
							E6D.getValor().getSy1(), E6D.getValor().getSx2(), E6D.getValor().getSy2(), this);
					g2d.drawImage(E7D.getValor().getImage(), E7D.getValor().getDx1(), E7D.getValor().getDy1(),
							E7D.getValor().getDx2(), E7D.getValor().getDy2(), E7D.getValor().getSx1(),
							E7D.getValor().getSy1(), E7D.getValor().getSx2(), E7D.getValor().getSy2(), this);
					this.contador += 1;

				}else if (this.E1D.getValor().getVida() <= 0 && this.E2D.getValor().getVida() <= 0 && this.E3D.getValor().getVida() <= 0 && this.E4D.getValor().getVida() <= 0 &&
						this.E5D.getValor().getVida() <= 0 && this.E6D.getValor().getVida() <= 0 && this.E7D.getValor().getVida() <= 0) {
					this.image_icon = new ImageIcon(win);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				
				}else if (this.E1D.getValor().getDy2() >= this.nave.getDy1() || this.E2D.getValor().getDy2() >= this.nave.getDy1() ||this.E3D.getValor().getDy2() >= this.nave.getDy1() ||
						this.E4D.getValor().getDy2() >= this.nave.getDy1() || this.E5D.getValor().getDy2() >= this.nave.getDy1() ||
						this.E6D.getValor().getDy2() >= this.nave.getDy1() || this.E7D.getValor().getDy2() >= this.nave.getDy1() ) {
					this.image_icon = new ImageIcon(lose);
					g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
				
				} else {

					this.contador = 0;
				}
				// Termina Clase B
			}

			// Inicia Clase C y Clase E
		} else if (this.E4 == null && this.E4D == null) {

			ImageIcon image_icon = new ImageIcon("C:\\Users\\Ba\\Desktop\\Sprites\\AdultMetroid.gif");
			Image image = image_icon.getImage();
			if (this.E4DC.getValor().isBossChange() == false) {
				// Clase C
				if (random == 0) {

					g2d.drawImage(E1DC.getValor().getImage(), E1DC.getValor().getDx1(), E1DC.getValor().getDy1(),
							E1DC.getValor().getDx2(), E1DC.getValor().getDy2(), E1DC.getValor().getSx1(),
							E1DC.getValor().getSy1(), E1DC.getValor().getSx2(), E1DC.getValor().getSy2(), this);
					g2d.drawImage(E2DC.getValor().getImage(), E2DC.getValor().getDx1(), E2DC.getValor().getDy1(),
							E2DC.getValor().getDx2(), E2DC.getValor().getDy2(), E2DC.getValor().getSx1(),
							E2DC.getValor().getSy1(), E2DC.getValor().getSx2(), E2DC.getValor().getSy2(), this);
					g2d.drawImage(E3DC.getValor().getImage(), E3DC.getValor().getDx1(), E3DC.getValor().getDy1(),
							E3DC.getValor().getDx2(), E3DC.getValor().getDy2(), E3DC.getValor().getSx1(),
							E3DC.getValor().getSy1(), E3DC.getValor().getSx2(), E3DC.getValor().getSy2(), this);
					g2d.drawImage(E4DC.getValor().getImage(), E4DC.getValor().getDx1(), E4DC.getValor().getDy1(),
							E4DC.getValor().getDx2(), E4DC.getValor().getDy2(), E4DC.getValor().getSx1(),
							E4DC.getValor().getSy1(), E4DC.getValor().getSx2(), E4DC.getValor().getSy2(), this);
					g2d.drawImage(E5DC.getValor().getImage(), E5DC.getValor().getDx1(), E5DC.getValor().getDy1(),
							E5DC.getValor().getDx2(), E5DC.getValor().getDy2(), E5DC.getValor().getSx1(),
							E5DC.getValor().getSy1(), E5DC.getValor().getSx2(), E5DC.getValor().getSy2(), this);
					g2d.drawImage(E6DC.getValor().getImage(), E6DC.getValor().getDx1(), E6DC.getValor().getDy1(),
							E6DC.getValor().getDx2(), E6DC.getValor().getDy2(), E6DC.getValor().getSx1(),
							E6DC.getValor().getSy1(), E6DC.getValor().getSx2(), E6DC.getValor().getSy2(), this);
					g2d.drawImage(E7DC.getValor().getImage(), E7DC.getValor().getDx1(), E7DC.getValor().getDy1(),
							E7DC.getValor().getDx2(), E7DC.getValor().getDy2(), E7DC.getValor().getSx1(),
							E7DC.getValor().getSy1(), E7DC.getValor().getSx2(), E7DC.getValor().getSy2(), this);
					if (this.E1DC.getValor().getVida() <= 0 && this.E2DC.getValor().getVida() <= 0 && this.E3DC.getValor().getVida() <= 0 && this.E4DC.getValor().getVida() <= 0 &&
							this.E5DC.getValor().getVida() <= 0 && this.E6DC.getValor().getVida() <= 0 && this.E7DC.getValor().getVida() <= 0) {
						this.image_icon = new ImageIcon(win);
						g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
					}else if (this.E1DC.getValor().getDy2() >= this.nave.getDy1() || this.E2DC.getValor().getDy2() >= this.nave.getDy1() ||this.E3DC.getValor().getDy2() >= this.nave.getDy1() ||
							this.E4DC.getValor().getDy2() >= this.nave.getDy1() || this.E5DC.getValor().getDy2() >= this.nave.getDy1() ||
							this.E6DC.getValor().getDy2() >= this.nave.getDy1() || this.E7DC.getValor().getDy2() >= this.nave.getDy1() ) {
						this.image_icon = new ImageIcon(lose);
						g2d.drawImage(this.image_icon.getImage(), 0, 0, this);
					}

				
				} else if (random != 0 && this.E4DC.getValor().getVida() != 0) {

					this.E1DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 1);
					this.E2DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 2);
					this.E3DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 3);
					this.E4DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 4);
					this.E5DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 5);
					this.E6DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 6);
					this.E7DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 7);

					this.E1DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 1);
					this.E2DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 2);
					this.E3DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 3);
					this.E4DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 4);
					this.E5DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 5);
					this.E6DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 6);
					this.E7DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 7);

					g2d.drawImage(E1DC.getValor().getImage(), E1DC.getValor().getDx1(), E1DC.getValor().getDy1(),
							E1DC.getValor().getDx2(), E1DC.getValor().getDy2(), E1DC.getValor().getSx1(),
							E1DC.getValor().getSy1(), E1DC.getValor().getSx2(), E1DC.getValor().getSy2(), this);
					g2d.drawImage(E2DC.getValor().getImage(), E2DC.getValor().getDx1(), E2DC.getValor().getDy1(),
							E2DC.getValor().getDx2(), E2DC.getValor().getDy2(), E2DC.getValor().getSx1(),
							E2DC.getValor().getSy1(), E2DC.getValor().getSx2(), E2DC.getValor().getSy2(), this);
					g2d.drawImage(E3DC.getValor().getImage(), E3DC.getValor().getDx1(), E3DC.getValor().getDy1(),
							E3DC.getValor().getDx2(), E3DC.getValor().getDy2(), E3DC.getValor().getSx1(),
							E3DC.getValor().getSy1(), E3DC.getValor().getSx2(), E3DC.getValor().getSy2(), this);
					g2d.drawImage(E4DC.getValor().getImage(), E4DC.getValor().getDx1(), E4DC.getValor().getDy1(),
							E4DC.getValor().getDx2(), E4DC.getValor().getDy2(), E4DC.getValor().getSx1(),
							E4DC.getValor().getSy1(), E4DC.getValor().getSx2(), E4DC.getValor().getSy2(), this);
					g2d.drawImage(E5DC.getValor().getImage(), E5DC.getValor().getDx1(), E5DC.getValor().getDy1(),
							E5DC.getValor().getDx2(), E5DC.getValor().getDy2(), E5DC.getValor().getSx1(),
							E5DC.getValor().getSy1(), E5DC.getValor().getSx2(), E5DC.getValor().getSy2(), this);
					g2d.drawImage(E6DC.getValor().getImage(), E6DC.getValor().getDx1(), E6DC.getValor().getDy1(),
							E6DC.getValor().getDx2(), E6DC.getValor().getDy2(), E6DC.getValor().getSx1(),
							E6DC.getValor().getSy1(), E6DC.getValor().getSx2(), E6DC.getValor().getSy2(), this);
					g2d.drawImage(E7DC.getValor().getImage(), E7DC.getValor().getDx1(), E7DC.getValor().getDy1(),
							E7DC.getValor().getDx2(), E7DC.getValor().getDy2(), E7DC.getValor().getSx1(),
							E7DC.getValor().getSy1(), E7DC.getValor().getSx2(), E7DC.getValor().getSy2(), this);
				
				} else if (this.E4DC.getValor().getVida() == 0) {

					if (random == 1) {
						this.E1DC.getValor().setImage(image);
						this.E1DC.getValor().setVida(5);
						this.E1DC.getValor().setSx1(0);
						this.E1DC.getValor().setSx2(125);
						this.E1DC.getValor().setSy1(0);
						this.E1DC.getValor().setSy2(138);
						this.E1DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 1);
						this.E1DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 1);
						this.E1DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E1DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} else if (random == 2) {

						this.E2DC.getValor().setImage(image);
						this.E2DC.getValor().setVida(5);
						this.E2DC.getValor().setSx1(0);
						this.E2DC.getValor().setSx2(125);
						this.E2DC.getValor().setSy1(0);
						this.E2DC.getValor().setSy2(138);
						this.E2DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 2);
						this.E2DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 2);
						this.E2DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E2DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} else if (random == 3) {

						this.E3DC.getValor().setImage(image);
						this.E3DC.getValor().setVida(5);
						this.E3DC.getValor().setSx1(0);
						this.E3DC.getValor().setSx2(125);
						this.E3DC.getValor().setSy1(0);
						this.E3DC.getValor().setSy2(138);
						this.E3DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 3);
						this.E3DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 3);
						this.E3DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E3DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} else if (random == 4) {

						this.E5DC.getValor().setImage(image);
						this.E5DC.getValor().setVida(5);
						this.E5DC.getValor().setSx1(0);
						this.E5DC.getValor().setSx2(125);
						this.E5DC.getValor().setSy1(0);
						this.E5DC.getValor().setSy2(138);
						this.E5DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 5);
						this.E5DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 5);
						this.E5DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E5DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} else if (random == 5) {

						this.E6DC.getValor().setImage(image);
						this.E6DC.getValor().setVida(5);
						this.E6DC.getValor().setSx1(0);
						this.E6DC.getValor().setSx2(125);
						this.E6DC.getValor().setSy1(0);
						this.E6DC.getValor().setSy2(138);
						this.E6DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 6);
						this.E6DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 6);
						this.E6DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E6DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} else {

						this.E7DC.getValor().setImage(image);
						this.E7DC.getValor().setVida(5);
						this.E7DC.getValor().setSx1(0);
						this.E7DC.getValor().setSx2(125);
						this.E7DC.getValor().setSy1(0);
						this.E7DC.getValor().setSy2(138);
						this.E7DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 7);
						this.E7DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 7);
						this.E7DC.getValor().setDy1(this.E0DC.getValor().getDy1() - 88);
						this.E7DC.getValor().setDy2(this.E0DC.getValor().getDy2());
						this.random = 0;
						this.E4DC.getValor().setVida(-1);

					} // Termina Clase C

					
				}
			// Clase E
			}else {
				
				this.E1DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 1);
				this.E2DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 2);
				this.E3DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 3);
				this.E4DC.getValor().setDx1(this.E0DC.getValor().getDx1() - 37 - this.distanciaBoss * 4);
				this.E5DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 5);
				this.E6DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 6);
				this.E7DC.getValor().setDx1(this.E0DC.getValor().getDx1() - this.distanciaBoss * 7);

				this.E1DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 1);
				this.E2DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 2);
				this.E3DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 3);
				this.E4DC.getValor().setDx2(this.E0DC.getValor().getDx2() + 38 - this.distanciaBoss * 4);
				this.E5DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 5);
				this.E6DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 6);
				this.E7DC.getValor().setDx2(this.E0DC.getValor().getDx2() - this.distanciaBoss * 7);

				g2d.drawImage(E1DC.getValor().getImage(), E1DC.getValor().getDx1(), E1DC.getValor().getDy1(),
						E1DC.getValor().getDx2(), E1DC.getValor().getDy2(), E1DC.getValor().getSx1(),
						E1DC.getValor().getSy1(), E1DC.getValor().getSx2(), E1DC.getValor().getSy2(), this);
				g2d.drawImage(E2DC.getValor().getImage(), E2DC.getValor().getDx1(), E2DC.getValor().getDy1(),
						E2DC.getValor().getDx2(), E2DC.getValor().getDy2(), E2DC.getValor().getSx1(),
						E2DC.getValor().getSy1(), E2DC.getValor().getSx2(), E2DC.getValor().getSy2(), this);
				g2d.drawImage(E3DC.getValor().getImage(), E3DC.getValor().getDx1(), E3DC.getValor().getDy1(),
						E3DC.getValor().getDx2(), E3DC.getValor().getDy2(), E3DC.getValor().getSx1(),
						E3DC.getValor().getSy1(), E3DC.getValor().getSx2(), E3DC.getValor().getSy2(), this);
				g2d.drawImage(E4DC.getValor().getImage(), E4DC.getValor().getDx1(), E4DC.getValor().getDy1(),
						E4DC.getValor().getDx2(), E4DC.getValor().getDy2(), E4DC.getValor().getSx1(),
						E4DC.getValor().getSy1(), E4DC.getValor().getSx2(), E4DC.getValor().getSy2(), this);
				g2d.drawImage(E5DC.getValor().getImage(), E5DC.getValor().getDx1(), E5DC.getValor().getDy1(),
						E5DC.getValor().getDx2(), E5DC.getValor().getDy2(), E5DC.getValor().getSx1(),
						E5DC.getValor().getSy1(), E5DC.getValor().getSx2(), E5DC.getValor().getSy2(), this);
				g2d.drawImage(E6DC.getValor().getImage(), E6DC.getValor().getDx1(), E6DC.getValor().getDy1(),
						E6DC.getValor().getDx2(), E6DC.getValor().getDy2(), E6DC.getValor().getSx1(),
						E6DC.getValor().getSy1(), E6DC.getValor().getSx2(), E6DC.getValor().getSy2(), this);
				g2d.drawImage(E7DC.getValor().getImage(), E7DC.getValor().getDx1(), E7DC.getValor().getDy1(),
						E7DC.getValor().getDx2(), E7DC.getValor().getDy2(), E7DC.getValor().getSx1(),
						E7DC.getValor().getSy1(), E7DC.getValor().getSx2(), E7DC.getValor().getSy2(), this);
			}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		this.nave.move();
		if (this.E4D == null && this.E4DC == null) {

			this.E0.getValor().moveBoss(1);
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

		} else if (this.E4 == null && this.E4DC == null) {
			this.E0D.getValor().moveBoss(1);
			this.E1D.getValor().moveBoss(1);
			this.E2D.getValor().moveBoss(1);
			this.E3D.getValor().moveBoss(1);
			this.E4D.getValor().moveBoss(1);
			this.E5D.getValor().moveBoss(1);
			this.E6D.getValor().moveBoss(1);
			this.E7D.getValor().moveBoss(1);

			this.E1D.getValor().colision();
			this.E2D.getValor().colision();
			this.E3D.getValor().colision();
			this.E4D.getValor().colision();
			this.E5D.getValor().colision();
			this.E6D.getValor().colision();
			this.E7D.getValor().colision();

		} else if (this.E4 == null && this.E4D == null) {
			this.E0DC.getValor().moveBoss(1);
			this.E1DC.getValor().moveBoss(1);
			this.E2DC.getValor().moveBoss(1);
			this.E3DC.getValor().moveBoss(1);
			this.E4DC.getValor().moveBoss(1);
			this.E5DC.getValor().moveBoss(1);
			this.E6DC.getValor().moveBoss(1);
			this.E7DC.getValor().moveBoss(1);

			this.E1DC.getValor().colision();
			this.E2DC.getValor().colision();
			this.E3DC.getValor().colision();
			this.E4DC.getValor().colision();
			this.E5DC.getValor().colision();
			this.E6DC.getValor().colision();
			this.E7DC.getValor().colision();

	}
		this.misiles.move();

		repaint();
	}



}

