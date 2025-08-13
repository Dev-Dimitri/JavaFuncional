package POO;

public abstract class Abstracao {
	
	abstract double CalcularArea();

	class Circulo extends Abstracao {
		
		//métodos da classe construtor
		private double raio;
		public Circulo(double raio) {
			this.raio = raio;
		}
		///sobrecarga do método pai. 
		@Override
		double CalcularArea() {
			return Math.PI * raio * raio;
		}

		
	}

}
