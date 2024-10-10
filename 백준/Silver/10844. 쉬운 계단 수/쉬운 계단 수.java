import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10844
// 400 - 다이나믹 프로그래밍1 -> 쉬운 계단 수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][10];
        // n이 1일 때의 계단 수 설정
        for (int i = 0; i <= 9; i++)    dp[1][i] = 1;

        // 0으로 시작하는 경우의 수도 구해야 1의 경우의 수를 구할 때 사용할 수 있음
        /*
         01
         10, 12,
         21, 23,
         32, 34,
         43, 45,
         54, 56,
         65, 67,
         76, 78,
         87, 89,
         98
        */

        /*
        010 012                 -> 1의 2자리 수를 붙인거임
        101, 121, 123,          -> 0과 2의 2자리 수를 붙인거임
        210, 212, 232, 234,     -> 1과 3의 2자리 수를 붙인거임
        321, 323, 343, 345,
        432, 434, 454, 456,
        543, 545, 565, 567,     ...
        654, 656, 676, 678,
        765, 767, 787, 789,
        876, 878, 898,
        987, 989.               -> 8의 2자리 수를 붙인거임
        */

        int modVal = 1000000000;
        // O(n)
        for(int i = 2; i <= n; i++){
            // O(1)
            for(int j = 0; j <= 9; j++){
                if(j == 0)          dp[i][j] = dp[i-1][1] % modVal;
                else if(j == 9)     dp[i][j] = dp[i-1][8] % modVal;
                else                dp[i][j] = ((dp[i-1][j-1] % modVal) + (dp[i-1][j+1] % modVal)) % modVal;
            }
        }

        // 0의 경우의 수는 제외하고, 1~9까지만 더해야함
        // O(1)
        int sum = 0;
        for(int i = 1; i <= 9; i++)     sum = (sum + dp[n][i]) % modVal;
        
        System.out.println(sum);
    }
}