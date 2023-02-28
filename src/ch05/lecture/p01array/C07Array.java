package ch05.lecture.p01array;

public class C07Array {
	public static void main(String[] args) {
		int a = 3;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		System.out.println(a); //6
		System.out.println(b); //3
		
		int[] arr1 = {5, 6, 7};
		int[] arr2;
		arr2 = arr1;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 50;
		 
		//참조 값을 복사했기 때문에 값 변경 시 영향을 받음
		System.out.println(arr1[0]); //50
		System.out.println(arr2[0]); //50
	}
	
}
