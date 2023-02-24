package ch04.lecture.p04for;

public class C03For {
	public static void main(String[] args) {
		// 초기화식과 증감 식 여러개 올 수 있음
		for (int i = 0, j = 10; i < 5; i++, j++) {
			System.out.printf("%d, %d%n", i, j);
		}
	}
}
