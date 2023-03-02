package ch06.lecture.p09package;

import java.util.Scanner;

//import를 생략할 수 있는 조건
//1. java.lang 패키지 내 클래스 생략 가능
//2. 같은 패키지의 클래스는 생략 가능
import java.lang.String; //생략 가능
import ch06.lecture.p09package.MyClass03; //생략 가능

public class C03Import {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = new String("hello");
		String str2 = "world";
		
		MyClass03 o1 = new MyClass03();
	}
}
