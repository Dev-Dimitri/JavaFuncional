package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExampleDistinct {
	
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1, 2, 2, 3, 1);
		List<Integer> distinctList = nums.stream()
			    .distinct()
			    .collect(Collectors.toList());
		
		System.out.println(distinctList);
	}

}
