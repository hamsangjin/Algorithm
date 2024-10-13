import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1699
// 400 - 다이나믹 프로그래밍1 -> 제곱수의 합
// 시간 복잡도: O(n√n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        // O(n)
        for (int i = 1; i <= n; i++) {
            dp[i] = i;      // 1로만 표현해야하는 경우
            // O(√n)
            for (int j = 1; j * j <= i; j++) {
                // 어떤 값의 제곱수인 경우 dp[0] + 1 하는거
                int val = dp[i - j * j] + 1;
                if (dp[i] > val)        dp[i] = val;
            }
        }
        System.out.println(dp[n]);
    }
}