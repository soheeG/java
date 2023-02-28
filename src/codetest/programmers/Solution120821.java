package codetest.programmers;

public class Solution120821 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
        
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[i] = num_list[i];
        }
        return answer;
        
        
//        int len = num_list.length;
        
//        int[] answer = new int[len];
        
//        for (int i = 0; i < len; i++) {
//        	answer[len - i - 1] = num_list[i];
//        }
//		return answer;
	}
}
