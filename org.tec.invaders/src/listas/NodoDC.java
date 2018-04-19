package listas;

public class NodoDC {
		private NodoDC siguiente; 
		private NodoDC anterior;
		private EnemigoDC valor;


		public NodoDC(EnemigoDC valor) {

			this.valor = valor;
		}



		public NodoDC(EnemigoDC valor, NodoDC siguiente, NodoDC anterior) {
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

		public EnemigoDC getValor() {
			return valor;
		}

		public void setValor(EnemigoDC valor) {
			this.valor = valor;
		}
	}