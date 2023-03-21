package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = {0, 1};
		    //ArithmeticException
			//ArrayIndexOutOfBoundException
			int c = 3 / a[0];
			
			//상위 타입으로 한번에 작성해도 됨
		} catch (RuntimeException e)  {
			e.printStackTrace();
		}
		
		System.out.println("continue");
	}
}
