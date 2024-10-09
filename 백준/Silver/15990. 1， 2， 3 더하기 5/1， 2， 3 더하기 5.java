import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15990
// 400 - 다이나믹 프로그래밍1 -> 1, 2, 3 더하기 5
// 시간 복잡도: O(T * n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] dp = new long[100001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;       // 3을 만들 수 있는 1로 끝나는 수식의 개수
        dp[3][2] = 1;       // 3을 만들 수 있는 2로 끝나는 수식의 개수
        dp[3][3] = 1;       // 3을 만들 수 있는 3으로 끝나는 수식의 개수
        for(int i = 4; i <= 100000; i++){
            // i가 1로 끝나는 경우 i-1값에서 +1한 걸로 생각하면 되고,
            // 그 전값이 2나 3이여야한다.
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;

            // i가 2로 끝나는 경우 i-2값에서 +2한 걸로 생각하면 되고,
            // 그 전값이 1나 3이여야한다.
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;

            // i가 3로 끝나는 경우 i-3값에서 +3한 걸로 생각하면 되고,
            // 그 전값이 1나 2이여야한다.
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
        }

        // 입력
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int n = Integer.parseInt(br.readLine());
            // 1, 2, 3으로 끝나는 모든 경우의 수 더해주기
            System.out.println((dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009);
        }
    }
}