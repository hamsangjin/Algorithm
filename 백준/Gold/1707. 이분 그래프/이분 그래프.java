import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/1707
// 600 - 그래프 1 -> 이분 그래프
// 시간 복잡도: O(T * (V+E))
public class Main {
    static boolean[] ch;
    static ArrayList<Integer>[] graph;
    static int[] grouped;
    static boolean ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // O(T)
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V + 1];
            ch = new boolean[V + 1];
            grouped = new int[V + 1];
            ans = true;

            for (int i = 1; i <= V; i++)    graph[i] = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph[a].add(b);
                graph[b].add(a);
            }

            // O(V+E)
            for (int i = 1; i <= V; i++) {
                if (!ch[i]) {
                    if (ans)    BFS(i);
                    else        break;
                }
            }

            if (ans)    System.out.println("YES");
            else        System.out.println("NO");
        }
    }

    private static void BFS(int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        ch[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i : graph[x]) {
                // 이미 방문한 노드일 때, group이 같으면 이분 그래프가 아님
                if (ch[i]) {
                    if (grouped[i] == grouped[x]) {
                        ans = false;
                        return;
                    }
                } else {
                    ch[i] = true;
                    grouped[i] = 1 - grouped[x];
                    q.add(i);
                }
            }
        }
    }
}