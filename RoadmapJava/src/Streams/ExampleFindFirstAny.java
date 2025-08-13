package Streams;

import java.util.List;
import java.util.Optional;

public class ExampleFindFirstAny {
	
	public static void main(String[] args) {
		
		List<String> nomes = List.of("Ana", "Pedro", "Maria");
		Optional<String> primeiro = nomes.stream().findAny();
		primeiro.ifPresent(System.out::println);
		
	}

}
