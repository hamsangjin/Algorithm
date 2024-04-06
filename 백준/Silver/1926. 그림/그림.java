import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int sum = 0;
    
	public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] paper = new int[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] ch = new int[n][m];
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(paper[i][j] == 1){
                    sum = 0;
                    dfs(i, j, ch, n, m, paper);
                    count ++;
                    max = Math.max(max, sum);
                    
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    public static void dfs(int x, int y, int[][] ch, int n, int m, int[][] paper){
        sum++;
        ch[x][y] = 1;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < m && paper[nx][ny] == 1 && ch[nx][ny] == 0){
                paper[nx][ny] = -1;
                dfs(nx, ny, ch, n, m, paper);
                
            }
        }
    }
}