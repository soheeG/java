package ch11.lecture.p01exception;

public class C06CheckedException {
	public static void main(String[] args) {
		// Exception 일반 예외
		// Exception을 다루는 코드를 작성해야 함
		try {
			//ClassNotFoundException
			Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
