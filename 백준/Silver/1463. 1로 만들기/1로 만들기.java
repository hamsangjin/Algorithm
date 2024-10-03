import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1463
// 400 - 다이나믹 프로그래밍1 -> 1로 만들기
// 시간 복잡도: O(n)
public class Main {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;
        System.out.println(dp(n));
    }

    // O(n)
    private static int dp(int n) {
        if(dp[n] == null){
            // 여기서 dp(n-1)을 먼저 하면 불필요한 연산이 생기므로 나누기 연산 먼저
            if(n % 6 == 0)          dp[n] = Math.min(dp(n/3), Math.min(dp(n/2), dp(n-1))) + 1;
            else if(n % 3 == 0)     dp[n] = Math.min(dp(n/3), dp(n-1)) + 1;
            else if(n % 2 == 0)     dp[n] = Math.min(dp(n/2), dp(n-1)) + 1;
            else                    dp[n] = dp(n-1) + 1;
        }
        return dp[n];
    }
}

/*
n = 10인 경우 시나리오(스택처럼 재귀호출이 쌓이는 걸로 생각해야함)
- dp[5]와 dp[9] 호출
    - dp[5]는 dp[4] 호출
        - dp[4]는 dp[2], dp[3] 호출
            - dp[2]는 dp[1]과 dp[1] 호출
            > Min(0, 0) + 1 = 1
            - dp[3]은 dp[1]과 dp[2] 호출
            > Min(0, 1) + 1 = 1
        > Min(1, 1) + 1 = 2
    > 2 + 1 = 3
    - dp[9]는 dp[3], dp[8] 호출
        - dp[3]은 이미 저장됨
        > 1
        - dp[8]은 dp[4]와 dp[7] 호출
            - dp[4]는 이미 저장됨
            > 2
            - dp[7]은 dp[6] 호출
                - dp[6]은 dp[5], dp[2], dp[3] 호출
                > 이미 모든 값이 저장되어 있으므로 Min(3, 1, 1) + 1 = 2
            > 2 + 1 = 3
        > Min(2, 3) + 1 = 3
    > Min(1, 3) + 1 = 2
> Min(3, 2) + 1 = 3

      0  1  2  3  4  5  6  7  8  9  10
dp = [0, 0, 1, 1, 2, 3, 2, 3, 3, 2, 3]
*/