package ch14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//동기화 메소드
	public synchronized void setMemory1(int memory) {
		this.memory = memory; //메모리 값 저장
		try {
			Thread.sleep(2000); //2초간 일시 정지
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() 
				+ ":" + this.memory);
		}              //메모리 값 읽기  
	
	//동기화 블록
	public void setMemory2 (int memory) {
		synchronized(this) {
			this.memory = memory; //메모리 값 저장
			try {
				Thread.sleep(2000); //2초간 일시 정지
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() 
					+ ":" + this.memory);
			}              //메모리 값 읽기  
	}
	
}
