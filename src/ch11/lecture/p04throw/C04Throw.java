package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
	                   //던지는 객체 타입 명시하지 않아도 됨
	public static void method1() {
		throw new RuntimeException();
	}
}
