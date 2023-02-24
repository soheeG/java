package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while (run) {
		System.out.println("--------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("--------------------------");
		System.out.println("선택> ");
		
		String menu = scanner.nextLine();
		
//			if (menu.equals("1")) {
//				System.out.println("예금액> 10000 ");
//			} else if (menu.equals("2")) {
//				System.out.println("출금액> 20000 ");
//			} else if (menu.equals("3"))
//				System.out.println("잔고> 8000");
			
			switch (menu) {
			case "1" -> {
				System.out.println("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			}
			case "2" -> {
				System.out.println("출금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			}
			case "3" -> {
				System.out.println("잔고>" + balance);
			
			}
			case "4" -> {
				run = false;
			}
			
			}
			 
		}
		System.out.println("프로그램 종료");
	}
}
