package codetest.programmers;

public class Solution120833 {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = {};
        
        for (int i = num1; i <= num2; i++) {
            answer[i] = numbers[i];
        }
        
        return answer;
        
//        int len = num2 - num1 + 1;
//       int[] answer = new int[len];
        
//        for (int i = 0; i <= num2; i++) {
//        	answer[i - num1] = numbers[i];
//        }
//        return answer;
	}
}
