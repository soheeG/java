package ch12.lecture.p01object;

import java.util.*;

public class C23HascCodeEquals {
	public static void main(String[] args) {
		// Set : 중복 없는 원소들의 모임 (Collection)
		Set set = new HashSet();
		
		System.out.println(set.size());
		
		set.add(100);
		
		System.out.println(set.size());  //1
		
		set.add(200);
		
		System.out.println(set.size()); //2
		
		set.add(100);
		//add 는 존재하지 않으면 추가하기 때문에
		//100은 이미 존재하므로 size는 그대로2
		
		System.out.println(set.size()); //2
	}
}
