import java.util.*;

class Solution {
    static int ans;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, target, numbers);
        
        return ans;
    }
    
    public void dfs(int depth, int sum, int target, int[] numbers){
        if(depth == numbers.length){
            if(target == sum)   ans++;
        } else{
            dfs(depth + 1, sum + numbers[depth], target, numbers);
            dfs(depth + 1, sum - numbers[depth], target, numbers);
        }
    }
}