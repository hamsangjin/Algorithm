import java.util.*;

class Solution{
    public int solution(String s){
        Stack<String> st = new Stack<>();
        
        for(String str : s.split("")){
            if(st.isEmpty() || !st.peek().equals(str))        st.add(str);
            else if(st.peek().equals(str))                    st.pop();
        }
        
        int ans;
        if(st.isEmpty())        ans = 1;
        else                    ans = 0;
        
        return ans;
    }
}