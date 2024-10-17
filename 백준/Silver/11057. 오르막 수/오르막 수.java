import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11057
// 401 - 다이나믹 프로그래밍1(연습) -> 오르막 수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int MOD = 10007;

        // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // [1, 3, 6, 10, 15, 21, 28, 36, 45, 55]
        // [1, 4, 10, 20, 35, 56, 84, 120, 165, 220]

        int[][] dp = new int[n + 1][10];
        // O(1)
        for (int i = 0; i <= 9; i++) dp[1][i] = 1;

        // O(n)
        for (int i = 2; i <= n; i++) {
            // O(1)
            for (int j = 0; j <= 9; j++) {
                // O(1)
                for (int k = 0; k <= j; k++)        dp[i][j] = (dp[i][j] + dp[i-1][k]) % MOD;
            }
        }

        int res = 0;
        // O(1)
        for (int i = 0; i <= 9; i++)    res += dp[n][i];
        System.out.println(res % 10007);
    }
}