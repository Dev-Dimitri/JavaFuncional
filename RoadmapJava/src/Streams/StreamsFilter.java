 package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsFilter {
	
	public static void main(String[] args) {
		
		
		///Instancia de uma lista de String.
		List<String> nomesz = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda");
		
		 Stream<String> nomeFilter = nomesz.stream().filter(nome -> nome.startsWith("B"));
		 
		 Stream<String> nomeFilterA = nomesz.stream().filter(nome -> nome.startsWith("A"));
		
		nomeFilter.forEach(System.out::println);
		
		nomeFilterA.forEach(System.out::println);
		
		List<String> nomes = List.of("João", "Maria", "Carlos");
	
	}

}
