import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11726
// 400 - 다이나믹 프로그래밍1 -> 2xn 타일링
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4; i <= n; i++)     dp[i] = (dp[i-1] + dp[i-2]) % 10007;

        System.out.println(dp[n]);
    }
}