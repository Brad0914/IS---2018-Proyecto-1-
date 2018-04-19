package listas;

public class Nodo {
	private Nodo siguiente;
	private Enemigo valor; 

	public Nodo(Enemigo enemy) { 
		this.valor = enemy;
		this.siguiente = null;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Enemigo getValor() {
		return valor;
	}

	public void setValor(Enemigo valor) {
		this.valor = valor;
	}
}
