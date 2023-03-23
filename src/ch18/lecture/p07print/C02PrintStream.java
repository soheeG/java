package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2txt";
		
		try (
		PrintStream pw = new PrintStream(name);) {
			
			pw.println(99999);
			pw.println(9.9999999);
			pw.println(false);
			
			//바이트 출력 스트림이지만 문자도 출력 가능
			pw.println("hello world");
			pw.println("더 글로리");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
