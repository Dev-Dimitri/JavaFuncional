package Streams;

import java.util.List;

public class MapExample {
 public static void main(String[] args) {
	
	 List<String> nomes = List.of("Ana", "Pedro", "Maria");
	 nomes.stream()
	      .map(String::toUpperCase)
	      .forEach(System.out::println);
	 // ANA, PEDRO, MARIA
}
}
