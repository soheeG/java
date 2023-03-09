package ch12.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		//auto boxing
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14F;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		
		Object o1 = b;
		Object o2 = bool;
		//참조 변수에 담지 않고 바로 
		Object o3 = true;
	}
}
