package ch15.exercise.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
		for (int n : nums) {
			map.putIfAbsent(n, 0);
			int oldValue = map.get(n);
			map.replace(n, oldValue + 1);
		}
		
		int sum = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			
			if (value == 1 ) {
				sum += entry.getKey();
			}
		}
		
		return sum;
    }
}
