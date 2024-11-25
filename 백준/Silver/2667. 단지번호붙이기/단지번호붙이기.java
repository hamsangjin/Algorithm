import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/11724
// 600 - 그래프 1 -> 단지번호 붙이기
// 시간 복잡도: O(N^2 * logN)
public class Main {
    static int N, sum;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i = 0; i < N; i++){
            String[] temp = br.readLine().split("");
            for(int j = 0; j < N; j++)  map[i][j] = Integer.parseInt(temp[j]);
        }

        ch = new boolean[N][N];

        List<Integer> ans = new ArrayList<>();
        // O(N^2)
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 0 || ch[i][j])  continue;
                sum = 0;
                dfs(i, j);
                ans.add(sum);
            }
        }

        // 전체 결과 출력
        System.out.println(ans.size());
        
        // O(N^2 * logN)
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++)     System.out.println(ans.get(i));
    }

    // O(M)
    static void dfs(int x, int y) {
        ch[x][y] = true;
        sum ++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= N || ny < 0 || ny >= N || ch[nx][ny] || map[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
}