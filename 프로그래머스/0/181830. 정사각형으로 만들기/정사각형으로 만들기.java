import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int r = arr.length, c = arr[0].length;
        int max_len = Math.max(r, c);
        
        int[][] answer = new int[max_len][max_len];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}