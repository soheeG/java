package ch08.lecture.p02abstract_method;

//구현클래스(구체클래스, concrete class)
public class MyClass01 implements MyInterface01 {
	//추상 메소드를 가지고 있는 인터페이스를 구현했기 때문에
	//추상 메소드 구현 필요
	
	@Override
	public void method1() {
		System.out.println("구현된 메소드");	
	}
	
	public void method2() {
		System.out.println("추가된 메소드");
	}
}
