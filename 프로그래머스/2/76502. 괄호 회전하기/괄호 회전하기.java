import java.util.*;

class Solution {
    Stack<String> st = new Stack<>();
    
    public int solution(String s) {
        String ns = s;
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            st.clear();
            ns = shift(ns);
            for(String x : ns.split("")){
                check(x, "(", ")");
                check(x, "[", "]");
                check(x, "{", "}");
            }
            
            if(st.isEmpty()) answer++;
        }
        return answer;
    }
    
    public String shift(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        return sb.toString();
    }
    
    public void check(String target, String c1, String c2){
        if(target.equals(c2) && !st.isEmpty() && st.peek().equals(c1)){
            st.pop();
        } else if(target.equals(c1) || target.equals(c2)){
            st.push(target);
        }
    }
}