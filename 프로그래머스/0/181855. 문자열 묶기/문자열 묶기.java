class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        
        for(String str : strArr){
            answer[str.length()] ++;
        }
        
        int max_len = 0;
        for(int i = 1; i < 31; i++){
            max_len = Math.max(answer[i], max_len);
        }
        
        return max_len;
    }
}