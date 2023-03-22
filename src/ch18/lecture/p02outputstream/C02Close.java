package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		//finally block에서도 사용할 수 있게 try block 밖에서 선언
		OutputStream os = null;
		try {
		//스트림 열고	
		os = new FileOutputStream("output/output.txt");
		
		//어떤 작업
		os.write(1);
		
		os.flush();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close(); //꼭 해야함
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
