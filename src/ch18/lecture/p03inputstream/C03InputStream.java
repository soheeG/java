package ch18.lecture.p03inputstream;

import java.io.*;

public class C03InputStream {
	public static void main(String[] args) {
		String name = "output/output1.txt";
		try (var is = new FileInputStream(name)) {
			
			byte[] arr = new byte[5];
			
			int len1 = is.read(arr);
			int len2 = is.read(arr);
			int len3 = is.read(arr);
			int len4 = is.read(arr);
			
			System.out.println(len1);
			System.out.println(len2);
			System.out.println(len1);
			System.out.println(len1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
