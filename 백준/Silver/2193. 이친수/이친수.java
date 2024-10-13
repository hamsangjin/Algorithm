import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2193
// 400 - 다이나믹 프로그래밍1 -> 이친수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long [] dp = new long[n+1];
        // n이 1인 경우: 1
        // n이 2인 경우: 10
        // n이 3인 경우: 100, 101

        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++)       dp[i] = dp[i-1]+dp[i-2];
        System.out.println(dp[n]);
    }
}