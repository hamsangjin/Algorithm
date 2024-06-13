class Solution {
    public int[][] solution(int n) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int[][] answer = new int[n][n];
        
        int r = 0, c = 0;
        int d = 1, num = 1;
        
        while(n*n > num){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(nr < 0 || nc < 0 || nr >= n || nc >= n || answer[nr][nc] != 0){
                d = (d+1) % 4;
                continue;
            }
            
            answer[r][c] = num++;
            r = nr;
            c = nc;
        }
        
        answer[r][c] = num;
        return answer;
    }
}