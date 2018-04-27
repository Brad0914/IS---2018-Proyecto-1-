package invaders;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listas.Enemigo;
import listas.Lista;
import listas.ListaD;
import listas.ListaDC;

public class Main{
	
	public static int ventana = 0;
	public static Window window;
	

	public static void main(String[] args) {
		

		JPanel JpanelInterfaz = new JPanel();
		JButton buttonPlay = new JButton("Jugar");
		JLabel labelInvaders = new JLabel("Invaders");
		JpanelInterfaz.setBackground(Color.black);
		buttonPlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana = 1;
				main(args);
			}
		});
		GridBagConstraints gbc = new GridBagConstraints();

		JpanelInterfaz.setLayout(new GridBagLayout());
		gbc.gridx = 0;
		gbc.gridy = 0;
		JpanelInterfaz.add(labelInvaders, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		JpanelInterfaz.add(buttonPlay, gbc);

		JPanel JpanelSeleccion = new JPanel();
		JpanelSeleccion.setBackground(Color.black);
		JButton buttonBasic = new JButton("Basic");
		JButton buttonA = new JButton("ClassA");
		JButton buttonB = new JButton("ClassB");
		JButton buttonC = new JButton("ClassC");
		JLabel labelChoose = new JLabel("Elije el estilo de juego");
		buttonBasic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana = 2;
				main(args);
			}
		});
		buttonA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana = 3;
				main(args);
			}
		});
		buttonB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana = 4;
				main(args);
			}
		});
		buttonC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana = 5;
				main(args);
			}
		});
		GridBagConstraints gbc1 = new GridBagConstraints();

		JpanelSeleccion.setLayout(new GridBagLayout());
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		JpanelSeleccion.add(labelChoose, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 1;
		JpanelSeleccion.add(buttonBasic, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 2;
		JpanelSeleccion.add(buttonA, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 3;
		JpanelSeleccion.add(buttonB, gbc1);
		gbc1.gridx = 0;
		gbc1.gridy = 4;
		JpanelSeleccion.add(buttonC, gbc1);
		
		int random0 = (int) ((Math.random() * 5) + 1);
		int random1 = (int) ((Math.random() * 5) + 1);
		int random2 = (int) ((Math.random() * 5) + 1);
		int random3 = (int) ((Math.random() * 5) + 1);
		int random4 = (int) ((Math.random() * 5) + 1);
		int random5 = (int) ((Math.random() * 5) + 1);
		int random6 = (int) ((Math.random() * 5) + 1);
		int random7 = (int) ((Math.random() * 5) + 1);
		
		Nave n = new Nave();
		
		Proyectile proyectile1 = new Proyectile(n.getDx1(), n.getDy1(), n.getDx2(), n.getDy2());
		
		ControladorT K = new ControladorT(n , proyectile1);
		
		Enemigo enemy0 = new Enemigo(proyectile1, 1);
		Enemigo enemy1 = new Enemigo(proyectile1, 1);
		Enemigo enemy2 = new Enemigo(proyectile1, 1);
		Enemigo enemy3 = new Enemigo(proyectile1, 1);
		Enemigo enemyBoss = new Enemigo(proyectile1, true, false);
		Enemigo enemy5 = new Enemigo(proyectile1, 1);
		Enemigo enemy6 = new Enemigo(proyectile1, 1); 
		Enemigo enemy7 = new Enemigo(proyectile1, 1);
		
		Enemigo A0 = new Enemigo(proyectile1, random0); 
		Enemigo A1 = new Enemigo(proyectile1, random1);
		Enemigo A2 = new Enemigo(proyectile1, random2);
		Enemigo A3 = new Enemigo(proyectile1, random3);
		Enemigo A4 = new Enemigo(proyectile1, random4);
		Enemigo A5 = new Enemigo(proyectile1, random5);
		Enemigo A6 = new Enemigo(proyectile1, random6);
		Enemigo A7 = new Enemigo(proyectile1, random7);
		
		Enemigo e0 = new Enemigo(proyectile1, 1); 
		Enemigo e1 = new Enemigo(proyectile1, 1);
		Enemigo e2 = new Enemigo(proyectile1, 1);
		Enemigo e3 = new Enemigo(proyectile1, 1);
		Enemigo e4 = new Enemigo(proyectile1, 1);
		Enemigo e5 = new Enemigo(proyectile1, 1);
		Enemigo e6 = new Enemigo(proyectile1, 1);
		Enemigo e7 = new Enemigo(proyectile1, 1);

		Lista listaNoBoss = new Lista();
		Lista listaBoss = new Lista();
		ListaD listaBossD = new ListaD();
		ListaDC listaBossDC = new ListaDC();
		Lista listaNoBossA = new Lista();
		
		listaNoBoss.insertarFinal(e0);
		listaNoBoss.insertarFinal(e1);
		listaNoBoss.insertarFinal(e2); 
		listaNoBoss.insertarFinal(e3);
		listaNoBoss.insertarFinal(e4);
		listaNoBoss.insertarFinal(e5);
		listaNoBoss.insertarFinal(e6);
		listaNoBoss.insertarFinal(e7);
		
		listaBoss.insertarFinal(enemy0);
		listaBoss.insertarFinal(enemy1);
		listaBoss.insertarFinal(enemy2);
		listaBoss.insertarFinal(enemy3);
		listaBoss.insertarFinal(enemyBoss);
		listaBoss.insertarFinal(enemy5);
		listaBoss.insertarFinal(enemy6);
		listaBoss.insertarFinal(enemy7);
		
		listaBossD.insertarFinal(enemy0);
		listaBossD.insertarFinal(enemy1);
		listaBossD.insertarFinal(enemy2);
		listaBossD.insertarFinal(enemy3);
		listaBossD.insertarFinal(enemyBoss);
		listaBossD.insertarFinal(enemy5);
		listaBossD.insertarFinal(enemy6);
		listaBossD.insertarFinal(enemy7);
		
		listaBossDC.insertarFinal(enemy0);
		listaBossDC.insertarFinal(enemy1);
		listaBossDC.insertarFinal(enemy2);
		listaBossDC.insertarFinal(enemy3);
		listaBossDC.insertarFinal(enemyBoss);
		listaBossDC.insertarFinal(enemy5);
		listaBossDC.insertarFinal(enemy6);
		listaBossDC.insertarFinal(enemy7);
		
		
		JPanel scene = new JPanel();
	
		
		if (ventana == 0) {
			scene = JpanelInterfaz;
		
		} else if (ventana == 1) {
			scene = JpanelSeleccion;
	
	
		} else if (ventana == 2) {
			scene = new Escenario(n, K, proyectile1, listaNoBoss);
		
			
		} else if (ventana == 3) {
			scene = new Escenario(n, K, proyectile1, listaBoss);

		} else if (ventana == 4) {
			scene = new Escenario(n, K, proyectile1, listaBossD);

		} else if (ventana == 5) {
			scene = new Escenario(n, K, proyectile1, listaBossDC);

		}

		window = new Window(scene);

		
	}

	
	




}
