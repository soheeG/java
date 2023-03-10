package ch13.lecture.p02wildcard;

public class C02WildCard {
	public static void main(String[] args) {
		//프로그램 기준으로 값이 나갈 때(out) 는 super
		MyClass02<? super String> o1 = new MyClass02<String>(); //String의 상위 타입이기만 하면 된다는 뜻
		o1.item = new String(); //String 또는 그 하위 타입 대입 가능
		
//		String s1 = o1.item; //String에 할당 불가(꺼낼 수 없음)
		
		//프로그램 기준으로 값이 들어올 때(in) 는 extends
		MyClass02<? extends String> o2 = new MyClass02<String>(); //String의 하위 타입이라고 명시
		String s2 = o2.item;
	}
}

class MyClass02<T> {
	public T item;
}