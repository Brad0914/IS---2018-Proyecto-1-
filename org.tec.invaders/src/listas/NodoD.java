package listas;

public class NodoD {
	private NodoD siguiente;
	private NodoD Anterior;
	private EnemigoD valor;


	public NodoD(EnemigoD valor) {

		this.valor = valor;
	}
	
	public NodoD(EnemigoD valor, NodoD siguiente, NodoD Anterior) {
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
	public EnemigoD getValor() {
		return valor;
	}
	public void setValor(EnemigoD valor) {
		this.valor = valor;
	}
}
