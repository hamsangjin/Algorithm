import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<String> st = new Stack<>();
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            String ns = shift(s, i);
            st.clear();
            for(String x : ns.split("")){
                if(x.equals(")") && !st.isEmpty() && st.peek().equals("(")){
                    st.pop();
                } else if(x.equals("]") && !st.isEmpty() && st.peek().equals("[")){
                    st.pop();
                } else if(x.equals("}") && !st.isEmpty() && st.peek().equals("{")){
                    st.pop();
                } else{
                    st.push(x);
                }
            }
            
            
            if(st.size() == 0) answer++;
        }
        return answer;
    }
    
    public String shift(String s, int i){
        String ns = "";
        ns += s.substring(i, s.length());
        ns += s.substring(0, i);
        return ns;
    }
}