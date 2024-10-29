import java.io.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/10974
// 520 - 브루트포스 - 순열 -> 모든 순열
// 최대 N개의 선택이 이루어지며, 깊이 M까지 진행되므로, 총 경우의 수는 N * N * ... * N (M번)
// 최악의 경우: N=8, M=8일 경우 O(8^8) = 16,777,216
// 시간 복잡도: O(n^m)
public class Main {
    static int n;
    static boolean[] ch;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ch = new boolean[n+1];
        arr = new int[n];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(depth == n){
            for(int i = 0; i < n; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            for(int i = 1; i <= n; i++) {
                if(ch[i]) continue;

                ch[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                ch[i] = false;
            }
        }
    }
}