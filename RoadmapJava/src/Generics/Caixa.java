package Generics;

public class Caixa<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T pegar() {
        return objeto;
    }
    
    public static void main(String[] args) {
		Caixa<String> caixaTexto = new Caixa<String>();
		caixaTexto.guardar("Olá");
		String texto = caixaTexto.pegar();
		
		Caixa<Integer> caixaNumero = new Caixa<Integer>();
		caixaNumero.guardar(25);
		Integer numero = caixaNumero.pegar();
		
		System.out.println(texto);
		System.out.println(numero);
		
	}
    
    
}