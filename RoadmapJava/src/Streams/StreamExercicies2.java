package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercicies2 {

	public static void main(String[] args) {
		
		///Exercício 1 – Somar todos os números da lista
		
		List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25);
		
		int resultSum = nums.stream().mapToInt(c -> c).sum();
				
		System.out.println(resultSum);
		
		List<Integer> numsMax = Arrays.asList(7, 3, 10, 1, 25, 30, 15);

       ///Exercicio 2, pegando de forma decrescente o maior pro menor, limitando em 3 indices.
		List<Integer> top3 = numsMax.stream()
		    .sorted(Comparator.naturalOrder()) // ordena em ordem decrescente
		    .limit(3)                          // pega só os 3 primeiros
		    .collect(Collectors.toList());     // transforma de volta em lista
		
		System.out.println(top3); // [30, 25, 15]

		
		 List<Integer> numz = Arrays.asList(5, 10, 15, 20, 25);

	        IntSummaryStatistics stats = numz.stream()
	            .mapToInt(i -> i)          // CONVERTE Stream<Integer> para IntStream
	            .summaryStatistics();      // AGORA funciona, porque é IntStream

	        System.out.println("Soma: " + stats.getSum());
	        System.out.println("Mínimo: " + stats.getMin());
	        System.out.println("Máximo: " + stats.getMax());
	        System.out.println("Média: " + stats.getAverage());
	        System.out.println("Quantidade: " + stats.getCount());
			
	}
}
