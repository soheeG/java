package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<String>();
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());
		
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		sc.hasNext();
		System.out.println(sc.hasNext());
		
		//기본 타입은 타입 아규먼트로 사용 불가
//		MyClass02<int> o3;
		
		//wrapper type으로 사용
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(3); //autoboxing
		int i = o3.getItem();
		System.out.println(i);
	}
}

//generic type
// T: type parameter
// type parameter 명 작성 관습 : 대문자 한글자
// E - Element
// K - Key
// N - Number
// T - Type
// V - Value
// S,U,V etc. - 2nd, 3rd, 4th types
class MyClass02<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}