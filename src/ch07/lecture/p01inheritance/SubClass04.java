package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04 {

	// SuperClass04 method1 재정의
	@Override // 재정의 메소드인지 컴파일러가 검증
	public void method1() {
		System.out.println("sub method1");
	}
}
