import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int cnt = 0;
        for(int n : arr){
            if(n % divisor == 0){
                temp[cnt++] = n;
            }
        }
        
        if(cnt == 0)    return new int[]{-1};
        
        int[] answer = Arrays.copyOfRange(temp, 0, cnt);
        Arrays.sort(answer);
        
        return answer;
    }
}