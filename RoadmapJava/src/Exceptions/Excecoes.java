package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excecoes {
	/// demonstrando try catch 
	public int testeException(int x) {
		int resultado = x;
		if(x >= 10) {
			try {
				resultado = x / 0;
			} catch (ArithmeticException e){
				System.out.println("Divisão por 0");
			} finally {
				System.out.print("Sempre executa");
			}
		}
		
		return resultado;
	}
	
	public void verificaIdade(int idade) {
	    if (idade < 18) {
	        throw new IllegalArgumentException("Idade mínima é 18");
	    }
	    System.out.println("Acesso permitido.");
	}
	
	public void lerArquivo() throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
	}
	
	public static void main(String[] args) throws IOException {
		Excecoes eX = new Excecoes();
	    int res1 = eX.testeException(15);
	    System.out.println("\nResultado para 5: " + res1);
	   try {
		   eX.verificaIdade(15); /// throw new pega a exceção e consegue editar a mensagem de erro, vai travar a aplicação.
	   } catch (IllegalArgumentException e) {
		   System.out.println("Erro: " + e.getMessage());
	   }
		
		//eX.lerArquivo();
	}

}
