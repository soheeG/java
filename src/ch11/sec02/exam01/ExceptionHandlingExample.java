package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	public static void printLength(String data) {
		//data가 null일 경우 NullPointerException 발생
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null); //매개값으로 null을 대입
		System.out.println("[프로그램 종료]");
	}
}
