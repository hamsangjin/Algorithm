class Solution {
    public int solution(int n) {
        
        int answer = 0;
        int fac = 1;
        
        for(int i = 1; i <= 10; i++){
            fac = 1;
            
            for(int j = 1; j <= i; j++){
                fac *= j;
            }
            
            if(fac == n){
                answer = i;
                break;
            } else if(fac > n){
                answer = i-1;
                break;
            }
        }
        
        return answer;
    }
}