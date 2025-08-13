package Generics;

public class Imprime {
      public static <T> void Imprimir(T obj) {
    	  System.out.println("Objeto " + obj);
      }
      
      public static void main(String[] args) {
		Imprime.Imprimir("Oi");
	}
}
