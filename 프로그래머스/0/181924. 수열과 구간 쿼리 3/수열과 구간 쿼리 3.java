import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++){
            int q1 = queries[i][0], q2 = queries[i][1];
            int num1 = arr[queries[i][0]], num2 = arr[queries[i][1]];
            arr[q1] = num2; arr[q2] = num1;
        }
        
        return arr;
    }
}