package Mover_sprites.copy;

import java.awt.Label;
import java.awt.List;

import listas.Enemigo;
import listas.Lista;


public class Main {

	public static void main(String[] args) {
		Nave n = new Nave();
		
		Proyectile proyectile1 = new Proyectile(n.getDx1(), n.getDy1(), n.getDx2(), n.getDy2());
		
		

		
		Enemigo enemy = new Enemigo(proyectile1,"");
		Enemigo enemy2 = new Enemigo(proyectile1,"");
		Enemigo enemy3 = new Enemigo(proyectile1, "");
		Enemigo enemy4 = new Enemigo(proyectile1, true);
		Enemigo enemy5 = new Enemigo(proyectile1, "");
		Enemigo enemy6 = new Enemigo(proyectile1, "");
		Enemigo enemy7 = new Enemigo(proyectile1, "");
		Enemigo enemy8 = new Enemigo(proyectile1, "");

		Lista l = new Lista();
		ControladorT K = new ControladorT(n , proyectile1);
		 l.insertarFinal(enemy);
		 l.insertarFinal(enemy2);
		 l.insertarFinal(enemy3);
		 l.insertarFinal(enemy4);
		 l.insertarFinal(enemy5);
		 l.insertarFinal(enemy6);
		 l.insertarFinal(enemy7);
		 l.insertarFinal(enemy8);
		
		
		Escenario scene = new Escenario(n, K, proyectile1, l);
		MoverSprites mv = new MoverSprites(scene);


	}

}
