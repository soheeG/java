package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대 (Infinity)
		double a = 0.0;
		double b = 3.0;
		double c = b / a; // Infinity 산출
		
		System.out.println(c);
		
		double d = -3.0;
		double e = d / a; // -Infinity 살출
		
		System.out.println(e);
		
		// 실수를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0; // NaN (Not A Number)
		System.out.println(f);
		
		double g = f + 1.0; // NaN에 추가연산을 하여도 결과는 NaN
		System.out.println(g);
		
		// 무한대인지 확인하는 메소드
		boolean isinfinite1 = Double.isInfinite(c);
		System.out.println(isinfinite1); // true 산출
		
		boolean isinfinite2 = Double.isInfinite(3.0);
		System.out.println(isinfinite2); // false 산출
		
		
		// NaN인지 확인하는 메소드
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1); // true 산출
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2); // false 산출
		
	}
}
