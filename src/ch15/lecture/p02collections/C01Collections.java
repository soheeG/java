package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {

	public static void main(String[] args) {
		//수정 불가 리스트
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		//of 로 만들 경우 수정이 불가하여 아래 코드로 수정 가능하게 만들어 줌
		List<String> list2 = new ArrayList<>(list1);
		
		// sort
		Collections.sort(list2);
		System.out.println(list2);
		
		//max
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		//min
		String minStr = Collections.min(list1);
		System.out.println(minStr);
		
		//reverse
		Collections.reverse(list2);
		System.out.println(list2);
		
		//fill 특정 값을 넣어줌
		Collections.fill(list2, "web");
		System.out.println(list2);
		
	}
}
