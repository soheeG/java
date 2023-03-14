package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	// 지역 변수만 가능해서 아래 코드는 불가
//	var field = 3;
	
	public static void main(String[] args) {
		// 지역 변수 타입 추론
		// 타입을 유추할 수 있을 때 var로 대체하여 작성 가능
		int a = 3;
		String b = "java";
		
		var c = 5;
		var d = "hello";
		
		// 선언과 동시에 초기화할 때만 사용 가능
//		var e;
//		e = 9;
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var box3 = new Box<String>();
		
		var list1 = new ArrayList<List<String>>();
		
		// 재 할당할 시 같은 타입만 가능
		var f = 10; // int로 추론
		f = 11; //가능
//		f = 3.14; //불가능
		
		// var 사용 시 읽기 쉬운 코드인가를 고민하고 사용
		var list2 = new ArrayList<String>();
		
		//긴코드...
		
		for (String item : list2) {
		}
		//권장하지 않음
		for (var item : list2) {
			//너무 길어서 변수의 타입을 눈으로 읽는데 
			//무리가 있으면 권장하지 않음
		}
		
		//var는 키워드가 아님
		int var = 3; //사용 가능은 하지만 변수명으로 사용하지 말 것
		
	}
}
