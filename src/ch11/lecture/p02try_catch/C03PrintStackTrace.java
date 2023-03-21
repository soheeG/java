package ch11.lecture.p02try_catch;

public class C03PrintStackTrace {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 3;
			
			int c = b / a;
			
			System.out.println("try block continue...");
		} catch (ArithmeticException e) {
			//catch block
			//예외가 발생했다는 흔적을 남겨줘야 함
			//직접 남길 수도 있겠지만...
			//System.out.println("예외 발생!!!");
			e.printStackTrace(); //흔적 남기기
			//나중에 돌아와서 고칠 수 있도록
			//안그러면 문제가 없는 코드처럼 보여져서 찾기 힘듦
		}
		
		System.out.println("program continue...");
	}
}
