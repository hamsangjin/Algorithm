import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int[] ch = new int[200001];
        int answer = 0, idx = 0;
        
        Arrays.sort(nums);
        
        while(idx < nums.length && answer != nums.length / 2){
            if(ch[nums[idx]] == 0){
                answer += 1;
                ch[nums[idx]] = 1;
            }
            
            idx ++;
        }
        
        return answer;
    }
}