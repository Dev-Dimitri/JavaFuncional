package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExercices {
	
	public static void main(String[] args) {
		
		
		/// Exercicio 1 -> Itere com forEach
		List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9 , 10);
		
		firstList.stream()
				.forEach(c -> System.out.print(c + " "));
		
		/// Exercicio 2 -> Busque a palavra verdadeiro e retorne a primeira incidência;
		
		List<String> secondList = Arrays.asList("Dimitri", "2", "3", "4", "5", "6", "7", "8" ,"9" , "10", "verdadeiro", "verdadeiro 2");
		
		
		/// Exercicio 3, filtrar qualquer incidência da palavra verdadeiro;
		List<String> thirdList = Arrays.asList("Dimitri", "2", "3", "4", "5", "6", "7", "8" ,"9" , "10", "verdadeiro", "verdadeiro2", "verdadeiroConcat");
		
		String resultaFitro = secondList.stream()
				.filter(value -> value.equalsIgnoreCase("verdadeiro"))
				.findFirst()
				.orElse("Valor não encontrado!");
		
		System.out.println(resultaFitro);
		
		List<String> resultaThird = thirdList.stream()
		.filter(c -> c.contains("verdadeiro"))
		.collect(Collectors.toList());
		
		System.out.println(resultaThird);
		
		
		
		///Exercicio 4 pegar a segunda incidência de qlqr valor verdadeiro."
		List<String> fourthList = Arrays.asList(
			    "Dimitri", "verdadeiro", "teste", "verdadeiroConcat", "verdadeiro 3"
			);
		
		String ListSecondTruthy = fourthList.stream()
				.filter(c -> c.contains("verdadeiro"))
				.skip(1)
				.findFirst()
				.orElse("Nenhum segundo encontrado.");
		
		System.out.println(ListSecondTruthy);
		
		
		List<String> fifthList = Arrays.asList(
			    "Dimitri", "verdadeiro", "teste", "verdadeiroConcat", "verdadeiro 3"
			);
		
		/// Pegar o indice de cada posição da lista que contenha verdadeiro, no caso o esperado é 1, 3, 4
		List<Integer> resultFifthList = IntStream.range(0, fifthList.size())
				.filter(c -> fifthList.get(c).contains("verdadeiro"))
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(resultFifthList);
		
		
		List<String> resultFifthListBeautifier = IntStream.range(0, fifthList.size())
			    .filter(i -> fifthList.get(i).contains("verdadeiro"))           // filtra pelos que contêm
			    .mapToObj(i -> i + ": " + fifthList.get(i))                     // cria uma string com índice + valor
			    .collect(Collectors.toList());

			System.out.println(resultFifthListBeautifier);
	}

}
