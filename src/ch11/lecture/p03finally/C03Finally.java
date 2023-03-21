package ch11.lecture.p03finally;

public class C03Finally {
public static void main(String[] args) {
	try {
		boolean a = true;
		if (a) {
			return;
		}
	
	//catch block이 없어도 사용 가능
	} finally {
		System.out.println("finally block");
	}
}
}
