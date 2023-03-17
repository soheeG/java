package ch17.sec01.exam01;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
	public static void main(String[] args) {
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); //스트림 얻기
		//람다식 : 요소 처리 방법
		stream.forEach(name -> System.out.println(name)); 
	}
}
