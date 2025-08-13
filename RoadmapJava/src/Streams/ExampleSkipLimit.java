package Streams;

import java.util.stream.Stream;

public class ExampleSkipLimit {
	
	public static void main(String[] args) {
		
		Stream.iterate(1, n -> n + 1)
	      .skip(5)
	      .limit(3)
	      .forEach(System.out::println); // 6, 7, 8
	}

}
