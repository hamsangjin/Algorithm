import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(st.empty())  st.push(arr[i]);
            else if(st.get(st.size()-1) != arr[i])  st.push(arr[i]);
        }
        
        return st.stream().mapToInt(i -> i).toArray();
    }
}