package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsReduce {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4, 6, 8, 10, 12 , 15, 20);
		
		///Reduce tem a mesma função de usar Stream().mapToInt(Integer::intValue).sum();
		int numbersReduced = numbers.stream().map(x -> x - 2 ).reduce(0, Integer::sum);
		int numbersReducedTwo = numbers.stream().reduce(0, Integer::sum);
		System.out.println(numbersReduced);
		System.out.println(numbersReducedTwo);
		
		
	}

}
