class Solution {
    public int solution(int n, int m, int[] section) {
        int r = section[0];
        int answer = 1;
            
        for(int i : section){
            if(r + m - 1 < i){
                r = i;
                answer++;
            }
        }
        
        return answer;
    }
}