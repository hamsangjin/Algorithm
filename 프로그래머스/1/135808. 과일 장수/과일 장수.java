import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int n = score.length;
        
        for(int i = n-m; i >= 0+n%m; i-=m)  answer += score[i]*m;

        return answer;
    }
}