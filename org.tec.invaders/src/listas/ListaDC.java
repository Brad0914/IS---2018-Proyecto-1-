package listas;

/**
 * lista doble circular
 * @author Bradly valverde F
 *
 */
public class ListaDC {
	private NodoDC primero;
	private NodoDC ultimo; 



	

	public ListaDC() {
		this.primero = null;
		this.ultimo = null;
		
	}

	public boolean isEmpty() {
		return this.primero == null && this.ultimo == null;
	}

	public NodoDC getPrimero() {
		return primero; 
	}

	public NodoDC getUltimo() {
		return ultimo;
	}

	public void insertarFinal(Enemigo valor) {
		if (this.ultimo == null) {
			this.ultimo = new NodoDC(valor);
			this.primero = this.ultimo;
		}else
			if (this.primero == this.ultimo) {
				NodoDC actual = this.primero;
				actual.setSiguiente(new NodoDC(valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);

								
			}else{
				NodoDC actual = this.ultimo;
				actual.setSiguiente(new NodoDC (valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);
				this.ultimo.setSiguiente(this.primero);
				this.primero.setAnterior(this.ultimo);
				
			}

	}
	public void eliminar(int contador) {
		int local = 1;
		NodoDC actual = this.primero;
		NodoDC actual1 = this.primero.getSiguiente();
		NodoDC actual2 = this.ultimo;
		if (contador == 0) {
			this.primero = this.primero.getSiguiente();
			this.primero.setAnterior(this.ultimo);
			this.ultimo.setSiguiente(this.primero); 
		}else{
			while(actual1 != null) {
				
				if (actual1 == actual2) {
					this.ultimo = this.ultimo.getAnterior();
					this.ultimo.setSiguiente(this.primero);
					this.primero.setAnterior(this.ultimo);
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

	public void imprimir() {
		NodoDC actual = this.primero;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getSiguiente();
		}
	}
	public void imprimirAlreves() {
		NodoDC actual = this.ultimo;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getAnterior();
		}
	}
	public void insertarInicio (Enemigo valor) {
		if (this.primero == null) {
			this.primero = new NodoDC(valor);
			this.ultimo = this.primero;
			
		} else 
			if (this.primero == this.ultimo) {
				NodoDC actual = this.ultimo;	
				actual.setAnterior(new NodoDC(valor));
				this.primero = this.primero.getAnterior(); 
				this.primero.setSiguiente(actual);

				 
		}else { 
			NodoDC actual = this.primero;
			actual.setAnterior(new NodoDC (valor));
			this.primero = this.primero.getAnterior(); 
			this.primero.setSiguiente(actual);
			this.primero.setAnterior(this.ultimo);
			this.ultimo.setSiguiente(this.primero);
			

	}
}
}
