package ch05.lecture.p02Reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6};
		
		int[] arr2 = arr;
		
		System.out.println(arr2[0]); //2
		
		arr = new int[] {2, 4, 6};
		
		System.out.println(arr[0]); //2
		arr[0] = 20;
		System.out.println(arr[0]); //20
		
		System.out.println(arr2[0]); //2
		
	}
}
