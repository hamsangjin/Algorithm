import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            answer[0]++;
            
            int beforeLen = s.length();
            s = s.replaceAll("0", "");
            int afterLen = s.length();
            
            answer[1] += beforeLen - afterLen;
            
            s = Integer.toBinaryString(afterLen);
        }
        
        return answer;
        
    }
}