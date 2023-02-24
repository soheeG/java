package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = {9, 8, 7, 1, 2};
		
		for (int n : arr1) {
			System.out.println(n);
		}
		
		System.out.println(arr1); //[I@515f550a 알 수 없는 문자
		//Array.toString 메소드 사용
		//ctrl + shift + o : java.util.Arrays를 import
		System.out.println(Arrays.toString(arr1)); 
		
		String[] arr2 = {"java", "hello", "friday", "sunday"};
		System.out.println(Arrays.toString(arr2));
	}
}
