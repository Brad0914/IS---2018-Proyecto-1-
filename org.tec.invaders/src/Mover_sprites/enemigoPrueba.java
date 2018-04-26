package Mover_sprites;

import java.awt.Image;


import javax.swing.ImageIcon;

public class enemigoPrueba {
	private String metroid = "C:\\Users\\Ba\\Desktop\\Sprites\\metroid.gif";
	private int dx1;
	private int dy1;
	private int dx2;
	private int dy2;
	private int sx1;
	private int sy1;
	private int sx2;
	private int sy2;
	private int contadorL;
	private int contadorR;

	private Image image;

	public enemigoPrueba() {
		ImageIcon image_icon = new ImageIcon(metroid);
		image = image_icon.getImage();

		this.dx1 = 1045;
		this.dx2 = 1095;
		this.dy1 = 0;
		this.dy2 = 50;

		this.sx1 = 0;
		this.sx2 = 50;
		this.sy1 = 0;
		this.sy2 = 50;
		this.contadorL = 1045;
		this.contadorR = 0;

	}

	public void move() {
		
		if (this.contadorL > 0) {
			this.dx1 -=1;
			this.dx2 -=1;
			this.contadorL -=1;
		}

		else if (this.contadorR < 1045) {
			this.dx1 += 1;
			this.dx2 += 1;
			this.contadorR += 1;
		}

		else {
			this.contadorL = 1045;
			this.contadorR = 0;
			this.dy1 += 20;
			this.dy2 += 20;
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

	public Image getImage() {
		return image;
	}

}
