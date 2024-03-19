class Solution {
    public int solution(int n) {
        int answer = 0; 
        int fac = 1;
        
        while(n >= fac) {
            fac *= ++answer;
        }
        
        return answer-1;
    }
}