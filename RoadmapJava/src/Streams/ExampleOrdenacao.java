package Streams;

import java.util.List;

public class ExampleOrdenacao {
	
	public static void main(String[] args) {
		
		List<String> nomes = List.of("Ana", "Pedro", "Maria");
		nomes.stream()
	     .sorted((a, b) -> b.compareTo(a)) // ordem decrescente
	     .forEach(System.out::println);
	}

}
