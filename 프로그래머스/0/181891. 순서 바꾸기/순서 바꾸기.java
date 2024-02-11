import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int len = num_list.length;
        int[] answer = new int[len];
        
        for(int i = 0, j = n; j < len; i++, j++){
            answer[i] = num_list[j];
        }
        
        for(int i = len-n, j = 0; j < n; i++, j++){
            answer[i] = num_list[j];
        }

        return answer;
    }
}