package ch17.lecture.p01intermediate;

import java.util.stream.*;

public class C12Map {
	public static void main(String[] args) {
		//기본 타입 int가 원소 스트림
		IntStream stream1 = IntStream.range(11, 20);
		
		//참조 타입 Integer가 원소인 스트림으로 변환
		Stream<Integer> stream2 = stream1.mapToObj(Integer::valueOf);
		
		long count = stream2.count();
		
		System.out.println(count);
	}
}
