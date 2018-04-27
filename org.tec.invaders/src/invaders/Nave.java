package invaders;


import java.awt.Image;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Nave {
	private String nave = "C:\\Users\\Ba\\Desktop\\Sprites\\nave.png";

	private int dx1;
	private int dy1;
	private int dx2;
	private int dy2;
	private int sx1;
	private int sy1;
	private int sx2;
	private int sy2;
	private int movement;

	private Image imageN;


	public Nave() {
		ImageIcon image1 = new ImageIcon(nave);
		imageN = image1.getImage();
	
		this.dx1 = 507;
		this.dx2 = 588;
		this.dy1 = 610;
		this.dy2 = 700;
		this.sx1 = 0;
		this.sx2 = 81;
		this.sy1 = 0;
		this.sy2 = 90;

	}
 
	public void move() {

		if (this.movement > 0 && this.dx2 < 1090) {
			this.dx1 += this.movement;
			this.dx2 += this.movement;
		} else if (this.movement < 0 && this.dx1 > 0) {
			this.dx1 += this.movement;
			this.dx2 += this.movement;
		}

	}

	public int getDx1() {
		return dx1;
	}

	public void setDx1(int dx1) {
		this.dx1 = dx1;
	}

	public int getDy1() {
		return dy1;
	}

	public void setDy1(int dy1) {
		this.dy1 = dy1;
	}

	public int getDx2() {
		return dx2;
	}

	public void setDx2(int dx2) {
		this.dx2 = dx2;
	}

	public int getDy2() {
		return dy2;
	}

	public void setDy2(int dy2) {
		this.dy2 = dy2;
	}

	public int getSx1() {
		return sx1;
	}

	public void setSx1(int sx1) {
		this.sx1 = sx1;
	}

	public int getSy1() {
		return sy1;
	}

	public void setSy1(int sy1) {
		this.sy1 = sy1;
	}

	public int getSx2() {
		return sx2;
	}

	public void setSx2(int sx2) {
		this.sx2 = sx2;
	}

	public int getSy2() {
		return sy2;
	}

	public void setSy2(int sy2) {
		this.sy2 = sy2;
	}

	public Image getImageN() {
		return imageN;
	}



	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			this.movement = 2;

		}
		if (key == KeyEvent.VK_LEFT) {
			this.movement = -2;

		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_RIGHT) {
			this.movement = 0;

		}
		if (key == KeyEvent.VK_LEFT) {
			this.movement = 0;

		}

	}

	
}