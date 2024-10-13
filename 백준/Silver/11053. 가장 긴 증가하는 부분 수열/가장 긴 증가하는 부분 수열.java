import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11053
// 400 - 다이나믹 프로그래밍1 -> 가장 긴 증가하는 부분 수열
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;  //모든 dp값들은 최소 1
        }

        int ans = 1;
        // O(n)
        for (int i = 1; i <= n; i++) {
            // O(n)
            for (int j = 1; j < i; j++) {
                // 현재 값보다 작거나 같은 이전 원소들 중 가장 큰 dp값 + 1
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            ans = Math.max(ans, dp[i]);
        }
        System.out.print(ans);
    }
}