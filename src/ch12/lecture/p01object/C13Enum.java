package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		String a = switch (season) {
		case SPRING, FALL -> "좋은 계절";
		case SUMMER -> "덥다";
		case WINTER -> "춥다";
		//값이 4개로 정해져 있어서 default 생략 가능
//		default -> "잘못입력";
		};
	}
}
