package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsForEach {

		public static void main(String[] args) {
			
			List<String> testando =  Arrays.asList("Dimitri", "Almeida", "Backend", "FrontEnd");

			testando.forEach(System.out::println);
			
			List<String> novaLista = new ArrayList<>();
			
			testando.forEach(novaLista::add);
			
			testando.forEach(x -> novaLista.add(x));
			
		}
}
