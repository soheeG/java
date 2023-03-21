package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
			//여러 exception 발생
		
		/* } catch (RuntimeException e) {
			//아래 catch block의 exception 보다
			//상위 타입의 exception catch block을 먼저 작성할 수 없음
			e.printStackTrace();
		*/
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
