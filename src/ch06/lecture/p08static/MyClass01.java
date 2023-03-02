package ch06.lecture.p08static;

public class MyClass01 {
	//필드
	
	//인스턴스 필드
	String name;
	
	//static 필드 (정적 필드)
	static String company;
	
	//생성자: (주로) 인스턴스 필드 초기화
	MyClass01() {
		name = "son";
	}
	
	//static block : 스테틱 필드 초기화
	static {
		//명령문들
		company = "samsung";
	}
}
