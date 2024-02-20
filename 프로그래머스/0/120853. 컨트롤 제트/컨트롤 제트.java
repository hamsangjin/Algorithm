import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<String> st = new Stack<>();
        int answer = 0;
        
        for(String str : s.split(" ")){
            if(!str.equals("Z")){
                st.push(str);
                answer += Integer.parseInt(str);
            } else{
                answer -= Integer.parseInt(st.pop());
            }
        }
        
        return answer;
    }
}