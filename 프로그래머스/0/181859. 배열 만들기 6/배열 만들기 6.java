import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.empty() || stk.peek() != arr[i]){
                stk.push(arr[i]);
            } else{
                stk.pop();
            }
        }
        
        return (stk.empty()) ? new int[]{-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}