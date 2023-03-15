package ch15.exercise.exam8;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(3, "조민우"));
		
		System.out.println("저장된 객체 수: " + set.size());
		for (Student s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}
	}
}
