package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		//string (참조 타입)
		// 문자열을 저장
		// 로그인확인
		String s1;
		s1 = "hello world";
		
		s1 = "h";
		
//		char = s1; // X
		
		s1 = "";
		
		char c1 = '가';
		
//		s1 = c1; // X
		
		String s2 = "i am \"ironman\""; 
		//큰 따옴표는 역슬래시(\)사용
		System.out.println(s2);
		
		String s3 = "i \\";
		// 역슬래시 쓰고 싶을때 역슬래시 앞에 도 역슬래시 사용
		
		String s4 = "i am \n ironman.";
		// 출력 시 줄 바꿈
		System.out.println(s4);
		
		String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>";
		System.out.println(s5);
		
		// text block
		// 첫번째 엔터 무시
		// 가장 작은 들여쓴 줄이 들여쓰기 기준
		String s6 = """
				<h1>
					hello
					<span>world</span>
				</h1>""";
		System.out.println(s6);
	}
}
