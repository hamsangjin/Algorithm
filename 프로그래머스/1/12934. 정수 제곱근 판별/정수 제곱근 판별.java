class Solution {
    public long solution(long n) {
        long answer = -1;
        
        for(long i = 1; i <= (long)Math.sqrt((double)n) + 1; i++){
            if((i*i) == n)    return (long)Math.pow(i + 1, 2);
        }
        
        return answer;
    }
}