package ventana;

import java.awt.*;
import javax.swing.*;

public class Window extends Canvas implements Runnable {
	
	private static JFrame window;
	private static Thread thread;
	private static volatile boolean bucle = false;
	private static int fps = 0;
	
	public Window() {
	setPreferredSize(new Dimension(600, 800));
		
	window = new JFrame("juego");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLayout(new BorderLayout());
	window.add(this, BorderLayout.CENTER);
	window.pack();
	window.setLocationRelativeTo(null);
	window.setVisible(true);
	
	
	}
	public synchronized void iniciar() {
		bucle = true;
		
		thread = new Thread(this, "Sprites");
		thread.start();
	}
	
	public synchronized void detener() {
		bucle = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println("No se pudo detener la aplicación");
			e.printStackTrace();
		}
	}
	
	public void actualizar() {
		fps ++;
	}
	
	public void mostrar() {
		
	}

	@Override
	public void run() {
		final int nsPorSegundo = 1000000000;
		final byte FPS = 30;
		final double nsPorFotograma = nsPorSegundo / FPS;
		
		long ReferenciaFotograma = System.nanoTime();
		
		
		double tiempoTranscurrido;
		double delta = 0;
		
		while (bucle) {
			final long inicioBucle = System.nanoTime();
			
			tiempoTranscurrido = inicioBucle - ReferenciaFotograma;
			ReferenciaFotograma = inicioBucle;
			
			delta += tiempoTranscurrido / nsPorFotograma;
			
			while (delta >= 1) {
				actualizar();
				delta --;
			}
			
			mostrar();

			}
		}
		
	}


