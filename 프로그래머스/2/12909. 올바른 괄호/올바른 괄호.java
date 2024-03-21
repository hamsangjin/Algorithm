import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Integer> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(')   st.push(1);
            
            else{
                if(st.isEmpty()) return false;
                else    st.pop();
            }
            
        }

        if(st.isEmpty())    return true;
        else return false;
    }
}