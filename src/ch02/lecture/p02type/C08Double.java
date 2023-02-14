package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		// 실수
		// float(4bytes) , double(8 bytes)
		
		int i1 = 3;
//		i1 = 3.14; // X
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		d1 = 99;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현
		f1 = 3; // 정수라서 오류 안남
	    
		// 사용 시 주의
		// 10진법 -> 2진법으로 바꿔서 저장하기 때문에 
		//
		double d2 = 0.1;
		double d3 = 0.2;
		
		double d4 = d2 + d3;
		System.out.println(d4); // 연산결과가 예상과 다를 수 있음
	}
}
