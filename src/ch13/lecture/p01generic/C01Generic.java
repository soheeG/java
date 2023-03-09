package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		//제네릭이 없던 시절
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");
		
		String s1 = null;
		Object o2 = o1.getItem();
		
		if (o2 instanceof String) {
			s1 = (String) o2;
		}
		
		if (s1 != null) {
		System.out.println(s1.length());
		}
	}
}

class MyClass01 {
	// 필드의 타입이 결정되지 않았을 때
	private Object item;
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
}