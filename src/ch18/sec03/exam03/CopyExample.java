package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "output/bread.jpg";
		String targetFileName = "output/bread_copy3.jpg";
		
		//입출력 스트림 생성
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		//읽은 바이트를 저장할 배열 생성
		byte[] data = new byte[1024];
		while(true) {
			//최대 1024바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
			int num = is.read(data);
			//파일을 다 읽으면 while문 종료
			if(num == 1) break;
			//읽은 바이트 수만큼 출력
			os.write(data, 0, num);
		}
		
		//내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
