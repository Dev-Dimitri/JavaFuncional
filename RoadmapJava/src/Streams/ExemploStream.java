package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import POO.NovaPessoa;
import POO.Pessoa;

public class ExemploStream {
	
	public static void main(String[] args) {
        List<String> nomew = Arrays.asList("Ana", "Pedro", "João");

        // A partir de uma lista
        Stream<String> stream1 = nomew.stream();

        // A partir de valores diretos
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);

        // A partir de array
        String[] arr = {"A", "B", "C"};
        Stream<String> stream3 = Arrays.stream(arr);
        
        List<String> nomes = Arrays.asList("Ana", "Pedro", "João", "Paulo", "Maria");
	
	     // Filtrar nomes com mais de 4 letras e converter para maiúsculo
	     List<String> resultado = nomes.stream()
	         .filter(n -> n.length() > 4)
	         .map(String::toUpperCase)
	         .sorted()
	         .toList();
	
	     System.out.println(resultado); // [MARIA, PEDRO, PAULO]
	     
	     
	     
	     
	     ////FILTER
	     List<String> nomeFiltro = List.of("Ana", "Pedro", "Maria");
	     
	     List<String> filteredNames = nomeFiltro.stream()
	    		 .filter(n -> n.contains("a"))
	    		 .map(filtrados -> filtrados.toUpperCase())
	    		 .collect(Collectors.toList());
	     
	     System.out.println(filteredNames);
	     
	     
	     ///MAP
	     
	     List<String> nomesMap = List.of("Ana", "Pedro", "Maria");
	     
	     List<Integer> mappedNames = nomesMap.stream()
	    		 	.map(String::length)
	    		 	.map(n -> n*n)
	    		 	.collect(Collectors.toList());
	    
	     System.out.println(mappedNames);
	     
	     ///Sorted
	     List<String> nomesSorted = List.of("Ana", "Matheus", "Bruno", "Davi", "Pedro", "Rafael", "Maria");
	     
	     List<String> sortedNames = nomesSorted.stream()
	    	     .sorted()
	    	     .collect(Collectors.toList());
	     
	     System.out.println(nomesSorted);
	     System.out.println(sortedNames);
	     
	     
	     
	     //Criando objetos
	     
	     List<String> objectNames = List.of("Ana", "Matheus", "Bruno", "Davi", "Pedro", "Rafael", "Maria");
	     
	     ///atributo único
	     List<Pessoa> objectCreated = objectNames.stream()
	    		 .map(Pessoa::new)
	    		 .toList();
	     
	     System.out.println(objectNames);
	     System.out.println(objectCreated);
	     
	     List<String[]> dados = List.of(
	    		    new String[]{"Ana", "Silva"},
	    		    new String[]{"Bruno", "Souza"},
	    		    new String[]{"Carlos", "Oliveira"}
	    		);

	     
	     List<NovaPessoa> manyObjCreated = dados.stream()
	    		 .map(newList -> new NovaPessoa(newList[0], newList[1]))
	    		 .collect(Collectors.toList());
	     
	     System.out.println(manyObjCreated);
	     
	     
	     Map<String, Integer> nomeParaTamanho = nomew.stream()
	    		    .collect(Collectors.toMap(n -> n, String::length, (a,b) -> a)); // merge resolver
	     
	     System.out.println(nomeParaTamanho);
	    }
	
		
	
	

}
