import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    static int n;
    static class Node {
        int idx, cost;

        Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

            // a에서 b로 가는 비용 저장
            for (int i = 0; i < m; i++) {
                String[] temp = br.readLine().split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                int cost = Integer.parseInt(temp[2]);
                graph.get(a).add(new Node(b, cost));
            }

            // 시작, 도착 지점
            String[] se = br.readLine().split(" ");
            int s = Integer.parseInt(se[0]);
            int e = Integer.parseInt(se[1]);

            dist = new int[n + 1]; // 최소 비용을 저장할 배열
            Arrays.fill(dist, Integer.MAX_VALUE);
            
            System.out.println(dijkstra(s, e));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int dijkstra(int s, int e) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));
        pq.add(new Node(s, 0));
        dist[s] = 0;
        boolean[] ch = new boolean[n + 1];

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if(!ch[cur.idx]) {
                ch[cur.idx] = true;
                for (Node next : graph.get(cur.idx)) {
                    if (!ch[next.idx] && dist[next.idx] > cur.cost + next.cost) {
                        dist[next.idx] = cur.cost + next.cost;
                        pq.offer(new Node(next.idx, dist[next.idx]));
                    }
                }
            }
        }
        return dist[e];
    }
}