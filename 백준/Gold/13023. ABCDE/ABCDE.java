import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/13023
public class Main {
    static int N, M;
    static List<Integer>[] graph;
    static boolean[] ch;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new List[N];
        for(int i = 0; i < N; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        ch = new boolean[N];

        for(int i = 0; i < N; i++){
            ch[i] = true;
            dfs(1, i);
            ch[i] = false;
        }

        System.out.println(0);
    }
    public static void dfs(int cnt, int node){
        if(cnt == 5){
            System.out.println(1);
            System.exit(0);
        }

        for(int v : graph[node]){
            if(ch[v]) continue;

            ch[v] = true;
            dfs(cnt+1, v);
            ch[v] = false;
        }
    }
}