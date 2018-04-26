package Mover_sprites.copy;

import java.awt.Image;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Proyectile extends Nave {
	private String misil = "C:\\Users\\Ba\\Desktop\\Sprites\\misil.png";
	private int dx1Inicial;
	private int dx2Inicial;
	private int dy1Inicial;
	private int dy2Inicial;
	private int dx1;
	private int dy1;
	private int dx2;
	private int dy2;
	private int sx1;
	private int sy1;
	private int sx2;
	private int sy2;
	private boolean shot;
	private boolean land;
	private int movement;


	private Image image;

	public Proyectile(int x1, int y1, int x2, int y2) {
		ImageIcon image_icon = new ImageIcon(misil);
		image = image_icon.getImage();
		this.dx1Inicial = x1 + 36;
		this.dx2Inicial = x2 - 34;
		this.dy1Inicial = y1;
		this.dy2Inicial = y2 - 60;
		this.dx1 = x1 + 36;
		this.dx2 = x2 - 34;
		this.dy1 = y1;
		this.dy2 = y2 - 60;
		this.sx1 = 0;
		this.sx2 = 10;
		this.sy1 = 0;
		this.sy2 = 38;
		this.shot = false;
		this.land = false;
	}

	public void move() {
		
		
		if ( this.dy2 < 0 || this.land == true) {
			this.dx1 = this.dx1Inicial;
			this.dx2 = this.dx2Inicial;
			this.dy1 = this.dy1Inicial;
			this.dy2 = this.dy2Inicial;
			this.shot = false;
			this.land = false;
		}
		
		else if (this.shot == true) {
			this.dy1 -= 5;
			this.dy2 -= 5;
		}
	else if (this.movement > 0 && this.dx2 < 1090) {
			this.dx1 += this.movement;
			this.dx2 += this.movement;
			

		}
	else if (this.movement < 0 && this.dx1 > 0) {
			this.dx1 += this.movement;
			this.dx2 += this.movement;
			

		}

	}
	
		
		

	

	public void setDx1Inicial(int dx1Inicial) {
		this.dx1Inicial = dx1Inicial;
	}

	

	public void setDx2Inicial(int dx2Inicial) {
		this.dx2Inicial = dx2Inicial;
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

	public Image getImage() {
		return image;
	}
	

	public boolean isShot() {
		return shot;
	}
	
	
	public boolean isLand() {
		return land;
	}

	public void setLand(boolean land) {
		this.land = land;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_SPACE) {
			this.shot = true;
		}
		if (key == KeyEvent.VK_RIGHT) {
			this.movement = 1;
 
		}
		if (key == KeyEvent.VK_LEFT) {
			this.movement = -1;

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
