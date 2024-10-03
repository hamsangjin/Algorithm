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
            if(n % 6 == 0)          dp[n] = Math.min(dp(n-1), Math.min(dp(n/3), dp(n/2))) + 1;
            else if(n % 3 == 0)     dp[n] = Math.min(dp(n/3), dp(n-1)) + 1;
            else if(n % 2 == 0)     dp[n] = Math.min(dp(n/2), dp(n-1)) + 1;
            else                    dp[n] = dp(n-1) + 1;
        }
        return dp[n];
    }
}

/*
n = 10인 경우 시나리오(스택처럼 재귀호출이 쌓이는 걸로 생각해야함)
- dp[9]와 dp[5] 호출
    - dp[9]는 dp[8]과 dp[3]호출
        - dp[8]은 dp[7]과 dp[4] 호출
            - dp[7]은 dp[6]호출
                - dp[6]은 dp[5], dp[2], dp[3] 호출
                    - dp[5]는 dp[4] 호출
                        - dp[4]는 dp[3]과 dp[2] 호출
                            - dp[3]은 dp[2]와 dp[1]호출
                                - dp[2]는 dp[1]과 dp[1]호출
                                > 둘다 0리턴하므로 +1이여서 = 1
                            > 1과 0 리턴 +1 = 1
                        > 1, 1 +1 -> 2
                    > 2 + 1 -> 3
                > 3, 1, 1 + 1 -> 2
            > 2 + 1 -> 3
        > 3, 2 + 1 -> 3
    > 3, 1 + 1 -> 2

    - dp[5]는 3 리턴

> 2, 3 + 1 -> 3

dp = [0, 0, 1, 1, 2, 3, 2, 3, 3, 2]
*/