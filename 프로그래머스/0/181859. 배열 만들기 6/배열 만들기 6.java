import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int num : arr){
            if(stk.empty() || stk.peek() != num){
                stk.push(num);
            } else{
                stk.pop();
            }
        }
        
        return (stk.empty()) ? new int[]{-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}