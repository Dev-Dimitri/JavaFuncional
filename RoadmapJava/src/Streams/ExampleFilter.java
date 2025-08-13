package Streams;

import java.util.List;

public class ExampleFilter {
	
		public static void main(String[] args) {
				//Mantém apenas os elementos que passam em uma condição.
				List<String> nomes = List.of("Ana", "Pedro", "Maria");
				nomes.stream()
				     .filter(n -> n.startsWith("M"))
				     .forEach(System.out::println); // Maria
		}
}
