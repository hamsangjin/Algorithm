import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("3", "6", "9"));
        
        for(String str : Integer.toString(order).split("")){
            if(arr.contains(str))   answer += 1;
        }
        
        return answer;
    }
}