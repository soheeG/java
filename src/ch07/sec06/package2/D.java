package ch07.sec06.package2; //다른 패키지

import ch07.sec06.package1.*;

public class D extends A {
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "vaule";  //상속을 통해서만 사용 가능
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
//		A a = new A();
//		a.field = "value";   //직접 객체 생성하여 
//	    a.method();          //사용하는 것은 불가능
	}
}
