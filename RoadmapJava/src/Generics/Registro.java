package Generics;

public class Registro<K, V > {

	private K chave;
	private V valor;
	
	public Registro(K chave, V valor) {
	    this.chave = chave;
	    this.valor = valor;
	}

	public K getChave() {
	    return chave;
	}

	public V getValor() {
	    return valor;
	}
	
	public static void main(String[] args) {
		///demonstrando
		
		Registro<String, Integer> reg1 = new Registro<String, Integer>("Dimitri", 27); // definição por construtor
		Registro<String, String> reg2 = new Registro<String, String>("Dimitri", "Almeida"); // definição por construtor
		
	}
}
