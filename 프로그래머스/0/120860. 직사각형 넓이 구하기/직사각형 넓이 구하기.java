class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max_r = dots[0][0], min_r = dots[0][0];
        int max_c = dots[0][1], min_c = dots[0][1];
        
        for(int i = 1; i < dots.length; i++){
            max_r = Math.max(max_r, dots[i][0]);
            min_r = Math.min(min_r, dots[i][0]);
            
            max_c = Math.max(max_c, dots[i][1]);
            min_c = Math.min(min_c, dots[i][1]);
        }
        
        return (max_r - min_r) * (max_c - min_c);
    }
}