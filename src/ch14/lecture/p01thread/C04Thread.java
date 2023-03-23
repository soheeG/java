package ch14.lecture.p01thread;

public class C04Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while (true) {
				System.out.println("##스레드 실행 중 ##");
			}
		});
		
		t1.start();
		
		while (true) {
			System.out.println("@@@@@@@@@@메인스레드 실행 중 @@@@@@@@");
		}
	}
}
