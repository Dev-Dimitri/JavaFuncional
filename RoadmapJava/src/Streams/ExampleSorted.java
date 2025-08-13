package Streams;

import java.util.List;

public class ExampleSorted {
	
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(5, 3, 8, 1);
		nums.stream()
		    .sorted()
		    .forEach(System.out::println); // 1, 3, 5, 8
	}

}
