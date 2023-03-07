package ch07.sec06.package1;

public class B {
	//메소드 선언
	public void method() {
		A a = new A();      //가능
		a.field = "vaule";  //가능
		a.method();         //가능
		
	}
}
