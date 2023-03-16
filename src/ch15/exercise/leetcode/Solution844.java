package ch15.exercise.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        
        //첫번째 문자열 s의 각 문자를 stack1에 push
        for (int i = 0; i < s.length(); i++ ) {
        	char c = s.charAt(i);
        	
        	switch (c) {
        	case '#' -> {
        		if (!stack1.isEmpty()) {
        			stack1.pop();
        		}
        	}
        	default -> {
        		stack1.push(c);
        	}
          }
        }
	
		//두번째 문자열 t의 각 문자를 stack2에 push
        for (int i = 0; i < t.length(); i++ ) {
        	char c = t.charAt(i);
        	
        	switch (c) {
        	case '#' -> {
        		if (!stack2.isEmpty()) {
        			stack2.pop();
        		}
        	}
        	default -> {
        		stack2.push(c);
        	}
        	}
        }
        
        //stack1 과 stack2 비교
//      while (!stack1.isEmpty() && !stack2.isEmpty()) {
        while (stack1.size() > 0 && stack2.size() > 0 ) {
        	char c1 = stack1.pop();
        	char c2 = stack2.pop();
        	
        	if (c1 != c2) {
        		return false;
        	}
        }
        
        return stack1.size() == stack2.size();
    }
}
