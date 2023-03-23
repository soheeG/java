package ch14.exercise.exam02;

public class MusicRunnable extends Thread{
	@Override
	public void run() {
		System.out.println("음악을 재생합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
}
