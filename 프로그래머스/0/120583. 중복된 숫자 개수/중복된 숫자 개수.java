class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            answer += (array[i] == n) ? 1 : 0;
        }
        
        return answer;
    }
}