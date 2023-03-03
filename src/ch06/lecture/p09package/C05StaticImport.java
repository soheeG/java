package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

// static import
// : static 멤버(field, method)를 가져올 때 사용
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;
public class C05StaticImport {
	public static void main(String[] args) {
		
//		String n = MyClass05.name;
		String n = name;
		
//		MyClass05.method1();
//		MyClass05.method2();
		
		method1();
		method2();
		
	}
}
