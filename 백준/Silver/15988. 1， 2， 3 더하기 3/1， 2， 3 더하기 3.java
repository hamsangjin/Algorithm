import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15988
// 401 - 다이나믹 프로그래밍1(연습) -> 1, 2, 3 더하기 3
// 시간 복잡도: O(T * n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        // dp[4] = 1+1+1+1, 1+1+2, 1+2+1, 1+3, 2+1+1, 2+2, 3+1
        // 즉 dp[i - 1] + dp[i - 2] + dp[i - 3]
        for (int i = 4; i < 1000001; i++)       dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;

        // 입력
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++)              System.out.println(dp[Integer.parseInt(br.readLine())]);
    }
}