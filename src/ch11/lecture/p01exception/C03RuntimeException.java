package ch11.lecture.p01exception;

public class C03RuntimeException {
	public static void main(String[] args) {
		String a = null;
		
		//NullPointerException
		System.out.println(a.length()); 
		
		System.out.println("continue...");
	}
	
}
