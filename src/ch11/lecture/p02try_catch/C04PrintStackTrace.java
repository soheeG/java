package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		// unchecked exception
		
		try {
		String a = "java";
		System.out.println(a.charAt(4)); //unchecked exception
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//ctrl + 1 -> Surround with try/catch 클릭하면 자동 완성
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
