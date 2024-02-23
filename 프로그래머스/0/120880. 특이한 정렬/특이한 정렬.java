import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[][] list = new int[numlist.length][2];
        
        for(int i = 0; i < numlist.length; i++){
            list[i][0] = Math.abs(n - numlist[i]);
            list[i][1] = numlist[i];
        }
        
        Arrays.sort(list, (o1, o2) -> {
            return o2[1]-o1[1];
        });
        
        Arrays.sort(list, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        
        int[] answer = new int[numlist.length];
        
        for(int i = 0; i < numlist.length; i++){
            answer[i] = list[i][1];
        }
        
        return answer;
    }
}