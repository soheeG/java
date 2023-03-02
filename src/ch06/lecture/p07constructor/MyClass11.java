package ch06.lecture.p07constructor;

public class MyClass11 {
	final String name = "son";
	final int age; //생성자에서 값 할당해야 함
	
	//final 필드의 값을 생성자에서 줄 수 있음
	MyClass11() {
		this(99);
	}
	
	MyClass11(int age) {
		this.age = age;
	}
	
}
