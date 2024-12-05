import java.io.*;
import java.util.*;

public class Main {
    static int N, idx = 0;
    static List<Integer>[] graph;
    static int[] dfsOrder, pos;
    static boolean[] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // DFS 방문 순서 입력 받기
        dfsOrder = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)     dfsOrder[i] = Integer.parseInt(st.nextToken());


        // 방문 순서가 올바른지 확인
        System.out.println(isValidDFS() ? 1 : 0);
    }

    static boolean isValidDFS() {
        // 시작 정점이 1이 아니면 무효
        if (dfsOrder[0] != 1) return false;

        pos = new int[N + 1];
        for (int i = 0; i < N; i++)     pos[dfsOrder[i]] = i;

        for (int i = 1; i <= N; i++)    graph[i].sort(Comparator.comparingInt(o -> pos[o]));

        // DFS 수행
        ch = new boolean[N + 1];
        return dfs(1);
    }

    static boolean dfs(int x) {
        if (dfsOrder[idx++] != x) return false;

        ch[x] = true;
        for (int nx : graph[x]) {
            if (ch[nx])     continue;

            if (!dfs(nx))   return false;
        }
        return true;
    }
}