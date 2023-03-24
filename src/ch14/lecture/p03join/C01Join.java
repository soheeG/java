package ch14.lecture.p03join;

public class C01Join {
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
			System.out.println("스레드 종료");
		});
		
		t.start();
		try {
			t.join(); //t스레드가 끝나길 기다린 후 진행
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("메인 스레드 종료");
	}
}
