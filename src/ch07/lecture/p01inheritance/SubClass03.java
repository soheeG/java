package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03 {
	
	// method1, method2 상속받음
	
	//상속받은 메소드는 재정의(Override) 가능
	// method2를 변경하여 사용하고 싶다면 재정의 가능함
	public void method2() {
		System.out.println("서브클래스 메소드3");
	}
	
	public void method3( ) {
		System.out.println("서브클래스 메소드3");
	}

}
