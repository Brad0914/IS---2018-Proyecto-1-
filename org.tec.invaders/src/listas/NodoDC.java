package listas;

public class NodoDC {
		private NodoDC siguiente; 
		private NodoDC anterior;
		private Enemigo valor;


		public NodoDC(Enemigo valor) {

			this.valor = valor;
		}



		public NodoDC(Enemigo valor, NodoDC siguiente, NodoDC anterior) {
			this.valor = valor;
			this.siguiente = siguiente;
			this.anterior = anterior;

		}

		public NodoDC getSiguiente() { 
			return siguiente;
		}

		public void setSiguiente(NodoDC siguiente) {
			this.siguiente = siguiente;
		}

		public NodoDC getAnterior() {
			return anterior;
		}

		public void setAnterior(NodoDC anterior) {
			this.anterior = anterior;
		}

		public Enemigo getValor() {
			return valor;
		}

		public void setValor(Enemigo valor) {
			this.valor = valor;
		}
	}