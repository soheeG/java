package ch11.lecture.p01exception;

public class C02RuntimeException {
	public static void main(String[] args) {
		// Runtime Exception
		int a = 0;
		int b = 3;
		
		//ArithmeticException
		int c = b / a; //0으로 나누려고 하여 발생
		
		System.out.println("실행 흐름 이어감");
	}
}
