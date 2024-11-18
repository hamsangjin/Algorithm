import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] ch;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        int maxH = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH, map[i][j]);
            }
        }

        int ans = 0;
        for(int h = 0; h < maxH+1; h++) {
            ch = new boolean[n][n];
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(!ch[i][j] && map[i][j] > h)     cnt += dfs(i, j, h);
                }
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }

    private static int dfs(int x, int y, int height) {
        ch[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx > n-1 || ny > n-1 || ch[nx][ny]) continue;

            if(map[nx][ny] > height)    dfs(nx,ny, height);
        }
        return 1;
    }
}