import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1309
// 401 - 다이나믹 프로그래밍1(연습) -> 동물원
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.println(3);
            return;
        }
        
        long[] dp = new long[n + 1];

        dp[1] = 3;
        dp[2] = 7;
        for(int i = 3; i <= n; i++)     dp[i] = (dp[i-1]*2 + dp[i-2]) % 9901;
        System.out.println(dp[n]);

    }
}