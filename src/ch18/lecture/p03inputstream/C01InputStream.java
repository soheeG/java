package ch18.lecture.p03inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		// InputStream
		// byte 단위 입력 스트림
		// 주요 메소도 : read
		
		String name = "output/output1.txt"; //1bytes 크기 파일
		try (InputStream is = new FileInputStream(name)) {
			// read : 한 바이트 읽기
			System.out.println(is.read());
			System.out.println(is.read()); //끝에 도달하면 -1 출력
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
