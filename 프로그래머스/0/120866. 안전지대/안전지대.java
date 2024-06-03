import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
        
        int n = board.length;
        int answer = n*n;
        int cnt = 0;
        
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                if(board[r][c] == 1){
                    cnt ++;
                    for(int i = 0; i < 8; i++){
                        int nr = r + dr[i];
                        int nc = c + dc[i];
                        if(nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == 0){
                            cnt ++;
                            board[nr][nc] = 2;
                        }
                    }
                }
                
            }
        }
        return answer-cnt;
    }
}