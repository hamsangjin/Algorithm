import java.util.*;

class Solution {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static int solution(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] ch = new int[n][m];
        q.add(new int[]{0, 0});
        ch[0][0] = 1;

        int answer = 1;
        while (!q.isEmpty()){
            int leng = q.size();
            for(int i = 0; i < leng; i++){
                int[] temp = q.poll();

                for(int j = 0; j < 4; j++){
                    int nr = temp[0] + dr[j];
                    int nc = temp[1] + dc[j];

                    if(nr >= 0 && nc >= 0 && nr < n && nc < m && maps[nr][nc] == 1 && ch[nr][nc] == 0){
                        ch[nr][nc] = 1;
                        if(nr == n-1 && nc == m-1)  return answer+1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            answer++;
        }
        return -1;
    }
}