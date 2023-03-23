package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		//바이트 단위 출력 스트림이지만 영어는 1byte로 
		//출력 가능하여 사용 가능하지만
		osw.write('a');
		osw.write('b');
		//한글은 불가능
		//그래서 OutputStreamWriter를 사용하여 변환해주면
		//사용 가능함
		osw.write('한');
		
		
		osw.close();
	}
	
	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
