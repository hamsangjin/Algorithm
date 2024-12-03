import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static List<Integer>[] graph;
    static int[] bfs, pos;
    static boolean[] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        
        graph = new List[N+1];

        for (int i = 1; i <= N; i++)    graph[i] = new ArrayList<>();
        
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        bfs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)     bfs[i] = Integer.parseInt(st.nextToken());

        System.out.println(BFS() ? 1 : 0);
    }

    private static boolean BFS() {
        if(bfs[0] != 1) return false;

        // bfs 방문 순서 저장
        pos = new int[N+1];
        for(int i = 0; i < N; i++) pos[bfs[i]] = i;

        // 방문 순서를 기준으로 정렬
        for (int i = 1; i <= N; i++)    graph[i].sort(Comparator.comparingInt(o -> pos[o]));

        // BFS 수행
        Queue<Integer> q = new LinkedList<>();
        ch = new boolean[N + 1];
        q.add(1);
        ch[1] = true;

        int idx = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            // 현재 방문 순서가 주어진 순서와 다르면 틀린 BFS 순서
            if (bfs[idx++] != v) return false;

            for (int nv : graph[v]) {
                if (ch[nv])     continue;

                ch[nv] = true;
                q.add(nv);
            }
        }

        return true;
    }
}