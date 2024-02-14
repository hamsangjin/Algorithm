class Solution {
    public int[] solution(int[] arr, int k) {
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (k % 2 == 1) ? arr[i] * k : arr[i] + k;
        }
        
        return arr;
    }
}