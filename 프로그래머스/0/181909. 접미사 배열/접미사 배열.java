import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}