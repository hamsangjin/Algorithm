import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2225
// 400 - 다이나믹 프로그래밍1 -> 합분해
// 시간 복잡도: O(n * k)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        /*
            n이 0인 경우
            - k = 1: 0
            - k = 2: 0+0
            - k = 3: 0+0+0

            n이 1인 경우
            - k = 1: 1
            - k = 2: 1+0, 0+1
            - k = 3: 0+0+1, 0+1+0, 1+0+0

            n이 2인 경우
            - k = 1: 2
            - k = 2: 1+1, 2+0, 0+2
            - k = 3: 0+1+1, 1+0+1, 1+1+0, 2+0+0, 0+2+0, 0+0+2

            n이 3인 경우
            - k = 1: 3
            - k = 2: 1+2, 2+1, 0+3, 3+0
            - k = 3: 1+1+1, 0+1+2, 0+2+1, 1+0+2, 1+2+0, 2+0+1, 2+1+2, 0+3+0, 0+0+3, 3+0+0

           n/k	0	1	2	3
            0	0	1	1	1
            1	0	1	2	3
            2	0	1	3	6
            3	0	1	4	10

            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        */

        long dp[][] = new long[n + 1][k + 1];
        for(int i = 0; i <= n; i++)     dp[i][1] = 1;       // 정수 1개를 더해서 i를 만드는 경우의 수
        for(int i = 1; i <= k; i++)     dp[0][i] = 1;       // 정수 0을 i개 사용해서 0을 만드는 경우의 수
        /*
        아래 표를 완성하는 거
           n/k	0	1	2	3
            0	0	1	1	1
            1	0
            2	0
            3	0
        */

        int mod = 1000000000;
        // O(n)
        for(int i = 1; i <= n; i++) {
            // O(k)
            for(int j = 2; j <= k; j++)     dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;     // 점화식 적용
        }
        System.out.println(dp[n][k] % mod);
    }
}