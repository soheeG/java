package ch14.lecture.p02sleep;

public class C01Sleep {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
	}
}
