package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		// ctrl + 1 : 코드 수정 힌트 얻기
		// ctrl + shift + f : 줄이 안 맞는 경우 줄을 맞춰줌
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
	}
}
