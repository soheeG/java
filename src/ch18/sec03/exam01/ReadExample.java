package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
//		try (InputStream is = new FileInputStream("output/output1.txt");)
		try {
			//데이터 출발지를 test1.db로 하는 입력 스트림 생성
			InputStream is = new FileInputStream("output/output1.txt");
			
			while (true) {
				int data = is.read(); //1byte씩 읽기
				if(data == -1) break; // 파일 끝에 도달했을 경우
				System.out.println(data);
			}
			//입력 스트림을 닫고 사용 메모리 해제
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
