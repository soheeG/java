package ch12.lecture.p01object;

public class C06ToString {
	Object o1 = new MyClass05();
	Object o2 = new MyClass05();
}

class MyClass06 {
	private String name;
	private int age;
	
	MyClass06(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "나이는 " + age + "살 이고 이름은 " + name + "입니다.";
	}
}