package ch04.exercise;

public class Example03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// 1~100까지의 정수 중 3의 배수의 총합
//		while (i <= 100) {
//		if (i % 3 == 0) {
//				sum += i;
//			}
			
//			i++;
//		}

		while (i <= 100) {
				sum += i;
	
			i += 3;
		}
		
		System.out.println(sum);
		
	}
}
