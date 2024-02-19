import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int cnt = 1;
        
        for(int i = 0; i < emergency.length; i++){
            cnt = 1;
            
            for(int j = 0; j < emergency.length; j++){
                if(i != j && emergency[i] < emergency[j]){
                    cnt += 1;
                }
            }
            
            answer[i] = cnt;
        }
        
        return answer;
    }
}