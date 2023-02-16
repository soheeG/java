package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		long a = 15_0000_0000;
		long b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		// overflow: 타입이 최대허용값 벗어남
		long c = a + b;// int 타입으로 연산 시 오버플로우 발생
		System.out.println(c);
		
		int d = -15_0000_0000;
		int e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		
		// underflow: 타입의 최소값 벗어남
		long f = (long) d + e; // int 타입으로 연산 시 언더플로우 발생
		System.out.println(f);
	}
}
