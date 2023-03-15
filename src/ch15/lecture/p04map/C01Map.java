package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, vaule) 쌍 entry를 저장
		// key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		// entry 수
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball");
		System.out.println(map.size());
		
		
		// key로 value 얻기
		String v1 = map.get("serly");
		System.out.println(v1);
		System.out.println(map.get("kang"));
		
		// key로 entry 지우기
		map.remove("kang");
		System.out.println(map.size());
		
	}
}
