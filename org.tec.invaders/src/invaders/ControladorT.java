package invaders;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControladorT extends KeyAdapter {
	
	private Nave nave;
	
	private Proyectile proyectil;
	
	public ControladorT(Nave nave, Proyectile proyectil) {
		this.nave = nave;
	
		this.proyectil = proyectil;
	}
	

	public Proyectile getProyectil() {
		return proyectil;
	}


	public void setProyectil(Proyectile proyectil) {
		this.proyectil = proyectil;
	}


	public void keyReleased(KeyEvent e) {
		this.nave.keyReleased(e);
	

		this.proyectil.keyReleased(e);
	}

	public void keyPressed(KeyEvent e) {
		this.nave.keyPressed(e);
	
		this.proyectil.keyPressed(e);
	}
}
