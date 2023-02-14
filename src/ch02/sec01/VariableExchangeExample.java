package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
	}
}
