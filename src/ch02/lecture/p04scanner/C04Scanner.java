package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = " 3 33 555 50";
		Scanner scanner = new Scanner(input);
		
		int num1 = scanner.nextInt();
		System.out.println(num1); // 3 출력
		int num2 = scanner.nextInt();
		System.out.println(num2); // 33 출력
		int num3 = scanner.nextInt();
		System.out.println(num3); // 555 출력
		int num4 = scanner.nextInt();
		System.out.println(num4); // 50 출력
		
		System.out.println(num3 + num4); // 605 출력
		
	}
}
