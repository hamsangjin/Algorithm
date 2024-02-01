class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries){
            int s = query[0], e = query[1], k = query[2];
            for(int j = s; j <= e; j++){
                arr[j] += (j % k == 0) ? 1 : 0;
            }
        }
        return arr;
    }
}