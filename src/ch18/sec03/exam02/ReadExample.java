package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			//데이터 출발지를 output1.txt로 하는 입력 스트림 생성
			InputStream is = new FileInputStream("ouput/output1.txt");
			
			byte[] data = new byte[100];
			
			while (true) {
				//최대 100bytes를 읽고 읽은 바이트는 data 저장, 읽은 수는 리턴
				int num = is.read(data);
				//파일 끝에 도달했을 경우
				if (num == -1) break;
				
				//읽은 바이트를 출력
				for (int i = 0; i <num; i++) {
					System.out.println(data[i]);
				}
			}
			//배열의 모든 바이트를 출력
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
