package ch04.exercise;

public class Example04_1 {
	public static void main(String[] args) {
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d, %d)%n", num1, num2);
			
			int res = num1 + num2;
			
			if (res == 5) {
				break;
			}
			
		}
	}
}
