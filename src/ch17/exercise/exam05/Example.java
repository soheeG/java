package ch17.exercise.exam05;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lamda Expressins",
				"java8 supports lamda expressint"
				);
	  for (String e : list) {
		  if(e.toLowerCase().contains("java")) {
			  System.out.println(e);
		  }
	  }
		
	}
}
