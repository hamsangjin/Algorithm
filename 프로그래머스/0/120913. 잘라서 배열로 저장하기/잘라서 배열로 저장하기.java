import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1];
        
        char[] list = my_str.toCharArray();
        
        for(int i = 0, j = 0; i < list.length; i+=n, j++){
            answer[j] = (i+n < list.length) ? new String(Arrays.copyOfRange(list, i, i+n)) : new String(Arrays.copyOfRange(list, i, list.length));
        }
        
        return answer;
    }
}