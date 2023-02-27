package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10ToCharArray {
	public static void main(String[] args) {
		// String의 toCharArray
		// split 과 비슷한 기능이나 데이터 타입이 다름
		
		String str1 = "hello world!";
		
		String[] arr1 = str1.split("");
		
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = str1.toCharArray();
		
		System.out.println(Arrays.toString(arr2));
	}
}
