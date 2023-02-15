package ch02.lecture.p02type;

public class C07char {
	public static void main(String[] args) {
		// char (문자)
		// 하나의 문자 값 저장
		// 2bytes (16 bits)
		// 0 ~ 65535(unicode)
		
		char c1 = 65261;
		
		System.out.println(c1);
		
		char c2 = 8594;
		
		System.out.println(c2);
		
		char c3 = '\u53f8';
		
		System.out.println(c3);
		
		char c4 = 'a';
		
		System.out.println(c4);
		
		char c5 = '가';
		System.out.println(c5);
		
//		char c6 = 'ab'; // X 하나의 문자만 작성 가능
//		char c7 = ''; // X 비어있는 문자도 안됨
//		' '공백 하나를 포함해서 입력은 가능(유니코드: 32)
	    char c8 = 'b';
	    int d = c8 - c4;
	    System.out.println(d);
	}
}
