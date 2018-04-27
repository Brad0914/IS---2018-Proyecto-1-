package listas;

/**
 * clase lista doble
 * @author Bradly Valverde F
 *
 */

public class ListaD {
	private NodoD primero;
	private NodoD ultimo;
	

/**
  * constructor
  */
	public ListaD() {
		this.primero = null; 
		this.ultimo = null;
	}

	/**
	 * devuelve un valor boolean si la lista esta vacia o con elementos
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.primero == null && this.ultimo == null;
		
	}

	/**
	 * recibe el calor de primero
	 * @return NodoD
	 */
	public NodoD getPrimero() {
		return primero;
		
	}
	/**
	 * recibe el valor de ultimo
	 * @return NodoD
	 */
	public NodoD getUltimo() {
		return ultimo;
	}
	
	/**
	 * inserta al final y enlaza doble la lista
	 * @param valor
	 */
	public void insertarFinal(Enemigo valor) {
		if (this.ultimo == null) {
			this.ultimo = new NodoD(valor);
			this.primero = this.ultimo;
		}else
			if (this.primero == this.ultimo) {
				NodoD actual = this.primero;
				actual.setSiguiente(new NodoD(valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);

								
			}else{
				NodoD actual = this.ultimo;
				actual.setSiguiente(new NodoD (valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);

				
			}
	} 
	public void eliminar(int contador) {
		int local = 1;
		NodoD actual = this.primero;
		NodoD actual1 = this.primero.getSiguiente();
		NodoD actual2 = this.ultimo;
		if (contador == 0) {
			this.primero = this.primero.getSiguiente();
			this.primero.setAnterior(null);
		}else{
			while(actual1 != null) {
				
				if (actual1 == actual2) {
					this.ultimo = this.ultimo.getAnterior();
					this.ultimo.setSiguiente(null);
					break;
				}else
					if(local == contador) {
						actual.setSiguiente(actual1.getSiguiente());
						actual1.getSiguiente().setAnterior(actual);
						break;
				}else{
					actual = actual.getSiguiente();
					actual1 = actual1.getSiguiente();
					local = local + 1; 
						
					}
			
			}
			
		}
	}



	/**
	 * imprime de primero a ultimo
	 */
	public void imprimir() {
		NodoD actual = this.primero;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getSiguiente();
		}

	}

	/**
	 * imprime de ultimo a primero
	 */
	public void imprimirAlreves() {
		NodoD actual = this.ultimo;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getAnterior();
		}
	}
	 /**
	  * inserta al inicio y enlaza doble la lista
	  * @param valor
	  */
	public void insertarInicio (Enemigo valor) {
		if (this.primero == null) {
			this.primero = new NodoD(valor);
			this.ultimo = this.primero;
			
		} else 
			if (this.primero == this.ultimo) {
				NodoD actual = this.ultimo;	
				actual.setAnterior(new NodoD(valor));
				this.primero = this.primero.getAnterior(); 
				this.primero.setSiguiente(actual);

				 
		}else { 
			NodoD actual = this.primero;
			actual.setAnterior(new NodoD (valor));
			this.primero = this.primero.getAnterior();
			this.primero.setSiguiente(actual);


		
			
			
	    }
	}
}
