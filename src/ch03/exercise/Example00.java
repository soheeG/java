package ch03.exercise;

import java.util.Arrays;

public class Example00 {
	public static void main(String[] args) {		
		int[] iArr = {100, 95, 80, 70, 60};
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
	}
}
