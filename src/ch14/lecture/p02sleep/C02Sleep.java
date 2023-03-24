package ch14.lecture.p02sleep;

public class C02Sleep {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		Thread t = new Thread(() -> {
			System.out.println("스레드 시작");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.err.println("스레드 종료");
		});
		t.start();
		
		System.out.println("메인 스레드 종료");
	}
}
