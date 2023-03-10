package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		
//		o1.item = new Number(); // 가능 (추상 클래스이어서 인스턴스화 못함)
		o1.item = new Integer(0); //가능
//		o1.item = new Object() //불가능
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o5 = new MyClass03<Double>();
		
		Number n1 = o4.item;  //가능
		Object o6 = o4.item;  //가능
//		Integer i1 = o4.item; //불가능
	}
}

class MyClass03<T> {
	public T item;
}