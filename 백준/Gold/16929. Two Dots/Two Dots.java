import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] ch;
    static char[][] board;
    static int curX, curY;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ch = new boolean[N][M];
        board = new char[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++)      board[i][j] = line.charAt(j);
        }

        // O(N*M)
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                ch = new boolean[N][M];
                ch[i][j] = true;

                curX = i;
                curY = j;

                // O(N*M)
                dfs(i, j, board[i][j],1);
            }
        }

        System.out.println("No");
    }

    static void dfs(int x, int y, char dot, int count) {
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= N || ny < 0 || ny >= M || board[nx][ny] != dot) continue;

            if(!ch[nx][ny]) {
                ch[nx][ny] = true;
                dfs(nx, ny, dot, count+1);
            } else{
                // 방문한 곳을 또 방문한 경우에 처음 지점이 아닌 경우엔 사이클이 아님
                if(count >= 4 && nx == curX && ny == curY) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
    }
}