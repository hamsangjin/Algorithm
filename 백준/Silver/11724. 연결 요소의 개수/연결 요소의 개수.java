import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/11724
// 600 - 그래프 1 -> 연결 요소의 개수
// 시간 복잡도: O(N+M)
public class Main {
    static int N, M, ans;
    static List<Integer>[] graph;
    static boolean[] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new List[N+1];
        for(int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        ch = new boolean[N+1];
        // O(N)
        for(int i = 1; i <= N; i++){
            if(ch[i]) continue;

            ch[i] = true;
            dfs(i);
            ans++;
        }

        // 전체 결과 출력
        System.out.println(ans);
    }


    // O(M)
    static void dfs(int v) {
        ch[v] = true;
        for (int nv : graph[v]) {
            if (!ch[nv])    dfs(nv);
        }
    }
}