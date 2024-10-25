import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15652
// 400 - 다이나믹 프로그래밍1 -> N과 M(4)
// 각 재귀 호출에서 최대 N번 반복하며 M번의 깊이를 갖기 때문에 시간 복잡도는 O(n^m)
// )가 됩니다.
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
        dfs(0, 1);
        System.out.println(sb);
    }

    public static void dfs(int depth, int pre){
        if(depth == m){
            for(int i = 0; i < m; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            for(int i = pre; i <= n; i++) {
                arr[depth] = i;
                dfs(depth+1, i);
            }
        }
    }
}