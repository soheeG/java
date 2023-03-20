package ch17.exercise.exam07;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);
		
		List<Member> developers = new ArrayList<>();
		
		for (Member member : list) {
			if (member.getJob().equals("개발자")) {
				developers.add(member);
			}
		}
		
		for (Member member : developers) {
			System.out.println(member.getName());
		}
	}
}
