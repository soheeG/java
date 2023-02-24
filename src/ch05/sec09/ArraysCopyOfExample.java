package ch05.sec09;

import java.util.Arrays;

public class ArraysCopyOfExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		//배열 항목 복사
		 String[] newStrArray = Arrays.copyOf(oldStrArray, 5);
		//배열 항목 출력
		for (int i =0; i < newStrArray.length; i++) {
		System.out.println(newStrArray[i] + ", ");
		}
	}
}
