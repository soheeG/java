package ch08.lecture.p05cast;

public class C01Cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass011();
//		o1.method1();  //불가능
		
		//강제 형변환
		//프로그램을 종료시킬 수 있기 때문에 안전하게 사용 필요
		MyClass011 o2 = (MyClass011) o1;
		o2.method1();
	}
}
