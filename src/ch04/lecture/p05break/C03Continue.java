package ch04.lecture.p05break;

public class C03Continue {
	public static void main(String[] args) {
		// continue
		
		while (true) {
			System.out.println("실행문1");
			
			if (true) {
			continue;
			}
			
			System.out.println("실행문2");
		}
	}
}
