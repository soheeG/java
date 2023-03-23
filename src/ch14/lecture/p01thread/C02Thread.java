package ch14.lecture.p01thread;

public class C02Thread {
	public static void main(String[] args) {
		Process01 p1 = new Process01();
		Thread t1 = new Thread(p1);
		//start를 해주면 알아서 적절할 때 run 실행
		//우리가 관여하지 않음
		t1.start();
	}
}

class Process01 implements Runnable {
	@Override
	public void run() {
		System.out.println("업무 진행~~~");
	}
}