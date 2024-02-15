import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0)  answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}