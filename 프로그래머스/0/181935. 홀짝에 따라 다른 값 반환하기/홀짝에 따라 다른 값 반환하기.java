class Solution {
    public static int get_Square(int n){
        return n*n;
    }
    
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0){
            for(int i = 2; i <= n; i += 2){
                answer += get_Square(i);
            }
        } else{
            for(int i = 1; i <= n; i += 2){
                answer += i;
            }
        }
        
        return answer;
    }
}