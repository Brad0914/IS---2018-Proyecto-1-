package listas;

 /**
  * 
  * @author Bradly Valverde F
  *clase lista
  */
public class Lista {
	private Nodo primero;

 
	/**
	 * constructor 
	 */
	public Lista() {
		this.primero = null;

	}


	/**
	 * para verificar que la lista esta vacía
	 * @return boolean de que si la lista es vacia
	 */
	public boolean isEmpty() {
		return this.primero == null;
	}
	/**
	 * obtiene el calor de primero
	 * @return this.primero
	 */
	public Nodo getPrimero() {
		return primero;
	}

	/**
	 * le otorga al primero un valor nodo
	 * @param primero
	 */
	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	/**
	 * inserta un valor al final de la lista
	 * @param obj
	 */
	public void insertarFinal(Enemigo enemy) {
		if (this.primero == null) {
			this.primero = new Nodo(enemy);
		} else {
			Nodo actual = this.primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(new Nodo(enemy));
		}

	}
	public void eliminar(int contador) {
		int local = 1;
		Nodo actual = this.primero;
		Nodo actual1 = this.primero.getSiguiente();
		if (contador == 0) {
			this.primero = this.primero.getSiguiente();
		}else{
			while(actual1 != null) {
					if(local == contador) {
						actual.setSiguiente(actual1.getSiguiente());
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
	 * inserta un valor al inicio
	 * @param valor
	 */
	public void insertarInicio (Enemigo enemy) {
		if (this.primero == null) {
			this.primero = new Nodo(enemy);
		} else {
			Nodo nuevo = new Nodo(enemy);
			nuevo.setSiguiente(this.primero);
			this.primero = nuevo;
		}
	}


}
