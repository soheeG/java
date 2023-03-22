package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output/output.db");
			
			byte[] array = {0, 20, 30, 40, 50};
			
			os.write(array, 1, 3); //1번 인덱스부터 3개까지만 출력
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
