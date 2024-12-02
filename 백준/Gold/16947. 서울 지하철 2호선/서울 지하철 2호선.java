import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] dis;
    static boolean isCycle;
    static boolean[] ch;
    static List<Integer>[] graph;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        ch = new boolean[N + 1];
        dis = new int[N + 1];
        Arrays.fill(dis, -1);

        graph = new List[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(0, 1);
        bfs();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++)    sb.append(dis[i]).append(" ");
        System.out.println(sb);
    }

    // O(N+M)
    static void dfs(int prev, int v) {
        ch[v] = true;
        for(int nv : graph[v]) {
            // 이미 방문했으면서 직전 노드가 아닌 경우 -> 사이클
            if(ch[nv] && nv != prev){
                isCycle = true;
                dis[nv] = 0;
                q.add(nv);
                break;
            // 방문하지 않은 경우
            } else if(!ch[nv]){
                // 탐색
                dfs(v, nv);

                // 싸이클 종료된 경우 넘어가기
                if(!isCycle) continue;

                // 사이클 시작지점 도착했으면 종료 플래그 설정
                if(dis[nv] == 0) isCycle = false;
                // 아직 도착하지 않았다면 사이클 노드들 표시
                else{
                    dis[nv] = 0;
                    q.add(nv);
                }
                return;
            }
        }
    }

    // O(N+M)
    static void bfs(){
        int cnt = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int v = q.poll();
                for(int nv : graph[v]) {
                    if(dis[nv] != -1)    continue;
                    dis[nv] = cnt;
                    q.add(nv);
                }
            }
            cnt++;
        }
    }
}