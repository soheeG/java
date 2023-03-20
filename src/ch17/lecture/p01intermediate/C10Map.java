package ch17.lecture.p01intermediate;

import java.util.*;
import java.util.stream.*;

public class C10Map {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "spring", "html");
		
		Stream<String> stream1 = list.stream();
		
		//다른 타입으로 매핑
		Stream<Integer> stream2 = stream1.map(s -> s.length());
		
		stream2.forEachOrdered(System.out::println);
		
		System.err.println("짝수 길이 스트링이 몇 개?######");
		long count = list.stream()
			.map(s -> s.length())
			.filter(s -> (s%2) == 0)
			.count();
		
		System.out.println(count);
	}
}
