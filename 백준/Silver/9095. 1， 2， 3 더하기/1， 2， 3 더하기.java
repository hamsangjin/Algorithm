import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/9095
// 400 - 다이나믹 프로그래밍1 -> 1, 2, 3 더하기
// 시간 복잡도: O(T * n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[11];
        dp[0] = 0;  
        dp[1] = 1;  
        dp[2] = 2;
        dp[3] = 4;  
        for(int i = 4; i < 11; i++)     dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]);
        
        // 입력
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++)      System.out.println(dp[Integer.parseInt(br.readLine())]);
    }
}