package POO;

public class Heranca {
	
	
	// a class interna, necessita de uso static neste caso para sua criação.
	public static class Animal {
		
		public void emiteSom() {
			System.out.println("Som genérico");
		}
	}
	
	public static class Cachorro extends Animal {
	 
		public void emiteSom() {
			System.out.println("Latido");
		}
		
	}
	
	public static void main(String[] args) {
		Cachorro ch = new Cachorro();
		ch.emiteSom();
	}

}
