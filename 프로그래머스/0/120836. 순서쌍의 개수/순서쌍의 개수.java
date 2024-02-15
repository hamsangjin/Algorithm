class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i <= n/2; i++){
            answer += (n % i == 0) ? 1 : 0;
        }
        return answer;
    }
}