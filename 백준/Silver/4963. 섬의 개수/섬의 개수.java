import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/4963
// 600 - 그래프 1 -> 섬의 개수
// 시간 복잡도: O(T * N * M)
public class Main {
    static int N, M, sum;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1 ,-1};
    static int[][] map;
    static boolean[][] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> ans = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            // 입력이 끝났을 경우 (0 0)
            if (N == 0 && M == 0)    break;

            map = new int[N][M];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            ch = new boolean[N][M];
            sum = 0;
            // O(N^2)
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(map[i][j] == 0 || ch[i][j])  continue;
                    dfs(i, j);
                    sum++;
                }
            }
            ans.add(sum);
        }

        for(int num : ans)      System.out.println(num);
    }

    static void dfs(int x, int y) {
        ch[x][y] = true;

        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= N || ny < 0 || ny >= M || ch[nx][ny] || map[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
}