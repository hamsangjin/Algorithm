class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int cnt = divisor(i);
            answer += (cnt > limit) ? power : cnt;
        }
            
        return answer;
    }
    
    public static int divisor(int n){
        int temp = 0;
        
        for (int i = 1; i*i <= n; i++){
            if(i*i==n)      temp++;
            else if(n%i==0) temp+=2;
        }
        
        return temp;
    }
}