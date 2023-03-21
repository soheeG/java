package ch11.lecture.p02try_catch;

public class C05MutipleException {
	public static void main(String[] args) {
		
		try {
		int[] a = {0, 1, 2};
		
		//ArithmeticException
		//ArrayIndexOutOfBoundsException
		int c = 3 / a[0];
		
		//exception이 여러 개 발생하는 경우
		//catch block 여러 개 사용하면 됨
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
