package ch11.lecture.p02try_catch;

public class C02TryCatch {
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 3;
			
			int c = b / a;
			
			System.out.println(1);
		} catch (ArithmeticException e) {
			//예외가 발생하지 않아 해당 코드 실행되지 않음
			System.out.println(2);
		}
		
		System.out.println("continue...");
	}
}
