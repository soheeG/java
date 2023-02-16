package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	//백준 1008
	public static void main(String[] args) {
		String input = "1 3";
		
		Scanner scanner = new Scanner(input);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double res = (double) a / b;
		
		System.out.println(res);
		
//		double num1 = scanner.nextDouble();
//		double num2 = scanner.nextDouble();
		
//      System.out.println(num1 / num2);
		
		
	}
}
