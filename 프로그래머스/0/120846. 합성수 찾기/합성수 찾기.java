class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;
        for(int i = 1; i <= n; i++){
            temp = 0;
            
            for(int j = 1; j <= i; j++){
                if(i % j == 0)  temp += 1;
            }
            
            if(temp >= 3)   answer += 1;
        }
        
        return answer;
    }
}