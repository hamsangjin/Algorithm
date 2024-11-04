import java.io.*;
import java.util.*;

public class Main{
    static int N, ans = Integer.MAX_VALUE;
    static int[][] graph;
    public static void main(String[] args) throws IOException{
        // 1 ~ N까지 번호가 매겨져있는 도시가 있으며, 
        // 도시 사이에 길이 있을 수 있고 없을 수 있음
        
        // 한 외판원이 어느 한 도시에서 출발해 N개의 도시를 거쳐,
        // 다시 원래의 도시로 돌아오려고 함.
        // 이때 한 번 방문한 도시는 다시 갈 수 없음
        
        // A도시에서 B도시로 갈 수 있는 비용이 담긴 행렬이 주어짐
        // 비용이 0인 경우는 갈 수 없는 경우로 생각하면 됨.
        // 이때 가장 적은 비용을 들이는 순회 경로를 구해보자
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        
        graph = new int[N][N];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        boolean[] ch = new boolean[N];
        
        for(int i = 0; i < N; i++){
            ch[i] = true;
            dfs(i, i, ch, 1, 0);
            ch[i] = false;
        }
        System.out.println(ans);
        
    }
    // dfs 호출 방식
    // i번째 도시를 기준, 확인 배열, 방문한 도시 횟수, 이전 도시
    // 방문한 도시 횟수가 n이 되면 이전 도시에서 시작 도시로 이동할 수 있는지 확인 후,
    // 이동할 수 있다면 이동하는 비용까지 더해 최소값 계산
    public static void dfs(int sc, int pc, boolean[] ch, int cnt, int sum){
        if(cnt == N){
            if(graph[pc][sc] == 0)    return;
            ans = Math.min(ans, sum+graph[pc][sc]);
        } else{
            for(int i = 0; i < N; i++){
                if(ch[i] || graph[pc][i] == 0)    continue;
               
                ch[i] = true;
                dfs(sc, i, ch, cnt+1, sum+graph[pc][i]);
                ch[i] = false;
            }
        }
    }
}