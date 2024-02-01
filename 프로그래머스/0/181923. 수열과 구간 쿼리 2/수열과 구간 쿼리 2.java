import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        
        for(int i = 0; i < queries.length; i++){
            
            int[] q = queries[i];
            int s = q[0], e = q[1], k = q[2];
            
            for(int j = s; j <= e; j++){
                if (arr[j] > k){
                    answer[i] = (answer[i] == -1) ? arr[j] : Math.min(answer[i], arr[j]);
                }
            }
        }
        return answer;
    }
}