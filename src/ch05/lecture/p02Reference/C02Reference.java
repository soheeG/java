package ch05.lecture.p02Reference;

public class C02Reference {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a = 6;
		
		// a값을 변경하여도 b값에 영향을 미치지 않음
		System.out.println(a); //6
		System.out.println(b); //3
		
		int[] arr1 = {5, 6, 7};
		int[] arr2 = arr1;
		
		System.out.println(arr1[0]); //5
		System.out.println(arr2[0]); //5
		
		arr1[0] = 99;
		
		//같은 값을 참조하고 있기 때문에 영향을 미침
		System.out.println(arr1[0]); //99
		System.out.println(arr2[0]); //99
	}
}
