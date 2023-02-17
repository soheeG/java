package ch03.lecture.p06string;

public class C11Replace {
	public static void main(String[] args) {
		// replace
		// 특정 문자열을 바꿀 때 사용
		// 원본을 바꾸는 것이 아닌 바꾼 값을 출력
		// return type : String
		
		String str1 = "설악산, 백두산, 한라산";
		String str2 = str1.replace("산", "mountain");
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.replace("설악", "지리");
		System.out.println(str3);
	}
}
