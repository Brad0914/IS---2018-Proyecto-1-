package listas;

public class NodoD {
	private NodoD siguiente;
	private NodoD Anterior;
	private Enemigo valor;


	public NodoD(Enemigo valor) {

		this.valor = valor;
	}
	
	public NodoD(Enemigo valor, NodoD siguiente, NodoD Anterior) {
	this.valor = valor;
	this.siguiente = siguiente;  
	this.Anterior = Anterior;

	}

	public NodoD getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoD siguiente) {
		this.siguiente = siguiente;
	}
	public NodoD getAnterior() {
		return Anterior;
	}
	public void setAnterior(NodoD anterior) {
		Anterior = anterior;
	}
	public Enemigo getValor() {
		return valor;
	}
	public void setValor(Enemigo valor) {
		this.valor = valor;
	}
}
