import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15651
// 400 - 다이나믹 프로그래밍1 -> N과 M(3)
// 시간 복잡도: O(n^m)
public class Main {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(depth == m){
            for(int i = 0; i < m; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            for(int i = 1; i <= n; i++) {
                arr[depth] = i;
                dfs(depth+1);
            }
        }
    }
}