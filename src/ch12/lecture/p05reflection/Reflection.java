package ch12.lecture.p05reflection;

import java.lang.reflect.*;

public class Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;
		
		//이름(full name)
		System.out.println(class1.getName());
		
		//이름(simple)
		System.out.println(class1.getSimpleName());
		
		//패키지 정보 확인
		System.out.println(class1.getPackageName());
		
		//생성자 확인
		Constructor[] constructors = class1.getConstructors();
		
		//필드 확인
		Field[] fields = class1.getFields();
		
		//메소드 확인
		Method[] methods = class1.getMethods();
	}
}
