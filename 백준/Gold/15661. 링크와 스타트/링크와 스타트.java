import java.io.*;
import java.util.*;

public class Main {
    static int N, ans = Integer.MAX_VALUE;
    static int[][] graph;
    static boolean[] ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ch = new boolean[N];
        dfs(0, 0);

        System.out.println(ans);
    }

    public static void dfs(int idx, int cnt) {
        // 각 팀이 한 명 이상 선택되었을 때 차이를 계산
        if (cnt >= 1 && cnt <= N - 1) {
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (ch[i] && ch[j])     sum1 += graph[i][j];
                    if (!ch[i] && !ch[j])   sum2 += graph[i][j];
                }
            }

            ans = Math.min(ans, Math.abs(sum1 - sum2));
        }

        for (int i = idx; i < N; i++) {
            if (ch[i]) continue;

            ch[i] = true;
            dfs(i + 1, cnt + 1);
            ch[i] = false;

            if (ans == 0) return;
        }
    }
}