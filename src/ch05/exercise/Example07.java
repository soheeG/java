package ch05.exercise;

public class Example07 {
	public static void main(String[] args) {
		// 최대값 구하기
//		int[] array = {1, 5, 3, 8, 2};
		
//		int max = array[0];
	
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];
//			}
//		} 
		
//		System.out.println(max);
		
		
		// 음수에서 최대값 구하기
		int max = Integer.MIN_VALUE;
		
		int[] array = {-1, -5, -3, -8, -2};
		
		max = array[0];
	
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		} 
		
		System.out.println(max);
	}
}
