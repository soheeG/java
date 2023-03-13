package ch16.lecture.p02lamde;

public class C03Lamda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			@Override
			public void method(int a) {
				System.out.println("익명클래스로 재정의");
				System.out.println("받은 값: " + a);
			}
		};
		
		o1.method(9);
		
		MyInterface03 o2 = (int a) -> {
			System.out.println("람다로 재정의");
			System.out.println("받은 값: " + a);
		};
		
		o2.method(10);
		
		MyInterface03 o3 = (a) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값: " + a);
		};
		
		o3.method(20);
		
		MyInterface03 o4 = a -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + a);
		};
		
		o4.method(30);
		
		MyInterface03 o5 = x ->{
			System.out.println("파라미터명 정의");
			System.out.println("받은 값: " + x);
		};
		
		o5.method(40);
	}
}

interface MyInterface03 {
	void method(int a);
}