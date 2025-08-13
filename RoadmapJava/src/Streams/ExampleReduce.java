package Streams;

import java.util.stream.Stream;

public class ExampleReduce {
	
	public static void main(String[] args) {
		
		int soma = Stream.of(1, 2, 3, 4)
			    .reduce(0, (a, b) -> a + b);
			System.out.println(soma); // 10
	}

}
