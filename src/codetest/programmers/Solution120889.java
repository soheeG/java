package codetest.programmers;

import java.util.Arrays;

public class Solution120889 {
	  public int solution(int[] sides) {
		   Arrays.sort(sides);
	       int sum = sides[0] + sides[1];
	       if (sides[2] < sum) {
	            return 1;
	       } else {
	            return 2;
	       }
	       
	       //삼항 연산자 사용
//	       Arrays.sort(sides);
	       
//	       return(sides[0] + sides[1] > side[2]) ? 1 : 2;
	  }
}
