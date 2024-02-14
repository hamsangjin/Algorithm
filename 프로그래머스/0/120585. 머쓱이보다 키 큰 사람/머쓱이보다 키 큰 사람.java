import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        
        Arrays.sort(array);
        int answer = 0;
        
        for(int i = array.length -1; i >= 0; i--){
            answer += (array[i] > height) ? 1 : 0;
        }
        
        return answer;
    }
}