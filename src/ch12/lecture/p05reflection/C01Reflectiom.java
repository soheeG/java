package ch12.lecture.p05reflection;

public class C01Reflectiom {
	public static void main(String[] args) throws Exception {
		// reflection
		// 클래스에 관한 정보
		
		// 클래스 정보를 가진 객체 생성
		// 1) 클래스의 .class 속성 얻기
		Class class1 = String.class;
		// 2) forName static method로 얻기
		Class class2 = (Class<String>)Class.forName("java.lang.String");
		
		// 3) 객체로 부터 얻기
		String s1 = "java";
		Class<String> class3 = (Class<String>)s1.getClass();
		
		System.out.println(System.identityHashCode(class1));
		System.out.println(System.identityHashCode(class2));
		System.out.println(System.identityHashCode(class3));
	}
}
