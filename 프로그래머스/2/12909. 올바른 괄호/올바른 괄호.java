import java.util.Stack;

class Solution {
    boolean solution(String s) {

        Stack<Integer> st = new Stack<>();
        // Stack<String> st = new Stack<>();
        

        // for(String x : s.split("")){
        for(char c : s.toCharArray()){
            // if(x.equals("("))   st.push("x");
            if(c == '(')   st.push(1);
            
            else{
                try{
                    st.pop();
                } catch(Exception e){
                    return false;
                }
                // if(st.isEmpty()) return false;
                // else    st.pop();
            }
            
        }

        if(st.isEmpty())    return true;
        else return false;
    }
}