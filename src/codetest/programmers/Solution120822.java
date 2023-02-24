package codetest.programmers;

public class Solution120822 {
	public static void main(String[] args) {
		String str = "jaron";
		
		for (int i = 1; i <= str.length(); i++) {
			System.out.print(str.charAt(str.length() -i));
		}
	}
}
