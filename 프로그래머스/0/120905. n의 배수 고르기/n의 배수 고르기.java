import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : numlist){
            if(num % n == 0) answer.add(num);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}