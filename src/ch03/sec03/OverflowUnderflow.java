package ch03.sec03;

public class OverflowUnderflow {
	public static void main(String[] args) {
		byte var1 = 125;
		for (int i = 0; i < 5; i++) { //{}를 5번 반복 실행
			var1++;					  //++ 연산은 var1의 값을 1 증가 시킨다.
			System.out.println("var1: ", var1);
		}
		
		System.out.println("-------------------------------");
		
		byte var2 = -125;
		for (int i =0; i < 5; i++) {
			var2--;                  //-- 연산은 var1의 값을 1 감소 시킨다.
			System.out.println("var2: " + var2);
		}
	}
}
