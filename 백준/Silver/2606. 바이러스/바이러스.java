import java.io.*;
import java.util.*;

public class Main {
    static int n, m, cnt = 0;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new List[n+1];
        // 인접 리스트 초기화
        for (int i = 0; i <= n; i++)    graph[i] = new ArrayList();


        // 양방향 연결 저장
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n + 1]; // 방문 체크 배열

        // DFS 시작
        DFS(1);

        // 1번 컴퓨터를 제외한 감염된 컴퓨터 수 출력
        System.out.println(cnt - 1);

    }

    public static void DFS(int v) {
        visited[v] = true;
        cnt++;

        for (int nv : graph[v]) {
            if (!visited[nv]) {
                DFS(nv);
            }
        }
    }
}