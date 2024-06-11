import java.util.*;

class Solution {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int n, m;
    static int cnt;
    static String[][] arr;
    public int[] solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        
        n = maps.length;
        m = maps[0].length();
        
        arr = new String[n][m];
        for(int i = 0; i < n; i++){
            String[] temp = maps[i].split("");
            for(int j = 0; j < m; j++){
                arr[i][j] = temp[j];
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                String x = arr[i][j];
                if(!x.equals("X")){
                    cnt = 0;
                    dfs(i, j);
                    answer.add(cnt);
                }
            }
        }
        Collections.sort(answer);
        
        return answer.size() != 0 ? answer.stream().mapToInt(i -> i).toArray() : new int[]{-1};
    }
    
    public void dfs(int r, int c){
        cnt += Integer.parseInt(arr[r][c]);
        arr[r][c] = "X";
        
        for(int i = 0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr >= 0 && nr < n && nc >= 0 && nc < m && !arr[nr][nc].equals("X")){
                dfs(nr, nc);
            }
        }
    }
}