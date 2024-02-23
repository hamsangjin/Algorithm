class Solution {
    public int solution(int n) {
        
        int answer = 0, cnt = 0;
        
        while(cnt < n){
            
            if(!Integer.toString(answer).contains("3") && answer % 3 != 0){
                cnt ++;
            }
            
            answer++;
        }
        
        return answer-1;
    }
}