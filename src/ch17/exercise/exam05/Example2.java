package ch17.exercise.exam05;

import java.util.*;
public class Example2 {
	List<String> list = Arrays.asList(
			"This is a java book",
			"Lamda Expressins",
			"java8 supports lamda expressint"
			);
	
	list.stream()
		.filter(Example2::havingJabva)
		.forEach(System.out::println);
	}
}
