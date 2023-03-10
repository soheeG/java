package ch09.lecture.p01nested;

public class C02NestedClass {

}
	
class MyClass02 {
	class Nested02 {
		
	}
	
	Nested02 ietm = new Nested02();
	
	void method01() {
		Nested02 local = new Nested02();
	}
}