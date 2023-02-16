package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b; // 부호를 변경하는 것도 연산이므로 int 타입 사용
		System.out.println("y: " + y);
		
	}
}
