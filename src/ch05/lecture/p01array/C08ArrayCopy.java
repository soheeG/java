package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
//		arr1[3] = 9; // 실행중 오류(runtime exception);
		
		System.out.println("다음 실행 흐름...");
		
		int[] arr2 = {10, 20, 30};
		int[] arr3;
		arr3 = new int[arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr3[0]);
		System.out.println(arr2[1]);
		System.out.println(arr3[2]);
		
		arr2[0] = 100;
		
		//값 자체를 복사해서 값을 변경해도 영향을 받지 않음
		System.out.println(arr2[0]); //100
		System.out.println(arr3[0]); //10
	}
}
