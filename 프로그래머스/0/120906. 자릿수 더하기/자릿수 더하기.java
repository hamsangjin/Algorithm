import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = Integer.toString(n).length() - 1; i >= 0; i--){
            answer += n%10;
            n /= 10;
        }
        
        return answer;
    }
}