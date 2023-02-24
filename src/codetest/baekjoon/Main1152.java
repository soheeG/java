package codetest.baekjoon;

import java.util.Scanner;

public class Main1152 {
	public static void main(String[] args) {
		String input1 = "The Curious Case of Benjamin Button";
		
		Scanner scanner = new Scanner(input1);
		
		String line = scanner.nextLine();
		
		String[] arr = line.split(" ");
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
		if (!arr[i].equals("")) {
			answer++;
		  }
		}
		System.out.println(answer);
	
	}
}
