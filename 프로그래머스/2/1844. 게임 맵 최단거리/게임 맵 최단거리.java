import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // 상 우 하 좌
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] ch = new boolean[n+1][m+1];
        
        Queue<Integer[]> q = new LinkedList<>();
        q.add(new Integer[]{0, 0});
        ch[0][0] = true;
        
        int L = 1;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                Integer[] rc = q.poll();
                int r = rc[0];
                int c = rc[1];
                for(int j = 0; j < 4; j++){
                    int nr = r + dr[j];
                    int nc = c + dc[j];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1 && !ch[nr][nc]){
                        if(nr == n-1 && nc == m-1)  return L+1;
                        q.add(new Integer[]{nr, nc});
                        ch[nr][nc] = true;
                    }
                }
            }
            L++;
        }
        
        return -1;
    }
}