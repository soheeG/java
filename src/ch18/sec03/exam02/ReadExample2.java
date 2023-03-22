package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		
		try (var is = new FileInputStream("output/output1.txt")) {
			byte[] data = new byte[5];
			
			//배열을 1로 채우는 코드
			Arrays.fill(data, (byte) 1);
			
			System.out.println(Arrays.toString(data));
			is.read(data);
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
