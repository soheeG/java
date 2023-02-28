package ch06.lecture.p05this;

public class MyClass02 {

	// instance field
	String name;
	
	// instance method
	void printName() {
		String name = "park";
		
		System.out.println(name); // local variable
		System.out.println(this.name); // instance field
	}
	
	void setName(String name) {
		//필드의 name 값을 바꿀 용도로 만들었다면
		//파라미터 name을 필드 name에 할당하기 위해서는 this 사용
		this.name = name;
	}
}
