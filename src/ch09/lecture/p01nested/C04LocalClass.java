package ch09.lecture.p01nested;

public class C04LocalClass {

	void method1() {
		// 로컬 클래스 (local class)
		// 선언된 메소드 내에서만 사용 가능
		// 굳이 타입을 선언하여 만들지 않고 내부에서만 사용 후 버릴 때 사용
		class LocalClass1{
			
		}
		
		LocalClass1 o1 = new LocalClass1();
	}
	
	void method2() {
//		LocalClass1 o1 = new LocalClass1(); //불가능
	}
}
