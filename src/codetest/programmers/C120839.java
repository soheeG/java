package codetest.programmers;

public class C120839 {
	public String solution(String rsp) {
		char[] rsps = rsp.toCharArray();
        String answer = "";
        
        for (char r : rsps) {
          char w = switch (r) {
                   case '0' -> '5';
                   case '2' -> '0';
                   case '5' -> '2';
                   default -> ' ';
          };
          answer += w;
        } 
        return answer;
        
        //if 문으로 풀이
//       char[] rsps = rsp.toCharArray();
//       String answer = "";
        
//        for (char r : rsps) {
//         if (r == '2') {
//            r = '0';
//        } else if (r == '0') {
//            r = '5';
//        } else {
//            r = '2';
//        } 
//        answer += r;    
//       }
        
//        return answer;
	}

}
