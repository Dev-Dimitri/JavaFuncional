package POO;

import POO.Heranca.Animal;
import POO.Heranca.Cachorro;

public class Polimorfismo {
	
	public static void main(String[] args) {
		//override, overload.
		
		//sobrescrita -> a função emiteSom na classe Animal executa x, a função emiteSom na classe Cachorro, emite y.
		Animal a = new Cachorro();
		a.emiteSom();
		
		Calculadora cL = new Calculadora();
		int somaInteira = cL.soma(4, 5);
		String somaString = cL.soma("Olá", "null");
		
		System.out.println(somaInteira);
		System.out.println(somaString);
		
	}
	///Sobrecarga de métodos.
	static class Calculadora{
		int soma(int a, int b) {
			return a + b;
		}
		
		String soma(String a, String b) {
			return a + " " + b;
		}
	}

}
